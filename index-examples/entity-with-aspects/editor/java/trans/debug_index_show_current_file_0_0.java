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

@SuppressWarnings("all") public class debug_index_show_current_file_0_0 extends Strategy 
{ 
  public static debug_index_show_current_file_0_0 instance = new debug_index_show_current_file_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("debug_index_show_current_file_0_0");
    Fail2401:
    { 
      IStrategoTerm u_2162 = null;
      IStrategoTerm v_2162 = null;
      IStrategoTerm w_2162 = null;
      IStrategoTerm x_2162 = null;
      IStrategoTerm q_2163 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 5)
        break Fail2401;
      w_2162 = term.getSubterm(3);
      u_2162 = term.getSubterm(4);
      q_2163 = term;
      IStrategoTerm term1459 = term;
      Success1409:
      { 
        Fail2402:
        { 
          IStrategoTerm r_2163 = null;
          IStrategoTerm s_2163 = null;
          IStrategoTerm u_2163 = null;
          IStrategoTerm v_2163 = null;
          IStrategoTerm x_2163 = null;
          IStrategoTerm y_2163 = null;
          IStrategoTerm b_2164 = null;
          IStrategoTerm c_2163 = null;
          IStrategoTerm e_2163 = null;
          IStrategoTerm f_2163 = null;
          IStrategoTerm k_2163 = null;
          IStrategoTerm m_2163 = null;
          IStrategoTerm n_2163 = null;
          IStrategoTerm g_2164 = null;
          u_2163 = term;
          v_2163 = trans.const478;
          r_2163 = v_2163;
          x_2163 = u_2163;
          term = (IStrategoTerm)termFactory.makeListCons(u_2162, (IStrategoList)trans.constNil1);
          s_2163 = term;
          y_2163 = x_2163;
          term = u_2162;
          IStrategoTerm term1460 = term;
          Success1410:
          { 
            Fail2403:
            { 
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail2403;
              if(true)
                break Success1410;
            }
            term = term1460;
            IStrategoTerm term1461 = term;
            Success1411:
            { 
              Fail2404:
              { 
                term = is_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail2404;
                if(true)
                  break Success1411;
              }
              term = term1461;
              IStrategoTerm term1462 = term;
              Success1412:
              { 
                Fail2405:
                { 
                  term = int_to_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail2405;
                  if(true)
                    break Success1412;
                }
                term = term1462;
                IStrategoTerm term1463 = term;
                Success1413:
                { 
                  Fail2406:
                  { 
                    term = real_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail2406;
                    if(true)
                      break Success1413;
                  }
                  term = term1463;
                  IStrategoTerm y_2162 = null;
                  IStrategoTerm z_2162 = null;
                  IStrategoTerm b_2163 = null;
                  y_2162 = term;
                  term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                  if(term == null)
                    break Fail2402;
                  if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                    break Fail2402;
                  z_2162 = ((IStrategoList)term).tail();
                  b_2163 = z_2162;
                  term = report_failure_0_2.instance.invoke(context, b_2163, trans.const502, y_2162);
                  if(term == null)
                    break Fail2402;
                }
              }
            }
          }
          e_2163 = term;
          c_2163 = trans.const265;
          f_2163 = e_2163;
          term = string_replace_0_2.instance.invoke(context, f_2163, c_2163, trans.const265);
          if(term == null)
            break Fail2402;
          b_2164 = term;
          term = w_2162;
          IStrategoTerm term1464 = term;
          Success1414:
          { 
            Fail2407:
            { 
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail2407;
              if(true)
                break Success1414;
            }
            term = term1464;
            IStrategoTerm term1465 = term;
            Success1415:
            { 
              Fail2408:
              { 
                term = is_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail2408;
                if(true)
                  break Success1415;
              }
              term = term1465;
              IStrategoTerm term1466 = term;
              Success1416:
              { 
                Fail2409:
                { 
                  term = int_to_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail2409;
                  if(true)
                    break Success1416;
                }
                term = term1466;
                IStrategoTerm term1467 = term;
                Success1417:
                { 
                  Fail2410:
                  { 
                    term = real_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail2410;
                    if(true)
                      break Success1417;
                  }
                  term = term1467;
                  IStrategoTerm g_2163 = null;
                  IStrategoTerm h_2163 = null;
                  IStrategoTerm j_2163 = null;
                  g_2163 = term;
                  term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                  if(term == null)
                    break Fail2402;
                  if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                    break Fail2402;
                  h_2163 = ((IStrategoList)term).tail();
                  j_2163 = h_2163;
                  term = report_failure_0_2.instance.invoke(context, j_2163, trans.const502, g_2163);
                  if(term == null)
                    break Fail2402;
                }
              }
            }
          }
          m_2163 = term;
          k_2163 = trans.const265;
          n_2163 = m_2163;
          term = string_replace_0_2.instance.invoke(context, n_2163, k_2163, trans.const448);
          if(term == null)
            break Fail2402;
          term = (IStrategoTerm)termFactory.makeListCons(b_2164, termFactory.makeListCons(trans.const412, termFactory.makeListCons(term, (IStrategoList)trans.constNil1)));
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2402;
          term = termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil1));
          term = index_setup_0_3.instance.invoke(context, y_2163, r_2163, s_2163, term);
          if(term == null)
            break Fail2402;
          g_2164 = w_2162;
          term = guarantee_extension_0_1.instance.invoke(context, g_2164, trans.const503);
          if(term == null)
            break Fail2402;
          v_2162 = term;
          term = index_get_all_in_file_0_0.instance.invoke(context, w_2162);
          if(term == null)
            break Fail2402;
          x_2162 = term;
          if(true)
            break Success1409;
        }
        term = term1459;
        IStrategoTerm o_2163 = null;
        IStrategoTerm p_2163 = null;
        IStrategoTerm i_2164 = null;
        o_2163 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail2401;
        p_2163 = term;
        i_2164 = o_2163;
        term = report_with_failure_0_2.instance.invoke(context, i_2164, trans.const504, p_2163);
        if(term == null)
          break Fail2401;
      }
      term = q_2163;
      if(v_2162 == null || x_2162 == null)
        break Fail2401;
      term = termFactory.makeTuple(v_2162, x_2162);
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}