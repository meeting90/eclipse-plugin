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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_s_11993)
  { 
    TermReference s_11993 = new TermReference(ref_s_11993);
    context.push("index_lookup_all_0_1");
    Fail5092:
    { 
      IStrategoTerm t_11993 = null;
      IStrategoTerm u_11993 = null;
      IStrategoTerm v_11993 = null;
      IStrategoTerm w_11993 = null;
      IStrategoTerm e_12156 = null;
      IStrategoTerm f_12156 = null;
      IStrategoTerm g_12156 = null;
      IStrategoTerm j_12156 = null;
      IStrategoTerm k_12156 = null;
      IStrategoTerm l_12156 = null;
      u_11993 = term;
      IStrategoList annos220 = term.getAnnotations();
      if(annos220.getTermType() != IStrategoTerm.LIST || ((IStrategoList)annos220).isEmpty())
        break Fail5092;
      IStrategoTerm arg1591 = ((IStrategoList)annos220).head();
      if(arg1591.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg1591).isEmpty())
        break Fail5092;
      v_11993 = ((IStrategoList)arg1591).head();
      t_11993 = ((IStrategoList)arg1591).tail();
      IStrategoTerm arg1592 = ((IStrategoList)annos220).tail();
      if(arg1592.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg1592).isEmpty())
        break Fail5092;
      term = index_namespace_unwrap_0_0.instance.invoke(context, v_11993);
      if(term == null)
        break Fail5092;
      w_11993 = term;
      j_12156 = u_11993;
      e_12156 = w_11993;
      k_12156 = j_12156;
      f_12156 = t_11993;
      term = k_12156;
      l_12156 = k_12156;
      if(s_11993.value == null)
        break Fail5092;
      g_12156 = s_11993.value;
      term = l_12156;
      lifted1089 lifted10890 = new lifted1089();
      lifted10890.s_11993 = s_11993;
      term = index_lookup_all_internal_4_3.instance.invoke(context, term, _Id.instance, _Id.instance, index_get_defs_prefix_1_2.instance, lifted10890, e_12156, f_12156, g_12156);
      if(term == null)
        break Fail5092;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}