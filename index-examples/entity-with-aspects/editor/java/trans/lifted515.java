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

@SuppressWarnings("all") final class lifted515 extends Strategy 
{ 
  public static final lifted515 instance = new lifted515();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail2741:
    { 
      if(term.getTermType() != IStrategoTerm.APPL || Main._consAnon_1 != ((IStrategoAppl)term).getConstructor())
        break Fail2741;
      if(true)
        return term;
    }
    return null;
  }
}