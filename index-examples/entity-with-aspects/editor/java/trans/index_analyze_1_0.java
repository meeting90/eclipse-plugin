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

@SuppressWarnings("all") public class index_analyze_1_0 extends Strategy 
{ 
  public static index_analyze_1_0 instance = new index_analyze_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy m_2106)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("index_analyze_1_0");
    Fail2030:
    { 
      IStrategoTerm b_2106 = null;
      IStrategoTerm e_2106 = null;
      IStrategoTerm f_2106 = null;
      IStrategoTerm g_2106 = null;
      IStrategoTerm n_2106 = null;
      b_2106 = term;
      n_2106 = term;
      IStrategoTerm term1262 = term;
      Success1235:
      { 
        Fail2031:
        { 
          term = map_1_0.instance.invoke(context, b_2106, index_parse_file_0_0.instance);
          if(term == null)
            break Fail2031;
          term = map_1_0.instance.invoke(context, term, lifted423.instance);
          if(term == null)
            break Fail2031;
          term = m_2106.invoke(context, term);
          if(term == null)
            break Fail2031;
          f_2106 = term;
          term = mapconcat_1_0.instance.invoke(context, term, lifted424.instance);
          if(term == null)
            break Fail2031;
          term = make_set_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2031;
          e_2106 = term;
          Success1236:
          { 
            Fail2032:
            { 
              IStrategoTerm j_2106 = null;
              j_2106 = term;
              IStrategoTerm term1264 = term;
              Success1237:
              { 
                Fail2033:
                { 
                  term = e_2106;
                  if(term.getTermType() != IStrategoTerm.LIST || !((IStrategoList)term).isEmpty())
                    break Fail2033;
                  { 
                    if(true)
                      break Fail2032;
                    if(true)
                      break Success1237;
                  }
                }
                term = term1264;
              }
              term = j_2106;
              { 
                term = this.invoke(context, e_2106, m_2106);
                if(term == null)
                  break Fail2031;
                term = termFactory.makeTuple(f_2106, term);
                term = conc_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail2031;
                g_2106 = term;
                if(true)
                  break Success1236;
              }
            }
            term = f_2106;
            g_2106 = f_2106;
          }
          if(true)
            break Success1235;
        }
        term = term1262;
        IStrategoTerm k_2106 = null;
        IStrategoTerm l_2106 = null;
        IStrategoTerm u_2106 = null;
        k_2106 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail2030;
        l_2106 = term;
        u_2106 = k_2106;
        term = report_with_failure_0_2.instance.invoke(context, u_2106, trans.const424, l_2106);
        if(term == null)
          break Fail2030;
      }
      term = n_2106;
      if(g_2106 == null)
        break Fail2030;
      term = g_2106;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}