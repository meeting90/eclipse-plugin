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

@SuppressWarnings("all") public class random_type_0_0 extends Strategy 
{ 
  public static random_type_0_0 instance = new random_type_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("random_type_0_0");
    Fail4492:
    { 
      IStrategoTerm n_11900 = null;
      IStrategoTerm o_11900 = null;
      IStrategoTerm r_11900 = null;
      IStrategoTerm v_11900 = null;
      v_11900 = term;
      IStrategoTerm term2443 = term;
      Success2435:
      { 
        Fail4493:
        { 
          IStrategoTerm a_11901 = null;
          IStrategoTerm c_11901 = null;
          IStrategoTerm d_11901 = null;
          term = primitive_types_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail4493;
          o_11900 = term;
          term = termFactory.makeAppl(Main._consDef_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(trans.constModule0, termFactory.makeListCons(trans.const819, (IStrategoList)trans.constNil3))});
          c_11901 = term;
          a_11901 = trans.constEntity0;
          d_11901 = c_11901;
          term = index_get_children_0_2.instance.invoke(context, d_11901, a_11901, trans.const829);
          if(term == null)
            break Fail4493;
          term = map_1_0.instance.invoke(context, term, lifted940.instance);
          if(term == null)
            break Fail4493;
          n_11900 = term;
          Success2436:
          { 
            Fail4494:
            { 
              IStrategoTerm f_11901 = null;
              IStrategoTerm g_11901 = null;
              f_11901 = n_11900;
              g_11901 = trans.const821;
              term = take_0_1.instance.invoke(context, f_11901, g_11901);
              if(term == null)
                break Fail4494;
              if(true)
                break Success2436;
            }
            term = n_11900;
          }
          term = (IStrategoTerm)termFactory.makeListCons(o_11900, termFactory.makeListCons(o_11900, termFactory.makeListCons(o_11900, termFactory.makeListCons(o_11900, termFactory.makeListCons(term, (IStrategoList)trans.constNil3)))));
          term = concat_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail4493;
          term = random_list_item_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail4493;
          r_11900 = term;
          if(true)
            break Success2435;
        }
        term = term2443;
        IStrategoTerm t_11900 = null;
        IStrategoTerm u_11900 = null;
        IStrategoTerm j_11901 = null;
        t_11900 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail4492;
        u_11900 = term;
        j_11901 = t_11900;
        term = report_with_failure_0_2.instance.invoke(context, j_11901, trans.const830, u_11900);
        if(term == null)
          break Fail4492;
      }
      term = v_11900;
      if(r_11900 == null)
        break Fail4492;
      term = r_11900;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}