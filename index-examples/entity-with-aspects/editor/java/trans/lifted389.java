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

@SuppressWarnings("all") final class lifted389 extends Strategy 
{ 
  public static final lifted389 instance = new lifted389();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail2829:
    { 
      IStrategoTerm term1201 = term;
      Success1534:
      { 
        Fail2830:
        { 
          term = index_file_is_partial_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2830;
          { 
            if(true)
              break Fail2829;
            if(true)
              break Success1534;
          }
        }
        term = term1201;
      }
      if(true)
        return term;
    }
    return null;
  }
}