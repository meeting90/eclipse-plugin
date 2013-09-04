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

@SuppressWarnings("all") public class debug_index_show_all_files_0_0 extends Strategy 
{ 
  public static debug_index_show_all_files_0_0 instance = new debug_index_show_all_files_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("debug_index_show_all_files_0_0");
    Fail5313:
    { 
      IStrategoTerm j_12027 = null;
      IStrategoTerm k_12027 = null;
      IStrategoTerm l_12027 = null;
      IStrategoTerm m_12027 = null;
      IStrategoTerm g_12028 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 5)
        break Fail5313;
      k_12027 = term.getSubterm(3);
      j_12027 = term.getSubterm(4);
      g_12028 = term;
      IStrategoTerm term3024 = term;
      Success2974:
      { 
        Fail5314:
        { 
          IStrategoTerm h_12028 = null;
          IStrategoTerm i_12028 = null;
          IStrategoTerm k_12028 = null;
          IStrategoTerm l_12028 = null;
          IStrategoTerm n_12028 = null;
          IStrategoTerm o_12028 = null;
          IStrategoTerm r_12028 = null;
          IStrategoTerm r_12027 = null;
          IStrategoTerm t_12027 = null;
          IStrategoTerm u_12027 = null;
          IStrategoTerm z_12027 = null;
          IStrategoTerm b_12028 = null;
          IStrategoTerm c_12028 = null;
          IStrategoTerm w_12028 = null;
          k_12028 = term;
          l_12028 = trans.const998;
          h_12028 = l_12028;
          n_12028 = k_12028;
          term = (IStrategoTerm)termFactory.makeListCons(j_12027, (IStrategoList)trans.constNil3);
          i_12028 = term;
          o_12028 = n_12028;
          term = j_12027;
          IStrategoTerm term3025 = term;
          Success2975:
          { 
            Fail5315:
            { 
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail5315;
              if(true)
                break Success2975;
            }
            term = term3025;
            IStrategoTerm term3026 = term;
            Success2976:
            { 
              Fail5316:
              { 
                term = is_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail5316;
                if(true)
                  break Success2976;
              }
              term = term3026;
              IStrategoTerm term3027 = term;
              Success2977:
              { 
                Fail5317:
                { 
                  term = int_to_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail5317;
                  if(true)
                    break Success2977;
                }
                term = term3027;
                IStrategoTerm term3028 = term;
                Success2978:
                { 
                  Fail5318:
                  { 
                    term = real_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail5318;
                    if(true)
                      break Success2978;
                  }
                  term = term3028;
                  IStrategoTerm n_12027 = null;
                  IStrategoTerm o_12027 = null;
                  IStrategoTerm q_12027 = null;
                  n_12027 = term;
                  term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                  if(term == null)
                    break Fail5314;
                  if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                    break Fail5314;
                  o_12027 = ((IStrategoList)term).tail();
                  q_12027 = o_12027;
                  term = report_failure_0_2.instance.invoke(context, q_12027, trans.const1025, n_12027);
                  if(term == null)
                    break Fail5314;
                }
              }
            }
          }
          t_12027 = term;
          r_12027 = trans.const785;
          u_12027 = t_12027;
          term = string_replace_0_2.instance.invoke(context, u_12027, r_12027, trans.const785);
          if(term == null)
            break Fail5314;
          r_12028 = term;
          term = k_12027;
          IStrategoTerm term3029 = term;
          Success2979:
          { 
            Fail5319:
            { 
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail5319;
              if(true)
                break Success2979;
            }
            term = term3029;
            IStrategoTerm term3030 = term;
            Success2980:
            { 
              Fail5320:
              { 
                term = is_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail5320;
                if(true)
                  break Success2980;
              }
              term = term3030;
              IStrategoTerm term3031 = term;
              Success2981:
              { 
                Fail5321:
                { 
                  term = int_to_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail5321;
                  if(true)
                    break Success2981;
                }
                term = term3031;
                IStrategoTerm term3032 = term;
                Success2982:
                { 
                  Fail5322:
                  { 
                    term = real_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail5322;
                    if(true)
                      break Success2982;
                  }
                  term = term3032;
                  IStrategoTerm v_12027 = null;
                  IStrategoTerm w_12027 = null;
                  IStrategoTerm y_12027 = null;
                  v_12027 = term;
                  term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                  if(term == null)
                    break Fail5314;
                  if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                    break Fail5314;
                  w_12027 = ((IStrategoList)term).tail();
                  y_12027 = w_12027;
                  term = report_failure_0_2.instance.invoke(context, y_12027, trans.const1025, v_12027);
                  if(term == null)
                    break Fail5314;
                }
              }
            }
          }
          b_12028 = term;
          z_12027 = trans.const785;
          c_12028 = b_12028;
          term = string_replace_0_2.instance.invoke(context, c_12028, z_12027, trans.const968);
          if(term == null)
            break Fail5314;
          term = (IStrategoTerm)termFactory.makeListCons(r_12028, termFactory.makeListCons(trans.const932, termFactory.makeListCons(term, (IStrategoList)trans.constNil3)));
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail5314;
          term = termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil3));
          term = index_setup_0_3.instance.invoke(context, o_12028, h_12028, i_12028, term);
          if(term == null)
            break Fail5314;
          w_12028 = k_12027;
          term = guarantee_extension_0_1.instance.invoke(context, w_12028, trans.const1026);
          if(term == null)
            break Fail5314;
          l_12027 = term;
          term = index_get_all_files_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail5314;
          term = map_1_0.instance.invoke(context, term, lifted1154.instance);
          if(term == null)
            break Fail5314;
          m_12027 = term;
          if(true)
            break Success2974;
        }
        term = term3024;
        IStrategoTerm e_12028 = null;
        IStrategoTerm f_12028 = null;
        IStrategoTerm c_12029 = null;
        e_12028 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail5313;
        f_12028 = term;
        c_12029 = e_12028;
        term = report_with_failure_0_2.instance.invoke(context, c_12029, trans.const1027, f_12028);
        if(term == null)
          break Fail5313;
      }
      term = g_12028;
      if(l_12027 == null || m_12027 == null)
        break Fail5313;
      term = termFactory.makeTuple(l_12027, m_12027);
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}