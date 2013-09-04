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

@SuppressWarnings("all") public class testgen_add_ast_0_1 extends Strategy 
{ 
  public static testgen_add_ast_0_1 instance = new testgen_add_ast_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm j_2039)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("testgen_add_ast_0_1");
    Fail1596:
    { 
      IStrategoTerm k_2039 = null;
      IStrategoTerm l_2039 = null;
      IStrategoTerm n_2039 = null;
      IStrategoTerm o_2039 = null;
      IStrategoTerm q_2039 = null;
      IStrategoTerm t_2039 = null;
      k_2039 = term;
      t_2039 = term;
      IStrategoTerm term889 = term;
      Success881:
      { 
        Fail1597:
        { 
          IStrategoTerm v_2039 = null;
          term = index_set_current_file_0_0.instance.invoke(context, j_2039);
          if(term == null)
            break Fail1597;
          term = termFactory.makeAppl(Main._consSome_1, new IStrategoTerm[]{k_2039});
          term = analyze_defs_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1597;
          if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
            break Fail1597;
          IStrategoTerm arg527 = term.getSubterm(0);
          if(arg527.getTermType() != IStrategoTerm.APPL || Main._consSome_1 != ((IStrategoAppl)arg527).getConstructor())
            break Fail1597;
          n_2039 = arg527.getSubterm(0);
          l_2039 = term.getSubterm(1);
          term = map_1_0.instance.invoke(context, l_2039, $Snd_0_0.instance);
          if(term == null)
            break Fail1597;
          term = index_add_all_0_1.instance.invoke(context, term, j_2039);
          if(term == null)
            break Fail1597;
          term = n_2039;
          v_2039 = n_2039;
          term = context.invokePrimitive("SSL_EXT_clone_and_set_parents", v_2039, NO_STRATEGIES, new IStrategoTerm[]{term});
          if(term == null)
            break Fail1597;
          o_2039 = term;
          term = origin_track_forced_1_0.instance.invoke(context, term, analyze_tree_data_0_0.instance);
          if(term == null)
            break Fail1597;
          term = analyze_uses_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1597;
          if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
            break Fail1597;
          q_2039 = term.getSubterm(0);
          term = index_add_all_0_1.instance.invoke(context, q_2039, j_2039);
          if(term == null)
            break Fail1597;
          if(true)
            break Success881;
        }
        term = term889;
        IStrategoTerm r_2039 = null;
        IStrategoTerm s_2039 = null;
        IStrategoTerm z_2039 = null;
        r_2039 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail1596;
        s_2039 = term;
        z_2039 = r_2039;
        term = report_with_failure_0_2.instance.invoke(context, z_2039, trans.const311, s_2039);
        if(term == null)
          break Fail1596;
      }
      term = t_2039;
      if(o_2039 == null)
        break Fail1596;
      term = o_2039;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}