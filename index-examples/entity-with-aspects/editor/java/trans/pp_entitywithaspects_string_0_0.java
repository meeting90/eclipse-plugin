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

@SuppressWarnings("all") public class pp_entitywithaspects_string_0_0 extends Strategy 
{ 
  public static pp_entitywithaspects_string_0_0 instance = new pp_entitywithaspects_string_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("pp_entitywithaspects_string_0_0");
    Fail5195:
    { 
      IStrategoTerm j_12007 = null;
      IStrategoTerm k_12007 = null;
      IStrategoTerm p_12007 = null;
      j_12007 = term;
      k_12007 = trans.constEntityWithAspectsGeneratedPpAf;
      term = (IStrategoTerm)termFactory.makeListCons(k_12007, termFactory.makeListCons(trans.constEntityWithAspectsPpAf, (IStrategoList)trans.constNil3));
      term = ast2abox_0_1.instance.invoke(context, j_12007, term);
      if(term == null)
        break Fail5195;
      p_12007 = term;
      term = box2text_string_0_1.instance.invoke(context, p_12007, trans.const825);
      if(term == null)
        break Fail5195;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}