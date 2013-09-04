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

@SuppressWarnings("all") final class lifted506 extends Strategy 
{ 
  public static final lifted506 instance = new lifted506();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail2751:
    { 
      IStrategoTerm p_2133 = null;
      IStrategoTerm r_2133 = null;
      IStrategoTerm u_2133 = null;
      term = $Fst_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail2751;
      r_2133 = term;
      term = project_path_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail2751;
      term = termFactory.makeTuple(term, trans.const412);
      term = conc_strings_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail2751;
      p_2133 = term;
      u_2133 = r_2133;
      term = string_replace_0_2.instance.invoke(context, u_2133, p_2133, trans.const309);
      if(term == null)
        break Fail2751;
      if(true)
        return term;
    }
    return null;
  }
}