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

@SuppressWarnings("all") final class lifted937 extends Strategy 
{ 
  public static final lifted937 instance = new lifted937();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail5776:
    { 
      IStrategoTerm e_11896 = null;
      IStrategoTerm j_11896 = null;
      IStrategoTerm l_11896 = null;
      IStrategoTerm m_11896 = null;
      e_11896 = term;
      term = e_11896;
      IStrategoTerm term2437 = term;
      Success3104:
      { 
        Fail5777:
        { 
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail5777;
          if(true)
            break Success3104;
        }
        term = term2437;
        IStrategoTerm term2438 = term;
        Success3105:
        { 
          Fail5778:
          { 
            term = is_string_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail5778;
            if(true)
              break Success3105;
          }
          term = term2438;
          IStrategoTerm term2439 = term;
          Success3106:
          { 
            Fail5779:
            { 
              term = int_to_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail5779;
              if(true)
                break Success3106;
            }
            term = term2439;
            IStrategoTerm term2440 = term;
            Success3107:
            { 
              Fail5780:
              { 
                term = real_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail5780;
                if(true)
                  break Success3107;
              }
              term = term2440;
              IStrategoTerm f_11896 = null;
              IStrategoTerm g_11896 = null;
              IStrategoTerm i_11896 = null;
              f_11896 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail5776;
              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                break Fail5776;
              g_11896 = ((IStrategoList)term).tail();
              i_11896 = g_11896;
              term = report_failure_0_2.instance.invoke(context, i_11896, trans.const784, f_11896);
              if(term == null)
                break Fail5776;
            }
          }
        }
      }
      l_11896 = term;
      j_11896 = trans.const785;
      m_11896 = l_11896;
      term = string_replace_0_2.instance.invoke(context, m_11896, j_11896, trans.const785);
      if(term == null)
        break Fail5776;
      term = (IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)trans.constCons225);
      term = concat_strings_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail5776;
      term = termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil3));
      term = read_text_file_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail5776;
      term = termFactory.makeTuple(e_11896, term);
      if(true)
        return term;
    }
    return null;
  }
}