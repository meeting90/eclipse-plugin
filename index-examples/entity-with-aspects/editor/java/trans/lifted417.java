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

@SuppressWarnings("all") final class lifted417 extends Strategy 
{ 
  Strategy x_2105;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail2801:
    { 
      lifted418 lifted4180 = new lifted418();
      lifted4180.x_2105 = x_2105;
      term = parallel_unordered_1_0.instance.invoke(context, term, lifted4180);
      if(term == null)
        break Fail2801;
      if(true)
        return term;
    }
    return null;
  }
}