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

@SuppressWarnings("all") final class lifted1196 extends Strategy 
{ 
  TermReference e_12057;

  TermReference f_12057;

  TermReference g_12057;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail5563:
    { 
      term = aux_$Is$Imported_0_2.instance.invoke(context, term, e_12057.value, f_12057.value);
      if(term == null)
        break Fail5563;
      if(g_12057.value == null)
        g_12057.value = term;
      else
        if(g_12057.value != term && !g_12057.value.match(term))
          break Fail5563;
      if(true)
        return term;
    }
    return null;
  }
}