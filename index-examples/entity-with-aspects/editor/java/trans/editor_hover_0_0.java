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

@SuppressWarnings("all") public class editor_hover_0_0 extends Strategy 
{ 
  public static editor_hover_0_0 instance = new editor_hover_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("editor_hover_0_0");
    Fail5282:
    { 
      IStrategoTerm c_12021 = null;
      IStrategoTerm d_12021 = null;
      IStrategoTerm i_12021 = null;
      IStrategoTerm k_12021 = null;
      IStrategoTerm l_12021 = null;
      IStrategoTerm u_12160 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 5)
        break Fail5282;
      c_12021 = term.getSubterm(0);
      u_12160 = c_12021;
      term = collect_one_1_0.instance.invoke(context, u_12160, lifted1150.instance);
      if(term == null)
        break Fail5282;
      IStrategoTerm term2997 = term;
      Success2949:
      { 
        Fail5283:
        { 
          term = index_uri_impl_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail5283;
          if(true)
            break Success2949;
        }
        term = term2997;
        IStrategoTerm z_12160 = null;
        IStrategoTerm args42 = context.invokePrimitive("SSL_get_arguments", term, NO_STRATEGIES, new IStrategoTerm[]{term});
        term = args42;
        if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
          break Fail5282;
        z_12160 = ((IStrategoList)term).head();
        term = z_12160;
      }
      term = index_uri_to_string_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail5282;
      d_12021 = term;
      term = d_12021;
      IStrategoTerm term2998 = term;
      Success2950:
      { 
        Fail5284:
        { 
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail5284;
          if(true)
            break Success2950;
        }
        term = term2998;
        IStrategoTerm term2999 = term;
        Success2951:
        { 
          Fail5285:
          { 
            term = is_string_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail5285;
            if(true)
              break Success2951;
          }
          term = term2999;
          IStrategoTerm term3000 = term;
          Success2952:
          { 
            Fail5286:
            { 
              term = int_to_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail5286;
              if(true)
                break Success2952;
            }
            term = term3000;
            IStrategoTerm term3001 = term;
            Success2953:
            { 
              Fail5287:
              { 
                term = real_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail5287;
                if(true)
                  break Success2953;
              }
              term = term3001;
              IStrategoTerm e_12021 = null;
              IStrategoTerm f_12021 = null;
              IStrategoTerm h_12021 = null;
              e_12021 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail5282;
              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                break Fail5282;
              f_12021 = ((IStrategoList)term).tail();
              h_12021 = f_12021;
              term = report_failure_0_2.instance.invoke(context, h_12021, trans.const1015, e_12021);
              if(term == null)
                break Fail5282;
            }
          }
        }
      }
      k_12021 = term;
      i_12021 = trans.const785;
      l_12021 = k_12021;
      term = string_replace_0_2.instance.invoke(context, l_12021, i_12021, trans.const785);
      if(term == null)
        break Fail5282;
      term = (IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)trans.constNil3);
      term = concat_strings_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail5282;
      term = termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil3));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}