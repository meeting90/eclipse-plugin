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
    Fail1858:
    { 
      IStrategoTerm s_2075 = null;
      IStrategoTerm t_2075 = null;
      t_2075 = term;
      s_2075 = term;
      term = t_2075;
      IStrategoTerm term1143 = term;
      Success1122:
      { 
        Fail1859:
        { 
          IStrategoTerm u_2075 = null;
          u_2075 = term;
          term = s_2075;
          if(term.getTermType() != IStrategoTerm.APPL || Main._consType_1 != ((IStrategoAppl)term).getConstructor())
            break Fail1859;
          IStrategoTerm arg607 = term.getSubterm(0);
          if(arg607.getTermType() != IStrategoTerm.STRING || !"String".equals(((IStrategoString)arg607).stringValue()))
            break Fail1859;
          term = u_2075;
          { 
            term = trans.constStringType0;
            if(true)
              break Success1122;
          }
        }
        term = term1143;
        IStrategoTerm term1144 = term;
        Success1123:
        { 
          Fail1860:
          { 
            IStrategoTerm v_2075 = null;
            v_2075 = term;
            term = s_2075;
            if(term.getTermType() != IStrategoTerm.APPL || Main._consType_1 != ((IStrategoAppl)term).getConstructor())
              break Fail1860;
            IStrategoTerm arg608 = term.getSubterm(0);
            if(arg608.getTermType() != IStrategoTerm.STRING || !"Int".equals(((IStrategoString)arg608).stringValue()))
              break Fail1860;
            term = v_2075;
            { 
              term = trans.constIntType0;
              if(true)
                break Success1123;
            }
          }
          term = term1144;
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