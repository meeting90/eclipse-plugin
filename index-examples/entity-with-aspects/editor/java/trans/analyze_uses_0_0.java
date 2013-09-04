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
    Fail2018:
    { 
      IStrategoTerm j_2104 = null;
      IStrategoTerm k_2104 = null;
      IStrategoTerm l_2104 = null;
      IStrategoTerm m_2104 = null;
      IStrategoTerm n_2104 = null;
      IStrategoTerm o_2104 = null;
      IStrategoTerm p_2104 = null;
      IStrategoTerm q_2104 = null;
      IStrategoTerm v_2104 = null;
      j_2104 = term;
      v_2104 = term;
      IStrategoTerm term1256 = term;
      Success1229:
      { 
        Fail2019:
        { 
          term = SRTS_all.instance.invoke(context, j_2104, analyze_uses_0_0.instance);
          if(term == null)
            break Fail2019;
          term = unzip_analyzed_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2019;
          if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
            break Fail2019;
          n_2104 = term.getSubterm(0);
          p_2104 = term.getSubterm(1);
          Success1230:
          { 
            Fail2020:
            { 
              IStrategoTerm r_2104 = null;
              r_2104 = term;
              term = n_2104;
              IStrategoList annos76 = term.getAnnotations();
              if(annos76.getTermType() != IStrategoTerm.LIST || ((IStrategoList)annos76).isEmpty())
                break Fail2020;
              IStrategoTerm arg653 = ((IStrategoList)annos76).head();
              if(arg653.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg653).isEmpty())
                break Fail2020;
              IStrategoTerm arg654 = ((IStrategoList)arg653).head();
              if(arg654.getTermType() != IStrategoTerm.APPL || Main._consUnresolved_1 != ((IStrategoAppl)arg654).getConstructor())
                break Fail2020;
              l_2104 = arg654.getSubterm(0);
              IStrategoTerm arg655 = ((IStrategoList)arg653).tail();
              if(arg655.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg655).isEmpty())
                break Fail2020;
              m_2104 = ((IStrategoList)arg655).head();
              IStrategoTerm arg656 = ((IStrategoList)annos76).tail();
              if(arg656.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg656).isEmpty())
                break Fail2020;
              term = r_2104;
              { 
                Success1231:
                { 
                  Fail2021:
                  { 
                    IStrategoTerm s_2104 = null;
                    s_2104 = term;
                    term = index_lookup_0_0.instance.invoke(context, n_2104);
                    if(term == null)
                      break Fail2021;
                    if(term.getTermType() != IStrategoTerm.APPL || Main._consDef_1 != ((IStrategoAppl)term).getConstructor())
                      break Fail2021;
                    k_2104 = term.getSubterm(0);
                    term = s_2104;
                    { 
                      term = termFactory.annotateTerm(j_2104, checkListAnnos(termFactory, (IStrategoTerm)termFactory.makeListCons(k_2104, (IStrategoList)trans.constNil1)));
                      o_2104 = term;
                      IStrategoList list60;
                      list60 = checkListTail(p_2104);
                      if(list60 == null)
                        break Fail2019;
                      term = (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(Main._consUse_1, new IStrategoTerm[]{k_2104}), list60);
                      q_2104 = term;
                      if(true)
                        break Success1231;
                    }
                  }
                  term = n_2104;
                  o_2104 = n_2104;
                  IStrategoList list61;
                  list61 = checkListTail(p_2104);
                  if(list61 == null)
                    break Fail2019;
                  term = (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(Main._consBadUse_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(l_2104, termFactory.makeListCons(m_2104, (IStrategoList)trans.constNil1))}), list61);
                  q_2104 = term;
                }
                if(true)
                  break Success1230;
              }
            }
            o_2104 = n_2104;
            term = p_2104;
            q_2104 = p_2104;
          }
          if(true)
            break Success1229;
        }
        term = term1256;
        IStrategoTerm t_2104 = null;
        IStrategoTerm u_2104 = null;
        IStrategoTerm x_2104 = null;
        t_2104 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail2018;
        u_2104 = term;
        x_2104 = t_2104;
        term = report_with_failure_0_2.instance.invoke(context, x_2104, trans.const422, u_2104);
        if(term == null)
          break Fail2018;
      }
      term = v_2104;
      if(o_2104 == null || q_2104 == null)
        break Fail2018;
      term = termFactory.makeTuple(o_2104, q_2104);
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}