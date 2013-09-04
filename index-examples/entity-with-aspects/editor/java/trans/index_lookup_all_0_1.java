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

@SuppressWarnings("all") public class index_lookup_all_0_1 extends Strategy 
{ 
  public static index_lookup_all_0_1 instance = new index_lookup_all_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_x_2130)
  { 
    TermReference x_2130 = new TermReference(ref_x_2130);
    context.push("index_lookup_all_0_1");
    Fail2190:
    { 
      IStrategoTerm y_2130 = null;
      IStrategoTerm z_2130 = null;
      IStrategoTerm a_2131 = null;
      IStrategoTerm b_2131 = null;
      IStrategoTerm j_2293 = null;
      IStrategoTerm k_2293 = null;
      IStrategoTerm l_2293 = null;
      IStrategoTerm o_2293 = null;
      IStrategoTerm p_2293 = null;
      IStrategoTerm q_2293 = null;
      z_2130 = term;
      IStrategoList annos82 = term.getAnnotations();
      if(annos82.getTermType() != IStrategoTerm.LIST || ((IStrategoList)annos82).isEmpty())
        break Fail2190;
      IStrategoTerm arg737 = ((IStrategoList)annos82).head();
      if(arg737.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg737).isEmpty())
        break Fail2190;
      a_2131 = ((IStrategoList)arg737).head();
      y_2130 = ((IStrategoList)arg737).tail();
      IStrategoTerm arg738 = ((IStrategoList)annos82).tail();
      if(arg738.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg738).isEmpty())
        break Fail2190;
      term = index_namespace_unwrap_0_0.instance.invoke(context, a_2131);
      if(term == null)
        break Fail2190;
      b_2131 = term;
      o_2293 = z_2130;
      j_2293 = b_2131;
      p_2293 = o_2293;
      k_2293 = y_2130;
      term = p_2293;
      q_2293 = p_2293;
      if(x_2130.value == null)
        break Fail2190;
      l_2293 = x_2130.value;
      term = q_2293;
      lifted489 lifted4890 = new lifted489();
      lifted4890.x_2130 = x_2130;
      term = index_lookup_all_internal_4_3.instance.invoke(context, term, _Id.instance, _Id.instance, index_get_defs_prefix_1_2.instance, lifted4890, j_2293, k_2293, l_2293);
      if(term == null)
        break Fail2190;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}