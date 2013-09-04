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

@SuppressWarnings("all") public class index_adjust_import_recurse_3_2 extends Strategy 
{ 
  public static index_adjust_import_recurse_3_2 instance = new index_adjust_import_recurse_3_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy c_11978, Strategy d_11978, Strategy e_11978, IStrategoTerm t_11977, IStrategoTerm u_11977)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("index_adjust_import_recurse_3_2");
    Fail4981:
    { 
      IStrategoTerm v_11977 = null;
      IStrategoTerm w_11977 = null;
      IStrategoTerm x_11977 = null;
      IStrategoTerm y_11977 = null;
      IStrategoTerm f_11978 = null;
      if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
        break Fail4981;
      v_11977 = ((IStrategoList)term).head();
      w_11977 = ((IStrategoList)term).tail();
      f_11978 = term;
      IStrategoTerm term2848 = term;
      Success2820:
      { 
        Fail4982:
        { 
          term = index_lookup_all_scoped_internal_4_3.instance.invoke(context, t_11977, _Fail.instance, c_11978, d_11978, e_11978, v_11977, w_11977, u_11977);
          if(term == null)
            break Fail4982;
          x_11977 = term;
          Success2821:
          { 
            Fail4983:
            { 
              IStrategoTerm z_11977 = null;
              z_11977 = term;
              IStrategoTerm term2850 = term;
              Success2822:
              { 
                Fail4984:
                { 
                  term = is_list_0_0.instance.invoke(context, x_11977);
                  if(term == null)
                    break Fail4984;
                  { 
                    if(true)
                      break Fail4983;
                    if(true)
                      break Success2822;
                  }
                }
                term = term2850;
              }
              term = z_11977;
              { 
                term = (IStrategoTerm)termFactory.makeListCons(x_11977, (IStrategoList)trans.constNil3);
                y_11977 = term;
                if(true)
                  break Success2821;
              }
            }
            term = x_11977;
            y_11977 = x_11977;
          }
          if(true)
            break Success2820;
        }
        term = term2848;
        IStrategoTerm a_11978 = null;
        IStrategoTerm b_11978 = null;
        IStrategoTerm h_11978 = null;
        a_11978 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail4981;
        b_11978 = term;
        h_11978 = a_11978;
        term = report_with_failure_0_2.instance.invoke(context, h_11978, trans.const959, b_11978);
        if(term == null)
          break Fail4981;
      }
      term = f_11978;
      if(y_11977 == null)
        break Fail4981;
      term = y_11977;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}