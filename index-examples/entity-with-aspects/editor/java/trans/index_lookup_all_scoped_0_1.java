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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_t_2131)
  { 
    TermReference t_2131 = new TermReference(ref_t_2131);
    context.push("index_lookup_all_scoped_0_1");
    Fail2195:
    { 
      IStrategoTerm u_2131 = null;
      IStrategoTerm v_2131 = null;
      IStrategoTerm w_2131 = null;
      IStrategoTerm x_2131 = null;
      IStrategoTerm y_2131 = null;
      IStrategoTerm n_2294 = null;
      IStrategoTerm o_2294 = null;
      IStrategoTerm p_2294 = null;
      IStrategoTerm s_2294 = null;
      IStrategoTerm t_2294 = null;
      IStrategoTerm u_2294 = null;
      u_2131 = term;
      IStrategoList annos85 = term.getAnnotations();
      if(annos85.getTermType() != IStrategoTerm.LIST || ((IStrategoList)annos85).isEmpty())
        break Fail2195;
      IStrategoTerm arg745 = ((IStrategoList)annos85).head();
      if(arg745.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg745).isEmpty())
        break Fail2195;
      v_2131 = ((IStrategoList)arg745).head();
      x_2131 = ((IStrategoList)arg745).tail();
      IStrategoTerm arg746 = ((IStrategoList)annos85).tail();
      if(arg746.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg746).isEmpty())
        break Fail2195;
      term = index_namespace_unwrap_0_0.instance.invoke(context, v_2131);
      if(term == null)
        break Fail2195;
      w_2131 = term;
      Success1318:
      { 
        Fail2196:
        { 
          IStrategoTerm a_2132 = null;
          term = x_2131;
          if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
            break Fail2196;
          a_2132 = ((IStrategoList)term).tail();
          term = a_2132;
          if(true)
            break Success1318;
        }
        term = x_2131;
      }
      y_2131 = term;
      s_2294 = u_2131;
      n_2294 = w_2131;
      t_2294 = s_2294;
      o_2294 = y_2131;
      term = t_2294;
      u_2294 = t_2294;
      if(t_2131.value == null)
        break Fail2195;
      p_2294 = t_2131.value;
      term = u_2294;
      lifted501 lifted5010 = new lifted501();
      lifted5010.t_2131 = t_2131;
      term = index_lookup_all_scoped_internal_4_3.instance.invoke(context, term, _Id.instance, _Id.instance, index_get_defs_prefix_1_2.instance, lifted5010, n_2294, o_2294, p_2294);
      if(term == null)
        break Fail2195;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}