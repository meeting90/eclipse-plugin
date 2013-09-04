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

@SuppressWarnings("all") final class lifted991 extends Strategy 
{ 
  TermReference g_11950;

  TermReference h_11950;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail5730:
    { 
      term = index_compilation_ast_0_2.instance.invoke(context, term, g_11950.value, h_11950.value);
      if(term == null)
        break Fail5730;
      if(true)
        return term;
    }
    return null;
  }
}