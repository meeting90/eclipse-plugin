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

@SuppressWarnings("all") public class index_uri_unwrap_0_0 extends Strategy 
{ 
  public static index_uri_unwrap_0_0 instance = new index_uri_unwrap_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail5186:
    { 
      IStrategoTerm term2940 = term;
      Success2906:
      { 
        Fail5187:
        { 
          IStrategoTerm s_12006 = null;
          IStrategoTerm t_12006 = null;
          IStrategoTerm u_12006 = null;
          IStrategoTerm v_12006 = null;
          if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
            break Fail5187;
          s_12006 = ((IStrategoList)term).head();
          t_12006 = ((IStrategoList)term).tail();
          v_12006 = term;
          term = s_12006;
          IStrategoTerm term2941 = term;
          Success2907:
          { 
            Fail5188:
            { 
              IStrategoTerm z_12159 = null;
              if(term.getTermType() != IStrategoTerm.APPL || Main._consUnresolved_1 != ((IStrategoAppl)term).getConstructor())
                break Fail5188;
              z_12159 = term.getSubterm(0);
              term = z_12159;
              if(true)
                break Success2907;
            }
            term = term2941;
          }
          u_12006 = term;
          term = v_12006;
          IStrategoList list150;
          list150 = checkListTail(t_12006);
          if(list150 == null)
            break Fail5187;
          term = (IStrategoTerm)termFactory.makeListCons(u_12006, list150);
          if(true)
            break Success2906;
        }
        term = term2940;
      }
      if(true)
        return term;
    }
    context.push("index_uri_unwrap_0_0");
    context.popOnFailure();
    return null;
  }
}