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

@SuppressWarnings("all") public class analyze_defs_0_4 extends Strategy 
{ 
  public static analyze_defs_0_4 instance = new analyze_defs_0_4();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_a_12059, IStrategoTerm ref_b_12059, IStrategoTerm c_12059, IStrategoTerm d_12059)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference a_12059 = new TermReference(ref_a_12059);
    TermReference b_12059 = new TermReference(ref_b_12059);
    context.push("analyze_defs_0_4");
    Fail4903:
    { 
      IStrategoTerm term2801 = term;
      Success2774:
      { 
        Fail4904:
        { 
          IStrategoTerm s_11964 = null;
          IStrategoTerm t_11964 = null;
          IStrategoTerm u_11964 = null;
          IStrategoTerm v_11964 = null;
          IStrategoTerm z_11964 = null;
          IStrategoTerm a_11965 = null;
          IStrategoTerm c_11965 = null;
          IStrategoTerm d_11965 = null;
          v_11964 = term;
          IStrategoList annos213 = term.getAnnotations();
          if(annos213.getTermType() != IStrategoTerm.LIST || ((IStrategoList)annos213).isEmpty())
            break Fail4904;
          IStrategoTerm arg1501 = ((IStrategoList)annos213).head();
          if(arg1501.getTermType() != IStrategoTerm.APPL || Main._consScope_1 != ((IStrategoAppl)arg1501).getConstructor())
            break Fail4904;
          IStrategoTerm arg1502 = arg1501.getSubterm(0);
          if(arg1502.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg1502).isEmpty())
            break Fail4904;
          s_11964 = ((IStrategoList)arg1502).head();
          IStrategoTerm arg1503 = ((IStrategoList)arg1502).tail();
          if(arg1503.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg1503).isEmpty())
            break Fail4904;
          t_11964 = ((IStrategoList)arg1503).tail();
          IStrategoTerm arg1504 = ((IStrategoList)annos213).tail();
          if(arg1504.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg1504).isEmpty())
            break Fail4904;
          if(a_12059.value == null)
            break Fail4904;
          z_11964 = a_12059.value;
          term = (IStrategoTerm)termFactory.makeListCons(termFactory.makeTuple(s_11964, t_11964), (IStrategoList)trans.constNil3);
          term = update_index_paths_0_1.instance.invoke(context, z_11964, term);
          if(term == null)
            break Fail4904;
          u_11964 = term;
          term = rm_annotations_0_0.instance.invoke(context, v_11964);
          if(term == null)
            break Fail4904;
          c_11965 = term;
          a_11965 = trans.constAnon0;
          d_11965 = c_11965;
          term = this.invoke(context, d_11965, u_11964, b_12059.value, a_11965, trans.constAnon0);
          if(term == null)
            break Fail4904;
          if(true)
            break Success2774;
        }
        term = term2801;
        IStrategoTerm i_11963 = null;
        IStrategoTerm j_11963 = null;
        IStrategoTerm k_11963 = null;
        TermReference l_11963 = new TermReference();
        TermReference m_11963 = new TermReference();
        IStrategoTerm n_11963 = null;
        IStrategoTerm o_11963 = null;
        TermReference p_11963 = new TermReference();
        TermReference q_11963 = new TermReference();
        TermReference r_11963 = new TermReference();
        TermReference s_11963 = new TermReference();
        IStrategoTerm t_11963 = null;
        TermReference u_11963 = new TermReference();
        TermReference v_11963 = new TermReference();
        IStrategoTerm w_11963 = null;
        IStrategoTerm x_11963 = null;
        IStrategoTerm y_11963 = null;
        IStrategoTerm d_11964 = null;
        IStrategoTerm e_11964 = null;
        if(m_11963.value == null)
          m_11963.value = term;
        else
          if(m_11963.value != term && !m_11963.value.match(term))
            break Fail4903;
        d_11964 = term;
        if(m_11963.value == null)
          break Fail4903;
        term = m_11963.value;
        IStrategoTerm term2802 = term;
        Success2775:
        { 
          Fail4905:
          { 
            term = has_annos_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail4905;
            { 
              if(true)
                break Fail4903;
              if(true)
                break Success2775;
            }
          }
          term = term2802;
        }
        term = d_11964;
        e_11964 = d_11964;
        IStrategoTerm term2803 = term;
        Success2776:
        { 
          Fail4906:
          { 
            Success2777:
            { 
              Fail4907:
              { 
                IStrategoTerm z_11963 = null;
                z_11963 = term;
                if(m_11963.value == null)
                  break Fail4907;
                term = nam_get_definition_0_0.instance.invoke(context, m_11963.value);
                if(term == null)
                  break Fail4907;
                if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
                  break Fail4907;
                i_11963 = term.getSubterm(0);
                j_11963 = term.getSubterm(1);
                term = z_11963;
                { 
                  IStrategoTerm g_11964 = null;
                  term = nam_get_def_0_2.instance.invoke(context, j_11963, a_12059.value, i_11963);
                  if(term == null)
                    break Fail4906;
                  k_11963 = term;
                  if(term.getTermType() != IStrategoTerm.APPL || Main._consDef_1 != ((IStrategoAppl)term).getConstructor())
                    break Fail4906;
                  if(v_11963.value == null)
                    v_11963.value = term.getSubterm(0);
                  else
                    if(v_11963.value != term.getSubterm(0) && !v_11963.value.match(term.getSubterm(0)))
                      break Fail4906;
                  term = i_11963;
                  if(p_11963.value == null)
                    p_11963.value = term;
                  else
                    if(p_11963.value != term && !p_11963.value.match(term))
                      break Fail4906;
                  term = $Hd_0_0.instance.invoke(context, j_11963);
                  if(term == null)
                    break Fail4906;
                  if(q_11963.value == null)
                    q_11963.value = term;
                  else
                    if(q_11963.value != term && !q_11963.value.match(term))
                      break Fail4906;
                  if(m_11963.value == null)
                    break Fail4906;
                  term = m_11963.value;
                  lifted1007 lifted10070 = new lifted1007();
                  lifted10070.v_11963 = v_11963;
                  term = try_1_0.instance.invoke(context, term, lifted10070);
                  if(term == null)
                    break Fail4906;
                  IStrategoTerm cons109 = context.invokePrimitive("SSL_get_constructor", term, NO_STRATEGIES, new IStrategoTerm[]{term});
                  w_11963 = cons109;
                  IStrategoTerm args34 = context.invokePrimitive("SSL_get_arguments", term, NO_STRATEGIES, new IStrategoTerm[]{term});
                  t_11963 = args34;
                  if(b_12059.value == null)
                    break Fail4906;
                  term = b_12059.value;
                  g_11964 = b_12059.value;
                  term = new_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail4906;
                  term = termFactory.makeTuple(term, k_11963);
                  term = iset_add_0_1.instance.invoke(context, g_11964, term);
                  if(term == null)
                    break Fail4906;
                  if(true)
                    break Success2777;
                }
              }
              term = trans.constINTERNAL_ERROR0;
              if(v_11963.value == null)
                v_11963.value = term;
              else
                if(v_11963.value != term && !v_11963.value.match(term))
                  break Fail4906;
              term = d_12059;
              if(p_11963.value == null)
                p_11963.value = term;
              else
                if(p_11963.value != term && !p_11963.value.match(term))
                  break Fail4906;
              term = c_12059;
              if(q_11963.value == null)
                q_11963.value = term;
              else
                if(q_11963.value != term && !q_11963.value.match(term))
                  break Fail4906;
              if(m_11963.value == null)
                break Fail4906;
              term = m_11963.value;
              IStrategoTerm cons110 = context.invokePrimitive("SSL_get_constructor", term, NO_STRATEGIES, new IStrategoTerm[]{term});
              w_11963 = cons110;
              IStrategoTerm args35 = context.invokePrimitive("SSL_get_arguments", term, NO_STRATEGIES, new IStrategoTerm[]{term});
              t_11963 = args35;
            }
            IStrategoTerm term2805 = term;
            Success2778:
            { 
              Fail4908:
              { 
                IStrategoTerm a_11964 = null;
                a_11964 = term;
                if(m_11963.value == null)
                  break Fail4908;
                term = nam_get_scope_types_0_0.instance.invoke(context, m_11963.value);
                if(term == null)
                  break Fail4908;
                n_11963 = term;
                term = a_11964;
                { 
                  term = new_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail4906;
                  term = termFactory.makeAppl(Main._consAnon_1, new IStrategoTerm[]{term});
                  if(l_11963.value == null)
                    l_11963.value = term;
                  else
                    if(l_11963.value != term && !l_11963.value.match(term))
                      break Fail4906;
                  term = n_11963;
                  lifted1008 lifted10080 = new lifted1008();
                  lifted10080.a_12059 = a_12059;
                  lifted10080.q_11963 = q_11963;
                  lifted10080.p_11963 = p_11963;
                  lifted10080.l_11963 = l_11963;
                  lifted10080.m_11963 = m_11963;
                  term = map_1_0.instance.invoke(context, term, lifted10080);
                  if(term == null)
                    break Fail4906;
                  o_11963 = term;
                  if(a_12059.value == null)
                    break Fail4906;
                  term = update_index_paths_0_1.instance.invoke(context, a_12059.value, o_11963);
                  if(term == null)
                    break Fail4906;
                  if(u_11963.value == null)
                    u_11963.value = term;
                  else
                    if(u_11963.value != term && !u_11963.value.match(term))
                      break Fail4906;
                  term = trans.constAnon0;
                  if(s_11963.value == null)
                    s_11963.value = term;
                  else
                    if(s_11963.value != term && !s_11963.value.match(term))
                      break Fail4906;
                  term = trans.constAnon0;
                  if(r_11963.value == null)
                    r_11963.value = term;
                  else
                    if(r_11963.value != term && !r_11963.value.match(term))
                      break Fail4906;
                  if(true)
                    break Success2778;
                }
              }
              term = term2805;
              if(a_12059.value == null)
                break Fail4906;
              term = a_12059.value;
              if(u_11963.value == null)
                u_11963.value = term;
              else
                if(u_11963.value != term && !u_11963.value.match(term))
                  break Fail4906;
              if(p_11963.value == null)
                break Fail4906;
              term = p_11963.value;
              if(s_11963.value == null)
                s_11963.value = term;
              else
                if(s_11963.value != term && !s_11963.value.match(term))
                  break Fail4906;
              if(q_11963.value == null)
                break Fail4906;
              term = q_11963.value;
              if(r_11963.value == null)
                r_11963.value = term;
              else
                if(r_11963.value != term && !r_11963.value.match(term))
                  break Fail4906;
            }
            term = t_11963;
            lifted1009 lifted10090 = new lifted1009();
            lifted10090.u_11963 = u_11963;
            lifted10090.b_12059 = b_12059;
            lifted10090.r_11963 = r_11963;
            lifted10090.s_11963 = s_11963;
            term = origin_track_forced_1_0.instance.invoke(context, term, lifted10090);
            if(term == null)
              break Fail4906;
            x_11963 = term;
            IStrategoTerm mkterm6;
            mkterm6 = context.invokePrimitive("SSL_mkterm", term, NO_STRATEGIES, new IStrategoTerm[]{w_11963, x_11963});
            if(mkterm6 == null)
              break Fail4906;
            term = mkterm6;
            lifted1010 lifted10100 = new lifted1010();
            lifted10100.u_11963 = u_11963;
            lifted10100.v_11963 = v_11963;
            term = try_1_0.instance.invoke(context, term, lifted10100);
            if(term == null)
              break Fail4906;
            y_11963 = term;
            if(true)
              break Success2776;
          }
          term = term2803;
          IStrategoTerm b_11964 = null;
          IStrategoTerm c_11964 = null;
          IStrategoTerm m_11964 = null;
          b_11964 = term;
          term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
          if(term == null)
            break Fail4903;
          c_11964 = term;
          m_11964 = b_11964;
          term = report_with_failure_0_2.instance.invoke(context, m_11964, trans.const941, c_11964);
          if(term == null)
            break Fail4903;
        }
        term = e_11964;
        if(y_11963 == null)
          break Fail4903;
        term = y_11963;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}