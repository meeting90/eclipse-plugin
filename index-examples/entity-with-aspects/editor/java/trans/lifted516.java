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

@SuppressWarnings("all") final class lifted516 extends Strategy 
{ 
  public static final lifted516 instance = new lifted516();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail2740:
    { 
      IStrategoList annos90 = term.getAnnotations();
      if(annos90.getTermType() != IStrategoTerm.LIST || ((IStrategoList)annos90).isEmpty())
        break Fail2740;
      IStrategoTerm arg773 = ((IStrategoList)annos90).tail();
      if(arg773.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg773).isEmpty())
        break Fail2740;
      if(true)
        return term;
    }
    return null;
  }
}