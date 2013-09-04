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
    Fail2478:
    { 
      IStrategoTerm term1524 = term;
      Success1474:
      { 
        Fail2479:
        { 
          TermReference w_2174 = new TermReference();
          IStrategoTerm z_2174 = null;
          IStrategoTerm b_2175 = null;
          IStrategoTerm c_2175 = null;
          if(w_2174.value == null)
            w_2174.value = term;
          else
            if(w_2174.value != term && !w_2174.value.match(term))
              break Fail2479;
          b_2175 = term;
          z_2174 = trans.const479;
          c_2175 = b_2175;
          term = dr_lookup_rule_0_2.instance.invoke(context, c_2175, z_2174, trans.constCons118);
          if(term == null)
            break Fail2479;
          lifted564 lifted5640 = new lifted564();
          lifted5640.w_2174 = w_2174;
          term = fetch_elem_1_0.instance.invoke(context, term, lifted5640);
          if(term == null)
            break Fail2479;
          if(true)
            break Success1474;
        }
        term = term1524;
        if(term.getTermType() != IStrategoTerm.APPL || Main._consCurrentFile_0 != ((IStrategoAppl)term).getConstructor())
          break Fail2478;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}