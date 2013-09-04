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

@SuppressWarnings("all") public class update_index_paths_0_1 extends Strategy 
{ 
  public static update_index_paths_0_1 instance = new update_index_paths_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_x_2103)
  { 
    TermReference x_2103 = new TermReference(ref_x_2103);
    context.push("update_index_paths_0_1");
    Fail2013:
    { 
      lifted411 lifted4110 = new lifted411();
      lifted4110.x_2103 = x_2103;
      term = remove_all_1_0.instance.invoke(context, term, lifted4110);
      if(term == null)
        break Fail2013;
      lifted412 lifted4120 = new lifted412();
      lifted4120.x_2103 = x_2103;
      term = at_end_1_0.instance.invoke(context, term, lifted4120);
      if(term == null)
        break Fail2013;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}