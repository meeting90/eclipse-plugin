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

@SuppressWarnings("all") public class index_uri_name_0_0 extends Strategy 
{ 
  public static index_uri_name_0_0 instance = new index_uri_name_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail5106:
    { 
      IStrategoTerm term2910 = term;
      Success2878:
      { 
        Fail5107:
        { 
          IStrategoTerm s_11995 = null;
          IStrategoList annos227 = term.getAnnotations();
          if(annos227.getTermType() != IStrategoTerm.LIST || ((IStrategoList)annos227).isEmpty())
            break Fail5107;
          IStrategoTerm arg1611 = ((IStrategoList)annos227).head();
          if(arg1611.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg1611).isEmpty())
            break Fail5107;
          IStrategoTerm arg1613 = ((IStrategoList)arg1611).tail();
          if(arg1613.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg1613).isEmpty())
            break Fail5107;
          s_11995 = ((IStrategoList)arg1613).head();
          IStrategoTerm arg1615 = ((IStrategoList)annos227).tail();
          if(arg1615.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg1615).isEmpty())
            break Fail5107;
          term = s_11995;
          if(true)
            break Success2878;
        }
        term = term2910;
        IStrategoTerm q_11995 = null;
        if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
          break Fail5106;
        IStrategoTerm arg1617 = ((IStrategoList)term).tail();
        if(arg1617.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg1617).isEmpty())
          break Fail5106;
        q_11995 = ((IStrategoList)arg1617).head();
        term = q_11995;
      }
      if(true)
        return term;
    }
    context.push("index_uri_name_0_0");
    context.popOnFailure();
    return null;
  }
}