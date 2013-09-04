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

@SuppressWarnings("all") public class print_type_0_0 extends Strategy 
{ 
  public static print_type_0_0 instance = new print_type_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("print_type_0_0");
    Fail1862:
    { 
      TermReference a_2076 = new TermReference();
      IStrategoTerm b_2076 = null;
      IStrategoTerm c_2076 = null;
      IStrategoTerm d_2076 = null;
      IStrategoTerm e_2076 = null;
      IStrategoTerm f_2076 = null;
      f_2076 = term;
      e_2076 = term;
      term = f_2076;
      IStrategoTerm term1145 = term;
      Success1124:
      { 
        Fail1863:
        { 
          IStrategoTerm g_2076 = null;
          g_2076 = term;
          term = $Int$Type_0_0.instance.invoke(context, e_2076);
          if(term == null)
            break Fail1863;
          term = g_2076;
          { 
            term = trans.const261;
            if(true)
              break Success1124;
          }
        }
        term = term1145;
        IStrategoTerm term1146 = term;
        Success1125:
        { 
          Fail1864:
          { 
            IStrategoTerm h_2076 = null;
            h_2076 = term;
            term = $String$Type_0_0.instance.invoke(context, e_2076);
            if(term == null)
              break Fail1864;
            term = h_2076;
            { 
              term = trans.const260;
              if(true)
                break Success1125;
            }
          }
          term = term1146;
          IStrategoTerm term1147 = term;
          Success1126:
          { 
            Fail1865:
            { 
              IStrategoTerm i_2076 = null;
              i_2076 = term;
              term = e_2076;
              lifted370 lifted3700 = new lifted370();
              lifted3700.a_2076 = a_2076;
              term = $Type_1_0.instance.invoke(context, term, lifted3700);
              if(term == null)
                break Fail1865;
              term = i_2076;
              { 
                if(a_2076.value == null)
                  break Fail1862;
                term = strip_annos_0_0.instance.invoke(context, a_2076.value);
                if(term == null)
                  break Fail1862;
                if(true)
                  break Success1126;
              }
            }
            term = term1147;
            IStrategoTerm term1148 = term;
            Success1127:
            { 
              Fail1866:
              { 
                IStrategoTerm j_2076 = null;
                IStrategoTerm k_2076 = null;
                IStrategoTerm l_2076 = null;
                IStrategoTerm n_2076 = null;
                j_2076 = term;
                term = e_2076;
                if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                  break Fail1866;
                k_2076 = ((IStrategoList)term).head();
                l_2076 = ((IStrategoList)term).tail();
                b_2076 = k_2076;
                term = l_2076;
                if(term.getTermType() != IStrategoTerm.LIST || !((IStrategoList)term).isEmpty())
                  break Fail1866;
                n_2076 = term;
                IStrategoList list50;
                list50 = checkListTail(n_2076);
                if(list50 == null)
                  break Fail1866;
                term = j_2076;
                { 
                  term = this.invoke(context, b_2076);
                  if(term == null)
                    break Fail1862;
                  if(true)
                    break Success1127;
                }
              }
              term = term1148;
              IStrategoTerm term1149 = term;
              Success1128:
              { 
                Fail1867:
                { 
                  IStrategoTerm p_2076 = null;
                  IStrategoTerm q_2076 = null;
                  IStrategoTerm r_2076 = null;
                  IStrategoTerm s_2076 = null;
                  IStrategoTerm t_2076 = null;
                  IStrategoTerm u_2076 = null;
                  p_2076 = term;
                  term = e_2076;
                  if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                    break Fail1867;
                  q_2076 = ((IStrategoList)term).head();
                  r_2076 = ((IStrategoList)term).tail();
                  IStrategoList annos71 = term.getAnnotations();
                  u_2076 = annos71;
                  term = q_2076;
                  b_2076 = q_2076;
                  s_2076 = term;
                  term = r_2076;
                  c_2076 = r_2076;
                  t_2076 = term;
                  IStrategoList list51;
                  list51 = checkListTail(t_2076);
                  if(list51 == null)
                    break Fail1867;
                  term = termFactory.annotateTerm((IStrategoTerm)termFactory.makeListCons(s_2076, list51), checkListAnnos(termFactory, u_2076));
                  IStrategoTerm term1150 = term;
                  Success1129:
                  { 
                    Fail1868:
                    { 
                      term = c_2076;
                      if(term.getTermType() != IStrategoTerm.LIST || !((IStrategoList)term).isEmpty())
                        break Fail1868;
                      { 
                        if(true)
                          break Fail1867;
                        if(true)
                          break Success1129;
                      }
                    }
                    term = term1150;
                  }
                  term = p_2076;
                  { 
                    IStrategoTerm v_2077 = null;
                    IStrategoTerm z_2076 = null;
                    IStrategoTerm b_2077 = null;
                    IStrategoTerm c_2077 = null;
                    IStrategoTerm h_2077 = null;
                    IStrategoTerm j_2077 = null;
                    IStrategoTerm k_2077 = null;
                    term = this.invoke(context, b_2076);
                    if(term == null)
                      break Fail1862;
                    IStrategoTerm term1151 = term;
                    Success1130:
                    { 
                      Fail1869:
                      { 
                        term = concat_strings_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail1869;
                        if(true)
                          break Success1130;
                      }
                      term = term1151;
                      IStrategoTerm term1152 = term;
                      Success1131:
                      { 
                        Fail1870:
                        { 
                          term = is_string_0_0.instance.invoke(context, term);
                          if(term == null)
                            break Fail1870;
                          if(true)
                            break Success1131;
                        }
                        term = term1152;
                        IStrategoTerm term1153 = term;
                        Success1132:
                        { 
                          Fail1871:
                          { 
                            term = int_to_string_0_0.instance.invoke(context, term);
                            if(term == null)
                              break Fail1871;
                            if(true)
                              break Success1132;
                          }
                          term = term1153;
                          IStrategoTerm term1154 = term;
                          Success1133:
                          { 
                            Fail1872:
                            { 
                              term = real_to_string_0_0.instance.invoke(context, term);
                              if(term == null)
                                break Fail1872;
                              if(true)
                                break Success1133;
                            }
                            term = term1154;
                            IStrategoTerm v_2076 = null;
                            IStrategoTerm w_2076 = null;
                            IStrategoTerm y_2076 = null;
                            v_2076 = term;
                            term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                            if(term == null)
                              break Fail1862;
                            if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                              break Fail1862;
                            w_2076 = ((IStrategoList)term).tail();
                            y_2076 = w_2076;
                            term = report_failure_0_2.instance.invoke(context, y_2076, trans.const385, v_2076);
                            if(term == null)
                              break Fail1862;
                          }
                        }
                      }
                    }
                    b_2077 = term;
                    z_2076 = trans.const265;
                    c_2077 = b_2077;
                    term = string_replace_0_2.instance.invoke(context, c_2077, z_2076, trans.const265);
                    if(term == null)
                      break Fail1862;
                    v_2077 = term;
                    term = this.invoke(context, c_2076);
                    if(term == null)
                      break Fail1862;
                    IStrategoTerm term1155 = term;
                    Success1134:
                    { 
                      Fail1873:
                      { 
                        term = concat_strings_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail1873;
                        if(true)
                          break Success1134;
                      }
                      term = term1155;
                      IStrategoTerm term1156 = term;
                      Success1135:
                      { 
                        Fail1874:
                        { 
                          term = is_string_0_0.instance.invoke(context, term);
                          if(term == null)
                            break Fail1874;
                          if(true)
                            break Success1135;
                        }
                        term = term1156;
                        IStrategoTerm term1157 = term;
                        Success1136:
                        { 
                          Fail1875:
                          { 
                            term = int_to_string_0_0.instance.invoke(context, term);
                            if(term == null)
                              break Fail1875;
                            if(true)
                              break Success1136;
                          }
                          term = term1157;
                          IStrategoTerm term1158 = term;
                          Success1137:
                          { 
                            Fail1876:
                            { 
                              term = real_to_string_0_0.instance.invoke(context, term);
                              if(term == null)
                                break Fail1876;
                              if(true)
                                break Success1137;
                            }
                            term = term1158;
                            IStrategoTerm d_2077 = null;
                            IStrategoTerm e_2077 = null;
                            IStrategoTerm g_2077 = null;
                            d_2077 = term;
                            term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                            if(term == null)
                              break Fail1862;
                            if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                              break Fail1862;
                            e_2077 = ((IStrategoList)term).tail();
                            g_2077 = e_2077;
                            term = report_failure_0_2.instance.invoke(context, g_2077, trans.const385, d_2077);
                            if(term == null)
                              break Fail1862;
                          }
                        }
                      }
                    }
                    j_2077 = term;
                    h_2077 = trans.const265;
                    k_2077 = j_2077;
                    term = string_replace_0_2.instance.invoke(context, k_2077, h_2077, trans.const386);
                    if(term == null)
                      break Fail1862;
                    term = (IStrategoTerm)termFactory.makeListCons(v_2077, termFactory.makeListCons(trans.const383, termFactory.makeListCons(term, (IStrategoList)trans.constNil1)));
                    term = concat_strings_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail1862;
                    term = termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil1));
                    if(true)
                      break Success1128;
                  }
                }
                term = term1149;
                IStrategoTerm p_2077 = null;
                IStrategoTerm r_2077 = null;
                IStrategoTerm s_2077 = null;
                IStrategoTerm cons36 = context.invokePrimitive("SSL_get_constructor", term, NO_STRATEGIES, new IStrategoTerm[]{term});
                d_2076 = cons36;
                term = d_2076;
                IStrategoTerm term1159 = term;
                Success1138:
                { 
                  Fail1877:
                  { 
                    term = concat_strings_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail1877;
                    if(true)
                      break Success1138;
                  }
                  term = term1159;
                  IStrategoTerm term1160 = term;
                  Success1139:
                  { 
                    Fail1878:
                    { 
                      term = is_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail1878;
                      if(true)
                        break Success1139;
                    }
                    term = term1160;
                    IStrategoTerm term1161 = term;
                    Success1140:
                    { 
                      Fail1879:
                      { 
                        term = int_to_string_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail1879;
                        if(true)
                          break Success1140;
                      }
                      term = term1161;
                      IStrategoTerm term1162 = term;
                      Success1141:
                      { 
                        Fail1880:
                        { 
                          term = real_to_string_0_0.instance.invoke(context, term);
                          if(term == null)
                            break Fail1880;
                          if(true)
                            break Success1141;
                        }
                        term = term1162;
                        IStrategoTerm l_2077 = null;
                        IStrategoTerm m_2077 = null;
                        IStrategoTerm o_2077 = null;
                        l_2077 = term;
                        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                        if(term == null)
                          break Fail1862;
                        if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                          break Fail1862;
                        m_2077 = ((IStrategoList)term).tail();
                        o_2077 = m_2077;
                        term = report_failure_0_2.instance.invoke(context, o_2077, trans.const385, l_2077);
                        if(term == null)
                          break Fail1862;
                      }
                    }
                  }
                }
                r_2077 = term;
                p_2077 = trans.const265;
                s_2077 = r_2077;
                term = string_replace_0_2.instance.invoke(context, s_2077, p_2077, trans.const265);
                if(term == null)
                  break Fail1862;
                term = (IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)trans.constNil1);
                term = concat_strings_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail1862;
                term = termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil1));
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