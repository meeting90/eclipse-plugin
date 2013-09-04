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

@SuppressWarnings("all") public class generate_test_files_0_0 extends Strategy 
{ 
  public static generate_test_files_0_0 instance = new generate_test_files_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("generate_test_files_0_0");
    Fail2459:
    { 
      IStrategoTerm c_2172 = null;
      IStrategoTerm d_2172 = null;
      IStrategoTerm e_2172 = null;
      IStrategoTerm f_2172 = null;
      IStrategoTerm g_2172 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 5)
        break Fail2459;
      c_2172 = term.getSubterm(0);
      d_2172 = term.getSubterm(1);
      e_2172 = term.getSubterm(2);
      f_2172 = term.getSubterm(3);
      g_2172 = term.getSubterm(4);
      IStrategoTerm term1512 = term;
      Success1462:
      { 
        Fail2460:
        { 
          IStrategoTerm a_2173 = null;
          IStrategoTerm b_2173 = null;
          IStrategoTerm d_2173 = null;
          IStrategoTerm e_2173 = null;
          IStrategoTerm g_2173 = null;
          IStrategoTerm h_2173 = null;
          IStrategoTerm k_2173 = null;
          IStrategoTerm l_2172 = null;
          IStrategoTerm n_2172 = null;
          IStrategoTerm o_2172 = null;
          IStrategoTerm t_2172 = null;
          IStrategoTerm v_2172 = null;
          IStrategoTerm w_2172 = null;
          d_2173 = term;
          e_2173 = trans.const478;
          a_2173 = e_2173;
          g_2173 = d_2173;
          term = (IStrategoTerm)termFactory.makeListCons(g_2172, (IStrategoList)trans.constNil1);
          b_2173 = term;
          h_2173 = g_2173;
          term = g_2172;
          IStrategoTerm term1513 = term;
          Success1463:
          { 
            Fail2461:
            { 
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail2461;
              if(true)
                break Success1463;
            }
            term = term1513;
            IStrategoTerm term1514 = term;
            Success1464:
            { 
              Fail2462:
              { 
                term = is_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail2462;
                if(true)
                  break Success1464;
              }
              term = term1514;
              IStrategoTerm term1515 = term;
              Success1465:
              { 
                Fail2463:
                { 
                  term = int_to_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail2463;
                  if(true)
                    break Success1465;
                }
                term = term1515;
                IStrategoTerm term1516 = term;
                Success1466:
                { 
                  Fail2464:
                  { 
                    term = real_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail2464;
                    if(true)
                      break Success1466;
                  }
                  term = term1516;
                  IStrategoTerm h_2172 = null;
                  IStrategoTerm i_2172 = null;
                  IStrategoTerm k_2172 = null;
                  h_2172 = term;
                  term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                  if(term == null)
                    break Fail2460;
                  if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                    break Fail2460;
                  i_2172 = ((IStrategoList)term).tail();
                  k_2172 = i_2172;
                  term = report_failure_0_2.instance.invoke(context, k_2172, trans.const514, h_2172);
                  if(term == null)
                    break Fail2460;
                }
              }
            }
          }
          n_2172 = term;
          l_2172 = trans.const265;
          o_2172 = n_2172;
          term = string_replace_0_2.instance.invoke(context, o_2172, l_2172, trans.const265);
          if(term == null)
            break Fail2460;
          k_2173 = term;
          term = f_2172;
          IStrategoTerm term1517 = term;
          Success1467:
          { 
            Fail2465:
            { 
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail2465;
              if(true)
                break Success1467;
            }
            term = term1517;
            IStrategoTerm term1518 = term;
            Success1468:
            { 
              Fail2466:
              { 
                term = is_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail2466;
                if(true)
                  break Success1468;
              }
              term = term1518;
              IStrategoTerm term1519 = term;
              Success1469:
              { 
                Fail2467:
                { 
                  term = int_to_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail2467;
                  if(true)
                    break Success1469;
                }
                term = term1519;
                IStrategoTerm term1520 = term;
                Success1470:
                { 
                  Fail2468:
                  { 
                    term = real_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail2468;
                    if(true)
                      break Success1470;
                  }
                  term = term1520;
                  IStrategoTerm p_2172 = null;
                  IStrategoTerm q_2172 = null;
                  IStrategoTerm s_2172 = null;
                  p_2172 = term;
                  term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                  if(term == null)
                    break Fail2460;
                  if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                    break Fail2460;
                  q_2172 = ((IStrategoList)term).tail();
                  s_2172 = q_2172;
                  term = report_failure_0_2.instance.invoke(context, s_2172, trans.const514, p_2172);
                  if(term == null)
                    break Fail2460;
                }
              }
            }
          }
          v_2172 = term;
          t_2172 = trans.const265;
          w_2172 = v_2172;
          term = string_replace_0_2.instance.invoke(context, w_2172, t_2172, trans.const448);
          if(term == null)
            break Fail2460;
          term = (IStrategoTerm)termFactory.makeListCons(k_2173, termFactory.makeListCons(trans.const412, termFactory.makeListCons(term, (IStrategoList)trans.constNil1)));
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2460;
          term = termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil1));
          term = index_setup_0_3.instance.invoke(context, h_2173, a_2173, b_2173, term);
          if(term == null)
            break Fail2460;
          term = termFactory.makeTuple(c_2172, d_2172, e_2172, f_2172, g_2172);
          term = testgen_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2460;
          if(true)
            break Success1462;
        }
        term = term1512;
        IStrategoTerm x_2172 = null;
        IStrategoTerm y_2172 = null;
        IStrategoTerm p_2173 = null;
        x_2172 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail2459;
        y_2172 = term;
        p_2173 = x_2172;
        term = report_with_failure_0_2.instance.invoke(context, p_2173, trans.const515, y_2172);
        if(term == null)
          break Fail2459;
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