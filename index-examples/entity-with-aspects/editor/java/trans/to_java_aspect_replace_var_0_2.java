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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm k_2075, IStrategoTerm l_2075)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("to_java_aspect_replace_var_0_2");
    Fail1857:
    { 
      IStrategoTerm m_2075 = null;
      IStrategoTerm o_2075 = null;
      m_2075 = term;
      term = strip_annos_0_0.instance.invoke(context, m_2075);
      if(term == null)
        break Fail1857;
      o_2075 = term;
      term = strip_annos_0_0.instance.invoke(context, k_2075);
      if(term == null)
        break Fail1857;
      term = termFactory.makeTuple(o_2075, term);
      term = eq_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail1857;
      term = l_2075;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}