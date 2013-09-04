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

@SuppressWarnings("all") public class index_transform_qualifier_0_1 extends Strategy 
{ 
  public static index_transform_qualifier_0_1 instance = new index_transform_qualifier_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm o_11972)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("index_transform_qualifier_0_1");
    Fail4952:
    { 
      IStrategoTerm p_11972 = null;
      IStrategoTerm q_11972 = null;
      IStrategoTerm r_11972 = null;
      IStrategoTerm u_11972 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail4952;
      q_11972 = term.getSubterm(0);
      p_11972 = term.getSubterm(1);
      u_11972 = term;
      IStrategoTerm term2832 = term;
      Success2805:
      { 
        Fail4953:
        { 
          term = index_create_qualifier_0_1.instance.invoke(context, q_11972, o_11972);
          if(term == null)
            break Fail4953;
          r_11972 = term;
          if(true)
            break Success2805;
        }
        term = term2832;
        IStrategoTerm s_11972 = null;
        IStrategoTerm t_11972 = null;
        IStrategoTerm w_11972 = null;
        s_11972 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail4952;
        t_11972 = term;
        w_11972 = s_11972;
        term = report_with_failure_0_2.instance.invoke(context, w_11972, trans.const951, t_11972);
        if(term == null)
          break Fail4952;
      }
      term = u_11972;
      if(r_11972 == null)
        break Fail4952;
      term = termFactory.makeTuple(r_11972, p_11972);
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}