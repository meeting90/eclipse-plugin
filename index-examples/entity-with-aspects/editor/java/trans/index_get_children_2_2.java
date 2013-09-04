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

@SuppressWarnings("all") public class index_get_children_2_2 extends Strategy 
{ 
  public static index_get_children_2_2 instance = new index_get_children_2_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy k_11992, Strategy l_11992, IStrategoTerm b_11992, IStrategoTerm c_11992)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("index_get_children_2_2");
    Fail5086:
    { 
      TermReference d_11992 = new TermReference();
      IStrategoTerm e_11992 = null;
      IStrategoTerm g_11992 = null;
      TermReference h_11992 = new TermReference();
      IStrategoTerm n_11992 = null;
      IStrategoTerm o_11992 = null;
      IStrategoTerm r_11992 = null;
      o_11992 = term;
      n_11992 = trans.const972;
      term = o_11992;
      lifted1074 lifted10740 = new lifted1074();
      lifted10740.d_11992 = d_11992;
      lifted10740.h_11992 = h_11992;
      term = with_1_1.instance.invoke(context, term, lifted10740, n_11992);
      if(term == null)
        break Fail5086;
      r_11992 = term;
      IStrategoTerm term2903 = term;
      Success2871:
      { 
        Fail5087:
        { 
          IStrategoTerm s_11992 = null;
          if(h_11992.value == null)
            break Fail5087;
          IStrategoList list148;
          list148 = checkListTail(h_11992.value);
          if(list148 == null)
            break Fail5087;
          term = (IStrategoTerm)termFactory.makeListCons(b_11992, list148);
          term = k_11992.invoke(context, term);
          if(term == null)
            break Fail5087;
          e_11992 = term;
          term = context.invokePrimitive("LANG_index_get_children", term, NO_STRATEGIES, new IStrategoTerm[]{e_11992});
          if(term == null)
            break Fail5087;
          s_11992 = term;
          term = filter_1_0.instance.invoke(context, s_11992, l_11992);
          if(term == null)
            break Fail5087;
          g_11992 = term;
          term = store_wildcard_read_0_3.instance.invoke(context, term, b_11992, h_11992.value, c_11992);
          if(term == null)
            break Fail5087;
          if(true)
            break Success2871;
        }
        term = term2903;
        IStrategoTerm i_11992 = null;
        IStrategoTerm j_11992 = null;
        IStrategoTerm v_11992 = null;
        i_11992 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail5086;
        j_11992 = term;
        v_11992 = i_11992;
        term = report_with_failure_0_2.instance.invoke(context, v_11992, trans.const974, j_11992);
        if(term == null)
          break Fail5086;
      }
      term = r_11992;
      if(g_11992 == null)
        break Fail5086;
      term = g_11992;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}