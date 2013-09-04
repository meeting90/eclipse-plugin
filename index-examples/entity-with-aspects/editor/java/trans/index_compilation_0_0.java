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
    Fail1939:
    { 
      IStrategoTerm s_2085 = null;
      IStrategoTerm w_2085 = null;
      IStrategoTerm x_2085 = null;
      TermReference y_2085 = new TermReference();
      IStrategoTerm d_2086 = null;
      if(y_2085.value == null)
        y_2085.value = term;
      else
        if(y_2085.value != term && !y_2085.value.match(term))
          break Fail1939;
      d_2086 = term;
      IStrategoTerm term1198 = term;
      Success1177:
      { 
        Fail1940:
        { 
          IStrategoTerm g_2086 = null;
          IStrategoTerm i_2086 = null;
          IStrategoTerm j_2086 = null;
          term = project_path_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1940;
          s_2085 = term;
          i_2086 = term;
          term = (IStrategoTerm)termFactory.makeListCons(s_2085, (IStrategoList)trans.constNil1);
          g_2086 = term;
          j_2086 = i_2086;
          term = index_setup_0_3.instance.invoke(context, j_2086, y_2085.value, g_2086, trans.const369);
          if(term == null)
            break Fail1940;
          if(true)
            break Success1177;
        }
        term = term1198;
        IStrategoTerm z_2085 = null;
        IStrategoTerm a_2086 = null;
        IStrategoTerm l_2086 = null;
        z_2085 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail1939;
        a_2086 = term;
        l_2086 = z_2085;
        term = report_with_failure_0_2.instance.invoke(context, l_2086, trans.const398, a_2086);
        if(term == null)
          break Fail1939;
      }
      term = d_2086;
      IStrategoTerm term1199 = term;
      Success1178:
      { 
        Fail1941:
        { 
          IStrategoTerm n_2086 = null;
          IStrategoTerm p_2086 = null;
          term = analyze_get_compilediffs_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1941;
          n_2086 = term;
          term = map_1_0.instance.invoke(context, n_2086, index_compilation_restore_read_file_0_0.instance);
          if(term == null)
            break Fail1941;
          term = remove_all_1_0.instance.invoke(context, term, index_compilation_filter_file_0_0.instance);
          if(term == null)
            break Fail1941;
          term = make_set_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1941;
          term = index_split_partial_files_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1941;
          if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
            break Fail1941;
          w_2085 = term.getSubterm(0);
          x_2085 = term.getSubterm(1);
          term = filter_1_0.instance.invoke(context, w_2085, index_compilation_clean_reads_0_0.instance);
          if(term == null)
            break Fail1941;
          term = filter_1_0.instance.invoke(context, x_2085, index_compilation_clean_reads_0_0.instance);
          if(term == null)
            break Fail1941;
          term = length_0_0.instance.invoke(context, w_2085);
          if(term == null)
            break Fail1941;
          p_2086 = term;
          term = length_0_0.instance.invoke(context, x_2085);
          if(term == null)
            break Fail1941;
          term = termFactory.makeTuple(p_2086, term);
          term = add_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1941;
          term = set_total_work_units_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1941;
          term = w_2085;
          lifted387 lifted3870 = new lifted387();
          lifted3870.y_2085 = y_2085;
          term = filter_1_0.instance.invoke(context, term, lifted3870);
          if(term == null)
            break Fail1941;
          term = x_2085;
          lifted388 lifted3880 = new lifted388();
          lifted3880.y_2085 = y_2085;
          term = filter_1_0.instance.invoke(context, term, lifted3880);
          if(term == null)
            break Fail1941;
          if(true)
            break Success1178;
        }
        term = term1199;
        IStrategoTerm b_2086 = null;
        IStrategoTerm c_2086 = null;
        IStrategoTerm u_2086 = null;
        b_2086 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail1939;
        c_2086 = term;
        u_2086 = b_2086;
        term = report_with_failure_0_2.instance.invoke(context, u_2086, trans.const398, c_2086);
        if(term == null)
          break Fail1939;
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