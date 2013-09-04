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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm c_2183)
  { 
    Fail2580:
    { 
      IStrategoTerm d_2183 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail2580;
      IStrategoTerm arg838 = term.getSubterm(0);
      if(arg838.getTermType() != IStrategoTerm.STRING || !"-744537".equals(((IStrategoString)arg838).stringValue()))
        break Fail2580;
      d_2183 = term.getSubterm(1);
      term = d_2183;
      if(true)
        return term;
    }
    context.push("aux_Index_ReadSet_0_1");
    context.popOnFailure();
    return null;
  }
}