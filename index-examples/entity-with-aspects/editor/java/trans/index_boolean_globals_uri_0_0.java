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

@SuppressWarnings("all") public class index_boolean_globals_uri_0_0 extends Strategy 
{ 
  public static index_boolean_globals_uri_0_0 instance = new index_boolean_globals_uri_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("index_boolean_globals_uri_0_0");
    Fail2249:
    { 
      IStrategoTerm r_2139 = null;
      IStrategoTerm s_2139 = null;
      IStrategoTerm w_2139 = null;
      r_2139 = term;
      w_2139 = term;
      IStrategoTerm term1366 = term;
      Success1332:
      { 
        Fail2250:
        { 
          Success1333:
          { 
            Fail2251:
            { 
              IStrategoTerm t_2139 = null;
              t_2139 = term;
              term = is_list_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail2251;
              term = t_2139;
              { 
                term = (IStrategoTerm)termFactory.makeListCons(trans.constCons124, termFactory.makeListCons(r_2139, (IStrategoList)trans.constCons127));
                term = concat_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail2250;
                s_2139 = term;
                if(true)
                  break Success1333;
              }
            }
            term = (IStrategoTerm)termFactory.makeListCons(trans.constGlobal0, termFactory.makeListCons(r_2139, (IStrategoList)trans.constCons128));
            s_2139 = term;
          }
          if(true)
            break Success1332;
        }
        term = term1366;
        IStrategoTerm u_2139 = null;
        IStrategoTerm v_2139 = null;
        IStrategoTerm y_2139 = null;
        u_2139 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail2249;
        v_2139 = term;
        y_2139 = u_2139;
        term = report_with_failure_0_2.instance.invoke(context, y_2139, trans.const470, v_2139);
        if(term == null)
          break Fail2249;
      }
      term = w_2139;
      if(s_2139 == null)
        break Fail2249;
      term = s_2139;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}