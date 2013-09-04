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

@SuppressWarnings("all") public class index_lookup_all_scoped_internal_4_3 extends Strategy 
{ 
  public static index_lookup_all_scoped_internal_4_3 instance = new index_lookup_all_scoped_internal_4_3();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy l_11976, Strategy m_11976, Strategy n_11976, Strategy o_11976, IStrategoTerm d_11976, IStrategoTerm e_11976, IStrategoTerm f_11976)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("index_lookup_all_scoped_internal_4_3");
    Fail4971:
    { 
      IStrategoTerm h_11976 = null;
      IStrategoTerm i_11976 = null;
      IStrategoTerm p_11976 = null;
      h_11976 = term;
      p_11976 = term;
      IStrategoTerm term2841 = term;
      Success2814:
      { 
        Fail4972:
        { 
          IStrategoTerm term2842 = term;
          Success2815:
          { 
            Fail4973:
            { 
              term = m_11976.invoke(context, term);
              if(term == null)
                break Fail4973;
              term = index_do_adjust_lookup_0_4.instance.invoke(context, h_11976, d_11976, e_11976, h_11976, f_11976);
              if(term == null)
                break Fail4973;
              term = index_get_adjust_lookup_results_3_2.instance.invoke(context, h_11976, l_11976, n_11976, o_11976, term, f_11976);
              if(term == null)
                break Fail4973;
              i_11976 = term;
              if(true)
                break Success2815;
            }
            term = term2842;
            IStrategoTerm term2843 = term;
            Success2816:
            { 
              Fail4974:
              { 
                term = l_11976.invoke(context, term);
                if(term == null)
                  break Fail4974;
                term = index_do_adjust_import_0_2.instance.invoke(context, h_11976, d_11976, e_11976);
                if(term == null)
                  break Fail4974;
                term = index_get_adjust_import_results_3_2.instance.invoke(context, h_11976, m_11976, n_11976, o_11976, term, f_11976);
                if(term == null)
                  break Fail4974;
                i_11976 = term;
                if(true)
                  break Success2816;
              }
              term = term2843;
              IStrategoList list138;
              list138 = checkListTail(e_11976);
              if(list138 == null)
                break Fail4972;
              term = (IStrategoTerm)termFactory.makeListCons(d_11976, list138);
              term = n_11976.invoke(context, term, o_11976, d_11976, f_11976);
              if(term == null)
                break Fail4972;
              i_11976 = term;
            }
          }
          if(true)
            break Success2814;
        }
        term = term2841;
        IStrategoTerm j_11976 = null;
        IStrategoTerm k_11976 = null;
        IStrategoTerm r_11976 = null;
        j_11976 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail4971;
        k_11976 = term;
        r_11976 = j_11976;
        term = report_with_failure_0_2.instance.invoke(context, r_11976, trans.const956, k_11976);
        if(term == null)
          break Fail4971;
      }
      term = p_11976;
      if(i_11976 == null)
        break Fail4971;
      term = i_11976;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}