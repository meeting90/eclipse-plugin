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

@SuppressWarnings("all") public class index_readwildcard_substring_0_1 extends Strategy 
{ 
  public static index_readwildcard_substring_0_1 instance = new index_readwildcard_substring_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_g_2119)
  { 
    TermReference g_2119 = new TermReference(ref_g_2119);
    context.push("index_readwildcard_substring_0_1");
    Fail2115:
    { 
      IStrategoTerm h_2119 = null;
      IStrategoTerm i_2119 = null;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consReadWildcard_2 != ((IStrategoAppl)term).getConstructor())
        break Fail2115;
      h_2119 = term.getSubterm(1);
      i_2119 = term;
      term = h_2119;
      lifted452 lifted4520 = new lifted452();
      lifted4520.g_2119 = g_2119;
      term = is_substring_1_0.instance.invoke(context, term, lifted4520);
      if(term == null)
        break Fail2115;
      term = i_2119;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}