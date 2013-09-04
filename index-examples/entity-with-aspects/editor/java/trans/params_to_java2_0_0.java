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

@SuppressWarnings("all") public class params_to_java2_0_0 extends Strategy 
{ 
  public static params_to_java2_0_0 instance = new params_to_java2_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("params_to_java2_0_0");
    Fail1833:
    { 
      IStrategoTerm term1121 = term;
      Success1100:
      { 
        Fail1834:
        { 
          IStrategoTerm i_2073 = null;
          IStrategoTerm j_2073 = null;
          IStrategoTerm k_2073 = null;
          IStrategoTerm l_2074 = null;
          IStrategoTerm p_2073 = null;
          IStrategoTerm r_2073 = null;
          IStrategoTerm s_2073 = null;
          IStrategoTerm m_2074 = null;
          IStrategoTerm x_2073 = null;
          IStrategoTerm z_2073 = null;
          IStrategoTerm a_2074 = null;
          IStrategoTerm f_2074 = null;
          IStrategoTerm h_2074 = null;
          IStrategoTerm i_2074 = null;
          if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
            break Fail1834;
          IStrategoTerm arg594 = ((IStrategoList)term).head();
          if(arg594.getTermType() != IStrategoTerm.APPL || Main._consParam_2 != ((IStrategoAppl)arg594).getConstructor())
            break Fail1834;
          j_2073 = arg594.getSubterm(0);
          i_2073 = arg594.getSubterm(1);
          k_2073 = ((IStrategoList)term).tail();
          term = to_java_0_0.instance.invoke(context, i_2073);
          if(term == null)
            break Fail1834;
          IStrategoTerm term1122 = term;
          Success1101:
          { 
            Fail1835:
            { 
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail1835;
              if(true)
                break Success1101;
            }
            term = term1122;
            IStrategoTerm term1123 = term;
            Success1102:
            { 
              Fail1836:
              { 
                term = is_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail1836;
                if(true)
                  break Success1102;
              }
              term = term1123;
              IStrategoTerm term1124 = term;
              Success1103:
              { 
                Fail1837:
                { 
                  term = int_to_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail1837;
                  if(true)
                    break Success1103;
                }
                term = term1124;
                IStrategoTerm term1125 = term;
                Success1104:
                { 
                  Fail1838:
                  { 
                    term = real_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail1838;
                    if(true)
                      break Success1104;
                  }
                  term = term1125;
                  IStrategoTerm l_2073 = null;
                  IStrategoTerm m_2073 = null;
                  IStrategoTerm o_2073 = null;
                  l_2073 = term;
                  term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                  if(term == null)
                    break Fail1834;
                  if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                    break Fail1834;
                  m_2073 = ((IStrategoList)term).tail();
                  o_2073 = m_2073;
                  term = report_failure_0_2.instance.invoke(context, o_2073, trans.const380, l_2073);
                  if(term == null)
                    break Fail1834;
                }
              }
            }
          }
          r_2073 = term;
          p_2073 = trans.const265;
          s_2073 = r_2073;
          term = string_replace_0_2.instance.invoke(context, s_2073, p_2073, trans.const381);
          if(term == null)
            break Fail1834;
          l_2074 = term;
          term = j_2073;
          IStrategoTerm term1126 = term;
          Success1105:
          { 
            Fail1839:
            { 
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail1839;
              if(true)
                break Success1105;
            }
            term = term1126;
            IStrategoTerm term1127 = term;
            Success1106:
            { 
              Fail1840:
              { 
                term = is_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail1840;
                if(true)
                  break Success1106;
              }
              term = term1127;
              IStrategoTerm term1128 = term;
              Success1107:
              { 
                Fail1841:
                { 
                  term = int_to_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail1841;
                  if(true)
                    break Success1107;
                }
                term = term1128;
                IStrategoTerm term1129 = term;
                Success1108:
                { 
                  Fail1842:
                  { 
                    term = real_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail1842;
                    if(true)
                      break Success1108;
                  }
                  term = term1129;
                  IStrategoTerm t_2073 = null;
                  IStrategoTerm u_2073 = null;
                  IStrategoTerm w_2073 = null;
                  t_2073 = term;
                  term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                  if(term == null)
                    break Fail1834;
                  if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                    break Fail1834;
                  u_2073 = ((IStrategoList)term).tail();
                  w_2073 = u_2073;
                  term = report_failure_0_2.instance.invoke(context, w_2073, trans.const380, t_2073);
                  if(term == null)
                    break Fail1834;
                }
              }
            }
          }
          z_2073 = term;
          x_2073 = trans.const265;
          a_2074 = z_2073;
          term = string_replace_0_2.instance.invoke(context, a_2074, x_2073, trans.const336);
          if(term == null)
            break Fail1834;
          m_2074 = term;
          term = this.invoke(context, k_2073);
          if(term == null)
            break Fail1834;
          IStrategoTerm term1130 = term;
          Success1109:
          { 
            Fail1843:
            { 
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail1843;
              if(true)
                break Success1109;
            }
            term = term1130;
            IStrategoTerm term1131 = term;
            Success1110:
            { 
              Fail1844:
              { 
                term = is_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail1844;
                if(true)
                  break Success1110;
              }
              term = term1131;
              IStrategoTerm term1132 = term;
              Success1111:
              { 
                Fail1845:
                { 
                  term = int_to_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail1845;
                  if(true)
                    break Success1111;
                }
                term = term1132;
                IStrategoTerm term1133 = term;
                Success1112:
                { 
                  Fail1846:
                  { 
                    term = real_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail1846;
                    if(true)
                      break Success1112;
                  }
                  term = term1133;
                  IStrategoTerm b_2074 = null;
                  IStrategoTerm c_2074 = null;
                  IStrategoTerm e_2074 = null;
                  b_2074 = term;
                  term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                  if(term == null)
                    break Fail1834;
                  if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                    break Fail1834;
                  c_2074 = ((IStrategoList)term).tail();
                  e_2074 = c_2074;
                  term = report_failure_0_2.instance.invoke(context, e_2074, trans.const380, b_2074);
                  if(term == null)
                    break Fail1834;
                }
              }
            }
          }
          h_2074 = term;
          f_2074 = trans.const265;
          i_2074 = h_2074;
          term = string_replace_0_2.instance.invoke(context, i_2074, f_2074, trans.const382);
          if(term == null)
            break Fail1834;
          term = (IStrategoTerm)termFactory.makeListCons(trans.const383, termFactory.makeListCons(l_2074, termFactory.makeListCons(trans.const347, termFactory.makeListCons(m_2074, termFactory.makeListCons(term, (IStrategoList)trans.constNil1)))));
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1834;
          term = termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil1));
          if(true)
            break Success1100;
        }
        term = term1121;
        IStrategoTerm k_2072 = null;
        IStrategoTerm l_2072 = null;
        IStrategoTerm e_2073 = null;
        IStrategoTerm q_2072 = null;
        IStrategoTerm s_2072 = null;
        IStrategoTerm t_2072 = null;
        IStrategoTerm y_2072 = null;
        IStrategoTerm a_2073 = null;
        IStrategoTerm b_2073 = null;
        if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
          break Fail1833;
        IStrategoTerm arg598 = ((IStrategoList)term).head();
        if(arg598.getTermType() != IStrategoTerm.APPL || Main._consParam_2 != ((IStrategoAppl)arg598).getConstructor())
          break Fail1833;
        l_2072 = arg598.getSubterm(0);
        k_2072 = arg598.getSubterm(1);
        IStrategoTerm arg599 = ((IStrategoList)term).tail();
        if(arg599.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg599).isEmpty())
          break Fail1833;
        term = to_java_0_0.instance.invoke(context, k_2072);
        if(term == null)
          break Fail1833;
        IStrategoTerm term1134 = term;
        Success1113:
        { 
          Fail1847:
          { 
            term = concat_strings_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail1847;
            if(true)
              break Success1113;
          }
          term = term1134;
          IStrategoTerm term1135 = term;
          Success1114:
          { 
            Fail1848:
            { 
              term = is_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail1848;
              if(true)
                break Success1114;
            }
            term = term1135;
            IStrategoTerm term1136 = term;
            Success1115:
            { 
              Fail1849:
              { 
                term = int_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail1849;
                if(true)
                  break Success1115;
              }
              term = term1136;
              IStrategoTerm term1137 = term;
              Success1116:
              { 
                Fail1850:
                { 
                  term = real_to_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail1850;
                  if(true)
                    break Success1116;
                }
                term = term1137;
                IStrategoTerm m_2072 = null;
                IStrategoTerm n_2072 = null;
                IStrategoTerm p_2072 = null;
                m_2072 = term;
                term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                if(term == null)
                  break Fail1833;
                if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                  break Fail1833;
                n_2072 = ((IStrategoList)term).tail();
                p_2072 = n_2072;
                term = report_failure_0_2.instance.invoke(context, p_2072, trans.const380, m_2072);
                if(term == null)
                  break Fail1833;
              }
            }
          }
        }
        s_2072 = term;
        q_2072 = trans.const265;
        t_2072 = s_2072;
        term = string_replace_0_2.instance.invoke(context, t_2072, q_2072, trans.const381);
        if(term == null)
          break Fail1833;
        e_2073 = term;
        term = l_2072;
        IStrategoTerm term1138 = term;
        Success1117:
        { 
          Fail1851:
          { 
            term = concat_strings_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail1851;
            if(true)
              break Success1117;
          }
          term = term1138;
          IStrategoTerm term1139 = term;
          Success1118:
          { 
            Fail1852:
            { 
              term = is_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail1852;
              if(true)
                break Success1118;
            }
            term = term1139;
            IStrategoTerm term1140 = term;
            Success1119:
            { 
              Fail1853:
              { 
                term = int_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail1853;
                if(true)
                  break Success1119;
              }
              term = term1140;
              IStrategoTerm term1141 = term;
              Success1120:
              { 
                Fail1854:
                { 
                  term = real_to_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail1854;
                  if(true)
                    break Success1120;
                }
                term = term1141;
                IStrategoTerm u_2072 = null;
                IStrategoTerm v_2072 = null;
                IStrategoTerm x_2072 = null;
                u_2072 = term;
                term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                if(term == null)
                  break Fail1833;
                if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                  break Fail1833;
                v_2072 = ((IStrategoList)term).tail();
                x_2072 = v_2072;
                term = report_failure_0_2.instance.invoke(context, x_2072, trans.const380, u_2072);
                if(term == null)
                  break Fail1833;
              }
            }
          }
        }
        a_2073 = term;
        y_2072 = trans.const265;
        b_2073 = a_2073;
        term = string_replace_0_2.instance.invoke(context, b_2073, y_2072, trans.const336);
        if(term == null)
          break Fail1833;
        term = (IStrategoTerm)termFactory.makeListCons(trans.const383, termFactory.makeListCons(e_2073, termFactory.makeListCons(trans.const347, termFactory.makeListCons(term, (IStrategoList)trans.constNil1))));
        term = concat_strings_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail1833;
        term = termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil1));
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}