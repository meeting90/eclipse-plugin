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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm d_2122, IStrategoTerm e_2122, IStrategoTerm f_2122, IStrategoTerm g_2122)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("nam_annotate_use_0_4");
    Fail2137:
    { 
      IStrategoTerm h_2122 = null;
      IStrategoTerm i_2122 = null;
      IStrategoTerm j_2122 = null;
      h_2122 = term;
      j_2122 = term;
      term = termFactory.makeTuple(e_2122, d_2122);
      Success1295:
      { 
        Fail2138:
        { 
          term = lookup_p__0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2138;
          if(true)
            break Success1295;
        }
        term = trans.constNil1;
      }
      i_2122 = term;
      term = j_2122;
      IStrategoList list69;
      list69 = checkListTail(i_2122);
      if(list69 == null)
        break Fail2137;
      term = termFactory.annotateTerm(h_2122, checkListAnnos(termFactory, (IStrategoTerm)termFactory.makeListCons((IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(Main._consUnresolved_1, new IStrategoTerm[]{e_2122}), termFactory.makeListCons(h_2122, list69)), (IStrategoList)trans.constNil1)));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}