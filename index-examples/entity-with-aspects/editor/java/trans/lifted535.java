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

@SuppressWarnings("all") final class lifted535 extends Strategy 
{ 
  public static final lifted535 instance = new lifted535();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail2713:
    { 
      IStrategoList annos91 = term.getAnnotations();
      term = SRTS_one.instance.invoke(context, annos91, lifted536.instance);
      if(term == null)
        break Fail2713;
      if(true)
        return term;
    }
    return null;
  }
}