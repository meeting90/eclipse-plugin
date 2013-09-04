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

@SuppressWarnings("all") public class analyze_top_store_ast_0_2 extends Strategy 
{ 
  public static analyze_top_store_ast_0_2 instance = new analyze_top_store_ast_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm j_2099, IStrategoTerm k_2099)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("analyze_top_store_ast_0_2");
    Fail1998:
    { 
      IStrategoTerm m_2099 = null;
      IStrategoTerm n_2099 = null;
      IStrategoTerm p_2099 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail1998;
      n_2099 = term.getSubterm(0);
      IStrategoTerm arg646 = term.getSubterm(1);
      if(arg646.getTermType() != IStrategoTerm.TUPLE || arg646.getSubtermCount() != 2)
        break Fail1998;
      m_2099 = arg646.getSubterm(1);
      p_2099 = term;
      Success1217:
      { 
        Fail1999:
        { 
          IStrategoTerm o_2099 = null;
          o_2099 = term;
          term = m_2099;
          if(term.getTermType() != IStrategoTerm.LIST || !((IStrategoList)term).isEmpty())
            break Fail1999;
          term = o_2099;
          { 
            term = termFactory.makeAppl(Main._consAST_2, new IStrategoTerm[]{termFactory.makeTuple(j_2099, k_2099), n_2099});
            term = index_add_0_1.instance.invoke(context, term, k_2099);
            if(term == null)
              break Fail1998;
            if(true)
              break Success1217;
          }
        }
        term = termFactory.makeAppl(Main._consAST_2, new IStrategoTerm[]{termFactory.makeTuple(j_2099, m_2099), n_2099});
        term = index_add_0_1.instance.invoke(context, term, k_2099);
        if(term == null)
          break Fail1998;
      }
      term = p_2099;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}