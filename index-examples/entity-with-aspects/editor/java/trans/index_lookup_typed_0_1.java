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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_v_2083)
  { 
    TermReference v_2083 = new TermReference(ref_v_2083);
    context.push("index_lookup_typed_0_1");
    Fail1928:
    { 
      IStrategoTerm w_2083 = null;
      IStrategoTerm x_2083 = null;
      IStrategoTerm y_2083 = null;
      IStrategoTerm z_2083 = null;
      TermReference a_2084 = new TermReference();
      z_2083 = term;
      IStrategoList annos73 = term.getAnnotations();
      if(annos73.getTermType() != IStrategoTerm.LIST || ((IStrategoList)annos73).isEmpty())
        break Fail1928;
      IStrategoTerm arg632 = ((IStrategoList)annos73).head();
      if(arg632.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg632).isEmpty())
        break Fail1928;
      x_2083 = ((IStrategoList)arg632).head();
      w_2083 = ((IStrategoList)arg632).tail();
      IStrategoTerm arg633 = ((IStrategoList)annos73).tail();
      if(arg633.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg633).isEmpty())
        break Fail1928;
      term = index_namespace_unwrap_0_0.instance.invoke(context, x_2083);
      if(term == null)
        break Fail1928;
      y_2083 = term;
      term = strip_annos_0_0.instance.invoke(context, z_2083);
      if(term == null)
        break Fail1928;
      if(a_2084.value == null)
        a_2084.value = term;
      else
        if(a_2084.value != term && !a_2084.value.match(term))
          break Fail1928;
      term = z_2083;
      lifted379 lifted3790 = new lifted379();
      lifted3790.a_2084 = a_2084;
      lifted3790.v_2083 = v_2083;
      term = index_lookup_internal_2_3.instance.invoke(context, term, index_get_defs_1_2.instance, lifted3790, y_2083, w_2083, a_2084.value);
      if(term == null)
        break Fail1928;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}