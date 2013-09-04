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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_b_11982)
  { 
    TermReference b_11982 = new TermReference(ref_b_11982);
    context.push("index_readwildcard_substring_0_1");
    Fail5017:
    { 
      IStrategoTerm c_11982 = null;
      IStrategoTerm d_11982 = null;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consReadWildcard_2 != ((IStrategoAppl)term).getConstructor())
        break Fail5017;
      c_11982 = term.getSubterm(1);
      d_11982 = term;
      term = c_11982;
      lifted1052 lifted10520 = new lifted1052();
      lifted10520.b_11982 = b_11982;
      term = is_substring_1_0.instance.invoke(context, term, lifted10520);
      if(term == null)
        break Fail5017;
      term = d_11982;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}