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

@SuppressWarnings("all") public class index_file_dependent_construct_0_0 extends Strategy 
{ 
  public static index_file_dependent_construct_0_0 instance = new index_file_dependent_construct_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("index_file_dependent_construct_0_0");
    Fail2123:
    { 
      IStrategoTerm r_2120 = null;
      IStrategoTerm s_2120 = null;
      IStrategoTerm t_2120 = null;
      IStrategoTerm w_2120 = null;
      s_2120 = term;
      w_2120 = term;
      IStrategoTerm term1318 = term;
      Success1288:
      { 
        Fail2124:
        { 
          term = termFactory.makeAppl(Main._consDef_1, new IStrategoTerm[]{s_2120});
          term = index_get_uses_all_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2124;
          r_2120 = term;
          term = termFactory.makeAppl(Main._consDef_1, new IStrategoTerm[]{s_2120});
          term = index_get_reads_all_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2124;
          t_2120 = term;
          if(true)
            break Success1288;
        }
        term = term1318;
        IStrategoTerm u_2120 = null;
        IStrategoTerm v_2120 = null;
        IStrategoTerm y_2120 = null;
        u_2120 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail2123;
        v_2120 = term;
        y_2120 = u_2120;
        term = report_with_failure_0_2.instance.invoke(context, y_2120, trans.const445, v_2120);
        if(term == null)
          break Fail2123;
      }
      term = w_2120;
      if(r_2120 == null || t_2120 == null)
        break Fail2123;
      term = termFactory.makeTuple(r_2120, t_2120);
      term = conc_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail2123;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}