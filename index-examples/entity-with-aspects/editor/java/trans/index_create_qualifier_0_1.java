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

@SuppressWarnings("all") public class index_create_qualifier_0_1 extends Strategy 
{ 
  public static index_create_qualifier_0_1 instance = new index_create_qualifier_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm y_2195)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1569:
    { 
      IStrategoTerm o_2036 = null;
      IStrategoTerm r_2036 = null;
      IStrategoTerm s_2036 = null;
      IStrategoTerm p_2036 = null;
      IStrategoTerm t_2036 = null;
      IStrategoTerm u_2036 = null;
      r_2036 = term;
      term = y_2195;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consModule_3 != ((IStrategoAppl)term).getConstructor())
        break Fail1569;
      s_2036 = term.getSubterm(0);
      o_2036 = s_2036;
      t_2036 = r_2036;
      term = y_2195;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consModule_3 != ((IStrategoAppl)term).getConstructor())
        break Fail1569;
      u_2036 = term.getSubterm(1);
      p_2036 = u_2036;
      term = t_2036;
      term = termFactory.makeAppl(Main._consModule_3, new IStrategoTerm[]{o_2036, p_2036, (IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)trans.constNil1)});
      if(true)
        return term;
    }
    context.push("index_create_qualifier_0_1");
    context.popOnFailure();
    return null;
  }
}