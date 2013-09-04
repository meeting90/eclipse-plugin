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

@SuppressWarnings("all") public class $D$Y$N$A$M$I$C__$C$A$L$L$S_0_0 extends Strategy 
{ 
  public static $D$Y$N$A$M$I$C__$C$A$L$L$S_0_0 instance = new $D$Y$N$A$M$I$C__$C$A$L$L$S_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("DYNAMIC__CALLS_0_0");
    Fail2552:
    { 
      IStrategoTerm term1525 = term;
      Success1475:
      { 
        Fail2553:
        { 
          IStrategoTerm a_2179 = null;
          a_2179 = term;
          term = undefine_$Index_$Read$Set_0_1.instance.invoke(context, a_2179, trans.const309);
          if(term == null)
            break Fail2553;
          if(true)
            break Success1475;
        }
        term = term1525;
        IStrategoTerm term1526 = term;
        Success1476:
        { 
          Fail2554:
          { 
            IStrategoTerm y_2178 = null;
            y_2178 = term;
            term = undefine_$Index_$Unresolved$Set_0_1.instance.invoke(context, y_2178, trans.const309);
            if(term == null)
              break Fail2554;
            if(true)
              break Success1476;
          }
          term = term1526;
          IStrategoTerm term1527 = term;
          Success1477:
          { 
            Fail2555:
            { 
              IStrategoTerm w_2178 = null;
              w_2178 = term;
              term = undefine_$Current$File_0_1.instance.invoke(context, w_2178, trans.const309);
              if(term == null)
                break Fail2555;
              if(true)
                break Success1477;
            }
            term = term1527;
            IStrategoTerm u_2178 = null;
            u_2178 = term;
            term = undefine_$Is$Imported_0_1.instance.invoke(context, u_2178, trans.const309);
            if(term == null)
              break Fail2552;
          }
        }
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}