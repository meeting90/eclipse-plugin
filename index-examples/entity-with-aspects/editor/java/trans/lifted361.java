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

@SuppressWarnings("all") final class lifted361 extends Strategy 
{ 
  TermReference q_2056;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail2847:
    { 
      IStrategoTerm h_2058 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 3)
        break Fail2847;
      IStrategoTerm arg557 = term.getSubterm(0);
      if(arg557.getTermType() != IStrategoTerm.APPL || Main._consBefore_0 != ((IStrategoAppl)arg557).getConstructor())
        break Fail2847;
      IStrategoTerm arg558 = term.getSubterm(1);
      if(arg558.getTermType() != IStrategoTerm.APPL || Main._consAssigned_1 != ((IStrategoAppl)arg558).getConstructor())
        break Fail2847;
      if(q_2056.value == null)
        q_2056.value = arg558.getSubterm(0);
      else
        if(q_2056.value != arg558.getSubterm(0) && !q_2056.value.match(arg558.getSubterm(0)))
          break Fail2847;
      h_2058 = term.getSubterm(2);
      term = to_java_0_0.instance.invoke(context, h_2058);
      if(term == null)
        break Fail2847;
      if(true)
        return term;
    }
    return null;
  }
}