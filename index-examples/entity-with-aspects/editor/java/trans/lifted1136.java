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

@SuppressWarnings("all") final class lifted1136 extends Strategy 
{ 
  public static final lifted1136 instance = new lifted1136();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail5616:
    { 
      if(term.getTermType() != IStrategoTerm.APPL || Main._consMARKER_0 != ((IStrategoAppl)term).getConstructor())
        break Fail5616;
      if(true)
        return term;
    }
    return null;
  }
}