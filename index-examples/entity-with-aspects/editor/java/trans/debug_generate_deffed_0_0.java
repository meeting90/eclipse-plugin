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

@SuppressWarnings("all") public class debug_generate_deffed_0_0 extends Strategy 
{ 
  public static debug_generate_deffed_0_0 instance = new debug_generate_deffed_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("debug_generate_deffed_0_0");
    Fail5291:
    { 
      IStrategoTerm a_12023 = null;
      IStrategoTerm b_12023 = null;
      IStrategoTerm c_12023 = null;
      IStrategoTerm d_12023 = null;
      IStrategoTerm e_12023 = null;
      IStrategoTerm x_12023 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 5)
        break Fail5291;
      d_12023 = term.getSubterm(0);
      b_12023 = term.getSubterm(3);
      a_12023 = term.getSubterm(4);
      x_12023 = term;
      IStrategoTerm term3005 = term;
      Success2955:
      { 
        Fail5292:
        { 
          IStrategoTerm y_12023 = null;
          IStrategoTerm z_12023 = null;
          IStrategoTerm b_12024 = null;
          IStrategoTerm c_12024 = null;
          IStrategoTerm e_12024 = null;
          IStrategoTerm f_12024 = null;
          IStrategoTerm i_12024 = null;
          IStrategoTerm j_12023 = null;
          IStrategoTerm l_12023 = null;
          IStrategoTerm m_12023 = null;
          IStrategoTerm r_12023 = null;
          IStrategoTerm t_12023 = null;
          IStrategoTerm u_12023 = null;
          IStrategoTerm n_12024 = null;
          b_12024 = term;
          c_12024 = trans.const998;
          y_12023 = c_12024;
          e_12024 = b_12024;
          term = (IStrategoTerm)termFactory.makeListCons(a_12023, (IStrategoList)trans.constNil3);
          z_12023 = term;
          f_12024 = e_12024;
          term = a_12023;
          IStrategoTerm term3006 = term;
          Success2956:
          { 
            Fail5293:
            { 
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail5293;
              if(true)
                break Success2956;
            }
            term = term3006;
            IStrategoTerm term3007 = term;
            Success2957:
            { 
              Fail5294:
              { 
                term = is_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail5294;
                if(true)
                  break Success2957;
              }
              term = term3007;
              IStrategoTerm term3008 = term;
              Success2958:
              { 
                Fail5295:
                { 
                  term = int_to_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail5295;
                  if(true)
                    break Success2958;
                }
                term = term3008;
                IStrategoTerm term3009 = term;
                Success2959:
                { 
                  Fail5296:
                  { 
                    term = real_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail5296;
                    if(true)
                      break Success2959;
                  }
                  term = term3009;
                  IStrategoTerm f_12023 = null;
                  IStrategoTerm g_12023 = null;
                  IStrategoTerm i_12023 = null;
                  f_12023 = term;
                  term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                  if(term == null)
                    break Fail5292;
                  if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                    break Fail5292;
                  g_12023 = ((IStrategoList)term).tail();
                  i_12023 = g_12023;
                  term = report_failure_0_2.instance.invoke(context, i_12023, trans.const1018, f_12023);
                  if(term == null)
                    break Fail5292;
                }
              }
            }
          }
          l_12023 = term;
          j_12023 = trans.const785;
          m_12023 = l_12023;
          term = string_replace_0_2.instance.invoke(context, m_12023, j_12023, trans.const785);
          if(term == null)
            break Fail5292;
          i_12024 = term;
          term = b_12023;
          IStrategoTerm term3010 = term;
          Success2960:
          { 
            Fail5297:
            { 
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail5297;
              if(true)
                break Success2960;
            }
            term = term3010;
            IStrategoTerm term3011 = term;
            Success2961:
            { 
              Fail5298:
              { 
                term = is_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail5298;
                if(true)
                  break Success2961;
              }
              term = term3011;
              IStrategoTerm term3012 = term;
              Success2962:
              { 
                Fail5299:
                { 
                  term = int_to_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail5299;
                  if(true)
                    break Success2962;
                }
                term = term3012;
                IStrategoTerm term3013 = term;
                Success2963:
                { 
                  Fail5300:
                  { 
                    term = real_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail5300;
                    if(true)
                      break Success2963;
                  }
                  term = term3013;
                  IStrategoTerm n_12023 = null;
                  IStrategoTerm o_12023 = null;
                  IStrategoTerm q_12023 = null;
                  n_12023 = term;
                  term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                  if(term == null)
                    break Fail5292;
                  if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                    break Fail5292;
                  o_12023 = ((IStrategoList)term).tail();
                  q_12023 = o_12023;
                  term = report_failure_0_2.instance.invoke(context, q_12023, trans.const1018, n_12023);
                  if(term == null)
                    break Fail5292;
                }
              }
            }
          }
          t_12023 = term;
          r_12023 = trans.const785;
          u_12023 = t_12023;
          term = string_replace_0_2.instance.invoke(context, u_12023, r_12023, trans.const968);
          if(term == null)
            break Fail5292;
          term = (IStrategoTerm)termFactory.makeListCons(i_12024, termFactory.makeListCons(trans.const932, termFactory.makeListCons(term, (IStrategoList)trans.constNil3)));
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail5292;
          term = termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil3));
          term = index_setup_0_3.instance.invoke(context, f_12024, y_12023, z_12023, term);
          if(term == null)
            break Fail5292;
          n_12024 = b_12023;
          term = guarantee_extension_0_1.instance.invoke(context, n_12024, trans.const1016);
          if(term == null)
            break Fail5292;
          c_12023 = term;
          term = analyze_defs_0_0.instance.invoke(context, d_12023);
          if(term == null)
            break Fail5292;
          e_12023 = term;
          if(true)
            break Success2955;
        }
        term = term3005;
        IStrategoTerm v_12023 = null;
        IStrategoTerm w_12023 = null;
        IStrategoTerm p_12024 = null;
        v_12023 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail5291;
        w_12023 = term;
        p_12024 = v_12023;
        term = report_with_failure_0_2.instance.invoke(context, p_12024, trans.const1019, w_12023);
        if(term == null)
          break Fail5291;
      }
      term = x_12023;
      if(c_12023 == null || e_12023 == null)
        break Fail5291;
      term = termFactory.makeTuple(c_12023, e_12023);
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}