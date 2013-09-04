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

@SuppressWarnings("all") final class lifted1044 extends Strategy 
{ 
  TermReference u_11978;

  TermReference t_11978;

  Strategy e_11979;

  Strategy f_11979;

  Strategy g_11979;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail5690:
    { 
      IStrategoTerm term2853 = term;
      Success3082:
      { 
        Fail5691:
        { 
          IStrategoTerm y_11978 = null;
          y_11978 = term;
          if(term.getTermType() != IStrategoTerm.APPL || Main._consDef_1 != ((IStrategoAppl)term).getConstructor())
            break Fail5691;
          term = (IStrategoTerm)termFactory.makeListCons(y_11978, (IStrategoList)trans.constNil3);
          if(true)
            break Success3082;
        }
        term = term2853;
        IStrategoTerm term2854 = term;
        Success3083:
        { 
          Fail5692:
          { 
            IStrategoTerm a_11979 = null;
            IStrategoTerm b_11979 = null;
            if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
              break Fail5692;
            a_11979 = ((IStrategoList)term).head();
            b_11979 = ((IStrategoList)term).tail();
            if(u_11978.value == null)
              break Fail5692;
            term = index_lookup_all_scoped_internal_4_3.instance.invoke(context, u_11978.value, e_11979, _Fail.instance, f_11979, g_11979, a_11979, b_11979, t_11978.value);
            if(term == null)
              break Fail5692;
            if(true)
              break Success3083;
          }
          term = term2854;
          IStrategoTerm j_11979 = null;
          j_11979 = term;
          term = fatal_err_0_1.instance.invoke(context, j_11979, trans.const960);
          if(term == null)
            break Fail5690;
        }
      }
      if(true)
        return term;
    }
    return null;
  }
}