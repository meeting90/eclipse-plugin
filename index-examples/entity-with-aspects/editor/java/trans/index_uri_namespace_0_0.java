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

@SuppressWarnings("all") public class index_uri_namespace_0_0 extends Strategy 
{ 
  public static index_uri_namespace_0_0 instance = new index_uri_namespace_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("index_uri_namespace_0_0");
    Fail2199:
    { 
      IStrategoTerm term1351 = term;
      Success1319:
      { 
        Fail2200:
        { 
          IStrategoTerm l_2132 = null;
          IStrategoList annos87 = term.getAnnotations();
          if(annos87.getTermType() != IStrategoTerm.LIST || ((IStrategoList)annos87).isEmpty())
            break Fail2200;
          IStrategoTerm arg751 = ((IStrategoList)annos87).head();
          if(arg751.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg751).isEmpty())
            break Fail2200;
          l_2132 = ((IStrategoList)arg751).head();
          IStrategoTerm arg752 = ((IStrategoList)annos87).tail();
          if(arg752.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg752).isEmpty())
            break Fail2200;
          term = index_namespace_unwrap_0_0.instance.invoke(context, l_2132);
          if(term == null)
            break Fail2200;
          if(true)
            break Success1319;
        }
        term = term1351;
        IStrategoTerm i_2132 = null;
        if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
          break Fail2199;
        i_2132 = ((IStrategoList)term).head();
        term = i_2132;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}