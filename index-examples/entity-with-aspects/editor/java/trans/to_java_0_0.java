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
    Fail4668:
    { 
      IStrategoTerm term2612 = term;
      Success2591:
      { 
        Fail4669:
        { 
          if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
            break Fail4669;
          IStrategoTerm arg1428 = ((IStrategoList)term).tail();
          if(arg1428.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg1428).isEmpty())
            break Fail4669;
          term = map_1_0.instance.invoke(context, term, to_java_0_0.instance);
          if(term == null)
            break Fail4669;
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail4669;
          if(true)
            break Success2591;
        }
        term = term2612;
        IStrategoTerm term2613 = term;
        IStrategoConstructor cons131 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
        Success2592:
        { 
          if(cons131 == Main._consModule_3)
          { 
            Fail4670:
            { 
              IStrategoTerm k_11931 = null;
              IStrategoTerm l_11931 = null;
              IStrategoTerm m_11931 = null;
              IStrategoTerm n_11931 = null;
              IStrategoTerm o_11931 = null;
              IStrategoTerm q_11932 = null;
              IStrategoTerm t_11931 = null;
              IStrategoTerm v_11931 = null;
              IStrategoTerm w_11931 = null;
              IStrategoTerm r_11932 = null;
              IStrategoTerm b_11932 = null;
              IStrategoTerm d_11932 = null;
              IStrategoTerm e_11932 = null;
              IStrategoTerm j_11932 = null;
              IStrategoTerm l_11932 = null;
              IStrategoTerm m_11932 = null;
              k_11931 = term.getSubterm(0);
              n_11931 = term.getSubterm(1);
              l_11931 = term.getSubterm(2);
              term = map_1_0.instance.invoke(context, l_11931, to_java_0_0.instance);
              if(term == null)
                break Fail4670;
              m_11931 = term;
              term = map_1_0.instance.invoke(context, n_11931, to_java_0_0.instance);
              if(term == null)
                break Fail4670;
              o_11931 = term;
              term = k_11931;
              IStrategoTerm term2614 = term;
              Success2593:
              { 
                Fail4671:
                { 
                  term = concat_strings_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail4671;
                  if(true)
                    break Success2593;
                }
                term = term2614;
                IStrategoTerm term2615 = term;
                Success2594:
                { 
                  Fail4672:
                  { 
                    term = is_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail4672;
                    if(true)
                      break Success2594;
                  }
                  term = term2615;
                  IStrategoTerm term2616 = term;
                  Success2595:
                  { 
                    Fail4673:
                    { 
                      term = int_to_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail4673;
                      if(true)
                        break Success2595;
                    }
                    term = term2616;
                    IStrategoTerm term2617 = term;
                    Success2596:
                    { 
                      Fail4674:
                      { 
                        term = real_to_string_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail4674;
                        if(true)
                          break Success2596;
                      }
                      term = term2617;
                      IStrategoTerm p_11931 = null;
                      IStrategoTerm q_11931 = null;
                      IStrategoTerm s_11931 = null;
                      p_11931 = term;
                      term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                      if(term == null)
                        break Fail4670;
                      if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                        break Fail4670;
                      q_11931 = ((IStrategoList)term).tail();
                      s_11931 = q_11931;
                      term = report_failure_0_2.instance.invoke(context, s_11931, trans.const854, p_11931);
                      if(term == null)
                        break Fail4670;
                    }
                  }
                }
              }
              v_11931 = term;
              t_11931 = trans.const785;
              w_11931 = v_11931;
              term = string_replace_0_2.instance.invoke(context, w_11931, t_11931, trans.const855);
              if(term == null)
                break Fail4670;
              q_11932 = term;
              term = o_11931;
              IStrategoTerm term2618 = term;
              Success2597:
              { 
                Fail4675:
                { 
                  term = concat_strings_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail4675;
                  if(true)
                    break Success2597;
                }
                term = term2618;
                IStrategoTerm term2619 = term;
                Success2598:
                { 
                  Fail4676:
                  { 
                    term = is_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail4676;
                    if(true)
                      break Success2598;
                  }
                  term = term2619;
                  IStrategoTerm term2620 = term;
                  Success2599:
                  { 
                    Fail4677:
                    { 
                      term = int_to_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail4677;
                      if(true)
                        break Success2599;
                    }
                    term = term2620;
                    IStrategoTerm term2621 = term;
                    Success2600:
                    { 
                      Fail4678:
                      { 
                        term = real_to_string_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail4678;
                        if(true)
                          break Success2600;
                      }
                      term = term2621;
                      IStrategoTerm x_11931 = null;
                      IStrategoTerm y_11931 = null;
                      IStrategoTerm a_11932 = null;
                      x_11931 = term;
                      term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                      if(term == null)
                        break Fail4670;
                      if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                        break Fail4670;
                      y_11931 = ((IStrategoList)term).tail();
                      a_11932 = y_11931;
                      term = report_failure_0_2.instance.invoke(context, a_11932, trans.const854, x_11931);
                      if(term == null)
                        break Fail4670;
                    }
                  }
                }
              }
              d_11932 = term;
              b_11932 = trans.const785;
              e_11932 = d_11932;
              term = string_replace_0_2.instance.invoke(context, e_11932, b_11932, trans.const785);
              if(term == null)
                break Fail4670;
              r_11932 = term;
              term = m_11931;
              IStrategoTerm term2622 = term;
              Success2601:
              { 
                Fail4679:
                { 
                  term = concat_strings_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail4679;
                  if(true)
                    break Success2601;
                }
                term = term2622;
                IStrategoTerm term2623 = term;
                Success2602:
                { 
                  Fail4680:
                  { 
                    term = is_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail4680;
                    if(true)
                      break Success2602;
                  }
                  term = term2623;
                  IStrategoTerm term2624 = term;
                  Success2603:
                  { 
                    Fail4681:
                    { 
                      term = int_to_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail4681;
                      if(true)
                        break Success2603;
                    }
                    term = term2624;
                    IStrategoTerm term2625 = term;
                    Success2604:
                    { 
                      Fail4682:
                      { 
                        term = real_to_string_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail4682;
                        if(true)
                          break Success2604;
                      }
                      term = term2625;
                      IStrategoTerm f_11932 = null;
                      IStrategoTerm g_11932 = null;
                      IStrategoTerm i_11932 = null;
                      f_11932 = term;
                      term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                      if(term == null)
                        break Fail4670;
                      if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                        break Fail4670;
                      g_11932 = ((IStrategoList)term).tail();
                      i_11932 = g_11932;
                      term = report_failure_0_2.instance.invoke(context, i_11932, trans.const854, f_11932);
                      if(term == null)
                        break Fail4670;
                    }
                  }
                }
              }
              l_11932 = term;
              j_11932 = trans.const785;
              m_11932 = l_11932;
              term = string_replace_0_2.instance.invoke(context, m_11932, j_11932, trans.const785);
              if(term == null)
                break Fail4670;
              term = (IStrategoTerm)termFactory.makeListCons(trans.const892, termFactory.makeListCons(q_11932, termFactory.makeListCons(trans.const886, termFactory.makeListCons(r_11932, termFactory.makeListCons(trans.const785, termFactory.makeListCons(term, (IStrategoList)trans.constNil3))))));
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail4670;
              term = termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil3));
              if(true)
                break Success2592;
            }
            term = term2613;
          }
          Success2605:
          { 
            if(cons131 == Main._consAspect_2)
            { 
              Fail4683:
              { 
                term = trans.const829;
                if(true)
                  break Success2605;
              }
              term = term2613;
            }
            Success2606:
            { 
              if(cons131 == Main._consImport_1)
              { 
                Fail4684:
                { 
                  IStrategoTerm v_11930 = null;
                  IStrategoTerm w_11930 = null;
                  IStrategoTerm b_11931 = null;
                  IStrategoTerm d_11931 = null;
                  IStrategoTerm e_11931 = null;
                  v_11930 = term.getSubterm(0);
                  term = this.invoke(context, v_11930);
                  if(term == null)
                    break Fail4684;
                  w_11930 = term;
                  term = w_11930;
                  IStrategoTerm term2628 = term;
                  Success2607:
                  { 
                    Fail4685:
                    { 
                      term = concat_strings_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail4685;
                      if(true)
                        break Success2607;
                    }
                    term = term2628;
                    IStrategoTerm term2629 = term;
                    Success2608:
                    { 
                      Fail4686:
                      { 
                        term = is_string_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail4686;
                        if(true)
                          break Success2608;
                      }
                      term = term2629;
                      IStrategoTerm term2630 = term;
                      Success2609:
                      { 
                        Fail4687:
                        { 
                          term = int_to_string_0_0.instance.invoke(context, term);
                          if(term == null)
                            break Fail4687;
                          if(true)
                            break Success2609;
                        }
                        term = term2630;
                        IStrategoTerm term2631 = term;
                        Success2610:
                        { 
                          Fail4688:
                          { 
                            term = real_to_string_0_0.instance.invoke(context, term);
                            if(term == null)
                              break Fail4688;
                            if(true)
                              break Success2610;
                          }
                          term = term2631;
                          IStrategoTerm x_11930 = null;
                          IStrategoTerm y_11930 = null;
                          IStrategoTerm a_11931 = null;
                          x_11930 = term;
                          term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                          if(term == null)
                            break Fail4684;
                          if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                            break Fail4684;
                          y_11930 = ((IStrategoList)term).tail();
                          a_11931 = y_11930;
                          term = report_failure_0_2.instance.invoke(context, a_11931, trans.const854, x_11930);
                          if(term == null)
                            break Fail4684;
                        }
                      }
                    }
                  }
                  d_11931 = term;
                  b_11931 = trans.const785;
                  e_11931 = d_11931;
                  term = string_replace_0_2.instance.invoke(context, e_11931, b_11931, trans.const857);
                  if(term == null)
                    break Fail4684;
                  term = (IStrategoTerm)termFactory.makeListCons(trans.const893, termFactory.makeListCons(term, (IStrategoList)trans.constCons240));
                  term = concat_strings_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail4684;
                  term = termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil3));
                  if(true)
                    break Success2606;
                }
                term = term2613;
              }
              Success2611:
              { 
                if(cons131 == Main._consEntityImport_2)
                { 
                  Fail4689:
                  { 
                    IStrategoTerm x_11929 = null;
                    IStrategoTerm y_11929 = null;
                    IStrategoTerm r_11930 = null;
                    IStrategoTerm d_11930 = null;
                    IStrategoTerm f_11930 = null;
                    IStrategoTerm g_11930 = null;
                    IStrategoTerm l_11930 = null;
                    IStrategoTerm n_11930 = null;
                    IStrategoTerm o_11930 = null;
                    x_11929 = term.getSubterm(0);
                    y_11929 = term.getSubterm(1);
                    term = x_11929;
                    IStrategoTerm term2633 = term;
                    Success2612:
                    { 
                      Fail4690:
                      { 
                        term = concat_strings_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail4690;
                        if(true)
                          break Success2612;
                      }
                      term = term2633;
                      IStrategoTerm term2634 = term;
                      Success2613:
                      { 
                        Fail4691:
                        { 
                          term = is_string_0_0.instance.invoke(context, term);
                          if(term == null)
                            break Fail4691;
                          if(true)
                            break Success2613;
                        }
                        term = term2634;
                        IStrategoTerm term2635 = term;
                        Success2614:
                        { 
                          Fail4692:
                          { 
                            term = int_to_string_0_0.instance.invoke(context, term);
                            if(term == null)
                              break Fail4692;
                            if(true)
                              break Success2614;
                          }
                          term = term2635;
                          IStrategoTerm term2636 = term;
                          Success2615:
                          { 
                            Fail4693:
                            { 
                              term = real_to_string_0_0.instance.invoke(context, term);
                              if(term == null)
                                break Fail4693;
                              if(true)
                                break Success2615;
                            }
                            term = term2636;
                            IStrategoTerm z_11929 = null;
                            IStrategoTerm a_11930 = null;
                            IStrategoTerm c_11930 = null;
                            z_11929 = term;
                            term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                            if(term == null)
                              break Fail4689;
                            if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                              break Fail4689;
                            a_11930 = ((IStrategoList)term).tail();
                            c_11930 = a_11930;
                            term = report_failure_0_2.instance.invoke(context, c_11930, trans.const854, z_11929);
                            if(term == null)
                              break Fail4689;
                          }
                        }
                      }
                    }
                    f_11930 = term;
                    d_11930 = trans.const785;
                    g_11930 = f_11930;
                    term = string_replace_0_2.instance.invoke(context, g_11930, d_11930, trans.const785);
                    if(term == null)
                      break Fail4689;
                    r_11930 = term;
                    term = y_11929;
                    IStrategoTerm term2637 = term;
                    Success2616:
                    { 
                      Fail4694:
                      { 
                        term = concat_strings_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail4694;
                        if(true)
                          break Success2616;
                      }
                      term = term2637;
                      IStrategoTerm term2638 = term;
                      Success2617:
                      { 
                        Fail4695:
                        { 
                          term = is_string_0_0.instance.invoke(context, term);
                          if(term == null)
                            break Fail4695;
                          if(true)
                            break Success2617;
                        }
                        term = term2638;
                        IStrategoTerm term2639 = term;
                        Success2618:
                        { 
                          Fail4696:
                          { 
                            term = int_to_string_0_0.instance.invoke(context, term);
                            if(term == null)
                              break Fail4696;
                            if(true)
                              break Success2618;
                          }
                          term = term2639;
                          IStrategoTerm term2640 = term;
                          Success2619:
                          { 
                            Fail4697:
                            { 
                              term = real_to_string_0_0.instance.invoke(context, term);
                              if(term == null)
                                break Fail4697;
                              if(true)
                                break Success2619;
                            }
                            term = term2640;
                            IStrategoTerm h_11930 = null;
                            IStrategoTerm i_11930 = null;
                            IStrategoTerm k_11930 = null;
                            h_11930 = term;
                            term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                            if(term == null)
                              break Fail4689;
                            if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                              break Fail4689;
                            i_11930 = ((IStrategoList)term).tail();
                            k_11930 = i_11930;
                            term = report_failure_0_2.instance.invoke(context, k_11930, trans.const854, h_11930);
                            if(term == null)
                              break Fail4689;
                          }
                        }
                      }
                    }
                    n_11930 = term;
                    l_11930 = trans.const785;
                    o_11930 = n_11930;
                    term = string_replace_0_2.instance.invoke(context, o_11930, l_11930, trans.const894);
                    if(term == null)
                      break Fail4689;
                    term = (IStrategoTerm)termFactory.makeListCons(r_11930, termFactory.makeListCons(trans.const889, termFactory.makeListCons(term, (IStrategoList)trans.constNil3)));
                    term = concat_strings_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail4689;
                    term = termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil3));
                    if(true)
                      break Success2611;
                  }
                  term = term2613;
                }
                Success2620:
                { 
                  if(cons131 == Main._consWildcardImport_1)
                  { 
                    Fail4698:
                    { 
                      IStrategoTerm k_11929 = null;
                      IStrategoTerm p_11929 = null;
                      IStrategoTerm r_11929 = null;
                      IStrategoTerm s_11929 = null;
                      k_11929 = term.getSubterm(0);
                      term = k_11929;
                      IStrategoTerm term2642 = term;
                      Success2621:
                      { 
                        Fail4699:
                        { 
                          term = concat_strings_0_0.instance.invoke(context, term);
                          if(term == null)
                            break Fail4699;
                          if(true)
                            break Success2621;
                        }
                        term = term2642;
                        IStrategoTerm term2643 = term;
                        Success2622:
                        { 
                          Fail4700:
                          { 
                            term = is_string_0_0.instance.invoke(context, term);
                            if(term == null)
                              break Fail4700;
                            if(true)
                              break Success2622;
                          }
                          term = term2643;
                          IStrategoTerm term2644 = term;
                          Success2623:
                          { 
                            Fail4701:
                            { 
                              term = int_to_string_0_0.instance.invoke(context, term);
                              if(term == null)
                                break Fail4701;
                              if(true)
                                break Success2623;
                            }
                            term = term2644;
                            IStrategoTerm term2645 = term;
                            Success2624:
                            { 
                              Fail4702:
                              { 
                                term = real_to_string_0_0.instance.invoke(context, term);
                                if(term == null)
                                  break Fail4702;
                                if(true)
                                  break Success2624;
                              }
                              term = term2645;
                              IStrategoTerm l_11929 = null;
                              IStrategoTerm m_11929 = null;
                              IStrategoTerm o_11929 = null;
                              l_11929 = term;
                              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                              if(term == null)
                                break Fail4698;
                              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                                break Fail4698;
                              m_11929 = ((IStrategoList)term).tail();
                              o_11929 = m_11929;
                              term = report_failure_0_2.instance.invoke(context, o_11929, trans.const854, l_11929);
                              if(term == null)
                                break Fail4698;
                            }
                          }
                        }
                      }
                      r_11929 = term;
                      p_11929 = trans.const785;
                      s_11929 = r_11929;
                      term = string_replace_0_2.instance.invoke(context, s_11929, p_11929, trans.const785);
                      if(term == null)
                        break Fail4698;
                      term = (IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)trans.constCons243);
                      term = concat_strings_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail4698;
                      term = termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil3));
                      if(true)
                        break Success2620;
                    }
                    term = term2613;
                  }
                  Success2625:
                  { 
                    if(cons131 == Main._consEntity_2)
                    { 
                      Fail4703:
                      { 
                        IStrategoTerm m_11928 = null;
                        IStrategoTerm n_11928 = null;
                        IStrategoTerm g_11929 = null;
                        IStrategoTerm s_11928 = null;
                        IStrategoTerm u_11928 = null;
                        IStrategoTerm v_11928 = null;
                        IStrategoTerm a_11929 = null;
                        IStrategoTerm c_11929 = null;
                        IStrategoTerm d_11929 = null;
                        m_11928 = term.getSubterm(0);
                        n_11928 = term.getSubterm(1);
                        term = m_11928;
                        IStrategoTerm term2647 = term;
                        Success2626:
                        { 
                          Fail4704:
                          { 
                            term = concat_strings_0_0.instance.invoke(context, term);
                            if(term == null)
                              break Fail4704;
                            if(true)
                              break Success2626;
                          }
                          term = term2647;
                          IStrategoTerm term2648 = term;
                          Success2627:
                          { 
                            Fail4705:
                            { 
                              term = is_string_0_0.instance.invoke(context, term);
                              if(term == null)
                                break Fail4705;
                              if(true)
                                break Success2627;
                            }
                            term = term2648;
                            IStrategoTerm term2649 = term;
                            Success2628:
                            { 
                              Fail4706:
                              { 
                                term = int_to_string_0_0.instance.invoke(context, term);
                                if(term == null)
                                  break Fail4706;
                                if(true)
                                  break Success2628;
                              }
                              term = term2649;
                              IStrategoTerm term2650 = term;
                              Success2629:
                              { 
                                Fail4707:
                                { 
                                  term = real_to_string_0_0.instance.invoke(context, term);
                                  if(term == null)
                                    break Fail4707;
                                  if(true)
                                    break Success2629;
                                }
                                term = term2650;
                                IStrategoTerm o_11928 = null;
                                IStrategoTerm p_11928 = null;
                                IStrategoTerm r_11928 = null;
                                o_11928 = term;
                                term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                                if(term == null)
                                  break Fail4703;
                                if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                                  break Fail4703;
                                p_11928 = ((IStrategoList)term).tail();
                                r_11928 = p_11928;
                                term = report_failure_0_2.instance.invoke(context, r_11928, trans.const854, o_11928);
                                if(term == null)
                                  break Fail4703;
                              }
                            }
                          }
                        }
                        u_11928 = term;
                        s_11928 = trans.const785;
                        v_11928 = u_11928;
                        term = string_replace_0_2.instance.invoke(context, v_11928, s_11928, trans.const894);
                        if(term == null)
                          break Fail4703;
                        g_11929 = term;
                        term = map_1_0.instance.invoke(context, n_11928, to_java_0_0.instance);
                        if(term == null)
                          break Fail4703;
                        IStrategoTerm term2651 = term;
                        Success2630:
                        { 
                          Fail4708:
                          { 
                            term = concat_strings_0_0.instance.invoke(context, term);
                            if(term == null)
                              break Fail4708;
                            if(true)
                              break Success2630;
                          }
                          term = term2651;
                          IStrategoTerm term2652 = term;
                          Success2631:
                          { 
                            Fail4709:
                            { 
                              term = is_string_0_0.instance.invoke(context, term);
                              if(term == null)
                                break Fail4709;
                              if(true)
                                break Success2631;
                            }
                            term = term2652;
                            IStrategoTerm term2653 = term;
                            Success2632:
                            { 
                              Fail4710:
                              { 
                                term = int_to_string_0_0.instance.invoke(context, term);
                                if(term == null)
                                  break Fail4710;
                                if(true)
                                  break Success2632;
                              }
                              term = term2653;
                              IStrategoTerm term2654 = term;
                              Success2633:
                              { 
                                Fail4711:
                                { 
                                  term = real_to_string_0_0.instance.invoke(context, term);
                                  if(term == null)
                                    break Fail4711;
                                  if(true)
                                    break Success2633;
                                }
                                term = term2654;
                                IStrategoTerm w_11928 = null;
                                IStrategoTerm x_11928 = null;
                                IStrategoTerm z_11928 = null;
                                w_11928 = term;
                                term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                                if(term == null)
                                  break Fail4703;
                                if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                                  break Fail4703;
                                x_11928 = ((IStrategoList)term).tail();
                                z_11928 = x_11928;
                                term = report_failure_0_2.instance.invoke(context, z_11928, trans.const854, w_11928);
                                if(term == null)
                                  break Fail4703;
                              }
                            }
                          }
                        }
                        c_11929 = term;
                        a_11929 = trans.const785;
                        d_11929 = c_11929;
                        term = string_replace_0_2.instance.invoke(context, d_11929, a_11929, trans.const879);
                        if(term == null)
                          break Fail4703;
                        term = (IStrategoTerm)termFactory.makeListCons(trans.const898, termFactory.makeListCons(g_11929, termFactory.makeListCons(trans.const897, termFactory.makeListCons(term, (IStrategoList)trans.constCons244))));
                        term = concat_strings_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail4703;
                        term = termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil3));
                        if(true)
                          break Success2625;
                      }
                      term = term2613;
                    }
                    term = to_java_0_0_fragment_1.instance.invoke(context, term);
                    if(term == null)
                      break Fail4668;
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