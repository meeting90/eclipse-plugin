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

@SuppressWarnings("all") final class lifted424 extends Strategy 
{ 
  public static final lifted424 instance = new lifted424();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail2797:
    { 
      IStrategoTerm q_2106 = null;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consParallelResults_6 != ((IStrategoAppl)term).getConstructor())
        break Fail2797;
      q_2106 = term.getSubterm(5);
      term = q_2106;
      if(true)
        return term;
    }
    return null;
  }
}