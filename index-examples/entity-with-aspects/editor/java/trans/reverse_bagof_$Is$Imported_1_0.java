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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy v_2194)
  { 
    context.push("reverse_bagof_IsImported_1_0");
    Fail2652:
    { 
      TermReference s_2194 = new TermReference();
      TermReference t_2194 = new TermReference();
      if(t_2194.value == null)
        t_2194.value = term;
      else
        if(t_2194.value != term && !t_2194.value.match(term))
          break Fail2652;
      if(s_2194.value == null)
        s_2194.value = term;
      else
        if(s_2194.value != term && !s_2194.value.match(term))
          break Fail2652;
      Success1504:
      { 
        Fail2653:
        { 
          IStrategoTerm y_2194 = null;
          y_2194 = term;
          term = dr_lookup_rule_0_2.instance.invoke(context, y_2194, trans.const481, t_2194.value);
          if(term == null)
            break Fail2653;
          if(true)
            break Success1504;
        }
        term = trans.constNil1;
      }
      lifted597 lifted5970 = new lifted597();
      lifted5970.s_2194 = s_2194;
      lifted5970.t_2194 = t_2194;
      term = reverse_filter_2_0.instance.invoke(context, term, lifted5970, v_2194);
      if(term == null)
        break Fail2652;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}