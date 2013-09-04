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

@SuppressWarnings("all") public class import_values_0_2 extends Strategy 
{ 
  public static import_values_0_2 instance = new import_values_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm p_11943, IStrategoTerm q_11943)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("import_values_0_2");
    Fail4815:
    { 
      IStrategoList list128;
      list128 = checkListTail(q_11943);
      if(list128 == null)
        break Fail4815;
      term = termFactory.makeAppl(Main._consDefData_3, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(p_11943, list128), trans.constImport0, trans.const882});
      term = index_get_all_values_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail4815;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}