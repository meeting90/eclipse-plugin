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

@SuppressWarnings("all") public class index_get_all_0_0 extends Strategy 
{ 
  public static index_get_all_0_0 instance = new index_get_all_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("index_get_all_0_0");
    Fail5076:
    { 
      IStrategoTerm d_11990 = null;
      IStrategoTerm e_11990 = null;
      IStrategoTerm f_11990 = null;
      d_11990 = term;
      IStrategoTerm term2900 = term;
      Success2868:
      { 
        Fail5077:
        { 
          IStrategoTerm term2901 = term;
          Success2869:
          { 
            Fail5078:
            { 
              IStrategoTerm g_11990 = null;
              g_11990 = term;
              term = $Index_$Read$Set_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail5078;
              e_11990 = term;
              term = g_11990;
              { 
                IStrategoTerm p_11990 = null;
                term = index_uri_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail5077;
                f_11990 = term;
                p_11990 = e_11990;
                term = termFactory.makeAppl(Main._consRead_1, new IStrategoTerm[]{f_11990});
                term = iset_add_0_1.instance.invoke(context, p_11990, term);
                if(term == null)
                  break Fail5077;
                if(true)
                  break Success2869;
              }
            }
            term = term2901;
          }
          if(true)
            break Success2868;
        }
        term = term2900;
        IStrategoTerm h_11990 = null;
        IStrategoTerm i_11990 = null;
        IStrategoTerm r_11990 = null;
        h_11990 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail5076;
        i_11990 = term;
        r_11990 = h_11990;
        term = report_with_failure_0_2.instance.invoke(context, r_11990, trans.const973, i_11990);
        if(term == null)
          break Fail5076;
      }
      term = indexlib_get_all_0_0.instance.invoke(context, d_11990);
      if(term == null)
        break Fail5076;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}