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

@SuppressWarnings("all") public class index_globals_uri_0_0 extends Strategy 
{ 
  public static index_globals_uri_0_0 instance = new index_globals_uri_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("index_globals_uri_0_0");
    Fail5139:
    { 
      IStrategoTerm u_11999 = null;
      IStrategoTerm v_11999 = null;
      IStrategoTerm z_11999 = null;
      u_11999 = term;
      z_11999 = term;
      IStrategoTerm term2916 = term;
      Success2882:
      { 
        Fail5140:
        { 
          Success2883:
          { 
            Fail5141:
            { 
              IStrategoTerm w_11999 = null;
              w_11999 = term;
              term = is_list_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail5141;
              term = w_11999;
              { 
                term = (IStrategoTerm)termFactory.makeListCons(trans.constCons256, termFactory.makeListCons(u_11999, (IStrategoList)trans.constCons255));
                term = concat_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail5140;
                v_11999 = term;
                if(true)
                  break Success2883;
              }
            }
            term = (IStrategoTerm)termFactory.makeListCons(trans.constGlobal0, termFactory.makeListCons(u_11999, (IStrategoList)trans.constCons257));
            v_11999 = term;
          }
          if(true)
            break Success2882;
        }
        term = term2916;
        IStrategoTerm x_11999 = null;
        IStrategoTerm y_11999 = null;
        IStrategoTerm b_12000 = null;
        x_11999 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail5139;
        y_11999 = term;
        b_12000 = x_11999;
        term = report_with_failure_0_2.instance.invoke(context, b_12000, trans.const984, y_11999);
        if(term == null)
          break Fail5139;
      }
      term = z_11999;
      if(v_11999 == null)
        break Fail5139;
      term = v_11999;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}