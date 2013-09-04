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
    Fail1610:
    { 
      IStrategoTerm a_2046 = null;
      IStrategoTerm c_2046 = null;
      IStrategoTerm f_2046 = null;
      f_2046 = term;
      IStrategoTerm term908 = term;
      Success888:
      { 
        Fail1611:
        { 
          IStrategoTerm i_2046 = null;
          term = random_identifier_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1611;
          a_2046 = term;
          term = random_type_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1611;
          i_2046 = term;
          term = termFactory.makeAppl(Main._consProperty_2, new IStrategoTerm[]{a_2046, i_2046});
          c_2046 = term;
          if(true)
            break Success888;
        }
        term = term908;
        IStrategoTerm d_2046 = null;
        IStrategoTerm e_2046 = null;
        IStrategoTerm l_2046 = null;
        d_2046 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail1610;
        e_2046 = term;
        l_2046 = d_2046;
        term = report_with_failure_0_2.instance.invoke(context, l_2046, trans.const324, e_2046);
        if(term == null)
          break Fail1610;
      }
      term = f_2046;
      if(c_2046 == null)
        break Fail1610;
      term = c_2046;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}