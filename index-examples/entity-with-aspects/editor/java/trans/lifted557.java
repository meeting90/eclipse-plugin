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

@SuppressWarnings("all") final class lifted557 extends Strategy 
{ 
  public static final lifted557 instance = new lifted557();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail2699:
    { 
      term = SRTS_all.instance.invoke(context, term, lifted558.instance);
      if(term == null)
        break Fail2699;
      if(true)
        return term;
    }
    return null;
  }
}