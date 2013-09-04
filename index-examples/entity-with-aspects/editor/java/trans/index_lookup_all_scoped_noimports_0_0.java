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

@SuppressWarnings("all") public class index_lookup_all_scoped_noimports_0_0 extends Strategy 
{ 
  public static index_lookup_all_scoped_noimports_0_0 instance = new index_lookup_all_scoped_noimports_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("index_lookup_all_scoped_noimports_0_0");
    Fail2193:
    { 
      IStrategoTerm l_2131 = null;
      IStrategoTerm m_2131 = null;
      IStrategoTerm n_2131 = null;
      TermReference o_2131 = new TermReference();
      IStrategoTerm p_2131 = null;
      IStrategoTerm q_2131 = null;
      n_2131 = term;
      IStrategoList annos84 = term.getAnnotations();
      if(annos84.getTermType() != IStrategoTerm.LIST || ((IStrategoList)annos84).isEmpty())
        break Fail2193;
      IStrategoTerm arg742 = ((IStrategoList)annos84).head();
      if(arg742.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg742).isEmpty())
        break Fail2193;
      l_2131 = ((IStrategoList)arg742).head();
      p_2131 = ((IStrategoList)arg742).tail();
      IStrategoTerm arg743 = ((IStrategoList)annos84).tail();
      if(arg743.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg743).isEmpty())
        break Fail2193;
      term = index_namespace_unwrap_0_0.instance.invoke(context, l_2131);
      if(term == null)
        break Fail2193;
      m_2131 = term;
      term = strip_annos_0_0.instance.invoke(context, n_2131);
      if(term == null)
        break Fail2193;
      if(o_2131.value == null)
        o_2131.value = term;
      else
        if(o_2131.value != term && !o_2131.value.match(term))
          break Fail2193;
      Success1317:
      { 
        Fail2194:
        { 
          IStrategoTerm s_2131 = null;
          term = p_2131;
          if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
            break Fail2194;
          s_2131 = ((IStrategoList)term).tail();
          term = s_2131;
          if(true)
            break Success1317;
        }
        term = p_2131;
      }
      q_2131 = term;
      term = n_2131;
      lifted497 lifted4970 = new lifted497();
      lifted4970.o_2131 = o_2131;
      term = index_lookup_all_scoped_internal_4_3.instance.invoke(context, term, _Fail.instance, _Id.instance, index_get_defs_1_2.instance, lifted4970, m_2131, q_2131, o_2131.value);
      if(term == null)
        break Fail2193;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}