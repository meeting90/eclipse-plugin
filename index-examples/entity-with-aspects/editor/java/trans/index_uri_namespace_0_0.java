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
    Fail5101:
    { 
      IStrategoTerm term2907 = term;
      Success2875:
      { 
        Fail5102:
        { 
          IStrategoTerm g_11995 = null;
          IStrategoList annos225 = term.getAnnotations();
          if(annos225.getTermType() != IStrategoTerm.LIST || ((IStrategoList)annos225).isEmpty())
            break Fail5102;
          IStrategoTerm arg1605 = ((IStrategoList)annos225).head();
          if(arg1605.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg1605).isEmpty())
            break Fail5102;
          g_11995 = ((IStrategoList)arg1605).head();
          IStrategoTerm arg1606 = ((IStrategoList)annos225).tail();
          if(arg1606.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg1606).isEmpty())
            break Fail5102;
          term = index_namespace_unwrap_0_0.instance.invoke(context, g_11995);
          if(term == null)
            break Fail5102;
          if(true)
            break Success2875;
        }
        term = term2907;
        IStrategoTerm d_11995 = null;
        if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
          break Fail5101;
        d_11995 = ((IStrategoList)term).head();
        term = d_11995;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}