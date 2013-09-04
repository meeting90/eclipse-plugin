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

@SuppressWarnings("all") public class analyze_store_diff_0_2 extends Strategy 
{ 
  public static analyze_store_diff_0_2 instance = new analyze_store_diff_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm p_2110, IStrategoTerm q_2110)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("analyze_store_diff_0_2");
    Fail2054:
    { 
      IStrategoTerm t_2110 = null;
      IStrategoTerm u_2110 = null;
      IStrategoTerm v_2110 = null;
      IStrategoTerm a_2111 = null;
      t_2110 = term;
      a_2111 = term;
      IStrategoTerm term1278 = term;
      Success1251:
      { 
        Fail2055:
        { 
          term = mapconcat_1_0.instance.invoke(context, p_2110, index_get_files_of_0_0.instance);
          if(term == null)
            break Fail2055;
          v_2110 = term;
          term = index_get_dependent_files_0_0.instance.invoke(context, p_2110);
          if(term == null)
            break Fail2055;
          term = remove_all_1_0.instance.invoke(context, term, fake_file_0_0.instance);
          if(term == null)
            break Fail2055;
          term = make_set_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2055;
          u_2110 = term;
          term = filter_1_0.instance.invoke(context, t_2110, analyze_astdiff_0_0.instance);
          if(term == null)
            break Fail2055;
          term = (IStrategoTerm)termFactory.makeListCons(u_2110, termFactory.makeListCons(v_2110, termFactory.makeListCons(term, (IStrategoList)trans.constNil1)));
          term = concat_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2055;
          term = make_set_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2055;
          term = map_1_0.instance.invoke(context, term, analyze_add_compilediff_0_0.instance);
          if(term == null)
            break Fail2055;
          if(true)
            break Success1251;
        }
        term = term1278;
        IStrategoTerm y_2110 = null;
        IStrategoTerm z_2110 = null;
        IStrategoTerm c_2111 = null;
        y_2110 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail2054;
        z_2110 = term;
        c_2111 = y_2110;
        term = report_with_failure_0_2.instance.invoke(context, c_2111, trans.const433, z_2110);
        if(term == null)
          break Fail2054;
      }
      term = a_2111;
      if(u_2110 == null)
        break Fail2054;
      term = u_2110;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}