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

@SuppressWarnings("all") final class lifted338 extends Strategy 
{ 
  public static final lifted338 instance = new lifted338();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail2879:
    { 
      IStrategoTerm s_2033 = null;
      IStrategoTerm t_2033 = null;
      IStrategoTerm y_2033 = null;
      IStrategoTerm a_2034 = null;
      IStrategoTerm b_2034 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail2879;
      s_2033 = term.getSubterm(0);
      t_2033 = term.getSubterm(1);
      term = s_2033;
      IStrategoTerm term857 = term;
      Success1552:
      { 
        Fail2880:
        { 
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2880;
          if(true)
            break Success1552;
        }
        term = term857;
        IStrategoTerm term858 = term;
        Success1553:
        { 
          Fail2881:
          { 
            term = is_string_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail2881;
            if(true)
              break Success1553;
          }
          term = term858;
          IStrategoTerm term859 = term;
          Success1554:
          { 
            Fail2882:
            { 
              term = int_to_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail2882;
              if(true)
                break Success1554;
            }
            term = term859;
            IStrategoTerm term860 = term;
            Success1555:
            { 
              Fail2883:
              { 
                term = real_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail2883;
                if(true)
                  break Success1555;
              }
              term = term860;
              IStrategoTerm u_2033 = null;
              IStrategoTerm v_2033 = null;
              IStrategoTerm x_2033 = null;
              u_2033 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail2879;
              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                break Fail2879;
              v_2033 = ((IStrategoList)term).tail();
              x_2033 = v_2033;
              term = report_failure_0_2.instance.invoke(context, x_2033, trans.const264, u_2033);
              if(term == null)
                break Fail2879;
            }
          }
        }
      }
      a_2034 = term;
      y_2033 = trans.const265;
      b_2034 = a_2034;
      term = string_replace_0_2.instance.invoke(context, b_2034, y_2033, trans.const265);
      if(term == null)
        break Fail2879;
      term = (IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)trans.constCons87);
      term = concat_strings_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail2879;
      term = termFactory.makeTuple(termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil1)), t_2033);
      term = write_lib_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail2879;
      if(true)
        return term;
    }
    return null;
  }
}