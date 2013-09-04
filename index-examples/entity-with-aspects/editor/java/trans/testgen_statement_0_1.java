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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm h_11910)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("testgen_statement_0_1");
    Fail4516:
    { 
      IStrategoTerm i_11910 = null;
      IStrategoTerm l_11910 = null;
      l_11910 = term;
      IStrategoTerm term2466 = term;
      Success2446:
      { 
        Fail4517:
        { 
          IStrategoTerm term2467 = term;
          Success2447:
          { 
            Fail4518:
            { 
              term = testgen_expression_0_1.instance.invoke(context, term, h_11910);
              if(term == null)
                break Fail4518;
              term = termFactory.makeAppl(Main._consPrint_1, new IStrategoTerm[]{term});
              i_11910 = term;
              if(true)
                break Success2447;
            }
            term = term2467;
            term = random_string_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail4517;
            term = termFactory.makeAppl(Main._consPrint_1, new IStrategoTerm[]{termFactory.makeAppl(Main._consStringLit_1, new IStrategoTerm[]{term})});
            i_11910 = term;
          }
          if(true)
            break Success2446;
        }
        term = term2466;
        IStrategoTerm j_11910 = null;
        IStrategoTerm k_11910 = null;
        IStrategoTerm r_11910 = null;
        j_11910 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail4516;
        k_11910 = term;
        r_11910 = j_11910;
        term = report_with_failure_0_2.instance.invoke(context, r_11910, trans.const846, k_11910);
        if(term == null)
          break Fail4516;
      }
      term = l_11910;
      if(i_11910 == null)
        break Fail4516;
      term = i_11910;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}