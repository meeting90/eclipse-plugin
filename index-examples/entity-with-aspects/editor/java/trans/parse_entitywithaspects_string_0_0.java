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

@SuppressWarnings("all") public class parse_entitywithaspects_string_0_0 extends Strategy 
{ 
  public static parse_entitywithaspects_string_0_0 instance = new parse_entitywithaspects_string_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("parse_entitywithaspects_string_0_0");
    Fail5192:
    { 
      IStrategoTerm b_12007 = null;
      IStrategoTerm c_12007 = null;
      b_12007 = term;
      c_12007 = trans.constEntityWithAspectsTbl0;
      term = parse_string_1_1.instance.invoke(context, b_12007, strsglr_report_parse_error_0_0.instance, c_12007);
      if(term == null)
        break Fail5192;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}