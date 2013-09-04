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

@SuppressWarnings("all") public class store_index_data_results_0_1 extends Strategy 
{ 
  public static store_index_data_results_0_1 instance = new store_index_data_results_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm m_11968)
  { 
    context.push("store_index_data_results_0_1");
    Fail4928:
    { 
      IStrategoTerm n_11968 = null;
      IStrategoTerm p_11968 = null;
      n_11968 = term;
      p_11968 = term;
      Success2790:
      { 
        Fail4929:
        { 
          IStrategoTerm o_11968 = null;
          o_11968 = term;
          term = is_list_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail4929;
          term = o_11968;
          { 
            term = iset_addlist_0_1.instance.invoke(context, m_11968, n_11968);
            if(term == null)
              break Fail4928;
            if(true)
              break Success2790;
          }
        }
        term = iset_add_0_1.instance.invoke(context, m_11968, n_11968);
        if(term == null)
          break Fail4928;
      }
      term = p_11968;
      if(true)
        break Fail4928;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}