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

@SuppressWarnings("all") final class lifted908 extends Strategy 
{ 
  TermReference l_12058;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail5798:
    { 
      term = nam_annotate_def_0_1.instance.invoke(context, term, l_12058.value);
      if(term == null)
        break Fail5798;
      if(true)
        return term;
    }
    return null;
  }
}