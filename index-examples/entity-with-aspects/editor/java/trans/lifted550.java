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

@SuppressWarnings("all") final class lifted550 extends Strategy 
{ 
  public static final lifted550 instance = new lifted550();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail2707:
    { 
      IStrategoList annos92 = term.getAnnotations();
      if(annos92.getTermType() != IStrategoTerm.LIST || ((IStrategoList)annos92).isEmpty())
        break Fail2707;
      IStrategoTerm arg812 = ((IStrategoList)annos92).tail();
      if(arg812.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg812).isEmpty())
        break Fail2707;
      if(true)
        return term;
    }
    return null;
  }
}