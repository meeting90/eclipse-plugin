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

@SuppressWarnings("all") public class index_clear_global_0_1 extends Strategy 
{ 
  public static index_clear_global_0_1 instance = new index_clear_global_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm b_2139)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("index_clear_global_0_1");
    Fail2247:
    { 
      IStrategoTerm e_2139 = null;
      e_2139 = term;
      IStrategoTerm term1365 = term;
      Success1331:
      { 
        Fail2248:
        { 
          IStrategoTerm h_2139 = null;
          IStrategoTerm i_2139 = null;
          IStrategoTerm j_2139 = null;
          IStrategoTerm m_2296 = null;
          IStrategoTerm r_2296 = null;
          IStrategoTerm o_2296 = null;
          term = index_globals_uri_0_0.instance.invoke(context, b_2139);
          if(term == null)
            break Fail2248;
          term = termFactory.makeAppl(Main._consGlobal_2, new IStrategoTerm[]{term, trans.const362});
          i_2139 = term;
          j_2139 = trans.const460;
          h_2139 = j_2139;
          r_2296 = i_2139;
          m_2296 = h_2139;
          term = r_2296;
          o_2296 = r_2296;
          term = context.invokePrimitive("LANG_index_remove", o_2296, NO_STRATEGIES, new IStrategoTerm[]{term, m_2296});
          if(term == null)
            break Fail2248;
          if(true)
            break Success1331;
        }
        term = term1365;
        IStrategoTerm c_2139 = null;
        IStrategoTerm d_2139 = null;
        IStrategoTerm m_2139 = null;
        c_2139 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail2247;
        d_2139 = term;
        m_2139 = c_2139;
        term = report_with_failure_0_2.instance.invoke(context, m_2139, trans.const468, d_2139);
        if(term == null)
          break Fail2247;
      }
      term = e_2139;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}