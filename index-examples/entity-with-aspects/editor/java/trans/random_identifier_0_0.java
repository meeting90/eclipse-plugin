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

@SuppressWarnings("all") public class random_identifier_0_0 extends Strategy 
{ 
  public static random_identifier_0_0 instance = new random_identifier_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("random_identifier_0_0");
    Fail1589:
    { 
      IStrategoTerm m_2037 = null;
      IStrategoTerm o_2037 = null;
      IStrategoTerm p_2037 = null;
      term = new_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail1589;
      o_2037 = term;
      m_2037 = trans.const308;
      p_2037 = o_2037;
      term = string_replace_0_2.instance.invoke(context, p_2037, m_2037, trans.const309);
      if(term == null)
        break Fail1589;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}