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

@SuppressWarnings("all") public class editor_complete_0_0 extends Strategy 
{ 
  public static editor_complete_0_0 instance = new editor_complete_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("editor_complete_0_0");
    Fail2386:
    { 
      IStrategoTerm y_2158 = null;
      IStrategoTerm z_2158 = null;
      IStrategoTerm a_2159 = null;
      IStrategoTerm b_2159 = null;
      TermReference c_2159 = new TermReference();
      TermReference d_2159 = new TermReference();
      TermReference e_2159 = new TermReference();
      IStrategoTerm i_2159 = null;
      IStrategoTerm j_2159 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 5)
        break Fail2386;
      y_2158 = term.getSubterm(2);
      z_2158 = term.getSubterm(3);
      a_2159 = term.getSubterm(4);
      term = editor_init_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail2386;
      term = termFactory.makeTuple(y_2158, z_2158, a_2159);
      i_2159 = term;
      j_2159 = trans.const478;
      term = analyze_top_0_1.instance.invoke(context, i_2159, j_2159);
      if(term == null)
        break Fail2386;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail2386;
      b_2159 = term.getSubterm(0);
      term = collect_one_1_0.instance.invoke(context, b_2159, lifted551.instance);
      if(term == null)
        break Fail2386;
      if(c_2159.value == null)
        c_2159.value = term;
      else
        if(c_2159.value != term && !c_2159.value.match(term))
          break Fail2386;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consCOMPLETION_1 != ((IStrategoAppl)term).getConstructor())
        break Fail2386;
      if(d_2159.value == null)
        d_2159.value = term.getSubterm(0);
      else
        if(d_2159.value != term.getSubterm(0) && !d_2159.value.match(term.getSubterm(0)))
          break Fail2386;
      lifted552 lifted5520 = new lifted552();
      lifted5520.c_2159 = c_2159;
      lifted5520.d_2159 = d_2159;
      lifted5520.e_2159 = e_2159;
      term = index_transaction_1_0.instance.invoke(context, term, lifted5520);
      if(term == null)
        break Fail2386;
      if(e_2159.value == null)
        break Fail2386;
      term = map_1_0.instance.invoke(context, e_2159.value, lifted553.instance);
      if(term == null)
        break Fail2386;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}