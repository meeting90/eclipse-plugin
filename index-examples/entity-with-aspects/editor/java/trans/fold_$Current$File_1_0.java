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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy w_2188)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("fold_CurrentFile_1_0");
    Fail2618:
    { 
      IStrategoTerm x_2188 = null;
      IStrategoTerm z_2188 = null;
      z_2188 = term;
      Success1493:
      { 
        Fail2619:
        { 
          IStrategoTerm a_2189 = null;
          IStrategoTerm c_2189 = null;
          IStrategoTerm d_2189 = null;
          c_2189 = term;
          a_2189 = trans.const479;
          d_2189 = c_2189;
          term = dr_lookup_rule_0_2.instance.invoke(context, d_2189, a_2189, trans.constCons118);
          if(term == null)
            break Fail2619;
          if(true)
            break Success1493;
        }
        term = trans.constNil1;
      }
      x_2188 = term;
      term = z_2188;
      term = termFactory.makeTuple(x_2188, term);
      term = w_2188.invoke(context, term, lifted584.instance);
      if(term == null)
        break Fail2618;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}