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
    Fail2056:
    { 
      IStrategoTerm d_2111 = null;
      IStrategoTerm e_2111 = null;
      IStrategoTerm f_2111 = null;
      IStrategoTerm g_2111 = null;
      IStrategoTerm h_2111 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail2056;
      e_2111 = term.getSubterm(0);
      d_2111 = term.getSubterm(1);
      term = index_file_to_uri_0_0.instance.invoke(context, d_2111);
      if(term == null)
        break Fail2056;
      term = termFactory.makeTuple(term, trans.constCons120);
      term = conc_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail2056;
      h_2111 = term;
      term = checksum_0_0.instance.invoke(context, e_2111);
      if(term == null)
        break Fail2056;
      g_2111 = term;
      Success1252:
      { 
        Fail2057:
        { 
          IStrategoTerm i_2111 = null;
          i_2111 = term;
          term = index_get_global_0_1.instance.invoke(context, term, h_2111);
          if(term == null)
            break Fail2057;
          f_2111 = term;
          term = i_2111;
          { 
            term = index_set_global_0_1.instance.invoke(context, g_2111, h_2111);
            if(term == null)
              break Fail2056;
            IStrategoTerm term1280 = term;
            Success1253:
            { 
              Fail2058:
              { 
                term = termFactory.makeTuple(f_2111, g_2111);
                term = eq_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail2058;
                { 
                  if(true)
                    break Fail2056;
                  if(true)
                    break Success1253;
                }
              }
              term = term1280;
            }
            if(true)
              break Success1252;
          }
        }
        term = index_set_global_0_1.instance.invoke(context, g_2111, h_2111);
        if(term == null)
          break Fail2056;
      }
      term = d_2111;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}