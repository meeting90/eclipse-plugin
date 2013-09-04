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

@SuppressWarnings("all") public class index_compilation_partial_file_0_1 extends Strategy 
{ 
  public static index_compilation_partial_file_0_1 instance = new index_compilation_partial_file_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm p_11950)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("index_compilation_partial_file_0_1");
    Fail4848:
    { 
      IStrategoTerm q_11950 = null;
      IStrategoTerm r_11950 = null;
      IStrategoTerm s_11950 = null;
      IStrategoTerm t_11950 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail4848;
      s_11950 = term.getSubterm(0);
      t_11950 = term.getSubterm(1);
      IStrategoTerm term2759 = term;
      Success2737:
      { 
        Fail4849:
        { 
          term = termFactory.makeAppl(Main._consAST_2, new IStrategoTerm[]{termFactory.makeTuple(p_11950, t_11950), trans.const882});
          term = index_get_all_values_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail4849;
          q_11950 = term;
          Success2738:
          { 
            Fail4850:
            { 
              IStrategoTerm u_11950 = null;
              u_11950 = term;
              term = length_0_0.instance.invoke(context, q_11950);
              if(term == null)
                break Fail4850;
              if(term.getTermType() != IStrategoTerm.INT || 1 != ((IStrategoInt)term).intValue())
                break Fail4850;
              term = u_11950;
              { 
                IStrategoTerm y_11950 = null;
                term = q_11950;
                if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                  break Fail4849;
                y_11950 = ((IStrategoList)term).head();
                term = y_11950;
                r_11950 = y_11950;
                if(true)
                  break Success2738;
              }
            }
            term = try_1_0.instance.invoke(context, q_11950, _Fail.instance);
            if(term == null)
              break Fail4849;
            r_11950 = term;
          }
          term = index_compilation_ast_0_2.instance.invoke(context, r_11950, s_11950, t_11950);
          if(term == null)
            break Fail4849;
          if(true)
            break Success2737;
        }
        term = term2759;
        IStrategoTerm v_11950 = null;
        IStrategoTerm w_11950 = null;
        IStrategoTerm a_11951 = null;
        v_11950 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail4848;
        w_11950 = term;
        a_11951 = v_11950;
        term = report_with_failure_0_2.instance.invoke(context, a_11951, trans.const921, w_11950);
        if(term == null)
          break Fail4848;
      }
      term = trans.constNone0;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}