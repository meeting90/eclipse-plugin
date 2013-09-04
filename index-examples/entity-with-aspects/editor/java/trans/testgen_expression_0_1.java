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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm s_11910)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("testgen_expression_0_1");
    Fail4519:
    { 
      TermReference t_11910 = new TermReference();
      IStrategoTerm u_11910 = null;
      IStrategoTerm w_11910 = null;
      IStrategoTerm x_11910 = null;
      IStrategoTerm c_11911 = null;
      IStrategoTerm e_11911 = null;
      IStrategoTerm f_11911 = null;
      term = s_11910;
      lifted954 lifted9540 = new lifted954();
      lifted9540.t_11910 = t_11910;
      term = filter_1_0.instance.invoke(context, term, lifted9540);
      if(term == null)
        break Fail4519;
      term = random_list_item_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail4519;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consProperty_2 != ((IStrategoAppl)term).getConstructor())
        break Fail4519;
      w_11910 = term.getSubterm(0);
      u_11910 = term.getSubterm(1);
      term = termFactory.makeAppl(Main._consDef_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(trans.constType0, termFactory.makeListCons(u_11910, termFactory.makeListCons(trans.const819, (IStrategoList)trans.constNil3)))});
      e_11911 = term;
      c_11911 = trans.constProperty0;
      f_11911 = e_11911;
      term = index_get_children_0_2.instance.invoke(context, f_11911, c_11911, trans.const829);
      if(term == null)
        break Fail4519;
      term = random_list_item_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail4519;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consDef_1 != ((IStrategoAppl)term).getConstructor())
        break Fail4519;
      IStrategoTerm arg1387 = term.getSubterm(0);
      if(arg1387.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg1387).isEmpty())
        break Fail4519;
      IStrategoTerm arg1389 = ((IStrategoList)arg1387).tail();
      if(arg1389.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg1389).isEmpty())
        break Fail4519;
      x_11910 = ((IStrategoList)arg1389).head();
      term = termFactory.makeAppl(Main._consPropAccess_2, new IStrategoTerm[]{termFactory.makeAppl(Main._consVar_1, new IStrategoTerm[]{w_11910}), x_11910});
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}