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

@SuppressWarnings("all") public class debug_index_reload_0_0 extends Strategy 
{ 
  public static debug_index_reload_0_0 instance = new debug_index_reload_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("debug_index_reload_0_0");
    Fail5351:
    { 
      IStrategoTerm k_12033 = null;
      IStrategoTerm l_12033 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 5)
        break Fail5351;
      l_12033 = term.getSubterm(3);
      k_12033 = term.getSubterm(4);
      IStrategoTerm term3059 = term;
      Success3009:
      { 
        Fail5352:
        { 
          IStrategoTerm f_12034 = null;
          IStrategoTerm g_12034 = null;
          IStrategoTerm i_12034 = null;
          IStrategoTerm j_12034 = null;
          IStrategoTerm l_12034 = null;
          IStrategoTerm m_12034 = null;
          IStrategoTerm p_12034 = null;
          IStrategoTerm q_12033 = null;
          IStrategoTerm s_12033 = null;
          IStrategoTerm t_12033 = null;
          IStrategoTerm y_12033 = null;
          IStrategoTerm a_12034 = null;
          IStrategoTerm b_12034 = null;
          i_12034 = term;
          j_12034 = trans.const998;
          f_12034 = j_12034;
          l_12034 = i_12034;
          term = (IStrategoTerm)termFactory.makeListCons(k_12033, (IStrategoList)trans.constNil3);
          g_12034 = term;
          m_12034 = l_12034;
          term = k_12033;
          IStrategoTerm term3060 = term;
          Success3010:
          { 
            Fail5353:
            { 
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail5353;
              if(true)
                break Success3010;
            }
            term = term3060;
            IStrategoTerm term3061 = term;
            Success3011:
            { 
              Fail5354:
              { 
                term = is_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail5354;
                if(true)
                  break Success3011;
              }
              term = term3061;
              IStrategoTerm term3062 = term;
              Success3012:
              { 
                Fail5355:
                { 
                  term = int_to_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail5355;
                  if(true)
                    break Success3012;
                }
                term = term3062;
                IStrategoTerm term3063 = term;
                Success3013:
                { 
                  Fail5356:
                  { 
                    term = real_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail5356;
                    if(true)
                      break Success3013;
                  }
                  term = term3063;
                  IStrategoTerm m_12033 = null;
                  IStrategoTerm n_12033 = null;
                  IStrategoTerm p_12033 = null;
                  m_12033 = term;
                  term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                  if(term == null)
                    break Fail5352;
                  if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                    break Fail5352;
                  n_12033 = ((IStrategoList)term).tail();
                  p_12033 = n_12033;
                  term = report_failure_0_2.instance.invoke(context, p_12033, trans.const1032, m_12033);
                  if(term == null)
                    break Fail5352;
                }
              }
            }
          }
          s_12033 = term;
          q_12033 = trans.const785;
          t_12033 = s_12033;
          term = string_replace_0_2.instance.invoke(context, t_12033, q_12033, trans.const785);
          if(term == null)
            break Fail5352;
          p_12034 = term;
          term = l_12033;
          IStrategoTerm term3064 = term;
          Success3014:
          { 
            Fail5357:
            { 
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail5357;
              if(true)
                break Success3014;
            }
            term = term3064;
            IStrategoTerm term3065 = term;
            Success3015:
            { 
              Fail5358:
              { 
                term = is_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail5358;
                if(true)
                  break Success3015;
              }
              term = term3065;
              IStrategoTerm term3066 = term;
              Success3016:
              { 
                Fail5359:
                { 
                  term = int_to_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail5359;
                  if(true)
                    break Success3016;
                }
                term = term3066;
                IStrategoTerm term3067 = term;
                Success3017:
                { 
                  Fail5360:
                  { 
                    term = real_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail5360;
                    if(true)
                      break Success3017;
                  }
                  term = term3067;
                  IStrategoTerm u_12033 = null;
                  IStrategoTerm v_12033 = null;
                  IStrategoTerm x_12033 = null;
                  u_12033 = term;
                  term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                  if(term == null)
                    break Fail5352;
                  if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                    break Fail5352;
                  v_12033 = ((IStrategoList)term).tail();
                  x_12033 = v_12033;
                  term = report_failure_0_2.instance.invoke(context, x_12033, trans.const1032, u_12033);
                  if(term == null)
                    break Fail5352;
                }
              }
            }
          }
          a_12034 = term;
          y_12033 = trans.const785;
          b_12034 = a_12034;
          term = string_replace_0_2.instance.invoke(context, b_12034, y_12033, trans.const968);
          if(term == null)
            break Fail5352;
          term = (IStrategoTerm)termFactory.makeListCons(p_12034, termFactory.makeListCons(trans.const932, termFactory.makeListCons(term, (IStrategoList)trans.constNil3)));
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail5352;
          term = termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil3));
          term = index_setup_0_3.instance.invoke(context, m_12034, f_12034, g_12034, term);
          if(term == null)
            break Fail5352;
          term = index_reload_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail5352;
          if(true)
            break Success3009;
        }
        term = term3059;
        IStrategoTerm c_12034 = null;
        IStrategoTerm d_12034 = null;
        IStrategoTerm u_12034 = null;
        c_12034 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail5351;
        d_12034 = term;
        u_12034 = c_12034;
        term = report_with_failure_0_2.instance.invoke(context, u_12034, trans.const1033, d_12034);
        if(term == null)
          break Fail5351;
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