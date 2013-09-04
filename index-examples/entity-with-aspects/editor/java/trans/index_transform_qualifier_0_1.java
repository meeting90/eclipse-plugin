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

@SuppressWarnings("all") public class index_transform_qualifier_0_1 extends Strategy 
{ 
  public static index_transform_qualifier_0_1 instance = new index_transform_qualifier_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm t_2109)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("index_transform_qualifier_0_1");
    Fail2050:
    { 
      IStrategoTerm u_2109 = null;
      IStrategoTerm v_2109 = null;
      IStrategoTerm w_2109 = null;
      IStrategoTerm z_2109 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail2050;
      v_2109 = term.getSubterm(0);
      u_2109 = term.getSubterm(1);
      z_2109 = term;
      IStrategoTerm term1276 = term;
      Success1249:
      { 
        Fail2051:
        { 
          term = index_create_qualifier_0_1.instance.invoke(context, v_2109, t_2109);
          if(term == null)
            break Fail2051;
          w_2109 = term;
          if(true)
            break Success1249;
        }
        term = term1276;
        IStrategoTerm x_2109 = null;
        IStrategoTerm y_2109 = null;
        IStrategoTerm b_2110 = null;
        x_2109 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail2050;
        y_2109 = term;
        b_2110 = x_2109;
        term = report_with_failure_0_2.instance.invoke(context, b_2110, trans.const431, y_2109);
        if(term == null)
          break Fail2050;
      }
      term = z_2109;
      if(w_2109 == null)
        break Fail2050;
      term = termFactory.makeTuple(w_2109, u_2109);
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}