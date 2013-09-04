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

@SuppressWarnings("all") public class index_setup_0_2 extends Strategy 
{ 
  public static index_setup_0_2 instance = new index_setup_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm s_11996, IStrategoTerm t_11996)
  { 
    context.push("index_setup_0_2");
    Fail5112:
    { 
      IStrategoTerm v_11996 = null;
      term = obsolete_1_0.instance.invoke(context, term, lifted1107.instance);
      if(term == null)
        break Fail5112;
      v_11996 = term;
      term = index_setup_0_3.instance.invoke(context, v_11996, s_11996, t_11996, trans.const889);
      if(term == null)
        break Fail5112;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}