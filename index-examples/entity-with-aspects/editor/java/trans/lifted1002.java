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

@SuppressWarnings("all") final class lifted1002 extends Strategy 
{ 
  TermReference o_11956;

  TermReference q_11956;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail5721:
    { 
      term = analyze_top_store_ast_0_2.instance.invoke(context, term, o_11956.value, q_11956.value);
      if(term == null)
        break Fail5721;
      if(true)
        return term;
    }
    return null;
  }
}