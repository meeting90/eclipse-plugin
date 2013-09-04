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

@SuppressWarnings("all") public class analyze_top_0_4 extends Strategy 
{ 
  public static analyze_top_0_4 instance = new analyze_top_0_4();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm t_11985, IStrategoTerm u_11985, IStrategoTerm v_11985, IStrategoTerm w_11985)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("analyze_top_0_4");
    Fail5050:
    { 
      IStrategoTerm y_11985 = null;
      TermReference z_11985 = new TermReference();
      IStrategoTerm a_11986 = null;
      IStrategoTerm b_11986 = null;
      IStrategoTerm c_11986 = null;
      IStrategoTerm w_11986 = null;
      y_11985 = term;
      w_11986 = term;
      IStrategoTerm term2882 = term;
      Success2852:
      { 
        Fail5051:
        { 
          IStrategoTerm z_11986 = null;
          IStrategoTerm h_11986 = null;
          IStrategoTerm j_11986 = null;
          IStrategoTerm k_11986 = null;
          IStrategoTerm p_11986 = null;
          IStrategoTerm r_11986 = null;
          IStrategoTerm s_11986 = null;
          term = w_11985;
          IStrategoTerm term2883 = term;
          Success2853:
          { 
            Fail5052:
            { 
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail5052;
              if(true)
                break Success2853;
            }
            term = term2883;
            IStrategoTerm term2884 = term;
            Success2854:
            { 
              Fail5053:
              { 
                term = is_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail5053;
                if(true)
                  break Success2854;
              }
              term = term2884;
              IStrategoTerm term2885 = term;
              Success2855:
              { 
                Fail5054:
                { 
                  term = int_to_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail5054;
                  if(true)
                    break Success2855;
                }
                term = term2885;
                IStrategoTerm term2886 = term;
                Success2856:
                { 
                  Fail5055:
                  { 
                    term = real_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail5055;
                    if(true)
                      break Success2856;
                  }
                  term = term2886;
                  IStrategoTerm d_11986 = null;
                  IStrategoTerm e_11986 = null;
                  IStrategoTerm g_11986 = null;
                  d_11986 = term;
                  term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                  if(term == null)
                    break Fail5051;
                  if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                    break Fail5051;
                  e_11986 = ((IStrategoList)term).tail();
                  g_11986 = e_11986;
                  term = report_failure_0_2.instance.invoke(context, g_11986, trans.const967, d_11986);
                  if(term == null)
                    break Fail5051;
                }
              }
            }
          }
          j_11986 = term;
          h_11986 = trans.const785;
          k_11986 = j_11986;
          term = string_replace_0_2.instance.invoke(context, k_11986, h_11986, trans.const785);
          if(term == null)
            break Fail5051;
          z_11986 = term;
          term = v_11985;
          IStrategoTerm term2887 = term;
          Success2857:
          { 
            Fail5056:
            { 
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail5056;
              if(true)
                break Success2857;
            }
            term = term2887;
            IStrategoTerm term2888 = term;
            Success2858:
            { 
              Fail5057:
              { 
                term = is_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail5057;
                if(true)
                  break Success2858;
              }
              term = term2888;
              IStrategoTerm term2889 = term;
              Success2859:
              { 
                Fail5058:
                { 
                  term = int_to_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail5058;
                  if(true)
                    break Success2859;
                }
                term = term2889;
                IStrategoTerm term2890 = term;
                Success2860:
                { 
                  Fail5059:
                  { 
                    term = real_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail5059;
                    if(true)
                      break Success2860;
                  }
                  term = term2890;
                  IStrategoTerm l_11986 = null;
                  IStrategoTerm m_11986 = null;
                  IStrategoTerm o_11986 = null;
                  l_11986 = term;
                  term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                  if(term == null)
                    break Fail5051;
                  if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                    break Fail5051;
                  m_11986 = ((IStrategoList)term).tail();
                  o_11986 = m_11986;
                  term = report_failure_0_2.instance.invoke(context, o_11986, trans.const967, l_11986);
                  if(term == null)
                    break Fail5051;
                }
              }
            }
          }
          r_11986 = term;
          p_11986 = trans.const785;
          s_11986 = r_11986;
          term = string_replace_0_2.instance.invoke(context, s_11986, p_11986, trans.const968);
          if(term == null)
            break Fail5051;
          term = (IStrategoTerm)termFactory.makeListCons(z_11986, termFactory.makeListCons(trans.const932, termFactory.makeListCons(term, (IStrategoList)trans.constNil3)));
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail5051;
          term = termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil3));
          if(z_11985.value == null)
            z_11985.value = term;
          else
            if(z_11985.value != term && !z_11985.value.match(term))
              break Fail5051;
          IStrategoTerm term2891 = term;
          Success2861:
          { 
            Fail5060:
            { 
              if(true)
                break Fail5060;
              { 
                IStrategoTerm e_11987 = null;
                e_11987 = term;
                term = (IStrategoTerm)termFactory.makeListCons(w_11985, (IStrategoList)trans.constNil3);
                term = index_setup_0_3.instance.invoke(context, e_11987, u_11985, term, z_11985.value);
                if(term == null)
                  break Fail5051;
                term = index_toplevel_split_0_0.instance.invoke(context, y_11985);
                if(term == null)
                  break Fail5051;
                b_11986 = term;
                lifted1053 lifted10530 = new lifted1053();
                lifted10530.z_11985 = z_11985;
                term = map_1_0.instance.invoke(context, term, lifted10530);
                if(term == null)
                  break Fail5051;
                term = analyze_top_internal_0_4.instance.invoke(context, term, t_11985, u_11985, w_11985, z_11985.value);
                if(term == null)
                  break Fail5051;
                if(term.getTermType() != IStrategoTerm.APPL || Main._consResults_7 != ((IStrategoAppl)term).getConstructor())
                  break Fail5051;
                c_11986 = term.getSubterm(0);
                a_11986 = term.getSubterm(6);
                if(true)
                  break Success2861;
              }
            }
            term = term2891;
            if(z_11985.value == null)
              break Fail5051;
            term = (IStrategoTerm)termFactory.makeListCons(termFactory.makeTuple(y_11985, termFactory.makeTuple(z_11985.value, trans.constNil3)), (IStrategoList)trans.constNil3);
            term = analyze_top_internal_0_4.instance.invoke(context, term, t_11985, u_11985, w_11985, z_11985.value);
            if(term == null)
              break Fail5051;
            if(term.getTermType() != IStrategoTerm.APPL || Main._consResults_7 != ((IStrategoAppl)term).getConstructor())
              break Fail5051;
            b_11986 = term.getSubterm(0);
            a_11986 = term.getSubterm(6);
            term = $Hd_0_0.instance.invoke(context, b_11986);
            if(term == null)
              break Fail5051;
            c_11986 = term;
          }
          if(true)
            break Success2852;
        }
        term = term2882;
        IStrategoTerm u_11986 = null;
        IStrategoTerm v_11986 = null;
        IStrategoTerm g_11987 = null;
        u_11986 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail5050;
        v_11986 = term;
        g_11987 = u_11986;
        term = report_with_failure_0_2.instance.invoke(context, g_11987, trans.const969, v_11986);
        if(term == null)
          break Fail5050;
      }
      term = w_11986;
      if(c_11986 == null || a_11986 == null)
        break Fail5050;
      term = termFactory.makeTuple(c_11986, a_11986);
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}