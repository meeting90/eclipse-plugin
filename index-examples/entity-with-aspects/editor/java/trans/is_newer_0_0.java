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

@SuppressWarnings("all") public class is_newer_0_0 extends Strategy 
{ 
  public static is_newer_0_0 instance = new is_newer_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("is_newer_0_0");
    Fail2324:
    { 
      IStrategoTerm o_2149 = null;
      IStrategoTerm p_2149 = null;
      IStrategoTerm q_2149 = null;
      IStrategoTerm r_2149 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail2324;
      o_2149 = term.getSubterm(0);
      p_2149 = term.getSubterm(1);
      q_2149 = term;
      term = file_exists_0_0.instance.invoke(context, o_2149);
      if(term == null)
        break Fail2324;
      term = modification_time_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail2324;
      r_2149 = term;
      term = file_exists_0_0.instance.invoke(context, p_2149);
      if(term == null)
        break Fail2324;
      term = modification_time_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail2324;
      term = termFactory.makeTuple(r_2149, term);
      term = gt_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail2324;
      term = q_2149;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}