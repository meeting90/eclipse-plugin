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

@SuppressWarnings("all") final class lifted958 extends Strategy 
{ 
  public static final lifted958 instance = new lifted958();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail5752:
    { 
      IStrategoTerm b_11921 = null;
      b_11921 = term;
      term = index_get_children_0_1.instance.invoke(context, b_11921, trans.constAdvice0);
      if(term == null)
        break Fail5752;
      if(true)
        return term;
    }
    return null;
  }
}