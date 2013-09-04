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

@SuppressWarnings("all") public class nam_unique_0_0 extends Strategy 
{ 
  public static nam_unique_0_0 instance = new nam_unique_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail4416:
    { 
      IStrategoTerm term2390 = term;
      IStrategoConstructor cons126 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success2390:
      { 
        if(cons126 == Main._consWildcardImport_1)
        { 
          Fail4417:
          { 
            if(true)
              break Success2390;
          }
          term = term2390;
        }
        Success2391:
        { 
          if(cons126 == Main._consVarDecl_2)
          { 
            Fail4418:
            { 
              if(true)
                break Success2391;
            }
            term = term2390;
          }
          Success2392:
          { 
            if(cons126 == Main._consVarDeclInit_3)
            { 
              Fail4419:
              { 
                if(true)
                  break Success2392;
              }
              term = term2390;
            }
            if(cons126 == Main._consParam_2)
            { }
            else
            { 
              break Fail4416;
            }
          }
        }
      }
      if(true)
        return term;
    }
    context.push("nam_unique_0_0");
    context.popOnFailure();
    return null;
  }
}