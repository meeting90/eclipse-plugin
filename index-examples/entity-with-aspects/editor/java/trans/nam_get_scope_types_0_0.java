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
    Fail4353:
    { 
      IStrategoTerm term2334 = term;
      IStrategoConstructor cons119 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success2334:
      { 
        if(cons119 == Main._consModule_3)
        { 
          Fail4354:
          { 
            term = trans.constCons199;
            if(true)
              break Success2334;
          }
          term = term2334;
        }
        Success2335:
        { 
          if(cons119 == Main._consAspect_2)
          { 
            Fail4355:
            { 
              term = trans.constCons201;
              if(true)
                break Success2335;
            }
            term = term2334;
          }
          Success2336:
          { 
            if(cons119 == Main._consPointcut_3)
            { 
              Fail4356:
              { 
                term = trans.constCons202;
                if(true)
                  break Success2336;
              }
              term = term2334;
            }
            Success2337:
            { 
              if(cons119 == Main._consAdvice_6)
              { 
                Fail4357:
                { 
                  term = trans.constCons202;
                  if(true)
                    break Success2337;
                }
                term = term2334;
              }
              Success2338:
              { 
                if(cons119 == Main._consEntity_2)
                { 
                  Fail4358:
                  { 
                    term = trans.constCons204;
                    if(true)
                      break Success2338;
                  }
                  term = term2334;
                }
                Success2339:
                { 
                  if(cons119 == Main._consFunction_3)
                  { 
                    Fail4359:
                    { 
                      term = trans.constCons206;
                      if(true)
                        break Success2339;
                    }
                    term = term2334;
                  }
                  if(cons119 == Main._consBlock_1)
                  { 
                    term = trans.constCons206;
                  }
                  else
                  { 
                    break Fail4353;
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