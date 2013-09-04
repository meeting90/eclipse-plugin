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
    Fail1924:
    { 
      IStrategoTerm term1195 = term;
      IStrategoConstructor cons62 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success1174:
      { 
        if(cons62 == Main._consDefData_3)
        { 
          Fail1925:
          { 
            IStrategoTerm arg623 = term.getSubterm(1);
            if(arg623.getTermType() != IStrategoTerm.APPL || Main._consType_0 != ((IStrategoAppl)arg623).getConstructor())
              break Fail1925;
            if(true)
              break Success1174;
          }
          term = term1195;
        }
        if(cons62 == Main._consDef_1)
        { }
        else
        { 
          break Fail1924;
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