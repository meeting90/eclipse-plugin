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

@SuppressWarnings("all") public class adjust_index_path_1_2 extends Strategy 
{ 
  public static adjust_index_path_1_2 instance = new adjust_index_path_1_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy k_11985, IStrategoTerm i_11985, IStrategoTerm j_11985)
  { 
    Fail5048:
    { 
      if(true)
        break Fail5048;
      if(true)
        return term;
    }
    context.push("adjust_index_path_1_2");
    context.popOnFailure();
    return null;
  }
}