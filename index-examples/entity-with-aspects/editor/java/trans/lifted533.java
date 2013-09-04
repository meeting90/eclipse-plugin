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

@SuppressWarnings("all") final class lifted533 extends Strategy 
{ 
  Strategy i_2152;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail2716:
    { 
      lifted534 lifted5340 = new lifted534();
      lifted5340.i_2152 = i_2152;
      term = preserve_annos_1_0.instance.invoke(context, term, lifted5340);
      if(term == null)
        break Fail2716;
      if(true)
        return term;
    }
    return null;
  }
}