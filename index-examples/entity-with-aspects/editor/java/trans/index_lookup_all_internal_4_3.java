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

@SuppressWarnings("all") public class index_lookup_all_internal_4_3 extends Strategy 
{ 
  public static index_lookup_all_internal_4_3 instance = new index_lookup_all_internal_4_3();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy w_2112, Strategy x_2112, Strategy y_2112, Strategy z_2112, IStrategoTerm n_2112, IStrategoTerm o_2112, IStrategoTerm p_2112)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("index_lookup_all_internal_4_3");
    Fail2066:
    { 
      IStrategoTerm q_2112 = null;
      IStrategoTerm r_2112 = null;
      IStrategoTerm t_2112 = null;
      IStrategoTerm u_2112 = null;
      r_2112 = term;
      term = index_lookup_all_scoped_internal_4_3.instance.invoke(context, r_2112, w_2112, x_2112, y_2112, z_2112, n_2112, o_2112, p_2112);
      if(term == null)
        break Fail2066;
      t_2112 = term;
      Success1257:
      { 
        Fail2067:
        { 
          IStrategoTerm v_2112 = null;
          v_2112 = term;
          term = o_2112;
          if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
            break Fail2067;
          q_2112 = ((IStrategoList)term).tail();
          term = v_2112;
          { 
            term = this.invoke(context, r_2112, w_2112, x_2112, y_2112, z_2112, n_2112, q_2112, p_2112);
            if(term == null)
              break Fail2066;
            term = termFactory.makeTuple(t_2112, term);
            term = conc_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail2066;
            u_2112 = term;
            if(true)
              break Success1257;
          }
        }
        term = t_2112;
        u_2112 = t_2112;
      }
      term = u_2112;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}