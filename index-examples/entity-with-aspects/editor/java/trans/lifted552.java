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

@SuppressWarnings("all") final class lifted552 extends Strategy 
{ 
  TermReference c_2159;

  TermReference d_2159;

  TermReference e_2159;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail2704:
    { 
      Success1507:
      { 
        Fail2705:
        { 
          if(c_2159.value == null)
            break Fail2705;
          term = index_lookup_all_0_1.instance.invoke(context, c_2159.value, d_2159.value);
          if(term == null)
            break Fail2705;
          if(true)
            break Success1507;
        }
        term = trans.constNil1;
      }
      if(e_2159.value == null)
        e_2159.value = term;
      else
        if(e_2159.value != term && !e_2159.value.match(term))
          break Fail2704;
      if(true)
        return term;
    }
    return null;
  }
}