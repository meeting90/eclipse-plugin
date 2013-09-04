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

@SuppressWarnings("all") public class index_lookup_0_0 extends Strategy 
{ 
  public static index_lookup_0_0 instance = new index_lookup_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("index_lookup_0_0");
    Fail5090:
    { 
      IStrategoTerm g_11993 = null;
      IStrategoTerm h_11993 = null;
      IStrategoTerm i_11993 = null;
      IStrategoTerm j_11993 = null;
      TermReference k_11993 = new TermReference();
      IStrategoTerm e_12155 = null;
      IStrategoTerm f_12155 = null;
      IStrategoTerm g_12155 = null;
      IStrategoTerm j_12155 = null;
      IStrategoTerm k_12155 = null;
      IStrategoTerm l_12155 = null;
      j_11993 = term;
      IStrategoList annos218 = term.getAnnotations();
      if(annos218.getTermType() != IStrategoTerm.LIST || ((IStrategoList)annos218).isEmpty())
        break Fail5090;
      IStrategoTerm arg1587 = ((IStrategoList)annos218).head();
      if(arg1587.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg1587).isEmpty())
        break Fail5090;
      h_11993 = ((IStrategoList)arg1587).head();
      g_11993 = ((IStrategoList)arg1587).tail();
      IStrategoTerm arg1588 = ((IStrategoList)annos218).tail();
      if(arg1588.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg1588).isEmpty())
        break Fail5090;
      term = index_namespace_unwrap_0_0.instance.invoke(context, h_11993);
      if(term == null)
        break Fail5090;
      i_11993 = term;
      term = strip_annos_0_0.instance.invoke(context, j_11993);
      if(term == null)
        break Fail5090;
      if(k_11993.value == null)
        k_11993.value = term;
      else
        if(k_11993.value != term && !k_11993.value.match(term))
          break Fail5090;
      j_12155 = j_11993;
      e_12155 = i_11993;
      k_12155 = j_12155;
      f_12155 = g_11993;
      term = k_12155;
      l_12155 = k_12155;
      if(k_11993.value == null)
        break Fail5090;
      g_12155 = k_11993.value;
      term = l_12155;
      lifted1081 lifted10810 = new lifted1081();
      lifted10810.k_11993 = k_11993;
      term = index_lookup_internal_4_3.instance.invoke(context, term, _Id.instance, _Id.instance, index_get_defs_1_2.instance, lifted10810, e_12155, f_12155, g_12155);
      if(term == null)
        break Fail5090;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}