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
    Fail5151:
    { 
      IStrategoTerm m_12002 = null;
      IStrategoTerm n_12002 = null;
      IStrategoTerm r_12002 = null;
      m_12002 = term;
      r_12002 = term;
      IStrategoTerm term2922 = term;
      Success2888:
      { 
        Fail5152:
        { 
          Success2889:
          { 
            Fail5153:
            { 
              IStrategoTerm o_12002 = null;
              o_12002 = term;
              term = is_list_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail5153;
              term = o_12002;
              { 
                term = (IStrategoTerm)termFactory.makeListCons(trans.constCons256, termFactory.makeListCons(m_12002, (IStrategoList)trans.constCons259));
                term = concat_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail5152;
                n_12002 = term;
                if(true)
                  break Success2889;
              }
            }
            term = (IStrategoTerm)termFactory.makeListCons(trans.constGlobal0, termFactory.makeListCons(m_12002, (IStrategoList)trans.constCons260));
            n_12002 = term;
          }
          if(true)
            break Success2888;
        }
        term = term2922;
        IStrategoTerm p_12002 = null;
        IStrategoTerm q_12002 = null;
        IStrategoTerm t_12002 = null;
        p_12002 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail5151;
        q_12002 = term;
        t_12002 = p_12002;
        term = report_with_failure_0_2.instance.invoke(context, t_12002, trans.const990, q_12002);
        if(term == null)
          break Fail5151;
      }
      term = r_12002;
      if(n_12002 == null)
        break Fail5151;
      term = n_12002;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}