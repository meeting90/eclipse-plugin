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

@SuppressWarnings("all") final class lifted954 extends Strategy 
{ 
  TermReference t_11910;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail5754:
    { 
      if(term.getTermType() != IStrategoTerm.APPL || Main._consProperty_2 != ((IStrategoAppl)term).getConstructor())
        break Fail5754;
      if(t_11910.value == null)
        t_11910.value = term.getSubterm(1);
      else
        if(t_11910.value != term.getSubterm(1) && !t_11910.value.match(term.getSubterm(1)))
          break Fail5754;
      IStrategoTerm term2468 = term;
      Success3091:
      { 
        Fail5755:
        { 
          if(t_11910.value == null)
            break Fail5755;
          term = is_primitive_type_0_0.instance.invoke(context, t_11910.value);
          if(term == null)
            break Fail5755;
          { 
            if(true)
              break Fail5754;
            if(true)
              break Success3091;
          }
        }
        term = term2468;
      }
      if(true)
        return term;
    }
    return null;
  }
}