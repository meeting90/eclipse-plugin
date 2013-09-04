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
    Fail5001:
    { 
      IStrategoTerm term2861 = term;
      IStrategoConstructor cons137 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success2831:
      { 
        if(cons137 == Main._consDef_1)
        { 
          Fail5002:
          { 
            IStrategoTerm g_11981 = null;
            g_11981 = term.getSubterm(0);
            term = g_11981;
            if(true)
              break Success2831;
          }
          term = term2861;
        }
        Success2832:
        { 
          if(cons137 == Main._consUse_1)
          { 
            Fail5003:
            { 
              IStrategoTerm f_11981 = null;
              f_11981 = term.getSubterm(0);
              term = f_11981;
              if(true)
                break Success2832;
            }
            term = term2861;
          }
          Success2833:
          { 
            if(cons137 == Main._consRead_1)
            { 
              Fail5004:
              { 
                IStrategoTerm e_11981 = null;
                e_11981 = term.getSubterm(0);
                term = e_11981;
                if(true)
                  break Success2833;
              }
              term = term2861;
            }
            Success2834:
            { 
              if(cons137 == Main._consReadWildcard_2)
              { 
                Fail5005:
                { 
                  IStrategoTerm d_11981 = null;
                  d_11981 = term.getSubterm(1);
                  term = d_11981;
                  if(true)
                    break Success2834;
                }
                term = term2861;
              }
              if(cons137 == Main._consDefData_3)
              { 
                IStrategoTerm c_11981 = null;
                c_11981 = term.getSubterm(2);
                term = c_11981;
              }
              else
              { 
                break Fail5001;
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