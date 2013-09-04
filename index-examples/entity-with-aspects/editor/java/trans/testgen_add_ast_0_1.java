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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm e_11902)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("testgen_add_ast_0_1");
    Fail4498:
    { 
      IStrategoTerm f_11902 = null;
      IStrategoTerm g_11902 = null;
      IStrategoTerm i_11902 = null;
      IStrategoTerm j_11902 = null;
      IStrategoTerm l_11902 = null;
      IStrategoTerm o_11902 = null;
      f_11902 = term;
      o_11902 = term;
      IStrategoTerm term2445 = term;
      Success2437:
      { 
        Fail4499:
        { 
          IStrategoTerm q_11902 = null;
          term = index_set_current_file_0_0.instance.invoke(context, e_11902);
          if(term == null)
            break Fail4499;
          term = termFactory.makeAppl(Main._consSome_1, new IStrategoTerm[]{f_11902});
          term = analyze_defs_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail4499;
          if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
            break Fail4499;
          IStrategoTerm arg1381 = term.getSubterm(0);
          if(arg1381.getTermType() != IStrategoTerm.APPL || Main._consSome_1 != ((IStrategoAppl)arg1381).getConstructor())
            break Fail4499;
          i_11902 = arg1381.getSubterm(0);
          g_11902 = term.getSubterm(1);
          term = map_1_0.instance.invoke(context, g_11902, $Snd_0_0.instance);
          if(term == null)
            break Fail4499;
          term = index_add_all_0_1.instance.invoke(context, term, e_11902);
          if(term == null)
            break Fail4499;
          term = i_11902;
          q_11902 = i_11902;
          term = context.invokePrimitive("SSL_EXT_clone_and_set_parents", q_11902, NO_STRATEGIES, new IStrategoTerm[]{term});
          if(term == null)
            break Fail4499;
          j_11902 = term;
          term = origin_track_forced_1_0.instance.invoke(context, term, analyze_tree_data_0_0.instance);
          if(term == null)
            break Fail4499;
          term = analyze_uses_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail4499;
          if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
            break Fail4499;
          l_11902 = term.getSubterm(0);
          term = index_add_all_0_1.instance.invoke(context, l_11902, e_11902);
          if(term == null)
            break Fail4499;
          if(true)
            break Success2437;
        }
        term = term2445;
        IStrategoTerm m_11902 = null;
        IStrategoTerm n_11902 = null;
        IStrategoTerm u_11902 = null;
        m_11902 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail4498;
        n_11902 = term;
        u_11902 = m_11902;
        term = report_with_failure_0_2.instance.invoke(context, u_11902, trans.const831, n_11902);
        if(term == null)
          break Fail4498;
      }
      term = o_11902;
      if(j_11902 == null)
        break Fail4498;
      term = j_11902;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}