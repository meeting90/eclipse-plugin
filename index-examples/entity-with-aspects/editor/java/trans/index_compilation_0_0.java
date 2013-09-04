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

@SuppressWarnings("all") public class index_compilation_0_0 extends Strategy 
{ 
  public static index_compilation_0_0 instance = new index_compilation_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("index_compilation_0_0");
    Fail4841:
    { 
      IStrategoTerm n_11948 = null;
      IStrategoTerm r_11948 = null;
      IStrategoTerm s_11948 = null;
      TermReference t_11948 = new TermReference();
      IStrategoTerm y_11948 = null;
      if(t_11948.value == null)
        t_11948.value = term;
      else
        if(t_11948.value != term && !t_11948.value.match(term))
          break Fail4841;
      y_11948 = term;
      IStrategoTerm term2754 = term;
      Success2733:
      { 
        Fail4842:
        { 
          IStrategoTerm b_11949 = null;
          IStrategoTerm d_11949 = null;
          IStrategoTerm e_11949 = null;
          term = project_path_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail4842;
          n_11948 = term;
          d_11949 = term;
          term = (IStrategoTerm)termFactory.makeListCons(n_11948, (IStrategoList)trans.constNil3);
          b_11949 = term;
          e_11949 = d_11949;
          term = index_setup_0_3.instance.invoke(context, e_11949, t_11948.value, b_11949, trans.const889);
          if(term == null)
            break Fail4842;
          if(true)
            break Success2733;
        }
        term = term2754;
        IStrategoTerm u_11948 = null;
        IStrategoTerm v_11948 = null;
        IStrategoTerm g_11949 = null;
        u_11948 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail4841;
        v_11948 = term;
        g_11949 = u_11948;
        term = report_with_failure_0_2.instance.invoke(context, g_11949, trans.const918, v_11948);
        if(term == null)
          break Fail4841;
      }
      term = y_11948;
      IStrategoTerm term2755 = term;
      Success2734:
      { 
        Fail4843:
        { 
          IStrategoTerm i_11949 = null;
          IStrategoTerm k_11949 = null;
          term = analyze_get_compilediffs_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail4843;
          i_11949 = term;
          term = map_1_0.instance.invoke(context, i_11949, index_compilation_restore_read_file_0_0.instance);
          if(term == null)
            break Fail4843;
          term = remove_all_1_0.instance.invoke(context, term, index_compilation_filter_file_0_0.instance);
          if(term == null)
            break Fail4843;
          term = make_set_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail4843;
          term = index_split_partial_files_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail4843;
          if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
            break Fail4843;
          r_11948 = term.getSubterm(0);
          s_11948 = term.getSubterm(1);
          term = filter_1_0.instance.invoke(context, r_11948, index_compilation_clean_reads_0_0.instance);
          if(term == null)
            break Fail4843;
          term = filter_1_0.instance.invoke(context, s_11948, index_compilation_clean_reads_0_0.instance);
          if(term == null)
            break Fail4843;
          term = length_0_0.instance.invoke(context, r_11948);
          if(term == null)
            break Fail4843;
          k_11949 = term;
          term = length_0_0.instance.invoke(context, s_11948);
          if(term == null)
            break Fail4843;
          term = termFactory.makeTuple(k_11949, term);
          term = add_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail4843;
          term = set_total_work_units_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail4843;
          term = r_11948;
          lifted987 lifted9870 = new lifted987();
          lifted9870.t_11948 = t_11948;
          term = filter_1_0.instance.invoke(context, term, lifted9870);
          if(term == null)
            break Fail4843;
          term = s_11948;
          lifted988 lifted9880 = new lifted988();
          lifted9880.t_11948 = t_11948;
          term = filter_1_0.instance.invoke(context, term, lifted9880);
          if(term == null)
            break Fail4843;
          if(true)
            break Success2734;
        }
        term = term2755;
        IStrategoTerm w_11948 = null;
        IStrategoTerm x_11948 = null;
        IStrategoTerm p_11949 = null;
        w_11948 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail4841;
        x_11948 = term;
        p_11949 = w_11948;
        term = report_with_failure_0_2.instance.invoke(context, p_11949, trans.const918, x_11948);
        if(term == null)
          break Fail4841;
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