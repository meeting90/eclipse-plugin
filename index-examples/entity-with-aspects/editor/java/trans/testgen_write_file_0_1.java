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

@SuppressWarnings("all") public class testgen_write_file_0_1 extends Strategy 
{ 
  public static testgen_write_file_0_1 instance = new testgen_write_file_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_x_11902)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference x_11902 = new TermReference(ref_x_11902);
    context.push("testgen_write_file_0_1");
    Fail4500:
    { 
      IStrategoTerm y_11902 = null;
      IStrategoTerm z_11902 = null;
      y_11902 = term;
      IStrategoTerm term2446 = term;
      Success2438:
      { 
        Fail4501:
        { 
          term = pp_entitywithaspects_string_0_0.instance.invoke(context, y_11902);
          if(term == null)
            break Fail4501;
          z_11902 = term;
          lifted943 lifted9430 = new lifted943();
          lifted9430.x_11902 = x_11902;
          term = try_1_0.instance.invoke(context, term, lifted9430);
          if(term == null)
            break Fail4501;
          if(x_11902.value == null)
            break Fail4501;
          term = termFactory.makeTuple(x_11902.value, trans.const815);
          term = fopen_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail4501;
          term = termFactory.makeTuple(z_11902, term);
          term = fputs_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail4501;
          term = fclose_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail4501;
          if(x_11902.value == null)
            break Fail4501;
          term = debug_1_0.instance.invoke(context, x_11902.value, lifted944.instance);
          if(term == null)
            break Fail4501;
          if(true)
            break Success2438;
        }
        term = term2446;
        IStrategoTerm a_11903 = null;
        IStrategoTerm b_11903 = null;
        IStrategoTerm g_11903 = null;
        a_11903 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail4500;
        b_11903 = term;
        g_11903 = a_11903;
        term = report_with_failure_0_2.instance.invoke(context, g_11903, trans.const833, b_11903);
        if(term == null)
          break Fail4500;
      }
      term = trans.constNone0;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}