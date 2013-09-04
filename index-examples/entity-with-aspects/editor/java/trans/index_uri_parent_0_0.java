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

@SuppressWarnings("all") public class index_uri_parent_0_0 extends Strategy 
{ 
  public static index_uri_parent_0_0 instance = new index_uri_parent_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail5161:
    { 
      IStrategoTerm g_12004 = null;
      IStrategoTerm h_12004 = null;
      IStrategoTerm i_12004 = null;
      IStrategoTerm j_12004 = null;
      if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
        break Fail5161;
      g_12004 = ((IStrategoList)term).head();
      IStrategoTerm arg1622 = ((IStrategoList)term).tail();
      if(arg1622.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg1622).isEmpty())
        break Fail5161;
      h_12004 = ((IStrategoList)arg1622).tail();
      term = h_12004;
      j_12004 = h_12004;
      i_12004 = term;
      term = j_12004;
      IStrategoList list149;
      list149 = checkListTail(i_12004);
      if(list149 == null)
        break Fail5161;
      term = (IStrategoTerm)termFactory.makeListCons(g_12004, list149);
      if(true)
        return term;
    }
    context.push("index_uri_parent_0_0");
    context.popOnFailure();
    return null;
  }
}