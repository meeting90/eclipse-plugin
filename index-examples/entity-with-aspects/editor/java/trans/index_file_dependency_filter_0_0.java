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

@SuppressWarnings("all") public class index_file_dependency_filter_0_0 extends Strategy 
{ 
  public static index_file_dependency_filter_0_0 instance = new index_file_dependency_filter_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail2125:
    { 
      IStrategoTerm term1319 = term;
      IStrategoConstructor cons66 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success1289:
      { 
        if(cons66 == Main._consRead_1)
        { 
          Fail2126:
          { 
            if(true)
              break Success1289;
          }
          term = term1319;
        }
        Success1290:
        { 
          if(cons66 == Main._consReadWildcard_2)
          { 
            Fail2127:
            { 
              if(true)
                break Success1290;
            }
            term = term1319;
          }
          if(cons66 == Main._consUse_1)
          { }
          else
          { 
            break Fail2125;
          }
        }
      }
      if(true)
        return term;
    }
    context.push("index_file_dependency_filter_0_0");
    context.popOnFailure();
    return null;
  }
}