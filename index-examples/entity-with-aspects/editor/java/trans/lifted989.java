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

@SuppressWarnings("all") final class lifted989 extends Strategy 
{ 
  public static final lifted989 instance = new lifted989();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail5731:
    { 
      IStrategoTerm term2757 = term;
      Success3090:
      { 
        Fail5732:
        { 
          term = index_file_is_partial_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail5732;
          { 
            if(true)
              break Fail5731;
            if(true)
              break Success3090;
          }
        }
        term = term2757;
      }
      if(true)
        return term;
    }
    return null;
  }
}