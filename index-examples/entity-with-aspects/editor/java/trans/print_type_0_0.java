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
    Fail4764:
    { 
      TermReference v_11938 = new TermReference();
      IStrategoTerm w_11938 = null;
      IStrategoTerm x_11938 = null;
      IStrategoTerm y_11938 = null;
      IStrategoTerm z_11938 = null;
      IStrategoTerm a_11939 = null;
      a_11939 = term;
      z_11938 = term;
      term = a_11939;
      IStrategoTerm term2701 = term;
      Success2680:
      { 
        Fail4765:
        { 
          IStrategoTerm b_11939 = null;
          b_11939 = term;
          term = $Int$Type_0_0.instance.invoke(context, z_11938);
          if(term == null)
            break Fail4765;
          term = b_11939;
          { 
            term = trans.const781;
            if(true)
              break Success2680;
          }
        }
        term = term2701;
        IStrategoTerm term2702 = term;
        Success2681:
        { 
          Fail4766:
          { 
            IStrategoTerm c_11939 = null;
            c_11939 = term;
            term = $String$Type_0_0.instance.invoke(context, z_11938);
            if(term == null)
              break Fail4766;
            term = c_11939;
            { 
              term = trans.const780;
              if(true)
                break Success2681;
            }
          }
          term = term2702;
          IStrategoTerm term2703 = term;
          Success2682:
          { 
            Fail4767:
            { 
              IStrategoTerm d_11939 = null;
              d_11939 = term;
              term = z_11938;
              lifted970 lifted9700 = new lifted970();
              lifted9700.v_11938 = v_11938;
              term = $Type_1_0.instance.invoke(context, term, lifted9700);
              if(term == null)
                break Fail4767;
              term = d_11939;
              { 
                if(v_11938.value == null)
                  break Fail4764;
                term = strip_annos_0_0.instance.invoke(context, v_11938.value);
                if(term == null)
                  break Fail4764;
                if(true)
                  break Success2682;
              }
            }
            term = term2703;
            IStrategoTerm term2704 = term;
            Success2683:
            { 
              Fail4768:
              { 
                IStrategoTerm e_11939 = null;
                IStrategoTerm f_11939 = null;
                IStrategoTerm g_11939 = null;
                IStrategoTerm i_11939 = null;
                e_11939 = term;
                term = z_11938;
                if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                  break Fail4768;
                f_11939 = ((IStrategoList)term).head();
                g_11939 = ((IStrategoList)term).tail();
                w_11938 = f_11939;
                term = g_11939;
                if(term.getTermType() != IStrategoTerm.LIST || !((IStrategoList)term).isEmpty())
                  break Fail4768;
                i_11939 = term;
                IStrategoList list126;
                list126 = checkListTail(i_11939);
                if(list126 == null)
                  break Fail4768;
                term = e_11939;
                { 
                  term = this.invoke(context, w_11938);
                  if(term == null)
                    break Fail4764;
                  if(true)
                    break Success2683;
                }
              }
              term = term2704;
              IStrategoTerm term2705 = term;
              Success2684:
              { 
                Fail4769:
                { 
                  IStrategoTerm k_11939 = null;
                  IStrategoTerm l_11939 = null;
                  IStrategoTerm m_11939 = null;
                  IStrategoTerm n_11939 = null;
                  IStrategoTerm o_11939 = null;
                  IStrategoTerm p_11939 = null;
                  k_11939 = term;
                  term = z_11938;
                  if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                    break Fail4769;
                  l_11939 = ((IStrategoList)term).head();
                  m_11939 = ((IStrategoList)term).tail();
                  IStrategoList annos209 = term.getAnnotations();
                  p_11939 = annos209;
                  term = l_11939;
                  w_11938 = l_11939;
                  n_11939 = term;
                  term = m_11939;
                  x_11938 = m_11939;
                  o_11939 = term;
                  IStrategoList list127;
                  list127 = checkListTail(o_11939);
                  if(list127 == null)
                    break Fail4769;
                  term = termFactory.annotateTerm((IStrategoTerm)termFactory.makeListCons(n_11939, list127), checkListAnnos(termFactory, p_11939));
                  IStrategoTerm term2706 = term;
                  Success2685:
                  { 
                    Fail4770:
                    { 
                      term = x_11938;
                      if(term.getTermType() != IStrategoTerm.LIST || !((IStrategoList)term).isEmpty())
                        break Fail4770;
                      { 
                        if(true)
                          break Fail4769;
                        if(true)
                          break Success2685;
                      }
                    }
                    term = term2706;
                  }
                  term = k_11939;
                  { 
                    IStrategoTerm q_11940 = null;
                    IStrategoTerm u_11939 = null;
                    IStrategoTerm w_11939 = null;
                    IStrategoTerm x_11939 = null;
                    IStrategoTerm c_11940 = null;
                    IStrategoTerm e_11940 = null;
                    IStrategoTerm f_11940 = null;
                    term = this.invoke(context, w_11938);
                    if(term == null)
                      break Fail4764;
                    IStrategoTerm term2707 = term;
                    Success2686:
                    { 
                      Fail4771:
                      { 
                        term = concat_strings_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail4771;
                        if(true)
                          break Success2686;
                      }
                      term = term2707;
                      IStrategoTerm term2708 = term;
                      Success2687:
                      { 
                        Fail4772:
                        { 
                          term = is_string_0_0.instance.invoke(context, term);
                          if(term == null)
                            break Fail4772;
                          if(true)
                            break Success2687;
                        }
                        term = term2708;
                        IStrategoTerm term2709 = term;
                        Success2688:
                        { 
                          Fail4773:
                          { 
                            term = int_to_string_0_0.instance.invoke(context, term);
                            if(term == null)
                              break Fail4773;
                            if(true)
                              break Success2688;
                          }
                          term = term2709;
                          IStrategoTerm term2710 = term;
                          Success2689:
                          { 
                            Fail4774:
                            { 
                              term = real_to_string_0_0.instance.invoke(context, term);
                              if(term == null)
                                break Fail4774;
                              if(true)
                                break Success2689;
                            }
                            term = term2710;
                            IStrategoTerm q_11939 = null;
                            IStrategoTerm r_11939 = null;
                            IStrategoTerm t_11939 = null;
                            q_11939 = term;
                            term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                            if(term == null)
                              break Fail4764;
                            if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                              break Fail4764;
                            r_11939 = ((IStrategoList)term).tail();
                            t_11939 = r_11939;
                            term = report_failure_0_2.instance.invoke(context, t_11939, trans.const905, q_11939);
                            if(term == null)
                              break Fail4764;
                          }
                        }
                      }
                    }
                    w_11939 = term;
                    u_11939 = trans.const785;
                    x_11939 = w_11939;
                    term = string_replace_0_2.instance.invoke(context, x_11939, u_11939, trans.const785);
                    if(term == null)
                      break Fail4764;
                    q_11940 = term;
                    term = this.invoke(context, x_11938);
                    if(term == null)
                      break Fail4764;
                    IStrategoTerm term2711 = term;
                    Success2690:
                    { 
                      Fail4775:
                      { 
                        term = concat_strings_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail4775;
                        if(true)
                          break Success2690;
                      }
                      term = term2711;
                      IStrategoTerm term2712 = term;
                      Success2691:
                      { 
                        Fail4776:
                        { 
                          term = is_string_0_0.instance.invoke(context, term);
                          if(term == null)
                            break Fail4776;
                          if(true)
                            break Success2691;
                        }
                        term = term2712;
                        IStrategoTerm term2713 = term;
                        Success2692:
                        { 
                          Fail4777:
                          { 
                            term = int_to_string_0_0.instance.invoke(context, term);
                            if(term == null)
                              break Fail4777;
                            if(true)
                              break Success2692;
                          }
                          term = term2713;
                          IStrategoTerm term2714 = term;
                          Success2693:
                          { 
                            Fail4778:
                            { 
                              term = real_to_string_0_0.instance.invoke(context, term);
                              if(term == null)
                                break Fail4778;
                              if(true)
                                break Success2693;
                            }
                            term = term2714;
                            IStrategoTerm y_11939 = null;
                            IStrategoTerm z_11939 = null;
                            IStrategoTerm b_11940 = null;
                            y_11939 = term;
                            term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                            if(term == null)
                              break Fail4764;
                            if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                              break Fail4764;
                            z_11939 = ((IStrategoList)term).tail();
                            b_11940 = z_11939;
                            term = report_failure_0_2.instance.invoke(context, b_11940, trans.const905, y_11939);
                            if(term == null)
                              break Fail4764;
                          }
                        }
                      }
                    }
                    e_11940 = term;
                    c_11940 = trans.const785;
                    f_11940 = e_11940;
                    term = string_replace_0_2.instance.invoke(context, f_11940, c_11940, trans.const906);
                    if(term == null)
                      break Fail4764;
                    term = (IStrategoTerm)termFactory.makeListCons(q_11940, termFactory.makeListCons(trans.const903, termFactory.makeListCons(term, (IStrategoList)trans.constNil3)));
                    term = concat_strings_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail4764;
                    term = termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil3));
                    if(true)
                      break Success2684;
                  }
                }
                term = term2705;
                IStrategoTerm k_11940 = null;
                IStrategoTerm m_11940 = null;
                IStrategoTerm n_11940 = null;
                IStrategoTerm cons108 = context.invokePrimitive("SSL_get_constructor", term, NO_STRATEGIES, new IStrategoTerm[]{term});
                y_11938 = cons108;
                term = y_11938;
                IStrategoTerm term2715 = term;
                Success2694:
                { 
                  Fail4779:
                  { 
                    term = concat_strings_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail4779;
                    if(true)
                      break Success2694;
                  }
                  term = term2715;
                  IStrategoTerm term2716 = term;
                  Success2695:
                  { 
                    Fail4780:
                    { 
                      term = is_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail4780;
                      if(true)
                        break Success2695;
                    }
                    term = term2716;
                    IStrategoTerm term2717 = term;
                    Success2696:
                    { 
                      Fail4781:
                      { 
                        term = int_to_string_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail4781;
                        if(true)
                          break Success2696;
                      }
                      term = term2717;
                      IStrategoTerm term2718 = term;
                      Success2697:
                      { 
                        Fail4782:
                        { 
                          term = real_to_string_0_0.instance.invoke(context, term);
                          if(term == null)
                            break Fail4782;
                          if(true)
                            break Success2697;
                        }
                        term = term2718;
                        IStrategoTerm g_11940 = null;
                        IStrategoTerm h_11940 = null;
                        IStrategoTerm j_11940 = null;
                        g_11940 = term;
                        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                        if(term == null)
                          break Fail4764;
                        if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                          break Fail4764;
                        h_11940 = ((IStrategoList)term).tail();
                        j_11940 = h_11940;
                        term = report_failure_0_2.instance.invoke(context, j_11940, trans.const905, g_11940);
                        if(term == null)
                          break Fail4764;
                      }
                    }
                  }
                }
                m_11940 = term;
                k_11940 = trans.const785;
                n_11940 = m_11940;
                term = string_replace_0_2.instance.invoke(context, n_11940, k_11940, trans.const785);
                if(term == null)
                  break Fail4764;
                term = (IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)trans.constNil3);
                term = concat_strings_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail4764;
                term = termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil3));
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