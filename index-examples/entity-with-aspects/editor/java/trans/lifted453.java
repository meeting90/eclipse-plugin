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

@SuppressWarnings("all") final class lifted453 extends Strategy 
{ 
  TermReference e_2123;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail2780:
    { 
      IStrategoTerm c_2292 = null;
      IStrategoTerm f_2292 = null;
      IStrategoTerm d_2292 = null;
      IStrategoTerm e_2292 = null;
      f_2292 = term;
      if(e_2123.value == null)
        break Fail2780;
      c_2292 = e_2123.value;
      term = f_2292;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail2780;
      d_2292 = term.getSubterm(0);
      e_2292 = term.getSubterm(1);
      term = termFactory.makeTuple(d_2292, termFactory.makeTuple(c_2292, e_2292));
      if(true)
        return term;
    }
    return null;
  }
}