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

@SuppressWarnings("all") public class $Advice_0_0 extends Strategy 
{ 
  public static $Advice_0_0 instance = new $Advice_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail2483:
    { 
      if(term.getTermType() != IStrategoTerm.APPL || Main._consAdvice_0 != ((IStrategoAppl)term).getConstructor())
        break Fail2483;
      if(true)
        return term;
    }
    context.push("Advice_0_0");
    context.popOnFailure();
    return null;
  }
}