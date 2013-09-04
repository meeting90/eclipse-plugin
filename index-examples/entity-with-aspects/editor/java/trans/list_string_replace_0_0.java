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

@SuppressWarnings("all") public class list_string_replace_0_0 extends Strategy 
{ 
  public static list_string_replace_0_0 instance = new list_string_replace_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("list_string_replace_0_0");
    Fail4465:
    { 
      IStrategoTerm v_11898 = null;
      IStrategoTerm w_11898 = null;
      IStrategoTerm x_11898 = null;
      IStrategoTerm d_11899 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail4465;
      w_11898 = term.getSubterm(0);
      v_11898 = term.getSubterm(1);
      d_11899 = term;
      IStrategoTerm term2442 = term;
      Success2434:
      { 
        Fail4466:
        { 
          term = termFactory.makeTuple(v_11898, w_11898);
          term = foldl_1_0.instance.invoke(context, term, lifted939.instance);
          if(term == null)
            break Fail4466;
          x_11898 = term;
          if(true)
            break Success2434;
        }
        term = term2442;
        IStrategoTerm b_11899 = null;
        IStrategoTerm c_11899 = null;
        IStrategoTerm f_11899 = null;
        b_11899 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail4465;
        c_11899 = term;
        f_11899 = b_11899;
        term = report_with_failure_0_2.instance.invoke(context, f_11899, trans.const817, c_11899);
        if(term == null)
          break Fail4465;
      }
      term = d_11899;
      if(x_11898 == null)
        break Fail4465;
      term = x_11898;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}