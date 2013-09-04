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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_w_12058, IStrategoTerm x_12058)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference w_12058 = new TermReference(ref_w_12058);
    context.push("adjust_index_import_0_2");
    Fail4817:
    { 
      IStrategoTerm d_11944 = null;
      TermReference e_11944 = new TermReference();
      IStrategoTerm g_11944 = null;
      IStrategoTerm j_11944 = null;
      IStrategoTerm m_11944 = null;
      IStrategoTerm n_11944 = null;
      IStrategoTerm r_11944 = null;
      IStrategoTerm s_11944 = null;
      j_11944 = term;
      IStrategoTerm term2744 = term;
      Success2723:
      { 
        Fail4818:
        { 
          if(w_12058.value == null)
            break Fail4818;
          IStrategoList list129;
          list129 = checkListTail(x_12058);
          if(list129 == null)
            break Fail4818;
          term = (IStrategoTerm)termFactory.makeListCons(w_12058.value, list129);
          if(e_11944.value == null)
            e_11944.value = term;
          else
            if(e_11944.value != term && !e_11944.value.match(term))
              break Fail4818;
          if(true)
            break Success2723;
        }
        term = term2744;
        IStrategoTerm h_11944 = null;
        IStrategoTerm i_11944 = null;
        IStrategoTerm l_11944 = null;
        h_11944 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail4817;
        i_11944 = term;
        l_11944 = h_11944;
        term = report_with_failure_0_2.instance.invoke(context, l_11944, trans.const913, i_11944);
        if(term == null)
          break Fail4817;
      }
      term = j_11944;
      m_11944 = j_11944;
      term = import_values_0_2.instance.invoke(context, term, w_12058.value, x_12058);
      if(term == null)
        break Fail4817;
      n_11944 = term;
      term = n_11944;
      lifted973 lifted9730 = new lifted973();
      lifted9730.e_11944 = e_11944;
      lifted9730.w_12058 = w_12058;
      term = mapconcat_1_0.instance.invoke(context, term, lifted9730);
      if(term == null)
        break Fail4817;
      d_11944 = term;
      term = m_11944;
      r_11944 = m_11944;
      term = import_currentfile_values_0_1.instance.invoke(context, term, w_12058.value);
      if(term == null)
        break Fail4817;
      s_11944 = term;
      term = s_11944;
      lifted974 lifted9740 = new lifted974();
      lifted9740.e_11944 = e_11944;
      lifted9740.w_12058 = w_12058;
      term = mapconcat_1_0.instance.invoke(context, term, lifted9740);
      if(term == null)
        break Fail4817;
      g_11944 = term;
      term = r_11944;
      if(w_12058.value == null)
        break Fail4817;
      IStrategoList list130;
      list130 = checkListTail(x_12058);
      if(list130 == null)
        break Fail4817;
      term = (IStrategoTerm)termFactory.makeListCons((IStrategoTerm)termFactory.makeListCons((IStrategoTerm)termFactory.makeListCons(w_12058.value, list130), (IStrategoList)trans.constNil3), termFactory.makeListCons(g_11944, termFactory.makeListCons(d_11944, (IStrategoList)trans.constNil3)));
      term = concat_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail4817;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}