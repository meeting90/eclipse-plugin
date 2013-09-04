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

@SuppressWarnings("all") public class testgen_aspect_0_0 extends Strategy 
{ 
  public static testgen_aspect_0_0 instance = new testgen_aspect_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("testgen_aspect_0_0");
    Fail1618:
    { 
      IStrategoTerm n_2048 = null;
      IStrategoTerm p_2048 = null;
      IStrategoTerm s_2048 = null;
      s_2048 = term;
      IStrategoTerm term913 = term;
      Success892:
      { 
        Fail1619:
        { 
          IStrategoTerm x_2048 = null;
          IStrategoTerm z_2048 = null;
          IStrategoTerm a_2049 = null;
          IStrategoTerm c_2049 = null;
          IStrategoTerm d_2049 = null;
          term = random_identifier_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1619;
          n_2048 = term;
          z_2048 = term;
          a_2049 = trans.const301;
          x_2048 = a_2049;
          c_2049 = z_2048;
          d_2049 = trans.const302;
          term = random_apply_1_2.instance.invoke(context, c_2049, testgen_pointcutadvice_0_0.instance, x_2048, d_2049);
          if(term == null)
            break Fail1619;
          term = concat_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1619;
          term = termFactory.makeAppl(Main._consAspect_2, new IStrategoTerm[]{n_2048, term});
          p_2048 = term;
          if(true)
            break Success892;
        }
        term = term913;
        IStrategoTerm q_2048 = null;
        IStrategoTerm r_2048 = null;
        IStrategoTerm g_2049 = null;
        q_2048 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail1618;
        r_2048 = term;
        g_2049 = q_2048;
        term = report_with_failure_0_2.instance.invoke(context, g_2049, trans.const327, r_2048);
        if(term == null)
          break Fail1618;
      }
      term = s_2048;
      if(p_2048 == null)
        break Fail1618;
      term = p_2048;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}