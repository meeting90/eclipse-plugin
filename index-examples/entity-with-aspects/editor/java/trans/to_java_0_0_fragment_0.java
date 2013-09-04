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

@SuppressWarnings("all") public class to_java_0_0_fragment_0 extends Strategy 
{ 
  public static to_java_0_0_fragment_0 instance = new to_java_0_0_fragment_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("to_java_0_0_fragment_0");
    Fail1706:
    { 
      IStrategoTerm term997 = term;
      Success976:
      { 
        Fail1707:
        { 
          IStrategoTerm i_2056 = null;
          TermReference m_2056 = new TermReference();
          IStrategoTerm o_2056 = null;
          IStrategoTerm p_2056 = null;
          TermReference q_2056 = new TermReference();
          IStrategoTerm r_2056 = null;
          IStrategoTerm s_2056 = null;
          IStrategoTerm c_2058 = null;
          IStrategoTerm n_2058 = null;
          IStrategoTerm r_2058 = null;
          IStrategoTerm a_2057 = null;
          IStrategoTerm c_2057 = null;
          IStrategoTerm d_2057 = null;
          IStrategoTerm o_2058 = null;
          IStrategoTerm s_2058 = null;
          IStrategoTerm i_2057 = null;
          IStrategoTerm k_2057 = null;
          IStrategoTerm l_2057 = null;
          IStrategoTerm p_2058 = null;
          IStrategoTerm t_2058 = null;
          IStrategoTerm q_2057 = null;
          IStrategoTerm s_2057 = null;
          IStrategoTerm t_2057 = null;
          IStrategoTerm y_2057 = null;
          IStrategoTerm a_2058 = null;
          IStrategoTerm b_2058 = null;
          if(term.getTermType() != IStrategoTerm.APPL || Main._consAssign_2 != ((IStrategoAppl)term).getConstructor())
            break Fail1707;
          o_2056 = term.getSubterm(0);
          if(m_2056.value == null)
            m_2056.value = term.getSubterm(1);
          else
            if(m_2056.value != term.getSubterm(1) && !m_2056.value.match(term.getSubterm(1)))
              break Fail1707;
          c_2058 = term;
          IStrategoTerm term998 = term;
          Success977:
          { 
            Fail1708:
            { 
              IStrategoTerm e_2058 = null;
              term = index_find_key_0_0.instance.invoke(context, o_2056);
              if(term == null)
                break Fail1708;
              IStrategoList annos69 = term.getAnnotations();
              if(annos69.getTermType() != IStrategoTerm.LIST || ((IStrategoList)annos69).isEmpty())
                break Fail1708;
              i_2056 = ((IStrategoList)annos69).head();
              IStrategoTerm arg556 = ((IStrategoList)annos69).tail();
              if(arg556.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg556).isEmpty())
                break Fail1708;
              term = last_0_0.instance.invoke(context, i_2056);
              if(term == null)
                break Fail1708;
              term = (IStrategoTerm)termFactory.makeListCons(trans.constModule0, termFactory.makeListCons(term, (IStrategoList)trans.constNil1));
              e_2058 = term;
              term = index_get_children_0_1.instance.invoke(context, e_2058, trans.constAspect0);
              if(term == null)
                break Fail1708;
              term = mapconcat_1_0.instance.invoke(context, term, lifted358.instance);
              if(term == null)
                break Fail1708;
              term = mapconcat_1_0.instance.invoke(context, term, lifted359.instance);
              if(term == null)
                break Fail1708;
              lifted360 lifted3600 = new lifted360();
              lifted3600.m_2056 = m_2056;
              term = map_1_0.instance.invoke(context, term, lifted3600);
              if(term == null)
                break Fail1708;
              r_2056 = term;
              term = type_of_0_0.instance.invoke(context, o_2056);
              if(term == null)
                break Fail1708;
              term = to_java_aspect_type_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail1708;
              if(q_2056.value == null)
                q_2056.value = term;
              else
                if(q_2056.value != term && !q_2056.value.match(term))
                  break Fail1708;
              term = r_2056;
              lifted361 lifted3610 = new lifted361();
              lifted3610.q_2056 = q_2056;
              term = filter_1_0.instance.invoke(context, term, lifted3610);
              if(term == null)
                break Fail1708;
              p_2056 = term;
              term = r_2056;
              lifted362 lifted3620 = new lifted362();
              lifted3620.q_2056 = q_2056;
              term = filter_1_0.instance.invoke(context, term, lifted3620);
              if(term == null)
                break Fail1708;
              s_2056 = term;
              if(true)
                break Success977;
            }
            term = term998;
            IStrategoTerm u_2056 = null;
            IStrategoTerm v_2056 = null;
            IStrategoTerm k_2058 = null;
            u_2056 = term;
            term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
            if(term == null)
              break Fail1707;
            v_2056 = term;
            k_2058 = u_2056;
            term = report_with_failure_0_2.instance.invoke(context, k_2058, trans.const363, v_2056);
            if(term == null)
              break Fail1707;
          }
          term = c_2058;
          r_2058 = term;
          if(p_2056 == null)
            break Fail1707;
          term = p_2056;
          IStrategoTerm term999 = term;
          Success978:
          { 
            Fail1709:
            { 
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail1709;
              if(true)
                break Success978;
            }
            term = term999;
            IStrategoTerm term1000 = term;
            Success979:
            { 
              Fail1710:
              { 
                term = is_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail1710;
                if(true)
                  break Success979;
              }
              term = term1000;
              IStrategoTerm term1001 = term;
              Success980:
              { 
                Fail1711:
                { 
                  term = int_to_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail1711;
                  if(true)
                    break Success980;
                }
                term = term1001;
                IStrategoTerm term1002 = term;
                Success981:
                { 
                  Fail1712:
                  { 
                    term = real_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail1712;
                    if(true)
                      break Success981;
                  }
                  term = term1002;
                  IStrategoTerm w_2056 = null;
                  IStrategoTerm x_2056 = null;
                  IStrategoTerm z_2056 = null;
                  w_2056 = term;
                  term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                  if(term == null)
                    break Fail1707;
                  if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                    break Fail1707;
                  x_2056 = ((IStrategoList)term).tail();
                  z_2056 = x_2056;
                  term = report_failure_0_2.instance.invoke(context, z_2056, trans.const334, w_2056);
                  if(term == null)
                    break Fail1707;
                }
              }
            }
          }
          c_2057 = term;
          a_2057 = trans.const265;
          d_2057 = c_2057;
          term = string_replace_0_2.instance.invoke(context, d_2057, a_2057, trans.const265);
          if(term == null)
            break Fail1707;
          n_2058 = term;
          s_2058 = r_2058;
          term = to_java_0_0.instance.invoke(context, o_2056);
          if(term == null)
            break Fail1707;
          IStrategoTerm term1003 = term;
          Success982:
          { 
            Fail1713:
            { 
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail1713;
              if(true)
                break Success982;
            }
            term = term1003;
            IStrategoTerm term1004 = term;
            Success983:
            { 
              Fail1714:
              { 
                term = is_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail1714;
                if(true)
                  break Success983;
              }
              term = term1004;
              IStrategoTerm term1005 = term;
              Success984:
              { 
                Fail1715:
                { 
                  term = int_to_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail1715;
                  if(true)
                    break Success984;
                }
                term = term1005;
                IStrategoTerm term1006 = term;
                Success985:
                { 
                  Fail1716:
                  { 
                    term = real_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail1716;
                    if(true)
                      break Success985;
                  }
                  term = term1006;
                  IStrategoTerm e_2057 = null;
                  IStrategoTerm f_2057 = null;
                  IStrategoTerm h_2057 = null;
                  e_2057 = term;
                  term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                  if(term == null)
                    break Fail1707;
                  if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                    break Fail1707;
                  f_2057 = ((IStrategoList)term).tail();
                  h_2057 = f_2057;
                  term = report_failure_0_2.instance.invoke(context, h_2057, trans.const334, e_2057);
                  if(term == null)
                    break Fail1707;
                }
              }
            }
          }
          k_2057 = term;
          i_2057 = trans.const265;
          l_2057 = k_2057;
          term = string_replace_0_2.instance.invoke(context, l_2057, i_2057, trans.const265);
          if(term == null)
            break Fail1707;
          o_2058 = term;
          term = s_2058;
          t_2058 = s_2058;
          if(m_2056.value == null)
            break Fail1707;
          term = to_java_0_0.instance.invoke(context, m_2056.value);
          if(term == null)
            break Fail1707;
          IStrategoTerm term1007 = term;
          Success986:
          { 
            Fail1717:
            { 
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail1717;
              if(true)
                break Success986;
            }
            term = term1007;
            IStrategoTerm term1008 = term;
            Success987:
            { 
              Fail1718:
              { 
                term = is_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail1718;
                if(true)
                  break Success987;
              }
              term = term1008;
              IStrategoTerm term1009 = term;
              Success988:
              { 
                Fail1719:
                { 
                  term = int_to_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail1719;
                  if(true)
                    break Success988;
                }
                term = term1009;
                IStrategoTerm term1010 = term;
                Success989:
                { 
                  Fail1720:
                  { 
                    term = real_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail1720;
                    if(true)
                      break Success989;
                  }
                  term = term1010;
                  IStrategoTerm m_2057 = null;
                  IStrategoTerm n_2057 = null;
                  IStrategoTerm p_2057 = null;
                  m_2057 = term;
                  term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                  if(term == null)
                    break Fail1707;
                  if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                    break Fail1707;
                  n_2057 = ((IStrategoList)term).tail();
                  p_2057 = n_2057;
                  term = report_failure_0_2.instance.invoke(context, p_2057, trans.const334, m_2057);
                  if(term == null)
                    break Fail1707;
                }
              }
            }
          }
          s_2057 = term;
          q_2057 = trans.const265;
          t_2057 = s_2057;
          term = string_replace_0_2.instance.invoke(context, t_2057, q_2057, trans.const265);
          if(term == null)
            break Fail1707;
          p_2058 = term;
          term = t_2058;
          if(s_2056 == null)
            break Fail1707;
          term = s_2056;
          IStrategoTerm term1011 = term;
          Success990:
          { 
            Fail1721:
            { 
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail1721;
              if(true)
                break Success990;
            }
            term = term1011;
            IStrategoTerm term1012 = term;
            Success991:
            { 
              Fail1722:
              { 
                term = is_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail1722;
                if(true)
                  break Success991;
              }
              term = term1012;
              IStrategoTerm term1013 = term;
              Success992:
              { 
                Fail1723:
                { 
                  term = int_to_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail1723;
                  if(true)
                    break Success992;
                }
                term = term1013;
                IStrategoTerm term1014 = term;
                Success993:
                { 
                  Fail1724:
                  { 
                    term = real_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail1724;
                    if(true)
                      break Success993;
                  }
                  term = term1014;
                  IStrategoTerm u_2057 = null;
                  IStrategoTerm v_2057 = null;
                  IStrategoTerm x_2057 = null;
                  u_2057 = term;
                  term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                  if(term == null)
                    break Fail1707;
                  if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                    break Fail1707;
                  v_2057 = ((IStrategoList)term).tail();
                  x_2057 = v_2057;
                  term = report_failure_0_2.instance.invoke(context, x_2057, trans.const334, u_2057);
                  if(term == null)
                    break Fail1707;
                }
              }
            }
          }
          a_2058 = term;
          y_2057 = trans.const265;
          b_2058 = a_2058;
          term = string_replace_0_2.instance.invoke(context, b_2058, y_2057, trans.const265);
          if(term == null)
            break Fail1707;
          term = (IStrategoTerm)termFactory.makeListCons(n_2058, termFactory.makeListCons(trans.const265, termFactory.makeListCons(o_2058, termFactory.makeListCons(trans.const345, termFactory.makeListCons(p_2058, termFactory.makeListCons(trans.const364, termFactory.makeListCons(term, (IStrategoList)trans.constNil1)))))));
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1707;
          term = termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil1));
          if(true)
            break Success976;
        }
        term = term997;
        IStrategoTerm term1015 = term;
        IStrategoConstructor cons58 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
        Success994:
        { 
          if(cons58 == Main._consVarDeclInit_3)
          { 
            Fail1725:
            { 
              IStrategoTerm x_2054 = null;
              IStrategoTerm y_2054 = null;
              IStrategoTerm z_2054 = null;
              IStrategoTerm a_2056 = null;
              IStrategoTerm e_2055 = null;
              IStrategoTerm g_2055 = null;
              IStrategoTerm h_2055 = null;
              IStrategoTerm b_2056 = null;
              IStrategoTerm m_2055 = null;
              IStrategoTerm o_2055 = null;
              IStrategoTerm p_2055 = null;
              IStrategoTerm u_2055 = null;
              IStrategoTerm w_2055 = null;
              IStrategoTerm x_2055 = null;
              y_2054 = term.getSubterm(0);
              x_2054 = term.getSubterm(1);
              z_2054 = term.getSubterm(2);
              term = to_java_0_0.instance.invoke(context, x_2054);
              if(term == null)
                break Fail1725;
              IStrategoTerm term1016 = term;
              Success995:
              { 
                Fail1726:
                { 
                  term = concat_strings_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail1726;
                  if(true)
                    break Success995;
                }
                term = term1016;
                IStrategoTerm term1017 = term;
                Success996:
                { 
                  Fail1727:
                  { 
                    term = is_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail1727;
                    if(true)
                      break Success996;
                  }
                  term = term1017;
                  IStrategoTerm term1018 = term;
                  Success997:
                  { 
                    Fail1728:
                    { 
                      term = int_to_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail1728;
                      if(true)
                        break Success997;
                    }
                    term = term1018;
                    IStrategoTerm term1019 = term;
                    Success998:
                    { 
                      Fail1729:
                      { 
                        term = real_to_string_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail1729;
                        if(true)
                          break Success998;
                      }
                      term = term1019;
                      IStrategoTerm a_2055 = null;
                      IStrategoTerm b_2055 = null;
                      IStrategoTerm d_2055 = null;
                      a_2055 = term;
                      term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                      if(term == null)
                        break Fail1725;
                      if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                        break Fail1725;
                      b_2055 = ((IStrategoList)term).tail();
                      d_2055 = b_2055;
                      term = report_failure_0_2.instance.invoke(context, d_2055, trans.const334, a_2055);
                      if(term == null)
                        break Fail1725;
                    }
                  }
                }
              }
              g_2055 = term;
              e_2055 = trans.const265;
              h_2055 = g_2055;
              term = string_replace_0_2.instance.invoke(context, h_2055, e_2055, trans.const265);
              if(term == null)
                break Fail1725;
              a_2056 = term;
              term = y_2054;
              IStrategoTerm term1020 = term;
              Success999:
              { 
                Fail1730:
                { 
                  term = concat_strings_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail1730;
                  if(true)
                    break Success999;
                }
                term = term1020;
                IStrategoTerm term1021 = term;
                Success1000:
                { 
                  Fail1731:
                  { 
                    term = is_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail1731;
                    if(true)
                      break Success1000;
                  }
                  term = term1021;
                  IStrategoTerm term1022 = term;
                  Success1001:
                  { 
                    Fail1732:
                    { 
                      term = int_to_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail1732;
                      if(true)
                        break Success1001;
                    }
                    term = term1022;
                    IStrategoTerm term1023 = term;
                    Success1002:
                    { 
                      Fail1733:
                      { 
                        term = real_to_string_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail1733;
                        if(true)
                          break Success1002;
                      }
                      term = term1023;
                      IStrategoTerm i_2055 = null;
                      IStrategoTerm j_2055 = null;
                      IStrategoTerm l_2055 = null;
                      i_2055 = term;
                      term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                      if(term == null)
                        break Fail1725;
                      if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                        break Fail1725;
                      j_2055 = ((IStrategoList)term).tail();
                      l_2055 = j_2055;
                      term = report_failure_0_2.instance.invoke(context, l_2055, trans.const334, i_2055);
                      if(term == null)
                        break Fail1725;
                    }
                  }
                }
              }
              o_2055 = term;
              m_2055 = trans.const265;
              p_2055 = o_2055;
              term = string_replace_0_2.instance.invoke(context, p_2055, m_2055, trans.const358);
              if(term == null)
                break Fail1725;
              b_2056 = term;
              term = to_java_0_0.instance.invoke(context, z_2054);
              if(term == null)
                break Fail1725;
              IStrategoTerm term1024 = term;
              Success1003:
              { 
                Fail1734:
                { 
                  term = concat_strings_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail1734;
                  if(true)
                    break Success1003;
                }
                term = term1024;
                IStrategoTerm term1025 = term;
                Success1004:
                { 
                  Fail1735:
                  { 
                    term = is_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail1735;
                    if(true)
                      break Success1004;
                  }
                  term = term1025;
                  IStrategoTerm term1026 = term;
                  Success1005:
                  { 
                    Fail1736:
                    { 
                      term = int_to_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail1736;
                      if(true)
                        break Success1005;
                    }
                    term = term1026;
                    IStrategoTerm term1027 = term;
                    Success1006:
                    { 
                      Fail1737:
                      { 
                        term = real_to_string_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail1737;
                        if(true)
                          break Success1006;
                      }
                      term = term1027;
                      IStrategoTerm q_2055 = null;
                      IStrategoTerm r_2055 = null;
                      IStrategoTerm t_2055 = null;
                      q_2055 = term;
                      term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                      if(term == null)
                        break Fail1725;
                      if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                        break Fail1725;
                      r_2055 = ((IStrategoList)term).tail();
                      t_2055 = r_2055;
                      term = report_failure_0_2.instance.invoke(context, t_2055, trans.const334, q_2055);
                      if(term == null)
                        break Fail1725;
                    }
                  }
                }
              }
              w_2055 = term;
              u_2055 = trans.const265;
              x_2055 = w_2055;
              term = string_replace_0_2.instance.invoke(context, x_2055, u_2055, trans.const365);
              if(term == null)
                break Fail1725;
              term = (IStrategoTerm)termFactory.makeListCons(a_2056, termFactory.makeListCons(trans.const347, termFactory.makeListCons(b_2056, termFactory.makeListCons(trans.const345, termFactory.makeListCons(term, (IStrategoList)trans.constCons108)))));
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail1725;
              term = termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil1));
              if(true)
                break Success994;
            }
            term = term1015;
          }
          Success1007:
          { 
            if(cons58 == Main._consPrint_1)
            { 
              Fail1738:
              { 
                IStrategoTerm k_2054 = null;
                IStrategoTerm p_2054 = null;
                IStrategoTerm r_2054 = null;
                IStrategoTerm s_2054 = null;
                k_2054 = term.getSubterm(0);
                term = to_java_0_0.instance.invoke(context, k_2054);
                if(term == null)
                  break Fail1738;
                IStrategoTerm term1029 = term;
                Success1008:
                { 
                  Fail1739:
                  { 
                    term = concat_strings_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail1739;
                    if(true)
                      break Success1008;
                  }
                  term = term1029;
                  IStrategoTerm term1030 = term;
                  Success1009:
                  { 
                    Fail1740:
                    { 
                      term = is_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail1740;
                      if(true)
                        break Success1009;
                    }
                    term = term1030;
                    IStrategoTerm term1031 = term;
                    Success1010:
                    { 
                      Fail1741:
                      { 
                        term = int_to_string_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail1741;
                        if(true)
                          break Success1010;
                      }
                      term = term1031;
                      IStrategoTerm term1032 = term;
                      Success1011:
                      { 
                        Fail1742:
                        { 
                          term = real_to_string_0_0.instance.invoke(context, term);
                          if(term == null)
                            break Fail1742;
                          if(true)
                            break Success1011;
                        }
                        term = term1032;
                        IStrategoTerm l_2054 = null;
                        IStrategoTerm m_2054 = null;
                        IStrategoTerm o_2054 = null;
                        l_2054 = term;
                        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                        if(term == null)
                          break Fail1738;
                        if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                          break Fail1738;
                        m_2054 = ((IStrategoList)term).tail();
                        o_2054 = m_2054;
                        term = report_failure_0_2.instance.invoke(context, o_2054, trans.const334, l_2054);
                        if(term == null)
                          break Fail1738;
                      }
                    }
                  }
                }
                r_2054 = term;
                p_2054 = trans.const265;
                s_2054 = r_2054;
                term = string_replace_0_2.instance.invoke(context, s_2054, p_2054, trans.const336);
                if(term == null)
                  break Fail1738;
                term = (IStrategoTerm)termFactory.makeListCons(trans.const368, termFactory.makeListCons(term, (IStrategoList)trans.constCons109));
                term = concat_strings_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail1738;
                term = termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil1));
                if(true)
                  break Success1007;
              }
              term = term1015;
            }
            Success1012:
            { 
              if(cons58 == Main._consVar_1)
              { 
                Fail1743:
                { 
                  IStrategoTerm j_2054 = null;
                  j_2054 = term.getSubterm(0);
                  term = j_2054;
                  if(true)
                    break Success1012;
                }
                term = term1015;
              }
              Success1013:
              { 
                if(cons58 == Main._consPropAccess_2)
                { 
                  Fail1744:
                  { 
                    IStrategoTerm l_2053 = null;
                    IStrategoTerm m_2053 = null;
                    IStrategoTerm f_2054 = null;
                    IStrategoTerm r_2053 = null;
                    IStrategoTerm t_2053 = null;
                    IStrategoTerm u_2053 = null;
                    IStrategoTerm z_2053 = null;
                    IStrategoTerm b_2054 = null;
                    IStrategoTerm c_2054 = null;
                    l_2053 = term.getSubterm(0);
                    m_2053 = term.getSubterm(1);
                    term = to_java_0_0.instance.invoke(context, l_2053);
                    if(term == null)
                      break Fail1744;
                    IStrategoTerm term1035 = term;
                    Success1014:
                    { 
                      Fail1745:
                      { 
                        term = concat_strings_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail1745;
                        if(true)
                          break Success1014;
                      }
                      term = term1035;
                      IStrategoTerm term1036 = term;
                      Success1015:
                      { 
                        Fail1746:
                        { 
                          term = is_string_0_0.instance.invoke(context, term);
                          if(term == null)
                            break Fail1746;
                          if(true)
                            break Success1015;
                        }
                        term = term1036;
                        IStrategoTerm term1037 = term;
                        Success1016:
                        { 
                          Fail1747:
                          { 
                            term = int_to_string_0_0.instance.invoke(context, term);
                            if(term == null)
                              break Fail1747;
                            if(true)
                              break Success1016;
                          }
                          term = term1037;
                          IStrategoTerm term1038 = term;
                          Success1017:
                          { 
                            Fail1748:
                            { 
                              term = real_to_string_0_0.instance.invoke(context, term);
                              if(term == null)
                                break Fail1748;
                              if(true)
                                break Success1017;
                            }
                            term = term1038;
                            IStrategoTerm n_2053 = null;
                            IStrategoTerm o_2053 = null;
                            IStrategoTerm q_2053 = null;
                            n_2053 = term;
                            term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                            if(term == null)
                              break Fail1744;
                            if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                              break Fail1744;
                            o_2053 = ((IStrategoList)term).tail();
                            q_2053 = o_2053;
                            term = report_failure_0_2.instance.invoke(context, q_2053, trans.const334, n_2053);
                            if(term == null)
                              break Fail1744;
                          }
                        }
                      }
                    }
                    t_2053 = term;
                    r_2053 = trans.const265;
                    u_2053 = t_2053;
                    term = string_replace_0_2.instance.invoke(context, u_2053, r_2053, trans.const265);
                    if(term == null)
                      break Fail1744;
                    f_2054 = term;
                    term = m_2053;
                    IStrategoTerm term1039 = term;
                    Success1018:
                    { 
                      Fail1749:
                      { 
                        term = concat_strings_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail1749;
                        if(true)
                          break Success1018;
                      }
                      term = term1039;
                      IStrategoTerm term1040 = term;
                      Success1019:
                      { 
                        Fail1750:
                        { 
                          term = is_string_0_0.instance.invoke(context, term);
                          if(term == null)
                            break Fail1750;
                          if(true)
                            break Success1019;
                        }
                        term = term1040;
                        IStrategoTerm term1041 = term;
                        Success1020:
                        { 
                          Fail1751:
                          { 
                            term = int_to_string_0_0.instance.invoke(context, term);
                            if(term == null)
                              break Fail1751;
                            if(true)
                              break Success1020;
                          }
                          term = term1041;
                          IStrategoTerm term1042 = term;
                          Success1021:
                          { 
                            Fail1752:
                            { 
                              term = real_to_string_0_0.instance.invoke(context, term);
                              if(term == null)
                                break Fail1752;
                              if(true)
                                break Success1021;
                            }
                            term = term1042;
                            IStrategoTerm v_2053 = null;
                            IStrategoTerm w_2053 = null;
                            IStrategoTerm y_2053 = null;
                            v_2053 = term;
                            term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                            if(term == null)
                              break Fail1744;
                            if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                              break Fail1744;
                            w_2053 = ((IStrategoList)term).tail();
                            y_2053 = w_2053;
                            term = report_failure_0_2.instance.invoke(context, y_2053, trans.const334, v_2053);
                            if(term == null)
                              break Fail1744;
                          }
                        }
                      }
                    }
                    b_2054 = term;
                    z_2053 = trans.const265;
                    c_2054 = b_2054;
                    term = string_replace_0_2.instance.invoke(context, c_2054, z_2053, trans.const339);
                    if(term == null)
                      break Fail1744;
                    term = (IStrategoTerm)termFactory.makeListCons(f_2054, termFactory.makeListCons(trans.const369, termFactory.makeListCons(term, (IStrategoList)trans.constNil1)));
                    term = concat_strings_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail1744;
                    term = termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil1));
                    if(true)
                      break Success1013;
                  }
                  term = term1015;
                }
                Success1022:
                { 
                  if(cons58 == Main._consCall_2)
                  { 
                    Fail1753:
                    { 
                      IStrategoTerm n_2052 = null;
                      IStrategoTerm o_2052 = null;
                      IStrategoTerm h_2053 = null;
                      IStrategoTerm t_2052 = null;
                      IStrategoTerm v_2052 = null;
                      IStrategoTerm w_2052 = null;
                      IStrategoTerm b_2053 = null;
                      IStrategoTerm d_2053 = null;
                      IStrategoTerm e_2053 = null;
                      n_2052 = term.getSubterm(0);
                      o_2052 = term.getSubterm(1);
                      term = n_2052;
                      IStrategoTerm term1044 = term;
                      Success1023:
                      { 
                        Fail1754:
                        { 
                          term = concat_strings_0_0.instance.invoke(context, term);
                          if(term == null)
                            break Fail1754;
                          if(true)
                            break Success1023;
                        }
                        term = term1044;
                        IStrategoTerm term1045 = term;
                        Success1024:
                        { 
                          Fail1755:
                          { 
                            term = is_string_0_0.instance.invoke(context, term);
                            if(term == null)
                              break Fail1755;
                            if(true)
                              break Success1024;
                          }
                          term = term1045;
                          IStrategoTerm term1046 = term;
                          Success1025:
                          { 
                            Fail1756:
                            { 
                              term = int_to_string_0_0.instance.invoke(context, term);
                              if(term == null)
                                break Fail1756;
                              if(true)
                                break Success1025;
                            }
                            term = term1046;
                            IStrategoTerm term1047 = term;
                            Success1026:
                            { 
                              Fail1757:
                              { 
                                term = real_to_string_0_0.instance.invoke(context, term);
                                if(term == null)
                                  break Fail1757;
                                if(true)
                                  break Success1026;
                              }
                              term = term1047;
                              IStrategoTerm p_2052 = null;
                              IStrategoTerm q_2052 = null;
                              IStrategoTerm s_2052 = null;
                              p_2052 = term;
                              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                              if(term == null)
                                break Fail1753;
                              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                                break Fail1753;
                              q_2052 = ((IStrategoList)term).tail();
                              s_2052 = q_2052;
                              term = report_failure_0_2.instance.invoke(context, s_2052, trans.const334, p_2052);
                              if(term == null)
                                break Fail1753;
                            }
                          }
                        }
                      }
                      v_2052 = term;
                      t_2052 = trans.const265;
                      w_2052 = v_2052;
                      term = string_replace_0_2.instance.invoke(context, w_2052, t_2052, trans.const265);
                      if(term == null)
                        break Fail1753;
                      h_2053 = term;
                      term = map_1_0.instance.invoke(context, o_2052, to_java_0_0.instance);
                      if(term == null)
                        break Fail1753;
                      IStrategoTerm term1048 = term;
                      Success1027:
                      { 
                        Fail1758:
                        { 
                          term = concat_strings_0_0.instance.invoke(context, term);
                          if(term == null)
                            break Fail1758;
                          if(true)
                            break Success1027;
                        }
                        term = term1048;
                        IStrategoTerm term1049 = term;
                        Success1028:
                        { 
                          Fail1759:
                          { 
                            term = is_string_0_0.instance.invoke(context, term);
                            if(term == null)
                              break Fail1759;
                            if(true)
                              break Success1028;
                          }
                          term = term1049;
                          IStrategoTerm term1050 = term;
                          Success1029:
                          { 
                            Fail1760:
                            { 
                              term = int_to_string_0_0.instance.invoke(context, term);
                              if(term == null)
                                break Fail1760;
                              if(true)
                                break Success1029;
                            }
                            term = term1050;
                            IStrategoTerm term1051 = term;
                            Success1030:
                            { 
                              Fail1761:
                              { 
                                term = real_to_string_0_0.instance.invoke(context, term);
                                if(term == null)
                                  break Fail1761;
                                if(true)
                                  break Success1030;
                              }
                              term = term1051;
                              IStrategoTerm x_2052 = null;
                              IStrategoTerm y_2052 = null;
                              IStrategoTerm a_2053 = null;
                              x_2052 = term;
                              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                              if(term == null)
                                break Fail1753;
                              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                                break Fail1753;
                              y_2052 = ((IStrategoList)term).tail();
                              a_2053 = y_2052;
                              term = report_failure_0_2.instance.invoke(context, a_2053, trans.const334, x_2052);
                              if(term == null)
                                break Fail1753;
                            }
                          }
                        }
                      }
                      d_2053 = term;
                      b_2053 = trans.const265;
                      e_2053 = d_2053;
                      term = string_replace_0_2.instance.invoke(context, e_2053, b_2053, trans.const337);
                      if(term == null)
                        break Fail1753;
                      term = (IStrategoTerm)termFactory.makeListCons(h_2053, termFactory.makeListCons(trans.const348, termFactory.makeListCons(term, (IStrategoList)trans.constCons110)));
                      term = concat_strings_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail1753;
                      term = termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil1));
                      if(true)
                        break Success1022;
                    }
                    term = term1015;
                  }
                  Success1031:
                  { 
                    if(cons58 == Main._consStringLit_1)
                    { 
                      Fail1762:
                      { 
                        IStrategoTerm m_2052 = null;
                        m_2052 = term.getSubterm(0);
                        term = m_2052;
                        if(true)
                          break Success1031;
                      }
                      term = term1015;
                    }
                    Success1032:
                    { 
                      if(cons58 == Main._consIntLit_1)
                      { 
                        Fail1763:
                        { 
                          IStrategoTerm l_2052 = null;
                          l_2052 = term.getSubterm(0);
                          term = l_2052;
                          if(true)
                            break Success1032;
                        }
                        term = term1015;
                      }
                      Success1033:
                      { 
                        if(cons58 == Main._consType_1)
                        { 
                          Fail1764:
                          { 
                            IStrategoTerm k_2052 = null;
                            k_2052 = term.getSubterm(0);
                            term = k_2052;
                            if(true)
                              break Success1033;
                          }
                          term = term1015;
                        }
                        Success1034:
                        { 
                          if(cons58 == Main._consStringType_0)
                          { 
                            Fail1765:
                            { 
                              term = trans.const260;
                              if(true)
                                break Success1034;
                            }
                            term = term1015;
                          }
                          if(cons58 == Main._consIntType_0)
                          { 
                            term = trans.const371;
                          }
                          else
                          { 
                            break Fail1706;
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}