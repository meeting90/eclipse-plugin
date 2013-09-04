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

@SuppressWarnings("all") final class lifted939 extends Strategy 
{ 
  public static final lifted939 instance = new lifted939();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail5775:
    { 
      IStrategoTerm y_11898 = null;
      IStrategoTerm z_11898 = null;
      IStrategoTerm a_11899 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail5775;
      IStrategoTerm arg1365 = term.getSubterm(0);
      if(arg1365.getTermType() != IStrategoTerm.TUPLE || arg1365.getSubtermCount() != 2)
        break Fail5775;
      y_11898 = arg1365.getSubterm(0);
      z_11898 = arg1365.getSubterm(1);
      a_11899 = term.getSubterm(1);
      term = string_replace_0_2.instance.invoke(context, a_11899, y_11898, z_11898);
      if(term == null)
        break Fail5775;
      if(true)
        return term;
    }
    return null;
  }
}