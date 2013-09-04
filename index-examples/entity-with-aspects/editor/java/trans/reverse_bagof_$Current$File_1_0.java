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

@SuppressWarnings("all") public class reverse_bagof_$Current$File_1_0 extends Strategy 
{ 
  public static reverse_bagof_$Current$File_1_0 instance = new reverse_bagof_$Current$File_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy w_2190)
  { 
    context.push("reverse_bagof_CurrentFile_1_0");
    Fail2627:
    { 
      TermReference u_2190 = new TermReference();
      if(u_2190.value == null)
        u_2190.value = term;
      else
        if(u_2190.value != term && !u_2190.value.match(term))
          break Fail2627;
      Success1497:
      { 
        Fail2628:
        { 
          IStrategoTerm y_2190 = null;
          IStrategoTerm a_2191 = null;
          IStrategoTerm b_2191 = null;
          a_2191 = term;
          y_2190 = trans.const479;
          b_2191 = a_2191;
          term = dr_lookup_rule_0_2.instance.invoke(context, b_2191, y_2190, trans.constCons118);
          if(term == null)
            break Fail2628;
          if(true)
            break Success1497;
        }
        term = trans.constNil1;
      }
      lifted589 lifted5890 = new lifted589();
      lifted5890.u_2190 = u_2190;
      term = reverse_filter_2_0.instance.invoke(context, term, lifted5890, w_2190);
      if(term == null)
        break Fail2627;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}