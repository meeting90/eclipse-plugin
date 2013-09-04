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

@SuppressWarnings("all") public class index_lookup_typed_0_1 extends Strategy 
{ 
  public static index_lookup_typed_0_1 instance = new index_lookup_typed_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_q_11946)
  { 
    TermReference q_11946 = new TermReference(ref_q_11946);
    context.push("index_lookup_typed_0_1");
    Fail4830:
    { 
      IStrategoTerm r_11946 = null;
      IStrategoTerm s_11946 = null;
      IStrategoTerm t_11946 = null;
      IStrategoTerm u_11946 = null;
      TermReference v_11946 = new TermReference();
      u_11946 = term;
      IStrategoList annos211 = term.getAnnotations();
      if(annos211.getTermType() != IStrategoTerm.LIST || ((IStrategoList)annos211).isEmpty())
        break Fail4830;
      IStrategoTerm arg1486 = ((IStrategoList)annos211).head();
      if(arg1486.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg1486).isEmpty())
        break Fail4830;
      s_11946 = ((IStrategoList)arg1486).head();
      r_11946 = ((IStrategoList)arg1486).tail();
      IStrategoTerm arg1487 = ((IStrategoList)annos211).tail();
      if(arg1487.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg1487).isEmpty())
        break Fail4830;
      term = index_namespace_unwrap_0_0.instance.invoke(context, s_11946);
      if(term == null)
        break Fail4830;
      t_11946 = term;
      term = strip_annos_0_0.instance.invoke(context, u_11946);
      if(term == null)
        break Fail4830;
      if(v_11946.value == null)
        v_11946.value = term;
      else
        if(v_11946.value != term && !v_11946.value.match(term))
          break Fail4830;
      term = u_11946;
      lifted979 lifted9790 = new lifted979();
      lifted9790.v_11946 = v_11946;
      lifted9790.q_11946 = q_11946;
      term = index_lookup_internal_2_3.instance.invoke(context, term, index_get_defs_1_2.instance, lifted9790, t_11946, r_11946, v_11946.value);
      if(term == null)
        break Fail4830;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}