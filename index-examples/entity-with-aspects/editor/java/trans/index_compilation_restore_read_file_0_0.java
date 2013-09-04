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

@SuppressWarnings("all") public class index_compilation_restore_read_file_0_0 extends Strategy 
{ 
  public static index_compilation_restore_read_file_0_0 instance = new index_compilation_restore_read_file_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("index_compilation_restore_read_file_0_0");
    Fail4868:
    { 
      IStrategoTerm term2772 = term;
      Success2750:
      { 
        Fail4869:
        { 
          IStrategoTerm k_11954 = null;
          IStrategoTerm l_11954 = null;
          IStrategoTerm m_11954 = null;
          IStrategoTerm n_11954 = null;
          if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
            break Fail4869;
          m_11954 = term.getSubterm(0);
          k_11954 = term.getSubterm(1);
          Success2751:
          { 
            Fail4870:
            { 
              IStrategoTerm o_11954 = null;
              IStrategoTerm q_11954 = null;
              IStrategoTerm s_11954 = null;
              IStrategoTerm v_11954 = null;
              o_11954 = term;
              term = m_11954;
              s_11954 = m_11954;
              term = index_compilation_read_path_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail4870;
              q_11954 = term;
              v_11954 = s_11954;
              term = string_replace_0_2.instance.invoke(context, v_11954, q_11954, trans.const829);
              if(term == null)
                break Fail4870;
              l_11954 = term;
              term = o_11954;
              { 
                term = l_11954;
                n_11954 = l_11954;
                if(true)
                  break Success2751;
              }
            }
            term = m_11954;
            n_11954 = m_11954;
          }
          term = termFactory.makeTuple(n_11954, k_11954);
          if(true)
            break Success2750;
        }
        term = term2772;
        IStrategoTerm z_11953 = null;
        IStrategoTerm a_11954 = null;
        IStrategoTerm b_11954 = null;
        a_11954 = term;
        IStrategoTerm term2774 = term;
        Success2752:
        { 
          Fail4871:
          { 
            term = is_tuple_0_0.instance.invoke(context, a_11954);
            if(term == null)
              break Fail4871;
            { 
              if(true)
                break Fail4868;
              if(true)
                break Success2752;
            }
          }
          term = term2774;
        }
        Success2753:
        { 
          Fail4872:
          { 
            IStrategoTerm c_11954 = null;
            IStrategoTerm e_11954 = null;
            IStrategoTerm g_11954 = null;
            IStrategoTerm j_11954 = null;
            c_11954 = term;
            term = a_11954;
            g_11954 = a_11954;
            term = index_compilation_read_path_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail4872;
            e_11954 = term;
            j_11954 = g_11954;
            term = string_replace_0_2.instance.invoke(context, j_11954, e_11954, trans.const829);
            if(term == null)
              break Fail4872;
            z_11953 = term;
            term = c_11954;
            { 
              term = z_11953;
              b_11954 = z_11953;
              if(true)
                break Success2753;
            }
          }
          term = a_11954;
          b_11954 = a_11954;
        }
        term = b_11954;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}