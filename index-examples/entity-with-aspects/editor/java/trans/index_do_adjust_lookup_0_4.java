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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_i_11978, IStrategoTerm ref_j_11978, IStrategoTerm ref_k_11978, IStrategoTerm ref_l_11978)
  { 
    TermReference i_11978 = new TermReference(ref_i_11978);
    TermReference j_11978 = new TermReference(ref_j_11978);
    TermReference k_11978 = new TermReference(ref_k_11978);
    TermReference l_11978 = new TermReference(ref_l_11978);
    context.push("index_do_adjust_lookup_0_4");
    Fail4985:
    { 
      lifted1042 lifted10420 = new lifted1042();
      lifted10420.k_11978 = k_11978;
      lifted10420.i_11978 = i_11978;
      lifted10420.j_11978 = j_11978;
      lifted10420.l_11978 = l_11978;
      term = repeat_until_2_0.instance.invoke(context, term, lifted1041.instance, lifted10420);
      if(term == null)
        break Fail4985;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}