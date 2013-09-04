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

@SuppressWarnings("all") public class construct_index_path_0_5 extends Strategy 
{ 
  public static construct_index_path_0_5 instance = new construct_index_path_0_5();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm c_11966, IStrategoTerm d_11966, IStrategoTerm e_11966, IStrategoTerm f_11966, IStrategoTerm g_11966)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("construct_index_path_0_5");
    Fail4912:
    { 
      IStrategoTerm h_11966 = null;
      IStrategoTerm i_11966 = null;
      IStrategoTerm j_11966 = null;
      IStrategoTerm k_11966 = null;
      i_11966 = term;
      Success2781:
      { 
        Fail4913:
        { 
          IStrategoTerm l_11966 = null;
          l_11966 = term;
          term = e_11966;
          if(term.getTermType() != IStrategoTerm.APPL || Main._consAnon_0 != ((IStrategoAppl)term).getConstructor())
            break Fail4913;
          term = l_11966;
          { 
            IStrategoTerm p_11966 = null;
            term = termFactory.makeTuple(i_11966, c_11966);
            term = lookup_index_path_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail4912;
            h_11966 = term;
            term = g_11966;
            p_11966 = g_11966;
            term = new_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail4912;
            term = termFactory.makeAppl(Main._consAnon_1, new IStrategoTerm[]{term});
            term = index_do_adjust_path_0_3.instance.invoke(context, p_11966, i_11966, h_11966, term);
            if(term == null)
              break Fail4912;
            j_11966 = term;
            if(true)
              break Success2781;
          }
        }
        term = termFactory.makeTuple(e_11966, c_11966);
        term = lookup_index_path_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail4912;
        term = index_do_adjust_path_0_3.instance.invoke(context, g_11966, i_11966, term, d_11966);
        if(term == null)
          break Fail4912;
        j_11966 = term;
      }
      Success2782:
      { 
        Fail4914:
        { 
          if(true)
            break Fail4914;
          { 
            term = index_do_adjust_path_0_3.instance.invoke(context, g_11966, i_11966, j_11966, f_11966);
            if(term == null)
              break Fail4912;
            k_11966 = term;
            if(true)
              break Success2782;
          }
        }
        term = j_11966;
        k_11966 = j_11966;
      }
      term = termFactory.makeTuple(i_11966, k_11966);
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}