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
    Fail4539:
    { 
      IStrategoTerm term2485 = term;
      IStrategoConstructor cons129 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success2464:
      { 
        if(cons129 == Main._consProperty_2)
        { 
          Fail4540:
          { 
            IStrategoTerm k_11924 = null;
            IStrategoTerm l_11924 = null;
            IStrategoTerm m_11924 = null;
            IStrategoTerm s_11927 = null;
            IStrategoTerm r_11924 = null;
            IStrategoTerm t_11924 = null;
            IStrategoTerm u_11924 = null;
            IStrategoTerm t_11927 = null;
            IStrategoTerm z_11924 = null;
            IStrategoTerm b_11925 = null;
            IStrategoTerm c_11925 = null;
            IStrategoTerm u_11927 = null;
            IStrategoTerm h_11925 = null;
            IStrategoTerm j_11925 = null;
            IStrategoTerm k_11925 = null;
            IStrategoTerm v_11927 = null;
            IStrategoTerm p_11925 = null;
            IStrategoTerm r_11925 = null;
            IStrategoTerm s_11925 = null;
            IStrategoTerm w_11927 = null;
            IStrategoTerm x_11925 = null;
            IStrategoTerm z_11925 = null;
            IStrategoTerm a_11926 = null;
            IStrategoTerm x_11927 = null;
            IStrategoTerm f_11926 = null;
            IStrategoTerm h_11926 = null;
            IStrategoTerm i_11926 = null;
            IStrategoTerm y_11927 = null;
            IStrategoTerm n_11926 = null;
            IStrategoTerm p_11926 = null;
            IStrategoTerm q_11926 = null;
            IStrategoTerm z_11927 = null;
            IStrategoTerm v_11926 = null;
            IStrategoTerm x_11926 = null;
            IStrategoTerm y_11926 = null;
            IStrategoTerm a_11928 = null;
            IStrategoTerm d_11927 = null;
            IStrategoTerm f_11927 = null;
            IStrategoTerm g_11927 = null;
            IStrategoTerm l_11927 = null;
            IStrategoTerm n_11927 = null;
            IStrategoTerm o_11927 = null;
            k_11924 = term.getSubterm(0);
            l_11924 = term.getSubterm(1);
            term = to_java_0_0.instance.invoke(context, l_11924);
            if(term == null)
              break Fail4540;
            m_11924 = term;
            term = m_11924;
            IStrategoTerm term2486 = term;
            Success2465:
            { 
              Fail4541:
              { 
                term = concat_strings_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail4541;
                if(true)
                  break Success2465;
              }
              term = term2486;
              IStrategoTerm term2487 = term;
              Success2466:
              { 
                Fail4542:
                { 
                  term = is_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail4542;
                  if(true)
                    break Success2466;
                }
                term = term2487;
                IStrategoTerm term2488 = term;
                Success2467:
                { 
                  Fail4543:
                  { 
                    term = int_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail4543;
                    if(true)
                      break Success2467;
                  }
                  term = term2488;
                  IStrategoTerm term2489 = term;
                  Success2468:
                  { 
                    Fail4544:
                    { 
                      term = real_to_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail4544;
                      if(true)
                        break Success2468;
                    }
                    term = term2489;
                    IStrategoTerm n_11924 = null;
                    IStrategoTerm o_11924 = null;
                    IStrategoTerm q_11924 = null;
                    n_11924 = term;
                    term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                    if(term == null)
                      break Fail4540;
                    if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                      break Fail4540;
                    o_11924 = ((IStrategoList)term).tail();
                    q_11924 = o_11924;
                    term = report_failure_0_2.instance.invoke(context, q_11924, trans.const854, n_11924);
                    if(term == null)
                      break Fail4540;
                  }
                }
              }
            }
            t_11924 = term;
            r_11924 = trans.const785;
            u_11924 = t_11924;
            term = string_replace_0_2.instance.invoke(context, u_11924, r_11924, trans.const855);
            if(term == null)
              break Fail4540;
            s_11927 = term;
            term = k_11924;
            IStrategoTerm term2490 = term;
            Success2469:
            { 
              Fail4545:
              { 
                term = concat_strings_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail4545;
                if(true)
                  break Success2469;
              }
              term = term2490;
              IStrategoTerm term2491 = term;
              Success2470:
              { 
                Fail4546:
                { 
                  term = is_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail4546;
                  if(true)
                    break Success2470;
                }
                term = term2491;
                IStrategoTerm term2492 = term;
                Success2471:
                { 
                  Fail4547:
                  { 
                    term = int_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail4547;
                    if(true)
                      break Success2471;
                  }
                  term = term2492;
                  IStrategoTerm term2493 = term;
                  Success2472:
                  { 
                    Fail4548:
                    { 
                      term = real_to_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail4548;
                      if(true)
                        break Success2472;
                    }
                    term = term2493;
                    IStrategoTerm v_11924 = null;
                    IStrategoTerm w_11924 = null;
                    IStrategoTerm y_11924 = null;
                    v_11924 = term;
                    term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                    if(term == null)
                      break Fail4540;
                    if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                      break Fail4540;
                    w_11924 = ((IStrategoList)term).tail();
                    y_11924 = w_11924;
                    term = report_failure_0_2.instance.invoke(context, y_11924, trans.const854, v_11924);
                    if(term == null)
                      break Fail4540;
                  }
                }
              }
            }
            b_11925 = term;
            z_11924 = trans.const785;
            c_11925 = b_11925;
            term = string_replace_0_2.instance.invoke(context, c_11925, z_11924, trans.const856);
            if(term == null)
              break Fail4540;
            t_11927 = term;
            term = m_11924;
            IStrategoTerm term2494 = term;
            Success2473:
            { 
              Fail4549:
              { 
                term = concat_strings_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail4549;
                if(true)
                  break Success2473;
              }
              term = term2494;
              IStrategoTerm term2495 = term;
              Success2474:
              { 
                Fail4550:
                { 
                  term = is_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail4550;
                  if(true)
                    break Success2474;
                }
                term = term2495;
                IStrategoTerm term2496 = term;
                Success2475:
                { 
                  Fail4551:
                  { 
                    term = int_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail4551;
                    if(true)
                      break Success2475;
                  }
                  term = term2496;
                  IStrategoTerm term2497 = term;
                  Success2476:
                  { 
                    Fail4552:
                    { 
                      term = real_to_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail4552;
                      if(true)
                        break Success2476;
                    }
                    term = term2497;
                    IStrategoTerm d_11925 = null;
                    IStrategoTerm e_11925 = null;
                    IStrategoTerm g_11925 = null;
                    d_11925 = term;
                    term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                    if(term == null)
                      break Fail4540;
                    if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                      break Fail4540;
                    e_11925 = ((IStrategoList)term).tail();
                    g_11925 = e_11925;
                    term = report_failure_0_2.instance.invoke(context, g_11925, trans.const854, d_11925);
                    if(term == null)
                      break Fail4540;
                  }
                }
              }
            }
            j_11925 = term;
            h_11925 = trans.const785;
            k_11925 = j_11925;
            term = string_replace_0_2.instance.invoke(context, k_11925, h_11925, trans.const857);
            if(term == null)
              break Fail4540;
            u_11927 = term;
            term = k_11924;
            IStrategoTerm term2498 = term;
            Success2477:
            { 
              Fail4553:
              { 
                term = concat_strings_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail4553;
                if(true)
                  break Success2477;
              }
              term = term2498;
              IStrategoTerm term2499 = term;
              Success2478:
              { 
                Fail4554:
                { 
                  term = is_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail4554;
                  if(true)
                    break Success2478;
                }
                term = term2499;
                IStrategoTerm term2500 = term;
                Success2479:
                { 
                  Fail4555:
                  { 
                    term = int_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail4555;
                    if(true)
                      break Success2479;
                  }
                  term = term2500;
                  IStrategoTerm term2501 = term;
                  Success2480:
                  { 
                    Fail4556:
                    { 
                      term = real_to_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail4556;
                      if(true)
                        break Success2480;
                    }
                    term = term2501;
                    IStrategoTerm l_11925 = null;
                    IStrategoTerm m_11925 = null;
                    IStrategoTerm o_11925 = null;
                    l_11925 = term;
                    term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                    if(term == null)
                      break Fail4540;
                    if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                      break Fail4540;
                    m_11925 = ((IStrategoList)term).tail();
                    o_11925 = m_11925;
                    term = report_failure_0_2.instance.invoke(context, o_11925, trans.const854, l_11925);
                    if(term == null)
                      break Fail4540;
                  }
                }
              }
            }
            r_11925 = term;
            p_11925 = trans.const785;
            s_11925 = r_11925;
            term = string_replace_0_2.instance.invoke(context, s_11925, p_11925, trans.const858);
            if(term == null)
              break Fail4540;
            v_11927 = term;
            term = k_11924;
            IStrategoTerm term2502 = term;
            Success2481:
            { 
              Fail4557:
              { 
                term = concat_strings_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail4557;
                if(true)
                  break Success2481;
              }
              term = term2502;
              IStrategoTerm term2503 = term;
              Success2482:
              { 
                Fail4558:
                { 
                  term = is_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail4558;
                  if(true)
                    break Success2482;
                }
                term = term2503;
                IStrategoTerm term2504 = term;
                Success2483:
                { 
                  Fail4559:
                  { 
                    term = int_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail4559;
                    if(true)
                      break Success2483;
                  }
                  term = term2504;
                  IStrategoTerm term2505 = term;
                  Success2484:
                  { 
                    Fail4560:
                    { 
                      term = real_to_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail4560;
                      if(true)
                        break Success2484;
                    }
                    term = term2505;
                    IStrategoTerm t_11925 = null;
                    IStrategoTerm u_11925 = null;
                    IStrategoTerm w_11925 = null;
                    t_11925 = term;
                    term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                    if(term == null)
                      break Fail4540;
                    if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                      break Fail4540;
                    u_11925 = ((IStrategoList)term).tail();
                    w_11925 = u_11925;
                    term = report_failure_0_2.instance.invoke(context, w_11925, trans.const854, t_11925);
                    if(term == null)
                      break Fail4540;
                  }
                }
              }
            }
            z_11925 = term;
            x_11925 = trans.const785;
            a_11926 = z_11925;
            term = string_replace_0_2.instance.invoke(context, a_11926, x_11925, trans.const852);
            if(term == null)
              break Fail4540;
            w_11927 = term;
            term = k_11924;
            IStrategoTerm term2506 = term;
            Success2485:
            { 
              Fail4561:
              { 
                term = concat_strings_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail4561;
                if(true)
                  break Success2485;
              }
              term = term2506;
              IStrategoTerm term2507 = term;
              Success2486:
              { 
                Fail4562:
                { 
                  term = is_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail4562;
                  if(true)
                    break Success2486;
                }
                term = term2507;
                IStrategoTerm term2508 = term;
                Success2487:
                { 
                  Fail4563:
                  { 
                    term = int_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail4563;
                    if(true)
                      break Success2487;
                  }
                  term = term2508;
                  IStrategoTerm term2509 = term;
                  Success2488:
                  { 
                    Fail4564:
                    { 
                      term = real_to_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail4564;
                      if(true)
                        break Success2488;
                    }
                    term = term2509;
                    IStrategoTerm b_11926 = null;
                    IStrategoTerm c_11926 = null;
                    IStrategoTerm e_11926 = null;
                    b_11926 = term;
                    term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                    if(term == null)
                      break Fail4540;
                    if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                      break Fail4540;
                    c_11926 = ((IStrategoList)term).tail();
                    e_11926 = c_11926;
                    term = report_failure_0_2.instance.invoke(context, e_11926, trans.const854, b_11926);
                    if(term == null)
                      break Fail4540;
                  }
                }
              }
            }
            h_11926 = term;
            f_11926 = trans.const785;
            i_11926 = h_11926;
            term = string_replace_0_2.instance.invoke(context, i_11926, f_11926, trans.const859);
            if(term == null)
              break Fail4540;
            x_11927 = term;
            term = m_11924;
            IStrategoTerm term2510 = term;
            Success2489:
            { 
              Fail4565:
              { 
                term = concat_strings_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail4565;
                if(true)
                  break Success2489;
              }
              term = term2510;
              IStrategoTerm term2511 = term;
              Success2490:
              { 
                Fail4566:
                { 
                  term = is_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail4566;
                  if(true)
                    break Success2490;
                }
                term = term2511;
                IStrategoTerm term2512 = term;
                Success2491:
                { 
                  Fail4567:
                  { 
                    term = int_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail4567;
                    if(true)
                      break Success2491;
                  }
                  term = term2512;
                  IStrategoTerm term2513 = term;
                  Success2492:
                  { 
                    Fail4568:
                    { 
                      term = real_to_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail4568;
                      if(true)
                        break Success2492;
                    }
                    term = term2513;
                    IStrategoTerm j_11926 = null;
                    IStrategoTerm k_11926 = null;
                    IStrategoTerm m_11926 = null;
                    j_11926 = term;
                    term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                    if(term == null)
                      break Fail4540;
                    if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                      break Fail4540;
                    k_11926 = ((IStrategoList)term).tail();
                    m_11926 = k_11926;
                    term = report_failure_0_2.instance.invoke(context, m_11926, trans.const854, j_11926);
                    if(term == null)
                      break Fail4540;
                  }
                }
              }
            }
            p_11926 = term;
            n_11926 = trans.const785;
            q_11926 = p_11926;
            term = string_replace_0_2.instance.invoke(context, q_11926, n_11926, trans.const860);
            if(term == null)
              break Fail4540;
            y_11927 = term;
            term = k_11924;
            IStrategoTerm term2514 = term;
            Success2493:
            { 
              Fail4569:
              { 
                term = concat_strings_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail4569;
                if(true)
                  break Success2493;
              }
              term = term2514;
              IStrategoTerm term2515 = term;
              Success2494:
              { 
                Fail4570:
                { 
                  term = is_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail4570;
                  if(true)
                    break Success2494;
                }
                term = term2515;
                IStrategoTerm term2516 = term;
                Success2495:
                { 
                  Fail4571:
                  { 
                    term = int_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail4571;
                    if(true)
                      break Success2495;
                  }
                  term = term2516;
                  IStrategoTerm term2517 = term;
                  Success2496:
                  { 
                    Fail4572:
                    { 
                      term = real_to_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail4572;
                      if(true)
                        break Success2496;
                    }
                    term = term2517;
                    IStrategoTerm r_11926 = null;
                    IStrategoTerm s_11926 = null;
                    IStrategoTerm u_11926 = null;
                    r_11926 = term;
                    term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                    if(term == null)
                      break Fail4540;
                    if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                      break Fail4540;
                    s_11926 = ((IStrategoList)term).tail();
                    u_11926 = s_11926;
                    term = report_failure_0_2.instance.invoke(context, u_11926, trans.const854, r_11926);
                    if(term == null)
                      break Fail4540;
                  }
                }
              }
            }
            x_11926 = term;
            v_11926 = trans.const785;
            y_11926 = x_11926;
            term = string_replace_0_2.instance.invoke(context, y_11926, v_11926, trans.const861);
            if(term == null)
              break Fail4540;
            z_11927 = term;
            term = k_11924;
            IStrategoTerm term2518 = term;
            Success2497:
            { 
              Fail4573:
              { 
                term = concat_strings_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail4573;
                if(true)
                  break Success2497;
              }
              term = term2518;
              IStrategoTerm term2519 = term;
              Success2498:
              { 
                Fail4574:
                { 
                  term = is_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail4574;
                  if(true)
                    break Success2498;
                }
                term = term2519;
                IStrategoTerm term2520 = term;
                Success2499:
                { 
                  Fail4575:
                  { 
                    term = int_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail4575;
                    if(true)
                      break Success2499;
                  }
                  term = term2520;
                  IStrategoTerm term2521 = term;
                  Success2500:
                  { 
                    Fail4576:
                    { 
                      term = real_to_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail4576;
                      if(true)
                        break Success2500;
                    }
                    term = term2521;
                    IStrategoTerm z_11926 = null;
                    IStrategoTerm a_11927 = null;
                    IStrategoTerm c_11927 = null;
                    z_11926 = term;
                    term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                    if(term == null)
                      break Fail4540;
                    if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                      break Fail4540;
                    a_11927 = ((IStrategoList)term).tail();
                    c_11927 = a_11927;
                    term = report_failure_0_2.instance.invoke(context, c_11927, trans.const854, z_11926);
                    if(term == null)
                      break Fail4540;
                  }
                }
              }
            }
            f_11927 = term;
            d_11927 = trans.const785;
            g_11927 = f_11927;
            term = string_replace_0_2.instance.invoke(context, g_11927, d_11927, trans.const862);
            if(term == null)
              break Fail4540;
            a_11928 = term;
            term = k_11924;
            IStrategoTerm term2522 = term;
            Success2501:
            { 
              Fail4577:
              { 
                term = concat_strings_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail4577;
                if(true)
                  break Success2501;
              }
              term = term2522;
              IStrategoTerm term2523 = term;
              Success2502:
              { 
                Fail4578:
                { 
                  term = is_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail4578;
                  if(true)
                    break Success2502;
                }
                term = term2523;
                IStrategoTerm term2524 = term;
                Success2503:
                { 
                  Fail4579:
                  { 
                    term = int_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail4579;
                    if(true)
                      break Success2503;
                  }
                  term = term2524;
                  IStrategoTerm term2525 = term;
                  Success2504:
                  { 
                    Fail4580:
                    { 
                      term = real_to_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail4580;
                      if(true)
                        break Success2504;
                    }
                    term = term2525;
                    IStrategoTerm h_11927 = null;
                    IStrategoTerm i_11927 = null;
                    IStrategoTerm k_11927 = null;
                    h_11927 = term;
                    term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                    if(term == null)
                      break Fail4540;
                    if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                      break Fail4540;
                    i_11927 = ((IStrategoList)term).tail();
                    k_11927 = i_11927;
                    term = report_failure_0_2.instance.invoke(context, k_11927, trans.const854, h_11927);
                    if(term == null)
                      break Fail4540;
                  }
                }
              }
            }
            n_11927 = term;
            l_11927 = trans.const785;
            o_11927 = n_11927;
            term = string_replace_0_2.instance.invoke(context, o_11927, l_11927, trans.const863);
            if(term == null)
              break Fail4540;
            term = (IStrategoTerm)termFactory.makeListCons(trans.const873, termFactory.makeListCons(s_11927, termFactory.makeListCons(trans.const867, termFactory.makeListCons(t_11927, termFactory.makeListCons(trans.const872, termFactory.makeListCons(u_11927, termFactory.makeListCons(trans.const871, termFactory.makeListCons(v_11927, termFactory.makeListCons(trans.const870, termFactory.makeListCons(w_11927, termFactory.makeListCons(trans.const869, termFactory.makeListCons(x_11927, termFactory.makeListCons(trans.const868, termFactory.makeListCons(y_11927, termFactory.makeListCons(trans.const867, termFactory.makeListCons(z_11927, termFactory.makeListCons(trans.const866, termFactory.makeListCons(a_11928, termFactory.makeListCons(trans.const865, termFactory.makeListCons(term, (IStrategoList)trans.constCons237))))))))))))))))))));
            term = concat_strings_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail4540;
            term = termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil3));
            if(true)
              break Success2464;
          }
          term = term2485;
        }
        Success2505:
        { 
          if(cons129 == Main._consFunction_3)
          { 
            Fail4581:
            { 
              IStrategoTerm b_11923 = null;
              IStrategoTerm c_11923 = null;
              IStrategoTerm d_11923 = null;
              IStrategoTerm e_11924 = null;
              IStrategoTerm i_11923 = null;
              IStrategoTerm k_11923 = null;
              IStrategoTerm l_11923 = null;
              IStrategoTerm f_11924 = null;
              IStrategoTerm q_11923 = null;
              IStrategoTerm s_11923 = null;
              IStrategoTerm t_11923 = null;
              IStrategoTerm y_11923 = null;
              IStrategoTerm a_11924 = null;
              IStrategoTerm b_11924 = null;
              b_11923 = term.getSubterm(0);
              c_11923 = term.getSubterm(1);
              d_11923 = term.getSubterm(2);
              term = b_11923;
              IStrategoTerm term2527 = term;
              Success2506:
              { 
                Fail4582:
                { 
                  term = concat_strings_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail4582;
                  if(true)
                    break Success2506;
                }
                term = term2527;
                IStrategoTerm term2528 = term;
                Success2507:
                { 
                  Fail4583:
                  { 
                    term = is_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail4583;
                    if(true)
                      break Success2507;
                  }
                  term = term2528;
                  IStrategoTerm term2529 = term;
                  Success2508:
                  { 
                    Fail4584:
                    { 
                      term = int_to_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail4584;
                      if(true)
                        break Success2508;
                    }
                    term = term2529;
                    IStrategoTerm term2530 = term;
                    Success2509:
                    { 
                      Fail4585:
                      { 
                        term = real_to_string_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail4585;
                        if(true)
                          break Success2509;
                      }
                      term = term2530;
                      IStrategoTerm e_11923 = null;
                      IStrategoTerm f_11923 = null;
                      IStrategoTerm h_11923 = null;
                      e_11923 = term;
                      term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                      if(term == null)
                        break Fail4581;
                      if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                        break Fail4581;
                      f_11923 = ((IStrategoList)term).tail();
                      h_11923 = f_11923;
                      term = report_failure_0_2.instance.invoke(context, h_11923, trans.const854, e_11923);
                      if(term == null)
                        break Fail4581;
                    }
                  }
                }
              }
              k_11923 = term;
              i_11923 = trans.const785;
              l_11923 = k_11923;
              term = string_replace_0_2.instance.invoke(context, l_11923, i_11923, trans.const874);
              if(term == null)
                break Fail4581;
              e_11924 = term;
              term = params_to_java_0_0.instance.invoke(context, c_11923);
              if(term == null)
                break Fail4581;
              IStrategoTerm term2531 = term;
              Success2510:
              { 
                Fail4586:
                { 
                  term = concat_strings_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail4586;
                  if(true)
                    break Success2510;
                }
                term = term2531;
                IStrategoTerm term2532 = term;
                Success2511:
                { 
                  Fail4587:
                  { 
                    term = is_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail4587;
                    if(true)
                      break Success2511;
                  }
                  term = term2532;
                  IStrategoTerm term2533 = term;
                  Success2512:
                  { 
                    Fail4588:
                    { 
                      term = int_to_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail4588;
                      if(true)
                        break Success2512;
                    }
                    term = term2533;
                    IStrategoTerm term2534 = term;
                    Success2513:
                    { 
                      Fail4589:
                      { 
                        term = real_to_string_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail4589;
                        if(true)
                          break Success2513;
                      }
                      term = term2534;
                      IStrategoTerm m_11923 = null;
                      IStrategoTerm n_11923 = null;
                      IStrategoTerm p_11923 = null;
                      m_11923 = term;
                      term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                      if(term == null)
                        break Fail4581;
                      if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                        break Fail4581;
                      n_11923 = ((IStrategoList)term).tail();
                      p_11923 = n_11923;
                      term = report_failure_0_2.instance.invoke(context, p_11923, trans.const854, m_11923);
                      if(term == null)
                        break Fail4581;
                    }
                  }
                }
              }
              s_11923 = term;
              q_11923 = trans.const785;
              t_11923 = s_11923;
              term = string_replace_0_2.instance.invoke(context, t_11923, q_11923, trans.const856);
              if(term == null)
                break Fail4581;
              f_11924 = term;
              term = to_java_0_0.instance.invoke(context, d_11923);
              if(term == null)
                break Fail4581;
              IStrategoTerm term2535 = term;
              Success2514:
              { 
                Fail4590:
                { 
                  term = concat_strings_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail4590;
                  if(true)
                    break Success2514;
                }
                term = term2535;
                IStrategoTerm term2536 = term;
                Success2515:
                { 
                  Fail4591:
                  { 
                    term = is_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail4591;
                    if(true)
                      break Success2515;
                  }
                  term = term2536;
                  IStrategoTerm term2537 = term;
                  Success2516:
                  { 
                    Fail4592:
                    { 
                      term = int_to_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail4592;
                      if(true)
                        break Success2516;
                    }
                    term = term2537;
                    IStrategoTerm term2538 = term;
                    Success2517:
                    { 
                      Fail4593:
                      { 
                        term = real_to_string_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail4593;
                        if(true)
                          break Success2517;
                      }
                      term = term2538;
                      IStrategoTerm u_11923 = null;
                      IStrategoTerm v_11923 = null;
                      IStrategoTerm x_11923 = null;
                      u_11923 = term;
                      term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                      if(term == null)
                        break Fail4581;
                      if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                        break Fail4581;
                      v_11923 = ((IStrategoList)term).tail();
                      x_11923 = v_11923;
                      term = report_failure_0_2.instance.invoke(context, x_11923, trans.const854, u_11923);
                      if(term == null)
                        break Fail4581;
                    }
                  }
                }
              }
              a_11924 = term;
              y_11923 = trans.const785;
              b_11924 = a_11924;
              term = string_replace_0_2.instance.invoke(context, b_11924, y_11923, trans.const785);
              if(term == null)
                break Fail4581;
              term = (IStrategoTerm)termFactory.makeListCons(trans.const877, termFactory.makeListCons(e_11924, termFactory.makeListCons(trans.const868, termFactory.makeListCons(f_11924, termFactory.makeListCons(trans.const876, termFactory.makeListCons(term, (IStrategoList)trans.constCons238))))));
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail4581;
              term = termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil3));
              if(true)
                break Success2505;
            }
            term = term2485;
          }
          Success2518:
          { 
            if(cons129 == Main._consParam_2)
            { 
              Fail4594:
              { 
                IStrategoTerm d_11922 = null;
                IStrategoTerm e_11922 = null;
                IStrategoTerm x_11922 = null;
                IStrategoTerm j_11922 = null;
                IStrategoTerm l_11922 = null;
                IStrategoTerm m_11922 = null;
                IStrategoTerm r_11922 = null;
                IStrategoTerm t_11922 = null;
                IStrategoTerm u_11922 = null;
                e_11922 = term.getSubterm(0);
                d_11922 = term.getSubterm(1);
                term = to_java_0_0.instance.invoke(context, d_11922);
                if(term == null)
                  break Fail4594;
                IStrategoTerm term2540 = term;
                Success2519:
                { 
                  Fail4595:
                  { 
                    term = concat_strings_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail4595;
                    if(true)
                      break Success2519;
                  }
                  term = term2540;
                  IStrategoTerm term2541 = term;
                  Success2520:
                  { 
                    Fail4596:
                    { 
                      term = is_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail4596;
                      if(true)
                        break Success2520;
                    }
                    term = term2541;
                    IStrategoTerm term2542 = term;
                    Success2521:
                    { 
                      Fail4597:
                      { 
                        term = int_to_string_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail4597;
                        if(true)
                          break Success2521;
                      }
                      term = term2542;
                      IStrategoTerm term2543 = term;
                      Success2522:
                      { 
                        Fail4598:
                        { 
                          term = real_to_string_0_0.instance.invoke(context, term);
                          if(term == null)
                            break Fail4598;
                          if(true)
                            break Success2522;
                        }
                        term = term2543;
                        IStrategoTerm f_11922 = null;
                        IStrategoTerm g_11922 = null;
                        IStrategoTerm i_11922 = null;
                        f_11922 = term;
                        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                        if(term == null)
                          break Fail4594;
                        if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                          break Fail4594;
                        g_11922 = ((IStrategoList)term).tail();
                        i_11922 = g_11922;
                        term = report_failure_0_2.instance.invoke(context, i_11922, trans.const854, f_11922);
                        if(term == null)
                          break Fail4594;
                      }
                    }
                  }
                }
                l_11922 = term;
                j_11922 = trans.const785;
                m_11922 = l_11922;
                term = string_replace_0_2.instance.invoke(context, m_11922, j_11922, trans.const785);
                if(term == null)
                  break Fail4594;
                x_11922 = term;
                term = e_11922;
                IStrategoTerm term2544 = term;
                Success2523:
                { 
                  Fail4599:
                  { 
                    term = concat_strings_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail4599;
                    if(true)
                      break Success2523;
                  }
                  term = term2544;
                  IStrategoTerm term2545 = term;
                  Success2524:
                  { 
                    Fail4600:
                    { 
                      term = is_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail4600;
                      if(true)
                        break Success2524;
                    }
                    term = term2545;
                    IStrategoTerm term2546 = term;
                    Success2525:
                    { 
                      Fail4601:
                      { 
                        term = int_to_string_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail4601;
                        if(true)
                          break Success2525;
                      }
                      term = term2546;
                      IStrategoTerm term2547 = term;
                      Success2526:
                      { 
                        Fail4602:
                        { 
                          term = real_to_string_0_0.instance.invoke(context, term);
                          if(term == null)
                            break Fail4602;
                          if(true)
                            break Success2526;
                        }
                        term = term2547;
                        IStrategoTerm n_11922 = null;
                        IStrategoTerm o_11922 = null;
                        IStrategoTerm q_11922 = null;
                        n_11922 = term;
                        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                        if(term == null)
                          break Fail4594;
                        if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                          break Fail4594;
                        o_11922 = ((IStrategoList)term).tail();
                        q_11922 = o_11922;
                        term = report_failure_0_2.instance.invoke(context, q_11922, trans.const854, n_11922);
                        if(term == null)
                          break Fail4594;
                      }
                    }
                  }
                }
                t_11922 = term;
                r_11922 = trans.const785;
                u_11922 = t_11922;
                term = string_replace_0_2.instance.invoke(context, u_11922, r_11922, trans.const878);
                if(term == null)
                  break Fail4594;
                term = (IStrategoTerm)termFactory.makeListCons(x_11922, termFactory.makeListCons(trans.const867, termFactory.makeListCons(term, (IStrategoList)trans.constNil3)));
                term = concat_strings_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail4594;
                term = termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil3));
                if(true)
                  break Success2518;
              }
              term = term2485;
            }
            Success2527:
            { 
              if(cons129 == Main._consBlock_1)
              { 
                Fail4603:
                { 
                  IStrategoTerm q_11921 = null;
                  IStrategoTerm v_11921 = null;
                  IStrategoTerm x_11921 = null;
                  IStrategoTerm y_11921 = null;
                  q_11921 = term.getSubterm(0);
                  term = map_1_0.instance.invoke(context, q_11921, to_java_0_0.instance);
                  if(term == null)
                    break Fail4603;
                  IStrategoTerm term2549 = term;
                  Success2528:
                  { 
                    Fail4604:
                    { 
                      term = concat_strings_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail4604;
                      if(true)
                        break Success2528;
                    }
                    term = term2549;
                    IStrategoTerm term2550 = term;
                    Success2529:
                    { 
                      Fail4605:
                      { 
                        term = is_string_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail4605;
                        if(true)
                          break Success2529;
                      }
                      term = term2550;
                      IStrategoTerm term2551 = term;
                      Success2530:
                      { 
                        Fail4606:
                        { 
                          term = int_to_string_0_0.instance.invoke(context, term);
                          if(term == null)
                            break Fail4606;
                          if(true)
                            break Success2530;
                        }
                        term = term2551;
                        IStrategoTerm term2552 = term;
                        Success2531:
                        { 
                          Fail4607:
                          { 
                            term = real_to_string_0_0.instance.invoke(context, term);
                            if(term == null)
                              break Fail4607;
                            if(true)
                              break Success2531;
                          }
                          term = term2552;
                          IStrategoTerm r_11921 = null;
                          IStrategoTerm s_11921 = null;
                          IStrategoTerm u_11921 = null;
                          r_11921 = term;
                          term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                          if(term == null)
                            break Fail4603;
                          if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                            break Fail4603;
                          s_11921 = ((IStrategoList)term).tail();
                          u_11921 = s_11921;
                          term = report_failure_0_2.instance.invoke(context, u_11921, trans.const854, r_11921);
                          if(term == null)
                            break Fail4603;
                        }
                      }
                    }
                  }
                  x_11921 = term;
                  v_11921 = trans.const785;
                  y_11921 = x_11921;
                  term = string_replace_0_2.instance.invoke(context, y_11921, v_11921, trans.const879);
                  if(term == null)
                    break Fail4603;
                  term = (IStrategoTerm)termFactory.makeListCons(trans.const881, termFactory.makeListCons(term, (IStrategoList)trans.constCons239));
                  term = concat_strings_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail4603;
                  term = termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil3));
                  if(true)
                    break Success2527;
                }
                term = term2485;
              }
              term = to_java_0_0_fragment_0.instance.invoke(context, term);
              if(term == null)
                break Fail4539;
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