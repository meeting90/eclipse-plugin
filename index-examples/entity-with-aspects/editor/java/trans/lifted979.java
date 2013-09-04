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

@SuppressWarnings("all") final class lifted979 extends Strategy 
{ 
  TermReference v_11946;

  TermReference q_11946;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail5737:
    { 
      term = index_compare_nametype_equal_0_2.instance.invoke(context, term, v_11946.value, q_11946.value);
      if(term == null)
        break Fail5737;
      if(true)
        return term;
    }
    return null;
  }
}