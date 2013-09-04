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

@SuppressWarnings("all") final class lifted529 extends Strategy 
{ 
  public static final lifted529 instance = new lifted529();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail2721:
    { 
      IStrategoTerm term1419 = term;
      Success1509:
      { 
        Fail2722:
        { 
          if(term.getTermType() != IStrategoTerm.INT || 32 != ((IStrategoInt)term).intValue())
            break Fail2722;
          if(true)
            break Success1509;
        }
        term = term1419;
        IStrategoTerm term1420 = term;
        Success1510:
        { 
          Fail2723:
          { 
            if(term.getTermType() != IStrategoTerm.INT || 9 != ((IStrategoInt)term).intValue())
              break Fail2723;
            if(true)
              break Success1510;
          }
          term = term1420;
          IStrategoTerm term1421 = term;
          Success1511:
          { 
            Fail2724:
            { 
              if(term.getTermType() != IStrategoTerm.INT || 10 != ((IStrategoInt)term).intValue())
                break Fail2724;
              if(true)
                break Success1511;
            }
            term = term1421;
            if(term.getTermType() != IStrategoTerm.INT || 13 != ((IStrategoInt)term).intValue())
              break Fail2721;
          }
        }
      }
      if(true)
        return term;
    }
    return null;
  }
}