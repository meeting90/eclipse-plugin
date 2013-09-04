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
    Fail5172:
    { 
      IStrategoTerm term2931 = term;
      Success2897:
      { 
        Fail5173:
        { 
          IStrategoTerm d_12006 = null;
          d_12006 = term;
          IStrategoTerm term2932 = term;
          Success2898:
          { 
            Fail5174:
            { 
              term = is_tuple_0_0.instance.invoke(context, d_12006);
              if(term == null)
                break Fail5174;
              { 
                if(true)
                  break Fail5173;
                if(true)
                  break Success2898;
              }
            }
            term = term2932;
          }
          term = d_12006;
          if(true)
            break Success2897;
        }
        term = term2931;
        IStrategoTerm term2933 = term;
        Success2899:
        { 
          Fail5175:
          { 
            IStrategoTerm c_12006 = null;
            if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
              break Fail5175;
            c_12006 = term.getSubterm(0);
            IStrategoTerm arg1629 = term.getSubterm(1);
            if(arg1629.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg1629).isEmpty())
              break Fail5175;
            term = c_12006;
            if(true)
              break Success2899;
          }
          term = term2933;
          IStrategoTerm x_12005 = null;
          IStrategoTerm y_12005 = null;
          if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
            break Fail5172;
          x_12005 = term.getSubterm(0);
          y_12005 = term.getSubterm(1);
          IStrategoTerm term2934 = term;
          Success2900:
          { 
            Fail5176:
            { 
              term = y_12005;
              if(term.getTermType() != IStrategoTerm.LIST || !((IStrategoList)term).isEmpty())
                break Fail5176;
              { 
                if(true)
                  break Fail5172;
                if(true)
                  break Success2900;
              }
            }
            term = term2934;
          }
          term = index_uri_to_string_0_0.instance.invoke(context, y_12005);
          if(term == null)
            break Fail5172;
          term = (IStrategoTerm)termFactory.makeListCons(x_12005, termFactory.makeListCons(trans.const997, termFactory.makeListCons(term, (IStrategoList)trans.constNil3)));
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail5172;
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