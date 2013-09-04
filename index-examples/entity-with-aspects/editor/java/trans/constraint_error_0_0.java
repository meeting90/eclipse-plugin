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

@SuppressWarnings("all") public class constraint_error_0_0 extends Strategy 
{ 
  public static constraint_error_0_0 instance = new constraint_error_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("constraint_error_0_0");
    Fail4788:
    { 
      IStrategoTerm term2722 = term;
      IStrategoConstructor cons133 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success2701:
      { 
        if(cons133 == Main._consAssign_2)
        { 
          Fail4789:
          { 
            IStrategoTerm n_11942 = null;
            IStrategoTerm o_11942 = null;
            IStrategoTerm p_11942 = null;
            IStrategoTerm q_11942 = null;
            IStrategoTerm r_11942 = null;
            IStrategoTerm l_11943 = null;
            IStrategoTerm w_11942 = null;
            IStrategoTerm y_11942 = null;
            IStrategoTerm z_11942 = null;
            IStrategoTerm e_11943 = null;
            IStrategoTerm g_11943 = null;
            IStrategoTerm h_11943 = null;
            n_11942 = term;
            o_11942 = term.getSubterm(0);
            p_11942 = term.getSubterm(1);
            term = type_of_0_0.instance.invoke(context, o_11942);
            if(term == null)
              break Fail4789;
            q_11942 = term;
            term = type_of_0_0.instance.invoke(context, p_11942);
            if(term == null)
              break Fail4789;
            r_11942 = term;
            IStrategoTerm term2723 = term;
            Success2702:
            { 
              Fail4790:
              { 
                IStrategoTerm p_12154 = null;
                IStrategoTerm q_12154 = null;
                q_12154 = q_11942;
                p_12154 = r_11942;
                term = termFactory.makeTuple(p_12154, q_12154);
                term = eq_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail4790;
                term = q_12154;
                { 
                  if(true)
                    break Fail4789;
                  if(true)
                    break Success2702;
                }
              }
              term = term2723;
            }
            term = print_type_0_0.instance.invoke(context, q_11942);
            if(term == null)
              break Fail4789;
            IStrategoTerm term2724 = term;
            Success2703:
            { 
              Fail4791:
              { 
                term = concat_strings_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail4791;
                if(true)
                  break Success2703;
              }
              term = term2724;
              IStrategoTerm term2725 = term;
              Success2704:
              { 
                Fail4792:
                { 
                  term = is_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail4792;
                  if(true)
                    break Success2704;
                }
                term = term2725;
                IStrategoTerm term2726 = term;
                Success2705:
                { 
                  Fail4793:
                  { 
                    term = int_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail4793;
                    if(true)
                      break Success2705;
                  }
                  term = term2726;
                  IStrategoTerm term2727 = term;
                  Success2706:
                  { 
                    Fail4794:
                    { 
                      term = real_to_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail4794;
                      if(true)
                        break Success2706;
                    }
                    term = term2727;
                    IStrategoTerm s_11942 = null;
                    IStrategoTerm t_11942 = null;
                    IStrategoTerm v_11942 = null;
                    s_11942 = term;
                    term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                    if(term == null)
                      break Fail4789;
                    if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                      break Fail4789;
                    t_11942 = ((IStrategoList)term).tail();
                    v_11942 = t_11942;
                    term = report_failure_0_2.instance.invoke(context, v_11942, trans.const907, s_11942);
                    if(term == null)
                      break Fail4789;
                  }
                }
              }
            }
            y_11942 = term;
            w_11942 = trans.const785;
            z_11942 = y_11942;
            term = string_replace_0_2.instance.invoke(context, z_11942, w_11942, trans.const862);
            if(term == null)
              break Fail4789;
            l_11943 = term;
            term = print_type_0_0.instance.invoke(context, r_11942);
            if(term == null)
              break Fail4789;
            IStrategoTerm term2728 = term;
            Success2707:
            { 
              Fail4795:
              { 
                term = concat_strings_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail4795;
                if(true)
                  break Success2707;
              }
              term = term2728;
              IStrategoTerm term2729 = term;
              Success2708:
              { 
                Fail4796:
                { 
                  term = is_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail4796;
                  if(true)
                    break Success2708;
                }
                term = term2729;
                IStrategoTerm term2730 = term;
                Success2709:
                { 
                  Fail4797:
                  { 
                    term = int_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail4797;
                    if(true)
                      break Success2709;
                  }
                  term = term2730;
                  IStrategoTerm term2731 = term;
                  Success2710:
                  { 
                    Fail4798:
                    { 
                      term = real_to_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail4798;
                      if(true)
                        break Success2710;
                    }
                    term = term2731;
                    IStrategoTerm a_11943 = null;
                    IStrategoTerm b_11943 = null;
                    IStrategoTerm d_11943 = null;
                    a_11943 = term;
                    term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                    if(term == null)
                      break Fail4789;
                    if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                      break Fail4789;
                    b_11943 = ((IStrategoList)term).tail();
                    d_11943 = b_11943;
                    term = report_failure_0_2.instance.invoke(context, d_11943, trans.const907, a_11943);
                    if(term == null)
                      break Fail4789;
                  }
                }
              }
            }
            g_11943 = term;
            e_11943 = trans.const785;
            h_11943 = g_11943;
            term = string_replace_0_2.instance.invoke(context, h_11943, e_11943, trans.const908);
            if(term == null)
              break Fail4789;
            term = (IStrategoTerm)termFactory.makeListCons(trans.const910, termFactory.makeListCons(l_11943, termFactory.makeListCons(trans.const909, termFactory.makeListCons(term, (IStrategoList)trans.constCons247))));
            term = concat_strings_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail4789;
            term = termFactory.makeTuple(n_11942, termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil3)));
            if(true)
              break Success2701;
          }
          term = term2722;
        }
        Success2711:
        { 
          if(cons133 == Main._consVarDeclInit_3)
          { 
            Fail4799:
            { 
              IStrategoTerm l_11941 = null;
              IStrategoTerm m_11941 = null;
              IStrategoTerm n_11941 = null;
              IStrategoTerm o_11941 = null;
              IStrategoTerm p_11941 = null;
              IStrategoTerm j_11942 = null;
              IStrategoTerm u_11941 = null;
              IStrategoTerm w_11941 = null;
              IStrategoTerm x_11941 = null;
              IStrategoTerm c_11942 = null;
              IStrategoTerm e_11942 = null;
              IStrategoTerm f_11942 = null;
              l_11941 = term;
              m_11941 = term.getSubterm(1);
              n_11941 = term.getSubterm(2);
              term = type_of_0_0.instance.invoke(context, m_11941);
              if(term == null)
                break Fail4799;
              o_11941 = term;
              term = type_of_0_0.instance.invoke(context, n_11941);
              if(term == null)
                break Fail4799;
              p_11941 = term;
              IStrategoTerm term2733 = term;
              Success2712:
              { 
                Fail4800:
                { 
                  term = termFactory.makeTuple(o_11941, p_11941);
                  term = is_assignable_to_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail4800;
                  { 
                    if(true)
                      break Fail4799;
                    if(true)
                      break Success2712;
                  }
                }
                term = term2733;
              }
              term = print_type_0_0.instance.invoke(context, o_11941);
              if(term == null)
                break Fail4799;
              IStrategoTerm term2734 = term;
              Success2713:
              { 
                Fail4801:
                { 
                  term = concat_strings_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail4801;
                  if(true)
                    break Success2713;
                }
                term = term2734;
                IStrategoTerm term2735 = term;
                Success2714:
                { 
                  Fail4802:
                  { 
                    term = is_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail4802;
                    if(true)
                      break Success2714;
                  }
                  term = term2735;
                  IStrategoTerm term2736 = term;
                  Success2715:
                  { 
                    Fail4803:
                    { 
                      term = int_to_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail4803;
                      if(true)
                        break Success2715;
                    }
                    term = term2736;
                    IStrategoTerm term2737 = term;
                    Success2716:
                    { 
                      Fail4804:
                      { 
                        term = real_to_string_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail4804;
                        if(true)
                          break Success2716;
                      }
                      term = term2737;
                      IStrategoTerm q_11941 = null;
                      IStrategoTerm r_11941 = null;
                      IStrategoTerm t_11941 = null;
                      q_11941 = term;
                      term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                      if(term == null)
                        break Fail4799;
                      if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                        break Fail4799;
                      r_11941 = ((IStrategoList)term).tail();
                      t_11941 = r_11941;
                      term = report_failure_0_2.instance.invoke(context, t_11941, trans.const907, q_11941);
                      if(term == null)
                        break Fail4799;
                    }
                  }
                }
              }
              w_11941 = term;
              u_11941 = trans.const785;
              x_11941 = w_11941;
              term = string_replace_0_2.instance.invoke(context, x_11941, u_11941, trans.const862);
              if(term == null)
                break Fail4799;
              j_11942 = term;
              term = print_type_0_0.instance.invoke(context, p_11941);
              if(term == null)
                break Fail4799;
              IStrategoTerm term2738 = term;
              Success2717:
              { 
                Fail4805:
                { 
                  term = concat_strings_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail4805;
                  if(true)
                    break Success2717;
                }
                term = term2738;
                IStrategoTerm term2739 = term;
                Success2718:
                { 
                  Fail4806:
                  { 
                    term = is_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail4806;
                    if(true)
                      break Success2718;
                  }
                  term = term2739;
                  IStrategoTerm term2740 = term;
                  Success2719:
                  { 
                    Fail4807:
                    { 
                      term = int_to_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail4807;
                      if(true)
                        break Success2719;
                    }
                    term = term2740;
                    IStrategoTerm term2741 = term;
                    Success2720:
                    { 
                      Fail4808:
                      { 
                        term = real_to_string_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail4808;
                        if(true)
                          break Success2720;
                      }
                      term = term2741;
                      IStrategoTerm y_11941 = null;
                      IStrategoTerm z_11941 = null;
                      IStrategoTerm b_11942 = null;
                      y_11941 = term;
                      term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                      if(term == null)
                        break Fail4799;
                      if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                        break Fail4799;
                      z_11941 = ((IStrategoList)term).tail();
                      b_11942 = z_11941;
                      term = report_failure_0_2.instance.invoke(context, b_11942, trans.const907, y_11941);
                      if(term == null)
                        break Fail4799;
                    }
                  }
                }
              }
              e_11942 = term;
              c_11942 = trans.const785;
              f_11942 = e_11942;
              term = string_replace_0_2.instance.invoke(context, f_11942, c_11942, trans.const908);
              if(term == null)
                break Fail4799;
              term = (IStrategoTerm)termFactory.makeListCons(trans.const910, termFactory.makeListCons(j_11942, termFactory.makeListCons(trans.const909, termFactory.makeListCons(term, (IStrategoList)trans.constCons247))));
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail4799;
              term = termFactory.makeTuple(l_11941, termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil3)));
              if(true)
                break Success2711;
            }
            term = term2722;
          }
          IStrategoTerm term2742 = term;
          Success2721:
          { 
            Fail4809:
            { 
              IStrategoTerm h_11941 = null;
              h_11941 = term;
              IStrategoList annos210 = term.getAnnotations();
              if(annos210.getTermType() != IStrategoTerm.LIST || ((IStrategoList)annos210).isEmpty())
                break Fail4809;
              IStrategoTerm arg1472 = ((IStrategoList)annos210).head();
              if(arg1472.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg1472).isEmpty())
                break Fail4809;
              IStrategoTerm arg1473 = ((IStrategoList)arg1472).head();
              if(arg1473.getTermType() != IStrategoTerm.APPL || Main._consUnresolved_1 != ((IStrategoAppl)arg1473).getConstructor())
                break Fail4809;
              IStrategoTerm arg1475 = ((IStrategoList)annos210).tail();
              if(arg1475.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg1475).isEmpty())
                break Fail4809;
              term = concat_strings_0_0.instance.invoke(context, trans.constCons248);
              if(term == null)
                break Fail4809;
              term = termFactory.makeTuple(h_11941, termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil3)));
              if(true)
                break Success2721;
            }
            term = term2742;
            IStrategoTerm y_11940 = null;
            IStrategoTerm z_11940 = null;
            IStrategoTerm a_11941 = null;
            y_11940 = term;
            term = nam_unique_0_0.instance.invoke(context, y_11940);
            if(term == null)
              break Fail4788;
            term = nam_get_definition_key_0_0.instance.invoke(context, y_11940);
            if(term == null)
              break Fail4788;
            z_11940 = term;
            term = index_lookup_all_scoped_noimports_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail4788;
            a_11941 = term;
            term = length_0_0.instance.invoke(context, a_11941);
            if(term == null)
              break Fail4788;
            term = termFactory.makeTuple(term, trans.const821);
            term = gt_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail4788;
            term = concat_strings_0_0.instance.invoke(context, trans.constCons249);
            if(term == null)
              break Fail4788;
            term = termFactory.makeTuple(z_11940, termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil3)));
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