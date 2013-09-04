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

@SuppressWarnings("all") public class index_do_adjust_path_0_3 extends Strategy 
{ 
  public static index_do_adjust_path_0_3 instance = new index_do_adjust_path_0_3();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm b_2104, IStrategoTerm c_2104, IStrategoTerm ref_d_2104)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference d_2104 = new TermReference(ref_d_2104);
    context.push("index_do_adjust_path_0_3");
    Fail2016:
    { 
      IStrategoTerm term1255 = term;
      Success1228:
      { 
        Fail2017:
        { 
          lifted413 lifted4130 = new lifted413();
          lifted4130.d_2104 = d_2104;
          term = adjust_index_path_1_2.instance.invoke(context, term, lifted4130, b_2104, c_2104);
          if(term == null)
            break Fail2017;
          if(true)
            break Success1228;
        }
        term = term1255;
        if(d_2104.value == null)
          break Fail2016;
        IStrategoList list59;
        list59 = checkListTail(c_2104);
        if(list59 == null)
          break Fail2016;
        term = (IStrategoTerm)termFactory.makeListCons(d_2104.value, list59);
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}