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

@SuppressWarnings("all") public class index_lookup_all_0_0 extends Strategy 
{ 
  public static index_lookup_all_0_0 instance = new index_lookup_all_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("index_lookup_all_0_0");
    Fail5091:
    { 
      IStrategoTerm m_11993 = null;
      IStrategoTerm n_11993 = null;
      IStrategoTerm o_11993 = null;
      IStrategoTerm p_11993 = null;
      TermReference q_11993 = new TermReference();
      IStrategoTerm r_12155 = null;
      IStrategoTerm s_12155 = null;
      IStrategoTerm t_12155 = null;
      IStrategoTerm w_12155 = null;
      IStrategoTerm x_12155 = null;
      IStrategoTerm y_12155 = null;
      p_11993 = term;
      IStrategoList annos219 = term.getAnnotations();
      if(annos219.getTermType() != IStrategoTerm.LIST || ((IStrategoList)annos219).isEmpty())
        break Fail5091;
      IStrategoTerm arg1589 = ((IStrategoList)annos219).head();
      if(arg1589.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg1589).isEmpty())
        break Fail5091;
      n_11993 = ((IStrategoList)arg1589).head();
      m_11993 = ((IStrategoList)arg1589).tail();
      IStrategoTerm arg1590 = ((IStrategoList)annos219).tail();
      if(arg1590.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg1590).isEmpty())
        break Fail5091;
      term = index_namespace_unwrap_0_0.instance.invoke(context, n_11993);
      if(term == null)
        break Fail5091;
      o_11993 = term;
      term = strip_annos_0_0.instance.invoke(context, p_11993);
      if(term == null)
        break Fail5091;
      if(q_11993.value == null)
        q_11993.value = term;
      else
        if(q_11993.value != term && !q_11993.value.match(term))
          break Fail5091;
      w_12155 = p_11993;
      r_12155 = o_11993;
      x_12155 = w_12155;
      s_12155 = m_11993;
      term = x_12155;
      y_12155 = x_12155;
      if(q_11993.value == null)
        break Fail5091;
      t_12155 = q_11993.value;
      term = y_12155;
      lifted1085 lifted10850 = new lifted1085();
      lifted10850.q_11993 = q_11993;
      term = index_lookup_all_internal_4_3.instance.invoke(context, term, _Id.instance, _Id.instance, index_get_defs_1_2.instance, lifted10850, r_12155, s_12155, t_12155);
      if(term == null)
        break Fail5091;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}