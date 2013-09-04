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

@SuppressWarnings("all") public class at_position_1_1 extends Strategy 
{ 
  public static at_position_1_1 instance = new at_position_1_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy n_2196, IStrategoTerm o_2196)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("at_position_1_1");
    Fail2345:
    { 
      IStrategoTerm term1423 = term;
      Success1375:
      { 
        Fail2346:
        { 
          IStrategoTerm s_2152 = null;
          TermReference t_2152 = new TermReference();
          IStrategoTerm u_2152 = null;
          IStrategoTerm v_2152 = null;
          IStrategoTerm y_2152 = null;
          IStrategoTerm a_2153 = null;
          IStrategoTerm b_2153 = null;
          IStrategoTerm cons42 = context.invokePrimitive("SSL_get_constructor", term, NO_STRATEGIES, new IStrategoTerm[]{term});
          s_2152 = cons42;
          IStrategoTerm args17 = context.invokePrimitive("SSL_get_arguments", term, NO_STRATEGIES, new IStrategoTerm[]{term});
          v_2152 = args17;
          y_2152 = term;
          term = o_2196;
          if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
            break Fail2346;
          u_2152 = ((IStrategoList)term).head();
          if(t_2152.value == null)
            t_2152.value = ((IStrategoList)term).tail();
          else
            if(t_2152.value != ((IStrategoList)term).tail() && !t_2152.value.match(((IStrategoList)term).tail()))
              break Fail2346;
          term = y_2152;
          b_2153 = term;
          term = termFactory.makeTuple(u_2152, v_2152);
          lifted537 lifted5370 = new lifted537();
          lifted5370.n_2196 = n_2196;
          lifted5370.t_2152 = t_2152;
          term = at_index_1_0.instance.invoke(context, term, lifted5370);
          if(term == null)
            break Fail2346;
          a_2153 = term;
          term = b_2153;
          IStrategoTerm mkterm3;
          mkterm3 = context.invokePrimitive("SSL_mkterm", term, NO_STRATEGIES, new IStrategoTerm[]{s_2152, a_2153});
          if(mkterm3 == null)
            break Fail2346;
          term = mkterm3;
          if(true)
            break Success1375;
        }
        term = term1423;
        IStrategoTerm n_2152 = null;
        n_2152 = term;
        term = o_2196;
        if(term.getTermType() != IStrategoTerm.LIST || !((IStrategoList)term).isEmpty())
          break Fail2345;
        term = n_2196.invoke(context, n_2152);
        if(term == null)
          break Fail2345;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}