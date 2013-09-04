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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_w_11991, IStrategoTerm ref_x_11991)
  { 
    TermReference w_11991 = new TermReference(ref_w_11991);
    TermReference x_11991 = new TermReference(ref_x_11991);
    context.push("index_get_children_0_2");
    Fail5085:
    { 
      lifted1073 lifted10730 = new lifted1073();
      lifted10730.x_11991 = x_11991;
      lifted10730.w_11991 = w_11991;
      term = index_get_children_2_2.instance.invoke(context, term, lifted1072.instance, lifted10730, w_11991.value, x_11991.value);
      if(term == null)
        break Fail5085;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}