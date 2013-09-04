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
    Fail5528:
    { 
      IStrategoTerm e_12053 = null;
      TermReference f_12053 = new TermReference();
      TermReference g_12053 = new TermReference();
      IStrategoTerm h_12053 = null;
      IStrategoTerm i_12053 = null;
      IStrategoTerm k_12053 = null;
      IStrategoTerm l_12053 = null;
      IStrategoTerm n_12053 = null;
      IStrategoTerm o_12053 = null;
      if(f_12053.value == null)
        f_12053.value = term;
      else
        if(f_12053.value != term && !f_12053.value.match(term))
          break Fail5528;
      k_12053 = term;
      n_12053 = term;
      l_12053 = trans.const999;
      o_12053 = n_12053;
      term = dr_lookup_rule_pointer_0_2.instance.invoke(context, o_12053, l_12053, trans.constCons250);
      if(term == null)
        break Fail5528;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 3)
        break Fail5528;
      e_12053 = term.getSubterm(0);
      i_12053 = term.getSubterm(1);
      h_12053 = term.getSubterm(2);
      term = e_12053;
      lifted1188 lifted11880 = new lifted1188();
      lifted11880.f_12053 = f_12053;
      lifted11880.g_12053 = g_12053;
      term = split_fetch_1_0.instance.invoke(context, term, lifted11880);
      if(term == null)
        break Fail5528;
      term = conc_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail5528;
      term = hashtable_put_0_2.instance.invoke(context, h_12053, i_12053, term);
      if(term == null)
        break Fail5528;
      term = k_12053;
      if(g_12053.value == null)
        break Fail5528;
      term = g_12053.value;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}