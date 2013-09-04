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

@SuppressWarnings("all") public class debug_index_clear_current_0_0 extends Strategy 
{ 
  public static debug_index_clear_current_0_0 instance = new debug_index_clear_current_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("debug_index_clear_current_0_0");
    Fail2421:
    { 
      IStrategoTerm n_2166 = null;
      IStrategoTerm o_2166 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 5)
        break Fail2421;
      o_2166 = term.getSubterm(3);
      n_2166 = term.getSubterm(4);
      IStrategoTerm term1477 = term;
      Success1427:
      { 
        Fail2422:
        { 
          IStrategoTerm y_2167 = null;
          IStrategoTerm z_2167 = null;
          IStrategoTerm b_2168 = null;
          IStrategoTerm c_2168 = null;
          IStrategoTerm e_2168 = null;
          IStrategoTerm f_2168 = null;
          IStrategoTerm i_2168 = null;
          IStrategoTerm t_2166 = null;
          IStrategoTerm v_2166 = null;
          IStrategoTerm w_2166 = null;
          IStrategoTerm b_2167 = null;
          IStrategoTerm d_2167 = null;
          IStrategoTerm e_2167 = null;
          IStrategoTerm o_2168 = null;
          IStrategoTerm j_2167 = null;
          IStrategoTerm l_2167 = null;
          IStrategoTerm m_2167 = null;
          IStrategoTerm r_2167 = null;
          IStrategoTerm t_2167 = null;
          IStrategoTerm u_2167 = null;
          IStrategoTerm j_2298 = null;
          b_2168 = term;
          c_2168 = trans.const478;
          y_2167 = c_2168;
          e_2168 = b_2168;
          term = (IStrategoTerm)termFactory.makeListCons(n_2166, (IStrategoList)trans.constNil1);
          z_2167 = term;
          f_2168 = e_2168;
          term = n_2166;
          IStrategoTerm term1478 = term;
          Success1428:
          { 
            Fail2423:
            { 
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail2423;
              if(true)
                break Success1428;
            }
            term = term1478;
            IStrategoTerm term1479 = term;
            Success1429:
            { 
              Fail2424:
              { 
                term = is_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail2424;
                if(true)
                  break Success1429;
              }
              term = term1479;
              IStrategoTerm term1480 = term;
              Success1430:
              { 
                Fail2425:
                { 
                  term = int_to_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail2425;
                  if(true)
                    break Success1430;
                }
                term = term1480;
                IStrategoTerm term1481 = term;
                Success1431:
                { 
                  Fail2426:
                  { 
                    term = real_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail2426;
                    if(true)
                      break Success1431;
                  }
                  term = term1481;
                  IStrategoTerm p_2166 = null;
                  IStrategoTerm q_2166 = null;
                  IStrategoTerm s_2166 = null;
                  p_2166 = term;
                  term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                  if(term == null)
                    break Fail2422;
                  if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                    break Fail2422;
                  q_2166 = ((IStrategoList)term).tail();
                  s_2166 = q_2166;
                  term = report_failure_0_2.instance.invoke(context, s_2166, trans.const508, p_2166);
                  if(term == null)
                    break Fail2422;
                }
              }
            }
          }
          v_2166 = term;
          t_2166 = trans.const265;
          w_2166 = v_2166;
          term = string_replace_0_2.instance.invoke(context, w_2166, t_2166, trans.const265);
          if(term == null)
            break Fail2422;
          i_2168 = term;
          term = o_2166;
          IStrategoTerm term1482 = term;
          Success1432:
          { 
            Fail2427:
            { 
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail2427;
              if(true)
                break Success1432;
            }
            term = term1482;
            IStrategoTerm term1483 = term;
            Success1433:
            { 
              Fail2428:
              { 
                term = is_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail2428;
                if(true)
                  break Success1433;
              }
              term = term1483;
              IStrategoTerm term1484 = term;
              Success1434:
              { 
                Fail2429:
                { 
                  term = int_to_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail2429;
                  if(true)
                    break Success1434;
                }
                term = term1484;
                IStrategoTerm term1485 = term;
                Success1435:
                { 
                  Fail2430:
                  { 
                    term = real_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail2430;
                    if(true)
                      break Success1435;
                  }
                  term = term1485;
                  IStrategoTerm x_2166 = null;
                  IStrategoTerm y_2166 = null;
                  IStrategoTerm a_2167 = null;
                  x_2166 = term;
                  term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                  if(term == null)
                    break Fail2422;
                  if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                    break Fail2422;
                  y_2166 = ((IStrategoList)term).tail();
                  a_2167 = y_2166;
                  term = report_failure_0_2.instance.invoke(context, a_2167, trans.const508, x_2166);
                  if(term == null)
                    break Fail2422;
                }
              }
            }
          }
          d_2167 = term;
          b_2167 = trans.const265;
          e_2167 = d_2167;
          term = string_replace_0_2.instance.invoke(context, e_2167, b_2167, trans.const448);
          if(term == null)
            break Fail2422;
          term = (IStrategoTerm)termFactory.makeListCons(i_2168, termFactory.makeListCons(trans.const412, termFactory.makeListCons(term, (IStrategoList)trans.constNil1)));
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2422;
          term = termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil1));
          term = index_setup_0_3.instance.invoke(context, f_2168, y_2167, z_2167, term);
          if(term == null)
            break Fail2422;
          term = n_2166;
          IStrategoTerm term1486 = term;
          Success1436:
          { 
            Fail2431:
            { 
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail2431;
              if(true)
                break Success1436;
            }
            term = term1486;
            IStrategoTerm term1487 = term;
            Success1437:
            { 
              Fail2432:
              { 
                term = is_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail2432;
                if(true)
                  break Success1437;
              }
              term = term1487;
              IStrategoTerm term1488 = term;
              Success1438:
              { 
                Fail2433:
                { 
                  term = int_to_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail2433;
                  if(true)
                    break Success1438;
                }
                term = term1488;
                IStrategoTerm term1489 = term;
                Success1439:
                { 
                  Fail2434:
                  { 
                    term = real_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail2434;
                    if(true)
                      break Success1439;
                  }
                  term = term1489;
                  IStrategoTerm f_2167 = null;
                  IStrategoTerm g_2167 = null;
                  IStrategoTerm i_2167 = null;
                  f_2167 = term;
                  term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                  if(term == null)
                    break Fail2422;
                  if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                    break Fail2422;
                  g_2167 = ((IStrategoList)term).tail();
                  i_2167 = g_2167;
                  term = report_failure_0_2.instance.invoke(context, i_2167, trans.const508, f_2167);
                  if(term == null)
                    break Fail2422;
                }
              }
            }
          }
          l_2167 = term;
          j_2167 = trans.const265;
          m_2167 = l_2167;
          term = string_replace_0_2.instance.invoke(context, m_2167, j_2167, trans.const265);
          if(term == null)
            break Fail2422;
          o_2168 = term;
          term = o_2166;
          IStrategoTerm term1490 = term;
          Success1440:
          { 
            Fail2435:
            { 
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail2435;
              if(true)
                break Success1440;
            }
            term = term1490;
            IStrategoTerm term1491 = term;
            Success1441:
            { 
              Fail2436:
              { 
                term = is_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail2436;
                if(true)
                  break Success1441;
              }
              term = term1491;
              IStrategoTerm term1492 = term;
              Success1442:
              { 
                Fail2437:
                { 
                  term = int_to_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail2437;
                  if(true)
                    break Success1442;
                }
                term = term1492;
                IStrategoTerm term1493 = term;
                Success1443:
                { 
                  Fail2438:
                  { 
                    term = real_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail2438;
                    if(true)
                      break Success1443;
                  }
                  term = term1493;
                  IStrategoTerm n_2167 = null;
                  IStrategoTerm o_2167 = null;
                  IStrategoTerm q_2167 = null;
                  n_2167 = term;
                  term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                  if(term == null)
                    break Fail2422;
                  if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                    break Fail2422;
                  o_2167 = ((IStrategoList)term).tail();
                  q_2167 = o_2167;
                  term = report_failure_0_2.instance.invoke(context, q_2167, trans.const508, n_2167);
                  if(term == null)
                    break Fail2422;
                }
              }
            }
          }
          t_2167 = term;
          r_2167 = trans.const265;
          u_2167 = t_2167;
          term = string_replace_0_2.instance.invoke(context, u_2167, r_2167, trans.const448);
          if(term == null)
            break Fail2422;
          term = (IStrategoTerm)termFactory.makeListCons(o_2168, termFactory.makeListCons(trans.const412, termFactory.makeListCons(term, (IStrategoList)trans.constNil1)));
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2422;
          term = termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil1));
          j_2298 = term;
          term = context.invokePrimitive("LANG_index_clear_file", j_2298, NO_STRATEGIES, new IStrategoTerm[]{term});
          if(term == null)
            break Fail2422;
          if(true)
            break Success1427;
        }
        term = term1477;
        IStrategoTerm v_2167 = null;
        IStrategoTerm w_2167 = null;
        IStrategoTerm t_2168 = null;
        v_2167 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail2421;
        w_2167 = term;
        t_2168 = v_2167;
        term = report_with_failure_0_2.instance.invoke(context, t_2168, trans.const509, w_2167);
        if(term == null)
          break Fail2421;
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