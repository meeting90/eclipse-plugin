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

@SuppressWarnings("all") public class index_lookup_all_0_0 extends Strategy 
{ 
  public static index_lookup_all_0_0 instance = new index_lookup_all_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("index_lookup_all_0_0");
    Fail2189:
    { 
      IStrategoTerm r_2130 = null;
      IStrategoTerm s_2130 = null;
      IStrategoTerm t_2130 = null;
      IStrategoTerm u_2130 = null;
      TermReference v_2130 = new TermReference();
      IStrategoTerm w_2292 = null;
      IStrategoTerm x_2292 = null;
      IStrategoTerm y_2292 = null;
      IStrategoTerm b_2293 = null;
      IStrategoTerm c_2293 = null;
      IStrategoTerm d_2293 = null;
      u_2130 = term;
      IStrategoList annos81 = term.getAnnotations();
      if(annos81.getTermType() != IStrategoTerm.LIST || ((IStrategoList)annos81).isEmpty())
        break Fail2189;
      IStrategoTerm arg735 = ((IStrategoList)annos81).head();
      if(arg735.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg735).isEmpty())
        break Fail2189;
      s_2130 = ((IStrategoList)arg735).head();
      r_2130 = ((IStrategoList)arg735).tail();
      IStrategoTerm arg736 = ((IStrategoList)annos81).tail();
      if(arg736.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg736).isEmpty())
        break Fail2189;
      term = index_namespace_unwrap_0_0.instance.invoke(context, s_2130);
      if(term == null)
        break Fail2189;
      t_2130 = term;
      term = strip_annos_0_0.instance.invoke(context, u_2130);
      if(term == null)
        break Fail2189;
      if(v_2130.value == null)
        v_2130.value = term;
      else
        if(v_2130.value != term && !v_2130.value.match(term))
          break Fail2189;
      b_2293 = u_2130;
      w_2292 = t_2130;
      c_2293 = b_2293;
      x_2292 = r_2130;
      term = c_2293;
      d_2293 = c_2293;
      if(v_2130.value == null)
        break Fail2189;
      y_2292 = v_2130.value;
      term = d_2293;
      lifted485 lifted4850 = new lifted485();
      lifted4850.v_2130 = v_2130;
      term = index_lookup_all_internal_4_3.instance.invoke(context, term, _Id.instance, _Id.instance, index_get_defs_1_2.instance, lifted4850, w_2292, x_2292, y_2292);
      if(term == null)
        break Fail2189;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}