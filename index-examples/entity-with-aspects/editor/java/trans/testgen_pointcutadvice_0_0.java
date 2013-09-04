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
    Fail1620:
    { 
      IStrategoTerm j_2049 = null;
      IStrategoTerm k_2049 = null;
      IStrategoTerm m_2049 = null;
      IStrategoTerm n_2049 = null;
      IStrategoTerm o_2049 = null;
      IStrategoTerm p_2049 = null;
      IStrategoTerm s_2049 = null;
      s_2049 = term;
      IStrategoTerm term914 = term;
      Success893:
      { 
        Fail1621:
        { 
          term = random_identifier_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1621;
          n_2049 = term;
          term = random_identifier_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1621;
          k_2049 = term;
          term = random_identifier_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1621;
          o_2049 = term;
          term = random_type_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1621;
          m_2049 = term;
          term = random_identifier_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1621;
          term = termFactory.makeAppl(Main._consPointcut_3, new IStrategoTerm[]{n_2049, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(Main._consParam_2, new IStrategoTerm[]{term, m_2049}), (IStrategoList)trans.constNil1), termFactory.makeAppl(Main._consAssigned_1, new IStrategoTerm[]{m_2049})});
          j_2049 = term;
          term = random_list_item_0_0.instance.invoke(context, trans.constCons103);
          if(term == null)
            break Fail1621;
          term = termFactory.makeAppl(Main._consAdvice_6, new IStrategoTerm[]{k_2049, term, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(Main._consParam_2, new IStrategoTerm[]{o_2049, m_2049}), (IStrategoList)trans.constNil1), n_2049, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(Main._consVar_1, new IStrategoTerm[]{o_2049}), (IStrategoList)trans.constNil1), termFactory.makeAppl(Main._consPrint_1, new IStrategoTerm[]{termFactory.makeAppl(Main._consVar_1, new IStrategoTerm[]{o_2049})})});
          p_2049 = term;
          if(true)
            break Success893;
        }
        term = term914;
        IStrategoTerm q_2049 = null;
        IStrategoTerm r_2049 = null;
        IStrategoTerm e_2050 = null;
        q_2049 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail1620;
        r_2049 = term;
        e_2050 = q_2049;
        term = report_with_failure_0_2.instance.invoke(context, e_2050, trans.const328, r_2049);
        if(term == null)
          break Fail1620;
      }
      term = s_2049;
      if(j_2049 == null || p_2049 == null)
        break Fail1620;
      term = (IStrategoTerm)termFactory.makeListCons(j_2049, termFactory.makeListCons(p_2049, (IStrategoList)trans.constNil1));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}