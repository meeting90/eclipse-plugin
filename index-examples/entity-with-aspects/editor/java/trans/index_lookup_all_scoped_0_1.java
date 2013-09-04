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

@SuppressWarnings("all") public class index_lookup_all_scoped_0_1 extends Strategy 
{ 
  public static index_lookup_all_scoped_0_1 instance = new index_lookup_all_scoped_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_o_11994)
  { 
    TermReference o_11994 = new TermReference(ref_o_11994);
    context.push("index_lookup_all_scoped_0_1");
    Fail5097:
    { 
      IStrategoTerm p_11994 = null;
      IStrategoTerm q_11994 = null;
      IStrategoTerm r_11994 = null;
      IStrategoTerm s_11994 = null;
      IStrategoTerm t_11994 = null;
      IStrategoTerm i_12157 = null;
      IStrategoTerm j_12157 = null;
      IStrategoTerm k_12157 = null;
      IStrategoTerm n_12157 = null;
      IStrategoTerm o_12157 = null;
      IStrategoTerm p_12157 = null;
      p_11994 = term;
      IStrategoList annos223 = term.getAnnotations();
      if(annos223.getTermType() != IStrategoTerm.LIST || ((IStrategoList)annos223).isEmpty())
        break Fail5097;
      IStrategoTerm arg1599 = ((IStrategoList)annos223).head();
      if(arg1599.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg1599).isEmpty())
        break Fail5097;
      q_11994 = ((IStrategoList)arg1599).head();
      s_11994 = ((IStrategoList)arg1599).tail();
      IStrategoTerm arg1600 = ((IStrategoList)annos223).tail();
      if(arg1600.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg1600).isEmpty())
        break Fail5097;
      term = index_namespace_unwrap_0_0.instance.invoke(context, q_11994);
      if(term == null)
        break Fail5097;
      r_11994 = term;
      Success2874:
      { 
        Fail5098:
        { 
          IStrategoTerm v_11994 = null;
          term = s_11994;
          if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
            break Fail5098;
          v_11994 = ((IStrategoList)term).tail();
          term = v_11994;
          if(true)
            break Success2874;
        }
        term = s_11994;
      }
      t_11994 = term;
      n_12157 = p_11994;
      i_12157 = r_11994;
      o_12157 = n_12157;
      j_12157 = t_11994;
      term = o_12157;
      p_12157 = o_12157;
      if(o_11994.value == null)
        break Fail5097;
      k_12157 = o_11994.value;
      term = p_12157;
      lifted1101 lifted11010 = new lifted1101();
      lifted11010.o_11994 = o_11994;
      term = index_lookup_all_scoped_internal_4_3.instance.invoke(context, term, _Id.instance, _Id.instance, index_get_defs_prefix_1_2.instance, lifted11010, i_12157, j_12157, k_12157);
      if(term == null)
        break Fail5097;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}