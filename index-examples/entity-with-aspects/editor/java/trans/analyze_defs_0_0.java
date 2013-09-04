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

@SuppressWarnings("all") public class analyze_defs_0_0 extends Strategy 
{ 
  public static analyze_defs_0_0 instance = new analyze_defs_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("analyze_defs_0_0");
    Fail4902:
    { 
      IStrategoTerm n_11962 = null;
      IStrategoTerm o_11962 = null;
      IStrategoTerm s_11962 = null;
      IStrategoTerm v_11962 = null;
      IStrategoTerm w_11962 = null;
      IStrategoTerm y_11962 = null;
      IStrategoTerm z_11962 = null;
      IStrategoTerm a_11963 = null;
      n_11962 = term;
      term = new_iset_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail4902;
      o_11962 = term;
      y_11962 = n_11962;
      v_11962 = trans.constNil3;
      z_11962 = y_11962;
      w_11962 = trans.constAnon0;
      a_11963 = z_11962;
      term = analyze_defs_0_4.instance.invoke(context, a_11963, v_11962, o_11962, w_11962, trans.constAnon0);
      if(term == null)
        break Fail4902;
      s_11962 = term;
      term = iset_elements_0_0.instance.invoke(context, o_11962);
      if(term == null)
        break Fail4902;
      term = termFactory.makeTuple(s_11962, term);
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}