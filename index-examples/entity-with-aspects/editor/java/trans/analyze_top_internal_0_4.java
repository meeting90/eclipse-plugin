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

@SuppressWarnings("all") public class analyze_top_internal_0_4 extends Strategy 
{ 
  public static analyze_top_internal_0_4 instance = new analyze_top_internal_0_4();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm n_11956, IStrategoTerm ref_o_11956, IStrategoTerm p_11956, IStrategoTerm ref_q_11956)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference o_11956 = new TermReference(ref_o_11956);
    TermReference q_11956 = new TermReference(ref_q_11956);
    context.push("analyze_top_internal_0_4");
    Fail4885:
    { 
      TermReference r_11956 = new TermReference();
      TermReference s_11956 = new TermReference();
      TermReference t_11956 = new TermReference();
      TermReference u_11956 = new TermReference();
      TermReference v_11956 = new TermReference();
      TermReference w_11956 = new TermReference();
      TermReference x_11956 = new TermReference();
      TermReference y_11956 = new TermReference();
      TermReference z_11956 = new TermReference();
      TermReference a_11957 = new TermReference();
      TermReference b_11957 = new TermReference();
      IStrategoTerm c_11957 = null;
      IStrategoTerm d_11957 = null;
      TermReference e_11957 = new TermReference();
      TermReference f_11957 = new TermReference();
      IStrategoTerm g_11957 = null;
      IStrategoTerm h_11957 = null;
      TermReference i_11957 = new TermReference();
      TermReference j_11957 = new TermReference();
      IStrategoTerm y_11957 = null;
      IStrategoTerm f_11958 = null;
      IStrategoTerm i_11958 = null;
      IStrategoTerm v_11958 = null;
      IStrategoTerm y_11958 = null;
      IStrategoTerm d_11959 = null;
      if(s_11956.value == null)
        s_11956.value = term;
      else
        if(s_11956.value != term && !s_11956.value.match(term))
          break Fail4885;
      y_11957 = term;
      IStrategoTerm term2784 = term;
      Success2762:
      { 
        Fail4886:
        { 
          IStrategoTerm a_11958 = null;
          a_11958 = term;
          term = (IStrategoTerm)termFactory.makeListCons(p_11956, (IStrategoList)trans.constNil3);
          term = index_setup_0_3.instance.invoke(context, a_11958, o_11956.value, term, q_11956.value);
          if(term == null)
            break Fail4886;
          term = index_start_transaction_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail4886;
          if(f_11957.value == null)
            f_11957.value = term;
          else
            if(f_11957.value != term && !f_11957.value.match(term))
              break Fail4886;
          if(true)
            break Success2762;
        }
        term = term2784;
        IStrategoTerm k_11957 = null;
        IStrategoTerm l_11957 = null;
        IStrategoTerm e_11958 = null;
        k_11957 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail4885;
        l_11957 = term;
        e_11958 = k_11957;
        term = report_with_failure_0_2.instance.invoke(context, e_11958, trans.const934, l_11957);
        if(term == null)
          break Fail4885;
      }
      term = y_11957;
      f_11958 = y_11957;
      IStrategoTerm term2785 = term;
      Success2763:
      { 
        Fail4887:
        { 
          if(q_11956.value == null)
            break Fail4887;
          term = index_get_all_in_file_0_0.instance.invoke(context, q_11956.value);
          if(term == null)
            break Fail4887;
          term = filter_1_0.instance.invoke(context, term, lifted995.instance);
          if(term == null)
            break Fail4887;
          c_11957 = term;
          if(q_11956.value == null)
            break Fail4887;
          term = index_clear_file_0_0.instance.invoke(context, q_11956.value);
          if(term == null)
            break Fail4887;
          if(true)
            break Success2763;
        }
        term = term2785;
        IStrategoTerm m_11957 = null;
        IStrategoTerm n_11957 = null;
        IStrategoTerm h_11958 = null;
        m_11957 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail4885;
        n_11957 = term;
        h_11958 = m_11957;
        term = report_with_failure_0_2.instance.invoke(context, h_11958, trans.const934, n_11957);
        if(term == null)
          break Fail4885;
      }
      term = f_11958;
      i_11958 = f_11958;
      IStrategoTerm term2787 = term;
      Success2764:
      { 
        Fail4888:
        { 
          IStrategoTerm j_11958 = null;
          IStrategoTerm k_11958 = null;
          k_11958 = term;
          j_11958 = trans.const935;
          term = k_11958;
          lifted996 lifted9960 = new lifted996();
          lifted9960.r_11956 = r_11956;
          lifted9960.s_11956 = s_11956;
          lifted9960.t_11956 = t_11956;
          lifted9960.a_11957 = a_11957;
          lifted9960.u_11956 = u_11956;
          lifted9960.v_11956 = v_11956;
          lifted9960.b_11957 = b_11957;
          lifted9960.w_11956 = w_11956;
          lifted9960.o_11956 = o_11956;
          lifted9960.q_11956 = q_11956;
          lifted9960.x_11956 = x_11956;
          lifted9960.y_11956 = y_11956;
          lifted9960.j_11957 = j_11957;
          lifted9960.z_11956 = z_11956;
          term = dr_scope_1_1.instance.invoke(context, term, lifted9960, j_11958);
          if(term == null)
            break Fail4888;
          if(true)
            break Success2764;
        }
        term = term2787;
        IStrategoTerm p_11957 = null;
        IStrategoTerm q_11957 = null;
        IStrategoTerm u_11958 = null;
        p_11957 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail4885;
        q_11957 = term;
        u_11958 = p_11957;
        term = report_with_failure_0_2.instance.invoke(context, u_11958, trans.const934, q_11957);
        if(term == null)
          break Fail4885;
      }
      term = i_11958;
      v_11958 = i_11958;
      IStrategoTerm term2788 = term;
      Success2765:
      { 
        Fail4889:
        { 
          term = index_end_transaction_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail4889;
          if(true)
            break Success2765;
        }
        term = term2788;
        IStrategoTerm r_11957 = null;
        IStrategoTerm s_11957 = null;
        IStrategoTerm x_11958 = null;
        r_11957 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail4885;
        s_11957 = term;
        x_11958 = r_11957;
        term = report_with_failure_0_2.instance.invoke(context, x_11958, trans.const934, s_11957);
        if(term == null)
          break Fail4885;
      }
      term = v_11958;
      y_11958 = v_11958;
      IStrategoTerm term2789 = term;
      Success2766:
      { 
        Fail4890:
        { 
          Success2767:
          { 
            Fail4891:
            { 
              IStrategoTerm t_11957 = null;
              t_11957 = term;
              term = n_11956;
              if(term.getTermType() != IStrategoTerm.APPL || Main._consEditor_0 != ((IStrategoAppl)term).getConstructor())
                break Fail4891;
              IStrategoTerm term2791 = term;
              Success2768:
              { 
                Fail4892:
                { 
                  if(q_11956.value == null)
                    break Fail4892;
                  term = is_test_file_0_0.instance.invoke(context, q_11956.value);
                  if(term == null)
                    break Fail4892;
                  { 
                    if(true)
                      break Fail4891;
                    if(true)
                      break Success2768;
                  }
                }
                term = term2791;
              }
              term = t_11957;
              { 
                IStrategoTerm z_11958 = null;
                IStrategoTerm a_11959 = null;
                a_11959 = term;
                if(b_11957.value == null)
                  break Fail4890;
                term = filter_1_0.instance.invoke(context, b_11957.value, index_diff_constructors_0_0.instance);
                if(term == null)
                  break Fail4890;
                z_11958 = term;
                term = a_11959;
                if(a_11957.value == null)
                  break Fail4890;
                term = termFactory.makeTuple(a_11957.value, z_11958);
                term = conc_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail4890;
                d_11957 = term;
                if(c_11957 == null)
                  break Fail4890;
                term = termFactory.makeTuple(c_11957, d_11957);
                term = analyze_diff_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail4890;
                if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
                  break Fail4890;
                g_11957 = term.getSubterm(0);
                h_11957 = term.getSubterm(1);
                term = termFactory.makeTuple(g_11957, h_11957);
                term = conc_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail4890;
                if(e_11957.value == null)
                  e_11957.value = term;
                else
                  if(e_11957.value != term && !e_11957.value.match(term))
                    break Fail4890;
                lifted1001 lifted10010 = new lifted1001();
                lifted10010.j_11957 = j_11957;
                lifted10010.e_11957 = e_11957;
                lifted10010.f_11957 = f_11957;
                lifted10010.i_11957 = i_11957;
                term = index_transaction_1_0.instance.invoke(context, term, lifted10010);
                if(term == null)
                  break Fail4890;
                if(true)
                  break Success2767;
              }
            }
            g_11957 = trans.constNil3;
            h_11957 = trans.constNil3;
            term = trans.constNil3;
            if(i_11957.value == null)
              i_11957.value = term;
            else
              if(i_11957.value != term && !i_11957.value.match(term))
                break Fail4890;
          }
          if(true)
            break Success2766;
        }
        term = term2789;
        IStrategoTerm u_11957 = null;
        IStrategoTerm v_11957 = null;
        IStrategoTerm c_11959 = null;
        u_11957 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail4885;
        v_11957 = term;
        c_11959 = u_11957;
        term = report_with_failure_0_2.instance.invoke(context, c_11959, trans.const934, v_11957);
        if(term == null)
          break Fail4885;
      }
      term = y_11958;
      d_11959 = y_11958;
      IStrategoTerm term2792 = term;
      Success2769:
      { 
        Fail4893:
        { 
          if(j_11957.value == null)
            break Fail4893;
          term = j_11957.value;
          lifted1002 lifted10020 = new lifted1002();
          lifted10020.o_11956 = o_11956;
          lifted10020.q_11956 = q_11956;
          term = list_loop_1_0.instance.invoke(context, term, lifted10020);
          if(term == null)
            break Fail4893;
          if(true)
            break Success2769;
        }
        term = term2792;
        IStrategoTerm w_11957 = null;
        IStrategoTerm x_11957 = null;
        IStrategoTerm f_11959 = null;
        w_11957 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail4885;
        x_11957 = term;
        f_11959 = w_11957;
        term = report_with_failure_0_2.instance.invoke(context, f_11959, trans.const934, x_11957);
        if(term == null)
          break Fail4885;
      }
      term = d_11959;
      if(z_11956.value == null || (a_11957.value == null || (y_11956.value == null || (b_11957.value == null || (g_11957 == null || (h_11957 == null || i_11957.value == null))))))
        break Fail4885;
      term = termFactory.makeAppl(Main._consResults_7, new IStrategoTerm[]{z_11956.value, a_11957.value, y_11956.value, b_11957.value, g_11957, h_11957, i_11957.value});
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}