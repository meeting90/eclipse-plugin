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
    Fail1514:
    { 
      IStrategoTerm term834 = term;
      IStrategoConstructor cons54 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success834:
      { 
        if(cons54 == Main._consWildcardImport_1)
        { 
          Fail1515:
          { 
            if(true)
              break Success834;
          }
          term = term834;
        }
        Success835:
        { 
          if(cons54 == Main._consVarDecl_2)
          { 
            Fail1516:
            { 
              if(true)
                break Success835;
            }
            term = term834;
          }
          Success836:
          { 
            if(cons54 == Main._consVarDeclInit_3)
            { 
              Fail1517:
              { 
                if(true)
                  break Success836;
              }
              term = term834;
            }
            if(cons54 == Main._consParam_2)
            { }
            else
            { 
              break Fail1514;
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