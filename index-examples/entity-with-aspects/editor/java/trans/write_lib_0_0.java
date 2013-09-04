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

@SuppressWarnings("all") public class write_lib_0_0 extends Strategy 
{ 
  public static write_lib_0_0 instance = new write_lib_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("write_lib_0_0");
    Fail1561:
    { 
      IStrategoTerm n_2035 = null;
      IStrategoTerm p_2035 = null;
      IStrategoTerm q_2035 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail1561;
      q_2035 = term.getSubterm(0);
      n_2035 = term.getSubterm(1);
      IStrategoTerm term885 = term;
      Success877:
      { 
        Fail1562:
        { 
          term = termFactory.makeTuple(n_2035, trans.constCons100);
          term = list_string_replace_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1562;
          p_2035 = term;
          term = termFactory.makeTuple(q_2035, trans.const295);
          term = fopen_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1562;
          term = termFactory.makeTuple(p_2035, term);
          term = fputs_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1562;
          term = fclose_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1562;
          if(true)
            break Success877;
        }
        term = term885;
        IStrategoTerm r_2035 = null;
        IStrategoTerm s_2035 = null;
        IStrategoTerm x_2035 = null;
        r_2035 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail1561;
        s_2035 = term;
        x_2035 = r_2035;
        term = report_with_failure_0_2.instance.invoke(context, x_2035, trans.const296, s_2035);
        if(term == null)
          break Fail1561;
      }
      term = trans.constNone0;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}