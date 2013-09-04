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

@SuppressWarnings("all") public class testgen_pointcutadvice_0_0 extends Strategy 
{ 
  public static testgen_pointcutadvice_0_0 instance = new testgen_pointcutadvice_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("testgen_pointcutadvice_0_0");
    Fail4522:
    { 
      IStrategoTerm e_11912 = null;
      IStrategoTerm f_11912 = null;
      IStrategoTerm h_11912 = null;
      IStrategoTerm i_11912 = null;
      IStrategoTerm j_11912 = null;
      IStrategoTerm k_11912 = null;
      IStrategoTerm n_11912 = null;
      n_11912 = term;
      IStrategoTerm term2470 = term;
      Success2449:
      { 
        Fail4523:
        { 
          term = random_identifier_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail4523;
          i_11912 = term;
          term = random_identifier_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail4523;
          f_11912 = term;
          term = random_identifier_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail4523;
          j_11912 = term;
          term = random_type_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail4523;
          h_11912 = term;
          term = random_identifier_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail4523;
          term = termFactory.makeAppl(Main._consPointcut_3, new IStrategoTerm[]{i_11912, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(Main._consParam_2, new IStrategoTerm[]{term, h_11912}), (IStrategoList)trans.constNil3), termFactory.makeAppl(Main._consAssigned_1, new IStrategoTerm[]{h_11912})});
          e_11912 = term;
          term = random_list_item_0_0.instance.invoke(context, trans.constCons235);
          if(term == null)
            break Fail4523;
          term = termFactory.makeAppl(Main._consAdvice_6, new IStrategoTerm[]{f_11912, term, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(Main._consParam_2, new IStrategoTerm[]{j_11912, h_11912}), (IStrategoList)trans.constNil3), i_11912, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(Main._consVar_1, new IStrategoTerm[]{j_11912}), (IStrategoList)trans.constNil3), termFactory.makeAppl(Main._consPrint_1, new IStrategoTerm[]{termFactory.makeAppl(Main._consVar_1, new IStrategoTerm[]{j_11912})})});
          k_11912 = term;
          if(true)
            break Success2449;
        }
        term = term2470;
        IStrategoTerm l_11912 = null;
        IStrategoTerm m_11912 = null;
        IStrategoTerm z_11912 = null;
        l_11912 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail4522;
        m_11912 = term;
        z_11912 = l_11912;
        term = report_with_failure_0_2.instance.invoke(context, z_11912, trans.const848, m_11912);
        if(term == null)
          break Fail4522;
      }
      term = n_11912;
      if(e_11912 == null || k_11912 == null)
        break Fail4522;
      term = (IStrategoTerm)termFactory.makeListCons(e_11912, termFactory.makeListCons(k_11912, (IStrategoList)trans.constNil3));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}