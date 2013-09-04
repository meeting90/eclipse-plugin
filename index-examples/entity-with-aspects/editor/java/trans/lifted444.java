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

@SuppressWarnings("all") final class lifted444 extends Strategy 
{ 
  TermReference z_2115;

  TermReference y_2115;

  Strategy j_2116;

  Strategy k_2116;

  Strategy l_2116;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail2788:
    { 
      IStrategoTerm term1297 = term;
      Success1526:
      { 
        Fail2789:
        { 
          IStrategoTerm d_2116 = null;
          d_2116 = term;
          if(term.getTermType() != IStrategoTerm.APPL || Main._consDef_1 != ((IStrategoAppl)term).getConstructor())
            break Fail2789;
          term = (IStrategoTerm)termFactory.makeListCons(d_2116, (IStrategoList)trans.constNil1);
          if(true)
            break Success1526;
        }
        term = term1297;
        IStrategoTerm term1298 = term;
        Success1527:
        { 
          Fail2790:
          { 
            IStrategoTerm f_2116 = null;
            IStrategoTerm g_2116 = null;
            if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
              break Fail2790;
            f_2116 = ((IStrategoList)term).head();
            g_2116 = ((IStrategoList)term).tail();
            if(z_2115.value == null)
              break Fail2790;
            term = index_lookup_all_scoped_internal_4_3.instance.invoke(context, z_2115.value, j_2116, _Fail.instance, k_2116, l_2116, f_2116, g_2116, y_2115.value);
            if(term == null)
              break Fail2790;
            if(true)
              break Success1527;
          }
          term = term1298;
          IStrategoTerm o_2116 = null;
          o_2116 = term;
          term = fatal_err_0_1.instance.invoke(context, o_2116, trans.const440);
          if(term == null)
            break Fail2788;
        }
      }
      if(true)
        return term;
    }
    return null;
  }
}