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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_c_2084, IStrategoTerm ref_d_2084)
  { 
    TermReference c_2084 = new TermReference(ref_c_2084);
    TermReference d_2084 = new TermReference(ref_d_2084);
    context.push("index_lookup_all_typed_0_2");
    Fail1929:
    { 
      IStrategoTerm e_2084 = null;
      IStrategoTerm f_2084 = null;
      IStrategoTerm g_2084 = null;
      IStrategoTerm h_2084 = null;
      f_2084 = term;
      IStrategoList annos74 = term.getAnnotations();
      if(annos74.getTermType() != IStrategoTerm.LIST || ((IStrategoList)annos74).isEmpty())
        break Fail1929;
      IStrategoTerm arg634 = ((IStrategoList)annos74).head();
      if(arg634.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg634).isEmpty())
        break Fail1929;
      g_2084 = ((IStrategoList)arg634).head();
      e_2084 = ((IStrategoList)arg634).tail();
      IStrategoTerm arg635 = ((IStrategoList)annos74).tail();
      if(arg635.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg635).isEmpty())
        break Fail1929;
      term = index_namespace_unwrap_0_0.instance.invoke(context, g_2084);
      if(term == null)
        break Fail1929;
      h_2084 = term;
      term = f_2084;
      lifted381 lifted3810 = new lifted381();
      lifted3810.c_2084 = c_2084;
      lifted3810.d_2084 = d_2084;
      term = index_lookup_all_internal_2_3.instance.invoke(context, term, index_get_defs_prefix_1_2.instance, lifted3810, h_2084, e_2084, c_2084.value);
      if(term == null)
        break Fail1929;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}