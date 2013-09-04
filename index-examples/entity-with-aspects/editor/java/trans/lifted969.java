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

@SuppressWarnings("all") final class lifted969 extends Strategy 
{ 
  TermReference v_11937;

  TermReference o_11937;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail5747:
    { 
      term = to_java_aspect_replace_var_0_2.instance.invoke(context, term, v_11937.value, o_11937.value);
      if(term == null)
        break Fail5747;
      if(true)
        return term;
    }
    return null;
  }
}