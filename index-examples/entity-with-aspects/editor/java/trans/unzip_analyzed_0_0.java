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

@SuppressWarnings("all") public class unzip_analyzed_0_0 extends Strategy 
{ 
  public static unzip_analyzed_0_0 instance = new unzip_analyzed_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("unzip_analyzed_0_0");
    Fail5006:
    { 
      IStrategoTerm j_11981 = null;
      IStrategoTerm k_11981 = null;
      IStrategoTerm l_11981 = null;
      IStrategoTerm r_11981 = null;
      k_11981 = term;
      r_11981 = term;
      IStrategoTerm term2865 = term;
      Success2835:
      { 
        Fail5007:
        { 
          term = SRTS_all.instance.invoke(context, k_11981, lifted1049.instance);
          if(term == null)
            break Fail5007;
          j_11981 = term;
          term = k_11981;
          IStrategoTerm term2866 = term;
          Success2836:
          { 
            Fail5008:
            { 
              term = get_appl_arguments_1_0.instance.invoke(context, term, lifted1050.instance);
              if(term == null)
                break Fail5008;
              if(true)
                break Success2836;
            }
            term = term2866;
            Success2837:
            { 
              Fail5009:
              { 
                term = map_1_0.instance.invoke(context, term, lifted1051.instance);
                if(term == null)
                  break Fail5009;
                if(true)
                  break Success2837;
              }
              term = trans.constNil3;
            }
          }
          term = concat_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail5007;
          l_11981 = term;
          if(true)
            break Success2835;
        }
        term = term2865;
        IStrategoTerm p_11981 = null;
        IStrategoTerm q_11981 = null;
        IStrategoTerm t_11981 = null;
        p_11981 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail5006;
        q_11981 = term;
        t_11981 = p_11981;
        term = report_with_failure_0_2.instance.invoke(context, t_11981, trans.const962, q_11981);
        if(term == null)
          break Fail5006;
      }
      term = r_11981;
      if(j_11981 == null || l_11981 == null)
        break Fail5006;
      term = termFactory.makeTuple(j_11981, l_11981);
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}