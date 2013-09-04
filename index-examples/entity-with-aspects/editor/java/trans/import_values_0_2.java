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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm u_2080, IStrategoTerm v_2080)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("import_values_0_2");
    Fail1913:
    { 
      IStrategoList list52;
      list52 = checkListTail(v_2080);
      if(list52 == null)
        break Fail1913;
      term = termFactory.makeAppl(Main._consDefData_3, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(u_2080, list52), trans.constImport0, trans.const362});
      term = index_get_all_values_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail1913;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}