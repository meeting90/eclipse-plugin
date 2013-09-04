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

@SuppressWarnings("all") public class index_compilation_file_0_1 extends Strategy 
{ 
  public static index_compilation_file_0_1 instance = new index_compilation_file_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm e_11950)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("index_compilation_file_0_1");
    Fail4846:
    { 
      TermReference g_11950 = new TermReference();
      TermReference h_11950 = new TermReference();
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail4846;
      if(g_11950.value == null)
        g_11950.value = term.getSubterm(0);
      else
        if(g_11950.value != term.getSubterm(0) && !g_11950.value.match(term.getSubterm(0)))
          break Fail4846;
      if(h_11950.value == null)
        h_11950.value = term.getSubterm(1);
      else
        if(h_11950.value != term.getSubterm(1) && !h_11950.value.match(term.getSubterm(1)))
          break Fail4846;
      IStrategoTerm term2758 = term;
      Success2736:
      { 
        Fail4847:
        { 
          if(g_11950.value == null)
            break Fail4847;
          term = termFactory.makeAppl(Main._consAST_2, new IStrategoTerm[]{termFactory.makeTuple(e_11950, g_11950.value), trans.const882});
          term = index_get_all_values_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail4847;
          lifted991 lifted9910 = new lifted991();
          lifted9910.g_11950 = g_11950;
          lifted9910.h_11950 = h_11950;
          term = map_1_0.instance.invoke(context, term, lifted9910);
          if(term == null)
            break Fail4847;
          if(true)
            break Success2736;
        }
        term = term2758;
        IStrategoTerm i_11950 = null;
        IStrategoTerm j_11950 = null;
        IStrategoTerm m_11950 = null;
        i_11950 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail4846;
        j_11950 = term;
        m_11950 = i_11950;
        term = report_with_failure_0_2.instance.invoke(context, m_11950, trans.const920, j_11950);
        if(term == null)
          break Fail4846;
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