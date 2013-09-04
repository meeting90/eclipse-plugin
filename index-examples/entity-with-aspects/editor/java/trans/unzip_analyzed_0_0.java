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

@SuppressWarnings("all") public class unzip_analyzed_0_0 extends Strategy 
{ 
  public static unzip_analyzed_0_0 instance = new unzip_analyzed_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("unzip_analyzed_0_0");
    Fail2104:
    { 
      IStrategoTerm o_2118 = null;
      IStrategoTerm p_2118 = null;
      IStrategoTerm q_2118 = null;
      IStrategoTerm w_2118 = null;
      p_2118 = term;
      w_2118 = term;
      IStrategoTerm term1309 = term;
      Success1279:
      { 
        Fail2105:
        { 
          term = SRTS_all.instance.invoke(context, p_2118, lifted449.instance);
          if(term == null)
            break Fail2105;
          o_2118 = term;
          term = p_2118;
          IStrategoTerm term1310 = term;
          Success1280:
          { 
            Fail2106:
            { 
              term = get_appl_arguments_1_0.instance.invoke(context, term, lifted450.instance);
              if(term == null)
                break Fail2106;
              if(true)
                break Success1280;
            }
            term = term1310;
            Success1281:
            { 
              Fail2107:
              { 
                term = map_1_0.instance.invoke(context, term, lifted451.instance);
                if(term == null)
                  break Fail2107;
                if(true)
                  break Success1281;
              }
              term = trans.constNil1;
            }
          }
          term = concat_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2105;
          q_2118 = term;
          if(true)
            break Success1279;
        }
        term = term1309;
        IStrategoTerm u_2118 = null;
        IStrategoTerm v_2118 = null;
        IStrategoTerm y_2118 = null;
        u_2118 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail2104;
        v_2118 = term;
        y_2118 = u_2118;
        term = report_with_failure_0_2.instance.invoke(context, y_2118, trans.const442, v_2118);
        if(term == null)
          break Fail2104;
      }
      term = w_2118;
      if(o_2118 == null || q_2118 == null)
        break Fail2104;
      term = termFactory.makeTuple(o_2118, q_2118);
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}