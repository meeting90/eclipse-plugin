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

@SuppressWarnings("all") final class lifted1023 extends Strategy 
{ 
  public static final lifted1023 instance = new lifted1023();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail5700:
    { 
      IStrategoTerm c_11969 = null;
      IStrategoTerm d_11969 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail5700;
      c_11969 = term.getSubterm(0);
      d_11969 = term.getSubterm(1);
      term = project_path_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail5700;
      term = termFactory.makeTuple(c_11969, d_11969, term);
      if(true)
        return term;
    }
    return null;
  }
}