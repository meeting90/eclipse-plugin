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
    Fail5454:
    { 
      IStrategoTerm term3081 = term;
      Success3031:
      { 
        Fail5455:
        { 
          IStrategoTerm v_12041 = null;
          v_12041 = term;
          term = undefine_$Index_$Read$Set_0_1.instance.invoke(context, v_12041, trans.const829);
          if(term == null)
            break Fail5455;
          if(true)
            break Success3031;
        }
        term = term3081;
        IStrategoTerm term3082 = term;
        Success3032:
        { 
          Fail5456:
          { 
            IStrategoTerm t_12041 = null;
            t_12041 = term;
            term = undefine_$Index_$Unresolved$Set_0_1.instance.invoke(context, t_12041, trans.const829);
            if(term == null)
              break Fail5456;
            if(true)
              break Success3032;
          }
          term = term3082;
          IStrategoTerm term3083 = term;
          Success3033:
          { 
            Fail5457:
            { 
              IStrategoTerm r_12041 = null;
              r_12041 = term;
              term = undefine_$Current$File_0_1.instance.invoke(context, r_12041, trans.const829);
              if(term == null)
                break Fail5457;
              if(true)
                break Success3033;
            }
            term = term3083;
            IStrategoTerm p_12041 = null;
            p_12041 = term;
            term = undefine_$Is$Imported_0_1.instance.invoke(context, p_12041, trans.const829);
            if(term == null)
              break Fail5454;
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