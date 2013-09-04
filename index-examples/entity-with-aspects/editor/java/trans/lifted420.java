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

@SuppressWarnings("all") final class lifted420 extends Strategy 
{ 
  Strategy y_2105;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail2799:
    { 
      lifted421 lifted4210 = new lifted421();
      lifted4210.y_2105 = y_2105;
      term = SRTS_all.instance.invoke(context, term, lifted4210);
      if(term == null)
        break Fail2799;
      if(true)
        return term;
    }
    return null;
  }
}