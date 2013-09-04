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

@SuppressWarnings("all") final class lifted1191 extends Strategy 
{ 
  public static final lifted1191 instance = new lifted1191();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail5568:
    { 
      IStrategoTerm f_12055 = null;
      IStrategoTerm o_12055 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail5568;
      o_12055 = term.getSubterm(0);
      IStrategoTerm arg1703 = term.getSubterm(1);
      f_12055 = arg1703;
      term = aux_$Is$Imported_0_2.instance.invoke(context, o_12055, arg1703, f_12055);
      if(term == null)
        break Fail5568;
      if(true)
        return term;
    }
    return null;
  }
}