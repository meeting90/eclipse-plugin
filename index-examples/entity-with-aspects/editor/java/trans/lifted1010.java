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

@SuppressWarnings("all") final class lifted1010 extends Strategy 
{ 
  TermReference u_11963;

  TermReference v_11963;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail5711:
    { 
      term = nam_annotate_names_0_2.instance.invoke(context, term, u_11963.value, v_11963.value);
      if(term == null)
        break Fail5711;
      if(true)
        return term;
    }
    return null;
  }
}