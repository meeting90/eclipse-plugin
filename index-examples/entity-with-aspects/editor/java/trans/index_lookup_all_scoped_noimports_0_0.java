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

@SuppressWarnings("all") public class index_lookup_all_scoped_noimports_0_0 extends Strategy 
{ 
  public static index_lookup_all_scoped_noimports_0_0 instance = new index_lookup_all_scoped_noimports_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("index_lookup_all_scoped_noimports_0_0");
    Fail5095:
    { 
      IStrategoTerm g_11994 = null;
      IStrategoTerm h_11994 = null;
      IStrategoTerm i_11994 = null;
      TermReference j_11994 = new TermReference();
      IStrategoTerm k_11994 = null;
      IStrategoTerm l_11994 = null;
      i_11994 = term;
      IStrategoList annos222 = term.getAnnotations();
      if(annos222.getTermType() != IStrategoTerm.LIST || ((IStrategoList)annos222).isEmpty())
        break Fail5095;
      IStrategoTerm arg1596 = ((IStrategoList)annos222).head();
      if(arg1596.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg1596).isEmpty())
        break Fail5095;
      g_11994 = ((IStrategoList)arg1596).head();
      k_11994 = ((IStrategoList)arg1596).tail();
      IStrategoTerm arg1597 = ((IStrategoList)annos222).tail();
      if(arg1597.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg1597).isEmpty())
        break Fail5095;
      term = index_namespace_unwrap_0_0.instance.invoke(context, g_11994);
      if(term == null)
        break Fail5095;
      h_11994 = term;
      term = strip_annos_0_0.instance.invoke(context, i_11994);
      if(term == null)
        break Fail5095;
      if(j_11994.value == null)
        j_11994.value = term;
      else
        if(j_11994.value != term && !j_11994.value.match(term))
          break Fail5095;
      Success2873:
      { 
        Fail5096:
        { 
          IStrategoTerm n_11994 = null;
          term = k_11994;
          if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
            break Fail5096;
          n_11994 = ((IStrategoList)term).tail();
          term = n_11994;
          if(true)
            break Success2873;
        }
        term = k_11994;
      }
      l_11994 = term;
      term = i_11994;
      lifted1097 lifted10970 = new lifted1097();
      lifted10970.j_11994 = j_11994;
      term = index_lookup_all_scoped_internal_4_3.instance.invoke(context, term, _Fail.instance, _Id.instance, index_get_defs_1_2.instance, lifted10970, h_11994, l_11994, j_11994.value);
      if(term == null)
        break Fail5095;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}