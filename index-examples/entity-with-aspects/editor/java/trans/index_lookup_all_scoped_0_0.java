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
    Fail5093:
    { 
      IStrategoTerm y_11993 = null;
      IStrategoTerm z_11993 = null;
      IStrategoTerm a_11994 = null;
      TermReference b_11994 = new TermReference();
      IStrategoTerm c_11994 = null;
      IStrategoTerm d_11994 = null;
      IStrategoTerm q_12156 = null;
      IStrategoTerm r_12156 = null;
      IStrategoTerm s_12156 = null;
      IStrategoTerm v_12156 = null;
      IStrategoTerm w_12156 = null;
      IStrategoTerm x_12156 = null;
      a_11994 = term;
      IStrategoList annos221 = term.getAnnotations();
      if(annos221.getTermType() != IStrategoTerm.LIST || ((IStrategoList)annos221).isEmpty())
        break Fail5093;
      IStrategoTerm arg1593 = ((IStrategoList)annos221).head();
      if(arg1593.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg1593).isEmpty())
        break Fail5093;
      y_11993 = ((IStrategoList)arg1593).head();
      c_11994 = ((IStrategoList)arg1593).tail();
      IStrategoTerm arg1594 = ((IStrategoList)annos221).tail();
      if(arg1594.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg1594).isEmpty())
        break Fail5093;
      term = index_namespace_unwrap_0_0.instance.invoke(context, y_11993);
      if(term == null)
        break Fail5093;
      z_11993 = term;
      term = strip_annos_0_0.instance.invoke(context, a_11994);
      if(term == null)
        break Fail5093;
      if(b_11994.value == null)
        b_11994.value = term;
      else
        if(b_11994.value != term && !b_11994.value.match(term))
          break Fail5093;
      Success2872:
      { 
        Fail5094:
        { 
          IStrategoTerm f_11994 = null;
          term = c_11994;
          if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
            break Fail5094;
          f_11994 = ((IStrategoList)term).tail();
          term = f_11994;
          if(true)
            break Success2872;
        }
        term = c_11994;
      }
      d_11994 = term;
      v_12156 = a_11994;
      q_12156 = z_11993;
      w_12156 = v_12156;
      r_12156 = d_11994;
      term = w_12156;
      x_12156 = w_12156;
      if(b_11994.value == null)
        break Fail5093;
      s_12156 = b_11994.value;
      term = x_12156;
      lifted1093 lifted10930 = new lifted1093();
      lifted10930.b_11994 = b_11994;
      term = index_lookup_all_scoped_internal_4_3.instance.invoke(context, term, _Id.instance, _Id.instance, index_get_defs_1_2.instance, lifted10930, q_12156, r_12156, s_12156);
      if(term == null)
        break Fail5093;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}