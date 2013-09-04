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

@SuppressWarnings("all") public class nam_annotate_def_0_1 extends Strategy 
{ 
  public static nam_annotate_def_0_1 instance = new nam_annotate_def_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm l_11984)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("nam_annotate_def_0_1");
    Fail5035:
    { 
      IStrategoTerm m_11984 = null;
      IStrategoTerm n_11984 = null;
      IStrategoTerm q_11984 = null;
      m_11984 = term;
      q_11984 = term;
      IStrategoTerm term2879 = term;
      Success2849:
      { 
        Fail5036:
        { 
          term = termFactory.annotateTerm(m_11984, checkListAnnos(termFactory, (IStrategoTerm)termFactory.makeListCons(l_11984, (IStrategoList)trans.constNil3)));
          n_11984 = term;
          if(true)
            break Success2849;
        }
        term = term2879;
        IStrategoTerm o_11984 = null;
        IStrategoTerm p_11984 = null;
        IStrategoTerm s_11984 = null;
        o_11984 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail5035;
        p_11984 = term;
        s_11984 = o_11984;
        term = report_with_failure_0_2.instance.invoke(context, s_11984, trans.const966, p_11984);
        if(term == null)
          break Fail5035;
      }
      term = q_11984;
      if(n_11984 == null)
        break Fail5035;
      term = n_11984;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}