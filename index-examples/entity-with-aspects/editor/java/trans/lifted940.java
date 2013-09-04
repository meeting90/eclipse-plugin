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

@SuppressWarnings("all") final class lifted940 extends Strategy 
{ 
  public static final lifted940 instance = new lifted940();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail5774:
    { 
      IStrategoTerm s_11900 = null;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consDef_1 != ((IStrategoAppl)term).getConstructor())
        break Fail5774;
      IStrategoTerm arg1377 = term.getSubterm(0);
      if(arg1377.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg1377).isEmpty())
        break Fail5774;
      IStrategoTerm arg1379 = ((IStrategoList)arg1377).tail();
      if(arg1379.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg1379).isEmpty())
        break Fail5774;
      s_11900 = ((IStrategoList)arg1379).head();
      term = s_11900;
      if(true)
        return term;
    }
    return null;
  }
}