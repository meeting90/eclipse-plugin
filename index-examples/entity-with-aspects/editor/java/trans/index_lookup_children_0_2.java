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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_e_2132, IStrategoTerm ref_f_2132)
  { 
    TermReference e_2132 = new TermReference(ref_e_2132);
    TermReference f_2132 = new TermReference(ref_f_2132);
    context.push("index_lookup_children_0_2");
    Fail2198:
    { 
      IStrategoTerm g_2132 = null;
      IStrategoTerm h_2132 = null;
      IStrategoTerm z_2294 = null;
      IStrategoTerm a_2295 = null;
      IStrategoTerm b_2295 = null;
      IStrategoTerm e_2295 = null;
      IStrategoTerm f_2295 = null;
      IStrategoTerm g_2295 = null;
      h_2132 = term;
      IStrategoList annos86 = term.getAnnotations();
      if(annos86.getTermType() != IStrategoTerm.LIST || ((IStrategoList)annos86).isEmpty())
        break Fail2198;
      IStrategoTerm arg748 = ((IStrategoList)annos86).head();
      if(arg748.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg748).isEmpty())
        break Fail2198;
      g_2132 = ((IStrategoList)arg748).tail();
      IStrategoTerm arg750 = ((IStrategoList)annos86).tail();
      if(arg750.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg750).isEmpty())
        break Fail2198;
      term = h_2132;
      e_2295 = h_2132;
      if(e_2132.value == null)
        break Fail2198;
      z_2294 = e_2132.value;
      f_2295 = e_2295;
      a_2295 = g_2132;
      term = f_2295;
      g_2295 = f_2295;
      if(f_2132.value == null)
        break Fail2198;
      b_2295 = f_2132.value;
      term = g_2295;
      lifted505 lifted5050 = new lifted505();
      lifted5050.f_2132 = f_2132;
      lifted5050.e_2132 = e_2132;
      term = index_lookup_all_scoped_internal_4_3.instance.invoke(context, term, _Id.instance, _Id.instance, index_get_defs_prefix_1_2.instance, lifted5050, z_2294, a_2295, b_2295);
      if(term == null)
        break Fail2198;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}