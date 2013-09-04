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

@SuppressWarnings("all") final class lifted1039 extends Strategy 
{ 
  TermReference d_11977;

  TermReference c_11977;

  Strategy j_11977;

  Strategy k_11977;

  Strategy l_11977;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail5696:
    { 
      IStrategoTerm term2845 = term;
      Success3084:
      { 
        Fail5697:
        { 
          term = index_adjust_import_recurse_3_2.instance.invoke(context, term, j_11977, k_11977, l_11977, d_11977.value, c_11977.value);
          if(term == null)
            break Fail5697;
          if(true)
            break Success3084;
        }
        term = term2845;
        IStrategoTerm o_11977 = null;
        o_11977 = term;
        term = fatal_err_0_1.instance.invoke(context, o_11977, trans.const957);
        if(term == null)
          break Fail5696;
      }
      if(true)
        return term;
    }
    return null;
  }
}