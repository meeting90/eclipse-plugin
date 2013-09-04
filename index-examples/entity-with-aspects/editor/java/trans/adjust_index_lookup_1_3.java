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

@SuppressWarnings("all") public class adjust_index_lookup_1_3 extends Strategy 
{ 
  public static adjust_index_lookup_1_3 instance = new adjust_index_lookup_1_3();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy m_12058, IStrategoTerm n_12058, IStrategoTerm o_12058, IStrategoTerm p_12058)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("adjust_index_lookup_1_3");
    Fail4412:
    { 
      IStrategoTerm term2387 = term;
      IStrategoConstructor cons125 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success2387:
      { 
        if(cons125 == Main._consEntityImport_2)
        { 
          Fail4413:
          { 
            IStrategoTerm g_11891 = null;
            IStrategoTerm i_11891 = null;
            g_11891 = term.getSubterm(0);
            i_11891 = term;
            term = m_12058.invoke(context, g_11891);
            if(term == null)
              break Fail4413;
            term = i_11891;
            IStrategoList list115;
            IStrategoList list114;
            list114 = checkListTail(o_12058);
            if(list114 == null)
              break Fail4413;
            list115 = checkListTail(o_12058);
            if(list115 == null)
              break Fail4413;
            term = (IStrategoTerm)termFactory.makeListCons((IStrategoTerm)termFactory.makeListCons(trans.constModule0, list115), termFactory.makeListCons((IStrategoTerm)termFactory.makeListCons(trans.constEntity0, list114), (IStrategoList)trans.constNil3));
            if(true)
              break Success2387;
          }
          term = term2387;
        }
        Success2388:
        { 
          if(cons125 == Main._consType_1)
          { 
            Fail4414:
            { 
              IStrategoTerm z_11890 = null;
              IStrategoTerm b_11891 = null;
              z_11890 = term.getSubterm(0);
              b_11891 = term;
              term = m_12058.invoke(context, z_11890);
              if(term == null)
                break Fail4414;
              term = b_11891;
              IStrategoList list116;
              list116 = checkListTail(o_12058);
              if(list116 == null)
                break Fail4414;
              term = (IStrategoTerm)termFactory.makeListCons((IStrategoTerm)termFactory.makeListCons((IStrategoTerm)termFactory.makeListCons(trans.constEntity0, list116), (IStrategoList)trans.constNil3), (IStrategoList)trans.constCons217);
              term = concat_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail4414;
              if(true)
                break Success2388;
            }
            term = term2387;
          }
          Success2389:
          { 
            if(cons125 == Main._consPropAccess_2)
            { 
              Fail4415:
              { 
                IStrategoTerm o_11890 = null;
                IStrategoTerm p_11890 = null;
                IStrategoTerm q_11890 = null;
                IStrategoTerm v_11890 = null;
                p_11890 = term.getSubterm(0);
                o_11890 = term.getSubterm(1);
                term = m_12058.invoke(context, o_11890);
                if(term == null)
                  break Fail4415;
                term = type_of_0_0.instance.invoke(context, p_11890);
                if(term == null)
                  break Fail4415;
                if(term.getTermType() != IStrategoTerm.APPL || Main._consType_1 != ((IStrategoAppl)term).getConstructor())
                  break Fail4415;
                q_11890 = term.getSubterm(0);
                v_11890 = q_11890;
                term = index_lookup_children_0_2.instance.invoke(context, v_11890, trans.constProperty0, p_12058);
                if(term == null)
                  break Fail4415;
                if(true)
                  break Success2389;
              }
              term = term2387;
            }
            if(cons125 == Main._consVar_1)
            { 
              IStrategoTerm i_11890 = null;
              IStrategoTerm k_11890 = null;
              i_11890 = term.getSubterm(0);
              k_11890 = term;
              term = m_12058.invoke(context, i_11890);
              if(term == null)
                break Fail4412;
              term = k_11890;
              IStrategoList list118;
              IStrategoList list117;
              list117 = checkListTail(o_12058);
              if(list117 == null)
                break Fail4412;
              list118 = checkListTail(o_12058);
              if(list118 == null)
                break Fail4412;
              term = (IStrategoTerm)termFactory.makeListCons((IStrategoTerm)termFactory.makeListCons(trans.constVariable0, list118), termFactory.makeListCons((IStrategoTerm)termFactory.makeListCons(trans.constProperty0, list117), (IStrategoList)trans.constNil3));
            }
            else
            { 
              break Fail4412;
            }
          }
        }
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}