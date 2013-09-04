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
    Fail5177:
    { 
      IStrategoTerm term2935 = term;
      Success2901:
      { 
        Fail5178:
        { 
          IStrategoTerm j_12006 = null;
          j_12006 = term;
          IStrategoTerm term2936 = term;
          Success2902:
          { 
            Fail5179:
            { 
              term = is_tuple_0_0.instance.invoke(context, j_12006);
              if(term == null)
                break Fail5179;
              { 
                if(true)
                  break Fail5178;
                if(true)
                  break Success2902;
              }
            }
            term = term2936;
          }
          term = (IStrategoTerm)termFactory.makeListCons(trans.constNone0, termFactory.makeListCons(j_12006, (IStrategoList)trans.constNil3));
          if(true)
            break Success2901;
        }
        term = term2935;
        IStrategoTerm term2937 = term;
        Success2903:
        { 
          Fail5180:
          { 
            IStrategoTerm i_12006 = null;
            if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
              break Fail5180;
            i_12006 = term.getSubterm(0);
            IStrategoTerm arg1630 = term.getSubterm(1);
            if(arg1630.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg1630).isEmpty())
              break Fail5180;
            term = (IStrategoTerm)termFactory.makeListCons(trans.constNone0, termFactory.makeListCons(i_12006, (IStrategoList)trans.constNil3));
            if(true)
              break Success2903;
          }
          term = term2937;
          IStrategoTerm f_12006 = null;
          IStrategoTerm g_12006 = null;
          if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
            break Fail5177;
          f_12006 = term.getSubterm(0);
          g_12006 = term.getSubterm(1);
          IStrategoTerm term2938 = term;
          Success2904:
          { 
            Fail5181:
            { 
              term = g_12006;
              if(term.getTermType() != IStrategoTerm.LIST || !((IStrategoList)term).isEmpty())
                break Fail5181;
              { 
                if(true)
                  break Fail5177;
                if(true)
                  break Success2904;
              }
            }
            term = term2938;
          }
          term = termFactory.makeTuple((IStrategoTerm)termFactory.makeListCons(f_12006, (IStrategoList)trans.constNil3), g_12006);
          term = conc_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail5177;
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