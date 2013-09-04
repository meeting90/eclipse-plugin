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

@SuppressWarnings("all") public class store_wildcard_read_0_3 extends Strategy 
{ 
  public static store_wildcard_read_0_3 instance = new store_wildcard_read_0_3();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm i_11982, IStrategoTerm j_11982, IStrategoTerm k_11982)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("store_wildcard_read_0_3");
    Fail5018:
    { 
      IStrategoTerm l_11982 = null;
      IStrategoTerm m_11982 = null;
      IStrategoTerm r_11982 = null;
      l_11982 = term;
      r_11982 = term;
      IStrategoTerm term2870 = term;
      Success2840:
      { 
        Fail5019:
        { 
          IStrategoTerm term2871 = term;
          Success2841:
          { 
            Fail5020:
            { 
              IStrategoTerm n_11982 = null;
              n_11982 = term;
              term = $Index_$Read$Set_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail5020;
              m_11982 = term;
              term = n_11982;
              { 
                Success2842:
                { 
                  Fail5021:
                  { 
                    IStrategoTerm o_11982 = null;
                    o_11982 = term;
                    term = length_0_0.instance.invoke(context, l_11982);
                    if(term == null)
                      break Fail5021;
                    if(term.getTermType() != IStrategoTerm.INT || 1 != ((IStrategoInt)term).intValue())
                      break Fail5021;
                    term = o_11982;
                    { 
                      IStrategoTerm v_11982 = null;
                      term = m_11982;
                      v_11982 = m_11982;
                      IStrategoList list141;
                      list141 = checkListTail(j_11982);
                      if(list141 == null)
                        break Fail5019;
                      term = termFactory.makeAppl(Main._consRead_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(i_11982, termFactory.makeListCons(k_11982, list141))});
                      term = iset_add_0_1.instance.invoke(context, v_11982, term);
                      if(term == null)
                        break Fail5019;
                      if(true)
                        break Success2842;
                    }
                  }
                  IStrategoTerm x_11982 = null;
                  term = m_11982;
                  x_11982 = m_11982;
                  IStrategoList list142;
                  list142 = checkListTail(j_11982);
                  if(list142 == null)
                    break Fail5019;
                  term = termFactory.makeAppl(Main._consReadWildcard_2, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(i_11982, list142), k_11982});
                  term = iset_add_0_1.instance.invoke(context, x_11982, term);
                  if(term == null)
                    break Fail5019;
                }
                if(true)
                  break Success2841;
              }
            }
            term = term2871;
          }
          if(true)
            break Success2840;
        }
        term = term2870;
        IStrategoTerm p_11982 = null;
        IStrategoTerm q_11982 = null;
        IStrategoTerm z_11982 = null;
        p_11982 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail5018;
        q_11982 = term;
        z_11982 = p_11982;
        term = report_with_failure_0_2.instance.invoke(context, z_11982, trans.const964, q_11982);
        if(term == null)
          break Fail5018;
      }
      term = r_11982;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}