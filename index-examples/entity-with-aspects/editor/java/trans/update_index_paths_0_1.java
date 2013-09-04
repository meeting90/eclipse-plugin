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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_s_11966)
  { 
    TermReference s_11966 = new TermReference(ref_s_11966);
    context.push("update_index_paths_0_1");
    Fail4915:
    { 
      lifted1011 lifted10110 = new lifted1011();
      lifted10110.s_11966 = s_11966;
      term = remove_all_1_0.instance.invoke(context, term, lifted10110);
      if(term == null)
        break Fail4915;
      lifted1012 lifted10120 = new lifted1012();
      lifted10120.s_11966 = s_11966;
      term = at_end_1_0.instance.invoke(context, term, lifted10120);
      if(term == null)
        break Fail4915;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}