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

@SuppressWarnings("all") public class analyze_get_compilediffs_0_0 extends Strategy 
{ 
  public static analyze_get_compilediffs_0_0 instance = new analyze_get_compilediffs_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("analyze_get_compilediffs_0_0");
    Fail4962:
    { 
      IStrategoTerm m_11974 = null;
      IStrategoTerm o_11974 = null;
      m_11974 = term;
      term = index_get_all_globals_0_1.instance.invoke(context, m_11974, trans.const955);
      if(term == null)
        break Fail4962;
      o_11974 = term;
      term = index_clear_global_0_1.instance.invoke(context, o_11974, trans.const955);
      if(term == null)
        break Fail4962;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}