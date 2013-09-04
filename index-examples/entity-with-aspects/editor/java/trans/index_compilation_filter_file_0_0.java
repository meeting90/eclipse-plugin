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

@SuppressWarnings("all") public class index_compilation_filter_file_0_0 extends Strategy 
{ 
  public static index_compilation_filter_file_0_0 instance = new index_compilation_filter_file_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("index_compilation_filter_file_0_0");
    Fail1951:
    { 
      IStrategoTerm g_2089 = null;
      IStrategoTerm h_2089 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail1951;
      h_2089 = term.getSubterm(0);
      g_2089 = term.getSubterm(1);
      term = h_2089;
      IStrategoTerm term1206 = term;
      Success1184:
      { 
        Fail1952:
        { 
          term = is_test_file_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1952;
          if(true)
            break Success1184;
        }
        term = term1206;
        IStrategoTerm term1207 = term;
        Success1185:
        { 
          Fail1953:
          { 
            term = index_is_fake_file_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail1953;
            if(true)
              break Success1185;
          }
          term = term1207;
          IStrategoTerm term1208 = term;
          Success1186:
          { 
            Fail1954:
            { 
              term = file_exists_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail1954;
              { 
                if(true)
                  break Fail1951;
                if(true)
                  break Success1186;
              }
            }
            term = term1208;
          }
        }
      }
      term = termFactory.makeTuple(h_2089, g_2089);
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}