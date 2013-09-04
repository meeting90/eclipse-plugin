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

@SuppressWarnings("all") public class testgen_statement_0_1 extends Strategy 
{ 
  public static testgen_statement_0_1 instance = new testgen_statement_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm m_2047)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("testgen_statement_0_1");
    Fail1614:
    { 
      IStrategoTerm n_2047 = null;
      IStrategoTerm q_2047 = null;
      q_2047 = term;
      IStrategoTerm term910 = term;
      Success890:
      { 
        Fail1615:
        { 
          IStrategoTerm term911 = term;
          Success891:
          { 
            Fail1616:
            { 
              term = testgen_expression_0_1.instance.invoke(context, term, m_2047);
              if(term == null)
                break Fail1616;
              term = termFactory.makeAppl(Main._consPrint_1, new IStrategoTerm[]{term});
              n_2047 = term;
              if(true)
                break Success891;
            }
            term = term911;
            term = random_string_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail1615;
            term = termFactory.makeAppl(Main._consPrint_1, new IStrategoTerm[]{termFactory.makeAppl(Main._consStringLit_1, new IStrategoTerm[]{term})});
            n_2047 = term;
          }
          if(true)
            break Success890;
        }
        term = term910;
        IStrategoTerm o_2047 = null;
        IStrategoTerm p_2047 = null;
        IStrategoTerm w_2047 = null;
        o_2047 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail1614;
        p_2047 = term;
        w_2047 = o_2047;
        term = report_with_failure_0_2.instance.invoke(context, w_2047, trans.const326, p_2047);
        if(term == null)
          break Fail1614;
      }
      term = q_2047;
      if(n_2047 == null)
        break Fail1614;
      term = n_2047;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}