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

@SuppressWarnings("all") public class to_java_0_0 extends Strategy 
{ 
  public static to_java_0_0 instance = new to_java_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("to_java_0_0");
    Fail1766:
    { 
      IStrategoTerm term1056 = term;
      Success1035:
      { 
        Fail1767:
        { 
          if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
            break Fail1767;
          IStrategoTerm arg574 = ((IStrategoList)term).tail();
          if(arg574.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg574).isEmpty())
            break Fail1767;
          term = map_1_0.instance.invoke(context, term, to_java_0_0.instance);
          if(term == null)
            break Fail1767;
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1767;
          if(true)
            break Success1035;
        }
        term = term1056;
        IStrategoTerm term1057 = term;
        IStrategoConstructor cons59 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
        Success1036:
        { 
          if(cons59 == Main._consModule_3)
          { 
            Fail1768:
            { 
              IStrategoTerm p_2068 = null;
              IStrategoTerm q_2068 = null;
              IStrategoTerm r_2068 = null;
              IStrategoTerm s_2068 = null;
              IStrategoTerm t_2068 = null;
              IStrategoTerm v_2069 = null;
              IStrategoTerm y_2068 = null;
              IStrategoTerm a_2069 = null;
              IStrategoTerm b_2069 = null;
              IStrategoTerm w_2069 = null;
              IStrategoTerm g_2069 = null;
              IStrategoTerm i_2069 = null;
              IStrategoTerm j_2069 = null;
              IStrategoTerm o_2069 = null;
              IStrategoTerm q_2069 = null;
              IStrategoTerm r_2069 = null;
              p_2068 = term.getSubterm(0);
              s_2068 = term.getSubterm(1);
              q_2068 = term.getSubterm(2);
              term = map_1_0.instance.invoke(context, q_2068, to_java_0_0.instance);
              if(term == null)
                break Fail1768;
              r_2068 = term;
              term = map_1_0.instance.invoke(context, s_2068, to_java_0_0.instance);
              if(term == null)
                break Fail1768;
              t_2068 = term;
              term = p_2068;
              IStrategoTerm term1058 = term;
              Success1037:
              { 
                Fail1769:
                { 
                  term = concat_strings_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail1769;
                  if(true)
                    break Success1037;
                }
                term = term1058;
                IStrategoTerm term1059 = term;
                Success1038:
                { 
                  Fail1770:
                  { 
                    term = is_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail1770;
                    if(true)
                      break Success1038;
                  }
                  term = term1059;
                  IStrategoTerm term1060 = term;
                  Success1039:
                  { 
                    Fail1771:
                    { 
                      term = int_to_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail1771;
                      if(true)
                        break Success1039;
                    }
                    term = term1060;
                    IStrategoTerm term1061 = term;
                    Success1040:
                    { 
                      Fail1772:
                      { 
                        term = real_to_string_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail1772;
                        if(true)
                          break Success1040;
                      }
                      term = term1061;
                      IStrategoTerm u_2068 = null;
                      IStrategoTerm v_2068 = null;
                      IStrategoTerm x_2068 = null;
                      u_2068 = term;
                      term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                      if(term == null)
                        break Fail1768;
                      if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                        break Fail1768;
                      v_2068 = ((IStrategoList)term).tail();
                      x_2068 = v_2068;
                      term = report_failure_0_2.instance.invoke(context, x_2068, trans.const334, u_2068);
                      if(term == null)
                        break Fail1768;
                    }
                  }
                }
              }
              a_2069 = term;
              y_2068 = trans.const265;
              b_2069 = a_2069;
              term = string_replace_0_2.instance.invoke(context, b_2069, y_2068, trans.const335);
              if(term == null)
                break Fail1768;
              v_2069 = term;
              term = t_2068;
              IStrategoTerm term1062 = term;
              Success1041:
              { 
                Fail1773:
                { 
                  term = concat_strings_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail1773;
                  if(true)
                    break Success1041;
                }
                term = term1062;
                IStrategoTerm term1063 = term;
                Success1042:
                { 
                  Fail1774:
                  { 
                    term = is_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail1774;
                    if(true)
                      break Success1042;
                  }
                  term = term1063;
                  IStrategoTerm term1064 = term;
                  Success1043:
                  { 
                    Fail1775:
                    { 
                      term = int_to_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail1775;
                      if(true)
                        break Success1043;
                    }
                    term = term1064;
                    IStrategoTerm term1065 = term;
                    Success1044:
                    { 
                      Fail1776:
                      { 
                        term = real_to_string_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail1776;
                        if(true)
                          break Success1044;
                      }
                      term = term1065;
                      IStrategoTerm c_2069 = null;
                      IStrategoTerm d_2069 = null;
                      IStrategoTerm f_2069 = null;
                      c_2069 = term;
                      term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                      if(term == null)
                        break Fail1768;
                      if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                        break Fail1768;
                      d_2069 = ((IStrategoList)term).tail();
                      f_2069 = d_2069;
                      term = report_failure_0_2.instance.invoke(context, f_2069, trans.const334, c_2069);
                      if(term == null)
                        break Fail1768;
                    }
                  }
                }
              }
              i_2069 = term;
              g_2069 = trans.const265;
              j_2069 = i_2069;
              term = string_replace_0_2.instance.invoke(context, j_2069, g_2069, trans.const265);
              if(term == null)
                break Fail1768;
              w_2069 = term;
              term = r_2068;
              IStrategoTerm term1066 = term;
              Success1045:
              { 
                Fail1777:
                { 
                  term = concat_strings_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail1777;
                  if(true)
                    break Success1045;
                }
                term = term1066;
                IStrategoTerm term1067 = term;
                Success1046:
                { 
                  Fail1778:
                  { 
                    term = is_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail1778;
                    if(true)
                      break Success1046;
                  }
                  term = term1067;
                  IStrategoTerm term1068 = term;
                  Success1047:
                  { 
                    Fail1779:
                    { 
                      term = int_to_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail1779;
                      if(true)
                        break Success1047;
                    }
                    term = term1068;
                    IStrategoTerm term1069 = term;
                    Success1048:
                    { 
                      Fail1780:
                      { 
                        term = real_to_string_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail1780;
                        if(true)
                          break Success1048;
                      }
                      term = term1069;
                      IStrategoTerm k_2069 = null;
                      IStrategoTerm l_2069 = null;
                      IStrategoTerm n_2069 = null;
                      k_2069 = term;
                      term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                      if(term == null)
                        break Fail1768;
                      if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                        break Fail1768;
                      l_2069 = ((IStrategoList)term).tail();
                      n_2069 = l_2069;
                      term = report_failure_0_2.instance.invoke(context, n_2069, trans.const334, k_2069);
                      if(term == null)
                        break Fail1768;
                    }
                  }
                }
              }
              q_2069 = term;
              o_2069 = trans.const265;
              r_2069 = q_2069;
              term = string_replace_0_2.instance.invoke(context, r_2069, o_2069, trans.const265);
              if(term == null)
                break Fail1768;
              term = (IStrategoTerm)termFactory.makeListCons(trans.const372, termFactory.makeListCons(v_2069, termFactory.makeListCons(trans.const366, termFactory.makeListCons(w_2069, termFactory.makeListCons(trans.const265, termFactory.makeListCons(term, (IStrategoList)trans.constNil1))))));
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail1768;
              term = termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil1));
              if(true)
                break Success1036;
            }
            term = term1057;
          }
          Success1049:
          { 
            if(cons59 == Main._consAspect_2)
            { 
              Fail1781:
              { 
                term = trans.const309;
                if(true)
                  break Success1049;
              }
              term = term1057;
            }
            Success1050:
            { 
              if(cons59 == Main._consImport_1)
              { 
                Fail1782:
                { 
                  IStrategoTerm a_2068 = null;
                  IStrategoTerm b_2068 = null;
                  IStrategoTerm g_2068 = null;
                  IStrategoTerm i_2068 = null;
                  IStrategoTerm j_2068 = null;
                  a_2068 = term.getSubterm(0);
                  term = this.invoke(context, a_2068);
                  if(term == null)
                    break Fail1782;
                  b_2068 = term;
                  term = b_2068;
                  IStrategoTerm term1072 = term;
                  Success1051:
                  { 
                    Fail1783:
                    { 
                      term = concat_strings_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail1783;
                      if(true)
                        break Success1051;
                    }
                    term = term1072;
                    IStrategoTerm term1073 = term;
                    Success1052:
                    { 
                      Fail1784:
                      { 
                        term = is_string_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail1784;
                        if(true)
                          break Success1052;
                      }
                      term = term1073;
                      IStrategoTerm term1074 = term;
                      Success1053:
                      { 
                        Fail1785:
                        { 
                          term = int_to_string_0_0.instance.invoke(context, term);
                          if(term == null)
                            break Fail1785;
                          if(true)
                            break Success1053;
                        }
                        term = term1074;
                        IStrategoTerm term1075 = term;
                        Success1054:
                        { 
                          Fail1786:
                          { 
                            term = real_to_string_0_0.instance.invoke(context, term);
                            if(term == null)
                              break Fail1786;
                            if(true)
                              break Success1054;
                          }
                          term = term1075;
                          IStrategoTerm c_2068 = null;
                          IStrategoTerm d_2068 = null;
                          IStrategoTerm f_2068 = null;
                          c_2068 = term;
                          term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                          if(term == null)
                            break Fail1782;
                          if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                            break Fail1782;
                          d_2068 = ((IStrategoList)term).tail();
                          f_2068 = d_2068;
                          term = report_failure_0_2.instance.invoke(context, f_2068, trans.const334, c_2068);
                          if(term == null)
                            break Fail1782;
                        }
                      }
                    }
                  }
                  i_2068 = term;
                  g_2068 = trans.const265;
                  j_2068 = i_2068;
                  term = string_replace_0_2.instance.invoke(context, j_2068, g_2068, trans.const337);
                  if(term == null)
                    break Fail1782;
                  term = (IStrategoTerm)termFactory.makeListCons(trans.const373, termFactory.makeListCons(term, (IStrategoList)trans.constCons108));
                  term = concat_strings_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail1782;
                  term = termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil1));
                  if(true)
                    break Success1050;
                }
                term = term1057;
              }
              Success1055:
              { 
                if(cons59 == Main._consEntityImport_2)
                { 
                  Fail1787:
                  { 
                    IStrategoTerm c_2067 = null;
                    IStrategoTerm d_2067 = null;
                    IStrategoTerm w_2067 = null;
                    IStrategoTerm i_2067 = null;
                    IStrategoTerm k_2067 = null;
                    IStrategoTerm l_2067 = null;
                    IStrategoTerm q_2067 = null;
                    IStrategoTerm s_2067 = null;
                    IStrategoTerm t_2067 = null;
                    c_2067 = term.getSubterm(0);
                    d_2067 = term.getSubterm(1);
                    term = c_2067;
                    IStrategoTerm term1077 = term;
                    Success1056:
                    { 
                      Fail1788:
                      { 
                        term = concat_strings_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail1788;
                        if(true)
                          break Success1056;
                      }
                      term = term1077;
                      IStrategoTerm term1078 = term;
                      Success1057:
                      { 
                        Fail1789:
                        { 
                          term = is_string_0_0.instance.invoke(context, term);
                          if(term == null)
                            break Fail1789;
                          if(true)
                            break Success1057;
                        }
                        term = term1078;
                        IStrategoTerm term1079 = term;
                        Success1058:
                        { 
                          Fail1790:
                          { 
                            term = int_to_string_0_0.instance.invoke(context, term);
                            if(term == null)
                              break Fail1790;
                            if(true)
                              break Success1058;
                          }
                          term = term1079;
                          IStrategoTerm term1080 = term;
                          Success1059:
                          { 
                            Fail1791:
                            { 
                              term = real_to_string_0_0.instance.invoke(context, term);
                              if(term == null)
                                break Fail1791;
                              if(true)
                                break Success1059;
                            }
                            term = term1080;
                            IStrategoTerm e_2067 = null;
                            IStrategoTerm f_2067 = null;
                            IStrategoTerm h_2067 = null;
                            e_2067 = term;
                            term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                            if(term == null)
                              break Fail1787;
                            if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                              break Fail1787;
                            f_2067 = ((IStrategoList)term).tail();
                            h_2067 = f_2067;
                            term = report_failure_0_2.instance.invoke(context, h_2067, trans.const334, e_2067);
                            if(term == null)
                              break Fail1787;
                          }
                        }
                      }
                    }
                    k_2067 = term;
                    i_2067 = trans.const265;
                    l_2067 = k_2067;
                    term = string_replace_0_2.instance.invoke(context, l_2067, i_2067, trans.const265);
                    if(term == null)
                      break Fail1787;
                    w_2067 = term;
                    term = d_2067;
                    IStrategoTerm term1081 = term;
                    Success1060:
                    { 
                      Fail1792:
                      { 
                        term = concat_strings_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail1792;
                        if(true)
                          break Success1060;
                      }
                      term = term1081;
                      IStrategoTerm term1082 = term;
                      Success1061:
                      { 
                        Fail1793:
                        { 
                          term = is_string_0_0.instance.invoke(context, term);
                          if(term == null)
                            break Fail1793;
                          if(true)
                            break Success1061;
                        }
                        term = term1082;
                        IStrategoTerm term1083 = term;
                        Success1062:
                        { 
                          Fail1794:
                          { 
                            term = int_to_string_0_0.instance.invoke(context, term);
                            if(term == null)
                              break Fail1794;
                            if(true)
                              break Success1062;
                          }
                          term = term1083;
                          IStrategoTerm term1084 = term;
                          Success1063:
                          { 
                            Fail1795:
                            { 
                              term = real_to_string_0_0.instance.invoke(context, term);
                              if(term == null)
                                break Fail1795;
                              if(true)
                                break Success1063;
                            }
                            term = term1084;
                            IStrategoTerm m_2067 = null;
                            IStrategoTerm n_2067 = null;
                            IStrategoTerm p_2067 = null;
                            m_2067 = term;
                            term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                            if(term == null)
                              break Fail1787;
                            if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                              break Fail1787;
                            n_2067 = ((IStrategoList)term).tail();
                            p_2067 = n_2067;
                            term = report_failure_0_2.instance.invoke(context, p_2067, trans.const334, m_2067);
                            if(term == null)
                              break Fail1787;
                          }
                        }
                      }
                    }
                    s_2067 = term;
                    q_2067 = trans.const265;
                    t_2067 = s_2067;
                    term = string_replace_0_2.instance.invoke(context, t_2067, q_2067, trans.const374);
                    if(term == null)
                      break Fail1787;
                    term = (IStrategoTerm)termFactory.makeListCons(w_2067, termFactory.makeListCons(trans.const369, termFactory.makeListCons(term, (IStrategoList)trans.constNil1)));
                    term = concat_strings_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail1787;
                    term = termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil1));
                    if(true)
                      break Success1055;
                  }
                  term = term1057;
                }
                Success1064:
                { 
                  if(cons59 == Main._consWildcardImport_1)
                  { 
                    Fail1796:
                    { 
                      IStrategoTerm p_2066 = null;
                      IStrategoTerm u_2066 = null;
                      IStrategoTerm w_2066 = null;
                      IStrategoTerm x_2066 = null;
                      p_2066 = term.getSubterm(0);
                      term = p_2066;
                      IStrategoTerm term1086 = term;
                      Success1065:
                      { 
                        Fail1797:
                        { 
                          term = concat_strings_0_0.instance.invoke(context, term);
                          if(term == null)
                            break Fail1797;
                          if(true)
                            break Success1065;
                        }
                        term = term1086;
                        IStrategoTerm term1087 = term;
                        Success1066:
                        { 
                          Fail1798:
                          { 
                            term = is_string_0_0.instance.invoke(context, term);
                            if(term == null)
                              break Fail1798;
                            if(true)
                              break Success1066;
                          }
                          term = term1087;
                          IStrategoTerm term1088 = term;
                          Success1067:
                          { 
                            Fail1799:
                            { 
                              term = int_to_string_0_0.instance.invoke(context, term);
                              if(term == null)
                                break Fail1799;
                              if(true)
                                break Success1067;
                            }
                            term = term1088;
                            IStrategoTerm term1089 = term;
                            Success1068:
                            { 
                              Fail1800:
                              { 
                                term = real_to_string_0_0.instance.invoke(context, term);
                                if(term == null)
                                  break Fail1800;
                                if(true)
                                  break Success1068;
                              }
                              term = term1089;
                              IStrategoTerm q_2066 = null;
                              IStrategoTerm r_2066 = null;
                              IStrategoTerm t_2066 = null;
                              q_2066 = term;
                              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                              if(term == null)
                                break Fail1796;
                              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                                break Fail1796;
                              r_2066 = ((IStrategoList)term).tail();
                              t_2066 = r_2066;
                              term = report_failure_0_2.instance.invoke(context, t_2066, trans.const334, q_2066);
                              if(term == null)
                                break Fail1796;
                            }
                          }
                        }
                      }
                      w_2066 = term;
                      u_2066 = trans.const265;
                      x_2066 = w_2066;
                      term = string_replace_0_2.instance.invoke(context, x_2066, u_2066, trans.const265);
                      if(term == null)
                        break Fail1796;
                      term = (IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)trans.constCons111);
                      term = concat_strings_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail1796;
                      term = termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil1));
                      if(true)
                        break Success1064;
                    }
                    term = term1057;
                  }
                  Success1069:
                  { 
                    if(cons59 == Main._consEntity_2)
                    { 
                      Fail1801:
                      { 
                        IStrategoTerm r_2065 = null;
                        IStrategoTerm s_2065 = null;
                        IStrategoTerm l_2066 = null;
                        IStrategoTerm x_2065 = null;
                        IStrategoTerm z_2065 = null;
                        IStrategoTerm a_2066 = null;
                        IStrategoTerm f_2066 = null;
                        IStrategoTerm h_2066 = null;
                        IStrategoTerm i_2066 = null;
                        r_2065 = term.getSubterm(0);
                        s_2065 = term.getSubterm(1);
                        term = r_2065;
                        IStrategoTerm term1091 = term;
                        Success1070:
                        { 
                          Fail1802:
                          { 
                            term = concat_strings_0_0.instance.invoke(context, term);
                            if(term == null)
                              break Fail1802;
                            if(true)
                              break Success1070;
                          }
                          term = term1091;
                          IStrategoTerm term1092 = term;
                          Success1071:
                          { 
                            Fail1803:
                            { 
                              term = is_string_0_0.instance.invoke(context, term);
                              if(term == null)
                                break Fail1803;
                              if(true)
                                break Success1071;
                            }
                            term = term1092;
                            IStrategoTerm term1093 = term;
                            Success1072:
                            { 
                              Fail1804:
                              { 
                                term = int_to_string_0_0.instance.invoke(context, term);
                                if(term == null)
                                  break Fail1804;
                                if(true)
                                  break Success1072;
                              }
                              term = term1093;
                              IStrategoTerm term1094 = term;
                              Success1073:
                              { 
                                Fail1805:
                                { 
                                  term = real_to_string_0_0.instance.invoke(context, term);
                                  if(term == null)
                                    break Fail1805;
                                  if(true)
                                    break Success1073;
                                }
                                term = term1094;
                                IStrategoTerm t_2065 = null;
                                IStrategoTerm u_2065 = null;
                                IStrategoTerm w_2065 = null;
                                t_2065 = term;
                                term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                                if(term == null)
                                  break Fail1801;
                                if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                                  break Fail1801;
                                u_2065 = ((IStrategoList)term).tail();
                                w_2065 = u_2065;
                                term = report_failure_0_2.instance.invoke(context, w_2065, trans.const334, t_2065);
                                if(term == null)
                                  break Fail1801;
                              }
                            }
                          }
                        }
                        z_2065 = term;
                        x_2065 = trans.const265;
                        a_2066 = z_2065;
                        term = string_replace_0_2.instance.invoke(context, a_2066, x_2065, trans.const374);
                        if(term == null)
                          break Fail1801;
                        l_2066 = term;
                        term = map_1_0.instance.invoke(context, s_2065, to_java_0_0.instance);
                        if(term == null)
                          break Fail1801;
                        IStrategoTerm term1095 = term;
                        Success1074:
                        { 
                          Fail1806:
                          { 
                            term = concat_strings_0_0.instance.invoke(context, term);
                            if(term == null)
                              break Fail1806;
                            if(true)
                              break Success1074;
                          }
                          term = term1095;
                          IStrategoTerm term1096 = term;
                          Success1075:
                          { 
                            Fail1807:
                            { 
                              term = is_string_0_0.instance.invoke(context, term);
                              if(term == null)
                                break Fail1807;
                              if(true)
                                break Success1075;
                            }
                            term = term1096;
                            IStrategoTerm term1097 = term;
                            Success1076:
                            { 
                              Fail1808:
                              { 
                                term = int_to_string_0_0.instance.invoke(context, term);
                                if(term == null)
                                  break Fail1808;
                                if(true)
                                  break Success1076;
                              }
                              term = term1097;
                              IStrategoTerm term1098 = term;
                              Success1077:
                              { 
                                Fail1809:
                                { 
                                  term = real_to_string_0_0.instance.invoke(context, term);
                                  if(term == null)
                                    break Fail1809;
                                  if(true)
                                    break Success1077;
                                }
                                term = term1098;
                                IStrategoTerm b_2066 = null;
                                IStrategoTerm c_2066 = null;
                                IStrategoTerm e_2066 = null;
                                b_2066 = term;
                                term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                                if(term == null)
                                  break Fail1801;
                                if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                                  break Fail1801;
                                c_2066 = ((IStrategoList)term).tail();
                                e_2066 = c_2066;
                                term = report_failure_0_2.instance.invoke(context, e_2066, trans.const334, b_2066);
                                if(term == null)
                                  break Fail1801;
                              }
                            }
                          }
                        }
                        h_2066 = term;
                        f_2066 = trans.const265;
                        i_2066 = h_2066;
                        term = string_replace_0_2.instance.invoke(context, i_2066, f_2066, trans.const359);
                        if(term == null)
                          break Fail1801;
                        term = (IStrategoTerm)termFactory.makeListCons(trans.const378, termFactory.makeListCons(l_2066, termFactory.makeListCons(trans.const377, termFactory.makeListCons(term, (IStrategoList)trans.constCons112))));
                        term = concat_strings_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail1801;
                        term = termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil1));
                        if(true)
                          break Success1069;
                      }
                      term = term1057;
                    }
                    term = to_java_0_0_fragment_1.instance.invoke(context, term);
                    if(term == null)
                      break Fail1766;
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