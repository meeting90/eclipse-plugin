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

@SuppressWarnings("all") final class lifted394 extends Strategy 
{ 
  TermReference j_2088;

  TermReference k_2088;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail2827:
    { 
      term = index_compile_ast_0_2.instance.invoke(context, term, j_2088.value, k_2088.value);
      if(term == null)
        break Fail2827;
      if(true)
        return term;
    }
    return null;
  }
}