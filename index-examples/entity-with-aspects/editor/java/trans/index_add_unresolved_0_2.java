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

@SuppressWarnings("all") public class index_add_unresolved_0_2 extends Strategy 
{ 
  public static index_add_unresolved_0_2 instance = new index_add_unresolved_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm g_11983, IStrategoTerm h_11983)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("index_add_unresolved_0_2");
    Fail5023:
    { 
      IStrategoTerm term2873 = term;
      Success2843:
      { 
        Fail5024:
        { 
          IStrategoTerm j_11983 = null;
          term = $Index_$Unresolved$Set_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail5024;
          j_11983 = term;
          term = termFactory.makeTuple(g_11983, h_11983);
          term = iset_add_0_1.instance.invoke(context, j_11983, term);
          if(term == null)
            break Fail5024;
          if(true)
            break Success2843;
        }
        term = term2873;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}