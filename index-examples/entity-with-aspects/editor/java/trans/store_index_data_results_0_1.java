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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm r_2105)
  { 
    context.push("store_index_data_results_0_1");
    Fail2026:
    { 
      IStrategoTerm s_2105 = null;
      IStrategoTerm u_2105 = null;
      s_2105 = term;
      u_2105 = term;
      Success1234:
      { 
        Fail2027:
        { 
          IStrategoTerm t_2105 = null;
          t_2105 = term;
          term = is_list_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2027;
          term = t_2105;
          { 
            term = iset_addlist_0_1.instance.invoke(context, r_2105, s_2105);
            if(term == null)
              break Fail2026;
            if(true)
              break Success1234;
          }
        }
        term = iset_add_0_1.instance.invoke(context, r_2105, s_2105);
        if(term == null)
          break Fail2026;
      }
      term = u_2105;
      if(true)
        break Fail2026;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}