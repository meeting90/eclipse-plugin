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
    Fail2174:
    { 
      IStrategoTerm i_2127 = null;
      IStrategoTerm j_2127 = null;
      IStrategoTerm k_2127 = null;
      i_2127 = term;
      IStrategoTerm term1344 = term;
      Success1312:
      { 
        Fail2175:
        { 
          IStrategoTerm term1345 = term;
          Success1313:
          { 
            Fail2176:
            { 
              IStrategoTerm l_2127 = null;
              l_2127 = term;
              term = $Index_$Read$Set_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail2176;
              j_2127 = term;
              term = l_2127;
              { 
                IStrategoTerm u_2127 = null;
                term = index_uri_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail2175;
                k_2127 = term;
                u_2127 = j_2127;
                term = termFactory.makeAppl(Main._consRead_1, new IStrategoTerm[]{k_2127});
                term = iset_add_0_1.instance.invoke(context, u_2127, term);
                if(term == null)
                  break Fail2175;
                if(true)
                  break Success1313;
              }
            }
            term = term1345;
          }
          if(true)
            break Success1312;
        }
        term = term1344;
        IStrategoTerm m_2127 = null;
        IStrategoTerm n_2127 = null;
        IStrategoTerm w_2127 = null;
        m_2127 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail2174;
        n_2127 = term;
        w_2127 = m_2127;
        term = report_with_failure_0_2.instance.invoke(context, w_2127, trans.const453, n_2127);
        if(term == null)
          break Fail2174;
      }
      term = indexlib_get_all_0_0.instance.invoke(context, i_2127);
      if(term == null)
        break Fail2174;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}