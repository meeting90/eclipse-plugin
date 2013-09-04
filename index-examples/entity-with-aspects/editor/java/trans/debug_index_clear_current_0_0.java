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

@SuppressWarnings("all") public class debug_index_clear_current_0_0 extends Strategy 
{ 
  public static debug_index_clear_current_0_0 instance = new debug_index_clear_current_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("debug_index_clear_current_0_0");
    Fail5323:
    { 
      IStrategoTerm i_12029 = null;
      IStrategoTerm j_12029 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 5)
        break Fail5323;
      j_12029 = term.getSubterm(3);
      i_12029 = term.getSubterm(4);
      IStrategoTerm term3033 = term;
      Success2983:
      { 
        Fail5324:
        { 
          IStrategoTerm t_12030 = null;
          IStrategoTerm u_12030 = null;
          IStrategoTerm w_12030 = null;
          IStrategoTerm x_12030 = null;
          IStrategoTerm z_12030 = null;
          IStrategoTerm a_12031 = null;
          IStrategoTerm d_12031 = null;
          IStrategoTerm o_12029 = null;
          IStrategoTerm q_12029 = null;
          IStrategoTerm r_12029 = null;
          IStrategoTerm w_12029 = null;
          IStrategoTerm y_12029 = null;
          IStrategoTerm z_12029 = null;
          IStrategoTerm j_12031 = null;
          IStrategoTerm e_12030 = null;
          IStrategoTerm g_12030 = null;
          IStrategoTerm h_12030 = null;
          IStrategoTerm m_12030 = null;
          IStrategoTerm o_12030 = null;
          IStrategoTerm p_12030 = null;
          IStrategoTerm e_12161 = null;
          w_12030 = term;
          x_12030 = trans.const998;
          t_12030 = x_12030;
          z_12030 = w_12030;
          term = (IStrategoTerm)termFactory.makeListCons(i_12029, (IStrategoList)trans.constNil3);
          u_12030 = term;
          a_12031 = z_12030;
          term = i_12029;
          IStrategoTerm term3034 = term;
          Success2984:
          { 
            Fail5325:
            { 
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail5325;
              if(true)
                break Success2984;
            }
            term = term3034;
            IStrategoTerm term3035 = term;
            Success2985:
            { 
              Fail5326:
              { 
                term = is_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail5326;
                if(true)
                  break Success2985;
              }
              term = term3035;
              IStrategoTerm term3036 = term;
              Success2986:
              { 
                Fail5327:
                { 
                  term = int_to_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail5327;
                  if(true)
                    break Success2986;
                }
                term = term3036;
                IStrategoTerm term3037 = term;
                Success2987:
                { 
                  Fail5328:
                  { 
                    term = real_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail5328;
                    if(true)
                      break Success2987;
                  }
                  term = term3037;
                  IStrategoTerm k_12029 = null;
                  IStrategoTerm l_12029 = null;
                  IStrategoTerm n_12029 = null;
                  k_12029 = term;
                  term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                  if(term == null)
                    break Fail5324;
                  if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                    break Fail5324;
                  l_12029 = ((IStrategoList)term).tail();
                  n_12029 = l_12029;
                  term = report_failure_0_2.instance.invoke(context, n_12029, trans.const1028, k_12029);
                  if(term == null)
                    break Fail5324;
                }
              }
            }
          }
          q_12029 = term;
          o_12029 = trans.const785;
          r_12029 = q_12029;
          term = string_replace_0_2.instance.invoke(context, r_12029, o_12029, trans.const785);
          if(term == null)
            break Fail5324;
          d_12031 = term;
          term = j_12029;
          IStrategoTerm term3038 = term;
          Success2988:
          { 
            Fail5329:
            { 
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail5329;
              if(true)
                break Success2988;
            }
            term = term3038;
            IStrategoTerm term3039 = term;
            Success2989:
            { 
              Fail5330:
              { 
                term = is_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail5330;
                if(true)
                  break Success2989;
              }
              term = term3039;
              IStrategoTerm term3040 = term;
              Success2990:
              { 
                Fail5331:
                { 
                  term = int_to_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail5331;
                  if(true)
                    break Success2990;
                }
                term = term3040;
                IStrategoTerm term3041 = term;
                Success2991:
                { 
                  Fail5332:
                  { 
                    term = real_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail5332;
                    if(true)
                      break Success2991;
                  }
                  term = term3041;
                  IStrategoTerm s_12029 = null;
                  IStrategoTerm t_12029 = null;
                  IStrategoTerm v_12029 = null;
                  s_12029 = term;
                  term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                  if(term == null)
                    break Fail5324;
                  if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                    break Fail5324;
                  t_12029 = ((IStrategoList)term).tail();
                  v_12029 = t_12029;
                  term = report_failure_0_2.instance.invoke(context, v_12029, trans.const1028, s_12029);
                  if(term == null)
                    break Fail5324;
                }
              }
            }
          }
          y_12029 = term;
          w_12029 = trans.const785;
          z_12029 = y_12029;
          term = string_replace_0_2.instance.invoke(context, z_12029, w_12029, trans.const968);
          if(term == null)
            break Fail5324;
          term = (IStrategoTerm)termFactory.makeListCons(d_12031, termFactory.makeListCons(trans.const932, termFactory.makeListCons(term, (IStrategoList)trans.constNil3)));
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail5324;
          term = termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil3));
          term = index_setup_0_3.instance.invoke(context, a_12031, t_12030, u_12030, term);
          if(term == null)
            break Fail5324;
          term = i_12029;
          IStrategoTerm term3042 = term;
          Success2992:
          { 
            Fail5333:
            { 
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail5333;
              if(true)
                break Success2992;
            }
            term = term3042;
            IStrategoTerm term3043 = term;
            Success2993:
            { 
              Fail5334:
              { 
                term = is_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail5334;
                if(true)
                  break Success2993;
              }
              term = term3043;
              IStrategoTerm term3044 = term;
              Success2994:
              { 
                Fail5335:
                { 
                  term = int_to_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail5335;
                  if(true)
                    break Success2994;
                }
                term = term3044;
                IStrategoTerm term3045 = term;
                Success2995:
                { 
                  Fail5336:
                  { 
                    term = real_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail5336;
                    if(true)
                      break Success2995;
                  }
                  term = term3045;
                  IStrategoTerm a_12030 = null;
                  IStrategoTerm b_12030 = null;
                  IStrategoTerm d_12030 = null;
                  a_12030 = term;
                  term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                  if(term == null)
                    break Fail5324;
                  if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                    break Fail5324;
                  b_12030 = ((IStrategoList)term).tail();
                  d_12030 = b_12030;
                  term = report_failure_0_2.instance.invoke(context, d_12030, trans.const1028, a_12030);
                  if(term == null)
                    break Fail5324;
                }
              }
            }
          }
          g_12030 = term;
          e_12030 = trans.const785;
          h_12030 = g_12030;
          term = string_replace_0_2.instance.invoke(context, h_12030, e_12030, trans.const785);
          if(term == null)
            break Fail5324;
          j_12031 = term;
          term = j_12029;
          IStrategoTerm term3046 = term;
          Success2996:
          { 
            Fail5337:
            { 
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail5337;
              if(true)
                break Success2996;
            }
            term = term3046;
            IStrategoTerm term3047 = term;
            Success2997:
            { 
              Fail5338:
              { 
                term = is_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail5338;
                if(true)
                  break Success2997;
              }
              term = term3047;
              IStrategoTerm term3048 = term;
              Success2998:
              { 
                Fail5339:
                { 
                  term = int_to_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail5339;
                  if(true)
                    break Success2998;
                }
                term = term3048;
                IStrategoTerm term3049 = term;
                Success2999:
                { 
                  Fail5340:
                  { 
                    term = real_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail5340;
                    if(true)
                      break Success2999;
                  }
                  term = term3049;
                  IStrategoTerm i_12030 = null;
                  IStrategoTerm j_12030 = null;
                  IStrategoTerm l_12030 = null;
                  i_12030 = term;
                  term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                  if(term == null)
                    break Fail5324;
                  if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                    break Fail5324;
                  j_12030 = ((IStrategoList)term).tail();
                  l_12030 = j_12030;
                  term = report_failure_0_2.instance.invoke(context, l_12030, trans.const1028, i_12030);
                  if(term == null)
                    break Fail5324;
                }
              }
            }
          }
          o_12030 = term;
          m_12030 = trans.const785;
          p_12030 = o_12030;
          term = string_replace_0_2.instance.invoke(context, p_12030, m_12030, trans.const968);
          if(term == null)
            break Fail5324;
          term = (IStrategoTerm)termFactory.makeListCons(j_12031, termFactory.makeListCons(trans.const932, termFactory.makeListCons(term, (IStrategoList)trans.constNil3)));
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail5324;
          term = termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil3));
          e_12161 = term;
          term = context.invokePrimitive("LANG_index_clear_file", e_12161, NO_STRATEGIES, new IStrategoTerm[]{term});
          if(term == null)
            break Fail5324;
          if(true)
            break Success2983;
        }
        term = term3033;
        IStrategoTerm q_12030 = null;
        IStrategoTerm r_12030 = null;
        IStrategoTerm o_12031 = null;
        q_12030 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail5323;
        r_12030 = term;
        o_12031 = q_12030;
        term = report_with_failure_0_2.instance.invoke(context, o_12031, trans.const1029, r_12030);
        if(term == null)
          break Fail5323;
      }
      term = trans.constNone0;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}