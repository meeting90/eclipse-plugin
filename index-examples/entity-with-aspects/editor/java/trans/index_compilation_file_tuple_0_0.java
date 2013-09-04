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

@SuppressWarnings("all") public class index_compilation_file_tuple_0_0 extends Strategy 
{ 
  public static index_compilation_file_tuple_0_0 instance = new index_compilation_file_tuple_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("index_compilation_file_tuple_0_0");
    Fail4874:
    { 
      IStrategoTerm y_11954 = null;
      IStrategoTerm z_11954 = null;
      IStrategoTerm u_11955 = null;
      IStrategoTerm g_11955 = null;
      IStrategoTerm i_11955 = null;
      IStrategoTerm j_11955 = null;
      IStrategoTerm o_11955 = null;
      IStrategoTerm q_11955 = null;
      IStrategoTerm r_11955 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail4874;
      y_11954 = term.getSubterm(0);
      z_11954 = term.getSubterm(1);
      term = index_compilation_read_path_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail4874;
      IStrategoTerm term2776 = term;
      Success2754:
      { 
        Fail4875:
        { 
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail4875;
          if(true)
            break Success2754;
        }
        term = term2776;
        IStrategoTerm term2777 = term;
        Success2755:
        { 
          Fail4876:
          { 
            term = is_string_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail4876;
            if(true)
              break Success2755;
          }
          term = term2777;
          IStrategoTerm term2778 = term;
          Success2756:
          { 
            Fail4877:
            { 
              term = int_to_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail4877;
              if(true)
                break Success2756;
            }
            term = term2778;
            IStrategoTerm term2779 = term;
            Success2757:
            { 
              Fail4878:
              { 
                term = real_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail4878;
                if(true)
                  break Success2757;
              }
              term = term2779;
              IStrategoTerm c_11955 = null;
              IStrategoTerm d_11955 = null;
              IStrategoTerm f_11955 = null;
              c_11955 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail4874;
              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                break Fail4874;
              d_11955 = ((IStrategoList)term).tail();
              f_11955 = d_11955;
              term = report_failure_0_2.instance.invoke(context, f_11955, trans.const930, c_11955);
              if(term == null)
                break Fail4874;
            }
          }
        }
      }
      i_11955 = term;
      g_11955 = trans.const785;
      j_11955 = i_11955;
      term = string_replace_0_2.instance.invoke(context, j_11955, g_11955, trans.const785);
      if(term == null)
        break Fail4874;
      u_11955 = term;
      term = y_11954;
      IStrategoTerm term2780 = term;
      Success2758:
      { 
        Fail4879:
        { 
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail4879;
          if(true)
            break Success2758;
        }
        term = term2780;
        IStrategoTerm term2781 = term;
        Success2759:
        { 
          Fail4880:
          { 
            term = is_string_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail4880;
            if(true)
              break Success2759;
          }
          term = term2781;
          IStrategoTerm term2782 = term;
          Success2760:
          { 
            Fail4881:
            { 
              term = int_to_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail4881;
              if(true)
                break Success2760;
            }
            term = term2782;
            IStrategoTerm term2783 = term;
            Success2761:
            { 
              Fail4882:
              { 
                term = real_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail4882;
                if(true)
                  break Success2761;
              }
              term = term2783;
              IStrategoTerm k_11955 = null;
              IStrategoTerm l_11955 = null;
              IStrategoTerm n_11955 = null;
              k_11955 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail4874;
              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                break Fail4874;
              l_11955 = ((IStrategoList)term).tail();
              n_11955 = l_11955;
              term = report_failure_0_2.instance.invoke(context, n_11955, trans.const930, k_11955);
              if(term == null)
                break Fail4874;
            }
          }
        }
      }
      q_11955 = term;
      o_11955 = trans.const785;
      r_11955 = q_11955;
      term = string_replace_0_2.instance.invoke(context, r_11955, o_11955, trans.const931);
      if(term == null)
        break Fail4874;
      term = (IStrategoTerm)termFactory.makeListCons(u_11955, termFactory.makeListCons(trans.const932, termFactory.makeListCons(term, (IStrategoList)trans.constNil3)));
      term = concat_strings_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail4874;
      term = termFactory.makeTuple(termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil3)), z_11954);
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}