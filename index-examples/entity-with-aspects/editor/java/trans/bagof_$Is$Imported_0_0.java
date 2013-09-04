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

@SuppressWarnings("all") public class bagof_$Is$Imported_0_0 extends Strategy 
{ 
  public static bagof_$Is$Imported_0_0 instance = new bagof_$Is$Imported_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("bagof_IsImported_0_0");
    Fail5556:
    { 
      TermReference u_12057 = new TermReference();
      TermReference v_12057 = new TermReference();
      if(v_12057.value == null)
        v_12057.value = term;
      else
        if(v_12057.value != term && !v_12057.value.match(term))
          break Fail5556;
      if(u_12057.value == null)
        u_12057.value = term;
      else
        if(u_12057.value != term && !u_12057.value.match(term))
          break Fail5556;
      Success3061:
      { 
        Fail5557:
        { 
          IStrategoTerm z_12057 = null;
          z_12057 = term;
          term = dr_lookup_rule_0_2.instance.invoke(context, z_12057, trans.const1001, v_12057.value);
          if(term == null)
            break Fail5557;
          if(true)
            break Success3061;
        }
        term = trans.constNil3;
      }
      lifted1198 lifted11980 = new lifted1198();
      lifted11980.u_12057 = u_12057;
      lifted11980.v_12057 = v_12057;
      term = filter_1_0.instance.invoke(context, term, lifted11980);
      if(term == null)
        break Fail5556;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}