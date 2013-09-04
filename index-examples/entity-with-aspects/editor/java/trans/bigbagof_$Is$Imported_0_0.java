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

@SuppressWarnings("all") public class bigbagof_$Is$Imported_0_0 extends Strategy 
{ 
  public static bigbagof_$Is$Imported_0_0 instance = new bigbagof_$Is$Imported_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("bigbagof_IsImported_0_0");
    Fail2649:
    { 
      TermReference c_2194 = new TermReference();
      TermReference d_2194 = new TermReference();
      if(d_2194.value == null)
        d_2194.value = term;
      else
        if(d_2194.value != term && !d_2194.value.match(term))
          break Fail2649;
      if(c_2194.value == null)
        c_2194.value = term;
      else
        if(c_2194.value != term && !c_2194.value.match(term))
          break Fail2649;
      Success1503:
      { 
        Fail2650:
        { 
          IStrategoTerm h_2194 = null;
          h_2194 = term;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, h_2194, trans.const481, d_2194.value);
          if(term == null)
            break Fail2650;
          if(true)
            break Success1503;
        }
        term = trans.constNil1;
      }
      lifted595 lifted5950 = new lifted595();
      lifted5950.c_2194 = c_2194;
      lifted5950.d_2194 = d_2194;
      term = filter_1_0.instance.invoke(context, term, lifted5950);
      if(term == null)
        break Fail2649;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}