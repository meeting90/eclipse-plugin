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

@SuppressWarnings("all") public class to_java_fixadvice_0_1 extends Strategy 
{ 
  public static to_java_fixadvice_0_1 instance = new to_java_fixadvice_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_o_11937)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference o_11937 = new TermReference(ref_o_11937);
    context.push("to_java_fixadvice_0_1");
    Fail4757:
    { 
      IStrategoTerm p_11937 = null;
      IStrategoTerm q_11937 = null;
      IStrategoTerm r_11937 = null;
      IStrategoTerm s_11937 = null;
      IStrategoTerm t_11937 = null;
      IStrategoTerm u_11937 = null;
      TermReference v_11937 = new TermReference();
      IStrategoTerm w_11937 = null;
      IStrategoTerm x_11937 = null;
      IStrategoTerm a_11938 = null;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consADVICE_4 != ((IStrategoAppl)term).getConstructor())
        break Fail4757;
      p_11937 = term.getSubterm(0);
      t_11937 = term.getSubterm(1);
      q_11937 = term.getSubterm(2);
      w_11937 = term.getSubterm(3);
      a_11938 = term;
      IStrategoTerm term2698 = term;
      Success2677:
      { 
        Fail4758:
        { 
          term = index_uri_0_0.instance.invoke(context, q_11937);
          if(term == null)
            break Fail4758;
          term = termFactory.makeAppl(Main._consPointcut_2, new IStrategoTerm[]{term, trans.const882});
          term = index_get_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail4758;
          if(term.getTermType() != IStrategoTerm.APPL || Main._consPointcut_2 != ((IStrategoAppl)term).getConstructor())
            break Fail4758;
          r_11937 = term.getSubterm(1);
          term = r_11937;
          if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
            break Fail4758;
          s_11937 = ((IStrategoList)term).head();
          term = t_11937;
          if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
            break Fail4758;
          IStrategoTerm arg1458 = ((IStrategoList)term).head();
          if(arg1458.getTermType() != IStrategoTerm.APPL || Main._consParam_2 != ((IStrategoAppl)arg1458).getConstructor())
            break Fail4758;
          u_11937 = arg1458.getSubterm(0);
          term = termFactory.makeAppl(Main._consVar_1, new IStrategoTerm[]{u_11937});
          if(v_11937.value == null)
            v_11937.value = term;
          else
            if(v_11937.value != term && !v_11937.value.match(term))
              break Fail4758;
          term = w_11937;
          lifted968 lifted9680 = new lifted968();
          lifted9680.v_11937 = v_11937;
          lifted9680.o_11937 = o_11937;
          term = try_1_0.instance.invoke(context, term, lifted9680);
          if(term == null)
            break Fail4758;
          x_11937 = term;
          if(true)
            break Success2677;
        }
        term = term2698;
        IStrategoTerm y_11937 = null;
        IStrategoTerm z_11937 = null;
        IStrategoTerm e_11938 = null;
        y_11937 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail4757;
        z_11937 = term;
        e_11938 = y_11937;
        term = report_with_failure_0_2.instance.invoke(context, e_11938, trans.const904, z_11937);
        if(term == null)
          break Fail4757;
      }
      term = a_11938;
      if(s_11937 == null || x_11937 == null)
        break Fail4757;
      term = termFactory.makeTuple(p_11937, s_11937, x_11937);
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}