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

@SuppressWarnings("all") public class index_diff_constructors_0_0 extends Strategy 
{ 
  public static index_diff_constructors_0_0 instance = new index_diff_constructors_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail4826:
    { 
      IStrategoTerm term2751 = term;
      IStrategoConstructor cons134 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success2730:
      { 
        if(cons134 == Main._consDefData_3)
        { 
          Fail4827:
          { 
            IStrategoTerm arg1477 = term.getSubterm(1);
            if(arg1477.getTermType() != IStrategoTerm.APPL || Main._consType_0 != ((IStrategoAppl)arg1477).getConstructor())
              break Fail4827;
            if(true)
              break Success2730;
          }
          term = term2751;
        }
        if(cons134 == Main._consDef_1)
        { }
        else
        { 
          break Fail4826;
        }
      }
      if(true)
        return term;
    }
    context.push("index_diff_constructors_0_0");
    context.popOnFailure();
    return null;
  }
}