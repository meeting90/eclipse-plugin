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

@SuppressWarnings("all") final class lifted1183 extends Strategy 
{ 
  public static final lifted1183 instance = new lifted1183();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail5576:
    { 
      IStrategoTerm o_12051 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail5576;
      o_12051 = term.getSubterm(0);
      IStrategoTerm arg1698 = term.getSubterm(1);
      term = aux_$Current$File_0_1.instance.invoke(context, o_12051, arg1698);
      if(term == null)
        break Fail5576;
      if(true)
        return term;
    }
    return null;
  }
}