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

@SuppressWarnings("all") public class ast_uri_to_ast_file_0_1 extends Strategy 
{ 
  public static ast_uri_to_ast_file_0_1 instance = new ast_uri_to_ast_file_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm d_2119)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail2114:
    { 
      IStrategoTerm e_2119 = null;
      IStrategoTerm f_2119 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail2114;
      e_2119 = term.getSubterm(0);
      f_2119 = term.getSubterm(1);
      term = termFactory.makeTuple(e_2119, termFactory.makeTuple(d_2119, f_2119));
      if(true)
        return term;
    }
    context.push("ast_uri_to_ast_file_0_1");
    context.popOnFailure();
    return null;
  }
}