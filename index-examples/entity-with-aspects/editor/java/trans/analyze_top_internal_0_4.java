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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm s_2093, IStrategoTerm ref_t_2093, IStrategoTerm u_2093, IStrategoTerm ref_v_2093)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference t_2093 = new TermReference(ref_t_2093);
    TermReference v_2093 = new TermReference(ref_v_2093);
    context.push("analyze_top_internal_0_4");
    Fail1983:
    { 
      TermReference w_2093 = new TermReference();
      TermReference x_2093 = new TermReference();
      TermReference y_2093 = new TermReference();
      TermReference z_2093 = new TermReference();
      TermReference a_2094 = new TermReference();
      TermReference b_2094 = new TermReference();
      TermReference c_2094 = new TermReference();
      TermReference d_2094 = new TermReference();
      TermReference e_2094 = new TermReference();
      TermReference f_2094 = new TermReference();
      TermReference g_2094 = new TermReference();
      IStrategoTerm h_2094 = null;
      IStrategoTerm i_2094 = null;
      TermReference j_2094 = new TermReference();
      TermReference k_2094 = new TermReference();
      IStrategoTerm l_2094 = null;
      IStrategoTerm m_2094 = null;
      TermReference n_2094 = new TermReference();
      TermReference o_2094 = new TermReference();
      IStrategoTerm d_2095 = null;
      IStrategoTerm k_2095 = null;
      IStrategoTerm n_2095 = null;
      IStrategoTerm a_2096 = null;
      IStrategoTerm d_2096 = null;
      IStrategoTerm i_2096 = null;
      if(x_2093.value == null)
        x_2093.value = term;
      else
        if(x_2093.value != term && !x_2093.value.match(term))
          break Fail1983;
      d_2095 = term;
      IStrategoTerm term1228 = term;
      Success1206:
      { 
        Fail1984:
        { 
          IStrategoTerm f_2095 = null;
          f_2095 = term;
          term = (IStrategoTerm)termFactory.makeListCons(u_2093, (IStrategoList)trans.constNil1);
          term = index_setup_0_3.instance.invoke(context, f_2095, t_2093.value, term, v_2093.value);
          if(term == null)
            break Fail1984;
          term = index_start_transaction_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1984;
          if(k_2094.value == null)
            k_2094.value = term;
          else
            if(k_2094.value != term && !k_2094.value.match(term))
              break Fail1984;
          if(true)
            break Success1206;
        }
        term = term1228;
        IStrategoTerm p_2094 = null;
        IStrategoTerm q_2094 = null;
        IStrategoTerm j_2095 = null;
        p_2094 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail1983;
        q_2094 = term;
        j_2095 = p_2094;
        term = report_with_failure_0_2.instance.invoke(context, j_2095, trans.const414, q_2094);
        if(term == null)
          break Fail1983;
      }
      term = d_2095;
      k_2095 = d_2095;
      IStrategoTerm term1229 = term;
      Success1207:
      { 
        Fail1985:
        { 
          if(v_2093.value == null)
            break Fail1985;
          term = index_get_all_in_file_0_0.instance.invoke(context, v_2093.value);
          if(term == null)
            break Fail1985;
          term = filter_1_0.instance.invoke(context, term, lifted395.instance);
          if(term == null)
            break Fail1985;
          h_2094 = term;
          if(v_2093.value == null)
            break Fail1985;
          term = index_clear_file_0_0.instance.invoke(context, v_2093.value);
          if(term == null)
            break Fail1985;
          if(true)
            break Success1207;
        }
        term = term1229;
        IStrategoTerm r_2094 = null;
        IStrategoTerm s_2094 = null;
        IStrategoTerm m_2095 = null;
        r_2094 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail1983;
        s_2094 = term;
        m_2095 = r_2094;
        term = report_with_failure_0_2.instance.invoke(context, m_2095, trans.const414, s_2094);
        if(term == null)
          break Fail1983;
      }
      term = k_2095;
      n_2095 = k_2095;
      IStrategoTerm term1231 = term;
      Success1208:
      { 
        Fail1986:
        { 
          IStrategoTerm o_2095 = null;
          IStrategoTerm p_2095 = null;
          p_2095 = term;
          o_2095 = trans.const415;
          term = p_2095;
          lifted396 lifted3960 = new lifted396();
          lifted3960.w_2093 = w_2093;
          lifted3960.x_2093 = x_2093;
          lifted3960.y_2093 = y_2093;
          lifted3960.f_2094 = f_2094;
          lifted3960.z_2093 = z_2093;
          lifted3960.a_2094 = a_2094;
          lifted3960.g_2094 = g_2094;
          lifted3960.b_2094 = b_2094;
          lifted3960.t_2093 = t_2093;
          lifted3960.v_2093 = v_2093;
          lifted3960.c_2094 = c_2094;
          lifted3960.d_2094 = d_2094;
          lifted3960.o_2094 = o_2094;
          lifted3960.e_2094 = e_2094;
          term = dr_scope_1_1.instance.invoke(context, term, lifted3960, o_2095);
          if(term == null)
            break Fail1986;
          if(true)
            break Success1208;
        }
        term = term1231;
        IStrategoTerm u_2094 = null;
        IStrategoTerm v_2094 = null;
        IStrategoTerm z_2095 = null;
        u_2094 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail1983;
        v_2094 = term;
        z_2095 = u_2094;
        term = report_with_failure_0_2.instance.invoke(context, z_2095, trans.const414, v_2094);
        if(term == null)
          break Fail1983;
      }
      term = n_2095;
      a_2096 = n_2095;
      IStrategoTerm term1232 = term;
      Success1209:
      { 
        Fail1987:
        { 
          term = index_end_transaction_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1987;
          if(true)
            break Success1209;
        }
        term = term1232;
        IStrategoTerm w_2094 = null;
        IStrategoTerm x_2094 = null;
        IStrategoTerm c_2096 = null;
        w_2094 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail1983;
        x_2094 = term;
        c_2096 = w_2094;
        term = report_with_failure_0_2.instance.invoke(context, c_2096, trans.const414, x_2094);
        if(term == null)
          break Fail1983;
      }
      term = a_2096;
      d_2096 = a_2096;
      IStrategoTerm term1233 = term;
      Success1210:
      { 
        Fail1988:
        { 
          Success1211:
          { 
            Fail1989:
            { 
              IStrategoTerm y_2094 = null;
              y_2094 = term;
              term = s_2093;
              if(term.getTermType() != IStrategoTerm.APPL || Main._consEditor_0 != ((IStrategoAppl)term).getConstructor())
                break Fail1989;
              IStrategoTerm term1235 = term;
              Success1212:
              { 
                Fail1990:
                { 
                  if(v_2093.value == null)
                    break Fail1990;
                  term = is_test_file_0_0.instance.invoke(context, v_2093.value);
                  if(term == null)
                    break Fail1990;
                  { 
                    if(true)
                      break Fail1989;
                    if(true)
                      break Success1212;
                  }
                }
                term = term1235;
              }
              term = y_2094;
              { 
                IStrategoTerm e_2096 = null;
                IStrategoTerm f_2096 = null;
                f_2096 = term;
                if(g_2094.value == null)
                  break Fail1988;
                term = filter_1_0.instance.invoke(context, g_2094.value, index_diff_constructors_0_0.instance);
                if(term == null)
                  break Fail1988;
                e_2096 = term;
                term = f_2096;
                if(f_2094.value == null)
                  break Fail1988;
                term = termFactory.makeTuple(f_2094.value, e_2096);
                term = conc_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail1988;
                i_2094 = term;
                if(h_2094 == null)
                  break Fail1988;
                term = termFactory.makeTuple(h_2094, i_2094);
                term = analyze_diff_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail1988;
                if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
                  break Fail1988;
                l_2094 = term.getSubterm(0);
                m_2094 = term.getSubterm(1);
                term = termFactory.makeTuple(l_2094, m_2094);
                term = conc_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail1988;
                if(j_2094.value == null)
                  j_2094.value = term;
                else
                  if(j_2094.value != term && !j_2094.value.match(term))
                    break Fail1988;
                lifted401 lifted4010 = new lifted401();
                lifted4010.o_2094 = o_2094;
                lifted4010.j_2094 = j_2094;
                lifted4010.k_2094 = k_2094;
                lifted4010.n_2094 = n_2094;
                term = index_transaction_1_0.instance.invoke(context, term, lifted4010);
                if(term == null)
                  break Fail1988;
                if(true)
                  break Success1211;
              }
            }
            l_2094 = trans.constNil1;
            m_2094 = trans.constNil1;
            term = trans.constNil1;
            if(n_2094.value == null)
              n_2094.value = term;
            else
              if(n_2094.value != term && !n_2094.value.match(term))
                break Fail1988;
          }
          if(true)
            break Success1210;
        }
        term = term1233;
        IStrategoTerm z_2094 = null;
        IStrategoTerm a_2095 = null;
        IStrategoTerm h_2096 = null;
        z_2094 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail1983;
        a_2095 = term;
        h_2096 = z_2094;
        term = report_with_failure_0_2.instance.invoke(context, h_2096, trans.const414, a_2095);
        if(term == null)
          break Fail1983;
      }
      term = d_2096;
      i_2096 = d_2096;
      IStrategoTerm term1236 = term;
      Success1213:
      { 
        Fail1991:
        { 
          if(o_2094.value == null)
            break Fail1991;
          term = o_2094.value;
          lifted402 lifted4020 = new lifted402();
          lifted4020.t_2093 = t_2093;
          lifted4020.v_2093 = v_2093;
          term = list_loop_1_0.instance.invoke(context, term, lifted4020);
          if(term == null)
            break Fail1991;
          if(true)
            break Success1213;
        }
        term = term1236;
        IStrategoTerm b_2095 = null;
        IStrategoTerm c_2095 = null;
        IStrategoTerm k_2096 = null;
        b_2095 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail1983;
        c_2095 = term;
        k_2096 = b_2095;
        term = report_with_failure_0_2.instance.invoke(context, k_2096, trans.const414, c_2095);
        if(term == null)
          break Fail1983;
      }
      term = i_2096;
      if(e_2094.value == null || (f_2094.value == null || (d_2094.value == null || (g_2094.value == null || (l_2094 == null || (m_2094 == null || n_2094.value == null))))))
        break Fail1983;
      term = termFactory.makeAppl(Main._consResults_7, new IStrategoTerm[]{e_2094.value, f_2094.value, d_2094.value, g_2094.value, l_2094, m_2094, n_2094.value});
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}