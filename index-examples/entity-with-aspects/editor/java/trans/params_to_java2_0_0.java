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
    Fail4735:
    { 
      IStrategoTerm term2677 = term;
      Success2656:
      { 
        Fail4736:
        { 
          IStrategoTerm d_11936 = null;
          IStrategoTerm e_11936 = null;
          IStrategoTerm f_11936 = null;
          IStrategoTerm g_11937 = null;
          IStrategoTerm k_11936 = null;
          IStrategoTerm m_11936 = null;
          IStrategoTerm n_11936 = null;
          IStrategoTerm h_11937 = null;
          IStrategoTerm s_11936 = null;
          IStrategoTerm u_11936 = null;
          IStrategoTerm v_11936 = null;
          IStrategoTerm a_11937 = null;
          IStrategoTerm c_11937 = null;
          IStrategoTerm d_11937 = null;
          if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
            break Fail4736;
          IStrategoTerm arg1448 = ((IStrategoList)term).head();
          if(arg1448.getTermType() != IStrategoTerm.APPL || Main._consParam_2 != ((IStrategoAppl)arg1448).getConstructor())
            break Fail4736;
          e_11936 = arg1448.getSubterm(0);
          d_11936 = arg1448.getSubterm(1);
          f_11936 = ((IStrategoList)term).tail();
          term = to_java_0_0.instance.invoke(context, d_11936);
          if(term == null)
            break Fail4736;
          IStrategoTerm term2678 = term;
          Success2657:
          { 
            Fail4737:
            { 
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail4737;
              if(true)
                break Success2657;
            }
            term = term2678;
            IStrategoTerm term2679 = term;
            Success2658:
            { 
              Fail4738:
              { 
                term = is_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail4738;
                if(true)
                  break Success2658;
              }
              term = term2679;
              IStrategoTerm term2680 = term;
              Success2659:
              { 
                Fail4739:
                { 
                  term = int_to_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail4739;
                  if(true)
                    break Success2659;
                }
                term = term2680;
                IStrategoTerm term2681 = term;
                Success2660:
                { 
                  Fail4740:
                  { 
                    term = real_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail4740;
                    if(true)
                      break Success2660;
                  }
                  term = term2681;
                  IStrategoTerm g_11936 = null;
                  IStrategoTerm h_11936 = null;
                  IStrategoTerm j_11936 = null;
                  g_11936 = term;
                  term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                  if(term == null)
                    break Fail4736;
                  if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                    break Fail4736;
                  h_11936 = ((IStrategoList)term).tail();
                  j_11936 = h_11936;
                  term = report_failure_0_2.instance.invoke(context, j_11936, trans.const900, g_11936);
                  if(term == null)
                    break Fail4736;
                }
              }
            }
          }
          m_11936 = term;
          k_11936 = trans.const785;
          n_11936 = m_11936;
          term = string_replace_0_2.instance.invoke(context, n_11936, k_11936, trans.const901);
          if(term == null)
            break Fail4736;
          g_11937 = term;
          term = e_11936;
          IStrategoTerm term2682 = term;
          Success2661:
          { 
            Fail4741:
            { 
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail4741;
              if(true)
                break Success2661;
            }
            term = term2682;
            IStrategoTerm term2683 = term;
            Success2662:
            { 
              Fail4742:
              { 
                term = is_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail4742;
                if(true)
                  break Success2662;
              }
              term = term2683;
              IStrategoTerm term2684 = term;
              Success2663:
              { 
                Fail4743:
                { 
                  term = int_to_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail4743;
                  if(true)
                    break Success2663;
                }
                term = term2684;
                IStrategoTerm term2685 = term;
                Success2664:
                { 
                  Fail4744:
                  { 
                    term = real_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail4744;
                    if(true)
                      break Success2664;
                  }
                  term = term2685;
                  IStrategoTerm o_11936 = null;
                  IStrategoTerm p_11936 = null;
                  IStrategoTerm r_11936 = null;
                  o_11936 = term;
                  term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                  if(term == null)
                    break Fail4736;
                  if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                    break Fail4736;
                  p_11936 = ((IStrategoList)term).tail();
                  r_11936 = p_11936;
                  term = report_failure_0_2.instance.invoke(context, r_11936, trans.const900, o_11936);
                  if(term == null)
                    break Fail4736;
                }
              }
            }
          }
          u_11936 = term;
          s_11936 = trans.const785;
          v_11936 = u_11936;
          term = string_replace_0_2.instance.invoke(context, v_11936, s_11936, trans.const856);
          if(term == null)
            break Fail4736;
          h_11937 = term;
          term = this.invoke(context, f_11936);
          if(term == null)
            break Fail4736;
          IStrategoTerm term2686 = term;
          Success2665:
          { 
            Fail4745:
            { 
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail4745;
              if(true)
                break Success2665;
            }
            term = term2686;
            IStrategoTerm term2687 = term;
            Success2666:
            { 
              Fail4746:
              { 
                term = is_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail4746;
                if(true)
                  break Success2666;
              }
              term = term2687;
              IStrategoTerm term2688 = term;
              Success2667:
              { 
                Fail4747:
                { 
                  term = int_to_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail4747;
                  if(true)
                    break Success2667;
                }
                term = term2688;
                IStrategoTerm term2689 = term;
                Success2668:
                { 
                  Fail4748:
                  { 
                    term = real_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail4748;
                    if(true)
                      break Success2668;
                  }
                  term = term2689;
                  IStrategoTerm w_11936 = null;
                  IStrategoTerm x_11936 = null;
                  IStrategoTerm z_11936 = null;
                  w_11936 = term;
                  term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                  if(term == null)
                    break Fail4736;
                  if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                    break Fail4736;
                  x_11936 = ((IStrategoList)term).tail();
                  z_11936 = x_11936;
                  term = report_failure_0_2.instance.invoke(context, z_11936, trans.const900, w_11936);
                  if(term == null)
                    break Fail4736;
                }
              }
            }
          }
          c_11937 = term;
          a_11937 = trans.const785;
          d_11937 = c_11937;
          term = string_replace_0_2.instance.invoke(context, d_11937, a_11937, trans.const902);
          if(term == null)
            break Fail4736;
          term = (IStrategoTerm)termFactory.makeListCons(trans.const903, termFactory.makeListCons(g_11937, termFactory.makeListCons(trans.const867, termFactory.makeListCons(h_11937, termFactory.makeListCons(term, (IStrategoList)trans.constNil3)))));
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail4736;
          term = termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil3));
          if(true)
            break Success2656;
        }
        term = term2677;
        IStrategoTerm f_11935 = null;
        IStrategoTerm g_11935 = null;
        IStrategoTerm z_11935 = null;
        IStrategoTerm l_11935 = null;
        IStrategoTerm n_11935 = null;
        IStrategoTerm o_11935 = null;
        IStrategoTerm t_11935 = null;
        IStrategoTerm v_11935 = null;
        IStrategoTerm w_11935 = null;
        if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
          break Fail4735;
        IStrategoTerm arg1452 = ((IStrategoList)term).head();
        if(arg1452.getTermType() != IStrategoTerm.APPL || Main._consParam_2 != ((IStrategoAppl)arg1452).getConstructor())
          break Fail4735;
        g_11935 = arg1452.getSubterm(0);
        f_11935 = arg1452.getSubterm(1);
        IStrategoTerm arg1453 = ((IStrategoList)term).tail();
        if(arg1453.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg1453).isEmpty())
          break Fail4735;
        term = to_java_0_0.instance.invoke(context, f_11935);
        if(term == null)
          break Fail4735;
        IStrategoTerm term2690 = term;
        Success2669:
        { 
          Fail4749:
          { 
            term = concat_strings_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail4749;
            if(true)
              break Success2669;
          }
          term = term2690;
          IStrategoTerm term2691 = term;
          Success2670:
          { 
            Fail4750:
            { 
              term = is_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail4750;
              if(true)
                break Success2670;
            }
            term = term2691;
            IStrategoTerm term2692 = term;
            Success2671:
            { 
              Fail4751:
              { 
                term = int_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail4751;
                if(true)
                  break Success2671;
              }
              term = term2692;
              IStrategoTerm term2693 = term;
              Success2672:
              { 
                Fail4752:
                { 
                  term = real_to_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail4752;
                  if(true)
                    break Success2672;
                }
                term = term2693;
                IStrategoTerm h_11935 = null;
                IStrategoTerm i_11935 = null;
                IStrategoTerm k_11935 = null;
                h_11935 = term;
                term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                if(term == null)
                  break Fail4735;
                if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                  break Fail4735;
                i_11935 = ((IStrategoList)term).tail();
                k_11935 = i_11935;
                term = report_failure_0_2.instance.invoke(context, k_11935, trans.const900, h_11935);
                if(term == null)
                  break Fail4735;
              }
            }
          }
        }
        n_11935 = term;
        l_11935 = trans.const785;
        o_11935 = n_11935;
        term = string_replace_0_2.instance.invoke(context, o_11935, l_11935, trans.const901);
        if(term == null)
          break Fail4735;
        z_11935 = term;
        term = g_11935;
        IStrategoTerm term2694 = term;
        Success2673:
        { 
          Fail4753:
          { 
            term = concat_strings_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail4753;
            if(true)
              break Success2673;
          }
          term = term2694;
          IStrategoTerm term2695 = term;
          Success2674:
          { 
            Fail4754:
            { 
              term = is_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail4754;
              if(true)
                break Success2674;
            }
            term = term2695;
            IStrategoTerm term2696 = term;
            Success2675:
            { 
              Fail4755:
              { 
                term = int_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail4755;
                if(true)
                  break Success2675;
              }
              term = term2696;
              IStrategoTerm term2697 = term;
              Success2676:
              { 
                Fail4756:
                { 
                  term = real_to_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail4756;
                  if(true)
                    break Success2676;
                }
                term = term2697;
                IStrategoTerm p_11935 = null;
                IStrategoTerm q_11935 = null;
                IStrategoTerm s_11935 = null;
                p_11935 = term;
                term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                if(term == null)
                  break Fail4735;
                if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                  break Fail4735;
                q_11935 = ((IStrategoList)term).tail();
                s_11935 = q_11935;
                term = report_failure_0_2.instance.invoke(context, s_11935, trans.const900, p_11935);
                if(term == null)
                  break Fail4735;
              }
            }
          }
        }
        v_11935 = term;
        t_11935 = trans.const785;
        w_11935 = v_11935;
        term = string_replace_0_2.instance.invoke(context, w_11935, t_11935, trans.const856);
        if(term == null)
          break Fail4735;
        term = (IStrategoTerm)termFactory.makeListCons(trans.const903, termFactory.makeListCons(z_11935, termFactory.makeListCons(trans.const867, termFactory.makeListCons(term, (IStrategoList)trans.constNil3))));
        term = concat_strings_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail4735;
        term = termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil3));
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}