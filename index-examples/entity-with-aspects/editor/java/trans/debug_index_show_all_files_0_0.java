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

@SuppressWarnings("all") public class debug_index_show_all_files_0_0 extends Strategy 
{ 
  public static debug_index_show_all_files_0_0 instance = new debug_index_show_all_files_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("debug_index_show_all_files_0_0");
    Fail2411:
    { 
      IStrategoTerm o_2164 = null;
      IStrategoTerm p_2164 = null;
      IStrategoTerm q_2164 = null;
      IStrategoTerm r_2164 = null;
      IStrategoTerm l_2165 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 5)
        break Fail2411;
      p_2164 = term.getSubterm(3);
      o_2164 = term.getSubterm(4);
      l_2165 = term;
      IStrategoTerm term1468 = term;
      Success1418:
      { 
        Fail2412:
        { 
          IStrategoTerm m_2165 = null;
          IStrategoTerm n_2165 = null;
          IStrategoTerm p_2165 = null;
          IStrategoTerm q_2165 = null;
          IStrategoTerm s_2165 = null;
          IStrategoTerm t_2165 = null;
          IStrategoTerm w_2165 = null;
          IStrategoTerm w_2164 = null;
          IStrategoTerm y_2164 = null;
          IStrategoTerm z_2164 = null;
          IStrategoTerm e_2165 = null;
          IStrategoTerm g_2165 = null;
          IStrategoTerm h_2165 = null;
          IStrategoTerm b_2166 = null;
          p_2165 = term;
          q_2165 = trans.const478;
          m_2165 = q_2165;
          s_2165 = p_2165;
          term = (IStrategoTerm)termFactory.makeListCons(o_2164, (IStrategoList)trans.constNil1);
          n_2165 = term;
          t_2165 = s_2165;
          term = o_2164;
          IStrategoTerm term1469 = term;
          Success1419:
          { 
            Fail2413:
            { 
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail2413;
              if(true)
                break Success1419;
            }
            term = term1469;
            IStrategoTerm term1470 = term;
            Success1420:
            { 
              Fail2414:
              { 
                term = is_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail2414;
                if(true)
                  break Success1420;
              }
              term = term1470;
              IStrategoTerm term1471 = term;
              Success1421:
              { 
                Fail2415:
                { 
                  term = int_to_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail2415;
                  if(true)
                    break Success1421;
                }
                term = term1471;
                IStrategoTerm term1472 = term;
                Success1422:
                { 
                  Fail2416:
                  { 
                    term = real_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail2416;
                    if(true)
                      break Success1422;
                  }
                  term = term1472;
                  IStrategoTerm s_2164 = null;
                  IStrategoTerm t_2164 = null;
                  IStrategoTerm v_2164 = null;
                  s_2164 = term;
                  term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                  if(term == null)
                    break Fail2412;
                  if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                    break Fail2412;
                  t_2164 = ((IStrategoList)term).tail();
                  v_2164 = t_2164;
                  term = report_failure_0_2.instance.invoke(context, v_2164, trans.const505, s_2164);
                  if(term == null)
                    break Fail2412;
                }
              }
            }
          }
          y_2164 = term;
          w_2164 = trans.const265;
          z_2164 = y_2164;
          term = string_replace_0_2.instance.invoke(context, z_2164, w_2164, trans.const265);
          if(term == null)
            break Fail2412;
          w_2165 = term;
          term = p_2164;
          IStrategoTerm term1473 = term;
          Success1423:
          { 
            Fail2417:
            { 
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail2417;
              if(true)
                break Success1423;
            }
            term = term1473;
            IStrategoTerm term1474 = term;
            Success1424:
            { 
              Fail2418:
              { 
                term = is_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail2418;
                if(true)
                  break Success1424;
              }
              term = term1474;
              IStrategoTerm term1475 = term;
              Success1425:
              { 
                Fail2419:
                { 
                  term = int_to_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail2419;
                  if(true)
                    break Success1425;
                }
                term = term1475;
                IStrategoTerm term1476 = term;
                Success1426:
                { 
                  Fail2420:
                  { 
                    term = real_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail2420;
                    if(true)
                      break Success1426;
                  }
                  term = term1476;
                  IStrategoTerm a_2165 = null;
                  IStrategoTerm b_2165 = null;
                  IStrategoTerm d_2165 = null;
                  a_2165 = term;
                  term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                  if(term == null)
                    break Fail2412;
                  if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                    break Fail2412;
                  b_2165 = ((IStrategoList)term).tail();
                  d_2165 = b_2165;
                  term = report_failure_0_2.instance.invoke(context, d_2165, trans.const505, a_2165);
                  if(term == null)
                    break Fail2412;
                }
              }
            }
          }
          g_2165 = term;
          e_2165 = trans.const265;
          h_2165 = g_2165;
          term = string_replace_0_2.instance.invoke(context, h_2165, e_2165, trans.const448);
          if(term == null)
            break Fail2412;
          term = (IStrategoTerm)termFactory.makeListCons(w_2165, termFactory.makeListCons(trans.const412, termFactory.makeListCons(term, (IStrategoList)trans.constNil1)));
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2412;
          term = termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil1));
          term = index_setup_0_3.instance.invoke(context, t_2165, m_2165, n_2165, term);
          if(term == null)
            break Fail2412;
          b_2166 = p_2164;
          term = guarantee_extension_0_1.instance.invoke(context, b_2166, trans.const506);
          if(term == null)
            break Fail2412;
          q_2164 = term;
          term = index_get_all_files_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2412;
          term = map_1_0.instance.invoke(context, term, lifted554.instance);
          if(term == null)
            break Fail2412;
          r_2164 = term;
          if(true)
            break Success1418;
        }
        term = term1468;
        IStrategoTerm j_2165 = null;
        IStrategoTerm k_2165 = null;
        IStrategoTerm h_2166 = null;
        j_2165 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail2411;
        k_2165 = term;
        h_2166 = j_2165;
        term = report_with_failure_0_2.instance.invoke(context, h_2166, trans.const507, k_2165);
        if(term == null)
          break Fail2411;
      }
      term = l_2165;
      if(q_2164 == null || r_2164 == null)
        break Fail2411;
      term = termFactory.makeTuple(q_2164, r_2164);
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}