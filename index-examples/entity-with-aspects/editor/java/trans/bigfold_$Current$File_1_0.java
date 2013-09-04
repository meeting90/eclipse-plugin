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

@SuppressWarnings("all") public class bigfold_$Current$File_1_0 extends Strategy 
{ 
  public static bigfold_$Current$File_1_0 instance = new bigfold_$Current$File_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy f_12051)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("bigfold_CurrentFile_1_0");
    Fail5518:
    { 
      IStrategoTerm g_12051 = null;
      IStrategoTerm i_12051 = null;
      i_12051 = term;
      Success3048:
      { 
        Fail5519:
        { 
          IStrategoTerm j_12051 = null;
          IStrategoTerm l_12051 = null;
          IStrategoTerm m_12051 = null;
          l_12051 = term;
          j_12051 = trans.const999;
          m_12051 = l_12051;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, m_12051, j_12051, trans.constCons250);
          if(term == null)
            break Fail5519;
          if(true)
            break Success3048;
        }
        term = trans.constNil3;
      }
      g_12051 = term;
      term = i_12051;
      term = termFactory.makeTuple(g_12051, term);
      term = f_12051.invoke(context, term, lifted1183.instance);
      if(term == null)
        break Fail5518;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}