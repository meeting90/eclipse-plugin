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

@SuppressWarnings("all") public class bigbagof_$Current$File_0_0 extends Strategy 
{ 
  public static bigbagof_$Current$File_0_0 instance = new bigbagof_$Current$File_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("bigbagof_CurrentFile_0_0");
    Fail5526:
    { 
      TermReference x_12052 = new TermReference();
      if(x_12052.value == null)
        x_12052.value = term;
      else
        if(x_12052.value != term && !x_12052.value.match(term))
          break Fail5526;
      Success3052:
      { 
        Fail5527:
        { 
          IStrategoTerm a_12053 = null;
          IStrategoTerm c_12053 = null;
          IStrategoTerm d_12053 = null;
          c_12053 = term;
          a_12053 = trans.const999;
          d_12053 = c_12053;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, d_12053, a_12053, trans.constCons250);
          if(term == null)
            break Fail5527;
          if(true)
            break Success3052;
        }
        term = trans.constNil3;
      }
      lifted1187 lifted11870 = new lifted1187();
      lifted11870.x_12052 = x_12052;
      term = filter_1_0.instance.invoke(context, term, lifted11870);
      if(term == null)
        break Fail5526;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}