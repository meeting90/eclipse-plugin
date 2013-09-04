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

@SuppressWarnings("all") public class nam_annotate_use_0_2 extends Strategy 
{ 
  public static nam_annotate_use_0_2 instance = new nam_annotate_use_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm y_2121, IStrategoTerm z_2121)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("nam_annotate_use_0_2");
    Fail2135:
    { 
      IStrategoTerm a_2122 = null;
      IStrategoTerm b_2122 = null;
      IStrategoTerm c_2122 = null;
      a_2122 = term;
      c_2122 = term;
      term = termFactory.makeTuple(z_2121, y_2121);
      Success1294:
      { 
        Fail2136:
        { 
          term = lookup_p__0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2136;
          if(true)
            break Success1294;
        }
        term = trans.constNil1;
      }
      b_2122 = term;
      term = c_2122;
      IStrategoList list68;
      list68 = checkListTail(b_2122);
      if(list68 == null)
        break Fail2135;
      term = termFactory.annotateTerm(a_2122, checkListAnnos(termFactory, (IStrategoTerm)termFactory.makeListCons((IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(Main._consUnresolved_1, new IStrategoTerm[]{z_2121}), termFactory.makeListCons(a_2122, list68)), (IStrategoList)trans.constNil1)));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}