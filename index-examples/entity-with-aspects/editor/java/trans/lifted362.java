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

@SuppressWarnings("all") final class lifted362 extends Strategy 
{ 
  TermReference q_2056;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail2846:
    { 
      IStrategoTerm i_2058 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 3)
        break Fail2846;
      IStrategoTerm arg559 = term.getSubterm(0);
      if(arg559.getTermType() != IStrategoTerm.APPL || Main._consAfter_0 != ((IStrategoAppl)arg559).getConstructor())
        break Fail2846;
      IStrategoTerm arg560 = term.getSubterm(1);
      if(arg560.getTermType() != IStrategoTerm.APPL || Main._consAssigned_1 != ((IStrategoAppl)arg560).getConstructor())
        break Fail2846;
      if(q_2056.value == null)
        q_2056.value = arg560.getSubterm(0);
      else
        if(q_2056.value != arg560.getSubterm(0) && !q_2056.value.match(arg560.getSubterm(0)))
          break Fail2846;
      i_2058 = term.getSubterm(2);
      term = to_java_0_0.instance.invoke(context, i_2058);
      if(term == null)
        break Fail2846;
      if(true)
        return term;
    }
    return null;
  }
}