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

@SuppressWarnings("all") final class lifted505 extends Strategy 
{ 
  TermReference f_2132;

  TermReference e_2132;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail2752:
    { 
      term = index_compare_name_substring_0_2.instance.invoke(context, term, f_2132.value, e_2132.value);
      if(term == null)
        break Fail2752;
      if(true)
        return term;
    }
    return null;
  }
}