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

@SuppressWarnings("all") public class index_uri_to_string_0_0 extends Strategy 
{ 
  public static index_uri_to_string_0_0 instance = new index_uri_to_string_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("index_uri_to_string_0_0");
    Fail2268:
    { 
      IStrategoTerm s_2142 = null;
      IStrategoTerm t_2142 = null;
      IStrategoTerm u_2142 = null;
      IStrategoTerm v_2142 = null;
      IStrategoTerm y_2142 = null;
      if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
        break Fail2268;
      u_2142 = ((IStrategoList)term).head();
      s_2142 = ((IStrategoList)term).tail();
      y_2142 = term;
      IStrategoTerm term1374 = term;
      Success1340:
      { 
        Fail2269:
        { 
          IStrategoTerm z_2142 = null;
          term = index_path_to_string_0_0.instance.invoke(context, s_2142);
          if(term == null)
            break Fail2269;
          t_2142 = term;
          term = u_2142;
          IStrategoTerm cons39 = context.invokePrimitive("SSL_get_constructor", term, NO_STRATEGIES, new IStrategoTerm[]{term});
          z_2142 = cons39;
          term = z_2142;
          v_2142 = z_2142;
          if(true)
            break Success1340;
        }
        term = term1374;
        IStrategoTerm w_2142 = null;
        IStrategoTerm x_2142 = null;
        IStrategoTerm b_2143 = null;
        w_2142 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail2268;
        x_2142 = term;
        b_2143 = w_2142;
        term = report_with_failure_0_2.instance.invoke(context, b_2143, trans.const475, x_2142);
        if(term == null)
          break Fail2268;
      }
      term = y_2142;
      if(v_2142 == null || t_2142 == null)
        break Fail2268;
      term = (IStrategoTerm)termFactory.makeListCons(v_2142, termFactory.makeListCons(trans.const476, termFactory.makeListCons(t_2142, (IStrategoList)trans.constNil1)));
      term = concat_strings_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail2268;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}