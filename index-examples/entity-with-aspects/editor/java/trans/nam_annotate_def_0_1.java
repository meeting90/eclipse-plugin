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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm q_2121)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("nam_annotate_def_0_1");
    Fail2133:
    { 
      IStrategoTerm r_2121 = null;
      IStrategoTerm s_2121 = null;
      IStrategoTerm v_2121 = null;
      r_2121 = term;
      v_2121 = term;
      IStrategoTerm term1323 = term;
      Success1293:
      { 
        Fail2134:
        { 
          term = termFactory.annotateTerm(r_2121, checkListAnnos(termFactory, (IStrategoTerm)termFactory.makeListCons(q_2121, (IStrategoList)trans.constNil1)));
          s_2121 = term;
          if(true)
            break Success1293;
        }
        term = term1323;
        IStrategoTerm t_2121 = null;
        IStrategoTerm u_2121 = null;
        IStrategoTerm x_2121 = null;
        t_2121 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail2133;
        u_2121 = term;
        x_2121 = t_2121;
        term = report_with_failure_0_2.instance.invoke(context, x_2121, trans.const446, u_2121);
        if(term == null)
          break Fail2133;
      }
      term = v_2121;
      if(s_2121 == null)
        break Fail2133;
      term = s_2121;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}