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

@SuppressWarnings("all") public class testgen_expression_0_1 extends Strategy 
{ 
  public static testgen_expression_0_1 instance = new testgen_expression_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm x_2047)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("testgen_expression_0_1");
    Fail1617:
    { 
      TermReference y_2047 = new TermReference();
      IStrategoTerm z_2047 = null;
      IStrategoTerm b_2048 = null;
      IStrategoTerm c_2048 = null;
      IStrategoTerm h_2048 = null;
      IStrategoTerm j_2048 = null;
      IStrategoTerm k_2048 = null;
      term = x_2047;
      lifted354 lifted3540 = new lifted354();
      lifted3540.y_2047 = y_2047;
      term = filter_1_0.instance.invoke(context, term, lifted3540);
      if(term == null)
        break Fail1617;
      term = random_list_item_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail1617;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consProperty_2 != ((IStrategoAppl)term).getConstructor())
        break Fail1617;
      b_2048 = term.getSubterm(0);
      z_2047 = term.getSubterm(1);
      term = termFactory.makeAppl(Main._consDef_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(trans.constType0, termFactory.makeListCons(z_2047, termFactory.makeListCons(trans.const299, (IStrategoList)trans.constNil1)))});
      j_2048 = term;
      h_2048 = trans.constProperty0;
      k_2048 = j_2048;
      term = index_get_children_0_2.instance.invoke(context, k_2048, h_2048, trans.const309);
      if(term == null)
        break Fail1617;
      term = random_list_item_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail1617;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consDef_1 != ((IStrategoAppl)term).getConstructor())
        break Fail1617;
      IStrategoTerm arg533 = term.getSubterm(0);
      if(arg533.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg533).isEmpty())
        break Fail1617;
      IStrategoTerm arg535 = ((IStrategoList)arg533).tail();
      if(arg535.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg535).isEmpty())
        break Fail1617;
      c_2048 = ((IStrategoList)arg535).head();
      term = termFactory.makeAppl(Main._consPropAccess_2, new IStrategoTerm[]{termFactory.makeAppl(Main._consVar_1, new IStrategoTerm[]{b_2048}), c_2048});
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}