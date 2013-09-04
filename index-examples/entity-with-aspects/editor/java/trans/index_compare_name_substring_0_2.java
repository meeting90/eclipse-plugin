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

@SuppressWarnings("all") public class index_compare_name_substring_0_2 extends Strategy 
{ 
  public static index_compare_name_substring_0_2 instance = new index_compare_name_substring_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_m_2117, IStrategoTerm n_2117)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference m_2117 = new TermReference(ref_m_2117);
    context.push("index_compare_name_substring_0_2");
    Fail2091:
    { 
      IStrategoTerm o_2117 = null;
      IStrategoTerm p_2117 = null;
      IStrategoTerm q_2117 = null;
      o_2117 = term;
      q_2117 = term;
      term = index_uri_0_0.instance.invoke(context, o_2117);
      if(term == null)
        break Fail2091;
      p_2117 = term;
      term = index_uri_namespace_0_0.instance.invoke(context, p_2117);
      if(term == null)
        break Fail2091;
      term = termFactory.makeTuple(n_2117, term);
      term = eq_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail2091;
      term = index_uri_name_0_0.instance.invoke(context, p_2117);
      if(term == null)
        break Fail2091;
      lifted448 lifted4480 = new lifted448();
      lifted4480.m_2117 = m_2117;
      term = is_substring_1_0.instance.invoke(context, term, lifted4480);
      if(term == null)
        break Fail2091;
      term = q_2117;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}