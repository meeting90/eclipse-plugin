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
    Fail4608:
    { 
      IStrategoTerm term2553 = term;
      Success2532:
      { 
        Fail4609:
        { 
          IStrategoTerm d_11919 = null;
          TermReference h_11919 = new TermReference();
          IStrategoTerm j_11919 = null;
          IStrategoTerm k_11919 = null;
          TermReference l_11919 = new TermReference();
          IStrategoTerm m_11919 = null;
          IStrategoTerm n_11919 = null;
          IStrategoTerm x_11920 = null;
          IStrategoTerm i_11921 = null;
          IStrategoTerm m_11921 = null;
          IStrategoTerm v_11919 = null;
          IStrategoTerm x_11919 = null;
          IStrategoTerm y_11919 = null;
          IStrategoTerm j_11921 = null;
          IStrategoTerm n_11921 = null;
          IStrategoTerm d_11920 = null;
          IStrategoTerm f_11920 = null;
          IStrategoTerm g_11920 = null;
          IStrategoTerm k_11921 = null;
          IStrategoTerm o_11921 = null;
          IStrategoTerm l_11920 = null;
          IStrategoTerm n_11920 = null;
          IStrategoTerm o_11920 = null;
          IStrategoTerm t_11920 = null;
          IStrategoTerm v_11920 = null;
          IStrategoTerm w_11920 = null;
          if(term.getTermType() != IStrategoTerm.APPL || Main._consAssign_2 != ((IStrategoAppl)term).getConstructor())
            break Fail4609;
          j_11919 = term.getSubterm(0);
          if(h_11919.value == null)
            h_11919.value = term.getSubterm(1);
          else
            if(h_11919.value != term.getSubterm(1) && !h_11919.value.match(term.getSubterm(1)))
              break Fail4609;
          x_11920 = term;
          IStrategoTerm term2554 = term;
          Success2533:
          { 
            Fail4610:
            { 
              IStrategoTerm z_11920 = null;
              term = index_find_key_0_0.instance.invoke(context, j_11919);
              if(term == null)
                break Fail4610;
              IStrategoList annos207 = term.getAnnotations();
              if(annos207.getTermType() != IStrategoTerm.LIST || ((IStrategoList)annos207).isEmpty())
                break Fail4610;
              d_11919 = ((IStrategoList)annos207).head();
              IStrategoTerm arg1410 = ((IStrategoList)annos207).tail();
              if(arg1410.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg1410).isEmpty())
                break Fail4610;
              term = last_0_0.instance.invoke(context, d_11919);
              if(term == null)
                break Fail4610;
              term = (IStrategoTerm)termFactory.makeListCons(trans.constModule0, termFactory.makeListCons(term, (IStrategoList)trans.constNil3));
              z_11920 = term;
              term = index_get_children_0_1.instance.invoke(context, z_11920, trans.constAspect0);
              if(term == null)
                break Fail4610;
              term = mapconcat_1_0.instance.invoke(context, term, lifted958.instance);
              if(term == null)
                break Fail4610;
              term = mapconcat_1_0.instance.invoke(context, term, lifted959.instance);
              if(term == null)
                break Fail4610;
              lifted960 lifted9600 = new lifted960();
              lifted9600.h_11919 = h_11919;
              term = map_1_0.instance.invoke(context, term, lifted9600);
              if(term == null)
                break Fail4610;
              m_11919 = term;
              term = type_of_0_0.instance.invoke(context, j_11919);
              if(term == null)
                break Fail4610;
              term = to_java_aspect_type_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail4610;
              if(l_11919.value == null)
                l_11919.value = term;
              else
                if(l_11919.value != term && !l_11919.value.match(term))
                  break Fail4610;
              term = m_11919;
              lifted961 lifted9610 = new lifted961();
              lifted9610.l_11919 = l_11919;
              term = filter_1_0.instance.invoke(context, term, lifted9610);
              if(term == null)
                break Fail4610;
              k_11919 = term;
              term = m_11919;
              lifted962 lifted9620 = new lifted962();
              lifted9620.l_11919 = l_11919;
              term = filter_1_0.instance.invoke(context, term, lifted9620);
              if(term == null)
                break Fail4610;
              n_11919 = term;
              if(true)
                break Success2533;
            }
            term = term2554;
            IStrategoTerm p_11919 = null;
            IStrategoTerm q_11919 = null;
            IStrategoTerm f_11921 = null;
            p_11919 = term;
            term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
            if(term == null)
              break Fail4609;
            q_11919 = term;
            f_11921 = p_11919;
            term = report_with_failure_0_2.instance.invoke(context, f_11921, trans.const883, q_11919);
            if(term == null)
              break Fail4609;
          }
          term = x_11920;
          m_11921 = term;
          if(k_11919 == null)
            break Fail4609;
          term = k_11919;
          IStrategoTerm term2555 = term;
          Success2534:
          { 
            Fail4611:
            { 
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail4611;
              if(true)
                break Success2534;
            }
            term = term2555;
            IStrategoTerm term2556 = term;
            Success2535:
            { 
              Fail4612:
              { 
                term = is_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail4612;
                if(true)
                  break Success2535;
              }
              term = term2556;
              IStrategoTerm term2557 = term;
              Success2536:
              { 
                Fail4613:
                { 
                  term = int_to_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail4613;
                  if(true)
                    break Success2536;
                }
                term = term2557;
                IStrategoTerm term2558 = term;
                Success2537:
                { 
                  Fail4614:
                  { 
                    term = real_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail4614;
                    if(true)
                      break Success2537;
                  }
                  term = term2558;
                  IStrategoTerm r_11919 = null;
                  IStrategoTerm s_11919 = null;
                  IStrategoTerm u_11919 = null;
                  r_11919 = term;
                  term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                  if(term == null)
                    break Fail4609;
                  if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                    break Fail4609;
                  s_11919 = ((IStrategoList)term).tail();
                  u_11919 = s_11919;
                  term = report_failure_0_2.instance.invoke(context, u_11919, trans.const854, r_11919);
                  if(term == null)
                    break Fail4609;
                }
              }
            }
          }
          x_11919 = term;
          v_11919 = trans.const785;
          y_11919 = x_11919;
          term = string_replace_0_2.instance.invoke(context, y_11919, v_11919, trans.const785);
          if(term == null)
            break Fail4609;
          i_11921 = term;
          n_11921 = m_11921;
          term = to_java_0_0.instance.invoke(context, j_11919);
          if(term == null)
            break Fail4609;
          IStrategoTerm term2559 = term;
          Success2538:
          { 
            Fail4615:
            { 
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail4615;
              if(true)
                break Success2538;
            }
            term = term2559;
            IStrategoTerm term2560 = term;
            Success2539:
            { 
              Fail4616:
              { 
                term = is_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail4616;
                if(true)
                  break Success2539;
              }
              term = term2560;
              IStrategoTerm term2561 = term;
              Success2540:
              { 
                Fail4617:
                { 
                  term = int_to_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail4617;
                  if(true)
                    break Success2540;
                }
                term = term2561;
                IStrategoTerm term2562 = term;
                Success2541:
                { 
                  Fail4618:
                  { 
                    term = real_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail4618;
                    if(true)
                      break Success2541;
                  }
                  term = term2562;
                  IStrategoTerm z_11919 = null;
                  IStrategoTerm a_11920 = null;
                  IStrategoTerm c_11920 = null;
                  z_11919 = term;
                  term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                  if(term == null)
                    break Fail4609;
                  if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                    break Fail4609;
                  a_11920 = ((IStrategoList)term).tail();
                  c_11920 = a_11920;
                  term = report_failure_0_2.instance.invoke(context, c_11920, trans.const854, z_11919);
                  if(term == null)
                    break Fail4609;
                }
              }
            }
          }
          f_11920 = term;
          d_11920 = trans.const785;
          g_11920 = f_11920;
          term = string_replace_0_2.instance.invoke(context, g_11920, d_11920, trans.const785);
          if(term == null)
            break Fail4609;
          j_11921 = term;
          term = n_11921;
          o_11921 = n_11921;
          if(h_11919.value == null)
            break Fail4609;
          term = to_java_0_0.instance.invoke(context, h_11919.value);
          if(term == null)
            break Fail4609;
          IStrategoTerm term2563 = term;
          Success2542:
          { 
            Fail4619:
            { 
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail4619;
              if(true)
                break Success2542;
            }
            term = term2563;
            IStrategoTerm term2564 = term;
            Success2543:
            { 
              Fail4620:
              { 
                term = is_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail4620;
                if(true)
                  break Success2543;
              }
              term = term2564;
              IStrategoTerm term2565 = term;
              Success2544:
              { 
                Fail4621:
                { 
                  term = int_to_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail4621;
                  if(true)
                    break Success2544;
                }
                term = term2565;
                IStrategoTerm term2566 = term;
                Success2545:
                { 
                  Fail4622:
                  { 
                    term = real_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail4622;
                    if(true)
                      break Success2545;
                  }
                  term = term2566;
                  IStrategoTerm h_11920 = null;
                  IStrategoTerm i_11920 = null;
                  IStrategoTerm k_11920 = null;
                  h_11920 = term;
                  term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                  if(term == null)
                    break Fail4609;
                  if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                    break Fail4609;
                  i_11920 = ((IStrategoList)term).tail();
                  k_11920 = i_11920;
                  term = report_failure_0_2.instance.invoke(context, k_11920, trans.const854, h_11920);
                  if(term == null)
                    break Fail4609;
                }
              }
            }
          }
          n_11920 = term;
          l_11920 = trans.const785;
          o_11920 = n_11920;
          term = string_replace_0_2.instance.invoke(context, o_11920, l_11920, trans.const785);
          if(term == null)
            break Fail4609;
          k_11921 = term;
          term = o_11921;
          if(n_11919 == null)
            break Fail4609;
          term = n_11919;
          IStrategoTerm term2567 = term;
          Success2546:
          { 
            Fail4623:
            { 
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail4623;
              if(true)
                break Success2546;
            }
            term = term2567;
            IStrategoTerm term2568 = term;
            Success2547:
            { 
              Fail4624:
              { 
                term = is_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail4624;
                if(true)
                  break Success2547;
              }
              term = term2568;
              IStrategoTerm term2569 = term;
              Success2548:
              { 
                Fail4625:
                { 
                  term = int_to_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail4625;
                  if(true)
                    break Success2548;
                }
                term = term2569;
                IStrategoTerm term2570 = term;
                Success2549:
                { 
                  Fail4626:
                  { 
                    term = real_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail4626;
                    if(true)
                      break Success2549;
                  }
                  term = term2570;
                  IStrategoTerm p_11920 = null;
                  IStrategoTerm q_11920 = null;
                  IStrategoTerm s_11920 = null;
                  p_11920 = term;
                  term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                  if(term == null)
                    break Fail4609;
                  if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                    break Fail4609;
                  q_11920 = ((IStrategoList)term).tail();
                  s_11920 = q_11920;
                  term = report_failure_0_2.instance.invoke(context, s_11920, trans.const854, p_11920);
                  if(term == null)
                    break Fail4609;
                }
              }
            }
          }
          v_11920 = term;
          t_11920 = trans.const785;
          w_11920 = v_11920;
          term = string_replace_0_2.instance.invoke(context, w_11920, t_11920, trans.const785);
          if(term == null)
            break Fail4609;
          term = (IStrategoTerm)termFactory.makeListCons(i_11921, termFactory.makeListCons(trans.const785, termFactory.makeListCons(j_11921, termFactory.makeListCons(trans.const865, termFactory.makeListCons(k_11921, termFactory.makeListCons(trans.const884, termFactory.makeListCons(term, (IStrategoList)trans.constNil3)))))));
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail4609;
          term = termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil3));
          if(true)
            break Success2532;
        }
        term = term2553;
        IStrategoTerm term2571 = term;
        IStrategoConstructor cons130 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
        Success2550:
        { 
          if(cons130 == Main._consVarDeclInit_3)
          { 
            Fail4627:
            { 
              IStrategoTerm s_11917 = null;
              IStrategoTerm t_11917 = null;
              IStrategoTerm u_11917 = null;
              IStrategoTerm v_11918 = null;
              IStrategoTerm z_11917 = null;
              IStrategoTerm b_11918 = null;
              IStrategoTerm c_11918 = null;
              IStrategoTerm w_11918 = null;
              IStrategoTerm h_11918 = null;
              IStrategoTerm j_11918 = null;
              IStrategoTerm k_11918 = null;
              IStrategoTerm p_11918 = null;
              IStrategoTerm r_11918 = null;
              IStrategoTerm s_11918 = null;
              t_11917 = term.getSubterm(0);
              s_11917 = term.getSubterm(1);
              u_11917 = term.getSubterm(2);
              term = to_java_0_0.instance.invoke(context, s_11917);
              if(term == null)
                break Fail4627;
              IStrategoTerm term2572 = term;
              Success2551:
              { 
                Fail4628:
                { 
                  term = concat_strings_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail4628;
                  if(true)
                    break Success2551;
                }
                term = term2572;
                IStrategoTerm term2573 = term;
                Success2552:
                { 
                  Fail4629:
                  { 
                    term = is_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail4629;
                    if(true)
                      break Success2552;
                  }
                  term = term2573;
                  IStrategoTerm term2574 = term;
                  Success2553:
                  { 
                    Fail4630:
                    { 
                      term = int_to_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail4630;
                      if(true)
                        break Success2553;
                    }
                    term = term2574;
                    IStrategoTerm term2575 = term;
                    Success2554:
                    { 
                      Fail4631:
                      { 
                        term = real_to_string_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail4631;
                        if(true)
                          break Success2554;
                      }
                      term = term2575;
                      IStrategoTerm v_11917 = null;
                      IStrategoTerm w_11917 = null;
                      IStrategoTerm y_11917 = null;
                      v_11917 = term;
                      term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                      if(term == null)
                        break Fail4627;
                      if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                        break Fail4627;
                      w_11917 = ((IStrategoList)term).tail();
                      y_11917 = w_11917;
                      term = report_failure_0_2.instance.invoke(context, y_11917, trans.const854, v_11917);
                      if(term == null)
                        break Fail4627;
                    }
                  }
                }
              }
              b_11918 = term;
              z_11917 = trans.const785;
              c_11918 = b_11918;
              term = string_replace_0_2.instance.invoke(context, c_11918, z_11917, trans.const785);
              if(term == null)
                break Fail4627;
              v_11918 = term;
              term = t_11917;
              IStrategoTerm term2576 = term;
              Success2555:
              { 
                Fail4632:
                { 
                  term = concat_strings_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail4632;
                  if(true)
                    break Success2555;
                }
                term = term2576;
                IStrategoTerm term2577 = term;
                Success2556:
                { 
                  Fail4633:
                  { 
                    term = is_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail4633;
                    if(true)
                      break Success2556;
                  }
                  term = term2577;
                  IStrategoTerm term2578 = term;
                  Success2557:
                  { 
                    Fail4634:
                    { 
                      term = int_to_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail4634;
                      if(true)
                        break Success2557;
                    }
                    term = term2578;
                    IStrategoTerm term2579 = term;
                    Success2558:
                    { 
                      Fail4635:
                      { 
                        term = real_to_string_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail4635;
                        if(true)
                          break Success2558;
                      }
                      term = term2579;
                      IStrategoTerm d_11918 = null;
                      IStrategoTerm e_11918 = null;
                      IStrategoTerm g_11918 = null;
                      d_11918 = term;
                      term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                      if(term == null)
                        break Fail4627;
                      if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                        break Fail4627;
                      e_11918 = ((IStrategoList)term).tail();
                      g_11918 = e_11918;
                      term = report_failure_0_2.instance.invoke(context, g_11918, trans.const854, d_11918);
                      if(term == null)
                        break Fail4627;
                    }
                  }
                }
              }
              j_11918 = term;
              h_11918 = trans.const785;
              k_11918 = j_11918;
              term = string_replace_0_2.instance.invoke(context, k_11918, h_11918, trans.const878);
              if(term == null)
                break Fail4627;
              w_11918 = term;
              term = to_java_0_0.instance.invoke(context, u_11917);
              if(term == null)
                break Fail4627;
              IStrategoTerm term2580 = term;
              Success2559:
              { 
                Fail4636:
                { 
                  term = concat_strings_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail4636;
                  if(true)
                    break Success2559;
                }
                term = term2580;
                IStrategoTerm term2581 = term;
                Success2560:
                { 
                  Fail4637:
                  { 
                    term = is_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail4637;
                    if(true)
                      break Success2560;
                  }
                  term = term2581;
                  IStrategoTerm term2582 = term;
                  Success2561:
                  { 
                    Fail4638:
                    { 
                      term = int_to_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail4638;
                      if(true)
                        break Success2561;
                    }
                    term = term2582;
                    IStrategoTerm term2583 = term;
                    Success2562:
                    { 
                      Fail4639:
                      { 
                        term = real_to_string_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail4639;
                        if(true)
                          break Success2562;
                      }
                      term = term2583;
                      IStrategoTerm l_11918 = null;
                      IStrategoTerm m_11918 = null;
                      IStrategoTerm o_11918 = null;
                      l_11918 = term;
                      term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                      if(term == null)
                        break Fail4627;
                      if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                        break Fail4627;
                      m_11918 = ((IStrategoList)term).tail();
                      o_11918 = m_11918;
                      term = report_failure_0_2.instance.invoke(context, o_11918, trans.const854, l_11918);
                      if(term == null)
                        break Fail4627;
                    }
                  }
                }
              }
              r_11918 = term;
              p_11918 = trans.const785;
              s_11918 = r_11918;
              term = string_replace_0_2.instance.invoke(context, s_11918, p_11918, trans.const885);
              if(term == null)
                break Fail4627;
              term = (IStrategoTerm)termFactory.makeListCons(v_11918, termFactory.makeListCons(trans.const867, termFactory.makeListCons(w_11918, termFactory.makeListCons(trans.const865, termFactory.makeListCons(term, (IStrategoList)trans.constCons240)))));
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail4627;
              term = termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil3));
              if(true)
                break Success2550;
            }
            term = term2571;
          }
          Success2563:
          { 
            if(cons130 == Main._consPrint_1)
            { 
              Fail4640:
              { 
                IStrategoTerm f_11917 = null;
                IStrategoTerm k_11917 = null;
                IStrategoTerm m_11917 = null;
                IStrategoTerm n_11917 = null;
                f_11917 = term.getSubterm(0);
                term = to_java_0_0.instance.invoke(context, f_11917);
                if(term == null)
                  break Fail4640;
                IStrategoTerm term2585 = term;
                Success2564:
                { 
                  Fail4641:
                  { 
                    term = concat_strings_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail4641;
                    if(true)
                      break Success2564;
                  }
                  term = term2585;
                  IStrategoTerm term2586 = term;
                  Success2565:
                  { 
                    Fail4642:
                    { 
                      term = is_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail4642;
                      if(true)
                        break Success2565;
                    }
                    term = term2586;
                    IStrategoTerm term2587 = term;
                    Success2566:
                    { 
                      Fail4643:
                      { 
                        term = int_to_string_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail4643;
                        if(true)
                          break Success2566;
                      }
                      term = term2587;
                      IStrategoTerm term2588 = term;
                      Success2567:
                      { 
                        Fail4644:
                        { 
                          term = real_to_string_0_0.instance.invoke(context, term);
                          if(term == null)
                            break Fail4644;
                          if(true)
                            break Success2567;
                        }
                        term = term2588;
                        IStrategoTerm g_11917 = null;
                        IStrategoTerm h_11917 = null;
                        IStrategoTerm j_11917 = null;
                        g_11917 = term;
                        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                        if(term == null)
                          break Fail4640;
                        if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                          break Fail4640;
                        h_11917 = ((IStrategoList)term).tail();
                        j_11917 = h_11917;
                        term = report_failure_0_2.instance.invoke(context, j_11917, trans.const854, g_11917);
                        if(term == null)
                          break Fail4640;
                      }
                    }
                  }
                }
                m_11917 = term;
                k_11917 = trans.const785;
                n_11917 = m_11917;
                term = string_replace_0_2.instance.invoke(context, n_11917, k_11917, trans.const856);
                if(term == null)
                  break Fail4640;
                term = (IStrategoTerm)termFactory.makeListCons(trans.const888, termFactory.makeListCons(term, (IStrategoList)trans.constCons241));
                term = concat_strings_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail4640;
                term = termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil3));
                if(true)
                  break Success2563;
              }
              term = term2571;
            }
            Success2568:
            { 
              if(cons130 == Main._consVar_1)
              { 
                Fail4645:
                { 
                  IStrategoTerm e_11917 = null;
                  e_11917 = term.getSubterm(0);
                  term = e_11917;
                  if(true)
                    break Success2568;
                }
                term = term2571;
              }
              Success2569:
              { 
                if(cons130 == Main._consPropAccess_2)
                { 
                  Fail4646:
                  { 
                    IStrategoTerm g_11916 = null;
                    IStrategoTerm h_11916 = null;
                    IStrategoTerm a_11917 = null;
                    IStrategoTerm m_11916 = null;
                    IStrategoTerm o_11916 = null;
                    IStrategoTerm p_11916 = null;
                    IStrategoTerm u_11916 = null;
                    IStrategoTerm w_11916 = null;
                    IStrategoTerm x_11916 = null;
                    g_11916 = term.getSubterm(0);
                    h_11916 = term.getSubterm(1);
                    term = to_java_0_0.instance.invoke(context, g_11916);
                    if(term == null)
                      break Fail4646;
                    IStrategoTerm term2591 = term;
                    Success2570:
                    { 
                      Fail4647:
                      { 
                        term = concat_strings_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail4647;
                        if(true)
                          break Success2570;
                      }
                      term = term2591;
                      IStrategoTerm term2592 = term;
                      Success2571:
                      { 
                        Fail4648:
                        { 
                          term = is_string_0_0.instance.invoke(context, term);
                          if(term == null)
                            break Fail4648;
                          if(true)
                            break Success2571;
                        }
                        term = term2592;
                        IStrategoTerm term2593 = term;
                        Success2572:
                        { 
                          Fail4649:
                          { 
                            term = int_to_string_0_0.instance.invoke(context, term);
                            if(term == null)
                              break Fail4649;
                            if(true)
                              break Success2572;
                          }
                          term = term2593;
                          IStrategoTerm term2594 = term;
                          Success2573:
                          { 
                            Fail4650:
                            { 
                              term = real_to_string_0_0.instance.invoke(context, term);
                              if(term == null)
                                break Fail4650;
                              if(true)
                                break Success2573;
                            }
                            term = term2594;
                            IStrategoTerm i_11916 = null;
                            IStrategoTerm j_11916 = null;
                            IStrategoTerm l_11916 = null;
                            i_11916 = term;
                            term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                            if(term == null)
                              break Fail4646;
                            if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                              break Fail4646;
                            j_11916 = ((IStrategoList)term).tail();
                            l_11916 = j_11916;
                            term = report_failure_0_2.instance.invoke(context, l_11916, trans.const854, i_11916);
                            if(term == null)
                              break Fail4646;
                          }
                        }
                      }
                    }
                    o_11916 = term;
                    m_11916 = trans.const785;
                    p_11916 = o_11916;
                    term = string_replace_0_2.instance.invoke(context, p_11916, m_11916, trans.const785);
                    if(term == null)
                      break Fail4646;
                    a_11917 = term;
                    term = h_11916;
                    IStrategoTerm term2595 = term;
                    Success2574:
                    { 
                      Fail4651:
                      { 
                        term = concat_strings_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail4651;
                        if(true)
                          break Success2574;
                      }
                      term = term2595;
                      IStrategoTerm term2596 = term;
                      Success2575:
                      { 
                        Fail4652:
                        { 
                          term = is_string_0_0.instance.invoke(context, term);
                          if(term == null)
                            break Fail4652;
                          if(true)
                            break Success2575;
                        }
                        term = term2596;
                        IStrategoTerm term2597 = term;
                        Success2576:
                        { 
                          Fail4653:
                          { 
                            term = int_to_string_0_0.instance.invoke(context, term);
                            if(term == null)
                              break Fail4653;
                            if(true)
                              break Success2576;
                          }
                          term = term2597;
                          IStrategoTerm term2598 = term;
                          Success2577:
                          { 
                            Fail4654:
                            { 
                              term = real_to_string_0_0.instance.invoke(context, term);
                              if(term == null)
                                break Fail4654;
                              if(true)
                                break Success2577;
                            }
                            term = term2598;
                            IStrategoTerm q_11916 = null;
                            IStrategoTerm r_11916 = null;
                            IStrategoTerm t_11916 = null;
                            q_11916 = term;
                            term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                            if(term == null)
                              break Fail4646;
                            if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                              break Fail4646;
                            r_11916 = ((IStrategoList)term).tail();
                            t_11916 = r_11916;
                            term = report_failure_0_2.instance.invoke(context, t_11916, trans.const854, q_11916);
                            if(term == null)
                              break Fail4646;
                          }
                        }
                      }
                    }
                    w_11916 = term;
                    u_11916 = trans.const785;
                    x_11916 = w_11916;
                    term = string_replace_0_2.instance.invoke(context, x_11916, u_11916, trans.const859);
                    if(term == null)
                      break Fail4646;
                    term = (IStrategoTerm)termFactory.makeListCons(a_11917, termFactory.makeListCons(trans.const889, termFactory.makeListCons(term, (IStrategoList)trans.constNil3)));
                    term = concat_strings_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail4646;
                    term = termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil3));
                    if(true)
                      break Success2569;
                  }
                  term = term2571;
                }
                Success2578:
                { 
                  if(cons130 == Main._consCall_2)
                  { 
                    Fail4655:
                    { 
                      IStrategoTerm i_11915 = null;
                      IStrategoTerm j_11915 = null;
                      IStrategoTerm c_11916 = null;
                      IStrategoTerm o_11915 = null;
                      IStrategoTerm q_11915 = null;
                      IStrategoTerm r_11915 = null;
                      IStrategoTerm w_11915 = null;
                      IStrategoTerm y_11915 = null;
                      IStrategoTerm z_11915 = null;
                      i_11915 = term.getSubterm(0);
                      j_11915 = term.getSubterm(1);
                      term = i_11915;
                      IStrategoTerm term2600 = term;
                      Success2579:
                      { 
                        Fail4656:
                        { 
                          term = concat_strings_0_0.instance.invoke(context, term);
                          if(term == null)
                            break Fail4656;
                          if(true)
                            break Success2579;
                        }
                        term = term2600;
                        IStrategoTerm term2601 = term;
                        Success2580:
                        { 
                          Fail4657:
                          { 
                            term = is_string_0_0.instance.invoke(context, term);
                            if(term == null)
                              break Fail4657;
                            if(true)
                              break Success2580;
                          }
                          term = term2601;
                          IStrategoTerm term2602 = term;
                          Success2581:
                          { 
                            Fail4658:
                            { 
                              term = int_to_string_0_0.instance.invoke(context, term);
                              if(term == null)
                                break Fail4658;
                              if(true)
                                break Success2581;
                            }
                            term = term2602;
                            IStrategoTerm term2603 = term;
                            Success2582:
                            { 
                              Fail4659:
                              { 
                                term = real_to_string_0_0.instance.invoke(context, term);
                                if(term == null)
                                  break Fail4659;
                                if(true)
                                  break Success2582;
                              }
                              term = term2603;
                              IStrategoTerm k_11915 = null;
                              IStrategoTerm l_11915 = null;
                              IStrategoTerm n_11915 = null;
                              k_11915 = term;
                              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                              if(term == null)
                                break Fail4655;
                              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                                break Fail4655;
                              l_11915 = ((IStrategoList)term).tail();
                              n_11915 = l_11915;
                              term = report_failure_0_2.instance.invoke(context, n_11915, trans.const854, k_11915);
                              if(term == null)
                                break Fail4655;
                            }
                          }
                        }
                      }
                      q_11915 = term;
                      o_11915 = trans.const785;
                      r_11915 = q_11915;
                      term = string_replace_0_2.instance.invoke(context, r_11915, o_11915, trans.const785);
                      if(term == null)
                        break Fail4655;
                      c_11916 = term;
                      term = map_1_0.instance.invoke(context, j_11915, to_java_0_0.instance);
                      if(term == null)
                        break Fail4655;
                      IStrategoTerm term2604 = term;
                      Success2583:
                      { 
                        Fail4660:
                        { 
                          term = concat_strings_0_0.instance.invoke(context, term);
                          if(term == null)
                            break Fail4660;
                          if(true)
                            break Success2583;
                        }
                        term = term2604;
                        IStrategoTerm term2605 = term;
                        Success2584:
                        { 
                          Fail4661:
                          { 
                            term = is_string_0_0.instance.invoke(context, term);
                            if(term == null)
                              break Fail4661;
                            if(true)
                              break Success2584;
                          }
                          term = term2605;
                          IStrategoTerm term2606 = term;
                          Success2585:
                          { 
                            Fail4662:
                            { 
                              term = int_to_string_0_0.instance.invoke(context, term);
                              if(term == null)
                                break Fail4662;
                              if(true)
                                break Success2585;
                            }
                            term = term2606;
                            IStrategoTerm term2607 = term;
                            Success2586:
                            { 
                              Fail4663:
                              { 
                                term = real_to_string_0_0.instance.invoke(context, term);
                                if(term == null)
                                  break Fail4663;
                                if(true)
                                  break Success2586;
                              }
                              term = term2607;
                              IStrategoTerm s_11915 = null;
                              IStrategoTerm t_11915 = null;
                              IStrategoTerm v_11915 = null;
                              s_11915 = term;
                              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                              if(term == null)
                                break Fail4655;
                              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                                break Fail4655;
                              t_11915 = ((IStrategoList)term).tail();
                              v_11915 = t_11915;
                              term = report_failure_0_2.instance.invoke(context, v_11915, trans.const854, s_11915);
                              if(term == null)
                                break Fail4655;
                            }
                          }
                        }
                      }
                      y_11915 = term;
                      w_11915 = trans.const785;
                      z_11915 = y_11915;
                      term = string_replace_0_2.instance.invoke(context, z_11915, w_11915, trans.const857);
                      if(term == null)
                        break Fail4655;
                      term = (IStrategoTerm)termFactory.makeListCons(c_11916, termFactory.makeListCons(trans.const868, termFactory.makeListCons(term, (IStrategoList)trans.constCons242)));
                      term = concat_strings_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail4655;
                      term = termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil3));
                      if(true)
                        break Success2578;
                    }
                    term = term2571;
                  }
                  Success2587:
                  { 
                    if(cons130 == Main._consStringLit_1)
                    { 
                      Fail4664:
                      { 
                        IStrategoTerm h_11915 = null;
                        h_11915 = term.getSubterm(0);
                        term = h_11915;
                        if(true)
                          break Success2587;
                      }
                      term = term2571;
                    }
                    Success2588:
                    { 
                      if(cons130 == Main._consIntLit_1)
                      { 
                        Fail4665:
                        { 
                          IStrategoTerm g_11915 = null;
                          g_11915 = term.getSubterm(0);
                          term = g_11915;
                          if(true)
                            break Success2588;
                        }
                        term = term2571;
                      }
                      Success2589:
                      { 
                        if(cons130 == Main._consType_1)
                        { 
                          Fail4666:
                          { 
                            IStrategoTerm f_11915 = null;
                            f_11915 = term.getSubterm(0);
                            term = f_11915;
                            if(true)
                              break Success2589;
                          }
                          term = term2571;
                        }
                        Success2590:
                        { 
                          if(cons130 == Main._consStringType_0)
                          { 
                            Fail4667:
                            { 
                              term = trans.const780;
                              if(true)
                                break Success2590;
                            }
                            term = term2571;
                          }
                          if(cons130 == Main._consIntType_0)
                          { 
                            term = trans.const891;
                          }
                          else
                          { 
                            break Fail4608;
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