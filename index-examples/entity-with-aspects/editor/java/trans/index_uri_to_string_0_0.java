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

@SuppressWarnings("all") public class index_uri_to_string_0_0 extends Strategy 
{ 
  public static index_uri_to_string_0_0 instance = new index_uri_to_string_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("index_uri_to_string_0_0");
    Fail5170:
    { 
      IStrategoTerm n_12005 = null;
      IStrategoTerm o_12005 = null;
      IStrategoTerm p_12005 = null;
      IStrategoTerm q_12005 = null;
      IStrategoTerm t_12005 = null;
      if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
        break Fail5170;
      p_12005 = ((IStrategoList)term).head();
      n_12005 = ((IStrategoList)term).tail();
      t_12005 = term;
      IStrategoTerm term2930 = term;
      Success2896:
      { 
        Fail5171:
        { 
          IStrategoTerm u_12005 = null;
          term = index_path_to_string_0_0.instance.invoke(context, n_12005);
          if(term == null)
            break Fail5171;
          o_12005 = term;
          term = p_12005;
          IStrategoTerm cons111 = context.invokePrimitive("SSL_get_constructor", term, NO_STRATEGIES, new IStrategoTerm[]{term});
          u_12005 = cons111;
          term = u_12005;
          q_12005 = u_12005;
          if(true)
            break Success2896;
        }
        term = term2930;
        IStrategoTerm r_12005 = null;
        IStrategoTerm s_12005 = null;
        IStrategoTerm w_12005 = null;
        r_12005 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail5170;
        s_12005 = term;
        w_12005 = r_12005;
        term = report_with_failure_0_2.instance.invoke(context, w_12005, trans.const995, s_12005);
        if(term == null)
          break Fail5170;
      }
      term = t_12005;
      if(q_12005 == null || o_12005 == null)
        break Fail5170;
      term = (IStrategoTerm)termFactory.makeListCons(q_12005, termFactory.makeListCons(trans.const996, termFactory.makeListCons(o_12005, (IStrategoList)trans.constNil3)));
      term = concat_strings_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail5170;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}