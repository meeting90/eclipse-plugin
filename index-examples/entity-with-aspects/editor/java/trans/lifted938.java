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

@SuppressWarnings("all") final class lifted938 extends Strategy 
{ 
  public static final lifted938 instance = new lifted938();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail5781:
    { 
      IStrategoTerm n_11896 = null;
      IStrategoTerm o_11896 = null;
      IStrategoTerm t_11896 = null;
      IStrategoTerm v_11896 = null;
      IStrategoTerm w_11896 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail5781;
      n_11896 = term.getSubterm(0);
      o_11896 = term.getSubterm(1);
      term = n_11896;
      IStrategoTerm term2413 = term;
      Success3108:
      { 
        Fail5782:
        { 
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail5782;
          if(true)
            break Success3108;
        }
        term = term2413;
        IStrategoTerm term2414 = term;
        Success3109:
        { 
          Fail5783:
          { 
            term = is_string_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail5783;
            if(true)
              break Success3109;
          }
          term = term2414;
          IStrategoTerm term2415 = term;
          Success3110:
          { 
            Fail5784:
            { 
              term = int_to_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail5784;
              if(true)
                break Success3110;
            }
            term = term2415;
            IStrategoTerm term2416 = term;
            Success3111:
            { 
              Fail5785:
              { 
                term = real_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail5785;
                if(true)
                  break Success3111;
              }
              term = term2416;
              IStrategoTerm p_11896 = null;
              IStrategoTerm q_11896 = null;
              IStrategoTerm s_11896 = null;
              p_11896 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail5781;
              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                break Fail5781;
              q_11896 = ((IStrategoList)term).tail();
              s_11896 = q_11896;
              term = report_failure_0_2.instance.invoke(context, s_11896, trans.const784, p_11896);
              if(term == null)
                break Fail5781;
            }
          }
        }
      }
      v_11896 = term;
      t_11896 = trans.const785;
      w_11896 = v_11896;
      term = string_replace_0_2.instance.invoke(context, w_11896, t_11896, trans.const785);
      if(term == null)
        break Fail5781;
      term = (IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)trans.constCons219);
      term = concat_strings_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail5781;
      term = termFactory.makeTuple(termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil3)), o_11896);
      term = write_lib_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail5781;
      if(true)
        return term;
    }
    return null;
  }
}