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

@SuppressWarnings("all") public class $Current$File_0_0 extends Strategy 
{ 
  public static $Current$File_0_0 instance = new $Current$File_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("CurrentFile_0_0");
    Fail5380:
    { 
      IStrategoTerm term3080 = term;
      Success3030:
      { 
        Fail5381:
        { 
          TermReference r_12037 = new TermReference();
          IStrategoTerm u_12037 = null;
          IStrategoTerm w_12037 = null;
          IStrategoTerm x_12037 = null;
          if(r_12037.value == null)
            r_12037.value = term;
          else
            if(r_12037.value != term && !r_12037.value.match(term))
              break Fail5381;
          w_12037 = term;
          u_12037 = trans.const999;
          x_12037 = w_12037;
          term = dr_lookup_rule_0_2.instance.invoke(context, x_12037, u_12037, trans.constCons250);
          if(term == null)
            break Fail5381;
          lifted1164 lifted11640 = new lifted1164();
          lifted11640.r_12037 = r_12037;
          term = fetch_elem_1_0.instance.invoke(context, term, lifted11640);
          if(term == null)
            break Fail5381;
          if(true)
            break Success3030;
        }
        term = term3080;
        if(term.getTermType() != IStrategoTerm.APPL || Main._consCurrentFile_0 != ((IStrategoAppl)term).getConstructor())
          break Fail5380;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}