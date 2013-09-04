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

@SuppressWarnings("all") public class reverse_bagof_$Current$File_1_0 extends Strategy 
{ 
  public static reverse_bagof_$Current$File_1_0 instance = new reverse_bagof_$Current$File_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy r_12053)
  { 
    context.push("reverse_bagof_CurrentFile_1_0");
    Fail5529:
    { 
      TermReference p_12053 = new TermReference();
      if(p_12053.value == null)
        p_12053.value = term;
      else
        if(p_12053.value != term && !p_12053.value.match(term))
          break Fail5529;
      Success3053:
      { 
        Fail5530:
        { 
          IStrategoTerm t_12053 = null;
          IStrategoTerm v_12053 = null;
          IStrategoTerm w_12053 = null;
          v_12053 = term;
          t_12053 = trans.const999;
          w_12053 = v_12053;
          term = dr_lookup_rule_0_2.instance.invoke(context, w_12053, t_12053, trans.constCons250);
          if(term == null)
            break Fail5530;
          if(true)
            break Success3053;
        }
        term = trans.constNil3;
      }
      lifted1189 lifted11890 = new lifted1189();
      lifted11890.p_12053 = p_12053;
      term = reverse_filter_2_0.instance.invoke(context, term, lifted11890, r_12053);
      if(term == null)
        break Fail5529;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}