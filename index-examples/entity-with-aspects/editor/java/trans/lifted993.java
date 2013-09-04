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

@SuppressWarnings("all") final class lifted993 extends Strategy 
{ 
  TermReference g_11951;

  TermReference h_11951;

  TermReference i_11951;

  TermReference e_11951;

  TermReference f_11951;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail5728:
    { 
      IStrategoTerm j_11951 = null;
      IStrategoTerm r_11951 = null;
      IStrategoTerm s_11951 = null;
      IStrategoTerm u_11951 = null;
      IStrategoTerm v_11951 = null;
      IStrategoTerm w_11951 = null;
      IStrategoTerm y_11951 = null;
      term = new_iset_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail5728;
      if(h_11951.value == null)
        h_11951.value = term;
      else
        if(h_11951.value != term && !h_11951.value.match(term))
          break Fail5728;
      j_11951 = term;
      u_11951 = term;
      r_11951 = trans.const922;
      v_11951 = u_11951;
      s_11951 = trans.constCons250;
      term = v_11951;
      w_11951 = v_11951;
      if(h_11951.value == null)
        break Fail5728;
      term = termFactory.makeTuple(trans.const923, h_11951.value);
      term = dr_set_rule_0_3.instance.invoke(context, w_11951, r_11951, s_11951, term);
      if(term == null)
        break Fail5728;
      term = j_11951;
      if(g_11951.value == null)
        break Fail5728;
      term = g_11951.value;
      lifted994 lifted9940 = new lifted994();
      lifted9940.e_11951 = e_11951;
      lifted9940.f_11951 = f_11951;
      term = try_1_0.instance.invoke(context, term, lifted9940);
      if(term == null)
        break Fail5728;
      if(h_11951.value == null)
        break Fail5728;
      term = iset_elements_0_0.instance.invoke(context, h_11951.value);
      if(term == null)
        break Fail5728;
      if(i_11951.value == null)
        i_11951.value = term;
      else
        if(i_11951.value != term && !i_11951.value.match(term))
          break Fail5728;
      if(i_11951.value == null)
        break Fail5728;
      term = i_11951.value;
      y_11951 = i_11951.value;
      if(e_11951.value == null || f_11951.value == null)
        break Fail5728;
      term = termFactory.makeTuple(e_11951.value, f_11951.value);
      term = index_compilation_file_tuple_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail5728;
      term = index_add_all_0_1.instance.invoke(context, y_11951, term);
      if(term == null)
        break Fail5728;
      if(true)
        return term;
    }
    return null;
  }
}