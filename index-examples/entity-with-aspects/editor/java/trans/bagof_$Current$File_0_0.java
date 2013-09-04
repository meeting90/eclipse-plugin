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

@SuppressWarnings("all") public class bagof_$Current$File_0_0 extends Strategy 
{ 
  public static bagof_$Current$File_0_0 instance = new bagof_$Current$File_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("bagof_CurrentFile_0_0");
    Fail2629:
    { 
      TermReference c_2191 = new TermReference();
      if(c_2191.value == null)
        c_2191.value = term;
      else
        if(c_2191.value != term && !c_2191.value.match(term))
          break Fail2629;
      Success1498:
      { 
        Fail2630:
        { 
          IStrategoTerm f_2191 = null;
          IStrategoTerm h_2191 = null;
          IStrategoTerm i_2191 = null;
          h_2191 = term;
          f_2191 = trans.const479;
          i_2191 = h_2191;
          term = dr_lookup_rule_0_2.instance.invoke(context, i_2191, f_2191, trans.constCons118);
          if(term == null)
            break Fail2630;
          if(true)
            break Success1498;
        }
        term = trans.constNil1;
      }
      lifted590 lifted5900 = new lifted590();
      lifted5900.c_2191 = c_2191;
      term = filter_1_0.instance.invoke(context, term, lifted5900);
      if(term == null)
        break Fail2629;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}