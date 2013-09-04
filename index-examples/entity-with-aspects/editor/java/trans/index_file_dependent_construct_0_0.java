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
    Fail5025:
    { 
      IStrategoTerm m_11983 = null;
      IStrategoTerm n_11983 = null;
      IStrategoTerm o_11983 = null;
      IStrategoTerm r_11983 = null;
      n_11983 = term;
      r_11983 = term;
      IStrategoTerm term2874 = term;
      Success2844:
      { 
        Fail5026:
        { 
          term = termFactory.makeAppl(Main._consDef_1, new IStrategoTerm[]{n_11983});
          term = index_get_uses_all_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail5026;
          m_11983 = term;
          term = termFactory.makeAppl(Main._consDef_1, new IStrategoTerm[]{n_11983});
          term = index_get_reads_all_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail5026;
          o_11983 = term;
          if(true)
            break Success2844;
        }
        term = term2874;
        IStrategoTerm p_11983 = null;
        IStrategoTerm q_11983 = null;
        IStrategoTerm t_11983 = null;
        p_11983 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail5025;
        q_11983 = term;
        t_11983 = p_11983;
        term = report_with_failure_0_2.instance.invoke(context, t_11983, trans.const965, q_11983);
        if(term == null)
          break Fail5025;
      }
      term = r_11983;
      if(m_11983 == null || o_11983 == null)
        break Fail5025;
      term = termFactory.makeTuple(m_11983, o_11983);
      term = conc_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail5025;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}