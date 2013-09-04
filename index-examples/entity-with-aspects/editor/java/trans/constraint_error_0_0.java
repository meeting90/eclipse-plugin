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

@SuppressWarnings("all") public class constraint_error_0_0 extends Strategy 
{ 
  public static constraint_error_0_0 instance = new constraint_error_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("constraint_error_0_0");
    Fail1886:
    { 
      IStrategoTerm term1166 = term;
      IStrategoConstructor cons61 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success1145:
      { 
        if(cons61 == Main._consAssign_2)
        { 
          Fail1887:
          { 
            IStrategoTerm s_2079 = null;
            IStrategoTerm t_2079 = null;
            IStrategoTerm u_2079 = null;
            IStrategoTerm v_2079 = null;
            IStrategoTerm w_2079 = null;
            IStrategoTerm q_2080 = null;
            IStrategoTerm b_2080 = null;
            IStrategoTerm d_2080 = null;
            IStrategoTerm e_2080 = null;
            IStrategoTerm j_2080 = null;
            IStrategoTerm l_2080 = null;
            IStrategoTerm m_2080 = null;
            s_2079 = term;
            t_2079 = term.getSubterm(0);
            u_2079 = term.getSubterm(1);
            term = type_of_0_0.instance.invoke(context, t_2079);
            if(term == null)
              break Fail1887;
            v_2079 = term;
            term = type_of_0_0.instance.invoke(context, u_2079);
            if(term == null)
              break Fail1887;
            w_2079 = term;
            IStrategoTerm term1167 = term;
            Success1146:
            { 
              Fail1888:
              { 
                IStrategoTerm u_2291 = null;
                IStrategoTerm v_2291 = null;
                v_2291 = v_2079;
                u_2291 = w_2079;
                term = termFactory.makeTuple(u_2291, v_2291);
                term = eq_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail1888;
                term = v_2291;
                { 
                  if(true)
                    break Fail1887;
                  if(true)
                    break Success1146;
                }
              }
              term = term1167;
            }
            term = print_type_0_0.instance.invoke(context, v_2079);
            if(term == null)
              break Fail1887;
            IStrategoTerm term1168 = term;
            Success1147:
            { 
              Fail1889:
              { 
                term = concat_strings_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail1889;
                if(true)
                  break Success1147;
              }
              term = term1168;
              IStrategoTerm term1169 = term;
              Success1148:
              { 
                Fail1890:
                { 
                  term = is_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail1890;
                  if(true)
                    break Success1148;
                }
                term = term1169;
                IStrategoTerm term1170 = term;
                Success1149:
                { 
                  Fail1891:
                  { 
                    term = int_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail1891;
                    if(true)
                      break Success1149;
                  }
                  term = term1170;
                  IStrategoTerm term1171 = term;
                  Success1150:
                  { 
                    Fail1892:
                    { 
                      term = real_to_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail1892;
                      if(true)
                        break Success1150;
                    }
                    term = term1171;
                    IStrategoTerm x_2079 = null;
                    IStrategoTerm y_2079 = null;
                    IStrategoTerm a_2080 = null;
                    x_2079 = term;
                    term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                    if(term == null)
                      break Fail1887;
                    if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                      break Fail1887;
                    y_2079 = ((IStrategoList)term).tail();
                    a_2080 = y_2079;
                    term = report_failure_0_2.instance.invoke(context, a_2080, trans.const387, x_2079);
                    if(term == null)
                      break Fail1887;
                  }
                }
              }
            }
            d_2080 = term;
            b_2080 = trans.const265;
            e_2080 = d_2080;
            term = string_replace_0_2.instance.invoke(context, e_2080, b_2080, trans.const342);
            if(term == null)
              break Fail1887;
            q_2080 = term;
            term = print_type_0_0.instance.invoke(context, w_2079);
            if(term == null)
              break Fail1887;
            IStrategoTerm term1172 = term;
            Success1151:
            { 
              Fail1893:
              { 
                term = concat_strings_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail1893;
                if(true)
                  break Success1151;
              }
              term = term1172;
              IStrategoTerm term1173 = term;
              Success1152:
              { 
                Fail1894:
                { 
                  term = is_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail1894;
                  if(true)
                    break Success1152;
                }
                term = term1173;
                IStrategoTerm term1174 = term;
                Success1153:
                { 
                  Fail1895:
                  { 
                    term = int_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail1895;
                    if(true)
                      break Success1153;
                  }
                  term = term1174;
                  IStrategoTerm term1175 = term;
                  Success1154:
                  { 
                    Fail1896:
                    { 
                      term = real_to_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail1896;
                      if(true)
                        break Success1154;
                    }
                    term = term1175;
                    IStrategoTerm f_2080 = null;
                    IStrategoTerm g_2080 = null;
                    IStrategoTerm i_2080 = null;
                    f_2080 = term;
                    term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                    if(term == null)
                      break Fail1887;
                    if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                      break Fail1887;
                    g_2080 = ((IStrategoList)term).tail();
                    i_2080 = g_2080;
                    term = report_failure_0_2.instance.invoke(context, i_2080, trans.const387, f_2080);
                    if(term == null)
                      break Fail1887;
                  }
                }
              }
            }
            l_2080 = term;
            j_2080 = trans.const265;
            m_2080 = l_2080;
            term = string_replace_0_2.instance.invoke(context, m_2080, j_2080, trans.const388);
            if(term == null)
              break Fail1887;
            term = (IStrategoTerm)termFactory.makeListCons(trans.const390, termFactory.makeListCons(q_2080, termFactory.makeListCons(trans.const389, termFactory.makeListCons(term, (IStrategoList)trans.constCons115))));
            term = concat_strings_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail1887;
            term = termFactory.makeTuple(s_2079, termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil1)));
            if(true)
              break Success1145;
          }
          term = term1166;
        }
        Success1155:
        { 
          if(cons61 == Main._consVarDeclInit_3)
          { 
            Fail1897:
            { 
              IStrategoTerm q_2078 = null;
              IStrategoTerm r_2078 = null;
              IStrategoTerm s_2078 = null;
              IStrategoTerm t_2078 = null;
              IStrategoTerm u_2078 = null;
              IStrategoTerm o_2079 = null;
              IStrategoTerm z_2078 = null;
              IStrategoTerm b_2079 = null;
              IStrategoTerm c_2079 = null;
              IStrategoTerm h_2079 = null;
              IStrategoTerm j_2079 = null;
              IStrategoTerm k_2079 = null;
              q_2078 = term;
              r_2078 = term.getSubterm(1);
              s_2078 = term.getSubterm(2);
              term = type_of_0_0.instance.invoke(context, r_2078);
              if(term == null)
                break Fail1897;
              t_2078 = term;
              term = type_of_0_0.instance.invoke(context, s_2078);
              if(term == null)
                break Fail1897;
              u_2078 = term;
              IStrategoTerm term1177 = term;
              Success1156:
              { 
                Fail1898:
                { 
                  term = termFactory.makeTuple(t_2078, u_2078);
                  term = is_assignable_to_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail1898;
                  { 
                    if(true)
                      break Fail1897;
                    if(true)
                      break Success1156;
                  }
                }
                term = term1177;
              }
              term = print_type_0_0.instance.invoke(context, t_2078);
              if(term == null)
                break Fail1897;
              IStrategoTerm term1178 = term;
              Success1157:
              { 
                Fail1899:
                { 
                  term = concat_strings_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail1899;
                  if(true)
                    break Success1157;
                }
                term = term1178;
                IStrategoTerm term1179 = term;
                Success1158:
                { 
                  Fail1900:
                  { 
                    term = is_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail1900;
                    if(true)
                      break Success1158;
                  }
                  term = term1179;
                  IStrategoTerm term1180 = term;
                  Success1159:
                  { 
                    Fail1901:
                    { 
                      term = int_to_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail1901;
                      if(true)
                        break Success1159;
                    }
                    term = term1180;
                    IStrategoTerm term1181 = term;
                    Success1160:
                    { 
                      Fail1902:
                      { 
                        term = real_to_string_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail1902;
                        if(true)
                          break Success1160;
                      }
                      term = term1181;
                      IStrategoTerm v_2078 = null;
                      IStrategoTerm w_2078 = null;
                      IStrategoTerm y_2078 = null;
                      v_2078 = term;
                      term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                      if(term == null)
                        break Fail1897;
                      if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                        break Fail1897;
                      w_2078 = ((IStrategoList)term).tail();
                      y_2078 = w_2078;
                      term = report_failure_0_2.instance.invoke(context, y_2078, trans.const387, v_2078);
                      if(term == null)
                        break Fail1897;
                    }
                  }
                }
              }
              b_2079 = term;
              z_2078 = trans.const265;
              c_2079 = b_2079;
              term = string_replace_0_2.instance.invoke(context, c_2079, z_2078, trans.const342);
              if(term == null)
                break Fail1897;
              o_2079 = term;
              term = print_type_0_0.instance.invoke(context, u_2078);
              if(term == null)
                break Fail1897;
              IStrategoTerm term1182 = term;
              Success1161:
              { 
                Fail1903:
                { 
                  term = concat_strings_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail1903;
                  if(true)
                    break Success1161;
                }
                term = term1182;
                IStrategoTerm term1183 = term;
                Success1162:
                { 
                  Fail1904:
                  { 
                    term = is_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail1904;
                    if(true)
                      break Success1162;
                  }
                  term = term1183;
                  IStrategoTerm term1184 = term;
                  Success1163:
                  { 
                    Fail1905:
                    { 
                      term = int_to_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail1905;
                      if(true)
                        break Success1163;
                    }
                    term = term1184;
                    IStrategoTerm term1185 = term;
                    Success1164:
                    { 
                      Fail1906:
                      { 
                        term = real_to_string_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail1906;
                        if(true)
                          break Success1164;
                      }
                      term = term1185;
                      IStrategoTerm d_2079 = null;
                      IStrategoTerm e_2079 = null;
                      IStrategoTerm g_2079 = null;
                      d_2079 = term;
                      term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                      if(term == null)
                        break Fail1897;
                      if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                        break Fail1897;
                      e_2079 = ((IStrategoList)term).tail();
                      g_2079 = e_2079;
                      term = report_failure_0_2.instance.invoke(context, g_2079, trans.const387, d_2079);
                      if(term == null)
                        break Fail1897;
                    }
                  }
                }
              }
              j_2079 = term;
              h_2079 = trans.const265;
              k_2079 = j_2079;
              term = string_replace_0_2.instance.invoke(context, k_2079, h_2079, trans.const388);
              if(term == null)
                break Fail1897;
              term = (IStrategoTerm)termFactory.makeListCons(trans.const390, termFactory.makeListCons(o_2079, termFactory.makeListCons(trans.const389, termFactory.makeListCons(term, (IStrategoList)trans.constCons115))));
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail1897;
              term = termFactory.makeTuple(q_2078, termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil1)));
              if(true)
                break Success1155;
            }
            term = term1166;
          }
          IStrategoTerm term1186 = term;
          Success1165:
          { 
            Fail1907:
            { 
              IStrategoTerm m_2078 = null;
              m_2078 = term;
              IStrategoList annos72 = term.getAnnotations();
              if(annos72.getTermType() != IStrategoTerm.LIST || ((IStrategoList)annos72).isEmpty())
                break Fail1907;
              IStrategoTerm arg618 = ((IStrategoList)annos72).head();
              if(arg618.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg618).isEmpty())
                break Fail1907;
              IStrategoTerm arg619 = ((IStrategoList)arg618).head();
              if(arg619.getTermType() != IStrategoTerm.APPL || Main._consUnresolved_1 != ((IStrategoAppl)arg619).getConstructor())
                break Fail1907;
              IStrategoTerm arg621 = ((IStrategoList)annos72).tail();
              if(arg621.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg621).isEmpty())
                break Fail1907;
              term = concat_strings_0_0.instance.invoke(context, trans.constCons116);
              if(term == null)
                break Fail1907;
              term = termFactory.makeTuple(m_2078, termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil1)));
              if(true)
                break Success1165;
            }
            term = term1186;
            IStrategoTerm d_2078 = null;
            IStrategoTerm e_2078 = null;
            IStrategoTerm f_2078 = null;
            d_2078 = term;
            term = nam_unique_0_0.instance.invoke(context, d_2078);
            if(term == null)
              break Fail1886;
            term = nam_get_definition_key_0_0.instance.invoke(context, d_2078);
            if(term == null)
              break Fail1886;
            e_2078 = term;
            term = index_lookup_all_scoped_noimports_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail1886;
            f_2078 = term;
            term = length_0_0.instance.invoke(context, f_2078);
            if(term == null)
              break Fail1886;
            term = termFactory.makeTuple(term, trans.const301);
            term = gt_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail1886;
            term = concat_strings_0_0.instance.invoke(context, trans.constCons117);
            if(term == null)
              break Fail1886;
            term = termFactory.makeTuple(e_2078, termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil1)));
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