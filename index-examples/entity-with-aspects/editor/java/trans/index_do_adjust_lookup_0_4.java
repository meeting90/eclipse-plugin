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

@SuppressWarnings("all") public class index_do_adjust_lookup_0_4 extends Strategy 
{ 
  public static index_do_adjust_lookup_0_4 instance = new index_do_adjust_lookup_0_4();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_n_2115, IStrategoTerm ref_o_2115, IStrategoTerm ref_p_2115, IStrategoTerm ref_q_2115)
  { 
    TermReference n_2115 = new TermReference(ref_n_2115);
    TermReference o_2115 = new TermReference(ref_o_2115);
    TermReference p_2115 = new TermReference(ref_p_2115);
    TermReference q_2115 = new TermReference(ref_q_2115);
    context.push("index_do_adjust_lookup_0_4");
    Fail2083:
    { 
      lifted442 lifted4420 = new lifted442();
      lifted4420.p_2115 = p_2115;
      lifted4420.n_2115 = n_2115;
      lifted4420.o_2115 = o_2115;
      lifted4420.q_2115 = q_2115;
      term = repeat_until_2_0.instance.invoke(context, term, lifted441.instance, lifted4420);
      if(term == null)
        break Fail2083;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}