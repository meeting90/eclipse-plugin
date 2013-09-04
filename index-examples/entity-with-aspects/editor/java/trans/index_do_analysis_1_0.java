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

@SuppressWarnings("all") public class index_do_analysis_1_0 extends Strategy 
{ 
  public static index_do_analysis_1_0 instance = new index_do_analysis_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy e_11971)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("index_do_analysis_1_0");
    Fail4942:
    { 
      IStrategoTerm v_11970 = null;
      IStrategoTerm w_11970 = null;
      IStrategoTerm x_11970 = null;
      IStrategoTerm y_11970 = null;
      IStrategoTerm z_11970 = null;
      IStrategoTerm a_11971 = null;
      IStrategoTerm f_11971 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 3)
        break Fail4942;
      v_11970 = term.getSubterm(0);
      f_11971 = term;
      IStrategoTerm term2825 = term;
      Success2798:
      { 
        Fail4943:
        { 
          term = e_11971.invoke(context, term);
          if(term == null)
            break Fail4943;
          if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 5)
            break Fail4943;
          w_11970 = term.getSubterm(0);
          x_11970 = term.getSubterm(1);
          y_11970 = term.getSubterm(2);
          z_11970 = term.getSubterm(3);
          a_11971 = term.getSubterm(4);
          IStrategoTerm term2826 = term;
          Success2799:
          { 
            Fail4944:
            { 
              IStrategoTerm b_11971 = null;
              b_11971 = term;
              term = a_11971;
              if(term.getTermType() != IStrategoTerm.LIST || !((IStrategoList)term).isEmpty())
                break Fail4944;
              term = b_11971;
              { 
                term = complete_work_unit_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail4943;
                if(true)
                  break Success2799;
              }
            }
            term = term2826;
          }
          if(true)
            break Success2798;
        }
        term = term2825;
        IStrategoTerm c_11971 = null;
        IStrategoTerm d_11971 = null;
        IStrategoTerm j_11971 = null;
        c_11971 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail4942;
        d_11971 = term;
        j_11971 = c_11971;
        term = report_with_failure_0_2.instance.invoke(context, j_11971, trans.const947, d_11971);
        if(term == null)
          break Fail4942;
      }
      term = f_11971;
      if(w_11970 == null || (x_11970 == null || (y_11970 == null || (z_11970 == null || a_11971 == null))))
        break Fail4942;
      term = termFactory.makeAppl(Main._consParallelResults_6, new IStrategoTerm[]{v_11970, w_11970, x_11970, y_11970, z_11970, a_11971});
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}