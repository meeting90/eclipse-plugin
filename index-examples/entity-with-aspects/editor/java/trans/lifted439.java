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

@SuppressWarnings("all") final class lifted439 extends Strategy 
{ 
  TermReference i_2114;

  TermReference h_2114;

  Strategy o_2114;

  Strategy p_2114;

  Strategy q_2114;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail2794:
    { 
      IStrategoTerm term1289 = term;
      Success1528:
      { 
        Fail2795:
        { 
          term = index_adjust_import_recurse_3_2.instance.invoke(context, term, o_2114, p_2114, q_2114, i_2114.value, h_2114.value);
          if(term == null)
            break Fail2795;
          if(true)
            break Success1528;
        }
        term = term1289;
        IStrategoTerm t_2114 = null;
        t_2114 = term;
        term = fatal_err_0_1.instance.invoke(context, t_2114, trans.const437);
        if(term == null)
          break Fail2794;
      }
      if(true)
        return term;
    }
    return null;
  }
}