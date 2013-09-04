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

@SuppressWarnings("all") public class testgen_property_0_0 extends Strategy 
{ 
  public static testgen_property_0_0 instance = new testgen_property_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("testgen_property_0_0");
    Fail4512:
    { 
      IStrategoTerm v_11908 = null;
      IStrategoTerm x_11908 = null;
      IStrategoTerm a_11909 = null;
      a_11909 = term;
      IStrategoTerm term2464 = term;
      Success2444:
      { 
        Fail4513:
        { 
          IStrategoTerm d_11909 = null;
          term = random_identifier_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail4513;
          v_11908 = term;
          term = random_type_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail4513;
          d_11909 = term;
          term = termFactory.makeAppl(Main._consProperty_2, new IStrategoTerm[]{v_11908, d_11909});
          x_11908 = term;
          if(true)
            break Success2444;
        }
        term = term2464;
        IStrategoTerm y_11908 = null;
        IStrategoTerm z_11908 = null;
        IStrategoTerm g_11909 = null;
        y_11908 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail4512;
        z_11908 = term;
        g_11909 = y_11908;
        term = report_with_failure_0_2.instance.invoke(context, g_11909, trans.const844, z_11908);
        if(term == null)
          break Fail4512;
      }
      term = a_11909;
      if(x_11908 == null)
        break Fail4512;
      term = x_11908;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}