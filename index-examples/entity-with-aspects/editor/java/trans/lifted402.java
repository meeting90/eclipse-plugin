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

@SuppressWarnings("all") final class lifted402 extends Strategy 
{ 
  TermReference t_2093;

  TermReference v_2093;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail2819:
    { 
      term = analyze_top_store_ast_0_2.instance.invoke(context, term, t_2093.value, v_2093.value);
      if(term == null)
        break Fail2819;
      if(true)
        return term;
    }
    return null;
  }
}