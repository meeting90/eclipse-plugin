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

@SuppressWarnings("all") public class index_lookup_all_scoped_0_0 extends Strategy 
{ 
  public static index_lookup_all_scoped_0_0 instance = new index_lookup_all_scoped_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("index_lookup_all_scoped_0_0");
    Fail2191:
    { 
      IStrategoTerm d_2131 = null;
      IStrategoTerm e_2131 = null;
      IStrategoTerm f_2131 = null;
      TermReference g_2131 = new TermReference();
      IStrategoTerm h_2131 = null;
      IStrategoTerm i_2131 = null;
      IStrategoTerm v_2293 = null;
      IStrategoTerm w_2293 = null;
      IStrategoTerm x_2293 = null;
      IStrategoTerm a_2294 = null;
      IStrategoTerm b_2294 = null;
      IStrategoTerm c_2294 = null;
      f_2131 = term;
      IStrategoList annos83 = term.getAnnotations();
      if(annos83.getTermType() != IStrategoTerm.LIST || ((IStrategoList)annos83).isEmpty())
        break Fail2191;
      IStrategoTerm arg739 = ((IStrategoList)annos83).head();
      if(arg739.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg739).isEmpty())
        break Fail2191;
      d_2131 = ((IStrategoList)arg739).head();
      h_2131 = ((IStrategoList)arg739).tail();
      IStrategoTerm arg740 = ((IStrategoList)annos83).tail();
      if(arg740.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg740).isEmpty())
        break Fail2191;
      term = index_namespace_unwrap_0_0.instance.invoke(context, d_2131);
      if(term == null)
        break Fail2191;
      e_2131 = term;
      term = strip_annos_0_0.instance.invoke(context, f_2131);
      if(term == null)
        break Fail2191;
      if(g_2131.value == null)
        g_2131.value = term;
      else
        if(g_2131.value != term && !g_2131.value.match(term))
          break Fail2191;
      Success1316:
      { 
        Fail2192:
        { 
          IStrategoTerm k_2131 = null;
          term = h_2131;
          if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
            break Fail2192;
          k_2131 = ((IStrategoList)term).tail();
          term = k_2131;
          if(true)
            break Success1316;
        }
        term = h_2131;
      }
      i_2131 = term;
      a_2294 = f_2131;
      v_2293 = e_2131;
      b_2294 = a_2294;
      w_2293 = i_2131;
      term = b_2294;
      c_2294 = b_2294;
      if(g_2131.value == null)
        break Fail2191;
      x_2293 = g_2131.value;
      term = c_2294;
      lifted493 lifted4930 = new lifted493();
      lifted4930.g_2131 = g_2131;
      term = index_lookup_all_scoped_internal_4_3.instance.invoke(context, term, _Id.instance, _Id.instance, index_get_defs_1_2.instance, lifted4930, v_2293, w_2293, x_2293);
      if(term == null)
        break Fail2191;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}