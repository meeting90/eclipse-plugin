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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy r_11975, Strategy s_11975, Strategy t_11975, Strategy u_11975, IStrategoTerm i_11975, IStrategoTerm j_11975, IStrategoTerm k_11975)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("index_lookup_all_internal_4_3");
    Fail4968:
    { 
      IStrategoTerm l_11975 = null;
      IStrategoTerm m_11975 = null;
      IStrategoTerm o_11975 = null;
      IStrategoTerm p_11975 = null;
      m_11975 = term;
      term = index_lookup_all_scoped_internal_4_3.instance.invoke(context, m_11975, r_11975, s_11975, t_11975, u_11975, i_11975, j_11975, k_11975);
      if(term == null)
        break Fail4968;
      o_11975 = term;
      Success2813:
      { 
        Fail4969:
        { 
          IStrategoTerm q_11975 = null;
          q_11975 = term;
          term = j_11975;
          if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
            break Fail4969;
          l_11975 = ((IStrategoList)term).tail();
          term = q_11975;
          { 
            term = this.invoke(context, m_11975, r_11975, s_11975, t_11975, u_11975, i_11975, l_11975, k_11975);
            if(term == null)
              break Fail4968;
            term = termFactory.makeTuple(o_11975, term);
            term = conc_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail4968;
            p_11975 = term;
            if(true)
              break Success2813;
          }
        }
        term = o_11975;
        p_11975 = o_11975;
      }
      term = p_11975;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}