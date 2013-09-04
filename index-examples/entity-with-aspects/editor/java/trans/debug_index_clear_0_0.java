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

@SuppressWarnings("all") public class debug_index_clear_0_0 extends Strategy 
{ 
  public static debug_index_clear_0_0 instance = new debug_index_clear_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("debug_index_clear_0_0");
    Fail2439:
    { 
      IStrategoTerm z_2168 = null;
      IStrategoTerm a_2169 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 5)
        break Fail2439;
      a_2169 = term.getSubterm(3);
      z_2168 = term.getSubterm(4);
      IStrategoTerm term1494 = term;
      Success1444:
      { 
        Fail2440:
        { 
          IStrategoTerm u_2169 = null;
          IStrategoTerm v_2169 = null;
          IStrategoTerm x_2169 = null;
          IStrategoTerm y_2169 = null;
          IStrategoTerm a_2170 = null;
          IStrategoTerm b_2170 = null;
          IStrategoTerm e_2170 = null;
          IStrategoTerm f_2169 = null;
          IStrategoTerm h_2169 = null;
          IStrategoTerm i_2169 = null;
          IStrategoTerm n_2169 = null;
          IStrategoTerm p_2169 = null;
          IStrategoTerm q_2169 = null;
          x_2169 = term;
          y_2169 = trans.const478;
          u_2169 = y_2169;
          a_2170 = x_2169;
          term = (IStrategoTerm)termFactory.makeListCons(z_2168, (IStrategoList)trans.constNil1);
          v_2169 = term;
          b_2170 = a_2170;
          term = z_2168;
          IStrategoTerm term1495 = term;
          Success1445:
          { 
            Fail2441:
            { 
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail2441;
              if(true)
                break Success1445;
            }
            term = term1495;
            IStrategoTerm term1496 = term;
            Success1446:
            { 
              Fail2442:
              { 
                term = is_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail2442;
                if(true)
                  break Success1446;
              }
              term = term1496;
              IStrategoTerm term1497 = term;
              Success1447:
              { 
                Fail2443:
                { 
                  term = int_to_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail2443;
                  if(true)
                    break Success1447;
                }
                term = term1497;
                IStrategoTerm term1498 = term;
                Success1448:
                { 
                  Fail2444:
                  { 
                    term = real_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail2444;
                    if(true)
                      break Success1448;
                  }
                  term = term1498;
                  IStrategoTerm b_2169 = null;
                  IStrategoTerm c_2169 = null;
                  IStrategoTerm e_2169 = null;
                  b_2169 = term;
                  term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                  if(term == null)
                    break Fail2440;
                  if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                    break Fail2440;
                  c_2169 = ((IStrategoList)term).tail();
                  e_2169 = c_2169;
                  term = report_failure_0_2.instance.invoke(context, e_2169, trans.const510, b_2169);
                  if(term == null)
                    break Fail2440;
                }
              }
            }
          }
          h_2169 = term;
          f_2169 = trans.const265;
          i_2169 = h_2169;
          term = string_replace_0_2.instance.invoke(context, i_2169, f_2169, trans.const265);
          if(term == null)
            break Fail2440;
          e_2170 = term;
          term = a_2169;
          IStrategoTerm term1499 = term;
          Success1449:
          { 
            Fail2445:
            { 
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail2445;
              if(true)
                break Success1449;
            }
            term = term1499;
            IStrategoTerm term1500 = term;
            Success1450:
            { 
              Fail2446:
              { 
                term = is_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail2446;
                if(true)
                  break Success1450;
              }
              term = term1500;
              IStrategoTerm term1501 = term;
              Success1451:
              { 
                Fail2447:
                { 
                  term = int_to_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail2447;
                  if(true)
                    break Success1451;
                }
                term = term1501;
                IStrategoTerm term1502 = term;
                Success1452:
                { 
                  Fail2448:
                  { 
                    term = real_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail2448;
                    if(true)
                      break Success1452;
                  }
                  term = term1502;
                  IStrategoTerm j_2169 = null;
                  IStrategoTerm k_2169 = null;
                  IStrategoTerm m_2169 = null;
                  j_2169 = term;
                  term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                  if(term == null)
                    break Fail2440;
                  if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                    break Fail2440;
                  k_2169 = ((IStrategoList)term).tail();
                  m_2169 = k_2169;
                  term = report_failure_0_2.instance.invoke(context, m_2169, trans.const510, j_2169);
                  if(term == null)
                    break Fail2440;
                }
              }
            }
          }
          p_2169 = term;
          n_2169 = trans.const265;
          q_2169 = p_2169;
          term = string_replace_0_2.instance.invoke(context, q_2169, n_2169, trans.const448);
          if(term == null)
            break Fail2440;
          term = (IStrategoTerm)termFactory.makeListCons(e_2170, termFactory.makeListCons(trans.const412, termFactory.makeListCons(term, (IStrategoList)trans.constNil1)));
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2440;
          term = termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil1));
          term = index_setup_0_3.instance.invoke(context, b_2170, u_2169, v_2169, term);
          if(term == null)
            break Fail2440;
          term = index_clear_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2440;
          if(true)
            break Success1444;
        }
        term = term1494;
        IStrategoTerm r_2169 = null;
        IStrategoTerm s_2169 = null;
        IStrategoTerm j_2170 = null;
        r_2169 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail2439;
        s_2169 = term;
        j_2170 = r_2169;
        term = report_with_failure_0_2.instance.invoke(context, j_2170, trans.const511, s_2169);
        if(term == null)
          break Fail2439;
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