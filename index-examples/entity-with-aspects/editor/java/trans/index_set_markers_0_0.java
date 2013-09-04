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

@SuppressWarnings("all") public class index_set_markers_0_0 extends Strategy 
{ 
  public static index_set_markers_0_0 instance = new index_set_markers_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("index_set_markers_0_0");
    Fail4940:
    { 
      IStrategoTerm f_11970 = null;
      IStrategoTerm g_11970 = null;
      IStrategoTerm h_11970 = null;
      IStrategoTerm i_11970 = null;
      IStrategoTerm j_11970 = null;
      IStrategoTerm m_11970 = null;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consParallelResults_6 != ((IStrategoAppl)term).getConstructor())
        break Fail4940;
      j_11970 = term.getSubterm(0);
      f_11970 = term.getSubterm(1);
      g_11970 = term.getSubterm(2);
      h_11970 = term.getSubterm(3);
      i_11970 = term.getSubterm(4);
      m_11970 = term;
      IStrategoTerm term2824 = term;
      Success2797:
      { 
        Fail4941:
        { 
          term = termFactory.makeTuple(f_11970, g_11970, h_11970, i_11970);
          term = set_markers_0_1.instance.invoke(context, term, j_11970);
          if(term == null)
            break Fail4941;
          if(true)
            break Success2797;
        }
        term = term2824;
        IStrategoTerm k_11970 = null;
        IStrategoTerm l_11970 = null;
        IStrategoTerm o_11970 = null;
        k_11970 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail4940;
        l_11970 = term;
        o_11970 = k_11970;
        term = report_with_failure_0_2.instance.invoke(context, o_11970, trans.const946, l_11970);
        if(term == null)
          break Fail4940;
      }
      term = m_11970;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}