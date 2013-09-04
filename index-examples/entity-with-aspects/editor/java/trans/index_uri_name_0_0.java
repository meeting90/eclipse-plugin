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
    Fail2204:
    { 
      IStrategoTerm term1354 = term;
      Success1322:
      { 
        Fail2205:
        { 
          IStrategoTerm x_2132 = null;
          IStrategoList annos89 = term.getAnnotations();
          if(annos89.getTermType() != IStrategoTerm.LIST || ((IStrategoList)annos89).isEmpty())
            break Fail2205;
          IStrategoTerm arg757 = ((IStrategoList)annos89).head();
          if(arg757.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg757).isEmpty())
            break Fail2205;
          IStrategoTerm arg759 = ((IStrategoList)arg757).tail();
          if(arg759.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg759).isEmpty())
            break Fail2205;
          x_2132 = ((IStrategoList)arg759).head();
          IStrategoTerm arg761 = ((IStrategoList)annos89).tail();
          if(arg761.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg761).isEmpty())
            break Fail2205;
          term = x_2132;
          if(true)
            break Success1322;
        }
        term = term1354;
        IStrategoTerm v_2132 = null;
        if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
          break Fail2204;
        IStrategoTerm arg763 = ((IStrategoList)term).tail();
        if(arg763.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg763).isEmpty())
          break Fail2204;
        v_2132 = ((IStrategoList)arg763).head();
        term = v_2132;
      }
      if(true)
        return term;
    }
    context.push("index_uri_name_0_0");
    context.popOnFailure();
    return null;
  }
}