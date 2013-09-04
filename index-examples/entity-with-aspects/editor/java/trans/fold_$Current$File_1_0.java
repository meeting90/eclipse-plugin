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

@SuppressWarnings("all") public class fold_$Current$File_1_0 extends Strategy 
{ 
  public static fold_$Current$File_1_0 instance = new fold_$Current$File_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy r_12051)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("fold_CurrentFile_1_0");
    Fail5520:
    { 
      IStrategoTerm s_12051 = null;
      IStrategoTerm u_12051 = null;
      u_12051 = term;
      Success3049:
      { 
        Fail5521:
        { 
          IStrategoTerm v_12051 = null;
          IStrategoTerm x_12051 = null;
          IStrategoTerm y_12051 = null;
          x_12051 = term;
          v_12051 = trans.const999;
          y_12051 = x_12051;
          term = dr_lookup_rule_0_2.instance.invoke(context, y_12051, v_12051, trans.constCons250);
          if(term == null)
            break Fail5521;
          if(true)
            break Success3049;
        }
        term = trans.constNil3;
      }
      s_12051 = term;
      term = u_12051;
      term = termFactory.makeTuple(s_12051, term);
      term = r_12051.invoke(context, term, lifted1184.instance);
      if(term == null)
        break Fail5520;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}