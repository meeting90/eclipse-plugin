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
    Fail4853:
    { 
      IStrategoTerm b_11952 = null;
      IStrategoTerm c_11952 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail4853;
      c_11952 = term.getSubterm(0);
      b_11952 = term.getSubterm(1);
      term = c_11952;
      IStrategoTerm term2762 = term;
      Success2740:
      { 
        Fail4854:
        { 
          term = is_test_file_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail4854;
          if(true)
            break Success2740;
        }
        term = term2762;
        IStrategoTerm term2763 = term;
        Success2741:
        { 
          Fail4855:
          { 
            term = index_is_fake_file_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail4855;
            if(true)
              break Success2741;
          }
          term = term2763;
          IStrategoTerm term2764 = term;
          Success2742:
          { 
            Fail4856:
            { 
              term = file_exists_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail4856;
              { 
                if(true)
                  break Fail4853;
                if(true)
                  break Success2742;
              }
            }
            term = term2764;
          }
        }
      }
      term = termFactory.makeTuple(c_11952, b_11952);
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}