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

@SuppressWarnings("all") final class lifted1053 extends Strategy 
{ 
  TermReference z_11985;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail5682:
    { 
      IStrategoTerm x_12154 = null;
      IStrategoTerm a_12155 = null;
      IStrategoTerm y_12154 = null;
      IStrategoTerm z_12154 = null;
      a_12155 = term;
      if(z_11985.value == null)
        break Fail5682;
      x_12154 = z_11985.value;
      term = a_12155;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail5682;
      y_12154 = term.getSubterm(0);
      z_12154 = term.getSubterm(1);
      term = termFactory.makeTuple(y_12154, termFactory.makeTuple(x_12154, z_12154));
      if(true)
        return term;
    }
    return null;
  }
}