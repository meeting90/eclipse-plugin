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
    Fail2284:
    { 
      IStrategoTerm term1384 = term;
      Success1350:
      { 
        Fail2285:
        { 
          IStrategoTerm x_2143 = null;
          IStrategoTerm y_2143 = null;
          IStrategoTerm z_2143 = null;
          IStrategoTerm a_2144 = null;
          if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
            break Fail2285;
          x_2143 = ((IStrategoList)term).head();
          y_2143 = ((IStrategoList)term).tail();
          a_2144 = term;
          term = x_2143;
          IStrategoTerm term1385 = term;
          Success1351:
          { 
            Fail2286:
            { 
              IStrategoTerm e_2297 = null;
              if(term.getTermType() != IStrategoTerm.APPL || Main._consUnresolved_1 != ((IStrategoAppl)term).getConstructor())
                break Fail2286;
              e_2297 = term.getSubterm(0);
              term = e_2297;
              if(true)
                break Success1351;
            }
            term = term1385;
          }
          z_2143 = term;
          term = a_2144;
          IStrategoList list74;
          list74 = checkListTail(y_2143);
          if(list74 == null)
            break Fail2285;
          term = (IStrategoTerm)termFactory.makeListCons(z_2143, list74);
          if(true)
            break Success1350;
        }
        term = term1384;
      }
      if(true)
        return term;
    }
    context.push("index_uri_unwrap_0_0");
    context.popOnFailure();
    return null;
  }
}