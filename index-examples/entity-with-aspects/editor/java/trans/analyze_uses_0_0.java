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

@SuppressWarnings("all") public class analyze_uses_0_0 extends Strategy 
{ 
  public static analyze_uses_0_0 instance = new analyze_uses_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("analyze_uses_0_0");
    Fail4920:
    { 
      IStrategoTerm e_11967 = null;
      IStrategoTerm f_11967 = null;
      IStrategoTerm g_11967 = null;
      IStrategoTerm h_11967 = null;
      IStrategoTerm i_11967 = null;
      IStrategoTerm j_11967 = null;
      IStrategoTerm k_11967 = null;
      IStrategoTerm l_11967 = null;
      IStrategoTerm q_11967 = null;
      e_11967 = term;
      q_11967 = term;
      IStrategoTerm term2812 = term;
      Success2785:
      { 
        Fail4921:
        { 
          term = SRTS_all.instance.invoke(context, e_11967, analyze_uses_0_0.instance);
          if(term == null)
            break Fail4921;
          term = unzip_analyzed_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail4921;
          if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
            break Fail4921;
          i_11967 = term.getSubterm(0);
          k_11967 = term.getSubterm(1);
          Success2786:
          { 
            Fail4922:
            { 
              IStrategoTerm m_11967 = null;
              m_11967 = term;
              term = i_11967;
              IStrategoList annos214 = term.getAnnotations();
              if(annos214.getTermType() != IStrategoTerm.LIST || ((IStrategoList)annos214).isEmpty())
                break Fail4922;
              IStrategoTerm arg1507 = ((IStrategoList)annos214).head();
              if(arg1507.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg1507).isEmpty())
                break Fail4922;
              IStrategoTerm arg1508 = ((IStrategoList)arg1507).head();
              if(arg1508.getTermType() != IStrategoTerm.APPL || Main._consUnresolved_1 != ((IStrategoAppl)arg1508).getConstructor())
                break Fail4922;
              g_11967 = arg1508.getSubterm(0);
              IStrategoTerm arg1509 = ((IStrategoList)arg1507).tail();
              if(arg1509.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg1509).isEmpty())
                break Fail4922;
              h_11967 = ((IStrategoList)arg1509).head();
              IStrategoTerm arg1510 = ((IStrategoList)annos214).tail();
              if(arg1510.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg1510).isEmpty())
                break Fail4922;
              term = m_11967;
              { 
                Success2787:
                { 
                  Fail4923:
                  { 
                    IStrategoTerm n_11967 = null;
                    n_11967 = term;
                    term = index_lookup_0_0.instance.invoke(context, i_11967);
                    if(term == null)
                      break Fail4923;
                    if(term.getTermType() != IStrategoTerm.APPL || Main._consDef_1 != ((IStrategoAppl)term).getConstructor())
                      break Fail4923;
                    f_11967 = term.getSubterm(0);
                    term = n_11967;
                    { 
                      term = termFactory.annotateTerm(e_11967, checkListAnnos(termFactory, (IStrategoTerm)termFactory.makeListCons(f_11967, (IStrategoList)trans.constNil3)));
                      j_11967 = term;
                      IStrategoList list136;
                      list136 = checkListTail(k_11967);
                      if(list136 == null)
                        break Fail4921;
                      term = (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(Main._consUse_1, new IStrategoTerm[]{f_11967}), list136);
                      l_11967 = term;
                      if(true)
                        break Success2787;
                    }
                  }
                  term = i_11967;
                  j_11967 = i_11967;
                  IStrategoList list137;
                  list137 = checkListTail(k_11967);
                  if(list137 == null)
                    break Fail4921;
                  term = (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(Main._consBadUse_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(g_11967, termFactory.makeListCons(h_11967, (IStrategoList)trans.constNil3))}), list137);
                  l_11967 = term;
                }
                if(true)
                  break Success2786;
              }
            }
            j_11967 = i_11967;
            term = k_11967;
            l_11967 = k_11967;
          }
          if(true)
            break Success2785;
        }
        term = term2812;
        IStrategoTerm o_11967 = null;
        IStrategoTerm p_11967 = null;
        IStrategoTerm s_11967 = null;
        o_11967 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail4920;
        p_11967 = term;
        s_11967 = o_11967;
        term = report_with_failure_0_2.instance.invoke(context, s_11967, trans.const942, p_11967);
        if(term == null)
          break Fail4920;
      }
      term = q_11967;
      if(j_11967 == null || l_11967 == null)
        break Fail4920;
      term = termFactory.makeTuple(j_11967, l_11967);
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}