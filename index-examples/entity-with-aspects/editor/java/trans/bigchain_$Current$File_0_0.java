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
    Fail2620:
    { 
      IStrategoTerm i_2189 = null;
      IStrategoTerm k_2189 = null;
      k_2189 = term;
      Success1494:
      { 
        Fail2621:
        { 
          IStrategoTerm l_2189 = null;
          IStrategoTerm n_2189 = null;
          IStrategoTerm o_2189 = null;
          n_2189 = term;
          l_2189 = trans.const479;
          o_2189 = n_2189;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, o_2189, l_2189, trans.constCons118);
          if(term == null)
            break Fail2621;
          if(true)
            break Success1494;
        }
        term = trans.constNil1;
      }
      i_2189 = term;
      term = k_2189;
      term = termFactory.makeTuple(i_2189, term);
      term = foldl_1_0.instance.invoke(context, term, lifted585.instance);
      if(term == null)
        break Fail2620;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}