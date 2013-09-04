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
    Fail4844:
    { 
      IStrategoTerm s_11949 = null;
      IStrategoTerm t_11949 = null;
      IStrategoTerm u_11949 = null;
      IStrategoTerm x_11949 = null;
      IStrategoTerm a_11950 = null;
      IStrategoTerm b_11950 = null;
      s_11949 = term;
      x_11949 = term;
      IStrategoTerm term2756 = term;
      Success2735:
      { 
        Fail4845:
        { 
          term = partition_2_0.instance.invoke(context, s_11949, lifted989.instance, index_file_is_partial_0_0.instance);
          if(term == null)
            break Fail4845;
          if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
            break Fail4845;
          t_11949 = term.getSubterm(0);
          u_11949 = term.getSubterm(1);
          if(true)
            break Success2735;
        }
        term = term2756;
        IStrategoTerm v_11949 = null;
        IStrategoTerm w_11949 = null;
        IStrategoTerm z_11949 = null;
        v_11949 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail4844;
        w_11949 = term;
        z_11949 = v_11949;
        term = report_with_failure_0_2.instance.invoke(context, z_11949, trans.const919, w_11949);
        if(term == null)
          break Fail4844;
      }
      term = x_11949;
      b_11950 = x_11949;
      if(u_11949 == null)
        break Fail4844;
      term = make_set_0_0.instance.invoke(context, u_11949);
      if(term == null)
        break Fail4844;
      a_11950 = term;
      term = b_11950;
      if(t_11949 == null)
        break Fail4844;
      term = termFactory.makeTuple(t_11949, a_11950);
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}