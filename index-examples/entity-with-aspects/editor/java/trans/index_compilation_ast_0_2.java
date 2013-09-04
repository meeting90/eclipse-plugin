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

@SuppressWarnings("all") public class index_compilation_ast_0_2 extends Strategy 
{ 
  public static index_compilation_ast_0_2 instance = new index_compilation_ast_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_e_11951, IStrategoTerm ref_f_11951)
  { 
    TermReference e_11951 = new TermReference(ref_e_11951);
    TermReference f_11951 = new TermReference(ref_f_11951);
    context.push("index_compilation_ast_0_2");
    Fail4851:
    { 
      TermReference g_11951 = new TermReference();
      TermReference h_11951 = new TermReference();
      TermReference i_11951 = new TermReference();
      if(g_11951.value == null)
        g_11951.value = term;
      else
        if(g_11951.value != term && !g_11951.value.match(term))
          break Fail4851;
      IStrategoTerm term2761 = term;
      Success2739:
      { 
        Fail4852:
        { 
          IStrategoTerm n_11951 = null;
          IStrategoTerm o_11951 = null;
          o_11951 = term;
          n_11951 = trans.const922;
          term = o_11951;
          lifted993 lifted9930 = new lifted993();
          lifted9930.g_11951 = g_11951;
          lifted9930.h_11951 = h_11951;
          lifted9930.i_11951 = i_11951;
          lifted9930.e_11951 = e_11951;
          lifted9930.f_11951 = f_11951;
          term = dr_scope_1_1.instance.invoke(context, term, lifted9930, n_11951);
          if(term == null)
            break Fail4852;
          if(true)
            break Success2739;
        }
        term = term2761;
        IStrategoTerm k_11951 = null;
        IStrategoTerm l_11951 = null;
        IStrategoTerm a_11952 = null;
        k_11951 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail4851;
        l_11951 = term;
        a_11952 = k_11951;
        term = report_with_failure_0_2.instance.invoke(context, a_11952, trans.const924, l_11951);
        if(term == null)
          break Fail4851;
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