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

@SuppressWarnings("all") public class debug_index_clear_0_0 extends Strategy 
{ 
  public static debug_index_clear_0_0 instance = new debug_index_clear_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("debug_index_clear_0_0");
    Fail5341:
    { 
      IStrategoTerm u_12031 = null;
      IStrategoTerm v_12031 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 5)
        break Fail5341;
      v_12031 = term.getSubterm(3);
      u_12031 = term.getSubterm(4);
      IStrategoTerm term3050 = term;
      Success3000:
      { 
        Fail5342:
        { 
          IStrategoTerm p_12032 = null;
          IStrategoTerm q_12032 = null;
          IStrategoTerm s_12032 = null;
          IStrategoTerm t_12032 = null;
          IStrategoTerm v_12032 = null;
          IStrategoTerm w_12032 = null;
          IStrategoTerm z_12032 = null;
          IStrategoTerm a_12032 = null;
          IStrategoTerm c_12032 = null;
          IStrategoTerm d_12032 = null;
          IStrategoTerm i_12032 = null;
          IStrategoTerm k_12032 = null;
          IStrategoTerm l_12032 = null;
          s_12032 = term;
          t_12032 = trans.const998;
          p_12032 = t_12032;
          v_12032 = s_12032;
          term = (IStrategoTerm)termFactory.makeListCons(u_12031, (IStrategoList)trans.constNil3);
          q_12032 = term;
          w_12032 = v_12032;
          term = u_12031;
          IStrategoTerm term3051 = term;
          Success3001:
          { 
            Fail5343:
            { 
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail5343;
              if(true)
                break Success3001;
            }
            term = term3051;
            IStrategoTerm term3052 = term;
            Success3002:
            { 
              Fail5344:
              { 
                term = is_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail5344;
                if(true)
                  break Success3002;
              }
              term = term3052;
              IStrategoTerm term3053 = term;
              Success3003:
              { 
                Fail5345:
                { 
                  term = int_to_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail5345;
                  if(true)
                    break Success3003;
                }
                term = term3053;
                IStrategoTerm term3054 = term;
                Success3004:
                { 
                  Fail5346:
                  { 
                    term = real_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail5346;
                    if(true)
                      break Success3004;
                  }
                  term = term3054;
                  IStrategoTerm w_12031 = null;
                  IStrategoTerm x_12031 = null;
                  IStrategoTerm z_12031 = null;
                  w_12031 = term;
                  term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                  if(term == null)
                    break Fail5342;
                  if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                    break Fail5342;
                  x_12031 = ((IStrategoList)term).tail();
                  z_12031 = x_12031;
                  term = report_failure_0_2.instance.invoke(context, z_12031, trans.const1030, w_12031);
                  if(term == null)
                    break Fail5342;
                }
              }
            }
          }
          c_12032 = term;
          a_12032 = trans.const785;
          d_12032 = c_12032;
          term = string_replace_0_2.instance.invoke(context, d_12032, a_12032, trans.const785);
          if(term == null)
            break Fail5342;
          z_12032 = term;
          term = v_12031;
          IStrategoTerm term3055 = term;
          Success3005:
          { 
            Fail5347:
            { 
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail5347;
              if(true)
                break Success3005;
            }
            term = term3055;
            IStrategoTerm term3056 = term;
            Success3006:
            { 
              Fail5348:
              { 
                term = is_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail5348;
                if(true)
                  break Success3006;
              }
              term = term3056;
              IStrategoTerm term3057 = term;
              Success3007:
              { 
                Fail5349:
                { 
                  term = int_to_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail5349;
                  if(true)
                    break Success3007;
                }
                term = term3057;
                IStrategoTerm term3058 = term;
                Success3008:
                { 
                  Fail5350:
                  { 
                    term = real_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail5350;
                    if(true)
                      break Success3008;
                  }
                  term = term3058;
                  IStrategoTerm e_12032 = null;
                  IStrategoTerm f_12032 = null;
                  IStrategoTerm h_12032 = null;
                  e_12032 = term;
                  term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                  if(term == null)
                    break Fail5342;
                  if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                    break Fail5342;
                  f_12032 = ((IStrategoList)term).tail();
                  h_12032 = f_12032;
                  term = report_failure_0_2.instance.invoke(context, h_12032, trans.const1030, e_12032);
                  if(term == null)
                    break Fail5342;
                }
              }
            }
          }
          k_12032 = term;
          i_12032 = trans.const785;
          l_12032 = k_12032;
          term = string_replace_0_2.instance.invoke(context, l_12032, i_12032, trans.const968);
          if(term == null)
            break Fail5342;
          term = (IStrategoTerm)termFactory.makeListCons(z_12032, termFactory.makeListCons(trans.const932, termFactory.makeListCons(term, (IStrategoList)trans.constNil3)));
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail5342;
          term = termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil3));
          term = index_setup_0_3.instance.invoke(context, w_12032, p_12032, q_12032, term);
          if(term == null)
            break Fail5342;
          term = index_clear_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail5342;
          if(true)
            break Success3000;
        }
        term = term3050;
        IStrategoTerm m_12032 = null;
        IStrategoTerm n_12032 = null;
        IStrategoTerm e_12033 = null;
        m_12032 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail5341;
        n_12032 = term;
        e_12033 = m_12032;
        term = report_with_failure_0_2.instance.invoke(context, e_12033, trans.const1031, n_12032);
        if(term == null)
          break Fail5341;
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