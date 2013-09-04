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

@SuppressWarnings("all") public class import_currentfile_values_0_1 extends Strategy 
{ 
  public static import_currentfile_values_0_1 instance = new import_currentfile_values_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm r_11943)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("import_currentfile_values_0_1");
    Fail4816:
    { 
      term = index_get_current_file_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail4816;
      term = index_file_to_string_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail4816;
      term = termFactory.makeAppl(Main._consDefData_3, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(r_11943, termFactory.makeListCons(term, (IStrategoList)trans.constNil3)), trans.constImport0, trans.const882});
      term = index_get_all_values_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail4816;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}