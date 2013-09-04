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

@SuppressWarnings("all") public class analyze_astdiff_0_0 extends Strategy 
{ 
  public static analyze_astdiff_0_0 instance = new analyze_astdiff_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("analyze_astdiff_0_0");
    Fail4958:
    { 
      IStrategoTerm y_11973 = null;
      IStrategoTerm z_11973 = null;
      IStrategoTerm a_11974 = null;
      IStrategoTerm b_11974 = null;
      IStrategoTerm c_11974 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail4958;
      z_11973 = term.getSubterm(0);
      y_11973 = term.getSubterm(1);
      term = index_file_to_uri_0_0.instance.invoke(context, y_11973);
      if(term == null)
        break Fail4958;
      term = termFactory.makeTuple(term, trans.constCons252);
      term = conc_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail4958;
      c_11974 = term;
      term = checksum_0_0.instance.invoke(context, z_11973);
      if(term == null)
        break Fail4958;
      b_11974 = term;
      Success2808:
      { 
        Fail4959:
        { 
          IStrategoTerm d_11974 = null;
          d_11974 = term;
          term = index_get_global_0_1.instance.invoke(context, term, c_11974);
          if(term == null)
            break Fail4959;
          a_11974 = term;
          term = d_11974;
          { 
            term = index_set_global_0_1.instance.invoke(context, b_11974, c_11974);
            if(term == null)
              break Fail4958;
            IStrategoTerm term2836 = term;
            Success2809:
            { 
              Fail4960:
              { 
                term = termFactory.makeTuple(a_11974, b_11974);
                term = eq_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail4960;
                { 
                  if(true)
                    break Fail4958;
                  if(true)
                    break Success2809;
                }
              }
              term = term2836;
            }
            if(true)
              break Success2808;
          }
        }
        term = index_set_global_0_1.instance.invoke(context, b_11974, c_11974);
        if(term == null)
          break Fail4958;
      }
      term = y_11973;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}