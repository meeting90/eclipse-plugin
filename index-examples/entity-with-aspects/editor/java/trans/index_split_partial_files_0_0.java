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

@SuppressWarnings("all") public class index_split_partial_files_0_0 extends Strategy 
{ 
  public static index_split_partial_files_0_0 instance = new index_split_partial_files_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("index_split_partial_files_0_0");
    Fail1942:
    { 
      IStrategoTerm x_2086 = null;
      IStrategoTerm y_2086 = null;
      IStrategoTerm z_2086 = null;
      IStrategoTerm c_2087 = null;
      IStrategoTerm f_2087 = null;
      IStrategoTerm g_2087 = null;
      x_2086 = term;
      c_2087 = term;
      IStrategoTerm term1200 = term;
      Success1179:
      { 
        Fail1943:
        { 
          term = partition_2_0.instance.invoke(context, x_2086, lifted389.instance, index_file_is_partial_0_0.instance);
          if(term == null)
            break Fail1943;
          if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
            break Fail1943;
          y_2086 = term.getSubterm(0);
          z_2086 = term.getSubterm(1);
          if(true)
            break Success1179;
        }
        term = term1200;
        IStrategoTerm a_2087 = null;
        IStrategoTerm b_2087 = null;
        IStrategoTerm e_2087 = null;
        a_2087 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail1942;
        b_2087 = term;
        e_2087 = a_2087;
        term = report_with_failure_0_2.instance.invoke(context, e_2087, trans.const399, b_2087);
        if(term == null)
          break Fail1942;
      }
      term = c_2087;
      g_2087 = c_2087;
      if(z_2086 == null)
        break Fail1942;
      term = make_set_0_0.instance.invoke(context, z_2086);
      if(term == null)
        break Fail1942;
      f_2087 = term;
      term = g_2087;
      if(y_2086 == null)
        break Fail1942;
      term = termFactory.makeTuple(y_2086, f_2087);
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}