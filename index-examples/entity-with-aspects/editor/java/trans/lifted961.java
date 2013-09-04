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

@SuppressWarnings("all") final class lifted961 extends Strategy 
{ 
  TermReference l_11919;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail5749:
    { 
      IStrategoTerm c_11921 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 3)
        break Fail5749;
      IStrategoTerm arg1411 = term.getSubterm(0);
      if(arg1411.getTermType() != IStrategoTerm.APPL || Main._consBefore_0 != ((IStrategoAppl)arg1411).getConstructor())
        break Fail5749;
      IStrategoTerm arg1412 = term.getSubterm(1);
      if(arg1412.getTermType() != IStrategoTerm.APPL || Main._consAssigned_1 != ((IStrategoAppl)arg1412).getConstructor())
        break Fail5749;
      if(l_11919.value == null)
        l_11919.value = arg1412.getSubterm(0);
      else
        if(l_11919.value != arg1412.getSubterm(0) && !l_11919.value.match(arg1412.getSubterm(0)))
          break Fail5749;
      c_11921 = term.getSubterm(2);
      term = to_java_0_0.instance.invoke(context, c_11921);
      if(term == null)
        break Fail5749;
      if(true)
        return term;
    }
    return null;
  }
}