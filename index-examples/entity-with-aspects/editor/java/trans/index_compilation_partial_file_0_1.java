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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm u_2087)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("index_compilation_partial_file_0_1");
    Fail1946:
    { 
      IStrategoTerm v_2087 = null;
      IStrategoTerm w_2087 = null;
      IStrategoTerm x_2087 = null;
      IStrategoTerm y_2087 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail1946;
      x_2087 = term.getSubterm(0);
      y_2087 = term.getSubterm(1);
      IStrategoTerm term1203 = term;
      Success1181:
      { 
        Fail1947:
        { 
          term = termFactory.makeAppl(Main._consAST_2, new IStrategoTerm[]{termFactory.makeTuple(u_2087, y_2087), trans.const362});
          term = index_get_all_values_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1947;
          v_2087 = term;
          Success1182:
          { 
            Fail1948:
            { 
              IStrategoTerm z_2087 = null;
              z_2087 = term;
              term = length_0_0.instance.invoke(context, v_2087);
              if(term == null)
                break Fail1948;
              if(term.getTermType() != IStrategoTerm.INT || 1 != ((IStrategoInt)term).intValue())
                break Fail1948;
              term = z_2087;
              { 
                IStrategoTerm d_2088 = null;
                term = v_2087;
                if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                  break Fail1947;
                d_2088 = ((IStrategoList)term).head();
                term = d_2088;
                w_2087 = d_2088;
                if(true)
                  break Success1182;
              }
            }
            term = try_1_0.instance.invoke(context, v_2087, _Fail.instance);
            if(term == null)
              break Fail1947;
            w_2087 = term;
          }
          term = index_compilation_ast_0_2.instance.invoke(context, w_2087, x_2087, y_2087);
          if(term == null)
            break Fail1947;
          if(true)
            break Success1181;
        }
        term = term1203;
        IStrategoTerm a_2088 = null;
        IStrategoTerm b_2088 = null;
        IStrategoTerm f_2088 = null;
        a_2088 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail1946;
        b_2088 = term;
        f_2088 = a_2088;
        term = report_with_failure_0_2.instance.invoke(context, f_2088, trans.const401, b_2088);
        if(term == null)
          break Fail1946;
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