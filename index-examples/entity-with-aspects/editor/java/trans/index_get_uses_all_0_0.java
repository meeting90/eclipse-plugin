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

@SuppressWarnings("all") public class index_get_uses_all_0_0 extends Strategy 
{ 
  public static index_get_uses_all_0_0 instance = new index_get_uses_all_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("index_get_uses_all_0_0");
    Fail5073:
    { 
      TermReference h_11989 = new TermReference();
      IStrategoTerm j_11989 = null;
      IStrategoTerm k_11989 = null;
      k_11989 = term;
      j_11989 = trans.const972;
      term = k_11989;
      lifted1065 lifted10650 = new lifted1065();
      lifted10650.h_11989 = h_11989;
      term = with_1_1.instance.invoke(context, term, lifted10650, j_11989);
      if(term == null)
        break Fail5073;
      if(h_11989.value == null)
        break Fail5073;
      term = termFactory.makeAppl(Main._consUse_1, new IStrategoTerm[]{h_11989.value});
      term = index_get_all_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail5073;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}