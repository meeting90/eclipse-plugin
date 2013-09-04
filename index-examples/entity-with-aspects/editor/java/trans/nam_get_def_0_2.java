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

@SuppressWarnings("all") public class nam_get_def_0_2 extends Strategy 
{ 
  public static nam_get_def_0_2 instance = new nam_get_def_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm c_11984, IStrategoTerm d_11984)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("nam_get_def_0_2");
    Fail5033:
    { 
      IStrategoTerm e_11984 = null;
      IStrategoTerm f_11984 = null;
      IStrategoTerm g_11984 = null;
      e_11984 = term;
      g_11984 = term;
      term = termFactory.makeTuple(d_11984, c_11984);
      Success2848:
      { 
        Fail5034:
        { 
          term = lookup_p__0_0.instance.invoke(context, term);
          if(term == null)
            break Fail5034;
          if(true)
            break Success2848;
        }
        term = trans.constNil3;
      }
      term = termFactory.makeTuple(e_11984, term);
      term = make$Conc_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail5033;
      f_11984 = term;
      term = g_11984;
      IStrategoList list143;
      list143 = checkListTail(f_11984);
      if(list143 == null)
        break Fail5033;
      term = termFactory.makeAppl(Main._consDef_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(d_11984, list143)});
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}