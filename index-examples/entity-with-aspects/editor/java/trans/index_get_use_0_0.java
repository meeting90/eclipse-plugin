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

@SuppressWarnings("all") public class index_get_use_0_0 extends Strategy 
{ 
  public static index_get_use_0_0 instance = new index_get_use_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("index_get_use_0_0");
    Fail5072:
    { 
      TermReference b_11989 = new TermReference();
      IStrategoTerm d_11989 = null;
      IStrategoTerm e_11989 = null;
      e_11989 = term;
      d_11989 = trans.const972;
      term = e_11989;
      lifted1064 lifted10640 = new lifted1064();
      lifted10640.b_11989 = b_11989;
      term = with_1_1.instance.invoke(context, term, lifted10640, d_11989);
      if(term == null)
        break Fail5072;
      if(b_11989.value == null)
        break Fail5072;
      term = termFactory.makeAppl(Main._consUse_1, new IStrategoTerm[]{b_11989.value});
      term = index_get_all_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail5072;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}