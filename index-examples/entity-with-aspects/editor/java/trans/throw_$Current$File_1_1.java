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

@SuppressWarnings("all") public class throw_$Current$File_1_1 extends Strategy 
{ 
  public static throw_$Current$File_1_1 instance = new throw_$Current$File_1_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy r_2187, IStrategoTerm q_2187)
  { 
    context.push("throw_CurrentFile_1_1");
    Fail2609:
    { 
      IStrategoTerm t_2187 = null;
      t_2187 = term;
      term = dr_throw_1_2.instance.invoke(context, t_2187, r_2187, q_2187, trans.const479);
      if(term == null)
        break Fail2609;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}