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
    Fail4828:
    { 
      IStrategoTerm term2752 = term;
      Success2731:
      { 
        Fail4829:
        { 
          IStrategoTerm j_11946 = null;
          IStrategoTerm k_11946 = null;
          IStrategoTerm l_11946 = null;
          IStrategoTerm m_11946 = null;
          IStrategoTerm n_11946 = null;
          if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
            break Fail4829;
          IStrategoTerm arg1480 = term.getSubterm(0);
          if(arg1480.getTermType() != IStrategoTerm.APPL || Main._consDefData_3 != ((IStrategoAppl)arg1480).getConstructor())
            break Fail4829;
          j_11946 = arg1480.getSubterm(0);
          IStrategoTerm arg1481 = arg1480.getSubterm(1);
          if(arg1481.getTermType() != IStrategoTerm.APPL || Main._consType_0 != ((IStrategoAppl)arg1481).getConstructor())
            break Fail4829;
          l_11946 = arg1480.getSubterm(2);
          IStrategoTerm arg1482 = term.getSubterm(1);
          if(arg1482.getTermType() != IStrategoTerm.APPL || Main._consDefData_3 != ((IStrategoAppl)arg1482).getConstructor())
            break Fail4829;
          k_11946 = arg1482.getSubterm(0);
          IStrategoTerm arg1483 = arg1482.getSubterm(1);
          if(arg1483.getTermType() != IStrategoTerm.APPL || Main._consType_0 != ((IStrategoAppl)arg1483).getConstructor())
            break Fail4829;
          m_11946 = arg1482.getSubterm(2);
          n_11946 = term;
          term = termFactory.makeTuple(j_11946, k_11946);
          term = index_uri_eq_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail4829;
          term = termFactory.makeTuple(l_11946, m_11946);
          term = index_key_eq_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail4829;
          term = n_11946;
          if(true)
            break Success2731;
        }
        term = term2752;
        IStrategoTerm e_11946 = null;
        IStrategoTerm f_11946 = null;
        IStrategoTerm g_11946 = null;
        if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
          break Fail4828;
        IStrategoTerm arg1484 = term.getSubterm(0);
        if(arg1484.getTermType() != IStrategoTerm.APPL || Main._consDef_1 != ((IStrategoAppl)arg1484).getConstructor())
          break Fail4828;
        e_11946 = arg1484.getSubterm(0);
        IStrategoTerm arg1485 = term.getSubterm(1);
        if(arg1485.getTermType() != IStrategoTerm.APPL || Main._consDef_1 != ((IStrategoAppl)arg1485).getConstructor())
          break Fail4828;
        f_11946 = arg1485.getSubterm(0);
        g_11946 = term;
        term = termFactory.makeTuple(e_11946, f_11946);
        term = index_uri_eq_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail4828;
        term = g_11946;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}