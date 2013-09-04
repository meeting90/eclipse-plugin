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

@SuppressWarnings("all") public class index_lookup_children_0_2 extends Strategy 
{ 
  public static index_lookup_children_0_2 instance = new index_lookup_children_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_z_11994, IStrategoTerm ref_a_11995)
  { 
    TermReference z_11994 = new TermReference(ref_z_11994);
    TermReference a_11995 = new TermReference(ref_a_11995);
    context.push("index_lookup_children_0_2");
    Fail5100:
    { 
      IStrategoTerm b_11995 = null;
      IStrategoTerm c_11995 = null;
      IStrategoTerm u_12157 = null;
      IStrategoTerm v_12157 = null;
      IStrategoTerm w_12157 = null;
      IStrategoTerm z_12157 = null;
      IStrategoTerm a_12158 = null;
      IStrategoTerm b_12158 = null;
      c_11995 = term;
      IStrategoList annos224 = term.getAnnotations();
      if(annos224.getTermType() != IStrategoTerm.LIST || ((IStrategoList)annos224).isEmpty())
        break Fail5100;
      IStrategoTerm arg1602 = ((IStrategoList)annos224).head();
      if(arg1602.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg1602).isEmpty())
        break Fail5100;
      b_11995 = ((IStrategoList)arg1602).tail();
      IStrategoTerm arg1604 = ((IStrategoList)annos224).tail();
      if(arg1604.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg1604).isEmpty())
        break Fail5100;
      term = c_11995;
      z_12157 = c_11995;
      if(z_11994.value == null)
        break Fail5100;
      u_12157 = z_11994.value;
      a_12158 = z_12157;
      v_12157 = b_11995;
      term = a_12158;
      b_12158 = a_12158;
      if(a_11995.value == null)
        break Fail5100;
      w_12157 = a_11995.value;
      term = b_12158;
      lifted1105 lifted11050 = new lifted1105();
      lifted11050.a_11995 = a_11995;
      lifted11050.z_11994 = z_11994;
      term = index_lookup_all_scoped_internal_4_3.instance.invoke(context, term, _Id.instance, _Id.instance, index_get_defs_prefix_1_2.instance, lifted11050, u_12157, v_12157, w_12157);
      if(term == null)
        break Fail5100;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}