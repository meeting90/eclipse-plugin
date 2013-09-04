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

@SuppressWarnings("all") public class index_get_children_0_2 extends Strategy 
{ 
  public static index_get_children_0_2 instance = new index_get_children_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_b_2129, IStrategoTerm ref_c_2129)
  { 
    TermReference b_2129 = new TermReference(ref_b_2129);
    TermReference c_2129 = new TermReference(ref_c_2129);
    context.push("index_get_children_0_2");
    Fail2183:
    { 
      lifted473 lifted4730 = new lifted473();
      lifted4730.c_2129 = c_2129;
      lifted4730.b_2129 = b_2129;
      term = index_get_children_2_2.instance.invoke(context, term, lifted472.instance, lifted4730, b_2129.value, c_2129.value);
      if(term == null)
        break Fail2183;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}