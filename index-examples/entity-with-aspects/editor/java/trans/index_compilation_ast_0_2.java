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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_j_2088, IStrategoTerm ref_k_2088)
  { 
    TermReference j_2088 = new TermReference(ref_j_2088);
    TermReference k_2088 = new TermReference(ref_k_2088);
    context.push("index_compilation_ast_0_2");
    Fail1949:
    { 
      TermReference l_2088 = new TermReference();
      TermReference m_2088 = new TermReference();
      TermReference n_2088 = new TermReference();
      if(l_2088.value == null)
        l_2088.value = term;
      else
        if(l_2088.value != term && !l_2088.value.match(term))
          break Fail1949;
      IStrategoTerm term1205 = term;
      Success1183:
      { 
        Fail1950:
        { 
          IStrategoTerm s_2088 = null;
          IStrategoTerm t_2088 = null;
          t_2088 = term;
          s_2088 = trans.const402;
          term = t_2088;
          lifted393 lifted3930 = new lifted393();
          lifted3930.l_2088 = l_2088;
          lifted3930.m_2088 = m_2088;
          lifted3930.n_2088 = n_2088;
          lifted3930.j_2088 = j_2088;
          lifted3930.k_2088 = k_2088;
          term = dr_scope_1_1.instance.invoke(context, term, lifted3930, s_2088);
          if(term == null)
            break Fail1950;
          if(true)
            break Success1183;
        }
        term = term1205;
        IStrategoTerm p_2088 = null;
        IStrategoTerm q_2088 = null;
        IStrategoTerm f_2089 = null;
        p_2088 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail1949;
        q_2088 = term;
        f_2089 = p_2088;
        term = report_with_failure_0_2.instance.invoke(context, f_2089, trans.const404, q_2088);
        if(term == null)
          break Fail1949;
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