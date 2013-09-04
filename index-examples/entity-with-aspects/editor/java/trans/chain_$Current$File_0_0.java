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

@SuppressWarnings("all") public class chain_$Current$File_0_0 extends Strategy 
{ 
  public static chain_$Current$File_0_0 instance = new chain_$Current$File_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("chain_CurrentFile_0_0");
    Fail5524:
    { 
      IStrategoTerm o_12052 = null;
      IStrategoTerm q_12052 = null;
      q_12052 = term;
      Success3051:
      { 
        Fail5525:
        { 
          IStrategoTerm r_12052 = null;
          IStrategoTerm t_12052 = null;
          IStrategoTerm u_12052 = null;
          t_12052 = term;
          r_12052 = trans.const999;
          u_12052 = t_12052;
          term = dr_lookup_rule_0_2.instance.invoke(context, u_12052, r_12052, trans.constCons250);
          if(term == null)
            break Fail5525;
          if(true)
            break Success3051;
        }
        term = trans.constNil3;
      }
      o_12052 = term;
      term = q_12052;
      term = termFactory.makeTuple(o_12052, term);
      term = foldl_1_0.instance.invoke(context, term, lifted1186.instance);
      if(term == null)
        break Fail5524;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}