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

@SuppressWarnings("all") public class nam_get_scope_types_0_0 extends Strategy 
{ 
  public static nam_get_scope_types_0_0 instance = new nam_get_scope_types_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail1451:
    { 
      IStrategoTerm term778 = term;
      IStrategoConstructor cons47 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success778:
      { 
        if(cons47 == Main._consModule_3)
        { 
          Fail1452:
          { 
            term = trans.constCons67;
            if(true)
              break Success778;
          }
          term = term778;
        }
        Success779:
        { 
          if(cons47 == Main._consAspect_2)
          { 
            Fail1453:
            { 
              term = trans.constCons69;
              if(true)
                break Success779;
            }
            term = term778;
          }
          Success780:
          { 
            if(cons47 == Main._consPointcut_3)
            { 
              Fail1454:
              { 
                term = trans.constCons70;
                if(true)
                  break Success780;
              }
              term = term778;
            }
            Success781:
            { 
              if(cons47 == Main._consAdvice_6)
              { 
                Fail1455:
                { 
                  term = trans.constCons70;
                  if(true)
                    break Success781;
                }
                term = term778;
              }
              Success782:
              { 
                if(cons47 == Main._consEntity_2)
                { 
                  Fail1456:
                  { 
                    term = trans.constCons72;
                    if(true)
                      break Success782;
                  }
                  term = term778;
                }
                Success783:
                { 
                  if(cons47 == Main._consFunction_3)
                  { 
                    Fail1457:
                    { 
                      term = trans.constCons74;
                      if(true)
                        break Success783;
                    }
                    term = term778;
                  }
                  if(cons47 == Main._consBlock_1)
                  { 
                    term = trans.constCons74;
                  }
                  else
                  { 
                    break Fail1451;
                  }
                }
              }
            }
          }
        }
      }
      if(true)
        return term;
    }
    context.push("nam_get_scope_types_0_0");
    context.popOnFailure();
    return null;
  }
}