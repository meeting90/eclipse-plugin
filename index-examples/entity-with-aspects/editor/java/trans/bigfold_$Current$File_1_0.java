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

@SuppressWarnings("all") public class bigfold_$Current$File_1_0 extends Strategy 
{ 
  public static bigfold_$Current$File_1_0 instance = new bigfold_$Current$File_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy k_2188)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("bigfold_CurrentFile_1_0");
    Fail2616:
    { 
      IStrategoTerm l_2188 = null;
      IStrategoTerm n_2188 = null;
      n_2188 = term;
      Success1492:
      { 
        Fail2617:
        { 
          IStrategoTerm o_2188 = null;
          IStrategoTerm q_2188 = null;
          IStrategoTerm r_2188 = null;
          q_2188 = term;
          o_2188 = trans.const479;
          r_2188 = q_2188;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, r_2188, o_2188, trans.constCons118);
          if(term == null)
            break Fail2617;
          if(true)
            break Success1492;
        }
        term = trans.constNil1;
      }
      l_2188 = term;
      term = n_2188;
      term = termFactory.makeTuple(l_2188, term);
      term = k_2188.invoke(context, term, lifted583.instance);
      if(term == null)
        break Fail2616;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}