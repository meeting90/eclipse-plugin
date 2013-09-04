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
    Fail5553:
    { 
      IStrategoTerm d_12057 = null;
      TermReference e_12057 = new TermReference();
      TermReference f_12057 = new TermReference();
      TermReference g_12057 = new TermReference();
      IStrategoTerm h_12057 = null;
      IStrategoTerm i_12057 = null;
      IStrategoTerm k_12057 = null;
      IStrategoTerm m_12057 = null;
      if(f_12057.value == null)
        f_12057.value = term;
      else
        if(f_12057.value != term && !f_12057.value.match(term))
          break Fail5553;
      if(e_12057.value == null)
        e_12057.value = term;
      else
        if(e_12057.value != term && !e_12057.value.match(term))
          break Fail5553;
      k_12057 = term;
      m_12057 = term;
      term = dr_lookup_rule_pointer_0_2.instance.invoke(context, m_12057, trans.const1001, f_12057.value);
      if(term == null)
        break Fail5553;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 3)
        break Fail5553;
      d_12057 = term.getSubterm(0);
      i_12057 = term.getSubterm(1);
      h_12057 = term.getSubterm(2);
      term = d_12057;
      lifted1196 lifted11960 = new lifted1196();
      lifted11960.e_12057 = e_12057;
      lifted11960.f_12057 = f_12057;
      lifted11960.g_12057 = g_12057;
      term = split_fetch_1_0.instance.invoke(context, term, lifted11960);
      if(term == null)
        break Fail5553;
      term = conc_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail5553;
      term = hashtable_put_0_2.instance.invoke(context, h_12057, i_12057, term);
      if(term == null)
        break Fail5553;
      term = k_12057;
      if(g_12057.value == null)
        break Fail5553;
      term = g_12057.value;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}