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

@SuppressWarnings("all") public class adjust_index_import_0_2 extends Strategy 
{ 
  public static adjust_index_import_0_2 instance = new adjust_index_import_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_b_2196, IStrategoTerm c_2196)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference b_2196 = new TermReference(ref_b_2196);
    context.push("adjust_index_import_0_2");
    Fail1915:
    { 
      IStrategoTerm i_2081 = null;
      TermReference j_2081 = new TermReference();
      IStrategoTerm l_2081 = null;
      IStrategoTerm o_2081 = null;
      IStrategoTerm r_2081 = null;
      IStrategoTerm s_2081 = null;
      IStrategoTerm w_2081 = null;
      IStrategoTerm x_2081 = null;
      o_2081 = term;
      IStrategoTerm term1188 = term;
      Success1167:
      { 
        Fail1916:
        { 
          if(b_2196.value == null)
            break Fail1916;
          IStrategoList list53;
          list53 = checkListTail(c_2196);
          if(list53 == null)
            break Fail1916;
          term = (IStrategoTerm)termFactory.makeListCons(b_2196.value, list53);
          if(j_2081.value == null)
            j_2081.value = term;
          else
            if(j_2081.value != term && !j_2081.value.match(term))
              break Fail1916;
          if(true)
            break Success1167;
        }
        term = term1188;
        IStrategoTerm m_2081 = null;
        IStrategoTerm n_2081 = null;
        IStrategoTerm q_2081 = null;
        m_2081 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail1915;
        n_2081 = term;
        q_2081 = m_2081;
        term = report_with_failure_0_2.instance.invoke(context, q_2081, trans.const393, n_2081);
        if(term == null)
          break Fail1915;
      }
      term = o_2081;
      r_2081 = o_2081;
      term = import_values_0_2.instance.invoke(context, term, b_2196.value, c_2196);
      if(term == null)
        break Fail1915;
      s_2081 = term;
      term = s_2081;
      lifted373 lifted3730 = new lifted373();
      lifted3730.j_2081 = j_2081;
      lifted3730.b_2196 = b_2196;
      term = mapconcat_1_0.instance.invoke(context, term, lifted3730);
      if(term == null)
        break Fail1915;
      i_2081 = term;
      term = r_2081;
      w_2081 = r_2081;
      term = import_currentfile_values_0_1.instance.invoke(context, term, b_2196.value);
      if(term == null)
        break Fail1915;
      x_2081 = term;
      term = x_2081;
      lifted374 lifted3740 = new lifted374();
      lifted3740.j_2081 = j_2081;
      lifted3740.b_2196 = b_2196;
      term = mapconcat_1_0.instance.invoke(context, term, lifted3740);
      if(term == null)
        break Fail1915;
      l_2081 = term;
      term = w_2081;
      if(b_2196.value == null)
        break Fail1915;
      IStrategoList list54;
      list54 = checkListTail(c_2196);
      if(list54 == null)
        break Fail1915;
      term = (IStrategoTerm)termFactory.makeListCons((IStrategoTerm)termFactory.makeListCons((IStrategoTerm)termFactory.makeListCons(b_2196.value, list54), (IStrategoList)trans.constNil1), termFactory.makeListCons(l_2081, termFactory.makeListCons(i_2081, (IStrategoList)trans.constNil1)));
      term = concat_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail1915;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}