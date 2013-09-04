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
    Fail5027:
    { 
      IStrategoTerm term2875 = term;
      IStrategoConstructor cons138 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success2845:
      { 
        if(cons138 == Main._consRead_1)
        { 
          Fail5028:
          { 
            if(true)
              break Success2845;
          }
          term = term2875;
        }
        Success2846:
        { 
          if(cons138 == Main._consReadWildcard_2)
          { 
            Fail5029:
            { 
              if(true)
                break Success2846;
            }
            term = term2875;
          }
          if(cons138 == Main._consUse_1)
          { }
          else
          { 
            break Fail5027;
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