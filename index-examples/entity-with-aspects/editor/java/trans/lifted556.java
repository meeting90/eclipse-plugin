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

@SuppressWarnings("all") final class lifted556 extends Strategy 
{ 
  public static final lifted556 instance = new lifted556();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail2698:
    { 
      term = parallel_unordered_1_0.instance.invoke(context, term, lifted557.instance);
      if(term == null)
        break Fail2698;
      if(true)
        return term;
    }
    return null;
  }
}