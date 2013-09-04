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

@SuppressWarnings("all") public class analyze_tree_data_part_0_1 extends Strategy 
{ 
  public static analyze_tree_data_part_0_1 instance = new analyze_tree_data_part_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_z_11967)
  { 
    TermReference z_11967 = new TermReference(ref_z_11967);
    context.push("analyze_tree_data_part_0_1");
    Fail4925:
    { 
      IStrategoTerm a_11968 = null;
      IStrategoTerm b_11968 = null;
      IStrategoTerm c_11968 = null;
      IStrategoTerm d_11968 = null;
      IStrategoTerm e_11968 = null;
      d_11968 = term;
      IStrategoTerm term2815 = term;
      Success2788:
      { 
        Fail4926:
        { 
          IStrategoTerm f_11968 = null;
          f_11968 = term;
          term = nam_get_definition_key_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail4926;
          a_11968 = term;
          term = f_11968;
          { 
            term = a_11968;
            IStrategoList annos215 = term.getAnnotations();
            if(annos215.getTermType() != IStrategoTerm.LIST || ((IStrategoList)annos215).isEmpty())
              break Fail4925;
            IStrategoTerm arg1511 = ((IStrategoList)annos215).head();
            if(arg1511.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg1511).isEmpty())
              break Fail4925;
            b_11968 = ((IStrategoList)arg1511).head();
            c_11968 = ((IStrategoList)arg1511).tail();
            IStrategoTerm arg1512 = ((IStrategoList)annos215).tail();
            if(arg1512.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg1512).isEmpty())
              break Fail4925;
            IStrategoTerm term2816 = term;
            Success2789:
            { 
              Fail4927:
              { 
                IStrategoTerm g_11968 = null;
                g_11968 = term;
                term = d_11968;
                lifted1016 lifted10160 = new lifted1016();
                lifted10160.z_11967 = z_11967;
                term = adjust_index_def_data_1_2.instance.invoke(context, term, lifted10160, b_11968, c_11968);
                if(term == null)
                  break Fail4927;
                e_11968 = term;
                term = g_11968;
                { 
                  IStrategoTerm l_11968 = null;
                  l_11968 = e_11968;
                  term = fatal_err_0_1.instance.invoke(context, l_11968, trans.const943);
                  if(term == null)
                    break Fail4925;
                  if(true)
                    break Success2789;
                }
              }
              term = term2816;
            }
            if(true)
              break Success2788;
          }
        }
        term = term2815;
      }
      term = d_11968;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}