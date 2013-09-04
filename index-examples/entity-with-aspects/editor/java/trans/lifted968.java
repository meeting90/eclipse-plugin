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

@SuppressWarnings("all") final class lifted968 extends Strategy 
{ 
  TermReference v_11937;

  TermReference o_11937;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail5746:
    { 
      lifted969 lifted9690 = new lifted969();
      lifted9690.v_11937 = v_11937;
      lifted9690.o_11937 = o_11937;
      term = sometd_1_0.instance.invoke(context, term, lifted9690);
      if(term == null)
        break Fail5746;
      if(true)
        return term;
    }
    return null;
  }
}