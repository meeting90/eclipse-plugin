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

@SuppressWarnings("all") public class editor_hover_0_0 extends Strategy 
{ 
  public static editor_hover_0_0 instance = new editor_hover_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("editor_hover_0_0");
    Fail2380:
    { 
      IStrategoTerm h_2158 = null;
      IStrategoTerm i_2158 = null;
      IStrategoTerm n_2158 = null;
      IStrategoTerm p_2158 = null;
      IStrategoTerm q_2158 = null;
      IStrategoTerm z_2297 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 5)
        break Fail2380;
      h_2158 = term.getSubterm(0);
      z_2297 = h_2158;
      term = collect_one_1_0.instance.invoke(context, z_2297, lifted550.instance);
      if(term == null)
        break Fail2380;
      IStrategoTerm term1441 = term;
      Success1393:
      { 
        Fail2381:
        { 
          term = index_uri_impl_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2381;
          if(true)
            break Success1393;
        }
        term = term1441;
        IStrategoTerm e_2298 = null;
        IStrategoTerm args20 = context.invokePrimitive("SSL_get_arguments", term, NO_STRATEGIES, new IStrategoTerm[]{term});
        term = args20;
        if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
          break Fail2380;
        e_2298 = ((IStrategoList)term).head();
        term = e_2298;
      }
      term = index_uri_to_string_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail2380;
      i_2158 = term;
      term = i_2158;
      IStrategoTerm term1442 = term;
      Success1394:
      { 
        Fail2382:
        { 
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2382;
          if(true)
            break Success1394;
        }
        term = term1442;
        IStrategoTerm term1443 = term;
        Success1395:
        { 
          Fail2383:
          { 
            term = is_string_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail2383;
            if(true)
              break Success1395;
          }
          term = term1443;
          IStrategoTerm term1444 = term;
          Success1396:
          { 
            Fail2384:
            { 
              term = int_to_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail2384;
              if(true)
                break Success1396;
            }
            term = term1444;
            IStrategoTerm term1445 = term;
            Success1397:
            { 
              Fail2385:
              { 
                term = real_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail2385;
                if(true)
                  break Success1397;
              }
              term = term1445;
              IStrategoTerm j_2158 = null;
              IStrategoTerm k_2158 = null;
              IStrategoTerm m_2158 = null;
              j_2158 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail2380;
              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                break Fail2380;
              k_2158 = ((IStrategoList)term).tail();
              m_2158 = k_2158;
              term = report_failure_0_2.instance.invoke(context, m_2158, trans.const495, j_2158);
              if(term == null)
                break Fail2380;
            }
          }
        }
      }
      p_2158 = term;
      n_2158 = trans.const265;
      q_2158 = p_2158;
      term = string_replace_0_2.instance.invoke(context, q_2158, n_2158, trans.const265);
      if(term == null)
        break Fail2380;
      term = (IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)trans.constNil1);
      term = concat_strings_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail2380;
      term = termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil1));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}