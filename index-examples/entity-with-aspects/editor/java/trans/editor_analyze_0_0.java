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

@SuppressWarnings("all") public class editor_analyze_0_0 extends Strategy 
{ 
  public static editor_analyze_0_0 instance = new editor_analyze_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("editor_analyze_0_0");
    Fail2365:
    { 
      IStrategoTerm term1429 = term;
      Success1381:
      { 
        Fail2366:
        { 
          IStrategoTerm f_2156 = null;
          IStrategoTerm g_2156 = null;
          IStrategoTerm h_2156 = null;
          IStrategoTerm i_2156 = null;
          IStrategoTerm j_2156 = null;
          IStrategoTerm k_2156 = null;
          TermReference l_2156 = new TermReference();
          IStrategoTerm m_2156 = null;
          IStrategoTerm p_2156 = null;
          if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 3)
            break Fail2366;
          f_2156 = term.getSubterm(0);
          if(l_2156.value == null)
            l_2156.value = term.getSubterm(1);
          else
            if(l_2156.value != term.getSubterm(1) && !l_2156.value.match(term.getSubterm(1)))
              break Fail2366;
          g_2156 = term.getSubterm(2);
          p_2156 = term;
          IStrategoTerm term1430 = term;
          Success1382:
          { 
            Fail2367:
            { 
              term = editor_init_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail2367;
              if(l_2156.value == null)
                break Fail2367;
              term = termFactory.makeTuple(f_2156, l_2156.value, g_2156);
              term = analyze_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail2367;
              if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 5)
                break Fail2367;
              h_2156 = term.getSubterm(0);
              i_2156 = term.getSubterm(1);
              j_2156 = term.getSubterm(2);
              k_2156 = term.getSubterm(3);
              m_2156 = term.getSubterm(4);
              term = m_2156;
              lifted547 lifted5470 = new lifted547();
              lifted5470.l_2156 = l_2156;
              term = remove_all_1_0.instance.invoke(context, term, lifted5470);
              if(term == null)
                break Fail2367;
              term = try_1_0.instance.invoke(context, term, editor_queue_analysis_0_0.instance);
              if(term == null)
                break Fail2367;
              if(true)
                break Success1382;
            }
            term = term1430;
            IStrategoTerm n_2156 = null;
            IStrategoTerm o_2156 = null;
            IStrategoTerm r_2156 = null;
            n_2156 = term;
            term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
            if(term == null)
              break Fail2366;
            o_2156 = term;
            r_2156 = n_2156;
            term = report_with_failure_0_2.instance.invoke(context, r_2156, trans.const493, o_2156);
            if(term == null)
              break Fail2366;
          }
          term = p_2156;
          if(h_2156 == null || (i_2156 == null || (j_2156 == null || k_2156 == null)))
            break Fail2366;
          term = termFactory.makeTuple(h_2156, i_2156, j_2156, k_2156);
          if(true)
            break Success1381;
        }
        term = term1429;
        IStrategoTerm p_2155 = null;
        p_2155 = term;
        IStrategoTerm term1431 = term;
        Success1383:
        { 
          Fail2368:
          { 
            term = is_tuple_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail2368;
            { 
              if(true)
                break Fail2365;
              if(true)
                break Success1383;
            }
          }
          term = term1431;
        }
        term = p_2155;
        IStrategoTerm term1432 = term;
        Success1384:
        { 
          Fail2369:
          { 
            IStrategoTerm r_2155 = null;
            IStrategoTerm s_2155 = null;
            IStrategoTerm u_2155 = null;
            IStrategoTerm v_2155 = null;
            IStrategoTerm x_2155 = null;
            IStrategoTerm a_2156 = null;
            u_2155 = term;
            v_2155 = trans.const478;
            r_2155 = v_2155;
            term = u_2155;
            x_2155 = u_2155;
            term = project_path_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail2369;
            term = (IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)trans.constNil1);
            s_2155 = term;
            a_2156 = x_2155;
            term = index_setup_0_3.instance.invoke(context, a_2156, r_2155, s_2155, trans.const369);
            if(term == null)
              break Fail2369;
            term = editor_queue_analysis_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail2369;
            if(true)
              break Success1384;
          }
          term = term1432;
          IStrategoTerm n_2155 = null;
          IStrategoTerm o_2155 = null;
          IStrategoTerm c_2156 = null;
          n_2155 = term;
          term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
          if(term == null)
            break Fail2365;
          o_2155 = term;
          c_2156 = n_2155;
          term = report_with_failure_0_2.instance.invoke(context, c_2156, trans.const493, o_2155);
          if(term == null)
            break Fail2365;
        }
        term = trans.constNone0;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}