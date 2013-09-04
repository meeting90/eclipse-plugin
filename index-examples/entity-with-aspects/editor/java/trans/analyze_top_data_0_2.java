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

@SuppressWarnings("all") public class analyze_top_data_0_2 extends Strategy 
{ 
  public static analyze_top_data_0_2 instance = new analyze_top_data_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_v_11959, IStrategoTerm ref_w_11959)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference v_11959 = new TermReference(ref_v_11959);
    TermReference w_11959 = new TermReference(ref_w_11959);
    context.push("analyze_top_data_0_2");
    Fail4896:
    { 
      TermReference x_11959 = new TermReference();
      TermReference y_11959 = new TermReference();
      TermReference z_11959 = new TermReference();
      TermReference a_11960 = new TermReference();
      TermReference b_11960 = new TermReference();
      TermReference c_11960 = new TermReference();
      IStrategoTerm h_11960 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail4896;
      if(x_11959.value == null)
        x_11959.value = term.getSubterm(0);
      else
        if(x_11959.value != term.getSubterm(0) && !x_11959.value.match(term.getSubterm(0)))
          break Fail4896;
      if(c_11960.value == null)
        c_11960.value = term.getSubterm(1);
      else
        if(c_11960.value != term.getSubterm(1) && !c_11960.value.match(term.getSubterm(1)))
          break Fail4896;
      h_11960 = term;
      IStrategoTerm term2794 = term;
      Success2771:
      { 
        Fail4897:
        { 
          IStrategoTerm i_11960 = null;
          IStrategoTerm j_11960 = null;
          if(c_11960.value == null)
            break Fail4897;
          term = index_set_current_file_0_0.instance.invoke(context, c_11960.value);
          if(term == null)
            break Fail4897;
          j_11960 = term;
          i_11960 = trans.const922;
          term = j_11960;
          lifted1004 lifted10040 = new lifted1004();
          lifted10040.x_11959 = x_11959;
          lifted10040.y_11959 = y_11959;
          lifted10040.z_11959 = z_11959;
          lifted10040.a_11960 = a_11960;
          lifted10040.v_11959 = v_11959;
          lifted10040.w_11959 = w_11959;
          lifted10040.b_11960 = b_11960;
          lifted10040.c_11960 = c_11960;
          term = dr_scope_1_1.instance.invoke(context, term, lifted10040, i_11960);
          if(term == null)
            break Fail4897;
          if(true)
            break Success2771;
        }
        term = term2794;
        IStrategoTerm f_11960 = null;
        IStrategoTerm g_11960 = null;
        IStrategoTerm x_11960 = null;
        f_11960 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail4896;
        g_11960 = term;
        x_11960 = f_11960;
        term = report_with_failure_0_2.instance.invoke(context, x_11960, trans.const939, g_11960);
        if(term == null)
          break Fail4896;
      }
      term = h_11960;
      if(y_11959.value == null || (c_11960.value == null || a_11960.value == null))
        break Fail4896;
      term = termFactory.makeTuple(termFactory.makeTuple(y_11959.value, c_11960.value), a_11960.value);
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}