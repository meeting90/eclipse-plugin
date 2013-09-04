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
    Fail1590:
    { 
      IStrategoTerm s_2037 = null;
      IStrategoTerm t_2037 = null;
      IStrategoTerm w_2037 = null;
      IStrategoTerm a_2038 = null;
      a_2038 = term;
      IStrategoTerm term887 = term;
      Success879:
      { 
        Fail1591:
        { 
          IStrategoTerm f_2038 = null;
          IStrategoTerm h_2038 = null;
          IStrategoTerm i_2038 = null;
          term = primitive_types_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1591;
          t_2037 = term;
          term = termFactory.makeAppl(Main._consDef_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(trans.constModule0, termFactory.makeListCons(trans.const299, (IStrategoList)trans.constNil1))});
          h_2038 = term;
          f_2038 = trans.constEntity0;
          i_2038 = h_2038;
          term = index_get_children_0_2.instance.invoke(context, i_2038, f_2038, trans.const309);
          if(term == null)
            break Fail1591;
          term = map_1_0.instance.invoke(context, term, lifted340.instance);
          if(term == null)
            break Fail1591;
          s_2037 = term;
          Success880:
          { 
            Fail1592:
            { 
              IStrategoTerm k_2038 = null;
              IStrategoTerm l_2038 = null;
              k_2038 = s_2037;
              l_2038 = trans.const301;
              term = take_0_1.instance.invoke(context, k_2038, l_2038);
              if(term == null)
                break Fail1592;
              if(true)
                break Success880;
            }
            term = s_2037;
          }
          term = (IStrategoTerm)termFactory.makeListCons(t_2037, termFactory.makeListCons(t_2037, termFactory.makeListCons(t_2037, termFactory.makeListCons(t_2037, termFactory.makeListCons(term, (IStrategoList)trans.constNil1)))));
          term = concat_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1591;
          term = random_list_item_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1591;
          w_2037 = term;
          if(true)
            break Success879;
        }
        term = term887;
        IStrategoTerm y_2037 = null;
        IStrategoTerm z_2037 = null;
        IStrategoTerm o_2038 = null;
        y_2037 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail1590;
        z_2037 = term;
        o_2038 = y_2037;
        term = report_with_failure_0_2.instance.invoke(context, o_2038, trans.const310, z_2037);
        if(term == null)
          break Fail1590;
      }
      term = a_2038;
      if(w_2037 == null)
        break Fail1590;
      term = w_2037;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}