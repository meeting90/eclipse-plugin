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

@SuppressWarnings("all") public class once_$Is$Imported_0_0 extends Strategy 
{ 
  public static once_$Is$Imported_0_0 instance = new once_$Is$Imported_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("once_IsImported_0_0");
    Fail2651:
    { 
      IStrategoTerm i_2194 = null;
      TermReference j_2194 = new TermReference();
      TermReference k_2194 = new TermReference();
      TermReference l_2194 = new TermReference();
      IStrategoTerm m_2194 = null;
      IStrategoTerm n_2194 = null;
      IStrategoTerm p_2194 = null;
      IStrategoTerm r_2194 = null;
      if(k_2194.value == null)
        k_2194.value = term;
      else
        if(k_2194.value != term && !k_2194.value.match(term))
          break Fail2651;
      if(j_2194.value == null)
        j_2194.value = term;
      else
        if(j_2194.value != term && !j_2194.value.match(term))
          break Fail2651;
      p_2194 = term;
      r_2194 = term;
      term = dr_lookup_rule_pointer_0_2.instance.invoke(context, r_2194, trans.const481, k_2194.value);
      if(term == null)
        break Fail2651;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 3)
        break Fail2651;
      i_2194 = term.getSubterm(0);
      n_2194 = term.getSubterm(1);
      m_2194 = term.getSubterm(2);
      term = i_2194;
      lifted596 lifted5960 = new lifted596();
      lifted5960.j_2194 = j_2194;
      lifted5960.k_2194 = k_2194;
      lifted5960.l_2194 = l_2194;
      term = split_fetch_1_0.instance.invoke(context, term, lifted5960);
      if(term == null)
        break Fail2651;
      term = conc_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail2651;
      term = hashtable_put_0_2.instance.invoke(context, m_2194, n_2194, term);
      if(term == null)
        break Fail2651;
      term = p_2194;
      if(l_2194.value == null)
        break Fail2651;
      term = l_2194.value;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}