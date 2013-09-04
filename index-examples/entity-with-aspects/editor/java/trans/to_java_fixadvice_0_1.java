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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_t_2074)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference t_2074 = new TermReference(ref_t_2074);
    context.push("to_java_fixadvice_0_1");
    Fail1855:
    { 
      IStrategoTerm u_2074 = null;
      IStrategoTerm v_2074 = null;
      IStrategoTerm w_2074 = null;
      IStrategoTerm x_2074 = null;
      IStrategoTerm y_2074 = null;
      IStrategoTerm z_2074 = null;
      TermReference a_2075 = new TermReference();
      IStrategoTerm b_2075 = null;
      IStrategoTerm c_2075 = null;
      IStrategoTerm f_2075 = null;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consADVICE_4 != ((IStrategoAppl)term).getConstructor())
        break Fail1855;
      u_2074 = term.getSubterm(0);
      y_2074 = term.getSubterm(1);
      v_2074 = term.getSubterm(2);
      b_2075 = term.getSubterm(3);
      f_2075 = term;
      IStrategoTerm term1142 = term;
      Success1121:
      { 
        Fail1856:
        { 
          term = index_uri_0_0.instance.invoke(context, v_2074);
          if(term == null)
            break Fail1856;
          term = termFactory.makeAppl(Main._consPointcut_2, new IStrategoTerm[]{term, trans.const362});
          term = index_get_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1856;
          if(term.getTermType() != IStrategoTerm.APPL || Main._consPointcut_2 != ((IStrategoAppl)term).getConstructor())
            break Fail1856;
          w_2074 = term.getSubterm(1);
          term = w_2074;
          if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
            break Fail1856;
          x_2074 = ((IStrategoList)term).head();
          term = y_2074;
          if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
            break Fail1856;
          IStrategoTerm arg604 = ((IStrategoList)term).head();
          if(arg604.getTermType() != IStrategoTerm.APPL || Main._consParam_2 != ((IStrategoAppl)arg604).getConstructor())
            break Fail1856;
          z_2074 = arg604.getSubterm(0);
          term = termFactory.makeAppl(Main._consVar_1, new IStrategoTerm[]{z_2074});
          if(a_2075.value == null)
            a_2075.value = term;
          else
            if(a_2075.value != term && !a_2075.value.match(term))
              break Fail1856;
          term = b_2075;
          lifted368 lifted3680 = new lifted368();
          lifted3680.a_2075 = a_2075;
          lifted3680.t_2074 = t_2074;
          term = try_1_0.instance.invoke(context, term, lifted3680);
          if(term == null)
            break Fail1856;
          c_2075 = term;
          if(true)
            break Success1121;
        }
        term = term1142;
        IStrategoTerm d_2075 = null;
        IStrategoTerm e_2075 = null;
        IStrategoTerm j_2075 = null;
        d_2075 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail1855;
        e_2075 = term;
        j_2075 = d_2075;
        term = report_with_failure_0_2.instance.invoke(context, j_2075, trans.const384, e_2075);
        if(term == null)
          break Fail1855;
      }
      term = f_2075;
      if(x_2074 == null || c_2075 == null)
        break Fail1855;
      term = termFactory.makeTuple(u_2074, x_2074, c_2075);
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}