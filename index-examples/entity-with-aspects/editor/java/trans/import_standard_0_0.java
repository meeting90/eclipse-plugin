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

@SuppressWarnings("all") public class import_standard_0_0 extends Strategy 
{ 
  public static import_standard_0_0 instance = new import_standard_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("import_standard_0_0");
    Fail4813:
    { 
      IStrategoTerm term2743 = term;
      Success2722:
      { 
        Fail4814:
        { 
          term = collect_one_1_0.instance.invoke(context, term, lifted972.instance);
          if(term == null)
            break Fail4814;
          { 
            if(true)
              break Fail4813;
            if(true)
              break Success2722;
          }
        }
        term = term2743;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}