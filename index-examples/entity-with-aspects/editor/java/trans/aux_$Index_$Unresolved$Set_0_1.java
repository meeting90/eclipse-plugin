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

@SuppressWarnings("all") public class aux_$Index_$Unresolved$Set_0_1 extends Strategy 
{ 
  public static aux_$Index_$Unresolved$Set_0_1 instance = new aux_$Index_$Unresolved$Set_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm j_2187)
  { 
    Fail2606:
    { 
      IStrategoTerm k_2187 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail2606;
      IStrategoTerm arg843 = term.getSubterm(0);
      if(arg843.getTermType() != IStrategoTerm.STRING || !"120068".equals(((IStrategoString)arg843).stringValue()))
        break Fail2606;
      k_2187 = term.getSubterm(1);
      term = k_2187;
      if(true)
        return term;
    }
    context.push("aux_Index_UnresolvedSet_0_1");
    context.popOnFailure();
    return null;
  }
}