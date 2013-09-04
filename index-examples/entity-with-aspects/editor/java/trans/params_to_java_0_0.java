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

@SuppressWarnings("all") public class params_to_java_0_0 extends Strategy 
{ 
  public static params_to_java_0_0 instance = new params_to_java_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("params_to_java_0_0");
    Fail1810:
    { 
      IStrategoTerm term1099 = term;
      Success1078:
      { 
        Fail1811:
        { 
          if(term.getTermType() != IStrategoTerm.LIST || !((IStrategoList)term).isEmpty())
            break Fail1811;
          term = trans.const309;
          if(true)
            break Success1078;
        }
        term = term1099;
        IStrategoTerm term1100 = term;
        Success1079:
        { 
          Fail1812:
          { 
            IStrategoTerm b_2071 = null;
            IStrategoTerm c_2071 = null;
            IStrategoTerm d_2071 = null;
            IStrategoTerm e_2072 = null;
            IStrategoTerm i_2071 = null;
            IStrategoTerm k_2071 = null;
            IStrategoTerm l_2071 = null;
            IStrategoTerm f_2072 = null;
            IStrategoTerm q_2071 = null;
            IStrategoTerm s_2071 = null;
            IStrategoTerm t_2071 = null;
            IStrategoTerm y_2071 = null;
            IStrategoTerm a_2072 = null;
            IStrategoTerm b_2072 = null;
            if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
              break Fail1812;
            IStrategoTerm arg586 = ((IStrategoList)term).head();
            if(arg586.getTermType() != IStrategoTerm.APPL || Main._consParam_2 != ((IStrategoAppl)arg586).getConstructor())
              break Fail1812;
            c_2071 = arg586.getSubterm(0);
            b_2071 = arg586.getSubterm(1);
            d_2071 = ((IStrategoList)term).tail();
            term = to_java_0_0.instance.invoke(context, b_2071);
            if(term == null)
              break Fail1812;
            IStrategoTerm term1101 = term;
            Success1080:
            { 
              Fail1813:
              { 
                term = concat_strings_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail1813;
                if(true)
                  break Success1080;
              }
              term = term1101;
              IStrategoTerm term1102 = term;
              Success1081:
              { 
                Fail1814:
                { 
                  term = is_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail1814;
                  if(true)
                    break Success1081;
                }
                term = term1102;
                IStrategoTerm term1103 = term;
                Success1082:
                { 
                  Fail1815:
                  { 
                    term = int_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail1815;
                    if(true)
                      break Success1082;
                  }
                  term = term1103;
                  IStrategoTerm term1104 = term;
                  Success1083:
                  { 
                    Fail1816:
                    { 
                      term = real_to_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail1816;
                      if(true)
                        break Success1083;
                    }
                    term = term1104;
                    IStrategoTerm e_2071 = null;
                    IStrategoTerm f_2071 = null;
                    IStrategoTerm h_2071 = null;
                    e_2071 = term;
                    term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                    if(term == null)
                      break Fail1812;
                    if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                      break Fail1812;
                    f_2071 = ((IStrategoList)term).tail();
                    h_2071 = f_2071;
                    term = report_failure_0_2.instance.invoke(context, h_2071, trans.const379, e_2071);
                    if(term == null)
                      break Fail1812;
                  }
                }
              }
            }
            k_2071 = term;
            i_2071 = trans.const265;
            l_2071 = k_2071;
            term = string_replace_0_2.instance.invoke(context, l_2071, i_2071, trans.const265);
            if(term == null)
              break Fail1812;
            e_2072 = term;
            term = c_2071;
            IStrategoTerm term1105 = term;
            Success1084:
            { 
              Fail1817:
              { 
                term = concat_strings_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail1817;
                if(true)
                  break Success1084;
              }
              term = term1105;
              IStrategoTerm term1106 = term;
              Success1085:
              { 
                Fail1818:
                { 
                  term = is_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail1818;
                  if(true)
                    break Success1085;
                }
                term = term1106;
                IStrategoTerm term1107 = term;
                Success1086:
                { 
                  Fail1819:
                  { 
                    term = int_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail1819;
                    if(true)
                      break Success1086;
                  }
                  term = term1107;
                  IStrategoTerm term1108 = term;
                  Success1087:
                  { 
                    Fail1820:
                    { 
                      term = real_to_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail1820;
                      if(true)
                        break Success1087;
                    }
                    term = term1108;
                    IStrategoTerm m_2071 = null;
                    IStrategoTerm n_2071 = null;
                    IStrategoTerm p_2071 = null;
                    m_2071 = term;
                    term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                    if(term == null)
                      break Fail1812;
                    if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                      break Fail1812;
                    n_2071 = ((IStrategoList)term).tail();
                    p_2071 = n_2071;
                    term = report_failure_0_2.instance.invoke(context, p_2071, trans.const379, m_2071);
                    if(term == null)
                      break Fail1812;
                  }
                }
              }
            }
            s_2071 = term;
            q_2071 = trans.const265;
            t_2071 = s_2071;
            term = string_replace_0_2.instance.invoke(context, t_2071, q_2071, trans.const358);
            if(term == null)
              break Fail1812;
            f_2072 = term;
            term = params_to_java2_0_0.instance.invoke(context, d_2071);
            if(term == null)
              break Fail1812;
            IStrategoTerm term1109 = term;
            Success1088:
            { 
              Fail1821:
              { 
                term = concat_strings_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail1821;
                if(true)
                  break Success1088;
              }
              term = term1109;
              IStrategoTerm term1110 = term;
              Success1089:
              { 
                Fail1822:
                { 
                  term = is_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail1822;
                  if(true)
                    break Success1089;
                }
                term = term1110;
                IStrategoTerm term1111 = term;
                Success1090:
                { 
                  Fail1823:
                  { 
                    term = int_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail1823;
                    if(true)
                      break Success1090;
                  }
                  term = term1111;
                  IStrategoTerm term1112 = term;
                  Success1091:
                  { 
                    Fail1824:
                    { 
                      term = real_to_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail1824;
                      if(true)
                        break Success1091;
                    }
                    term = term1112;
                    IStrategoTerm u_2071 = null;
                    IStrategoTerm v_2071 = null;
                    IStrategoTerm x_2071 = null;
                    u_2071 = term;
                    term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                    if(term == null)
                      break Fail1812;
                    if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                      break Fail1812;
                    v_2071 = ((IStrategoList)term).tail();
                    x_2071 = v_2071;
                    term = report_failure_0_2.instance.invoke(context, x_2071, trans.const379, u_2071);
                    if(term == null)
                      break Fail1812;
                  }
                }
              }
            }
            a_2072 = term;
            y_2071 = trans.const265;
            b_2072 = a_2072;
            term = string_replace_0_2.instance.invoke(context, b_2072, y_2071, trans.const340);
            if(term == null)
              break Fail1812;
            term = (IStrategoTerm)termFactory.makeListCons(e_2072, termFactory.makeListCons(trans.const347, termFactory.makeListCons(f_2072, termFactory.makeListCons(term, (IStrategoList)trans.constNil1))));
            term = concat_strings_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail1812;
            term = termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil1));
            if(true)
              break Success1079;
          }
          term = term1100;
          IStrategoTerm d_2070 = null;
          IStrategoTerm e_2070 = null;
          IStrategoTerm x_2070 = null;
          IStrategoTerm j_2070 = null;
          IStrategoTerm l_2070 = null;
          IStrategoTerm m_2070 = null;
          IStrategoTerm r_2070 = null;
          IStrategoTerm t_2070 = null;
          IStrategoTerm u_2070 = null;
          if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
            break Fail1810;
          IStrategoTerm arg590 = ((IStrategoList)term).head();
          if(arg590.getTermType() != IStrategoTerm.APPL || Main._consParam_2 != ((IStrategoAppl)arg590).getConstructor())
            break Fail1810;
          e_2070 = arg590.getSubterm(0);
          d_2070 = arg590.getSubterm(1);
          IStrategoTerm arg591 = ((IStrategoList)term).tail();
          if(arg591.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg591).isEmpty())
            break Fail1810;
          term = to_java_0_0.instance.invoke(context, d_2070);
          if(term == null)
            break Fail1810;
          IStrategoTerm term1113 = term;
          Success1092:
          { 
            Fail1825:
            { 
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail1825;
              if(true)
                break Success1092;
            }
            term = term1113;
            IStrategoTerm term1114 = term;
            Success1093:
            { 
              Fail1826:
              { 
                term = is_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail1826;
                if(true)
                  break Success1093;
              }
              term = term1114;
              IStrategoTerm term1115 = term;
              Success1094:
              { 
                Fail1827:
                { 
                  term = int_to_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail1827;
                  if(true)
                    break Success1094;
                }
                term = term1115;
                IStrategoTerm term1116 = term;
                Success1095:
                { 
                  Fail1828:
                  { 
                    term = real_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail1828;
                    if(true)
                      break Success1095;
                  }
                  term = term1116;
                  IStrategoTerm f_2070 = null;
                  IStrategoTerm g_2070 = null;
                  IStrategoTerm i_2070 = null;
                  f_2070 = term;
                  term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                  if(term == null)
                    break Fail1810;
                  if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                    break Fail1810;
                  g_2070 = ((IStrategoList)term).tail();
                  i_2070 = g_2070;
                  term = report_failure_0_2.instance.invoke(context, i_2070, trans.const379, f_2070);
                  if(term == null)
                    break Fail1810;
                }
              }
            }
          }
          l_2070 = term;
          j_2070 = trans.const265;
          m_2070 = l_2070;
          term = string_replace_0_2.instance.invoke(context, m_2070, j_2070, trans.const265);
          if(term == null)
            break Fail1810;
          x_2070 = term;
          term = e_2070;
          IStrategoTerm term1117 = term;
          Success1096:
          { 
            Fail1829:
            { 
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail1829;
              if(true)
                break Success1096;
            }
            term = term1117;
            IStrategoTerm term1118 = term;
            Success1097:
            { 
              Fail1830:
              { 
                term = is_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail1830;
                if(true)
                  break Success1097;
              }
              term = term1118;
              IStrategoTerm term1119 = term;
              Success1098:
              { 
                Fail1831:
                { 
                  term = int_to_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail1831;
                  if(true)
                    break Success1098;
                }
                term = term1119;
                IStrategoTerm term1120 = term;
                Success1099:
                { 
                  Fail1832:
                  { 
                    term = real_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail1832;
                    if(true)
                      break Success1099;
                  }
                  term = term1120;
                  IStrategoTerm n_2070 = null;
                  IStrategoTerm o_2070 = null;
                  IStrategoTerm q_2070 = null;
                  n_2070 = term;
                  term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                  if(term == null)
                    break Fail1810;
                  if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                    break Fail1810;
                  o_2070 = ((IStrategoList)term).tail();
                  q_2070 = o_2070;
                  term = report_failure_0_2.instance.invoke(context, q_2070, trans.const379, n_2070);
                  if(term == null)
                    break Fail1810;
                }
              }
            }
          }
          t_2070 = term;
          r_2070 = trans.const265;
          u_2070 = t_2070;
          term = string_replace_0_2.instance.invoke(context, u_2070, r_2070, trans.const358);
          if(term == null)
            break Fail1810;
          term = (IStrategoTerm)termFactory.makeListCons(x_2070, termFactory.makeListCons(trans.const347, termFactory.makeListCons(term, (IStrategoList)trans.constNil1)));
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1810;
          term = termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil1));
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