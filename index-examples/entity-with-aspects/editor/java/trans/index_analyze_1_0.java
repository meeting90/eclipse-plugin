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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy h_11969)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("index_analyze_1_0");
    Fail4932:
    { 
      IStrategoTerm w_11968 = null;
      IStrategoTerm z_11968 = null;
      IStrategoTerm a_11969 = null;
      IStrategoTerm b_11969 = null;
      IStrategoTerm i_11969 = null;
      w_11968 = term;
      i_11969 = term;
      IStrategoTerm term2818 = term;
      Success2791:
      { 
        Fail4933:
        { 
          term = map_1_0.instance.invoke(context, w_11968, index_parse_file_0_0.instance);
          if(term == null)
            break Fail4933;
          term = map_1_0.instance.invoke(context, term, lifted1023.instance);
          if(term == null)
            break Fail4933;
          term = h_11969.invoke(context, term);
          if(term == null)
            break Fail4933;
          a_11969 = term;
          term = mapconcat_1_0.instance.invoke(context, term, lifted1024.instance);
          if(term == null)
            break Fail4933;
          term = make_set_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail4933;
          z_11968 = term;
          Success2792:
          { 
            Fail4934:
            { 
              IStrategoTerm e_11969 = null;
              e_11969 = term;
              IStrategoTerm term2820 = term;
              Success2793:
              { 
                Fail4935:
                { 
                  term = z_11968;
                  if(term.getTermType() != IStrategoTerm.LIST || !((IStrategoList)term).isEmpty())
                    break Fail4935;
                  { 
                    if(true)
                      break Fail4934;
                    if(true)
                      break Success2793;
                  }
                }
                term = term2820;
              }
              term = e_11969;
              { 
                term = this.invoke(context, z_11968, h_11969);
                if(term == null)
                  break Fail4933;
                term = termFactory.makeTuple(a_11969, term);
                term = conc_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail4933;
                b_11969 = term;
                if(true)
                  break Success2792;
              }
            }
            term = a_11969;
            b_11969 = a_11969;
          }
          if(true)
            break Success2791;
        }
        term = term2818;
        IStrategoTerm f_11969 = null;
        IStrategoTerm g_11969 = null;
        IStrategoTerm p_11969 = null;
        f_11969 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail4932;
        g_11969 = term;
        p_11969 = f_11969;
        term = report_with_failure_0_2.instance.invoke(context, p_11969, trans.const944, g_11969);
        if(term == null)
          break Fail4932;
      }
      term = i_11969;
      if(b_11969 == null)
        break Fail4932;
      term = b_11969;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}