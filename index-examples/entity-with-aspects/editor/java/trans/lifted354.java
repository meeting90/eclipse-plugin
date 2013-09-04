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

@SuppressWarnings("all") final class lifted354 extends Strategy 
{ 
  TermReference y_2047;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail2852:
    { 
      if(term.getTermType() != IStrategoTerm.APPL || Main._consProperty_2 != ((IStrategoAppl)term).getConstructor())
        break Fail2852;
      if(y_2047.value == null)
        y_2047.value = term.getSubterm(1);
      else
        if(y_2047.value != term.getSubterm(1) && !y_2047.value.match(term.getSubterm(1)))
          break Fail2852;
      IStrategoTerm term912 = term;
      Success1535:
      { 
        Fail2853:
        { 
          if(y_2047.value == null)
            break Fail2853;
          term = is_primitive_type_0_0.instance.invoke(context, y_2047.value);
          if(term == null)
            break Fail2853;
          { 
            if(true)
              break Fail2852;
            if(true)
              break Success1535;
          }
        }
        term = term912;
      }
      if(true)
        return term;
    }
    return null;
  }
}