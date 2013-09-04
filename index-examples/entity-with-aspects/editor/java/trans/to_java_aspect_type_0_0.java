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

@SuppressWarnings("all") public class to_java_aspect_type_0_0 extends Strategy 
{ 
  public static to_java_aspect_type_0_0 instance = new to_java_aspect_type_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail4760:
    { 
      IStrategoTerm n_11938 = null;
      IStrategoTerm o_11938 = null;
      o_11938 = term;
      n_11938 = term;
      term = o_11938;
      IStrategoTerm term2699 = term;
      Success2678:
      { 
        Fail4761:
        { 
          IStrategoTerm p_11938 = null;
          p_11938 = term;
          term = n_11938;
          if(term.getTermType() != IStrategoTerm.APPL || Main._consType_1 != ((IStrategoAppl)term).getConstructor())
            break Fail4761;
          IStrategoTerm arg1461 = term.getSubterm(0);
          if(arg1461.getTermType() != IStrategoTerm.STRING || !"String".equals(((IStrategoString)arg1461).stringValue()))
            break Fail4761;
          term = p_11938;
          { 
            term = trans.constStringType0;
            if(true)
              break Success2678;
          }
        }
        term = term2699;
        IStrategoTerm term2700 = term;
        Success2679:
        { 
          Fail4762:
          { 
            IStrategoTerm q_11938 = null;
            q_11938 = term;
            term = n_11938;
            if(term.getTermType() != IStrategoTerm.APPL || Main._consType_1 != ((IStrategoAppl)term).getConstructor())
              break Fail4762;
            IStrategoTerm arg1462 = term.getSubterm(0);
            if(arg1462.getTermType() != IStrategoTerm.STRING || !"Int".equals(((IStrategoString)arg1462).stringValue()))
              break Fail4762;
            term = q_11938;
            { 
              term = trans.constIntType0;
              if(true)
                break Success2679;
            }
          }
          term = term2700;
        }
      }
      if(true)
        return term;
    }
    context.push("to_java_aspect_type_0_0");
    context.popOnFailure();
    return null;
  }
}