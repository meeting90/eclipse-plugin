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
    Fail4463:
    { 
      IStrategoTerm i_11898 = null;
      IStrategoTerm k_11898 = null;
      IStrategoTerm l_11898 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail4463;
      l_11898 = term.getSubterm(0);
      i_11898 = term.getSubterm(1);
      IStrategoTerm term2441 = term;
      Success2433:
      { 
        Fail4464:
        { 
          term = termFactory.makeTuple(i_11898, trans.constCons232);
          term = list_string_replace_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail4464;
          k_11898 = term;
          term = termFactory.makeTuple(l_11898, trans.const815);
          term = fopen_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail4464;
          term = termFactory.makeTuple(k_11898, term);
          term = fputs_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail4464;
          term = fclose_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail4464;
          if(true)
            break Success2433;
        }
        term = term2441;
        IStrategoTerm m_11898 = null;
        IStrategoTerm n_11898 = null;
        IStrategoTerm s_11898 = null;
        m_11898 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail4463;
        n_11898 = term;
        s_11898 = m_11898;
        term = report_with_failure_0_2.instance.invoke(context, s_11898, trans.const816, n_11898);
        if(term == null)
          break Fail4463;
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