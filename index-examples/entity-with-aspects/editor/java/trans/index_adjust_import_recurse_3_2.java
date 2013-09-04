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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy h_2115, Strategy i_2115, Strategy j_2115, IStrategoTerm y_2114, IStrategoTerm z_2114)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("index_adjust_import_recurse_3_2");
    Fail2079:
    { 
      IStrategoTerm a_2115 = null;
      IStrategoTerm b_2115 = null;
      IStrategoTerm c_2115 = null;
      IStrategoTerm d_2115 = null;
      IStrategoTerm k_2115 = null;
      if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
        break Fail2079;
      a_2115 = ((IStrategoList)term).head();
      b_2115 = ((IStrategoList)term).tail();
      k_2115 = term;
      IStrategoTerm term1292 = term;
      Success1264:
      { 
        Fail2080:
        { 
          term = index_lookup_all_scoped_internal_4_3.instance.invoke(context, y_2114, _Fail.instance, h_2115, i_2115, j_2115, a_2115, b_2115, z_2114);
          if(term == null)
            break Fail2080;
          c_2115 = term;
          Success1265:
          { 
            Fail2081:
            { 
              IStrategoTerm e_2115 = null;
              e_2115 = term;
              IStrategoTerm term1294 = term;
              Success1266:
              { 
                Fail2082:
                { 
                  term = is_list_0_0.instance.invoke(context, c_2115);
                  if(term == null)
                    break Fail2082;
                  { 
                    if(true)
                      break Fail2081;
                    if(true)
                      break Success1266;
                  }
                }
                term = term1294;
              }
              term = e_2115;
              { 
                term = (IStrategoTerm)termFactory.makeListCons(c_2115, (IStrategoList)trans.constNil1);
                d_2115 = term;
                if(true)
                  break Success1265;
              }
            }
            term = c_2115;
            d_2115 = c_2115;
          }
          if(true)
            break Success1264;
        }
        term = term1292;
        IStrategoTerm f_2115 = null;
        IStrategoTerm g_2115 = null;
        IStrategoTerm m_2115 = null;
        f_2115 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail2079;
        g_2115 = term;
        m_2115 = f_2115;
        term = report_with_failure_0_2.instance.invoke(context, m_2115, trans.const439, g_2115);
        if(term == null)
          break Fail2079;
      }
      term = k_2115;
      if(d_2115 == null)
        break Fail2079;
      term = d_2115;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}