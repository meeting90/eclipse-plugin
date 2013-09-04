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

@SuppressWarnings("all") public class nam_get_def_0_2 extends Strategy 
{ 
  public static nam_get_def_0_2 instance = new nam_get_def_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm h_2121, IStrategoTerm i_2121)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("nam_get_def_0_2");
    Fail2131:
    { 
      IStrategoTerm j_2121 = null;
      IStrategoTerm k_2121 = null;
      IStrategoTerm l_2121 = null;
      j_2121 = term;
      l_2121 = term;
      term = termFactory.makeTuple(i_2121, h_2121);
      Success1292:
      { 
        Fail2132:
        { 
          term = lookup_p__0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2132;
          if(true)
            break Success1292;
        }
        term = trans.constNil1;
      }
      term = termFactory.makeTuple(j_2121, term);
      term = make$Conc_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail2131;
      k_2121 = term;
      term = l_2121;
      IStrategoList list67;
      list67 = checkListTail(k_2121);
      if(list67 == null)
        break Fail2131;
      term = termFactory.makeAppl(Main._consDef_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(i_2121, list67)});
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}