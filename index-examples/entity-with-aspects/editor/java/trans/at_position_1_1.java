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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy i_12059, IStrategoTerm j_12059)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("at_position_1_1");
    Fail5247:
    { 
      IStrategoTerm term2979 = term;
      Success2931:
      { 
        Fail5248:
        { 
          IStrategoTerm n_12015 = null;
          TermReference o_12015 = new TermReference();
          IStrategoTerm p_12015 = null;
          IStrategoTerm q_12015 = null;
          IStrategoTerm t_12015 = null;
          IStrategoTerm v_12015 = null;
          IStrategoTerm w_12015 = null;
          IStrategoTerm cons114 = context.invokePrimitive("SSL_get_constructor", term, NO_STRATEGIES, new IStrategoTerm[]{term});
          n_12015 = cons114;
          IStrategoTerm args39 = context.invokePrimitive("SSL_get_arguments", term, NO_STRATEGIES, new IStrategoTerm[]{term});
          q_12015 = args39;
          t_12015 = term;
          term = j_12059;
          if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
            break Fail5248;
          p_12015 = ((IStrategoList)term).head();
          if(o_12015.value == null)
            o_12015.value = ((IStrategoList)term).tail();
          else
            if(o_12015.value != ((IStrategoList)term).tail() && !o_12015.value.match(((IStrategoList)term).tail()))
              break Fail5248;
          term = t_12015;
          w_12015 = term;
          term = termFactory.makeTuple(p_12015, q_12015);
          lifted1137 lifted11370 = new lifted1137();
          lifted11370.i_12059 = i_12059;
          lifted11370.o_12015 = o_12015;
          term = at_index_1_0.instance.invoke(context, term, lifted11370);
          if(term == null)
            break Fail5248;
          v_12015 = term;
          term = w_12015;
          IStrategoTerm mkterm7;
          mkterm7 = context.invokePrimitive("SSL_mkterm", term, NO_STRATEGIES, new IStrategoTerm[]{n_12015, v_12015});
          if(mkterm7 == null)
            break Fail5248;
          term = mkterm7;
          if(true)
            break Success2931;
        }
        term = term2979;
        IStrategoTerm i_12015 = null;
        i_12015 = term;
        term = j_12059;
        if(term.getTermType() != IStrategoTerm.LIST || !((IStrategoList)term).isEmpty())
          break Fail5247;
        term = i_12059.invoke(context, i_12015);
        if(term == null)
          break Fail5247;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}