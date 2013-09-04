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
    Fail4784:
    { 
      IStrategoTerm term2719 = term;
      IStrategoConstructor cons132 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success2698:
      { 
        if(cons132 == Main._consIntType_0)
        { 
          Fail4785:
          { 
            if(true)
              break Success2698;
          }
          term = term2719;
        }
        Success2699:
        { 
          if(cons132 == Main._consStringType_0)
          { 
            Fail4786:
            { 
              if(true)
                break Success2699;
            }
            term = term2719;
          }
          Success2700:
          { 
            if(cons132 == Main._consType_1)
            { 
              Fail4787:
              { 
                IStrategoTerm arg1466 = term.getSubterm(0);
                if(arg1466.getTermType() != IStrategoTerm.STRING || !"String".equals(((IStrategoString)arg1466).stringValue()))
                  break Fail4787;
                if(true)
                  break Success2700;
              }
              term = term2719;
            }
            if(cons132 == Main._consType_1)
            { 
              IStrategoTerm arg1467 = term.getSubterm(0);
              if(arg1467.getTermType() != IStrategoTerm.STRING || !"Int".equals(((IStrategoString)arg1467).stringValue()))
                break Fail4784;
            }
            else
            { 
              break Fail4784;
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