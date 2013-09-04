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

@SuppressWarnings("all") public class to_java_0_0_fragment_1 extends Strategy 
{ 
  public static to_java_0_0_fragment_1 instance = new to_java_0_0_fragment_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("to_java_0_0_fragment_1");
    Fail1637:
    { 
      IStrategoTerm term929 = term;
      IStrategoConstructor cons57 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success908:
      { 
        if(cons57 == Main._consProperty_2)
        { 
          Fail1638:
          { 
            IStrategoTerm p_2061 = null;
            IStrategoTerm q_2061 = null;
            IStrategoTerm r_2061 = null;
            IStrategoTerm x_2064 = null;
            IStrategoTerm w_2061 = null;
            IStrategoTerm y_2061 = null;
            IStrategoTerm z_2061 = null;
            IStrategoTerm y_2064 = null;
            IStrategoTerm e_2062 = null;
            IStrategoTerm g_2062 = null;
            IStrategoTerm h_2062 = null;
            IStrategoTerm z_2064 = null;
            IStrategoTerm m_2062 = null;
            IStrategoTerm o_2062 = null;
            IStrategoTerm p_2062 = null;
            IStrategoTerm a_2065 = null;
            IStrategoTerm u_2062 = null;
            IStrategoTerm w_2062 = null;
            IStrategoTerm x_2062 = null;
            IStrategoTerm b_2065 = null;
            IStrategoTerm c_2063 = null;
            IStrategoTerm e_2063 = null;
            IStrategoTerm f_2063 = null;
            IStrategoTerm c_2065 = null;
            IStrategoTerm k_2063 = null;
            IStrategoTerm m_2063 = null;
            IStrategoTerm n_2063 = null;
            IStrategoTerm d_2065 = null;
            IStrategoTerm s_2063 = null;
            IStrategoTerm u_2063 = null;
            IStrategoTerm v_2063 = null;
            IStrategoTerm e_2065 = null;
            IStrategoTerm a_2064 = null;
            IStrategoTerm c_2064 = null;
            IStrategoTerm d_2064 = null;
            IStrategoTerm f_2065 = null;
            IStrategoTerm i_2064 = null;
            IStrategoTerm k_2064 = null;
            IStrategoTerm l_2064 = null;
            IStrategoTerm q_2064 = null;
            IStrategoTerm s_2064 = null;
            IStrategoTerm t_2064 = null;
            p_2061 = term.getSubterm(0);
            q_2061 = term.getSubterm(1);
            term = to_java_0_0.instance.invoke(context, q_2061);
            if(term == null)
              break Fail1638;
            r_2061 = term;
            term = r_2061;
            IStrategoTerm term930 = term;
            Success909:
            { 
              Fail1639:
              { 
                term = concat_strings_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail1639;
                if(true)
                  break Success909;
              }
              term = term930;
              IStrategoTerm term931 = term;
              Success910:
              { 
                Fail1640:
                { 
                  term = is_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail1640;
                  if(true)
                    break Success910;
                }
                term = term931;
                IStrategoTerm term932 = term;
                Success911:
                { 
                  Fail1641:
                  { 
                    term = int_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail1641;
                    if(true)
                      break Success911;
                  }
                  term = term932;
                  IStrategoTerm term933 = term;
                  Success912:
                  { 
                    Fail1642:
                    { 
                      term = real_to_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail1642;
                      if(true)
                        break Success912;
                    }
                    term = term933;
                    IStrategoTerm s_2061 = null;
                    IStrategoTerm t_2061 = null;
                    IStrategoTerm v_2061 = null;
                    s_2061 = term;
                    term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                    if(term == null)
                      break Fail1638;
                    if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                      break Fail1638;
                    t_2061 = ((IStrategoList)term).tail();
                    v_2061 = t_2061;
                    term = report_failure_0_2.instance.invoke(context, v_2061, trans.const334, s_2061);
                    if(term == null)
                      break Fail1638;
                  }
                }
              }
            }
            y_2061 = term;
            w_2061 = trans.const265;
            z_2061 = y_2061;
            term = string_replace_0_2.instance.invoke(context, z_2061, w_2061, trans.const335);
            if(term == null)
              break Fail1638;
            x_2064 = term;
            term = p_2061;
            IStrategoTerm term934 = term;
            Success913:
            { 
              Fail1643:
              { 
                term = concat_strings_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail1643;
                if(true)
                  break Success913;
              }
              term = term934;
              IStrategoTerm term935 = term;
              Success914:
              { 
                Fail1644:
                { 
                  term = is_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail1644;
                  if(true)
                    break Success914;
                }
                term = term935;
                IStrategoTerm term936 = term;
                Success915:
                { 
                  Fail1645:
                  { 
                    term = int_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail1645;
                    if(true)
                      break Success915;
                  }
                  term = term936;
                  IStrategoTerm term937 = term;
                  Success916:
                  { 
                    Fail1646:
                    { 
                      term = real_to_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail1646;
                      if(true)
                        break Success916;
                    }
                    term = term937;
                    IStrategoTerm a_2062 = null;
                    IStrategoTerm b_2062 = null;
                    IStrategoTerm d_2062 = null;
                    a_2062 = term;
                    term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                    if(term == null)
                      break Fail1638;
                    if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                      break Fail1638;
                    b_2062 = ((IStrategoList)term).tail();
                    d_2062 = b_2062;
                    term = report_failure_0_2.instance.invoke(context, d_2062, trans.const334, a_2062);
                    if(term == null)
                      break Fail1638;
                  }
                }
              }
            }
            g_2062 = term;
            e_2062 = trans.const265;
            h_2062 = g_2062;
            term = string_replace_0_2.instance.invoke(context, h_2062, e_2062, trans.const336);
            if(term == null)
              break Fail1638;
            y_2064 = term;
            term = r_2061;
            IStrategoTerm term938 = term;
            Success917:
            { 
              Fail1647:
              { 
                term = concat_strings_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail1647;
                if(true)
                  break Success917;
              }
              term = term938;
              IStrategoTerm term939 = term;
              Success918:
              { 
                Fail1648:
                { 
                  term = is_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail1648;
                  if(true)
                    break Success918;
                }
                term = term939;
                IStrategoTerm term940 = term;
                Success919:
                { 
                  Fail1649:
                  { 
                    term = int_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail1649;
                    if(true)
                      break Success919;
                  }
                  term = term940;
                  IStrategoTerm term941 = term;
                  Success920:
                  { 
                    Fail1650:
                    { 
                      term = real_to_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail1650;
                      if(true)
                        break Success920;
                    }
                    term = term941;
                    IStrategoTerm i_2062 = null;
                    IStrategoTerm j_2062 = null;
                    IStrategoTerm l_2062 = null;
                    i_2062 = term;
                    term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                    if(term == null)
                      break Fail1638;
                    if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                      break Fail1638;
                    j_2062 = ((IStrategoList)term).tail();
                    l_2062 = j_2062;
                    term = report_failure_0_2.instance.invoke(context, l_2062, trans.const334, i_2062);
                    if(term == null)
                      break Fail1638;
                  }
                }
              }
            }
            o_2062 = term;
            m_2062 = trans.const265;
            p_2062 = o_2062;
            term = string_replace_0_2.instance.invoke(context, p_2062, m_2062, trans.const337);
            if(term == null)
              break Fail1638;
            z_2064 = term;
            term = p_2061;
            IStrategoTerm term942 = term;
            Success921:
            { 
              Fail1651:
              { 
                term = concat_strings_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail1651;
                if(true)
                  break Success921;
              }
              term = term942;
              IStrategoTerm term943 = term;
              Success922:
              { 
                Fail1652:
                { 
                  term = is_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail1652;
                  if(true)
                    break Success922;
                }
                term = term943;
                IStrategoTerm term944 = term;
                Success923:
                { 
                  Fail1653:
                  { 
                    term = int_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail1653;
                    if(true)
                      break Success923;
                  }
                  term = term944;
                  IStrategoTerm term945 = term;
                  Success924:
                  { 
                    Fail1654:
                    { 
                      term = real_to_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail1654;
                      if(true)
                        break Success924;
                    }
                    term = term945;
                    IStrategoTerm q_2062 = null;
                    IStrategoTerm r_2062 = null;
                    IStrategoTerm t_2062 = null;
                    q_2062 = term;
                    term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                    if(term == null)
                      break Fail1638;
                    if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                      break Fail1638;
                    r_2062 = ((IStrategoList)term).tail();
                    t_2062 = r_2062;
                    term = report_failure_0_2.instance.invoke(context, t_2062, trans.const334, q_2062);
                    if(term == null)
                      break Fail1638;
                  }
                }
              }
            }
            w_2062 = term;
            u_2062 = trans.const265;
            x_2062 = w_2062;
            term = string_replace_0_2.instance.invoke(context, x_2062, u_2062, trans.const338);
            if(term == null)
              break Fail1638;
            a_2065 = term;
            term = p_2061;
            IStrategoTerm term946 = term;
            Success925:
            { 
              Fail1655:
              { 
                term = concat_strings_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail1655;
                if(true)
                  break Success925;
              }
              term = term946;
              IStrategoTerm term947 = term;
              Success926:
              { 
                Fail1656:
                { 
                  term = is_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail1656;
                  if(true)
                    break Success926;
                }
                term = term947;
                IStrategoTerm term948 = term;
                Success927:
                { 
                  Fail1657:
                  { 
                    term = int_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail1657;
                    if(true)
                      break Success927;
                  }
                  term = term948;
                  IStrategoTerm term949 = term;
                  Success928:
                  { 
                    Fail1658:
                    { 
                      term = real_to_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail1658;
                      if(true)
                        break Success928;
                    }
                    term = term949;
                    IStrategoTerm y_2062 = null;
                    IStrategoTerm z_2062 = null;
                    IStrategoTerm b_2063 = null;
                    y_2062 = term;
                    term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                    if(term == null)
                      break Fail1638;
                    if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                      break Fail1638;
                    z_2062 = ((IStrategoList)term).tail();
                    b_2063 = z_2062;
                    term = report_failure_0_2.instance.invoke(context, b_2063, trans.const334, y_2062);
                    if(term == null)
                      break Fail1638;
                  }
                }
              }
            }
            e_2063 = term;
            c_2063 = trans.const265;
            f_2063 = e_2063;
            term = string_replace_0_2.instance.invoke(context, f_2063, c_2063, trans.const332);
            if(term == null)
              break Fail1638;
            b_2065 = term;
            term = p_2061;
            IStrategoTerm term950 = term;
            Success929:
            { 
              Fail1659:
              { 
                term = concat_strings_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail1659;
                if(true)
                  break Success929;
              }
              term = term950;
              IStrategoTerm term951 = term;
              Success930:
              { 
                Fail1660:
                { 
                  term = is_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail1660;
                  if(true)
                    break Success930;
                }
                term = term951;
                IStrategoTerm term952 = term;
                Success931:
                { 
                  Fail1661:
                  { 
                    term = int_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail1661;
                    if(true)
                      break Success931;
                  }
                  term = term952;
                  IStrategoTerm term953 = term;
                  Success932:
                  { 
                    Fail1662:
                    { 
                      term = real_to_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail1662;
                      if(true)
                        break Success932;
                    }
                    term = term953;
                    IStrategoTerm g_2063 = null;
                    IStrategoTerm h_2063 = null;
                    IStrategoTerm j_2063 = null;
                    g_2063 = term;
                    term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                    if(term == null)
                      break Fail1638;
                    if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                      break Fail1638;
                    h_2063 = ((IStrategoList)term).tail();
                    j_2063 = h_2063;
                    term = report_failure_0_2.instance.invoke(context, j_2063, trans.const334, g_2063);
                    if(term == null)
                      break Fail1638;
                  }
                }
              }
            }
            m_2063 = term;
            k_2063 = trans.const265;
            n_2063 = m_2063;
            term = string_replace_0_2.instance.invoke(context, n_2063, k_2063, trans.const339);
            if(term == null)
              break Fail1638;
            c_2065 = term;
            term = r_2061;
            IStrategoTerm term954 = term;
            Success933:
            { 
              Fail1663:
              { 
                term = concat_strings_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail1663;
                if(true)
                  break Success933;
              }
              term = term954;
              IStrategoTerm term955 = term;
              Success934:
              { 
                Fail1664:
                { 
                  term = is_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail1664;
                  if(true)
                    break Success934;
                }
                term = term955;
                IStrategoTerm term956 = term;
                Success935:
                { 
                  Fail1665:
                  { 
                    term = int_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail1665;
                    if(true)
                      break Success935;
                  }
                  term = term956;
                  IStrategoTerm term957 = term;
                  Success936:
                  { 
                    Fail1666:
                    { 
                      term = real_to_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail1666;
                      if(true)
                        break Success936;
                    }
                    term = term957;
                    IStrategoTerm o_2063 = null;
                    IStrategoTerm p_2063 = null;
                    IStrategoTerm r_2063 = null;
                    o_2063 = term;
                    term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                    if(term == null)
                      break Fail1638;
                    if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                      break Fail1638;
                    p_2063 = ((IStrategoList)term).tail();
                    r_2063 = p_2063;
                    term = report_failure_0_2.instance.invoke(context, r_2063, trans.const334, o_2063);
                    if(term == null)
                      break Fail1638;
                  }
                }
              }
            }
            u_2063 = term;
            s_2063 = trans.const265;
            v_2063 = u_2063;
            term = string_replace_0_2.instance.invoke(context, v_2063, s_2063, trans.const340);
            if(term == null)
              break Fail1638;
            d_2065 = term;
            term = p_2061;
            IStrategoTerm term958 = term;
            Success937:
            { 
              Fail1667:
              { 
                term = concat_strings_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail1667;
                if(true)
                  break Success937;
              }
              term = term958;
              IStrategoTerm term959 = term;
              Success938:
              { 
                Fail1668:
                { 
                  term = is_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail1668;
                  if(true)
                    break Success938;
                }
                term = term959;
                IStrategoTerm term960 = term;
                Success939:
                { 
                  Fail1669:
                  { 
                    term = int_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail1669;
                    if(true)
                      break Success939;
                  }
                  term = term960;
                  IStrategoTerm term961 = term;
                  Success940:
                  { 
                    Fail1670:
                    { 
                      term = real_to_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail1670;
                      if(true)
                        break Success940;
                    }
                    term = term961;
                    IStrategoTerm w_2063 = null;
                    IStrategoTerm x_2063 = null;
                    IStrategoTerm z_2063 = null;
                    w_2063 = term;
                    term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                    if(term == null)
                      break Fail1638;
                    if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                      break Fail1638;
                    x_2063 = ((IStrategoList)term).tail();
                    z_2063 = x_2063;
                    term = report_failure_0_2.instance.invoke(context, z_2063, trans.const334, w_2063);
                    if(term == null)
                      break Fail1638;
                  }
                }
              }
            }
            c_2064 = term;
            a_2064 = trans.const265;
            d_2064 = c_2064;
            term = string_replace_0_2.instance.invoke(context, d_2064, a_2064, trans.const341);
            if(term == null)
              break Fail1638;
            e_2065 = term;
            term = p_2061;
            IStrategoTerm term962 = term;
            Success941:
            { 
              Fail1671:
              { 
                term = concat_strings_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail1671;
                if(true)
                  break Success941;
              }
              term = term962;
              IStrategoTerm term963 = term;
              Success942:
              { 
                Fail1672:
                { 
                  term = is_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail1672;
                  if(true)
                    break Success942;
                }
                term = term963;
                IStrategoTerm term964 = term;
                Success943:
                { 
                  Fail1673:
                  { 
                    term = int_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail1673;
                    if(true)
                      break Success943;
                  }
                  term = term964;
                  IStrategoTerm term965 = term;
                  Success944:
                  { 
                    Fail1674:
                    { 
                      term = real_to_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail1674;
                      if(true)
                        break Success944;
                    }
                    term = term965;
                    IStrategoTerm e_2064 = null;
                    IStrategoTerm f_2064 = null;
                    IStrategoTerm h_2064 = null;
                    e_2064 = term;
                    term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                    if(term == null)
                      break Fail1638;
                    if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                      break Fail1638;
                    f_2064 = ((IStrategoList)term).tail();
                    h_2064 = f_2064;
                    term = report_failure_0_2.instance.invoke(context, h_2064, trans.const334, e_2064);
                    if(term == null)
                      break Fail1638;
                  }
                }
              }
            }
            k_2064 = term;
            i_2064 = trans.const265;
            l_2064 = k_2064;
            term = string_replace_0_2.instance.invoke(context, l_2064, i_2064, trans.const342);
            if(term == null)
              break Fail1638;
            f_2065 = term;
            term = p_2061;
            IStrategoTerm term966 = term;
            Success945:
            { 
              Fail1675:
              { 
                term = concat_strings_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail1675;
                if(true)
                  break Success945;
              }
              term = term966;
              IStrategoTerm term967 = term;
              Success946:
              { 
                Fail1676:
                { 
                  term = is_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail1676;
                  if(true)
                    break Success946;
                }
                term = term967;
                IStrategoTerm term968 = term;
                Success947:
                { 
                  Fail1677:
                  { 
                    term = int_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail1677;
                    if(true)
                      break Success947;
                  }
                  term = term968;
                  IStrategoTerm term969 = term;
                  Success948:
                  { 
                    Fail1678:
                    { 
                      term = real_to_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail1678;
                      if(true)
                        break Success948;
                    }
                    term = term969;
                    IStrategoTerm m_2064 = null;
                    IStrategoTerm n_2064 = null;
                    IStrategoTerm p_2064 = null;
                    m_2064 = term;
                    term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                    if(term == null)
                      break Fail1638;
                    if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                      break Fail1638;
                    n_2064 = ((IStrategoList)term).tail();
                    p_2064 = n_2064;
                    term = report_failure_0_2.instance.invoke(context, p_2064, trans.const334, m_2064);
                    if(term == null)
                      break Fail1638;
                  }
                }
              }
            }
            s_2064 = term;
            q_2064 = trans.const265;
            t_2064 = s_2064;
            term = string_replace_0_2.instance.invoke(context, t_2064, q_2064, trans.const343);
            if(term == null)
              break Fail1638;
            term = (IStrategoTerm)termFactory.makeListCons(trans.const353, termFactory.makeListCons(x_2064, termFactory.makeListCons(trans.const347, termFactory.makeListCons(y_2064, termFactory.makeListCons(trans.const352, termFactory.makeListCons(z_2064, termFactory.makeListCons(trans.const351, termFactory.makeListCons(a_2065, termFactory.makeListCons(trans.const350, termFactory.makeListCons(b_2065, termFactory.makeListCons(trans.const349, termFactory.makeListCons(c_2065, termFactory.makeListCons(trans.const348, termFactory.makeListCons(d_2065, termFactory.makeListCons(trans.const347, termFactory.makeListCons(e_2065, termFactory.makeListCons(trans.const346, termFactory.makeListCons(f_2065, termFactory.makeListCons(trans.const345, termFactory.makeListCons(term, (IStrategoList)trans.constCons105))))))))))))))))))));
            term = concat_strings_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail1638;
            term = termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil1));
            if(true)
              break Success908;
          }
          term = term929;
        }
        Success949:
        { 
          if(cons57 == Main._consFunction_3)
          { 
            Fail1679:
            { 
              IStrategoTerm g_2060 = null;
              IStrategoTerm h_2060 = null;
              IStrategoTerm i_2060 = null;
              IStrategoTerm j_2061 = null;
              IStrategoTerm n_2060 = null;
              IStrategoTerm p_2060 = null;
              IStrategoTerm q_2060 = null;
              IStrategoTerm k_2061 = null;
              IStrategoTerm v_2060 = null;
              IStrategoTerm x_2060 = null;
              IStrategoTerm y_2060 = null;
              IStrategoTerm d_2061 = null;
              IStrategoTerm f_2061 = null;
              IStrategoTerm g_2061 = null;
              g_2060 = term.getSubterm(0);
              h_2060 = term.getSubterm(1);
              i_2060 = term.getSubterm(2);
              term = g_2060;
              IStrategoTerm term971 = term;
              Success950:
              { 
                Fail1680:
                { 
                  term = concat_strings_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail1680;
                  if(true)
                    break Success950;
                }
                term = term971;
                IStrategoTerm term972 = term;
                Success951:
                { 
                  Fail1681:
                  { 
                    term = is_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail1681;
                    if(true)
                      break Success951;
                  }
                  term = term972;
                  IStrategoTerm term973 = term;
                  Success952:
                  { 
                    Fail1682:
                    { 
                      term = int_to_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail1682;
                      if(true)
                        break Success952;
                    }
                    term = term973;
                    IStrategoTerm term974 = term;
                    Success953:
                    { 
                      Fail1683:
                      { 
                        term = real_to_string_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail1683;
                        if(true)
                          break Success953;
                      }
                      term = term974;
                      IStrategoTerm j_2060 = null;
                      IStrategoTerm k_2060 = null;
                      IStrategoTerm m_2060 = null;
                      j_2060 = term;
                      term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                      if(term == null)
                        break Fail1679;
                      if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                        break Fail1679;
                      k_2060 = ((IStrategoList)term).tail();
                      m_2060 = k_2060;
                      term = report_failure_0_2.instance.invoke(context, m_2060, trans.const334, j_2060);
                      if(term == null)
                        break Fail1679;
                    }
                  }
                }
              }
              p_2060 = term;
              n_2060 = trans.const265;
              q_2060 = p_2060;
              term = string_replace_0_2.instance.invoke(context, q_2060, n_2060, trans.const354);
              if(term == null)
                break Fail1679;
              j_2061 = term;
              term = params_to_java_0_0.instance.invoke(context, h_2060);
              if(term == null)
                break Fail1679;
              IStrategoTerm term975 = term;
              Success954:
              { 
                Fail1684:
                { 
                  term = concat_strings_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail1684;
                  if(true)
                    break Success954;
                }
                term = term975;
                IStrategoTerm term976 = term;
                Success955:
                { 
                  Fail1685:
                  { 
                    term = is_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail1685;
                    if(true)
                      break Success955;
                  }
                  term = term976;
                  IStrategoTerm term977 = term;
                  Success956:
                  { 
                    Fail1686:
                    { 
                      term = int_to_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail1686;
                      if(true)
                        break Success956;
                    }
                    term = term977;
                    IStrategoTerm term978 = term;
                    Success957:
                    { 
                      Fail1687:
                      { 
                        term = real_to_string_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail1687;
                        if(true)
                          break Success957;
                      }
                      term = term978;
                      IStrategoTerm r_2060 = null;
                      IStrategoTerm s_2060 = null;
                      IStrategoTerm u_2060 = null;
                      r_2060 = term;
                      term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                      if(term == null)
                        break Fail1679;
                      if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                        break Fail1679;
                      s_2060 = ((IStrategoList)term).tail();
                      u_2060 = s_2060;
                      term = report_failure_0_2.instance.invoke(context, u_2060, trans.const334, r_2060);
                      if(term == null)
                        break Fail1679;
                    }
                  }
                }
              }
              x_2060 = term;
              v_2060 = trans.const265;
              y_2060 = x_2060;
              term = string_replace_0_2.instance.invoke(context, y_2060, v_2060, trans.const336);
              if(term == null)
                break Fail1679;
              k_2061 = term;
              term = to_java_0_0.instance.invoke(context, i_2060);
              if(term == null)
                break Fail1679;
              IStrategoTerm term979 = term;
              Success958:
              { 
                Fail1688:
                { 
                  term = concat_strings_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail1688;
                  if(true)
                    break Success958;
                }
                term = term979;
                IStrategoTerm term980 = term;
                Success959:
                { 
                  Fail1689:
                  { 
                    term = is_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail1689;
                    if(true)
                      break Success959;
                  }
                  term = term980;
                  IStrategoTerm term981 = term;
                  Success960:
                  { 
                    Fail1690:
                    { 
                      term = int_to_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail1690;
                      if(true)
                        break Success960;
                    }
                    term = term981;
                    IStrategoTerm term982 = term;
                    Success961:
                    { 
                      Fail1691:
                      { 
                        term = real_to_string_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail1691;
                        if(true)
                          break Success961;
                      }
                      term = term982;
                      IStrategoTerm z_2060 = null;
                      IStrategoTerm a_2061 = null;
                      IStrategoTerm c_2061 = null;
                      z_2060 = term;
                      term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                      if(term == null)
                        break Fail1679;
                      if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                        break Fail1679;
                      a_2061 = ((IStrategoList)term).tail();
                      c_2061 = a_2061;
                      term = report_failure_0_2.instance.invoke(context, c_2061, trans.const334, z_2060);
                      if(term == null)
                        break Fail1679;
                    }
                  }
                }
              }
              f_2061 = term;
              d_2061 = trans.const265;
              g_2061 = f_2061;
              term = string_replace_0_2.instance.invoke(context, g_2061, d_2061, trans.const265);
              if(term == null)
                break Fail1679;
              term = (IStrategoTerm)termFactory.makeListCons(trans.const357, termFactory.makeListCons(j_2061, termFactory.makeListCons(trans.const348, termFactory.makeListCons(k_2061, termFactory.makeListCons(trans.const356, termFactory.makeListCons(term, (IStrategoList)trans.constCons106))))));
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail1679;
              term = termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil1));
              if(true)
                break Success949;
            }
            term = term929;
          }
          Success962:
          { 
            if(cons57 == Main._consParam_2)
            { 
              Fail1692:
              { 
                IStrategoTerm i_2059 = null;
                IStrategoTerm j_2059 = null;
                IStrategoTerm c_2060 = null;
                IStrategoTerm o_2059 = null;
                IStrategoTerm q_2059 = null;
                IStrategoTerm r_2059 = null;
                IStrategoTerm w_2059 = null;
                IStrategoTerm y_2059 = null;
                IStrategoTerm z_2059 = null;
                j_2059 = term.getSubterm(0);
                i_2059 = term.getSubterm(1);
                term = to_java_0_0.instance.invoke(context, i_2059);
                if(term == null)
                  break Fail1692;
                IStrategoTerm term984 = term;
                Success963:
                { 
                  Fail1693:
                  { 
                    term = concat_strings_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail1693;
                    if(true)
                      break Success963;
                  }
                  term = term984;
                  IStrategoTerm term985 = term;
                  Success964:
                  { 
                    Fail1694:
                    { 
                      term = is_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail1694;
                      if(true)
                        break Success964;
                    }
                    term = term985;
                    IStrategoTerm term986 = term;
                    Success965:
                    { 
                      Fail1695:
                      { 
                        term = int_to_string_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail1695;
                        if(true)
                          break Success965;
                      }
                      term = term986;
                      IStrategoTerm term987 = term;
                      Success966:
                      { 
                        Fail1696:
                        { 
                          term = real_to_string_0_0.instance.invoke(context, term);
                          if(term == null)
                            break Fail1696;
                          if(true)
                            break Success966;
                        }
                        term = term987;
                        IStrategoTerm k_2059 = null;
                        IStrategoTerm l_2059 = null;
                        IStrategoTerm n_2059 = null;
                        k_2059 = term;
                        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                        if(term == null)
                          break Fail1692;
                        if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                          break Fail1692;
                        l_2059 = ((IStrategoList)term).tail();
                        n_2059 = l_2059;
                        term = report_failure_0_2.instance.invoke(context, n_2059, trans.const334, k_2059);
                        if(term == null)
                          break Fail1692;
                      }
                    }
                  }
                }
                q_2059 = term;
                o_2059 = trans.const265;
                r_2059 = q_2059;
                term = string_replace_0_2.instance.invoke(context, r_2059, o_2059, trans.const265);
                if(term == null)
                  break Fail1692;
                c_2060 = term;
                term = j_2059;
                IStrategoTerm term988 = term;
                Success967:
                { 
                  Fail1697:
                  { 
                    term = concat_strings_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail1697;
                    if(true)
                      break Success967;
                  }
                  term = term988;
                  IStrategoTerm term989 = term;
                  Success968:
                  { 
                    Fail1698:
                    { 
                      term = is_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail1698;
                      if(true)
                        break Success968;
                    }
                    term = term989;
                    IStrategoTerm term990 = term;
                    Success969:
                    { 
                      Fail1699:
                      { 
                        term = int_to_string_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail1699;
                        if(true)
                          break Success969;
                      }
                      term = term990;
                      IStrategoTerm term991 = term;
                      Success970:
                      { 
                        Fail1700:
                        { 
                          term = real_to_string_0_0.instance.invoke(context, term);
                          if(term == null)
                            break Fail1700;
                          if(true)
                            break Success970;
                        }
                        term = term991;
                        IStrategoTerm s_2059 = null;
                        IStrategoTerm t_2059 = null;
                        IStrategoTerm v_2059 = null;
                        s_2059 = term;
                        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                        if(term == null)
                          break Fail1692;
                        if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                          break Fail1692;
                        t_2059 = ((IStrategoList)term).tail();
                        v_2059 = t_2059;
                        term = report_failure_0_2.instance.invoke(context, v_2059, trans.const334, s_2059);
                        if(term == null)
                          break Fail1692;
                      }
                    }
                  }
                }
                y_2059 = term;
                w_2059 = trans.const265;
                z_2059 = y_2059;
                term = string_replace_0_2.instance.invoke(context, z_2059, w_2059, trans.const358);
                if(term == null)
                  break Fail1692;
                term = (IStrategoTerm)termFactory.makeListCons(c_2060, termFactory.makeListCons(trans.const347, termFactory.makeListCons(term, (IStrategoList)trans.constNil1)));
                term = concat_strings_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail1692;
                term = termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil1));
                if(true)
                  break Success962;
              }
              term = term929;
            }
            Success971:
            { 
              if(cons57 == Main._consBlock_1)
              { 
                Fail1701:
                { 
                  IStrategoTerm v_2058 = null;
                  IStrategoTerm a_2059 = null;
                  IStrategoTerm c_2059 = null;
                  IStrategoTerm d_2059 = null;
                  v_2058 = term.getSubterm(0);
                  term = map_1_0.instance.invoke(context, v_2058, to_java_0_0.instance);
                  if(term == null)
                    break Fail1701;
                  IStrategoTerm term993 = term;
                  Success972:
                  { 
                    Fail1702:
                    { 
                      term = concat_strings_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail1702;
                      if(true)
                        break Success972;
                    }
                    term = term993;
                    IStrategoTerm term994 = term;
                    Success973:
                    { 
                      Fail1703:
                      { 
                        term = is_string_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail1703;
                        if(true)
                          break Success973;
                      }
                      term = term994;
                      IStrategoTerm term995 = term;
                      Success974:
                      { 
                        Fail1704:
                        { 
                          term = int_to_string_0_0.instance.invoke(context, term);
                          if(term == null)
                            break Fail1704;
                          if(true)
                            break Success974;
                        }
                        term = term995;
                        IStrategoTerm term996 = term;
                        Success975:
                        { 
                          Fail1705:
                          { 
                            term = real_to_string_0_0.instance.invoke(context, term);
                            if(term == null)
                              break Fail1705;
                            if(true)
                              break Success975;
                          }
                          term = term996;
                          IStrategoTerm w_2058 = null;
                          IStrategoTerm x_2058 = null;
                          IStrategoTerm z_2058 = null;
                          w_2058 = term;
                          term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                          if(term == null)
                            break Fail1701;
                          if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                            break Fail1701;
                          x_2058 = ((IStrategoList)term).tail();
                          z_2058 = x_2058;
                          term = report_failure_0_2.instance.invoke(context, z_2058, trans.const334, w_2058);
                          if(term == null)
                            break Fail1701;
                        }
                      }
                    }
                  }
                  c_2059 = term;
                  a_2059 = trans.const265;
                  d_2059 = c_2059;
                  term = string_replace_0_2.instance.invoke(context, d_2059, a_2059, trans.const359);
                  if(term == null)
                    break Fail1701;
                  term = (IStrategoTerm)termFactory.makeListCons(trans.const361, termFactory.makeListCons(term, (IStrategoList)trans.constCons107));
                  term = concat_strings_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail1701;
                  term = termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil1));
                  if(true)
                    break Success971;
                }
                term = term929;
              }
              term = to_java_0_0_fragment_0.instance.invoke(context, term);
              if(term == null)
                break Fail1637;
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