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

@SuppressWarnings("all") public class nam_annotate_use_0_4 extends Strategy 
{ 
  public static nam_annotate_use_0_4 instance = new nam_annotate_use_0_4();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm y_11984, IStrategoTerm z_11984, IStrategoTerm a_11985, IStrategoTerm b_11985)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("nam_annotate_use_0_4");
    Fail5039:
    { 
      IStrategoTerm c_11985 = null;
      IStrategoTerm d_11985 = null;
      IStrategoTerm e_11985 = null;
      c_11985 = term;
      e_11985 = term;
      term = termFactory.makeTuple(z_11984, y_11984);
      Success2851:
      { 
        Fail5040:
        { 
          term = lookup_p__0_0.instance.invoke(context, term);
          if(term == null)
            break Fail5040;
          if(true)
            break Success2851;
        }
        term = trans.constNil3;
      }
      d_11985 = term;
      term = e_11985;
      IStrategoList list145;
      list145 = checkListTail(d_11985);
      if(list145 == null)
        break Fail5039;
      term = termFactory.annotateTerm(c_11985, checkListAnnos(termFactory, (IStrategoTerm)termFactory.makeListCons((IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(Main._consUnresolved_1, new IStrategoTerm[]{z_11984}), termFactory.makeListCons(c_11985, list145)), (IStrategoList)trans.constNil3)));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}