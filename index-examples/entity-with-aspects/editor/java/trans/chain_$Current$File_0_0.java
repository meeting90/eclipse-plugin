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
    Fail2622:
    { 
      IStrategoTerm t_2189 = null;
      IStrategoTerm v_2189 = null;
      v_2189 = term;
      Success1495:
      { 
        Fail2623:
        { 
          IStrategoTerm w_2189 = null;
          IStrategoTerm y_2189 = null;
          IStrategoTerm z_2189 = null;
          y_2189 = term;
          w_2189 = trans.const479;
          z_2189 = y_2189;
          term = dr_lookup_rule_0_2.instance.invoke(context, z_2189, w_2189, trans.constCons118);
          if(term == null)
            break Fail2623;
          if(true)
            break Success1495;
        }
        term = trans.constNil1;
      }
      t_2189 = term;
      term = v_2189;
      term = termFactory.makeTuple(t_2189, term);
      term = foldl_1_0.instance.invoke(context, term, lifted586.instance);
      if(term == null)
        break Fail2622;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}