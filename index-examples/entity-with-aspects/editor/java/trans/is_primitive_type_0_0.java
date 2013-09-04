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

@SuppressWarnings("all") public class is_primitive_type_0_0 extends Strategy 
{ 
  public static is_primitive_type_0_0 instance = new is_primitive_type_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail1882:
    { 
      IStrategoTerm term1163 = term;
      IStrategoConstructor cons60 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success1142:
      { 
        if(cons60 == Main._consIntType_0)
        { 
          Fail1883:
          { 
            if(true)
              break Success1142;
          }
          term = term1163;
        }
        Success1143:
        { 
          if(cons60 == Main._consStringType_0)
          { 
            Fail1884:
            { 
              if(true)
                break Success1143;
            }
            term = term1163;
          }
          Success1144:
          { 
            if(cons60 == Main._consType_1)
            { 
              Fail1885:
              { 
                IStrategoTerm arg612 = term.getSubterm(0);
                if(arg612.getTermType() != IStrategoTerm.STRING || !"String".equals(((IStrategoString)arg612).stringValue()))
                  break Fail1885;
                if(true)
                  break Success1144;
              }
              term = term1163;
            }
            if(cons60 == Main._consType_1)
            { 
              IStrategoTerm arg613 = term.getSubterm(0);
              if(arg613.getTermType() != IStrategoTerm.STRING || !"Int".equals(((IStrategoString)arg613).stringValue()))
                break Fail1882;
            }
            else
            { 
              break Fail1882;
            }
          }
        }
      }
      if(true)
        return term;
    }
    context.push("is_primitive_type_0_0");
    context.popOnFailure();
    return null;
  }
}