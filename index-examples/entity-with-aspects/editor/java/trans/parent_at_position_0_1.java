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

@SuppressWarnings("all") public class parent_at_position_0_1 extends Strategy 
{ 
  public static parent_at_position_0_1 instance = new parent_at_position_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm l_12059)
  { 
    context.push("parent_at_position_0_1");
    Fail5254:
    { 
      IStrategoTerm term2982 = term;
      Success2934:
      { 
        Fail5255:
        { 
          IStrategoTerm z_12016 = null;
          IStrategoTerm a_12017 = null;
          a_12017 = term;
          term = l_12059;
          if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
            break Fail5255;
          z_12016 = ((IStrategoList)term).head();
          IStrategoTerm arg1650 = ((IStrategoList)term).tail();
          if(arg1650.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg1650).isEmpty())
            break Fail5255;
          IStrategoTerm arg1652 = ((IStrategoList)arg1650).tail();
          if(arg1652.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg1652).isEmpty())
            break Fail5255;
          term = subterm_at_0_1.instance.invoke(context, a_12017, z_12016);
          if(term == null)
            break Fail5255;
          if(true)
            break Success2934;
        }
        term = term2982;
        IStrategoTerm t_12016 = null;
        IStrategoTerm u_12016 = null;
        IStrategoTerm v_12016 = null;
        v_12016 = term;
        term = l_12059;
        if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
          break Fail5254;
        u_12016 = ((IStrategoList)term).head();
        IStrategoTerm arg1653 = ((IStrategoList)term).tail();
        t_12016 = arg1653;
        if(arg1653.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg1653).isEmpty())
          break Fail5254;
        IStrategoTerm arg1655 = ((IStrategoList)arg1653).tail();
        if(arg1655.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg1655).isEmpty())
          break Fail5254;
        term = subterm_at_0_1.instance.invoke(context, v_12016, u_12016);
        if(term == null)
          break Fail5254;
        term = this.invoke(context, term, t_12016);
        if(term == null)
          break Fail5254;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}