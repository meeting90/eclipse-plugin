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

@SuppressWarnings("all") public class index_lookup_all_typed_0_2 extends Strategy 
{ 
  public static index_lookup_all_typed_0_2 instance = new index_lookup_all_typed_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_x_11946, IStrategoTerm ref_y_11946)
  { 
    TermReference x_11946 = new TermReference(ref_x_11946);
    TermReference y_11946 = new TermReference(ref_y_11946);
    context.push("index_lookup_all_typed_0_2");
    Fail4831:
    { 
      IStrategoTerm z_11946 = null;
      IStrategoTerm a_11947 = null;
      IStrategoTerm b_11947 = null;
      IStrategoTerm c_11947 = null;
      a_11947 = term;
      IStrategoList annos212 = term.getAnnotations();
      if(annos212.getTermType() != IStrategoTerm.LIST || ((IStrategoList)annos212).isEmpty())
        break Fail4831;
      IStrategoTerm arg1488 = ((IStrategoList)annos212).head();
      if(arg1488.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg1488).isEmpty())
        break Fail4831;
      b_11947 = ((IStrategoList)arg1488).head();
      z_11946 = ((IStrategoList)arg1488).tail();
      IStrategoTerm arg1489 = ((IStrategoList)annos212).tail();
      if(arg1489.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg1489).isEmpty())
        break Fail4831;
      term = index_namespace_unwrap_0_0.instance.invoke(context, b_11947);
      if(term == null)
        break Fail4831;
      c_11947 = term;
      term = a_11947;
      lifted981 lifted9810 = new lifted981();
      lifted9810.x_11946 = x_11946;
      lifted9810.y_11946 = y_11946;
      term = index_lookup_all_internal_2_3.instance.invoke(context, term, index_get_defs_prefix_1_2.instance, lifted9810, c_11947, z_11946, x_11946.value);
      if(term == null)
        break Fail4831;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}