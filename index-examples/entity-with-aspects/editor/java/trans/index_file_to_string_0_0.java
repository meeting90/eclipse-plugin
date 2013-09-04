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

@SuppressWarnings("all") public class index_file_to_string_0_0 extends Strategy 
{ 
  public static index_file_to_string_0_0 instance = new index_file_to_string_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("index_file_to_string_0_0");
    Fail2270:
    { 
      IStrategoTerm term1375 = term;
      Success1341:
      { 
        Fail2271:
        { 
          IStrategoTerm i_2143 = null;
          i_2143 = term;
          IStrategoTerm term1376 = term;
          Success1342:
          { 
            Fail2272:
            { 
              term = is_tuple_0_0.instance.invoke(context, i_2143);
              if(term == null)
                break Fail2272;
              { 
                if(true)
                  break Fail2271;
                if(true)
                  break Success1342;
              }
            }
            term = term1376;
          }
          term = i_2143;
          if(true)
            break Success1341;
        }
        term = term1375;
        IStrategoTerm term1377 = term;
        Success1343:
        { 
          Fail2273:
          { 
            IStrategoTerm h_2143 = null;
            if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
              break Fail2273;
            h_2143 = term.getSubterm(0);
            IStrategoTerm arg775 = term.getSubterm(1);
            if(arg775.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg775).isEmpty())
              break Fail2273;
            term = h_2143;
            if(true)
              break Success1343;
          }
          term = term1377;
          IStrategoTerm c_2143 = null;
          IStrategoTerm d_2143 = null;
          if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
            break Fail2270;
          c_2143 = term.getSubterm(0);
          d_2143 = term.getSubterm(1);
          IStrategoTerm term1378 = term;
          Success1344:
          { 
            Fail2274:
            { 
              term = d_2143;
              if(term.getTermType() != IStrategoTerm.LIST || !((IStrategoList)term).isEmpty())
                break Fail2274;
              { 
                if(true)
                  break Fail2270;
                if(true)
                  break Success1344;
              }
            }
            term = term1378;
          }
          term = index_uri_to_string_0_0.instance.invoke(context, d_2143);
          if(term == null)
            break Fail2270;
          term = (IStrategoTerm)termFactory.makeListCons(c_2143, termFactory.makeListCons(trans.const477, termFactory.makeListCons(term, (IStrategoList)trans.constNil1)));
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2270;
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