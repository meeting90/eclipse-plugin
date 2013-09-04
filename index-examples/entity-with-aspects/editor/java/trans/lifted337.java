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

@SuppressWarnings("all") final class lifted337 extends Strategy 
{ 
  public static final lifted337 instance = new lifted337();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail2874:
    { 
      IStrategoTerm j_2033 = null;
      IStrategoTerm o_2033 = null;
      IStrategoTerm q_2033 = null;
      IStrategoTerm r_2033 = null;
      j_2033 = term;
      term = j_2033;
      IStrategoTerm term881 = term;
      Success1548:
      { 
        Fail2875:
        { 
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2875;
          if(true)
            break Success1548;
        }
        term = term881;
        IStrategoTerm term882 = term;
        Success1549:
        { 
          Fail2876:
          { 
            term = is_string_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail2876;
            if(true)
              break Success1549;
          }
          term = term882;
          IStrategoTerm term883 = term;
          Success1550:
          { 
            Fail2877:
            { 
              term = int_to_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail2877;
              if(true)
                break Success1550;
            }
            term = term883;
            IStrategoTerm term884 = term;
            Success1551:
            { 
              Fail2878:
              { 
                term = real_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail2878;
                if(true)
                  break Success1551;
              }
              term = term884;
              IStrategoTerm k_2033 = null;
              IStrategoTerm l_2033 = null;
              IStrategoTerm n_2033 = null;
              k_2033 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail2874;
              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                break Fail2874;
              l_2033 = ((IStrategoList)term).tail();
              n_2033 = l_2033;
              term = report_failure_0_2.instance.invoke(context, n_2033, trans.const264, k_2033);
              if(term == null)
                break Fail2874;
            }
          }
        }
      }
      q_2033 = term;
      o_2033 = trans.const265;
      r_2033 = q_2033;
      term = string_replace_0_2.instance.invoke(context, r_2033, o_2033, trans.const265);
      if(term == null)
        break Fail2874;
      term = (IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)trans.constCons93);
      term = concat_strings_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail2874;
      term = termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil1));
      term = read_text_file_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail2874;
      term = termFactory.makeTuple(j_2033, term);
      if(true)
        return term;
    }
    return null;
  }
}