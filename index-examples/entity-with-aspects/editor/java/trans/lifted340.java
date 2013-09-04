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

@SuppressWarnings("all") final class lifted340 extends Strategy 
{ 
  public static final lifted340 instance = new lifted340();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail2872:
    { 
      IStrategoTerm x_2037 = null;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consDef_1 != ((IStrategoAppl)term).getConstructor())
        break Fail2872;
      IStrategoTerm arg523 = term.getSubterm(0);
      if(arg523.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg523).isEmpty())
        break Fail2872;
      IStrategoTerm arg525 = ((IStrategoList)arg523).tail();
      if(arg525.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg525).isEmpty())
        break Fail2872;
      x_2037 = ((IStrategoList)arg525).head();
      term = x_2037;
      if(true)
        return term;
    }
    return null;
  }
}