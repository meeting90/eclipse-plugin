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

@SuppressWarnings("all") final class lifted368 extends Strategy 
{ 
  TermReference a_2075;

  TermReference t_2074;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail2844:
    { 
      lifted369 lifted3690 = new lifted369();
      lifted3690.a_2075 = a_2075;
      lifted3690.t_2074 = t_2074;
      term = sometd_1_0.instance.invoke(context, term, lifted3690);
      if(term == null)
        break Fail2844;
      if(true)
        return term;
    }
    return null;
  }
}