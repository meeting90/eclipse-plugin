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
    Fail5267:
    { 
      IStrategoTerm term2985 = term;
      Success2937:
      { 
        Fail5268:
        { 
          IStrategoTerm a_12019 = null;
          IStrategoTerm b_12019 = null;
          IStrategoTerm c_12019 = null;
          IStrategoTerm d_12019 = null;
          IStrategoTerm e_12019 = null;
          IStrategoTerm f_12019 = null;
          TermReference g_12019 = new TermReference();
          IStrategoTerm h_12019 = null;
          IStrategoTerm k_12019 = null;
          if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 3)
            break Fail5268;
          a_12019 = term.getSubterm(0);
          if(g_12019.value == null)
            g_12019.value = term.getSubterm(1);
          else
            if(g_12019.value != term.getSubterm(1) && !g_12019.value.match(term.getSubterm(1)))
              break Fail5268;
          b_12019 = term.getSubterm(2);
          k_12019 = term;
          IStrategoTerm term2986 = term;
          Success2938:
          { 
            Fail5269:
            { 
              term = editor_init_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail5269;
              if(g_12019.value == null)
                break Fail5269;
              term = termFactory.makeTuple(a_12019, g_12019.value, b_12019);
              term = analyze_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail5269;
              if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 5)
                break Fail5269;
              c_12019 = term.getSubterm(0);
              d_12019 = term.getSubterm(1);
              e_12019 = term.getSubterm(2);
              f_12019 = term.getSubterm(3);
              h_12019 = term.getSubterm(4);
              term = h_12019;
              lifted1147 lifted11470 = new lifted1147();
              lifted11470.g_12019 = g_12019;
              term = remove_all_1_0.instance.invoke(context, term, lifted11470);
              if(term == null)
                break Fail5269;
              term = try_1_0.instance.invoke(context, term, editor_queue_analysis_0_0.instance);
              if(term == null)
                break Fail5269;
              if(true)
                break Success2938;
            }
            term = term2986;
            IStrategoTerm i_12019 = null;
            IStrategoTerm j_12019 = null;
            IStrategoTerm m_12019 = null;
            i_12019 = term;
            term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
            if(term == null)
              break Fail5268;
            j_12019 = term;
            m_12019 = i_12019;
            term = report_with_failure_0_2.instance.invoke(context, m_12019, trans.const1013, j_12019);
            if(term == null)
              break Fail5268;
          }
          term = k_12019;
          if(c_12019 == null || (d_12019 == null || (e_12019 == null || f_12019 == null)))
            break Fail5268;
          term = termFactory.makeTuple(c_12019, d_12019, e_12019, f_12019);
          if(true)
            break Success2937;
        }
        term = term2985;
        IStrategoTerm k_12018 = null;
        k_12018 = term;
        IStrategoTerm term2987 = term;
        Success2939:
        { 
          Fail5270:
          { 
            term = is_tuple_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail5270;
            { 
              if(true)
                break Fail5267;
              if(true)
                break Success2939;
            }
          }
          term = term2987;
        }
        term = k_12018;
        IStrategoTerm term2988 = term;
        Success2940:
        { 
          Fail5271:
          { 
            IStrategoTerm m_12018 = null;
            IStrategoTerm n_12018 = null;
            IStrategoTerm p_12018 = null;
            IStrategoTerm q_12018 = null;
            IStrategoTerm s_12018 = null;
            IStrategoTerm v_12018 = null;
            p_12018 = term;
            q_12018 = trans.const998;
            m_12018 = q_12018;
            term = p_12018;
            s_12018 = p_12018;
            term = project_path_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail5271;
            term = (IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)trans.constNil3);
            n_12018 = term;
            v_12018 = s_12018;
            term = index_setup_0_3.instance.invoke(context, v_12018, m_12018, n_12018, trans.const889);
            if(term == null)
              break Fail5271;
            term = editor_queue_analysis_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail5271;
            if(true)
              break Success2940;
          }
          term = term2988;
          IStrategoTerm i_12018 = null;
          IStrategoTerm j_12018 = null;
          IStrategoTerm x_12018 = null;
          i_12018 = term;
          term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
          if(term == null)
            break Fail5267;
          j_12018 = term;
          x_12018 = i_12018;
          term = report_with_failure_0_2.instance.invoke(context, x_12018, trans.const1013, j_12018);
          if(term == null)
            break Fail5267;
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