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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy r_2195, IStrategoTerm s_2195, IStrategoTerm t_2195, IStrategoTerm u_2195)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("adjust_index_lookup_1_3");
    Fail1510:
    { 
      IStrategoTerm term831 = term;
      IStrategoConstructor cons53 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success831:
      { 
        if(cons53 == Main._consEntityImport_2)
        { 
          Fail1511:
          { 
            IStrategoTerm l_2028 = null;
            IStrategoTerm n_2028 = null;
            l_2028 = term.getSubterm(0);
            n_2028 = term;
            term = r_2195.invoke(context, l_2028);
            if(term == null)
              break Fail1511;
            term = n_2028;
            IStrategoList list39;
            IStrategoList list38;
            list38 = checkListTail(t_2195);
            if(list38 == null)
              break Fail1511;
            list39 = checkListTail(t_2195);
            if(list39 == null)
              break Fail1511;
            term = (IStrategoTerm)termFactory.makeListCons((IStrategoTerm)termFactory.makeListCons(trans.constModule0, list39), termFactory.makeListCons((IStrategoTerm)termFactory.makeListCons(trans.constEntity0, list38), (IStrategoList)trans.constNil1));
            if(true)
              break Success831;
          }
          term = term831;
        }
        Success832:
        { 
          if(cons53 == Main._consType_1)
          { 
            Fail1512:
            { 
              IStrategoTerm e_2028 = null;
              IStrategoTerm g_2028 = null;
              e_2028 = term.getSubterm(0);
              g_2028 = term;
              term = r_2195.invoke(context, e_2028);
              if(term == null)
                break Fail1512;
              term = g_2028;
              IStrategoList list40;
              list40 = checkListTail(t_2195);
              if(list40 == null)
                break Fail1512;
              term = (IStrategoTerm)termFactory.makeListCons((IStrategoTerm)termFactory.makeListCons((IStrategoTerm)termFactory.makeListCons(trans.constEntity0, list40), (IStrategoList)trans.constNil1), (IStrategoList)trans.constCons85);
              term = concat_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail1512;
              if(true)
                break Success832;
            }
            term = term831;
          }
          Success833:
          { 
            if(cons53 == Main._consPropAccess_2)
            { 
              Fail1513:
              { 
                IStrategoTerm t_2027 = null;
                IStrategoTerm u_2027 = null;
                IStrategoTerm v_2027 = null;
                IStrategoTerm a_2028 = null;
                u_2027 = term.getSubterm(0);
                t_2027 = term.getSubterm(1);
                term = r_2195.invoke(context, t_2027);
                if(term == null)
                  break Fail1513;
                term = type_of_0_0.instance.invoke(context, u_2027);
                if(term == null)
                  break Fail1513;
                if(term.getTermType() != IStrategoTerm.APPL || Main._consType_1 != ((IStrategoAppl)term).getConstructor())
                  break Fail1513;
                v_2027 = term.getSubterm(0);
                a_2028 = v_2027;
                term = index_lookup_children_0_2.instance.invoke(context, a_2028, trans.constProperty0, u_2195);
                if(term == null)
                  break Fail1513;
                if(true)
                  break Success833;
              }
              term = term831;
            }
            if(cons53 == Main._consVar_1)
            { 
              IStrategoTerm n_2027 = null;
              IStrategoTerm p_2027 = null;
              n_2027 = term.getSubterm(0);
              p_2027 = term;
              term = r_2195.invoke(context, n_2027);
              if(term == null)
                break Fail1510;
              term = p_2027;
              IStrategoList list42;
              IStrategoList list41;
              list41 = checkListTail(t_2195);
              if(list41 == null)
                break Fail1510;
              list42 = checkListTail(t_2195);
              if(list42 == null)
                break Fail1510;
              term = (IStrategoTerm)termFactory.makeListCons((IStrategoTerm)termFactory.makeListCons(trans.constVariable0, list42), termFactory.makeListCons((IStrategoTerm)termFactory.makeListCons(trans.constProperty0, list41), (IStrategoList)trans.constNil1));
            }
            else
            { 
              break Fail1510;
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