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

@SuppressWarnings("all") public class $A$D$V$I$C$E_4_0 extends Strategy 
{ 
  public static $A$D$V$I$C$E_4_0 instance = new $A$D$V$I$C$E_4_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy a_12038, Strategy b_12038, Strategy c_12038, Strategy d_12038)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ADVICE_4_0");
    Fail5391:
    { 
      IStrategoTerm f_12146 = null;
      IStrategoTerm b_12146 = null;
      IStrategoTerm c_12146 = null;
      IStrategoTerm d_12146 = null;
      IStrategoTerm e_12146 = null;
      IStrategoTerm g_12146 = null;
      IStrategoTerm h_12146 = null;
      IStrategoTerm i_12146 = null;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consADVICE_4 != ((IStrategoAppl)term).getConstructor())
        break Fail5391;
      b_12146 = term.getSubterm(0);
      c_12146 = term.getSubterm(1);
      d_12146 = term.getSubterm(2);
      e_12146 = term.getSubterm(3);
      IStrategoList annos232 = term.getAnnotations();
      f_12146 = annos232;
      term = a_12038.invoke(context, b_12146);
      if(term == null)
        break Fail5391;
      g_12146 = term;
      term = b_12038.invoke(context, c_12146);
      if(term == null)
        break Fail5391;
      h_12146 = term;
      term = c_12038.invoke(context, d_12146);
      if(term == null)
        break Fail5391;
      i_12146 = term;
      term = d_12038.invoke(context, e_12146);
      if(term == null)
        break Fail5391;
      term = termFactory.annotateTerm(termFactory.makeAppl(Main._consADVICE_4, new IStrategoTerm[]{g_12146, h_12146, i_12146, term}), checkListAnnos(termFactory, f_12146));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}