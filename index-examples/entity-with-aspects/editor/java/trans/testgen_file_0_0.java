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

@SuppressWarnings("all") public class testgen_file_0_0 extends Strategy 
{ 
  public static testgen_file_0_0 instance = new testgen_file_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("testgen_file_0_0");
    Fail1604:
    { 
      IStrategoTerm x_2042 = null;
      IStrategoTerm y_2042 = null;
      y_2042 = term;
      IStrategoTerm term905 = term;
      Success885:
      { 
        Fail1605:
        { 
          IStrategoTerm c_2043 = null;
          term = testgen_module_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1605;
          c_2043 = term;
          x_2042 = term;
          term = testgen_add_ast_0_1.instance.invoke(context, c_2043, y_2042);
          if(term == null)
            break Fail1605;
          term = testgen_write_file_0_1.instance.invoke(context, x_2042, y_2042);
          if(term == null)
            break Fail1605;
          if(true)
            break Success885;
        }
        term = term905;
        IStrategoTerm z_2042 = null;
        IStrategoTerm a_2043 = null;
        IStrategoTerm f_2043 = null;
        z_2042 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail1604;
        a_2043 = term;
        f_2043 = z_2042;
        term = report_with_failure_0_2.instance.invoke(context, f_2043, trans.const321, a_2043);
        if(term == null)
          break Fail1604;
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