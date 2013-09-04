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

@SuppressWarnings("all") public class bigchain_$Current$File_0_0 extends Strategy 
{ 
  public static bigchain_$Current$File_0_0 instance = new bigchain_$Current$File_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("bigchain_CurrentFile_0_0");
    Fail5522:
    { 
      IStrategoTerm d_12052 = null;
      IStrategoTerm f_12052 = null;
      f_12052 = term;
      Success3050:
      { 
        Fail5523:
        { 
          IStrategoTerm g_12052 = null;
          IStrategoTerm i_12052 = null;
          IStrategoTerm j_12052 = null;
          i_12052 = term;
          g_12052 = trans.const999;
          j_12052 = i_12052;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, j_12052, g_12052, trans.constCons250);
          if(term == null)
            break Fail5523;
          if(true)
            break Success3050;
        }
        term = trans.constNil3;
      }
      d_12052 = term;
      term = f_12052;
      term = termFactory.makeTuple(d_12052, term);
      term = foldl_1_0.instance.invoke(context, term, lifted1185.instance);
      if(term == null)
        break Fail5522;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}