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

@SuppressWarnings("all") final class lifted973 extends Strategy 
{ 
  TermReference e_11944;

  TermReference w_12058;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail5742:
    { 
      IStrategoTerm q_11944 = null;
      q_11944 = term;
      if(e_11944.value == null)
        break Fail5742;
      term = (IStrategoTerm)termFactory.makeListCons(e_11944.value, (IStrategoList)trans.constNil3);
      term = import_defs_0_2.instance.invoke(context, q_11944, w_12058.value, term);
      if(term == null)
        break Fail5742;
      if(true)
        return term;
    }
    return null;
  }
}