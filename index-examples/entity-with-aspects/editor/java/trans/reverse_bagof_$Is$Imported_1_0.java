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

@SuppressWarnings("all") public class reverse_bagof_$Is$Imported_1_0 extends Strategy 
{ 
  public static reverse_bagof_$Is$Imported_1_0 instance = new reverse_bagof_$Is$Imported_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy q_12057)
  { 
    context.push("reverse_bagof_IsImported_1_0");
    Fail5554:
    { 
      TermReference n_12057 = new TermReference();
      TermReference o_12057 = new TermReference();
      if(o_12057.value == null)
        o_12057.value = term;
      else
        if(o_12057.value != term && !o_12057.value.match(term))
          break Fail5554;
      if(n_12057.value == null)
        n_12057.value = term;
      else
        if(n_12057.value != term && !n_12057.value.match(term))
          break Fail5554;
      Success3060:
      { 
        Fail5555:
        { 
          IStrategoTerm t_12057 = null;
          t_12057 = term;
          term = dr_lookup_rule_0_2.instance.invoke(context, t_12057, trans.const1001, o_12057.value);
          if(term == null)
            break Fail5555;
          if(true)
            break Success3060;
        }
        term = trans.constNil3;
      }
      lifted1197 lifted11970 = new lifted1197();
      lifted11970.n_12057 = n_12057;
      lifted11970.o_12057 = o_12057;
      term = reverse_filter_2_0.instance.invoke(context, term, lifted11970, q_12057);
      if(term == null)
        break Fail5554;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}