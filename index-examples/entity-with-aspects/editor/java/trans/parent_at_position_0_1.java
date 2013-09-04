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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm q_2196)
  { 
    context.push("parent_at_position_0_1");
    Fail2352:
    { 
      IStrategoTerm term1426 = term;
      Success1378:
      { 
        Fail2353:
        { 
          IStrategoTerm e_2154 = null;
          IStrategoTerm f_2154 = null;
          f_2154 = term;
          term = q_2196;
          if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
            break Fail2353;
          e_2154 = ((IStrategoList)term).head();
          IStrategoTerm arg796 = ((IStrategoList)term).tail();
          if(arg796.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg796).isEmpty())
            break Fail2353;
          IStrategoTerm arg798 = ((IStrategoList)arg796).tail();
          if(arg798.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg798).isEmpty())
            break Fail2353;
          term = subterm_at_0_1.instance.invoke(context, f_2154, e_2154);
          if(term == null)
            break Fail2353;
          if(true)
            break Success1378;
        }
        term = term1426;
        IStrategoTerm y_2153 = null;
        IStrategoTerm z_2153 = null;
        IStrategoTerm a_2154 = null;
        a_2154 = term;
        term = q_2196;
        if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
          break Fail2352;
        z_2153 = ((IStrategoList)term).head();
        IStrategoTerm arg799 = ((IStrategoList)term).tail();
        y_2153 = arg799;
        if(arg799.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg799).isEmpty())
          break Fail2352;
        IStrategoTerm arg801 = ((IStrategoList)arg799).tail();
        if(arg801.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg801).isEmpty())
          break Fail2352;
        term = subterm_at_0_1.instance.invoke(context, a_2154, z_2153);
        if(term == null)
          break Fail2352;
        term = this.invoke(context, term, y_2153);
        if(term == null)
          break Fail2352;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}