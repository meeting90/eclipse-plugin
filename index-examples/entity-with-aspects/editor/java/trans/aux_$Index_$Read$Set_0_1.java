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

@SuppressWarnings("all") public class aux_$Index_$Read$Set_0_1 extends Strategy 
{ 
  public static aux_$Index_$Read$Set_0_1 instance = new aux_$Index_$Read$Set_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm x_12045)
  { 
    Fail5482:
    { 
      IStrategoTerm y_12045 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail5482;
      IStrategoTerm arg1692 = term.getSubterm(0);
      if(arg1692.getTermType() != IStrategoTerm.STRING || !"-744537".equals(((IStrategoString)arg1692).stringValue()))
        break Fail5482;
      y_12045 = term.getSubterm(1);
      term = y_12045;
      if(true)
        return term;
    }
    context.push("aux_Index_ReadSet_0_1");
    context.popOnFailure();
    return null;
  }
}