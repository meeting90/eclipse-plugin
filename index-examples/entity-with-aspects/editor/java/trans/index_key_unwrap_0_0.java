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

@SuppressWarnings("all") public class index_key_unwrap_0_0 extends Strategy 
{ 
  public static index_key_unwrap_0_0 instance = new index_key_unwrap_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("index_key_unwrap_0_0");
    Fail5031:
    { 
      IStrategoTerm term2877 = term;
      Success2847:
      { 
        Fail5032:
        { 
          IStrategoTerm y_11983 = null;
          IStrategoTerm z_11983 = null;
          y_11983 = term;
          IStrategoList annos217 = term.getAnnotations();
          if(annos217.getTermType() != IStrategoTerm.LIST || ((IStrategoList)annos217).isEmpty())
            break Fail5032;
          z_11983 = ((IStrategoList)annos217).head();
          IStrategoTerm arg1550 = ((IStrategoList)annos217).tail();
          if(arg1550.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg1550).isEmpty())
            break Fail5032;
          term = index_uri_unwrap_0_0.instance.invoke(context, z_11983);
          if(term == null)
            break Fail5032;
          term = termFactory.annotateTerm(y_11983, checkListAnnos(termFactory, (IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)trans.constNil3)));
          if(true)
            break Success2847;
        }
        term = term2877;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}