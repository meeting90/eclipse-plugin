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

@SuppressWarnings("all") public class bigbagof_$Current$File_0_0 extends Strategy 
{ 
  public static bigbagof_$Current$File_0_0 instance = new bigbagof_$Current$File_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("bigbagof_CurrentFile_0_0");
    Fail2624:
    { 
      TermReference c_2190 = new TermReference();
      if(c_2190.value == null)
        c_2190.value = term;
      else
        if(c_2190.value != term && !c_2190.value.match(term))
          break Fail2624;
      Success1496:
      { 
        Fail2625:
        { 
          IStrategoTerm f_2190 = null;
          IStrategoTerm h_2190 = null;
          IStrategoTerm i_2190 = null;
          h_2190 = term;
          f_2190 = trans.const479;
          i_2190 = h_2190;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, i_2190, f_2190, trans.constCons118);
          if(term == null)
            break Fail2625;
          if(true)
            break Success1496;
        }
        term = trans.constNil1;
      }
      lifted587 lifted5870 = new lifted587();
      lifted5870.c_2190 = c_2190;
      term = filter_1_0.instance.invoke(context, term, lifted5870);
      if(term == null)
        break Fail2624;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}