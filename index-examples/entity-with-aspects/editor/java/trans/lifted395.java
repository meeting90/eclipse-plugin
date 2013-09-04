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

@SuppressWarnings("all") final class lifted395 extends Strategy 
{ 
  public static final lifted395 instance = new lifted395();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail2824:
    { 
      IStrategoTerm term1230 = term;
      IStrategoConstructor cons71 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success1533:
      { 
        if(cons71 == Main._consDefData_3)
        { 
          Fail2825:
          { 
            IStrategoTerm arg640 = term.getSubterm(1);
            if(arg640.getTermType() != IStrategoTerm.APPL || Main._consType_0 != ((IStrategoAppl)arg640).getConstructor())
              break Fail2825;
            if(true)
              break Success1533;
          }
          term = term1230;
        }
        if(cons71 == Main._consDef_1)
        { }
        else
        { 
          break Fail2824;
        }
      }
      if(true)
        return term;
    }
    return null;
  }
}