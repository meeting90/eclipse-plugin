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

@SuppressWarnings("all") public class create_quoted_libraries_0_0 extends Strategy 
{ 
  public static create_quoted_libraries_0_0 instance = new create_quoted_libraries_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("create_quoted_libraries_0_0");
    Fail1539:
    { 
      IStrategoTerm s_2031 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 5)
        break Fail1539;
      s_2031 = term.getSubterm(4);
      IStrategoTerm term856 = term;
      Success856:
      { 
        Fail1540:
        { 
          IStrategoTerm f_2034 = null;
          IStrategoTerm z_2031 = null;
          IStrategoTerm b_2032 = null;
          IStrategoTerm c_2032 = null;
          IStrategoTerm g_2034 = null;
          IStrategoTerm h_2032 = null;
          IStrategoTerm j_2032 = null;
          IStrategoTerm k_2032 = null;
          IStrategoTerm h_2034 = null;
          IStrategoTerm p_2032 = null;
          IStrategoTerm r_2032 = null;
          IStrategoTerm s_2032 = null;
          IStrategoTerm i_2034 = null;
          IStrategoTerm x_2032 = null;
          IStrategoTerm z_2032 = null;
          IStrategoTerm a_2033 = null;
          IStrategoTerm f_2033 = null;
          IStrategoTerm h_2033 = null;
          IStrategoTerm i_2033 = null;
          term = s_2031;
          IStrategoTerm term861 = term;
          Success857:
          { 
            Fail1541:
            { 
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail1541;
              if(true)
                break Success857;
            }
            term = term861;
            IStrategoTerm term862 = term;
            Success858:
            { 
              Fail1542:
              { 
                term = is_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail1542;
                if(true)
                  break Success858;
              }
              term = term862;
              IStrategoTerm term863 = term;
              Success859:
              { 
                Fail1543:
                { 
                  term = int_to_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail1543;
                  if(true)
                    break Success859;
                }
                term = term863;
                IStrategoTerm term864 = term;
                Success860:
                { 
                  Fail1544:
                  { 
                    term = real_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail1544;
                    if(true)
                      break Success860;
                  }
                  term = term864;
                  IStrategoTerm v_2031 = null;
                  IStrategoTerm w_2031 = null;
                  IStrategoTerm y_2031 = null;
                  v_2031 = term;
                  term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                  if(term == null)
                    break Fail1540;
                  if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                    break Fail1540;
                  w_2031 = ((IStrategoList)term).tail();
                  y_2031 = w_2031;
                  term = report_failure_0_2.instance.invoke(context, y_2031, trans.const264, v_2031);
                  if(term == null)
                    break Fail1540;
                }
              }
            }
          }
          b_2032 = term;
          z_2031 = trans.const265;
          c_2032 = b_2032;
          term = string_replace_0_2.instance.invoke(context, c_2032, z_2031, trans.const265);
          if(term == null)
            break Fail1540;
          term = (IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)trans.constCons88);
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1540;
          f_2034 = term;
          term = s_2031;
          IStrategoTerm term865 = term;
          Success861:
          { 
            Fail1545:
            { 
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail1545;
              if(true)
                break Success861;
            }
            term = term865;
            IStrategoTerm term866 = term;
            Success862:
            { 
              Fail1546:
              { 
                term = is_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail1546;
                if(true)
                  break Success862;
              }
              term = term866;
              IStrategoTerm term867 = term;
              Success863:
              { 
                Fail1547:
                { 
                  term = int_to_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail1547;
                  if(true)
                    break Success863;
                }
                term = term867;
                IStrategoTerm term868 = term;
                Success864:
                { 
                  Fail1548:
                  { 
                    term = real_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail1548;
                    if(true)
                      break Success864;
                  }
                  term = term868;
                  IStrategoTerm d_2032 = null;
                  IStrategoTerm e_2032 = null;
                  IStrategoTerm g_2032 = null;
                  d_2032 = term;
                  term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                  if(term == null)
                    break Fail1540;
                  if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                    break Fail1540;
                  e_2032 = ((IStrategoList)term).tail();
                  g_2032 = e_2032;
                  term = report_failure_0_2.instance.invoke(context, g_2032, trans.const264, d_2032);
                  if(term == null)
                    break Fail1540;
                }
              }
            }
          }
          j_2032 = term;
          h_2032 = trans.const265;
          k_2032 = j_2032;
          term = string_replace_0_2.instance.invoke(context, k_2032, h_2032, trans.const265);
          if(term == null)
            break Fail1540;
          term = (IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)trans.constCons89);
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1540;
          g_2034 = term;
          term = s_2031;
          IStrategoTerm term869 = term;
          Success865:
          { 
            Fail1549:
            { 
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail1549;
              if(true)
                break Success865;
            }
            term = term869;
            IStrategoTerm term870 = term;
            Success866:
            { 
              Fail1550:
              { 
                term = is_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail1550;
                if(true)
                  break Success866;
              }
              term = term870;
              IStrategoTerm term871 = term;
              Success867:
              { 
                Fail1551:
                { 
                  term = int_to_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail1551;
                  if(true)
                    break Success867;
                }
                term = term871;
                IStrategoTerm term872 = term;
                Success868:
                { 
                  Fail1552:
                  { 
                    term = real_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail1552;
                    if(true)
                      break Success868;
                  }
                  term = term872;
                  IStrategoTerm l_2032 = null;
                  IStrategoTerm m_2032 = null;
                  IStrategoTerm o_2032 = null;
                  l_2032 = term;
                  term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                  if(term == null)
                    break Fail1540;
                  if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                    break Fail1540;
                  m_2032 = ((IStrategoList)term).tail();
                  o_2032 = m_2032;
                  term = report_failure_0_2.instance.invoke(context, o_2032, trans.const264, l_2032);
                  if(term == null)
                    break Fail1540;
                }
              }
            }
          }
          r_2032 = term;
          p_2032 = trans.const265;
          s_2032 = r_2032;
          term = string_replace_0_2.instance.invoke(context, s_2032, p_2032, trans.const265);
          if(term == null)
            break Fail1540;
          term = (IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)trans.constCons90);
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1540;
          h_2034 = term;
          term = s_2031;
          IStrategoTerm term873 = term;
          Success869:
          { 
            Fail1553:
            { 
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail1553;
              if(true)
                break Success869;
            }
            term = term873;
            IStrategoTerm term874 = term;
            Success870:
            { 
              Fail1554:
              { 
                term = is_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail1554;
                if(true)
                  break Success870;
              }
              term = term874;
              IStrategoTerm term875 = term;
              Success871:
              { 
                Fail1555:
                { 
                  term = int_to_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail1555;
                  if(true)
                    break Success871;
                }
                term = term875;
                IStrategoTerm term876 = term;
                Success872:
                { 
                  Fail1556:
                  { 
                    term = real_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail1556;
                    if(true)
                      break Success872;
                  }
                  term = term876;
                  IStrategoTerm t_2032 = null;
                  IStrategoTerm u_2032 = null;
                  IStrategoTerm w_2032 = null;
                  t_2032 = term;
                  term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                  if(term == null)
                    break Fail1540;
                  if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                    break Fail1540;
                  u_2032 = ((IStrategoList)term).tail();
                  w_2032 = u_2032;
                  term = report_failure_0_2.instance.invoke(context, w_2032, trans.const264, t_2032);
                  if(term == null)
                    break Fail1540;
                }
              }
            }
          }
          z_2032 = term;
          x_2032 = trans.const265;
          a_2033 = z_2032;
          term = string_replace_0_2.instance.invoke(context, a_2033, x_2032, trans.const265);
          if(term == null)
            break Fail1540;
          term = (IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)trans.constCons91);
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1540;
          i_2034 = term;
          term = s_2031;
          IStrategoTerm term877 = term;
          Success873:
          { 
            Fail1557:
            { 
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail1557;
              if(true)
                break Success873;
            }
            term = term877;
            IStrategoTerm term878 = term;
            Success874:
            { 
              Fail1558:
              { 
                term = is_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail1558;
                if(true)
                  break Success874;
              }
              term = term878;
              IStrategoTerm term879 = term;
              Success875:
              { 
                Fail1559:
                { 
                  term = int_to_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail1559;
                  if(true)
                    break Success875;
                }
                term = term879;
                IStrategoTerm term880 = term;
                Success876:
                { 
                  Fail1560:
                  { 
                    term = real_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail1560;
                    if(true)
                      break Success876;
                  }
                  term = term880;
                  IStrategoTerm b_2033 = null;
                  IStrategoTerm c_2033 = null;
                  IStrategoTerm e_2033 = null;
                  b_2033 = term;
                  term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                  if(term == null)
                    break Fail1540;
                  if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                    break Fail1540;
                  c_2033 = ((IStrategoList)term).tail();
                  e_2033 = c_2033;
                  term = report_failure_0_2.instance.invoke(context, e_2033, trans.const264, b_2033);
                  if(term == null)
                    break Fail1540;
                }
              }
            }
          }
          h_2033 = term;
          f_2033 = trans.const265;
          i_2033 = h_2033;
          term = string_replace_0_2.instance.invoke(context, i_2033, f_2033, trans.const265);
          if(term == null)
            break Fail1540;
          term = (IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)trans.constCons92);
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1540;
          term = (IStrategoTerm)termFactory.makeListCons(termFactory.annotateTerm(f_2034, checkListAnnos(termFactory, trans.constNil1)), termFactory.makeListCons(termFactory.annotateTerm(g_2034, checkListAnnos(termFactory, trans.constNil1)), termFactory.makeListCons(termFactory.annotateTerm(h_2034, checkListAnnos(termFactory, trans.constNil1)), termFactory.makeListCons(termFactory.annotateTerm(i_2034, checkListAnnos(termFactory, trans.constNil1)), termFactory.makeListCons(termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil1)), (IStrategoList)trans.constNil1)))));
          term = map_1_0.instance.invoke(context, term, lifted337.instance);
          if(term == null)
            break Fail1540;
          term = map_1_0.instance.invoke(context, term, lifted338.instance);
          if(term == null)
            break Fail1540;
          if(true)
            break Success856;
        }
        term = term856;
        IStrategoTerm c_2034 = null;
        IStrategoTerm d_2034 = null;
        IStrategoTerm k_2035 = null;
        c_2034 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail1539;
        d_2034 = term;
        k_2035 = c_2034;
        term = report_with_failure_0_2.instance.invoke(context, k_2035, trans.const273, d_2034);
        if(term == null)
          break Fail1539;
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