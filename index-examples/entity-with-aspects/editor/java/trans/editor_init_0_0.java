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

@SuppressWarnings("all") public class editor_init_0_0 extends Strategy 
{ 
  public static editor_init_0_0 instance = new editor_init_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("editor_init_0_0");
    Fail2325:
    { 
      term = try_1_0.instance.invoke(context, term, dr_scope_all_end_0_0.instance);
      if(term == null)
        break Fail2325;
      term = dr_scope_all_start_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail2325;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}