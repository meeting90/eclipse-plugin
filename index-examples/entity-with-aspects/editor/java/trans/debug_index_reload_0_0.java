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

@SuppressWarnings("all") public class debug_index_reload_0_0 extends Strategy 
{ 
  public static debug_index_reload_0_0 instance = new debug_index_reload_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("debug_index_reload_0_0");
    Fail2449:
    { 
      IStrategoTerm p_2170 = null;
      IStrategoTerm q_2170 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 5)
        break Fail2449;
      q_2170 = term.getSubterm(3);
      p_2170 = term.getSubterm(4);
      IStrategoTerm term1503 = term;
      Success1453:
      { 
        Fail2450:
        { 
          IStrategoTerm k_2171 = null;
          IStrategoTerm l_2171 = null;
          IStrategoTerm n_2171 = null;
          IStrategoTerm o_2171 = null;
          IStrategoTerm q_2171 = null;
          IStrategoTerm r_2171 = null;
          IStrategoTerm u_2171 = null;
          IStrategoTerm v_2170 = null;
          IStrategoTerm x_2170 = null;
          IStrategoTerm y_2170 = null;
          IStrategoTerm d_2171 = null;
          IStrategoTerm f_2171 = null;
          IStrategoTerm g_2171 = null;
          n_2171 = term;
          o_2171 = trans.const478;
          k_2171 = o_2171;
          q_2171 = n_2171;
          term = (IStrategoTerm)termFactory.makeListCons(p_2170, (IStrategoList)trans.constNil1);
          l_2171 = term;
          r_2171 = q_2171;
          term = p_2170;
          IStrategoTerm term1504 = term;
          Success1454:
          { 
            Fail2451:
            { 
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail2451;
              if(true)
                break Success1454;
            }
            term = term1504;
            IStrategoTerm term1505 = term;
            Success1455:
            { 
              Fail2452:
              { 
                term = is_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail2452;
                if(true)
                  break Success1455;
              }
              term = term1505;
              IStrategoTerm term1506 = term;
              Success1456:
              { 
                Fail2453:
                { 
                  term = int_to_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail2453;
                  if(true)
                    break Success1456;
                }
                term = term1506;
                IStrategoTerm term1507 = term;
                Success1457:
                { 
                  Fail2454:
                  { 
                    term = real_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail2454;
                    if(true)
                      break Success1457;
                  }
                  term = term1507;
                  IStrategoTerm r_2170 = null;
                  IStrategoTerm s_2170 = null;
                  IStrategoTerm u_2170 = null;
                  r_2170 = term;
                  term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                  if(term == null)
                    break Fail2450;
                  if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                    break Fail2450;
                  s_2170 = ((IStrategoList)term).tail();
                  u_2170 = s_2170;
                  term = report_failure_0_2.instance.invoke(context, u_2170, trans.const512, r_2170);
                  if(term == null)
                    break Fail2450;
                }
              }
            }
          }
          x_2170 = term;
          v_2170 = trans.const265;
          y_2170 = x_2170;
          term = string_replace_0_2.instance.invoke(context, y_2170, v_2170, trans.const265);
          if(term == null)
            break Fail2450;
          u_2171 = term;
          term = q_2170;
          IStrategoTerm term1508 = term;
          Success1458:
          { 
            Fail2455:
            { 
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail2455;
              if(true)
                break Success1458;
            }
            term = term1508;
            IStrategoTerm term1509 = term;
            Success1459:
            { 
              Fail2456:
              { 
                term = is_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail2456;
                if(true)
                  break Success1459;
              }
              term = term1509;
              IStrategoTerm term1510 = term;
              Success1460:
              { 
                Fail2457:
                { 
                  term = int_to_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail2457;
                  if(true)
                    break Success1460;
                }
                term = term1510;
                IStrategoTerm term1511 = term;
                Success1461:
                { 
                  Fail2458:
                  { 
                    term = real_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail2458;
                    if(true)
                      break Success1461;
                  }
                  term = term1511;
                  IStrategoTerm z_2170 = null;
                  IStrategoTerm a_2171 = null;
                  IStrategoTerm c_2171 = null;
                  z_2170 = term;
                  term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                  if(term == null)
                    break Fail2450;
                  if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                    break Fail2450;
                  a_2171 = ((IStrategoList)term).tail();
                  c_2171 = a_2171;
                  term = report_failure_0_2.instance.invoke(context, c_2171, trans.const512, z_2170);
                  if(term == null)
                    break Fail2450;
                }
              }
            }
          }
          f_2171 = term;
          d_2171 = trans.const265;
          g_2171 = f_2171;
          term = string_replace_0_2.instance.invoke(context, g_2171, d_2171, trans.const448);
          if(term == null)
            break Fail2450;
          term = (IStrategoTerm)termFactory.makeListCons(u_2171, termFactory.makeListCons(trans.const412, termFactory.makeListCons(term, (IStrategoList)trans.constNil1)));
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2450;
          term = termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil1));
          term = index_setup_0_3.instance.invoke(context, r_2171, k_2171, l_2171, term);
          if(term == null)
            break Fail2450;
          term = index_reload_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2450;
          if(true)
            break Success1453;
        }
        term = term1503;
        IStrategoTerm h_2171 = null;
        IStrategoTerm i_2171 = null;
        IStrategoTerm z_2171 = null;
        h_2171 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail2449;
        i_2171 = term;
        z_2171 = h_2171;
        term = report_with_failure_0_2.instance.invoke(context, z_2171, trans.const513, i_2171);
        if(term == null)
          break Fail2449;
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