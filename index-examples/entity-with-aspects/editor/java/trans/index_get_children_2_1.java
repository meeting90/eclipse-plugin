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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy n_2128, Strategy o_2128, IStrategoTerm g_2128)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("index_get_children_2_1");
    Fail2181:
    { 
      TermReference h_2128 = new TermReference();
      IStrategoTerm i_2128 = null;
      IStrategoTerm j_2128 = null;
      TermReference k_2128 = new TermReference();
      IStrategoTerm q_2128 = null;
      IStrategoTerm r_2128 = null;
      IStrategoTerm u_2128 = null;
      r_2128 = term;
      q_2128 = trans.const452;
      term = r_2128;
      lifted471 lifted4710 = new lifted471();
      lifted4710.h_2128 = h_2128;
      lifted4710.k_2128 = k_2128;
      term = with_1_1.instance.invoke(context, term, lifted4710, q_2128);
      if(term == null)
        break Fail2181;
      u_2128 = term;
      IStrategoTerm term1346 = term;
      Success1314:
      { 
        Fail2182:
        { 
          IStrategoTerm v_2128 = null;
          IStrategoTerm y_2128 = null;
          if(k_2128.value == null)
            break Fail2182;
          IStrategoList list71;
          list71 = checkListTail(k_2128.value);
          if(list71 == null)
            break Fail2182;
          term = (IStrategoTerm)termFactory.makeListCons(g_2128, list71);
          term = n_2128.invoke(context, term);
          if(term == null)
            break Fail2182;
          i_2128 = term;
          term = context.invokePrimitive("LANG_index_get_children", term, NO_STRATEGIES, new IStrategoTerm[]{i_2128});
          if(term == null)
            break Fail2182;
          v_2128 = term;
          j_2128 = term;
          y_2128 = v_2128;
          term = store_wildcard_read_0_3.instance.invoke(context, y_2128, g_2128, k_2128.value, trans.const309);
          if(term == null)
            break Fail2182;
          if(true)
            break Success1314;
        }
        term = term1346;
        IStrategoTerm l_2128 = null;
        IStrategoTerm m_2128 = null;
        IStrategoTerm a_2129 = null;
        l_2128 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail2181;
        m_2128 = term;
        a_2129 = l_2128;
        term = report_with_failure_0_2.instance.invoke(context, a_2129, trans.const454, m_2128);
        if(term == null)
          break Fail2181;
      }
      term = u_2128;
      if(j_2128 == null)
        break Fail2181;
      term = j_2128;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}