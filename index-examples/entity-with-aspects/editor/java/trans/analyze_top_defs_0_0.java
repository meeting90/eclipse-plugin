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
    Fail1992:
    { 
      IStrategoTerm n_2096 = null;
      IStrategoTerm o_2096 = null;
      IStrategoTerm p_2096 = null;
      IStrategoTerm q_2096 = null;
      IStrategoTerm r_2096 = null;
      IStrategoTerm u_2096 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail1992;
      n_2096 = term.getSubterm(0);
      r_2096 = term.getSubterm(1);
      u_2096 = term;
      IStrategoTerm term1237 = term;
      Success1214:
      { 
        Fail1993:
        { 
          term = index_set_current_file_0_0.instance.invoke(context, r_2096);
          if(term == null)
            break Fail1993;
          term = termFactory.makeAppl(Main._consSome_1, new IStrategoTerm[]{n_2096});
          term = analyze_defs_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1993;
          if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
            break Fail1993;
          IStrategoTerm arg644 = term.getSubterm(0);
          if(arg644.getTermType() != IStrategoTerm.APPL || Main._consSome_1 != ((IStrategoAppl)arg644).getConstructor())
            break Fail1993;
          o_2096 = arg644.getSubterm(0);
          p_2096 = term.getSubterm(1);
          term = map_1_0.instance.invoke(context, p_2096, $Snd_0_0.instance);
          if(term == null)
            break Fail1993;
          q_2096 = term;
          term = index_add_all_0_1.instance.invoke(context, term, r_2096);
          if(term == null)
            break Fail1993;
          if(true)
            break Success1214;
        }
        term = term1237;
        IStrategoTerm s_2096 = null;
        IStrategoTerm t_2096 = null;
        IStrategoTerm w_2096 = null;
        s_2096 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail1992;
        t_2096 = term;
        w_2096 = s_2096;
        term = report_with_failure_0_2.instance.invoke(context, w_2096, trans.const418, t_2096);
        if(term == null)
          break Fail1992;
      }
      term = u_2096;
      if(o_2096 == null || q_2096 == null)
        break Fail1992;
      term = termFactory.makeTuple(termFactory.makeTuple(o_2096, r_2096), q_2096);
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}