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

@SuppressWarnings("all") public class import_cache_path_0_0 extends Strategy 
{ 
  public static import_cache_path_0_0 instance = new import_cache_path_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("import_cache_path_0_0");
    Fail5208:
    { 
      IStrategoTerm d_12010 = null;
      IStrategoTerm e_12010 = null;
      IStrategoTerm f_12010 = null;
      IStrategoTerm g_12010 = null;
      IStrategoTerm h_12010 = null;
      IStrategoTerm i_12011 = null;
      e_12010 = term;
      i_12011 = term;
      IStrategoTerm term2961 = term;
      Success2917:
      { 
        Fail5209:
        { 
          IStrategoTerm m_12010 = null;
          IStrategoTerm o_12010 = null;
          IStrategoTerm p_12010 = null;
          IStrategoTerm p_12011 = null;
          IStrategoTerm r_12011 = null;
          IStrategoTerm s_12011 = null;
          IStrategoTerm t_12011 = null;
          IStrategoTerm v_12011 = null;
          IStrategoTerm w_12011 = null;
          IStrategoTerm x_12011 = null;
          IStrategoTerm z_12011 = null;
          IStrategoTerm a_12012 = null;
          IStrategoTerm d_12012 = null;
          IStrategoTerm u_12010 = null;
          IStrategoTerm w_12010 = null;
          IStrategoTerm x_12010 = null;
          IStrategoTerm c_12011 = null;
          IStrategoTerm e_12011 = null;
          IStrategoTerm f_12011 = null;
          term = project_path_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail5209;
          d_12010 = term;
          term = d_12010;
          IStrategoTerm term2962 = term;
          Success2918:
          { 
            Fail5210:
            { 
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail5210;
              if(true)
                break Success2918;
            }
            term = term2962;
            IStrategoTerm term2963 = term;
            Success2919:
            { 
              Fail5211:
              { 
                term = is_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail5211;
                if(true)
                  break Success2919;
              }
              term = term2963;
              IStrategoTerm term2964 = term;
              Success2920:
              { 
                Fail5212:
                { 
                  term = int_to_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail5212;
                  if(true)
                    break Success2920;
                }
                term = term2964;
                IStrategoTerm term2965 = term;
                Success2921:
                { 
                  Fail5213:
                  { 
                    term = real_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail5213;
                    if(true)
                      break Success2921;
                  }
                  term = term2965;
                  IStrategoTerm i_12010 = null;
                  IStrategoTerm j_12010 = null;
                  IStrategoTerm l_12010 = null;
                  i_12010 = term;
                  term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                  if(term == null)
                    break Fail5209;
                  if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                    break Fail5209;
                  j_12010 = ((IStrategoList)term).tail();
                  l_12010 = j_12010;
                  term = report_failure_0_2.instance.invoke(context, l_12010, trans.const1004, i_12010);
                  if(term == null)
                    break Fail5209;
                }
              }
            }
          }
          o_12010 = term;
          m_12010 = trans.const785;
          p_12010 = o_12010;
          term = string_replace_0_2.instance.invoke(context, p_12010, m_12010, trans.const785);
          if(term == null)
            break Fail5209;
          term = (IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)trans.constCons261);
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail5209;
          term = termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil3));
          IStrategoTerm term2966 = term;
          Success2922:
          { 
            Fail5214:
            { 
              term = file_exists_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail5214;
              if(true)
                break Success2922;
            }
            term = mkdir_0_0.instance.invoke(context, term2966);
            if(term == null)
              break Fail5209;
          }
          f_12010 = term;
          r_12011 = e_12010;
          p_12011 = trans.const932;
          s_12011 = r_12011;
          term = string_replace_0_2.instance.invoke(context, s_12011, p_12011, trans.const1006);
          if(term == null)
            break Fail5209;
          v_12011 = term;
          t_12011 = trans.const812;
          w_12011 = v_12011;
          term = string_replace_0_2.instance.invoke(context, w_12011, t_12011, trans.const1006);
          if(term == null)
            break Fail5209;
          z_12011 = term;
          x_12011 = trans.const1007;
          a_12012 = z_12011;
          term = string_replace_0_2.instance.invoke(context, a_12012, x_12011, trans.const1006);
          if(term == null)
            break Fail5209;
          g_12010 = term;
          term = f_12010;
          IStrategoTerm term2967 = term;
          Success2923:
          { 
            Fail5215:
            { 
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail5215;
              if(true)
                break Success2923;
            }
            term = term2967;
            IStrategoTerm term2968 = term;
            Success2924:
            { 
              Fail5216:
              { 
                term = is_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail5216;
                if(true)
                  break Success2924;
              }
              term = term2968;
              IStrategoTerm term2969 = term;
              Success2925:
              { 
                Fail5217:
                { 
                  term = int_to_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail5217;
                  if(true)
                    break Success2925;
                }
                term = term2969;
                IStrategoTerm term2970 = term;
                Success2926:
                { 
                  Fail5218:
                  { 
                    term = real_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail5218;
                    if(true)
                      break Success2926;
                  }
                  term = term2970;
                  IStrategoTerm q_12010 = null;
                  IStrategoTerm r_12010 = null;
                  IStrategoTerm t_12010 = null;
                  q_12010 = term;
                  term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                  if(term == null)
                    break Fail5209;
                  if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                    break Fail5209;
                  r_12010 = ((IStrategoList)term).tail();
                  t_12010 = r_12010;
                  term = report_failure_0_2.instance.invoke(context, t_12010, trans.const1004, q_12010);
                  if(term == null)
                    break Fail5209;
                }
              }
            }
          }
          w_12010 = term;
          u_12010 = trans.const785;
          x_12010 = w_12010;
          term = string_replace_0_2.instance.invoke(context, x_12010, u_12010, trans.const785);
          if(term == null)
            break Fail5209;
          d_12012 = term;
          term = g_12010;
          IStrategoTerm term2971 = term;
          Success2927:
          { 
            Fail5219:
            { 
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail5219;
              if(true)
                break Success2927;
            }
            term = term2971;
            IStrategoTerm term2972 = term;
            Success2928:
            { 
              Fail5220:
              { 
                term = is_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail5220;
                if(true)
                  break Success2928;
              }
              term = term2972;
              IStrategoTerm term2973 = term;
              Success2929:
              { 
                Fail5221:
                { 
                  term = int_to_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail5221;
                  if(true)
                    break Success2929;
                }
                term = term2973;
                IStrategoTerm term2974 = term;
                Success2930:
                { 
                  Fail5222:
                  { 
                    term = real_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail5222;
                    if(true)
                      break Success2930;
                  }
                  term = term2974;
                  IStrategoTerm y_12010 = null;
                  IStrategoTerm z_12010 = null;
                  IStrategoTerm b_12011 = null;
                  y_12010 = term;
                  term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                  if(term == null)
                    break Fail5209;
                  if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                    break Fail5209;
                  z_12010 = ((IStrategoList)term).tail();
                  b_12011 = z_12010;
                  term = report_failure_0_2.instance.invoke(context, b_12011, trans.const1004, y_12010);
                  if(term == null)
                    break Fail5209;
                }
              }
            }
          }
          e_12011 = term;
          c_12011 = trans.const785;
          f_12011 = e_12011;
          term = string_replace_0_2.instance.invoke(context, f_12011, c_12011, trans.const874);
          if(term == null)
            break Fail5209;
          term = (IStrategoTerm)termFactory.makeListCons(d_12012, termFactory.makeListCons(trans.const932, termFactory.makeListCons(term, (IStrategoList)trans.constCons262)));
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail5209;
          term = termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil3));
          h_12010 = term;
          if(true)
            break Success2917;
        }
        term = term2961;
        IStrategoTerm g_12011 = null;
        IStrategoTerm h_12011 = null;
        IStrategoTerm i_12012 = null;
        g_12011 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail5208;
        h_12011 = term;
        i_12012 = g_12011;
        term = report_with_failure_0_2.instance.invoke(context, i_12012, trans.const1009, h_12011);
        if(term == null)
          break Fail5208;
      }
      term = i_12011;
      if(h_12010 == null)
        break Fail5208;
      term = h_12010;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}