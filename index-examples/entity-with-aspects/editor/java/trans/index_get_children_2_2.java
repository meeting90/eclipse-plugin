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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy p_2129, Strategy q_2129, IStrategoTerm g_2129, IStrategoTerm h_2129)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("index_get_children_2_2");
    Fail2184:
    { 
      TermReference i_2129 = new TermReference();
      IStrategoTerm j_2129 = null;
      IStrategoTerm l_2129 = null;
      TermReference m_2129 = new TermReference();
      IStrategoTerm s_2129 = null;
      IStrategoTerm t_2129 = null;
      IStrategoTerm w_2129 = null;
      t_2129 = term;
      s_2129 = trans.const452;
      term = t_2129;
      lifted474 lifted4740 = new lifted474();
      lifted4740.i_2129 = i_2129;
      lifted4740.m_2129 = m_2129;
      term = with_1_1.instance.invoke(context, term, lifted4740, s_2129);
      if(term == null)
        break Fail2184;
      w_2129 = term;
      IStrategoTerm term1347 = term;
      Success1315:
      { 
        Fail2185:
        { 
          IStrategoTerm x_2129 = null;
          if(m_2129.value == null)
            break Fail2185;
          IStrategoList list72;
          list72 = checkListTail(m_2129.value);
          if(list72 == null)
            break Fail2185;
          term = (IStrategoTerm)termFactory.makeListCons(g_2129, list72);
          term = p_2129.invoke(context, term);
          if(term == null)
            break Fail2185;
          j_2129 = term;
          term = context.invokePrimitive("LANG_index_get_children", term, NO_STRATEGIES, new IStrategoTerm[]{j_2129});
          if(term == null)
            break Fail2185;
          x_2129 = term;
          term = filter_1_0.instance.invoke(context, x_2129, q_2129);
          if(term == null)
            break Fail2185;
          l_2129 = term;
          term = store_wildcard_read_0_3.instance.invoke(context, term, g_2129, m_2129.value, h_2129);
          if(term == null)
            break Fail2185;
          if(true)
            break Success1315;
        }
        term = term1347;
        IStrategoTerm n_2129 = null;
        IStrategoTerm o_2129 = null;
        IStrategoTerm a_2130 = null;
        n_2129 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail2184;
        o_2129 = term;
        a_2130 = n_2129;
        term = report_with_failure_0_2.instance.invoke(context, a_2130, trans.const454, o_2129);
        if(term == null)
          break Fail2184;
      }
      term = w_2129;
      if(l_2129 == null)
        break Fail2184;
      term = l_2129;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}