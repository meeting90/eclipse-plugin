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

@SuppressWarnings("all") public class to_java_aspect_replace_var_0_2 extends Strategy 
{ 
  public static to_java_aspect_replace_var_0_2 instance = new to_java_aspect_replace_var_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm f_11938, IStrategoTerm g_11938)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("to_java_aspect_replace_var_0_2");
    Fail4759:
    { 
      IStrategoTerm h_11938 = null;
      IStrategoTerm j_11938 = null;
      h_11938 = term;
      term = strip_annos_0_0.instance.invoke(context, h_11938);
      if(term == null)
        break Fail4759;
      j_11938 = term;
      term = strip_annos_0_0.instance.invoke(context, f_11938);
      if(term == null)
        break Fail4759;
      term = termFactory.makeTuple(j_11938, term);
      term = eq_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail4759;
      term = g_11938;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}