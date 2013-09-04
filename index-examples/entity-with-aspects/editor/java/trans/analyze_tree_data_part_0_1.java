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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_e_2105)
  { 
    TermReference e_2105 = new TermReference(ref_e_2105);
    context.push("analyze_tree_data_part_0_1");
    Fail2023:
    { 
      IStrategoTerm f_2105 = null;
      IStrategoTerm g_2105 = null;
      IStrategoTerm h_2105 = null;
      IStrategoTerm i_2105 = null;
      IStrategoTerm j_2105 = null;
      i_2105 = term;
      IStrategoTerm term1259 = term;
      Success1232:
      { 
        Fail2024:
        { 
          IStrategoTerm k_2105 = null;
          k_2105 = term;
          term = nam_get_definition_key_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2024;
          f_2105 = term;
          term = k_2105;
          { 
            term = f_2105;
            IStrategoList annos77 = term.getAnnotations();
            if(annos77.getTermType() != IStrategoTerm.LIST || ((IStrategoList)annos77).isEmpty())
              break Fail2023;
            IStrategoTerm arg657 = ((IStrategoList)annos77).head();
            if(arg657.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg657).isEmpty())
              break Fail2023;
            g_2105 = ((IStrategoList)arg657).head();
            h_2105 = ((IStrategoList)arg657).tail();
            IStrategoTerm arg658 = ((IStrategoList)annos77).tail();
            if(arg658.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg658).isEmpty())
              break Fail2023;
            IStrategoTerm term1260 = term;
            Success1233:
            { 
              Fail2025:
              { 
                IStrategoTerm l_2105 = null;
                l_2105 = term;
                term = i_2105;
                lifted416 lifted4160 = new lifted416();
                lifted4160.e_2105 = e_2105;
                term = adjust_index_def_data_1_2.instance.invoke(context, term, lifted4160, g_2105, h_2105);
                if(term == null)
                  break Fail2025;
                j_2105 = term;
                term = l_2105;
                { 
                  IStrategoTerm q_2105 = null;
                  q_2105 = j_2105;
                  term = fatal_err_0_1.instance.invoke(context, q_2105, trans.const423);
                  if(term == null)
                    break Fail2023;
                  if(true)
                    break Success1233;
                }
              }
              term = term1260;
            }
            if(true)
              break Success1232;
          }
        }
        term = term1259;
      }
      term = i_2105;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}