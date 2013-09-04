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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_c_2040)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference c_2040 = new TermReference(ref_c_2040);
    context.push("testgen_write_file_0_1");
    Fail1598:
    { 
      IStrategoTerm d_2040 = null;
      IStrategoTerm e_2040 = null;
      d_2040 = term;
      IStrategoTerm term890 = term;
      Success882:
      { 
        Fail1599:
        { 
          term = pp_entitywithaspects_string_0_0.instance.invoke(context, d_2040);
          if(term == null)
            break Fail1599;
          e_2040 = term;
          lifted343 lifted3430 = new lifted343();
          lifted3430.c_2040 = c_2040;
          term = try_1_0.instance.invoke(context, term, lifted3430);
          if(term == null)
            break Fail1599;
          if(c_2040.value == null)
            break Fail1599;
          term = termFactory.makeTuple(c_2040.value, trans.const295);
          term = fopen_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1599;
          term = termFactory.makeTuple(e_2040, term);
          term = fputs_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1599;
          term = fclose_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1599;
          if(c_2040.value == null)
            break Fail1599;
          term = debug_1_0.instance.invoke(context, c_2040.value, lifted344.instance);
          if(term == null)
            break Fail1599;
          if(true)
            break Success882;
        }
        term = term890;
        IStrategoTerm f_2040 = null;
        IStrategoTerm g_2040 = null;
        IStrategoTerm l_2040 = null;
        f_2040 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail1598;
        g_2040 = term;
        l_2040 = f_2040;
        term = report_with_failure_0_2.instance.invoke(context, l_2040, trans.const313, g_2040);
        if(term == null)
          break Fail1598;
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