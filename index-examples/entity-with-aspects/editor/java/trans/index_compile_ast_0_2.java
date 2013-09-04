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

@SuppressWarnings("all") public class index_compile_ast_0_2 extends Strategy 
{ 
  public static index_compile_ast_0_2 instance = new index_compile_ast_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm z_2195, IStrategoTerm a_2196)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("index_compile_ast_0_2");
    Fail1622:
    { 
      IStrategoTerm l_2050 = null;
      IStrategoTerm m_2050 = null;
      IStrategoTerm n_2050 = null;
      IStrategoTerm o_2050 = null;
      TermReference p_2050 = new TermReference();
      IStrategoTerm q_2050 = null;
      IStrategoTerm r_2050 = null;
      l_2050 = term;
      IStrategoTerm term915 = term;
      Success894:
      { 
        Fail1623:
        { 
          IStrategoTerm term916 = term;
          Success895:
          { 
            Fail1624:
            { 
              IStrategoTerm s_2050 = null;
              s_2050 = term;
              term = index_uri_name_0_0.instance.invoke(context, a_2196);
              if(term == null)
                break Fail1624;
              m_2050 = term;
              term = s_2050;
              { 
                IStrategoTerm v_2051 = null;
                IStrategoTerm x_2050 = null;
                IStrategoTerm z_2050 = null;
                IStrategoTerm a_2051 = null;
                IStrategoTerm c_2052 = null;
                IStrategoTerm f_2051 = null;
                IStrategoTerm h_2051 = null;
                IStrategoTerm i_2051 = null;
                IStrategoTerm n_2051 = null;
                IStrategoTerm p_2051 = null;
                IStrategoTerm q_2051 = null;
                term = to_java_0_0.instance.invoke(context, l_2050);
                if(term == null)
                  break Fail1623;
                q_2050 = term;
                term = dirname_0_0.instance.invoke(context, z_2195);
                if(term == null)
                  break Fail1623;
                n_2050 = term;
                v_2051 = m_2050;
                term = guarantee_extension_0_1.instance.invoke(context, v_2051, trans.const329);
                if(term == null)
                  break Fail1623;
                o_2050 = term;
                term = n_2050;
                IStrategoTerm term917 = term;
                Success896:
                { 
                  Fail1625:
                  { 
                    term = concat_strings_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail1625;
                    if(true)
                      break Success896;
                  }
                  term = term917;
                  IStrategoTerm term918 = term;
                  Success897:
                  { 
                    Fail1626:
                    { 
                      term = is_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail1626;
                      if(true)
                        break Success897;
                    }
                    term = term918;
                    IStrategoTerm term919 = term;
                    Success898:
                    { 
                      Fail1627:
                      { 
                        term = int_to_string_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail1627;
                        if(true)
                          break Success898;
                      }
                      term = term919;
                      IStrategoTerm term920 = term;
                      Success899:
                      { 
                        Fail1628:
                        { 
                          term = real_to_string_0_0.instance.invoke(context, term);
                          if(term == null)
                            break Fail1628;
                          if(true)
                            break Success899;
                        }
                        term = term920;
                        IStrategoTerm t_2050 = null;
                        IStrategoTerm u_2050 = null;
                        IStrategoTerm w_2050 = null;
                        t_2050 = term;
                        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                        if(term == null)
                          break Fail1623;
                        if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                          break Fail1623;
                        u_2050 = ((IStrategoList)term).tail();
                        w_2050 = u_2050;
                        term = report_failure_0_2.instance.invoke(context, w_2050, trans.const330, t_2050);
                        if(term == null)
                          break Fail1623;
                      }
                    }
                  }
                }
                z_2050 = term;
                x_2050 = trans.const265;
                a_2051 = z_2050;
                term = string_replace_0_2.instance.invoke(context, a_2051, x_2050, trans.const265);
                if(term == null)
                  break Fail1623;
                term = (IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)trans.constCons104);
                term = concat_strings_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail1623;
                term = termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil1));
                if(p_2050.value == null)
                  p_2050.value = term;
                else
                  if(p_2050.value != term && !p_2050.value.match(term))
                    break Fail1623;
                if(p_2050.value == null)
                  break Fail1623;
                term = p_2050.value;
                IStrategoTerm term921 = term;
                Success900:
                { 
                  Fail1629:
                  { 
                    term = concat_strings_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail1629;
                    if(true)
                      break Success900;
                  }
                  term = term921;
                  IStrategoTerm term922 = term;
                  Success901:
                  { 
                    Fail1630:
                    { 
                      term = is_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail1630;
                      if(true)
                        break Success901;
                    }
                    term = term922;
                    IStrategoTerm term923 = term;
                    Success902:
                    { 
                      Fail1631:
                      { 
                        term = int_to_string_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail1631;
                        if(true)
                          break Success902;
                      }
                      term = term923;
                      IStrategoTerm term924 = term;
                      Success903:
                      { 
                        Fail1632:
                        { 
                          term = real_to_string_0_0.instance.invoke(context, term);
                          if(term == null)
                            break Fail1632;
                          if(true)
                            break Success903;
                        }
                        term = term924;
                        IStrategoTerm b_2051 = null;
                        IStrategoTerm c_2051 = null;
                        IStrategoTerm e_2051 = null;
                        b_2051 = term;
                        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                        if(term == null)
                          break Fail1623;
                        if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                          break Fail1623;
                        c_2051 = ((IStrategoList)term).tail();
                        e_2051 = c_2051;
                        term = report_failure_0_2.instance.invoke(context, e_2051, trans.const330, b_2051);
                        if(term == null)
                          break Fail1623;
                      }
                    }
                  }
                }
                h_2051 = term;
                f_2051 = trans.const265;
                i_2051 = h_2051;
                term = string_replace_0_2.instance.invoke(context, i_2051, f_2051, trans.const265);
                if(term == null)
                  break Fail1623;
                c_2052 = term;
                term = o_2050;
                IStrategoTerm term925 = term;
                Success904:
                { 
                  Fail1633:
                  { 
                    term = concat_strings_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail1633;
                    if(true)
                      break Success904;
                  }
                  term = term925;
                  IStrategoTerm term926 = term;
                  Success905:
                  { 
                    Fail1634:
                    { 
                      term = is_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail1634;
                      if(true)
                        break Success905;
                    }
                    term = term926;
                    IStrategoTerm term927 = term;
                    Success906:
                    { 
                      Fail1635:
                      { 
                        term = int_to_string_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail1635;
                        if(true)
                          break Success906;
                      }
                      term = term927;
                      IStrategoTerm term928 = term;
                      Success907:
                      { 
                        Fail1636:
                        { 
                          term = real_to_string_0_0.instance.invoke(context, term);
                          if(term == null)
                            break Fail1636;
                          if(true)
                            break Success907;
                        }
                        term = term928;
                        IStrategoTerm j_2051 = null;
                        IStrategoTerm k_2051 = null;
                        IStrategoTerm m_2051 = null;
                        j_2051 = term;
                        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                        if(term == null)
                          break Fail1623;
                        if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                          break Fail1623;
                        k_2051 = ((IStrategoList)term).tail();
                        m_2051 = k_2051;
                        term = report_failure_0_2.instance.invoke(context, m_2051, trans.const330, j_2051);
                        if(term == null)
                          break Fail1623;
                      }
                    }
                  }
                }
                p_2051 = term;
                n_2051 = trans.const265;
                q_2051 = p_2051;
                term = string_replace_0_2.instance.invoke(context, q_2051, n_2051, trans.const332);
                if(term == null)
                  break Fail1623;
                term = (IStrategoTerm)termFactory.makeListCons(c_2052, termFactory.makeListCons(term, (IStrategoList)trans.constNil1));
                term = concat_strings_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail1623;
                term = termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil1));
                r_2050 = term;
                lifted356 lifted3560 = new lifted356();
                lifted3560.p_2050 = p_2050;
                term = try_1_0.instance.invoke(context, term, lifted3560);
                if(term == null)
                  break Fail1623;
                term = termFactory.makeTuple(r_2050, trans.const295);
                term = fopen_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail1623;
                term = termFactory.makeTuple(q_2050, term);
                term = fputs_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail1623;
                term = fclose_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail1623;
                if(true)
                  break Success895;
              }
            }
            term = term916;
          }
          if(true)
            break Success894;
        }
        term = term915;
        IStrategoTerm r_2051 = null;
        IStrategoTerm s_2051 = null;
        IStrategoTerm j_2052 = null;
        r_2051 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail1622;
        s_2051 = term;
        j_2052 = r_2051;
        term = report_with_failure_0_2.instance.invoke(context, j_2052, trans.const333, s_2051);
        if(term == null)
          break Fail1622;
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