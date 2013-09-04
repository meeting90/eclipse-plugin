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
    Fail4947:
    { 
      TermReference y_11971 = new TermReference();
      IStrategoTerm z_11971 = null;
      IStrategoTerm h_11972 = null;
      if(y_11971.value == null)
        y_11971.value = term;
      else
        if(y_11971.value != term && !y_11971.value.match(term))
          break Fail4947;
      h_11972 = term;
      IStrategoTerm term2828 = term;
      Success2801:
      { 
        Fail4948:
        { 
          IStrategoTerm a_11972 = null;
          IStrategoTerm b_11972 = null;
          b_11972 = term;
          a_11972 = term;
          term = b_11972;
          IStrategoTerm term2829 = term;
          Success2802:
          { 
            Fail4949:
            { 
              IStrategoTerm c_11972 = null;
              c_11972 = term;
              term = a_11972;
              if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 0)
                break Fail4949;
              term = c_11972;
              { 
                term = trans.constCons251;
                z_11971 = trans.constCons251;
                if(true)
                  break Success2802;
              }
            }
            term = term2829;
            IStrategoTerm term2830 = term;
            Success2803:
            { 
              Fail4950:
              { 
                IStrategoTerm d_11972 = null;
                d_11972 = term;
                term = a_11972;
                if(term.getTermType() != IStrategoTerm.APPL || Main._consModule_3 != ((IStrategoAppl)term).getConstructor())
                  break Fail4950;
                term = d_11972;
                { 
                  IStrategoTerm s_12154 = null;
                  if(y_11971.value == null)
                    break Fail4948;
                  term = y_11971.value;
                  if(term.getTermType() != IStrategoTerm.APPL || Main._consModule_3 != ((IStrategoAppl)term).getConstructor())
                    break Fail4948;
                  s_12154 = term.getSubterm(2);
                  term = mapconcat_1_0.instance.invoke(context, s_12154, index_toplevel_split_internal_0_0.instance);
                  if(term == null)
                    break Fail4948;
                  lifted1026 lifted10260 = new lifted1026();
                  lifted10260.y_11971 = y_11971;
                  term = map_1_0.instance.invoke(context, term, lifted10260);
                  if(term == null)
                    break Fail4948;
                  z_11971 = term;
                  if(true)
                    break Success2803;
                }
              }
              term = term2830;
              IStrategoTerm term2831 = term;
              Success2804:
              { 
                Fail4951:
                { 
                  IStrategoTerm e_11972 = null;
                  e_11972 = term;
                  term = a_11972;
                  if(term.getTermType() != IStrategoTerm.APPL || Main._consEntity_2 != ((IStrategoAppl)term).getConstructor())
                    break Fail4951;
                  term = e_11972;
                  { 
                    IStrategoTerm i_11972 = null;
                    IStrategoTerm j_11972 = null;
                    j_11972 = term;
                    if(y_11971.value == null)
                      break Fail4948;
                    term = nam_get_definition_key_0_0.instance.invoke(context, y_11971.value);
                    if(term == null)
                      break Fail4948;
                    term = index_uri_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail4948;
                    i_11972 = term;
                    term = j_11972;
                    if(y_11971.value == null)
                      break Fail4948;
                    term = (IStrategoTerm)termFactory.makeListCons(termFactory.makeTuple(y_11971.value, i_11972), (IStrategoList)trans.constNil3);
                    z_11971 = term;
                    if(true)
                      break Success2804;
                  }
                }
                term = term2831;
                if(y_11971.value == null)
                  break Fail4948;
                term = (IStrategoTerm)termFactory.makeListCons(termFactory.makeTuple(y_11971.value, trans.constNil3), (IStrategoList)trans.constNil3);
                z_11971 = term;
              }
            }
          }
          if(true)
            break Success2801;
        }
        term = term2828;
        IStrategoTerm f_11972 = null;
        IStrategoTerm g_11972 = null;
        IStrategoTerm l_11972 = null;
        f_11972 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail4947;
        g_11972 = term;
        l_11972 = f_11972;
        term = report_with_failure_0_2.instance.invoke(context, l_11972, trans.const950, g_11972);
        if(term == null)
          break Fail4947;
      }
      term = h_11972;
      if(z_11971 == null)
        break Fail4947;
      term = z_11971;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}