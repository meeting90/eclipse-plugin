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

@SuppressWarnings("all") public class import_defs_0_2 extends Strategy 
{ 
  public static import_defs_0_2 instance = new import_defs_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_y_12058, IStrategoTerm ref_z_12058)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference y_12058 = new TermReference(ref_y_12058);
    TermReference z_12058 = new TermReference(ref_z_12058);
    context.push("import_defs_0_2");
    Fail4819:
    { 
      IStrategoTerm term2745 = term;
      Success2724:
      { 
        Fail4820:
        { 
          IStrategoTerm u_11945 = null;
          IStrategoTerm v_11945 = null;
          IStrategoTerm y_11945 = null;
          IStrategoTerm z_11945 = null;
          if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
            break Fail4820;
          u_11945 = term.getSubterm(0);
          y_11945 = term.getSubterm(1);
          term = y_11945;
          IStrategoTerm term2746 = term;
          Success2725:
          { 
            Fail4821:
            { 
              term = collect_one_1_0.instance.invoke(context, term, lifted975.instance);
              if(term == null)
                break Fail4821;
              { 
                if(true)
                  break Fail4820;
                if(true)
                  break Success2725;
              }
            }
            term = term2746;
          }
          z_11945 = term;
          IStrategoTerm term2747 = term;
          Success2726:
          { 
            Fail4822:
            { 
              IStrategoTerm a_11946 = null;
              IStrategoTerm b_11946 = null;
              b_11946 = term;
              term = index_uri_path_0_0.instance.invoke(context, u_11945);
              if(term == null)
                break Fail4822;
              a_11946 = term;
              term = b_11946;
              if(y_12058.value == null)
                break Fail4822;
              IStrategoList list131;
              list131 = checkListTail(a_11946);
              if(list131 == null)
                break Fail4822;
              term = (IStrategoTerm)termFactory.makeListCons(y_12058.value, list131);
              v_11945 = term;
              if(true)
                break Success2726;
            }
            term = term2747;
            IStrategoTerm w_11945 = null;
            IStrategoTerm x_11945 = null;
            IStrategoTerm d_11946 = null;
            w_11945 = term;
            term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
            if(term == null)
              break Fail4820;
            x_11945 = term;
            d_11946 = w_11945;
            term = report_with_failure_0_2.instance.invoke(context, d_11946, trans.const914, x_11945);
            if(term == null)
              break Fail4820;
          }
          term = z_11945;
          if(v_11945 == null)
            break Fail4820;
          term = (IStrategoTerm)termFactory.makeListCons(v_11945, (IStrategoList)trans.constNil3);
          if(true)
            break Success2724;
        }
        term = term2745;
        IStrategoTerm a_11945 = null;
        IStrategoTerm b_11945 = null;
        TermReference c_11945 = new TermReference();
        IStrategoTerm e_11945 = null;
        IStrategoTerm i_11945 = null;
        IStrategoTerm j_11945 = null;
        if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
          break Fail4819;
        a_11945 = term.getSubterm(0);
        i_11945 = term.getSubterm(1);
        term = collect_one_1_0.instance.invoke(context, i_11945, lifted976.instance);
        if(term == null)
          break Fail4819;
        j_11945 = term;
        IStrategoTerm term2748 = term;
        Success2727:
        { 
          Fail4823:
          { 
            term = index_uri_path_0_0.instance.invoke(context, a_11945);
            if(term == null)
              break Fail4823;
            b_11945 = term;
            if(y_12058.value == null)
              break Fail4823;
            IStrategoList list132;
            list132 = checkListTail(b_11945);
            if(list132 == null)
              break Fail4823;
            term = (IStrategoTerm)termFactory.makeListCons(y_12058.value, list132);
            if(c_11945.value == null)
              c_11945.value = term;
            else
              if(c_11945.value != term && !c_11945.value.match(term))
                break Fail4823;
            Success2728:
            { 
              Fail4824:
              { 
                IStrategoTerm f_11945 = null;
                f_11945 = term;
                IStrategoTerm term2750 = term;
                Success2729:
                { 
                  Fail4825:
                  { 
                    if(c_11945.value == null || z_12058.value == null)
                      break Fail4825;
                    term = termFactory.makeTuple(c_11945.value, z_12058.value);
                    term = elem_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail4825;
                    { 
                      if(true)
                        break Fail4824;
                      if(true)
                        break Success2729;
                    }
                  }
                  term = term2750;
                }
                term = f_11945;
                { 
                  IStrategoTerm k_11945 = null;
                  term = import_values_0_2.instance.invoke(context, term, y_12058.value, b_11945);
                  if(term == null)
                    break Fail4823;
                  k_11945 = term;
                  term = k_11945;
                  lifted977 lifted9770 = new lifted977();
                  lifted9770.c_11945 = c_11945;
                  lifted9770.z_12058 = z_12058;
                  lifted9770.y_12058 = y_12058;
                  term = mapconcat_1_0.instance.invoke(context, term, lifted9770);
                  if(term == null)
                    break Fail4823;
                  e_11945 = term;
                  if(true)
                    break Success2728;
                }
              }
              term = trans.constNil3;
              e_11945 = trans.constNil3;
            }
            if(true)
              break Success2727;
          }
          term = term2748;
          IStrategoTerm g_11945 = null;
          IStrategoTerm h_11945 = null;
          IStrategoTerm p_11945 = null;
          g_11945 = term;
          term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
          if(term == null)
            break Fail4819;
          h_11945 = term;
          p_11945 = g_11945;
          term = report_with_failure_0_2.instance.invoke(context, p_11945, trans.const914, h_11945);
          if(term == null)
            break Fail4819;
        }
        term = j_11945;
        if(c_11945.value == null || e_11945 == null)
          break Fail4819;
        term = termFactory.makeTuple((IStrategoTerm)termFactory.makeListCons(c_11945.value, (IStrategoList)trans.constNil3), e_11945);
        term = conc_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail4819;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}