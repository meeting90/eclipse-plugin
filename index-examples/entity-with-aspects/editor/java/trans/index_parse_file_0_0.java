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

@SuppressWarnings("all") public class index_parse_file_0_0 extends Strategy 
{ 
  public static index_parse_file_0_0 instance = new index_parse_file_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("index_parse_file_0_0");
    Fail4936:
    { 
      IStrategoTerm s_11969 = null;
      IStrategoTerm t_11969 = null;
      IStrategoTerm u_11969 = null;
      IStrategoTerm z_11969 = null;
      s_11969 = term;
      z_11969 = term;
      IStrategoTerm term2821 = term;
      Success2794:
      { 
        Fail4937:
        { 
          Success2795:
          { 
            Fail4938:
            { 
              IStrategoTerm v_11969 = null;
              v_11969 = term;
              term = file_exists_0_0.instance.invoke(context, s_11969);
              if(term == null)
                break Fail4938;
              term = v_11969;
              { 
                Success2796:
                { 
                  Fail4939:
                  { 
                    IStrategoTerm w_11969 = null;
                    w_11969 = term;
                    term = parse_file_0_0.instance.invoke(context, s_11969);
                    if(term == null)
                      break Fail4939;
                    t_11969 = term;
                    term = w_11969;
                    { 
                      term = t_11969;
                      u_11969 = t_11969;
                      if(true)
                        break Success2796;
                    }
                  }
                  term = trans.const882;
                  u_11969 = trans.const882;
                }
                if(true)
                  break Success2795;
              }
            }
            term = trans.const882;
            u_11969 = trans.const882;
          }
          if(true)
            break Success2794;
        }
        term = term2821;
        IStrategoTerm x_11969 = null;
        IStrategoTerm y_11969 = null;
        IStrategoTerm b_11970 = null;
        x_11969 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail4936;
        y_11969 = term;
        b_11970 = x_11969;
        term = report_with_failure_0_2.instance.invoke(context, b_11970, trans.const945, y_11969);
        if(term == null)
          break Fail4936;
      }
      term = z_11969;
      if(u_11969 == null)
        break Fail4936;
      term = termFactory.makeTuple(u_11969, s_11969);
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}