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

@SuppressWarnings("all") final class lifted994 extends Strategy 
{ 
  TermReference e_11951;

  TermReference f_11951;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail5729:
    { 
      term = index_compile_ast_0_2.instance.invoke(context, term, e_11951.value, f_11951.value);
      if(term == null)
        break Fail5729;
      if(true)
        return term;
    }
    return null;
  }
}