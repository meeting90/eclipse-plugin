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

@SuppressWarnings("all") public class editor_resolve_0_0 extends Strategy 
{ 
  public static editor_resolve_0_0 instance = new editor_resolve_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("editor_resolve_0_0");
    Fail2371:
    { 
      IStrategoTerm u_2156 = null;
      IStrategoTerm v_2156 = null;
      TermReference w_2156 = new TermReference();
      TermReference x_2156 = new TermReference();
      IStrategoTerm o_2157 = null;
      IStrategoTerm p_2157 = null;
      IStrategoTerm q_2157 = null;
      IStrategoTerm s_2157 = null;
      IStrategoTerm t_2157 = null;
      IStrategoTerm v_2157 = null;
      IStrategoTerm w_2157 = null;
      IStrategoTerm z_2157 = null;
      IStrategoTerm c_2157 = null;
      IStrategoTerm e_2157 = null;
      IStrategoTerm f_2157 = null;
      IStrategoTerm k_2157 = null;
      IStrategoTerm m_2157 = null;
      IStrategoTerm n_2157 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 5)
        break Fail2371;
      if(w_2156.value == null)
        w_2156.value = term.getSubterm(0);
      else
        if(w_2156.value != term.getSubterm(0) && !w_2156.value.match(term.getSubterm(0)))
          break Fail2371;
      v_2156 = term.getSubterm(3);
      u_2156 = term.getSubterm(4);
      o_2157 = term;
      s_2157 = term;
      t_2157 = trans.const478;
      p_2157 = t_2157;
      v_2157 = s_2157;
      term = (IStrategoTerm)termFactory.makeListCons(u_2156, (IStrategoList)trans.constNil1);
      q_2157 = term;
      w_2157 = v_2157;
      term = u_2156;
      IStrategoTerm term1433 = term;
      Success1385:
      { 
        Fail2372:
        { 
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2372;
          if(true)
            break Success1385;
        }
        term = term1433;
        IStrategoTerm term1434 = term;
        Success1386:
        { 
          Fail2373:
          { 
            term = is_string_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail2373;
            if(true)
              break Success1386;
          }
          term = term1434;
          IStrategoTerm term1435 = term;
          Success1387:
          { 
            Fail2374:
            { 
              term = int_to_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail2374;
              if(true)
                break Success1387;
            }
            term = term1435;
            IStrategoTerm term1436 = term;
            Success1388:
            { 
              Fail2375:
              { 
                term = real_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail2375;
                if(true)
                  break Success1388;
              }
              term = term1436;
              IStrategoTerm y_2156 = null;
              IStrategoTerm z_2156 = null;
              IStrategoTerm b_2157 = null;
              y_2156 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail2371;
              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                break Fail2371;
              z_2156 = ((IStrategoList)term).tail();
              b_2157 = z_2156;
              term = report_failure_0_2.instance.invoke(context, b_2157, trans.const494, y_2156);
              if(term == null)
                break Fail2371;
            }
          }
        }
      }
      e_2157 = term;
      c_2157 = trans.const265;
      f_2157 = e_2157;
      term = string_replace_0_2.instance.invoke(context, f_2157, c_2157, trans.const265);
      if(term == null)
        break Fail2371;
      z_2157 = term;
      term = v_2156;
      IStrategoTerm term1437 = term;
      Success1389:
      { 
        Fail2376:
        { 
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2376;
          if(true)
            break Success1389;
        }
        term = term1437;
        IStrategoTerm term1438 = term;
        Success1390:
        { 
          Fail2377:
          { 
            term = is_string_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail2377;
            if(true)
              break Success1390;
          }
          term = term1438;
          IStrategoTerm term1439 = term;
          Success1391:
          { 
            Fail2378:
            { 
              term = int_to_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail2378;
              if(true)
                break Success1391;
            }
            term = term1439;
            IStrategoTerm term1440 = term;
            Success1392:
            { 
              Fail2379:
              { 
                term = real_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail2379;
                if(true)
                  break Success1392;
              }
              term = term1440;
              IStrategoTerm g_2157 = null;
              IStrategoTerm h_2157 = null;
              IStrategoTerm j_2157 = null;
              g_2157 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail2371;
              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                break Fail2371;
              h_2157 = ((IStrategoList)term).tail();
              j_2157 = h_2157;
              term = report_failure_0_2.instance.invoke(context, j_2157, trans.const494, g_2157);
              if(term == null)
                break Fail2371;
            }
          }
        }
      }
      m_2157 = term;
      k_2157 = trans.const265;
      n_2157 = m_2157;
      term = string_replace_0_2.instance.invoke(context, n_2157, k_2157, trans.const448);
      if(term == null)
        break Fail2371;
      term = (IStrategoTerm)termFactory.makeListCons(z_2157, termFactory.makeListCons(trans.const412, termFactory.makeListCons(term, (IStrategoList)trans.constNil1)));
      term = concat_strings_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail2371;
      term = termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil1));
      term = index_setup_0_3.instance.invoke(context, w_2157, p_2157, q_2157, term);
      if(term == null)
        break Fail2371;
      lifted549 lifted5490 = new lifted549();
      lifted5490.w_2156 = w_2156;
      lifted5490.x_2156 = x_2156;
      term = index_transaction_1_0.instance.invoke(context, term, lifted5490);
      if(term == null)
        break Fail2371;
      term = o_2157;
      if(x_2156.value == null)
        break Fail2371;
      term = x_2156.value;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}