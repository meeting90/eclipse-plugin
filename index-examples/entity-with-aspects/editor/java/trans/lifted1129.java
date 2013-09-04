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

@SuppressWarnings("all") final class lifted1129 extends Strategy 
{ 
  public static final lifted1129 instance = new lifted1129();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail5623:
    { 
      IStrategoTerm term2975 = term;
      Success3065:
      { 
        Fail5624:
        { 
          if(term.getTermType() != IStrategoTerm.INT || 32 != ((IStrategoInt)term).intValue())
            break Fail5624;
          if(true)
            break Success3065;
        }
        term = term2975;
        IStrategoTerm term2976 = term;
        Success3066:
        { 
          Fail5625:
          { 
            if(term.getTermType() != IStrategoTerm.INT || 9 != ((IStrategoInt)term).intValue())
              break Fail5625;
            if(true)
              break Success3066;
          }
          term = term2976;
          IStrategoTerm term2977 = term;
          Success3067:
          { 
            Fail5626:
            { 
              if(term.getTermType() != IStrategoTerm.INT || 10 != ((IStrategoInt)term).intValue())
                break Fail5626;
              if(true)
                break Success3067;
            }
            term = term2977;
            if(term.getTermType() != IStrategoTerm.INT || 13 != ((IStrategoInt)term).intValue())
              break Fail5623;
          }
        }
      }
      if(true)
        return term;
    }
    return null;
  }
}