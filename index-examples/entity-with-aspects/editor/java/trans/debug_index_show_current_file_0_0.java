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

@SuppressWarnings("all") public class debug_index_show_current_file_0_0 extends Strategy 
{ 
  public static debug_index_show_current_file_0_0 instance = new debug_index_show_current_file_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("debug_index_show_current_file_0_0");
    Fail5303:
    { 
      IStrategoTerm p_12025 = null;
      IStrategoTerm q_12025 = null;
      IStrategoTerm r_12025 = null;
      IStrategoTerm s_12025 = null;
      IStrategoTerm l_12026 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 5)
        break Fail5303;
      r_12025 = term.getSubterm(3);
      p_12025 = term.getSubterm(4);
      l_12026 = term;
      IStrategoTerm term3015 = term;
      Success2965:
      { 
        Fail5304:
        { 
          IStrategoTerm m_12026 = null;
          IStrategoTerm n_12026 = null;
          IStrategoTerm p_12026 = null;
          IStrategoTerm q_12026 = null;
          IStrategoTerm s_12026 = null;
          IStrategoTerm t_12026 = null;
          IStrategoTerm w_12026 = null;
          IStrategoTerm x_12025 = null;
          IStrategoTerm z_12025 = null;
          IStrategoTerm a_12026 = null;
          IStrategoTerm f_12026 = null;
          IStrategoTerm h_12026 = null;
          IStrategoTerm i_12026 = null;
          IStrategoTerm b_12027 = null;
          p_12026 = term;
          q_12026 = trans.const998;
          m_12026 = q_12026;
          s_12026 = p_12026;
          term = (IStrategoTerm)termFactory.makeListCons(p_12025, (IStrategoList)trans.constNil3);
          n_12026 = term;
          t_12026 = s_12026;
          term = p_12025;
          IStrategoTerm term3016 = term;
          Success2966:
          { 
            Fail5305:
            { 
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail5305;
              if(true)
                break Success2966;
            }
            term = term3016;
            IStrategoTerm term3017 = term;
            Success2967:
            { 
              Fail5306:
              { 
                term = is_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail5306;
                if(true)
                  break Success2967;
              }
              term = term3017;
              IStrategoTerm term3018 = term;
              Success2968:
              { 
                Fail5307:
                { 
                  term = int_to_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail5307;
                  if(true)
                    break Success2968;
                }
                term = term3018;
                IStrategoTerm term3019 = term;
                Success2969:
                { 
                  Fail5308:
                  { 
                    term = real_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail5308;
                    if(true)
                      break Success2969;
                  }
                  term = term3019;
                  IStrategoTerm t_12025 = null;
                  IStrategoTerm u_12025 = null;
                  IStrategoTerm w_12025 = null;
                  t_12025 = term;
                  term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                  if(term == null)
                    break Fail5304;
                  if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                    break Fail5304;
                  u_12025 = ((IStrategoList)term).tail();
                  w_12025 = u_12025;
                  term = report_failure_0_2.instance.invoke(context, w_12025, trans.const1022, t_12025);
                  if(term == null)
                    break Fail5304;
                }
              }
            }
          }
          z_12025 = term;
          x_12025 = trans.const785;
          a_12026 = z_12025;
          term = string_replace_0_2.instance.invoke(context, a_12026, x_12025, trans.const785);
          if(term == null)
            break Fail5304;
          w_12026 = term;
          term = r_12025;
          IStrategoTerm term3020 = term;
          Success2970:
          { 
            Fail5309:
            { 
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail5309;
              if(true)
                break Success2970;
            }
            term = term3020;
            IStrategoTerm term3021 = term;
            Success2971:
            { 
              Fail5310:
              { 
                term = is_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail5310;
                if(true)
                  break Success2971;
              }
              term = term3021;
              IStrategoTerm term3022 = term;
              Success2972:
              { 
                Fail5311:
                { 
                  term = int_to_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail5311;
                  if(true)
                    break Success2972;
                }
                term = term3022;
                IStrategoTerm term3023 = term;
                Success2973:
                { 
                  Fail5312:
                  { 
                    term = real_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail5312;
                    if(true)
                      break Success2973;
                  }
                  term = term3023;
                  IStrategoTerm b_12026 = null;
                  IStrategoTerm c_12026 = null;
                  IStrategoTerm e_12026 = null;
                  b_12026 = term;
                  term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                  if(term == null)
                    break Fail5304;
                  if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                    break Fail5304;
                  c_12026 = ((IStrategoList)term).tail();
                  e_12026 = c_12026;
                  term = report_failure_0_2.instance.invoke(context, e_12026, trans.const1022, b_12026);
                  if(term == null)
                    break Fail5304;
                }
              }
            }
          }
          h_12026 = term;
          f_12026 = trans.const785;
          i_12026 = h_12026;
          term = string_replace_0_2.instance.invoke(context, i_12026, f_12026, trans.const968);
          if(term == null)
            break Fail5304;
          term = (IStrategoTerm)termFactory.makeListCons(w_12026, termFactory.makeListCons(trans.const932, termFactory.makeListCons(term, (IStrategoList)trans.constNil3)));
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail5304;
          term = termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil3));
          term = index_setup_0_3.instance.invoke(context, t_12026, m_12026, n_12026, term);
          if(term == null)
            break Fail5304;
          b_12027 = r_12025;
          term = guarantee_extension_0_1.instance.invoke(context, b_12027, trans.const1023);
          if(term == null)
            break Fail5304;
          q_12025 = term;
          term = index_get_all_in_file_0_0.instance.invoke(context, r_12025);
          if(term == null)
            break Fail5304;
          s_12025 = term;
          if(true)
            break Success2965;
        }
        term = term3015;
        IStrategoTerm j_12026 = null;
        IStrategoTerm k_12026 = null;
        IStrategoTerm d_12027 = null;
        j_12026 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail5303;
        k_12026 = term;
        d_12027 = j_12026;
        term = report_with_failure_0_2.instance.invoke(context, d_12027, trans.const1024, k_12026);
        if(term == null)
          break Fail5303;
      }
      term = l_12026;
      if(q_12025 == null || s_12025 == null)
        break Fail5303;
      term = termFactory.makeTuple(q_12025, s_12025);
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}