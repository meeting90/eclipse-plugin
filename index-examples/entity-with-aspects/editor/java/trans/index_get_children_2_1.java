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

@SuppressWarnings("all") public class index_get_children_2_1 extends Strategy 
{ 
  public static index_get_children_2_1 instance = new index_get_children_2_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy i_11991, Strategy j_11991, IStrategoTerm b_11991)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("index_get_children_2_1");
    Fail5083:
    { 
      TermReference c_11991 = new TermReference();
      IStrategoTerm d_11991 = null;
      IStrategoTerm e_11991 = null;
      TermReference f_11991 = new TermReference();
      IStrategoTerm l_11991 = null;
      IStrategoTerm m_11991 = null;
      IStrategoTerm p_11991 = null;
      m_11991 = term;
      l_11991 = trans.const972;
      term = m_11991;
      lifted1071 lifted10710 = new lifted1071();
      lifted10710.c_11991 = c_11991;
      lifted10710.f_11991 = f_11991;
      term = with_1_1.instance.invoke(context, term, lifted10710, l_11991);
      if(term == null)
        break Fail5083;
      p_11991 = term;
      IStrategoTerm term2902 = term;
      Success2870:
      { 
        Fail5084:
        { 
          IStrategoTerm q_11991 = null;
          IStrategoTerm t_11991 = null;
          if(f_11991.value == null)
            break Fail5084;
          IStrategoList list147;
          list147 = checkListTail(f_11991.value);
          if(list147 == null)
            break Fail5084;
          term = (IStrategoTerm)termFactory.makeListCons(b_11991, list147);
          term = i_11991.invoke(context, term);
          if(term == null)
            break Fail5084;
          d_11991 = term;
          term = context.invokePrimitive("LANG_index_get_children", term, NO_STRATEGIES, new IStrategoTerm[]{d_11991});
          if(term == null)
            break Fail5084;
          q_11991 = term;
          e_11991 = term;
          t_11991 = q_11991;
          term = store_wildcard_read_0_3.instance.invoke(context, t_11991, b_11991, f_11991.value, trans.const829);
          if(term == null)
            break Fail5084;
          if(true)
            break Success2870;
        }
        term = term2902;
        IStrategoTerm g_11991 = null;
        IStrategoTerm h_11991 = null;
        IStrategoTerm v_11991 = null;
        g_11991 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail5083;
        h_11991 = term;
        v_11991 = g_11991;
        term = report_with_failure_0_2.instance.invoke(context, v_11991, trans.const974, h_11991);
        if(term == null)
          break Fail5083;
      }
      term = p_11991;
      if(e_11991 == null)
        break Fail5083;
      term = e_11991;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}