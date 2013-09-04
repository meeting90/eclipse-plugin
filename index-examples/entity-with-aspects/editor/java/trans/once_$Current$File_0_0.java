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

@SuppressWarnings("all") public class once_$Current$File_0_0 extends Strategy 
{ 
  public static once_$Current$File_0_0 instance = new once_$Current$File_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("once_CurrentFile_0_0");
    Fail2626:
    { 
      IStrategoTerm j_2190 = null;
      TermReference k_2190 = new TermReference();
      TermReference l_2190 = new TermReference();
      IStrategoTerm m_2190 = null;
      IStrategoTerm n_2190 = null;
      IStrategoTerm p_2190 = null;
      IStrategoTerm q_2190 = null;
      IStrategoTerm s_2190 = null;
      IStrategoTerm t_2190 = null;
      if(k_2190.value == null)
        k_2190.value = term;
      else
        if(k_2190.value != term && !k_2190.value.match(term))
          break Fail2626;
      p_2190 = term;
      s_2190 = term;
      q_2190 = trans.const479;
      t_2190 = s_2190;
      term = dr_lookup_rule_pointer_0_2.instance.invoke(context, t_2190, q_2190, trans.constCons118);
      if(term == null)
        break Fail2626;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 3)
        break Fail2626;
      j_2190 = term.getSubterm(0);
      n_2190 = term.getSubterm(1);
      m_2190 = term.getSubterm(2);
      term = j_2190;
      lifted588 lifted5880 = new lifted588();
      lifted5880.k_2190 = k_2190;
      lifted5880.l_2190 = l_2190;
      term = split_fetch_1_0.instance.invoke(context, term, lifted5880);
      if(term == null)
        break Fail2626;
      term = conc_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail2626;
      term = hashtable_put_0_2.instance.invoke(context, m_2190, n_2190, term);
      if(term == null)
        break Fail2626;
      term = p_2190;
      if(l_2190.value == null)
        break Fail2626;
      term = l_2190.value;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}