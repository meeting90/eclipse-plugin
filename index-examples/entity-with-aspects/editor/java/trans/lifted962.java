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

@SuppressWarnings("all") final class lifted962 extends Strategy 
{ 
  TermReference l_11919;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail5748:
    { 
      IStrategoTerm d_11921 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 3)
        break Fail5748;
      IStrategoTerm arg1413 = term.getSubterm(0);
      if(arg1413.getTermType() != IStrategoTerm.APPL || Main._consAfter_0 != ((IStrategoAppl)arg1413).getConstructor())
        break Fail5748;
      IStrategoTerm arg1414 = term.getSubterm(1);
      if(arg1414.getTermType() != IStrategoTerm.APPL || Main._consAssigned_1 != ((IStrategoAppl)arg1414).getConstructor())
        break Fail5748;
      if(l_11919.value == null)
        l_11919.value = arg1414.getSubterm(0);
      else
        if(l_11919.value != arg1414.getSubterm(0) && !l_11919.value.match(arg1414.getSubterm(0)))
          break Fail5748;
      d_11921 = term.getSubterm(2);
      term = to_java_0_0.instance.invoke(context, d_11921);
      if(term == null)
        break Fail5748;
      if(true)
        return term;
    }
    return null;
  }
}