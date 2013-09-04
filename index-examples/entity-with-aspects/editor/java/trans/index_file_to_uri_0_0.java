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

@SuppressWarnings("all") public class index_file_to_uri_0_0 extends Strategy 
{ 
  public static index_file_to_uri_0_0 instance = new index_file_to_uri_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("index_file_to_uri_0_0");
    Fail2275:
    { 
      IStrategoTerm term1379 = term;
      Success1345:
      { 
        Fail2276:
        { 
          IStrategoTerm o_2143 = null;
          o_2143 = term;
          IStrategoTerm term1380 = term;
          Success1346:
          { 
            Fail2277:
            { 
              term = is_tuple_0_0.instance.invoke(context, o_2143);
              if(term == null)
                break Fail2277;
              { 
                if(true)
                  break Fail2276;
                if(true)
                  break Success1346;
              }
            }
            term = term1380;
          }
          term = (IStrategoTerm)termFactory.makeListCons(trans.constNone0, termFactory.makeListCons(o_2143, (IStrategoList)trans.constNil1));
          if(true)
            break Success1345;
        }
        term = term1379;
        IStrategoTerm term1381 = term;
        Success1347:
        { 
          Fail2278:
          { 
            IStrategoTerm n_2143 = null;
            if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
              break Fail2278;
            n_2143 = term.getSubterm(0);
            IStrategoTerm arg776 = term.getSubterm(1);
            if(arg776.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg776).isEmpty())
              break Fail2278;
            term = (IStrategoTerm)termFactory.makeListCons(trans.constNone0, termFactory.makeListCons(n_2143, (IStrategoList)trans.constNil1));
            if(true)
              break Success1347;
          }
          term = term1381;
          IStrategoTerm k_2143 = null;
          IStrategoTerm l_2143 = null;
          if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
            break Fail2275;
          k_2143 = term.getSubterm(0);
          l_2143 = term.getSubterm(1);
          IStrategoTerm term1382 = term;
          Success1348:
          { 
            Fail2279:
            { 
              term = l_2143;
              if(term.getTermType() != IStrategoTerm.LIST || !((IStrategoList)term).isEmpty())
                break Fail2279;
              { 
                if(true)
                  break Fail2275;
                if(true)
                  break Success1348;
              }
            }
            term = term1382;
          }
          term = termFactory.makeTuple((IStrategoTerm)termFactory.makeListCons(k_2143, (IStrategoList)trans.constNil1), l_2143);
          term = conc_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2275;
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