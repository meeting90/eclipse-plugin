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

@SuppressWarnings("all") public class index_toplevel_split_internal_0_0 extends Strategy 
{ 
  public static index_toplevel_split_internal_0_0 instance = new index_toplevel_split_internal_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("index_toplevel_split_internal_0_0");
    Fail2045:
    { 
      TermReference d_2109 = new TermReference();
      IStrategoTerm e_2109 = null;
      IStrategoTerm m_2109 = null;
      if(d_2109.value == null)
        d_2109.value = term;
      else
        if(d_2109.value != term && !d_2109.value.match(term))
          break Fail2045;
      m_2109 = term;
      IStrategoTerm term1272 = term;
      Success1245:
      { 
        Fail2046:
        { 
          IStrategoTerm f_2109 = null;
          IStrategoTerm g_2109 = null;
          g_2109 = term;
          f_2109 = term;
          term = g_2109;
          IStrategoTerm term1273 = term;
          Success1246:
          { 
            Fail2047:
            { 
              IStrategoTerm h_2109 = null;
              h_2109 = term;
              term = f_2109;
              if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 0)
                break Fail2047;
              term = h_2109;
              { 
                term = trans.constCons119;
                e_2109 = trans.constCons119;
                if(true)
                  break Success1246;
              }
            }
            term = term1273;
            IStrategoTerm term1274 = term;
            Success1247:
            { 
              Fail2048:
              { 
                IStrategoTerm i_2109 = null;
                i_2109 = term;
                term = f_2109;
                if(term.getTermType() != IStrategoTerm.APPL || Main._consModule_3 != ((IStrategoAppl)term).getConstructor())
                  break Fail2048;
                term = i_2109;
                { 
                  IStrategoTerm x_2291 = null;
                  if(d_2109.value == null)
                    break Fail2046;
                  term = d_2109.value;
                  if(term.getTermType() != IStrategoTerm.APPL || Main._consModule_3 != ((IStrategoAppl)term).getConstructor())
                    break Fail2046;
                  x_2291 = term.getSubterm(2);
                  term = mapconcat_1_0.instance.invoke(context, x_2291, index_toplevel_split_internal_0_0.instance);
                  if(term == null)
                    break Fail2046;
                  lifted426 lifted4260 = new lifted426();
                  lifted4260.d_2109 = d_2109;
                  term = map_1_0.instance.invoke(context, term, lifted4260);
                  if(term == null)
                    break Fail2046;
                  e_2109 = term;
                  if(true)
                    break Success1247;
                }
              }
              term = term1274;
              IStrategoTerm term1275 = term;
              Success1248:
              { 
                Fail2049:
                { 
                  IStrategoTerm j_2109 = null;
                  j_2109 = term;
                  term = f_2109;
                  if(term.getTermType() != IStrategoTerm.APPL || Main._consEntity_2 != ((IStrategoAppl)term).getConstructor())
                    break Fail2049;
                  term = j_2109;
                  { 
                    IStrategoTerm n_2109 = null;
                    IStrategoTerm o_2109 = null;
                    o_2109 = term;
                    if(d_2109.value == null)
                      break Fail2046;
                    term = nam_get_definition_key_0_0.instance.invoke(context, d_2109.value);
                    if(term == null)
                      break Fail2046;
                    term = index_uri_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail2046;
                    n_2109 = term;
                    term = o_2109;
                    if(d_2109.value == null)
                      break Fail2046;
                    term = (IStrategoTerm)termFactory.makeListCons(termFactory.makeTuple(d_2109.value, n_2109), (IStrategoList)trans.constNil1);
                    e_2109 = term;
                    if(true)
                      break Success1248;
                  }
                }
                term = term1275;
                if(d_2109.value == null)
                  break Fail2046;
                term = (IStrategoTerm)termFactory.makeListCons(termFactory.makeTuple(d_2109.value, trans.constNil1), (IStrategoList)trans.constNil1);
                e_2109 = term;
              }
            }
          }
          if(true)
            break Success1245;
        }
        term = term1272;
        IStrategoTerm k_2109 = null;
        IStrategoTerm l_2109 = null;
        IStrategoTerm q_2109 = null;
        k_2109 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail2045;
        l_2109 = term;
        q_2109 = k_2109;
        term = report_with_failure_0_2.instance.invoke(context, q_2109, trans.const430, l_2109);
        if(term == null)
          break Fail2045;
      }
      term = m_2109;
      if(e_2109 == null)
        break Fail2045;
      term = e_2109;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}