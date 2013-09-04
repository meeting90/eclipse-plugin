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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm y_11981)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail5016:
    { 
      IStrategoTerm z_11981 = null;
      IStrategoTerm a_11982 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail5016;
      z_11981 = term.getSubterm(0);
      a_11982 = term.getSubterm(1);
      term = termFactory.makeTuple(z_11981, termFactory.makeTuple(y_11981, a_11982));
      if(true)
        return term;
    }
    context.push("ast_uri_to_ast_file_0_1");
    context.popOnFailure();
    return null;
  }
}