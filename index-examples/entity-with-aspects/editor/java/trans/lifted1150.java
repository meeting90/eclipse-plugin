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

@SuppressWarnings("all") final class lifted1150 extends Strategy 
{ 
  public static final lifted1150 instance = new lifted1150();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail5609:
    { 
      IStrategoList annos230 = term.getAnnotations();
      if(annos230.getTermType() != IStrategoTerm.LIST || ((IStrategoList)annos230).isEmpty())
        break Fail5609;
      IStrategoTerm arg1666 = ((IStrategoList)annos230).tail();
      if(arg1666.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg1666).isEmpty())
        break Fail5609;
      if(true)
        return term;
    }
    return null;
  }
}