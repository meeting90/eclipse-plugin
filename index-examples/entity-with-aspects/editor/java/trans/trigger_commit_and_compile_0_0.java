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

@SuppressWarnings("all") public class trigger_commit_and_compile_0_0 extends Strategy 
{ 
  public static trigger_commit_and_compile_0_0 instance = new trigger_commit_and_compile_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("trigger_commit_and_compile_0_0");
    Fail4860:
    { 
      IStrategoTerm z_11952 = null;
      z_11952 = term;
      IStrategoTerm term2767 = term;
      Success2745:
      { 
        Fail4861:
        { 
          IStrategoTerm term2768 = term;
          Success2746:
          { 
            Fail4862:
            { 
              IStrategoTerm w_11952 = null;
              w_11952 = term;
              IStrategoTerm term2769 = term;
              Success2747:
              { 
                Fail4863:
                { 
                  IStrategoTerm b_11953 = null;
                  b_11953 = term;
                  term = index_is_global_enabled_0_1.instance.invoke(context, b_11953, trans.const926);
                  if(term == null)
                    break Fail4863;
                  { 
                    if(true)
                      break Fail4862;
                    if(true)
                      break Success2747;
                  }
                }
                term = term2769;
              }
              term = w_11952;
              { 
                term = commit_and_compile_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail4861;
                if(true)
                  break Success2746;
              }
            }
            term = term2768;
            IStrategoTerm d_11953 = null;
            d_11953 = term;
            term = index_enable_global_0_1.instance.invoke(context, d_11953, trans.const927);
            if(term == null)
              break Fail4861;
          }
          if(true)
            break Success2745;
        }
        term = term2767;
        IStrategoTerm x_11952 = null;
        IStrategoTerm y_11952 = null;
        IStrategoTerm f_11953 = null;
        x_11952 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail4860;
        y_11952 = term;
        f_11953 = x_11952;
        term = report_with_failure_0_2.instance.invoke(context, f_11953, trans.const928, y_11952);
        if(term == null)
          break Fail4860;
      }
      term = z_11952;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}