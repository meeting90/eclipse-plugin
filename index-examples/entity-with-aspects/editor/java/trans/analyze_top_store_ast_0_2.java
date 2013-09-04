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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm e_11962, IStrategoTerm f_11962)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("analyze_top_store_ast_0_2");
    Fail4900:
    { 
      IStrategoTerm h_11962 = null;
      IStrategoTerm i_11962 = null;
      IStrategoTerm k_11962 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail4900;
      i_11962 = term.getSubterm(0);
      IStrategoTerm arg1500 = term.getSubterm(1);
      if(arg1500.getTermType() != IStrategoTerm.TUPLE || arg1500.getSubtermCount() != 2)
        break Fail4900;
      h_11962 = arg1500.getSubterm(1);
      k_11962 = term;
      Success2773:
      { 
        Fail4901:
        { 
          IStrategoTerm j_11962 = null;
          j_11962 = term;
          term = h_11962;
          if(term.getTermType() != IStrategoTerm.LIST || !((IStrategoList)term).isEmpty())
            break Fail4901;
          term = j_11962;
          { 
            term = termFactory.makeAppl(Main._consAST_2, new IStrategoTerm[]{termFactory.makeTuple(e_11962, f_11962), i_11962});
            term = index_add_0_1.instance.invoke(context, term, f_11962);
            if(term == null)
              break Fail4900;
            if(true)
              break Success2773;
          }
        }
        term = termFactory.makeAppl(Main._consAST_2, new IStrategoTerm[]{termFactory.makeTuple(e_11962, h_11962), i_11962});
        term = index_add_0_1.instance.invoke(context, term, f_11962);
        if(term == null)
          break Fail4900;
      }
      term = k_11962;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}