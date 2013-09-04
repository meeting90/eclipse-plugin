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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy p_2153, IStrategoTerm j_2153)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("position_of_term_1_1");
    Fail2349:
    { 
      IStrategoTerm k_2153 = null;
      IStrategoTerm l_2153 = null;
      IStrategoTerm m_2153 = null;
      IStrategoTerm n_2153 = null;
      if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
        break Fail2349;
      k_2153 = ((IStrategoList)term).head();
      m_2153 = ((IStrategoList)term).tail();
      Success1377:
      { 
        Fail2350:
        { 
          IStrategoTerm o_2153 = null;
          o_2153 = term;
          term = position_of_term_1_0.instance.invoke(context, k_2153, p_2153);
          if(term == null)
            break Fail2350;
          l_2153 = term;
          term = o_2153;
          { 
            IStrategoList list75;
            list75 = checkListTail(l_2153);
            if(list75 == null)
              break Fail2349;
            term = (IStrategoTerm)termFactory.makeListCons(j_2153, list75);
            n_2153 = term;
            if(true)
              break Success1377;
          }
        }
        IStrategoTerm s_2153 = null;
        s_2153 = m_2153;
        term = inc_0_0.instance.invoke(context, j_2153);
        if(term == null)
          break Fail2349;
        term = this.invoke(context, s_2153, p_2153, term);
        if(term == null)
          break Fail2349;
        n_2153 = term;
      }
      term = n_2153;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}