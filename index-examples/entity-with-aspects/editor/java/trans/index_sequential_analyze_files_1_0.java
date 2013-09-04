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

@SuppressWarnings("all") public class index_sequential_analyze_files_1_0 extends Strategy 
{ 
  public static index_sequential_analyze_files_1_0 instance = new index_sequential_analyze_files_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy i_11987)
  { 
    context.push("index_sequential_analyze_files_1_0");
    Fail5062:
    { 
      lifted1058 lifted10580 = new lifted1058();
      lifted10580.i_11987 = i_11987;
      term = index_analyze_files_1_0.instance.invoke(context, term, lifted10580);
      if(term == null)
        break Fail5062;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}