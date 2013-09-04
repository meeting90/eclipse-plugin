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

@SuppressWarnings("all") final class lifted554 extends Strategy 
{ 
  public static final lifted554 instance = new lifted554();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail2701:
    { 
      IStrategoTerm i_2165 = null;
      i_2165 = term;
      term = index_get_all_in_file_0_0.instance.invoke(context, i_2165);
      if(term == null)
        break Fail2701;
      term = termFactory.makeTuple(i_2165, term);
      if(true)
        return term;
    }
    return null;
  }
}