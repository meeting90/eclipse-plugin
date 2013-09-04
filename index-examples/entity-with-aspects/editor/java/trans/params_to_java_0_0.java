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
    Fail4712:
    { 
      IStrategoTerm term2655 = term;
      Success2634:
      { 
        Fail4713:
        { 
          if(term.getTermType() != IStrategoTerm.LIST || !((IStrategoList)term).isEmpty())
            break Fail4713;
          term = trans.const829;
          if(true)
            break Success2634;
        }
        term = term2655;
        IStrategoTerm term2656 = term;
        Success2635:
        { 
          Fail4714:
          { 
            IStrategoTerm w_11933 = null;
            IStrategoTerm x_11933 = null;
            IStrategoTerm y_11933 = null;
            IStrategoTerm z_11934 = null;
            IStrategoTerm d_11934 = null;
            IStrategoTerm f_11934 = null;
            IStrategoTerm g_11934 = null;
            IStrategoTerm a_11935 = null;
            IStrategoTerm l_11934 = null;
            IStrategoTerm n_11934 = null;
            IStrategoTerm o_11934 = null;
            IStrategoTerm t_11934 = null;
            IStrategoTerm v_11934 = null;
            IStrategoTerm w_11934 = null;
            if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
              break Fail4714;
            IStrategoTerm arg1440 = ((IStrategoList)term).head();
            if(arg1440.getTermType() != IStrategoTerm.APPL || Main._consParam_2 != ((IStrategoAppl)arg1440).getConstructor())
              break Fail4714;
            x_11933 = arg1440.getSubterm(0);
            w_11933 = arg1440.getSubterm(1);
            y_11933 = ((IStrategoList)term).tail();
            term = to_java_0_0.instance.invoke(context, w_11933);
            if(term == null)
              break Fail4714;
            IStrategoTerm term2657 = term;
            Success2636:
            { 
              Fail4715:
              { 
                term = concat_strings_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail4715;
                if(true)
                  break Success2636;
              }
              term = term2657;
              IStrategoTerm term2658 = term;
              Success2637:
              { 
                Fail4716:
                { 
                  term = is_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail4716;
                  if(true)
                    break Success2637;
                }
                term = term2658;
                IStrategoTerm term2659 = term;
                Success2638:
                { 
                  Fail4717:
                  { 
                    term = int_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail4717;
                    if(true)
                      break Success2638;
                  }
                  term = term2659;
                  IStrategoTerm term2660 = term;
                  Success2639:
                  { 
                    Fail4718:
                    { 
                      term = real_to_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail4718;
                      if(true)
                        break Success2639;
                    }
                    term = term2660;
                    IStrategoTerm z_11933 = null;
                    IStrategoTerm a_11934 = null;
                    IStrategoTerm c_11934 = null;
                    z_11933 = term;
                    term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                    if(term == null)
                      break Fail4714;
                    if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                      break Fail4714;
                    a_11934 = ((IStrategoList)term).tail();
                    c_11934 = a_11934;
                    term = report_failure_0_2.instance.invoke(context, c_11934, trans.const899, z_11933);
                    if(term == null)
                      break Fail4714;
                  }
                }
              }
            }
            f_11934 = term;
            d_11934 = trans.const785;
            g_11934 = f_11934;
            term = string_replace_0_2.instance.invoke(context, g_11934, d_11934, trans.const785);
            if(term == null)
              break Fail4714;
            z_11934 = term;
            term = x_11933;
            IStrategoTerm term2661 = term;
            Success2640:
            { 
              Fail4719:
              { 
                term = concat_strings_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail4719;
                if(true)
                  break Success2640;
              }
              term = term2661;
              IStrategoTerm term2662 = term;
              Success2641:
              { 
                Fail4720:
                { 
                  term = is_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail4720;
                  if(true)
                    break Success2641;
                }
                term = term2662;
                IStrategoTerm term2663 = term;
                Success2642:
                { 
                  Fail4721:
                  { 
                    term = int_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail4721;
                    if(true)
                      break Success2642;
                  }
                  term = term2663;
                  IStrategoTerm term2664 = term;
                  Success2643:
                  { 
                    Fail4722:
                    { 
                      term = real_to_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail4722;
                      if(true)
                        break Success2643;
                    }
                    term = term2664;
                    IStrategoTerm h_11934 = null;
                    IStrategoTerm i_11934 = null;
                    IStrategoTerm k_11934 = null;
                    h_11934 = term;
                    term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                    if(term == null)
                      break Fail4714;
                    if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                      break Fail4714;
                    i_11934 = ((IStrategoList)term).tail();
                    k_11934 = i_11934;
                    term = report_failure_0_2.instance.invoke(context, k_11934, trans.const899, h_11934);
                    if(term == null)
                      break Fail4714;
                  }
                }
              }
            }
            n_11934 = term;
            l_11934 = trans.const785;
            o_11934 = n_11934;
            term = string_replace_0_2.instance.invoke(context, o_11934, l_11934, trans.const878);
            if(term == null)
              break Fail4714;
            a_11935 = term;
            term = params_to_java2_0_0.instance.invoke(context, y_11933);
            if(term == null)
              break Fail4714;
            IStrategoTerm term2665 = term;
            Success2644:
            { 
              Fail4723:
              { 
                term = concat_strings_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail4723;
                if(true)
                  break Success2644;
              }
              term = term2665;
              IStrategoTerm term2666 = term;
              Success2645:
              { 
                Fail4724:
                { 
                  term = is_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail4724;
                  if(true)
                    break Success2645;
                }
                term = term2666;
                IStrategoTerm term2667 = term;
                Success2646:
                { 
                  Fail4725:
                  { 
                    term = int_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail4725;
                    if(true)
                      break Success2646;
                  }
                  term = term2667;
                  IStrategoTerm term2668 = term;
                  Success2647:
                  { 
                    Fail4726:
                    { 
                      term = real_to_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail4726;
                      if(true)
                        break Success2647;
                    }
                    term = term2668;
                    IStrategoTerm p_11934 = null;
                    IStrategoTerm q_11934 = null;
                    IStrategoTerm s_11934 = null;
                    p_11934 = term;
                    term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                    if(term == null)
                      break Fail4714;
                    if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                      break Fail4714;
                    q_11934 = ((IStrategoList)term).tail();
                    s_11934 = q_11934;
                    term = report_failure_0_2.instance.invoke(context, s_11934, trans.const899, p_11934);
                    if(term == null)
                      break Fail4714;
                  }
                }
              }
            }
            v_11934 = term;
            t_11934 = trans.const785;
            w_11934 = v_11934;
            term = string_replace_0_2.instance.invoke(context, w_11934, t_11934, trans.const860);
            if(term == null)
              break Fail4714;
            term = (IStrategoTerm)termFactory.makeListCons(z_11934, termFactory.makeListCons(trans.const867, termFactory.makeListCons(a_11935, termFactory.makeListCons(term, (IStrategoList)trans.constNil3))));
            term = concat_strings_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail4714;
            term = termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil3));
            if(true)
              break Success2635;
          }
          term = term2656;
          IStrategoTerm y_11932 = null;
          IStrategoTerm z_11932 = null;
          IStrategoTerm s_11933 = null;
          IStrategoTerm e_11933 = null;
          IStrategoTerm g_11933 = null;
          IStrategoTerm h_11933 = null;
          IStrategoTerm m_11933 = null;
          IStrategoTerm o_11933 = null;
          IStrategoTerm p_11933 = null;
          if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
            break Fail4712;
          IStrategoTerm arg1444 = ((IStrategoList)term).head();
          if(arg1444.getTermType() != IStrategoTerm.APPL || Main._consParam_2 != ((IStrategoAppl)arg1444).getConstructor())
            break Fail4712;
          z_11932 = arg1444.getSubterm(0);
          y_11932 = arg1444.getSubterm(1);
          IStrategoTerm arg1445 = ((IStrategoList)term).tail();
          if(arg1445.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg1445).isEmpty())
            break Fail4712;
          term = to_java_0_0.instance.invoke(context, y_11932);
          if(term == null)
            break Fail4712;
          IStrategoTerm term2669 = term;
          Success2648:
          { 
            Fail4727:
            { 
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail4727;
              if(true)
                break Success2648;
            }
            term = term2669;
            IStrategoTerm term2670 = term;
            Success2649:
            { 
              Fail4728:
              { 
                term = is_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail4728;
                if(true)
                  break Success2649;
              }
              term = term2670;
              IStrategoTerm term2671 = term;
              Success2650:
              { 
                Fail4729:
                { 
                  term = int_to_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail4729;
                  if(true)
                    break Success2650;
                }
                term = term2671;
                IStrategoTerm term2672 = term;
                Success2651:
                { 
                  Fail4730:
                  { 
                    term = real_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail4730;
                    if(true)
                      break Success2651;
                  }
                  term = term2672;
                  IStrategoTerm a_11933 = null;
                  IStrategoTerm b_11933 = null;
                  IStrategoTerm d_11933 = null;
                  a_11933 = term;
                  term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                  if(term == null)
                    break Fail4712;
                  if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                    break Fail4712;
                  b_11933 = ((IStrategoList)term).tail();
                  d_11933 = b_11933;
                  term = report_failure_0_2.instance.invoke(context, d_11933, trans.const899, a_11933);
                  if(term == null)
                    break Fail4712;
                }
              }
            }
          }
          g_11933 = term;
          e_11933 = trans.const785;
          h_11933 = g_11933;
          term = string_replace_0_2.instance.invoke(context, h_11933, e_11933, trans.const785);
          if(term == null)
            break Fail4712;
          s_11933 = term;
          term = z_11932;
          IStrategoTerm term2673 = term;
          Success2652:
          { 
            Fail4731:
            { 
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail4731;
              if(true)
                break Success2652;
            }
            term = term2673;
            IStrategoTerm term2674 = term;
            Success2653:
            { 
              Fail4732:
              { 
                term = is_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail4732;
                if(true)
                  break Success2653;
              }
              term = term2674;
              IStrategoTerm term2675 = term;
              Success2654:
              { 
                Fail4733:
                { 
                  term = int_to_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail4733;
                  if(true)
                    break Success2654;
                }
                term = term2675;
                IStrategoTerm term2676 = term;
                Success2655:
                { 
                  Fail4734:
                  { 
                    term = real_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail4734;
                    if(true)
                      break Success2655;
                  }
                  term = term2676;
                  IStrategoTerm i_11933 = null;
                  IStrategoTerm j_11933 = null;
                  IStrategoTerm l_11933 = null;
                  i_11933 = term;
                  term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                  if(term == null)
                    break Fail4712;
                  if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                    break Fail4712;
                  j_11933 = ((IStrategoList)term).tail();
                  l_11933 = j_11933;
                  term = report_failure_0_2.instance.invoke(context, l_11933, trans.const899, i_11933);
                  if(term == null)
                    break Fail4712;
                }
              }
            }
          }
          o_11933 = term;
          m_11933 = trans.const785;
          p_11933 = o_11933;
          term = string_replace_0_2.instance.invoke(context, p_11933, m_11933, trans.const878);
          if(term == null)
            break Fail4712;
          term = (IStrategoTerm)termFactory.makeListCons(s_11933, termFactory.makeListCons(trans.const867, termFactory.makeListCons(term, (IStrategoList)trans.constNil3)));
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail4712;
          term = termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil3));
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