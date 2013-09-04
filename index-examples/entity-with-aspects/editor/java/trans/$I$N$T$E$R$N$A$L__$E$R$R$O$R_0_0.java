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

@SuppressWarnings("all") public class $I$N$T$E$R$N$A$L__$E$R$R$O$R_0_0 extends Strategy 
{ 
  public static $I$N$T$E$R$N$A$L__$E$R$R$O$R_0_0 instance = new $I$N$T$E$R$N$A$L__$E$R$R$O$R_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail5413:
    { 
      if(term.getTermType() != IStrategoTerm.APPL || Main._consINTERNAL_ERROR_0 != ((IStrategoAppl)term).getConstructor())
        break Fail5413;
      if(true)
        return term;
    }
    context.push("INTERNAL__ERROR_0_0");
    context.popOnFailure();
    return null;
  }
}