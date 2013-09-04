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
    Fail2129:
    { 
      IStrategoTerm term1321 = term;
      Success1291:
      { 
        Fail2130:
        { 
          IStrategoTerm d_2121 = null;
          IStrategoTerm e_2121 = null;
          d_2121 = term;
          IStrategoList annos79 = term.getAnnotations();
          if(annos79.getTermType() != IStrategoTerm.LIST || ((IStrategoList)annos79).isEmpty())
            break Fail2130;
          e_2121 = ((IStrategoList)annos79).head();
          IStrategoTerm arg696 = ((IStrategoList)annos79).tail();
          if(arg696.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg696).isEmpty())
            break Fail2130;
          term = index_uri_unwrap_0_0.instance.invoke(context, e_2121);
          if(term == null)
            break Fail2130;
          term = termFactory.annotateTerm(d_2121, checkListAnnos(termFactory, (IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)trans.constNil1)));
          if(true)
            break Success1291;
        }
        term = term1321;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}