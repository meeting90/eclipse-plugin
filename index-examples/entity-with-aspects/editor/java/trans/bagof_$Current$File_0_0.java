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

@SuppressWarnings("all") public class bagof_$Current$File_0_0 extends Strategy 
{ 
  public static bagof_$Current$File_0_0 instance = new bagof_$Current$File_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("bagof_CurrentFile_0_0");
    Fail5531:
    { 
      TermReference x_12053 = new TermReference();
      if(x_12053.value == null)
        x_12053.value = term;
      else
        if(x_12053.value != term && !x_12053.value.match(term))
          break Fail5531;
      Success3054:
      { 
        Fail5532:
        { 
          IStrategoTerm a_12054 = null;
          IStrategoTerm c_12054 = null;
          IStrategoTerm d_12054 = null;
          c_12054 = term;
          a_12054 = trans.const999;
          d_12054 = c_12054;
          term = dr_lookup_rule_0_2.instance.invoke(context, d_12054, a_12054, trans.constCons250);
          if(term == null)
            break Fail5532;
          if(true)
            break Success3054;
        }
        term = trans.constNil3;
      }
      lifted1190 lifted11900 = new lifted1190();
      lifted11900.x_12053 = x_12053;
      term = filter_1_0.instance.invoke(context, term, lifted11900);
      if(term == null)
        break Fail5531;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}