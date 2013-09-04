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

@SuppressWarnings("all") public class editor_resolve_0_0 extends Strategy 
{ 
  public static editor_resolve_0_0 instance = new editor_resolve_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("editor_resolve_0_0");
    Fail5273:
    { 
      IStrategoTerm p_12019 = null;
      IStrategoTerm q_12019 = null;
      TermReference r_12019 = new TermReference();
      TermReference s_12019 = new TermReference();
      IStrategoTerm j_12020 = null;
      IStrategoTerm k_12020 = null;
      IStrategoTerm l_12020 = null;
      IStrategoTerm n_12020 = null;
      IStrategoTerm o_12020 = null;
      IStrategoTerm q_12020 = null;
      IStrategoTerm r_12020 = null;
      IStrategoTerm u_12020 = null;
      IStrategoTerm x_12019 = null;
      IStrategoTerm z_12019 = null;
      IStrategoTerm a_12020 = null;
      IStrategoTerm f_12020 = null;
      IStrategoTerm h_12020 = null;
      IStrategoTerm i_12020 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 5)
        break Fail5273;
      if(r_12019.value == null)
        r_12019.value = term.getSubterm(0);
      else
        if(r_12019.value != term.getSubterm(0) && !r_12019.value.match(term.getSubterm(0)))
          break Fail5273;
      q_12019 = term.getSubterm(3);
      p_12019 = term.getSubterm(4);
      j_12020 = term;
      n_12020 = term;
      o_12020 = trans.const998;
      k_12020 = o_12020;
      q_12020 = n_12020;
      term = (IStrategoTerm)termFactory.makeListCons(p_12019, (IStrategoList)trans.constNil3);
      l_12020 = term;
      r_12020 = q_12020;
      term = p_12019;
      IStrategoTerm term2989 = term;
      Success2941:
      { 
        Fail5274:
        { 
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail5274;
          if(true)
            break Success2941;
        }
        term = term2989;
        IStrategoTerm term2990 = term;
        Success2942:
        { 
          Fail5275:
          { 
            term = is_string_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail5275;
            if(true)
              break Success2942;
          }
          term = term2990;
          IStrategoTerm term2991 = term;
          Success2943:
          { 
            Fail5276:
            { 
              term = int_to_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail5276;
              if(true)
                break Success2943;
            }
            term = term2991;
            IStrategoTerm term2992 = term;
            Success2944:
            { 
              Fail5277:
              { 
                term = real_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail5277;
                if(true)
                  break Success2944;
              }
              term = term2992;
              IStrategoTerm t_12019 = null;
              IStrategoTerm u_12019 = null;
              IStrategoTerm w_12019 = null;
              t_12019 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail5273;
              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                break Fail5273;
              u_12019 = ((IStrategoList)term).tail();
              w_12019 = u_12019;
              term = report_failure_0_2.instance.invoke(context, w_12019, trans.const1014, t_12019);
              if(term == null)
                break Fail5273;
            }
          }
        }
      }
      z_12019 = term;
      x_12019 = trans.const785;
      a_12020 = z_12019;
      term = string_replace_0_2.instance.invoke(context, a_12020, x_12019, trans.const785);
      if(term == null)
        break Fail5273;
      u_12020 = term;
      term = q_12019;
      IStrategoTerm term2993 = term;
      Success2945:
      { 
        Fail5278:
        { 
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail5278;
          if(true)
            break Success2945;
        }
        term = term2993;
        IStrategoTerm term2994 = term;
        Success2946:
        { 
          Fail5279:
          { 
            term = is_string_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail5279;
            if(true)
              break Success2946;
          }
          term = term2994;
          IStrategoTerm term2995 = term;
          Success2947:
          { 
            Fail5280:
            { 
              term = int_to_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail5280;
              if(true)
                break Success2947;
            }
            term = term2995;
            IStrategoTerm term2996 = term;
            Success2948:
            { 
              Fail5281:
              { 
                term = real_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail5281;
                if(true)
                  break Success2948;
              }
              term = term2996;
              IStrategoTerm b_12020 = null;
              IStrategoTerm c_12020 = null;
              IStrategoTerm e_12020 = null;
              b_12020 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail5273;
              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                break Fail5273;
              c_12020 = ((IStrategoList)term).tail();
              e_12020 = c_12020;
              term = report_failure_0_2.instance.invoke(context, e_12020, trans.const1014, b_12020);
              if(term == null)
                break Fail5273;
            }
          }
        }
      }
      h_12020 = term;
      f_12020 = trans.const785;
      i_12020 = h_12020;
      term = string_replace_0_2.instance.invoke(context, i_12020, f_12020, trans.const968);
      if(term == null)
        break Fail5273;
      term = (IStrategoTerm)termFactory.makeListCons(u_12020, termFactory.makeListCons(trans.const932, termFactory.makeListCons(term, (IStrategoList)trans.constNil3)));
      term = concat_strings_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail5273;
      term = termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil3));
      term = index_setup_0_3.instance.invoke(context, r_12020, k_12020, l_12020, term);
      if(term == null)
        break Fail5273;
      lifted1149 lifted11490 = new lifted1149();
      lifted11490.r_12019 = r_12019;
      lifted11490.s_12019 = s_12019;
      term = index_transaction_1_0.instance.invoke(context, term, lifted11490);
      if(term == null)
        break Fail5273;
      term = j_12020;
      if(s_12019.value == null)
        break Fail5273;
      term = s_12019.value;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}