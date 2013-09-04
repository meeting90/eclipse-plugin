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

@SuppressWarnings("all") public class debug_generate_deffed_0_0 extends Strategy 
{ 
  public static debug_generate_deffed_0_0 instance = new debug_generate_deffed_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("debug_generate_deffed_0_0");
    Fail2389:
    { 
      IStrategoTerm f_2160 = null;
      IStrategoTerm g_2160 = null;
      IStrategoTerm h_2160 = null;
      IStrategoTerm i_2160 = null;
      IStrategoTerm j_2160 = null;
      IStrategoTerm c_2161 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 5)
        break Fail2389;
      i_2160 = term.getSubterm(0);
      g_2160 = term.getSubterm(3);
      f_2160 = term.getSubterm(4);
      c_2161 = term;
      IStrategoTerm term1449 = term;
      Success1399:
      { 
        Fail2390:
        { 
          IStrategoTerm d_2161 = null;
          IStrategoTerm e_2161 = null;
          IStrategoTerm g_2161 = null;
          IStrategoTerm h_2161 = null;
          IStrategoTerm j_2161 = null;
          IStrategoTerm k_2161 = null;
          IStrategoTerm n_2161 = null;
          IStrategoTerm o_2160 = null;
          IStrategoTerm q_2160 = null;
          IStrategoTerm r_2160 = null;
          IStrategoTerm w_2160 = null;
          IStrategoTerm y_2160 = null;
          IStrategoTerm z_2160 = null;
          IStrategoTerm s_2161 = null;
          g_2161 = term;
          h_2161 = trans.const478;
          d_2161 = h_2161;
          j_2161 = g_2161;
          term = (IStrategoTerm)termFactory.makeListCons(f_2160, (IStrategoList)trans.constNil1);
          e_2161 = term;
          k_2161 = j_2161;
          term = f_2160;
          IStrategoTerm term1450 = term;
          Success1400:
          { 
            Fail2391:
            { 
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail2391;
              if(true)
                break Success1400;
            }
            term = term1450;
            IStrategoTerm term1451 = term;
            Success1401:
            { 
              Fail2392:
              { 
                term = is_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail2392;
                if(true)
                  break Success1401;
              }
              term = term1451;
              IStrategoTerm term1452 = term;
              Success1402:
              { 
                Fail2393:
                { 
                  term = int_to_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail2393;
                  if(true)
                    break Success1402;
                }
                term = term1452;
                IStrategoTerm term1453 = term;
                Success1403:
                { 
                  Fail2394:
                  { 
                    term = real_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail2394;
                    if(true)
                      break Success1403;
                  }
                  term = term1453;
                  IStrategoTerm k_2160 = null;
                  IStrategoTerm l_2160 = null;
                  IStrategoTerm n_2160 = null;
                  k_2160 = term;
                  term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                  if(term == null)
                    break Fail2390;
                  if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                    break Fail2390;
                  l_2160 = ((IStrategoList)term).tail();
                  n_2160 = l_2160;
                  term = report_failure_0_2.instance.invoke(context, n_2160, trans.const498, k_2160);
                  if(term == null)
                    break Fail2390;
                }
              }
            }
          }
          q_2160 = term;
          o_2160 = trans.const265;
          r_2160 = q_2160;
          term = string_replace_0_2.instance.invoke(context, r_2160, o_2160, trans.const265);
          if(term == null)
            break Fail2390;
          n_2161 = term;
          term = g_2160;
          IStrategoTerm term1454 = term;
          Success1404:
          { 
            Fail2395:
            { 
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail2395;
              if(true)
                break Success1404;
            }
            term = term1454;
            IStrategoTerm term1455 = term;
            Success1405:
            { 
              Fail2396:
              { 
                term = is_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail2396;
                if(true)
                  break Success1405;
              }
              term = term1455;
              IStrategoTerm term1456 = term;
              Success1406:
              { 
                Fail2397:
                { 
                  term = int_to_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail2397;
                  if(true)
                    break Success1406;
                }
                term = term1456;
                IStrategoTerm term1457 = term;
                Success1407:
                { 
                  Fail2398:
                  { 
                    term = real_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail2398;
                    if(true)
                      break Success1407;
                  }
                  term = term1457;
                  IStrategoTerm s_2160 = null;
                  IStrategoTerm t_2160 = null;
                  IStrategoTerm v_2160 = null;
                  s_2160 = term;
                  term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                  if(term == null)
                    break Fail2390;
                  if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                    break Fail2390;
                  t_2160 = ((IStrategoList)term).tail();
                  v_2160 = t_2160;
                  term = report_failure_0_2.instance.invoke(context, v_2160, trans.const498, s_2160);
                  if(term == null)
                    break Fail2390;
                }
              }
            }
          }
          y_2160 = term;
          w_2160 = trans.const265;
          z_2160 = y_2160;
          term = string_replace_0_2.instance.invoke(context, z_2160, w_2160, trans.const448);
          if(term == null)
            break Fail2390;
          term = (IStrategoTerm)termFactory.makeListCons(n_2161, termFactory.makeListCons(trans.const412, termFactory.makeListCons(term, (IStrategoList)trans.constNil1)));
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2390;
          term = termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil1));
          term = index_setup_0_3.instance.invoke(context, k_2161, d_2161, e_2161, term);
          if(term == null)
            break Fail2390;
          s_2161 = g_2160;
          term = guarantee_extension_0_1.instance.invoke(context, s_2161, trans.const496);
          if(term == null)
            break Fail2390;
          h_2160 = term;
          term = analyze_defs_0_0.instance.invoke(context, i_2160);
          if(term == null)
            break Fail2390;
          j_2160 = term;
          if(true)
            break Success1399;
        }
        term = term1449;
        IStrategoTerm a_2161 = null;
        IStrategoTerm b_2161 = null;
        IStrategoTerm u_2161 = null;
        a_2161 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail2389;
        b_2161 = term;
        u_2161 = a_2161;
        term = report_with_failure_0_2.instance.invoke(context, u_2161, trans.const499, b_2161);
        if(term == null)
          break Fail2389;
      }
      term = c_2161;
      if(h_2160 == null || j_2160 == null)
        break Fail2389;
      term = termFactory.makeTuple(h_2160, j_2160);
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}