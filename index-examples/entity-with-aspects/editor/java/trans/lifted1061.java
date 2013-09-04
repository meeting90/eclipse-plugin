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

@SuppressWarnings("all") final class lifted1061 extends Strategy 
{ 
  public static final lifted1061 instance = new lifted1061();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail5672:
    { 
      IStrategoTerm term2894 = term;
      Success3080:
      { 
        Fail5673:
        { 
          IStrategoTerm term2895 = term;
          IStrategoConstructor cons141 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
          Success3081:
          { 
            if(cons141 == Main._consParallelResults_6)
            { 
              Fail5674:
              { 
                IStrategoTerm arg1563 = term.getSubterm(0);
                if(arg1563.getTermType() != IStrategoTerm.TUPLE || arg1563.getSubtermCount() != 0)
                  break Fail5674;
                IStrategoTerm arg1564 = term.getSubterm(1);
                if(arg1564.getTermType() != IStrategoTerm.TUPLE || arg1564.getSubtermCount() != 0)
                  break Fail5674;
                if(true)
                  break Success3081;
              }
              term = term2895;
            }
            if(cons141 == Main._consParallelResults_6)
            { 
              IStrategoTerm arg1569 = term.getSubterm(0);
              if(arg1569.getTermType() != IStrategoTerm.TUPLE || arg1569.getSubtermCount() != 0)
                break Fail5673;
              IStrategoTerm arg1570 = term.getSubterm(1);
              if(arg1570.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg1570).isEmpty())
                break Fail5673;
              IStrategoTerm arg1571 = ((IStrategoList)arg1570).head();
              if(arg1571.getTermType() != IStrategoTerm.TUPLE || arg1571.getSubtermCount() != 0)
                break Fail5673;
              IStrategoTerm arg1572 = ((IStrategoList)arg1570).tail();
              if(arg1572.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg1572).isEmpty())
                break Fail5673;
            }
            else
            { 
              break Fail5673;
            }
          }
          { 
            if(true)
              break Fail5672;
            if(true)
              break Success3080;
          }
        }
        term = term2894;
      }
      term = index_set_markers_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail5672;
      if(true)
        return term;
    }
    return null;
  }
}