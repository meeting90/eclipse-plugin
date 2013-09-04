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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm j_2087)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("index_compilation_file_0_1");
    Fail1944:
    { 
      TermReference l_2087 = new TermReference();
      TermReference m_2087 = new TermReference();
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail1944;
      if(l_2087.value == null)
        l_2087.value = term.getSubterm(0);
      else
        if(l_2087.value != term.getSubterm(0) && !l_2087.value.match(term.getSubterm(0)))
          break Fail1944;
      if(m_2087.value == null)
        m_2087.value = term.getSubterm(1);
      else
        if(m_2087.value != term.getSubterm(1) && !m_2087.value.match(term.getSubterm(1)))
          break Fail1944;
      IStrategoTerm term1202 = term;
      Success1180:
      { 
        Fail1945:
        { 
          if(l_2087.value == null)
            break Fail1945;
          term = termFactory.makeAppl(Main._consAST_2, new IStrategoTerm[]{termFactory.makeTuple(j_2087, l_2087.value), trans.const362});
          term = index_get_all_values_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1945;
          lifted391 lifted3910 = new lifted391();
          lifted3910.l_2087 = l_2087;
          lifted3910.m_2087 = m_2087;
          term = map_1_0.instance.invoke(context, term, lifted3910);
          if(term == null)
            break Fail1945;
          if(true)
            break Success1180;
        }
        term = term1202;
        IStrategoTerm n_2087 = null;
        IStrategoTerm o_2087 = null;
        IStrategoTerm r_2087 = null;
        n_2087 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail1944;
        o_2087 = term;
        r_2087 = n_2087;
        term = report_with_failure_0_2.instance.invoke(context, r_2087, trans.const400, o_2087);
        if(term == null)
          break Fail1944;
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