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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm l_2120, IStrategoTerm m_2120)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("index_add_unresolved_0_2");
    Fail2121:
    { 
      IStrategoTerm term1317 = term;
      Success1287:
      { 
        Fail2122:
        { 
          IStrategoTerm o_2120 = null;
          term = $Index_$Unresolved$Set_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2122;
          o_2120 = term;
          term = termFactory.makeTuple(l_2120, m_2120);
          term = iset_add_0_1.instance.invoke(context, o_2120, term);
          if(term == null)
            break Fail2122;
          if(true)
            break Success1287;
        }
        term = term1317;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}