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
    Fail2034:
    { 
      IStrategoTerm x_2106 = null;
      IStrategoTerm y_2106 = null;
      IStrategoTerm z_2106 = null;
      IStrategoTerm e_2107 = null;
      x_2106 = term;
      e_2107 = term;
      IStrategoTerm term1265 = term;
      Success1238:
      { 
        Fail2035:
        { 
          Success1239:
          { 
            Fail2036:
            { 
              IStrategoTerm a_2107 = null;
              a_2107 = term;
              term = file_exists_0_0.instance.invoke(context, x_2106);
              if(term == null)
                break Fail2036;
              term = a_2107;
              { 
                Success1240:
                { 
                  Fail2037:
                  { 
                    IStrategoTerm b_2107 = null;
                    b_2107 = term;
                    term = parse_file_0_0.instance.invoke(context, x_2106);
                    if(term == null)
                      break Fail2037;
                    y_2106 = term;
                    term = b_2107;
                    { 
                      term = y_2106;
                      z_2106 = y_2106;
                      if(true)
                        break Success1240;
                    }
                  }
                  term = trans.const362;
                  z_2106 = trans.const362;
                }
                if(true)
                  break Success1239;
              }
            }
            term = trans.const362;
            z_2106 = trans.const362;
          }
          if(true)
            break Success1238;
        }
        term = term1265;
        IStrategoTerm c_2107 = null;
        IStrategoTerm d_2107 = null;
        IStrategoTerm g_2107 = null;
        c_2107 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail2034;
        d_2107 = term;
        g_2107 = c_2107;
        term = report_with_failure_0_2.instance.invoke(context, g_2107, trans.const425, d_2107);
        if(term == null)
          break Fail2034;
      }
      term = e_2107;
      if(z_2106 == null)
        break Fail2034;
      term = termFactory.makeTuple(z_2106, x_2106);
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}