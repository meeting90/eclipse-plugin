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

@SuppressWarnings("all") final class lifted1024 extends Strategy 
{ 
  public static final lifted1024 instance = new lifted1024();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail5699:
    { 
      IStrategoTerm l_11969 = null;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consParallelResults_6 != ((IStrategoAppl)term).getConstructor())
        break Fail5699;
      l_11969 = term.getSubterm(5);
      term = l_11969;
      if(true)
        return term;
    }
    return null;
  }
}