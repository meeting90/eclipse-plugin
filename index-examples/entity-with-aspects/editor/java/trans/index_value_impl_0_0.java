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

@SuppressWarnings("all") public class index_value_impl_0_0 extends Strategy 
{ 
  public static index_value_impl_0_0 instance = new index_value_impl_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail2099:
    { 
      IStrategoTerm term1305 = term;
      IStrategoConstructor cons65 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success1275:
      { 
        if(cons65 == Main._consDef_1)
        { 
          Fail2100:
          { 
            IStrategoTerm l_2118 = null;
            l_2118 = term.getSubterm(0);
            term = l_2118;
            if(true)
              break Success1275;
          }
          term = term1305;
        }
        Success1276:
        { 
          if(cons65 == Main._consUse_1)
          { 
            Fail2101:
            { 
              IStrategoTerm k_2118 = null;
              k_2118 = term.getSubterm(0);
              term = k_2118;
              if(true)
                break Success1276;
            }
            term = term1305;
          }
          Success1277:
          { 
            if(cons65 == Main._consRead_1)
            { 
              Fail2102:
              { 
                IStrategoTerm j_2118 = null;
                j_2118 = term.getSubterm(0);
                term = j_2118;
                if(true)
                  break Success1277;
              }
              term = term1305;
            }
            Success1278:
            { 
              if(cons65 == Main._consReadWildcard_2)
              { 
                Fail2103:
                { 
                  IStrategoTerm i_2118 = null;
                  i_2118 = term.getSubterm(1);
                  term = i_2118;
                  if(true)
                    break Success1278;
                }
                term = term1305;
              }
              if(cons65 == Main._consDefData_3)
              { 
                IStrategoTerm h_2118 = null;
                h_2118 = term.getSubterm(2);
                term = h_2118;
              }
              else
              { 
                break Fail2099;
              }
            }
          }
        }
      }
      if(true)
        return term;
    }
    context.push("index_value_impl_0_0");
    context.popOnFailure();
    return null;
  }
}