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

@SuppressWarnings("all") public class index_diff_compare_0_0 extends Strategy 
{ 
  public static index_diff_compare_0_0 instance = new index_diff_compare_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("index_diff_compare_0_0");
    Fail1926:
    { 
      IStrategoTerm term1196 = term;
      Success1175:
      { 
        Fail1927:
        { 
          IStrategoTerm o_2083 = null;
          IStrategoTerm p_2083 = null;
          IStrategoTerm q_2083 = null;
          IStrategoTerm r_2083 = null;
          IStrategoTerm s_2083 = null;
          if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
            break Fail1927;
          IStrategoTerm arg626 = term.getSubterm(0);
          if(arg626.getTermType() != IStrategoTerm.APPL || Main._consDefData_3 != ((IStrategoAppl)arg626).getConstructor())
            break Fail1927;
          o_2083 = arg626.getSubterm(0);
          IStrategoTerm arg627 = arg626.getSubterm(1);
          if(arg627.getTermType() != IStrategoTerm.APPL || Main._consType_0 != ((IStrategoAppl)arg627).getConstructor())
            break Fail1927;
          q_2083 = arg626.getSubterm(2);
          IStrategoTerm arg628 = term.getSubterm(1);
          if(arg628.getTermType() != IStrategoTerm.APPL || Main._consDefData_3 != ((IStrategoAppl)arg628).getConstructor())
            break Fail1927;
          p_2083 = arg628.getSubterm(0);
          IStrategoTerm arg629 = arg628.getSubterm(1);
          if(arg629.getTermType() != IStrategoTerm.APPL || Main._consType_0 != ((IStrategoAppl)arg629).getConstructor())
            break Fail1927;
          r_2083 = arg628.getSubterm(2);
          s_2083 = term;
          term = termFactory.makeTuple(o_2083, p_2083);
          term = index_uri_eq_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1927;
          term = termFactory.makeTuple(q_2083, r_2083);
          term = index_key_eq_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1927;
          term = s_2083;
          if(true)
            break Success1175;
        }
        term = term1196;
        IStrategoTerm j_2083 = null;
        IStrategoTerm k_2083 = null;
        IStrategoTerm l_2083 = null;
        if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
          break Fail1926;
        IStrategoTerm arg630 = term.getSubterm(0);
        if(arg630.getTermType() != IStrategoTerm.APPL || Main._consDef_1 != ((IStrategoAppl)arg630).getConstructor())
          break Fail1926;
        j_2083 = arg630.getSubterm(0);
        IStrategoTerm arg631 = term.getSubterm(1);
        if(arg631.getTermType() != IStrategoTerm.APPL || Main._consDef_1 != ((IStrategoAppl)arg631).getConstructor())
          break Fail1926;
        k_2083 = arg631.getSubterm(0);
        l_2083 = term;
        term = termFactory.makeTuple(j_2083, k_2083);
        term = index_uri_eq_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail1926;
        term = l_2083;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}