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

@SuppressWarnings("all") final class lifted1135 extends Strategy 
{ 
  public static final lifted1135 instance = new lifted1135();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail5615:
    { 
      IStrategoList annos229 = term.getAnnotations();
      term = SRTS_one.instance.invoke(context, annos229, lifted1136.instance);
      if(term == null)
        break Fail5615;
      if(true)
        return term;
    }
    return null;
  }
}