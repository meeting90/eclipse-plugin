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
    Fail2293:
    { 
      IStrategoTerm o_2144 = null;
      IStrategoTerm p_2144 = null;
      IStrategoTerm u_2144 = null;
      o_2144 = term;
      p_2144 = trans.constEntityWithAspectsGeneratedPpAf;
      term = (IStrategoTerm)termFactory.makeListCons(p_2144, termFactory.makeListCons(trans.constEntityWithAspectsPpAf, (IStrategoList)trans.constNil1));
      term = ast2abox_0_1.instance.invoke(context, o_2144, term);
      if(term == null)
        break Fail2293;
      u_2144 = term;
      term = box2text_string_0_1.instance.invoke(context, u_2144, trans.const305);
      if(term == null)
        break Fail2293;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}