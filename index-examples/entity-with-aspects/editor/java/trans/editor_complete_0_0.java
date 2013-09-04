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
    Fail5288:
    { 
      IStrategoTerm t_12021 = null;
      IStrategoTerm u_12021 = null;
      IStrategoTerm v_12021 = null;
      IStrategoTerm w_12021 = null;
      TermReference x_12021 = new TermReference();
      TermReference y_12021 = new TermReference();
      TermReference z_12021 = new TermReference();
      IStrategoTerm d_12022 = null;
      IStrategoTerm e_12022 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 5)
        break Fail5288;
      t_12021 = term.getSubterm(2);
      u_12021 = term.getSubterm(3);
      v_12021 = term.getSubterm(4);
      term = editor_init_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail5288;
      term = termFactory.makeTuple(t_12021, u_12021, v_12021);
      d_12022 = term;
      e_12022 = trans.const998;
      term = analyze_top_0_1.instance.invoke(context, d_12022, e_12022);
      if(term == null)
        break Fail5288;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail5288;
      w_12021 = term.getSubterm(0);
      term = collect_one_1_0.instance.invoke(context, w_12021, lifted1151.instance);
      if(term == null)
        break Fail5288;
      if(x_12021.value == null)
        x_12021.value = term;
      else
        if(x_12021.value != term && !x_12021.value.match(term))
          break Fail5288;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consCOMPLETION_1 != ((IStrategoAppl)term).getConstructor())
        break Fail5288;
      if(y_12021.value == null)
        y_12021.value = term.getSubterm(0);
      else
        if(y_12021.value != term.getSubterm(0) && !y_12021.value.match(term.getSubterm(0)))
          break Fail5288;
      lifted1152 lifted11520 = new lifted1152();
      lifted11520.x_12021 = x_12021;
      lifted11520.y_12021 = y_12021;
      lifted11520.z_12021 = z_12021;
      term = index_transaction_1_0.instance.invoke(context, term, lifted11520);
      if(term == null)
        break Fail5288;
      if(z_12021.value == null)
        break Fail5288;
      term = map_1_0.instance.invoke(context, z_12021.value, lifted1153.instance);
      if(term == null)
        break Fail5288;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}