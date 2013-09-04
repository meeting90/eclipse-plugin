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

@SuppressWarnings("all") public class position_of_term_1_1 extends Strategy 
{ 
  public static position_of_term_1_1 instance = new position_of_term_1_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy k_12016, IStrategoTerm e_12016)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("position_of_term_1_1");
    Fail5251:
    { 
      IStrategoTerm f_12016 = null;
      IStrategoTerm g_12016 = null;
      IStrategoTerm h_12016 = null;
      IStrategoTerm i_12016 = null;
      if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
        break Fail5251;
      f_12016 = ((IStrategoList)term).head();
      h_12016 = ((IStrategoList)term).tail();
      Success2933:
      { 
        Fail5252:
        { 
          IStrategoTerm j_12016 = null;
          j_12016 = term;
          term = position_of_term_1_0.instance.invoke(context, f_12016, k_12016);
          if(term == null)
            break Fail5252;
          g_12016 = term;
          term = j_12016;
          { 
            IStrategoList list151;
            list151 = checkListTail(g_12016);
            if(list151 == null)
              break Fail5251;
            term = (IStrategoTerm)termFactory.makeListCons(e_12016, list151);
            i_12016 = term;
            if(true)
              break Success2933;
          }
        }
        IStrategoTerm n_12016 = null;
        n_12016 = h_12016;
        term = inc_0_0.instance.invoke(context, e_12016);
        if(term == null)
          break Fail5251;
        term = this.invoke(context, n_12016, k_12016, term);
        if(term == null)
          break Fail5251;
        i_12016 = term;
      }
      term = i_12016;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}