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

@SuppressWarnings("all") public class documentation_comment_chars_0_0 extends Strategy 
{ 
  public static documentation_comment_chars_0_0 instance = new documentation_comment_chars_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("documentation_comment_chars_0_0");
    Fail5243:
    { 
      IStrategoTerm k_12014 = null;
      if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
        break Fail5243;
      IStrategoTerm arg1648 = ((IStrategoList)term).head();
      if(arg1648.getTermType() != IStrategoTerm.INT || 42 != ((IStrategoInt)arg1648).intValue())
        break Fail5243;
      k_12014 = ((IStrategoList)term).tail();
      term = ltrim_1_0.instance.invoke(context, k_12014, lifted1129.instance);
      if(term == null)
        break Fail5243;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}