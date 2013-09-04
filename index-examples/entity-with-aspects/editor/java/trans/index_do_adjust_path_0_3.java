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

@SuppressWarnings("all") public class index_do_adjust_path_0_3 extends Strategy 
{ 
  public static index_do_adjust_path_0_3 instance = new index_do_adjust_path_0_3();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm w_11966, IStrategoTerm x_11966, IStrategoTerm ref_y_11966)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference y_11966 = new TermReference(ref_y_11966);
    context.push("index_do_adjust_path_0_3");
    Fail4918:
    { 
      IStrategoTerm term2811 = term;
      Success2784:
      { 
        Fail4919:
        { 
          lifted1013 lifted10130 = new lifted1013();
          lifted10130.y_11966 = y_11966;
          term = adjust_index_path_1_2.instance.invoke(context, term, lifted10130, w_11966, x_11966);
          if(term == null)
            break Fail4919;
          if(true)
            break Success2784;
        }
        term = term2811;
        if(y_11966.value == null)
          break Fail4918;
        IStrategoList list135;
        list135 = checkListTail(x_11966);
        if(list135 == null)
          break Fail4918;
        term = (IStrategoTerm)termFactory.makeListCons(y_11966.value, list135);
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}