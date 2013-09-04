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

@SuppressWarnings("all") final class lifted1106 extends Strategy 
{ 
  public static final lifted1106 instance = new lifted1106();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail5653:
    { 
      IStrategoTerm k_11996 = null;
      IStrategoTerm m_11996 = null;
      IStrategoTerm p_11996 = null;
      term = $Fst_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail5653;
      m_11996 = term;
      term = project_path_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail5653;
      term = termFactory.makeTuple(term, trans.const932);
      term = conc_strings_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail5653;
      k_11996 = term;
      p_11996 = m_11996;
      term = string_replace_0_2.instance.invoke(context, p_11996, k_11996, trans.const829);
      if(term == null)
        break Fail5653;
      if(true)
        return term;
    }
    return null;
  }
}