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

@SuppressWarnings("all") final class lifted408 extends Strategy 
{ 
  TermReference f_2196;

  TermReference v_2100;

  TermReference u_2100;

  TermReference q_2100;

  TermReference r_2100;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail2811:
    { 
      term = construct_index_path_0_5.instance.invoke(context, term, f_2196.value, v_2100.value, u_2100.value, q_2100.value, r_2100.value);
      if(term == null)
        break Fail2811;
      if(true)
        return term;
    }
    return null;
  }
}