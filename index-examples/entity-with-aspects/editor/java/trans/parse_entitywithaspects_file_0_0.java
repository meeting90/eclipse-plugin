package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.parallel.stratego_parallel.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.java_front.*;
import entitywithaspects.strategies.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class parse_entitywithaspects_file_0_0 extends Strategy 
{ 
  public static parse_entitywithaspects_file_0_0 instance = new parse_entitywithaspects_file_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("parse_entitywithaspects_file_0_0");
    Fail2288:
    { 
      IStrategoTerm c_2144 = null;
      IStrategoTerm d_2144 = null;
      c_2144 = term;
      d_2144 = trans.constEntityWithAspectsTbl;
      term = parse_file_2_1.instance.invoke(context, c_2144, strsglr_perror_0_0.instance, strsglr_report_parse_error_0_0.instance, d_2144);
      if(term == null)
        break Fail2288;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}