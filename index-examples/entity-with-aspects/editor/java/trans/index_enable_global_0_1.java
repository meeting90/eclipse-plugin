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

@SuppressWarnings("all") public class index_enable_global_0_1 extends Strategy 
{ 
  public static index_enable_global_0_1 instance = new index_enable_global_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm b_2140)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("index_enable_global_0_1");
    Fail2252:
    { 
      IStrategoTerm e_2140 = null;
      e_2140 = term;
      IStrategoTerm term1368 = term;
      Success1334:
      { 
        Fail2253:
        { 
          IStrategoTerm h_2140 = null;
          IStrategoTerm i_2140 = null;
          IStrategoTerm j_2140 = null;
          IStrategoTerm s_2296 = null;
          IStrategoTerm x_2296 = null;
          IStrategoTerm u_2296 = null;
          term = index_boolean_globals_uri_0_0.instance.invoke(context, b_2140);
          if(term == null)
            break Fail2253;
          term = termFactory.makeAppl(Main._consGlobal_1, new IStrategoTerm[]{term});
          i_2140 = term;
          j_2140 = trans.const460;
          h_2140 = j_2140;
          x_2296 = i_2140;
          s_2296 = h_2140;
          term = x_2296;
          u_2296 = x_2296;
          term = context.invokePrimitive("LANG_index_add", u_2296, NO_STRATEGIES, new IStrategoTerm[]{term, s_2296});
          if(term == null)
            break Fail2253;
          if(true)
            break Success1334;
        }
        term = term1368;
        IStrategoTerm c_2140 = null;
        IStrategoTerm d_2140 = null;
        IStrategoTerm m_2140 = null;
        c_2140 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail2252;
        d_2140 = term;
        m_2140 = c_2140;
        term = report_with_failure_0_2.instance.invoke(context, m_2140, trans.const471, d_2140);
        if(term == null)
          break Fail2252;
      }
      term = e_2140;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}