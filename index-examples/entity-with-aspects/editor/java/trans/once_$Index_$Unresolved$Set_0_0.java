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

@SuppressWarnings("all") public class once_$Index_$Unresolved$Set_0_0 extends Strategy 
{ 
  public static once_$Index_$Unresolved$Set_0_0 instance = new once_$Index_$Unresolved$Set_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("once_Index_UnresolvedSet_0_0");
    Fail2600:
    { 
      IStrategoTerm c_2186 = null;
      TermReference d_2186 = new TermReference();
      TermReference e_2186 = new TermReference();
      IStrategoTerm f_2186 = null;
      IStrategoTerm g_2186 = null;
      IStrategoTerm i_2186 = null;
      IStrategoTerm j_2186 = null;
      IStrategoTerm l_2186 = null;
      IStrategoTerm m_2186 = null;
      if(d_2186.value == null)
        d_2186.value = term;
      else
        if(d_2186.value != term && !d_2186.value.match(term))
          break Fail2600;
      i_2186 = term;
      l_2186 = term;
      j_2186 = trans.const415;
      m_2186 = l_2186;
      term = dr_lookup_rule_pointer_0_2.instance.invoke(context, m_2186, j_2186, trans.constCons118);
      if(term == null)
        break Fail2600;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 3)
        break Fail2600;
      c_2186 = term.getSubterm(0);
      g_2186 = term.getSubterm(1);
      f_2186 = term.getSubterm(2);
      term = c_2186;
      lifted579 lifted5790 = new lifted579();
      lifted5790.d_2186 = d_2186;
      lifted5790.e_2186 = e_2186;
      term = split_fetch_1_0.instance.invoke(context, term, lifted5790);
      if(term == null)
        break Fail2600;
      term = conc_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail2600;
      term = hashtable_put_0_2.instance.invoke(context, f_2186, g_2186, term);
      if(term == null)
        break Fail2600;
      term = i_2186;
      if(e_2186.value == null)
        break Fail2600;
      term = e_2186.value;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}