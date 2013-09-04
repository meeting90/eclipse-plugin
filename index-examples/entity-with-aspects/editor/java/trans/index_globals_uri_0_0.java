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
    Fail2237:
    { 
      IStrategoTerm z_2136 = null;
      IStrategoTerm a_2137 = null;
      IStrategoTerm e_2137 = null;
      z_2136 = term;
      e_2137 = term;
      IStrategoTerm term1360 = term;
      Success1326:
      { 
        Fail2238:
        { 
          Success1327:
          { 
            Fail2239:
            { 
              IStrategoTerm b_2137 = null;
              b_2137 = term;
              term = is_list_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail2239;
              term = b_2137;
              { 
                term = (IStrategoTerm)termFactory.makeListCons(trans.constCons124, termFactory.makeListCons(z_2136, (IStrategoList)trans.constCons123));
                term = concat_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail2238;
                a_2137 = term;
                if(true)
                  break Success1327;
              }
            }
            term = (IStrategoTerm)termFactory.makeListCons(trans.constGlobal0, termFactory.makeListCons(z_2136, (IStrategoList)trans.constCons125));
            a_2137 = term;
          }
          if(true)
            break Success1326;
        }
        term = term1360;
        IStrategoTerm c_2137 = null;
        IStrategoTerm d_2137 = null;
        IStrategoTerm g_2137 = null;
        c_2137 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail2237;
        d_2137 = term;
        g_2137 = c_2137;
        term = report_with_failure_0_2.instance.invoke(context, g_2137, trans.const464, d_2137);
        if(term == null)
          break Fail2237;
      }
      term = e_2137;
      if(a_2137 == null)
        break Fail2237;
      term = a_2137;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}