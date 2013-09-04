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

@SuppressWarnings("all") public class index_lookup_all_scoped_internal_4_3 extends Strategy 
{ 
  public static index_lookup_all_scoped_internal_4_3 instance = new index_lookup_all_scoped_internal_4_3();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy q_2113, Strategy r_2113, Strategy s_2113, Strategy t_2113, IStrategoTerm i_2113, IStrategoTerm j_2113, IStrategoTerm k_2113)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("index_lookup_all_scoped_internal_4_3");
    Fail2069:
    { 
      IStrategoTerm m_2113 = null;
      IStrategoTerm n_2113 = null;
      IStrategoTerm u_2113 = null;
      m_2113 = term;
      u_2113 = term;
      IStrategoTerm term1285 = term;
      Success1258:
      { 
        Fail2070:
        { 
          IStrategoTerm term1286 = term;
          Success1259:
          { 
            Fail2071:
            { 
              term = r_2113.invoke(context, term);
              if(term == null)
                break Fail2071;
              term = index_do_adjust_lookup_0_4.instance.invoke(context, m_2113, i_2113, j_2113, m_2113, k_2113);
              if(term == null)
                break Fail2071;
              term = index_get_adjust_lookup_results_3_2.instance.invoke(context, m_2113, q_2113, s_2113, t_2113, term, k_2113);
              if(term == null)
                break Fail2071;
              n_2113 = term;
              if(true)
                break Success1259;
            }
            term = term1286;
            IStrategoTerm term1287 = term;
            Success1260:
            { 
              Fail2072:
              { 
                term = q_2113.invoke(context, term);
                if(term == null)
                  break Fail2072;
                term = index_do_adjust_import_0_2.instance.invoke(context, m_2113, i_2113, j_2113);
                if(term == null)
                  break Fail2072;
                term = index_get_adjust_import_results_3_2.instance.invoke(context, m_2113, r_2113, s_2113, t_2113, term, k_2113);
                if(term == null)
                  break Fail2072;
                n_2113 = term;
                if(true)
                  break Success1260;
              }
              term = term1287;
              IStrategoList list62;
              list62 = checkListTail(j_2113);
              if(list62 == null)
                break Fail2070;
              term = (IStrategoTerm)termFactory.makeListCons(i_2113, list62);
              term = s_2113.invoke(context, term, t_2113, i_2113, k_2113);
              if(term == null)
                break Fail2070;
              n_2113 = term;
            }
          }
          if(true)
            break Success1258;
        }
        term = term1285;
        IStrategoTerm o_2113 = null;
        IStrategoTerm p_2113 = null;
        IStrategoTerm w_2113 = null;
        o_2113 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail2069;
        p_2113 = term;
        w_2113 = o_2113;
        term = report_with_failure_0_2.instance.invoke(context, w_2113, trans.const436, p_2113);
        if(term == null)
          break Fail2069;
      }
      term = u_2113;
      if(n_2113 == null)
        break Fail2069;
      term = n_2113;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}