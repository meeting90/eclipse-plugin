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

@SuppressWarnings("all") final class lifted527 extends Strategy 
{ 
  public static final lifted527 instance = new lifted527();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail2725:
    { 
      term = string_as_chars_1_0.instance.invoke(context, term, documentation_comment_chars_0_0.instance);
      if(term == null)
        break Fail2725;
      if(true)
        return term;
    }
    return null;
  }
}