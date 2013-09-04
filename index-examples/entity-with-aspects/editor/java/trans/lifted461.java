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

@SuppressWarnings("all") final class lifted461 extends Strategy 
{ 
  public static final lifted461 instance = new lifted461();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail2770:
    { 
      IStrategoTerm term1338 = term;
      Success1524:
      { 
        Fail2771:
        { 
          IStrategoTerm term1339 = term;
          IStrategoConstructor cons69 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
          Success1525:
          { 
            if(cons69 == Main._consParallelResults_6)
            { 
              Fail2772:
              { 
                IStrategoTerm arg709 = term.getSubterm(0);
                if(arg709.getTermType() != IStrategoTerm.TUPLE || arg709.getSubtermCount() != 0)
                  break Fail2772;
                IStrategoTerm arg710 = term.getSubterm(1);
                if(arg710.getTermType() != IStrategoTerm.TUPLE || arg710.getSubtermCount() != 0)
                  break Fail2772;
                if(true)
                  break Success1525;
              }
              term = term1339;
            }
            if(cons69 == Main._consParallelResults_6)
            { 
              IStrategoTerm arg715 = term.getSubterm(0);
              if(arg715.getTermType() != IStrategoTerm.TUPLE || arg715.getSubtermCount() != 0)
                break Fail2771;
              IStrategoTerm arg716 = term.getSubterm(1);
              if(arg716.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg716).isEmpty())
                break Fail2771;
              IStrategoTerm arg717 = ((IStrategoList)arg716).head();
              if(arg717.getTermType() != IStrategoTerm.TUPLE || arg717.getSubtermCount() != 0)
                break Fail2771;
              IStrategoTerm arg718 = ((IStrategoList)arg716).tail();
              if(arg718.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg718).isEmpty())
                break Fail2771;
            }
            else
            { 
              break Fail2771;
            }
          }
          { 
            if(true)
              break Fail2770;
            if(true)
              break Success1524;
          }
        }
        term = term1338;
      }
      term = index_set_markers_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail2770;
      if(true)
        return term;
    }
    return null;
  }
}