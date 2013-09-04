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

@SuppressWarnings("all") public class analyze_top_defs_0_0 extends Strategy 
{ 
  public static analyze_top_defs_0_0 instance = new analyze_top_defs_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("analyze_top_defs_0_0");
    Fail4894:
    { 
      IStrategoTerm i_11959 = null;
      IStrategoTerm j_11959 = null;
      IStrategoTerm k_11959 = null;
      IStrategoTerm l_11959 = null;
      IStrategoTerm m_11959 = null;
      IStrategoTerm p_11959 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail4894;
      i_11959 = term.getSubterm(0);
      m_11959 = term.getSubterm(1);
      p_11959 = term;
      IStrategoTerm term2793 = term;
      Success2770:
      { 
        Fail4895:
        { 
          term = index_set_current_file_0_0.instance.invoke(context, m_11959);
          if(term == null)
            break Fail4895;
          term = termFactory.makeAppl(Main._consSome_1, new IStrategoTerm[]{i_11959});
          term = analyze_defs_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail4895;
          if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
            break Fail4895;
          IStrategoTerm arg1498 = term.getSubterm(0);
          if(arg1498.getTermType() != IStrategoTerm.APPL || Main._consSome_1 != ((IStrategoAppl)arg1498).getConstructor())
            break Fail4895;
          j_11959 = arg1498.getSubterm(0);
          k_11959 = term.getSubterm(1);
          term = map_1_0.instance.invoke(context, k_11959, $Snd_0_0.instance);
          if(term == null)
            break Fail4895;
          l_11959 = term;
          term = index_add_all_0_1.instance.invoke(context, term, m_11959);
          if(term == null)
            break Fail4895;
          if(true)
            break Success2770;
        }
        term = term2793;
        IStrategoTerm n_11959 = null;
        IStrategoTerm o_11959 = null;
        IStrategoTerm r_11959 = null;
        n_11959 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail4894;
        o_11959 = term;
        r_11959 = n_11959;
        term = report_with_failure_0_2.instance.invoke(context, r_11959, trans.const938, o_11959);
        if(term == null)
          break Fail4894;
      }
      term = p_11959;
      if(j_11959 == null || l_11959 == null)
        break Fail4894;
      term = termFactory.makeTuple(termFactory.makeTuple(j_11959, m_11959), l_11959);
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}