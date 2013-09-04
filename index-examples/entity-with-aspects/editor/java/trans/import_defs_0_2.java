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

@SuppressWarnings("all") public class import_defs_0_2 extends Strategy 
{ 
  public static import_defs_0_2 instance = new import_defs_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_d_2196, IStrategoTerm ref_e_2196)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference d_2196 = new TermReference(ref_d_2196);
    TermReference e_2196 = new TermReference(ref_e_2196);
    context.push("import_defs_0_2");
    Fail1917:
    { 
      IStrategoTerm term1189 = term;
      Success1168:
      { 
        Fail1918:
        { 
          IStrategoTerm z_2082 = null;
          IStrategoTerm a_2083 = null;
          IStrategoTerm d_2083 = null;
          IStrategoTerm e_2083 = null;
          if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
            break Fail1918;
          z_2082 = term.getSubterm(0);
          d_2083 = term.getSubterm(1);
          term = d_2083;
          IStrategoTerm term1190 = term;
          Success1169:
          { 
            Fail1919:
            { 
              term = collect_one_1_0.instance.invoke(context, term, lifted375.instance);
              if(term == null)
                break Fail1919;
              { 
                if(true)
                  break Fail1918;
                if(true)
                  break Success1169;
              }
            }
            term = term1190;
          }
          e_2083 = term;
          IStrategoTerm term1191 = term;
          Success1170:
          { 
            Fail1920:
            { 
              IStrategoTerm f_2083 = null;
              IStrategoTerm g_2083 = null;
              g_2083 = term;
              term = index_uri_path_0_0.instance.invoke(context, z_2082);
              if(term == null)
                break Fail1920;
              f_2083 = term;
              term = g_2083;
              if(d_2196.value == null)
                break Fail1920;
              IStrategoList list55;
              list55 = checkListTail(f_2083);
              if(list55 == null)
                break Fail1920;
              term = (IStrategoTerm)termFactory.makeListCons(d_2196.value, list55);
              a_2083 = term;
              if(true)
                break Success1170;
            }
            term = term1191;
            IStrategoTerm b_2083 = null;
            IStrategoTerm c_2083 = null;
            IStrategoTerm i_2083 = null;
            b_2083 = term;
            term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
            if(term == null)
              break Fail1918;
            c_2083 = term;
            i_2083 = b_2083;
            term = report_with_failure_0_2.instance.invoke(context, i_2083, trans.const394, c_2083);
            if(term == null)
              break Fail1918;
          }
          term = e_2083;
          if(a_2083 == null)
            break Fail1918;
          term = (IStrategoTerm)termFactory.makeListCons(a_2083, (IStrategoList)trans.constNil1);
          if(true)
            break Success1168;
        }
        term = term1189;
        IStrategoTerm f_2082 = null;
        IStrategoTerm g_2082 = null;
        TermReference h_2082 = new TermReference();
        IStrategoTerm j_2082 = null;
        IStrategoTerm n_2082 = null;
        IStrategoTerm o_2082 = null;
        if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
          break Fail1917;
        f_2082 = term.getSubterm(0);
        n_2082 = term.getSubterm(1);
        term = collect_one_1_0.instance.invoke(context, n_2082, lifted376.instance);
        if(term == null)
          break Fail1917;
        o_2082 = term;
        IStrategoTerm term1192 = term;
        Success1171:
        { 
          Fail1921:
          { 
            term = index_uri_path_0_0.instance.invoke(context, f_2082);
            if(term == null)
              break Fail1921;
            g_2082 = term;
            if(d_2196.value == null)
              break Fail1921;
            IStrategoList list56;
            list56 = checkListTail(g_2082);
            if(list56 == null)
              break Fail1921;
            term = (IStrategoTerm)termFactory.makeListCons(d_2196.value, list56);
            if(h_2082.value == null)
              h_2082.value = term;
            else
              if(h_2082.value != term && !h_2082.value.match(term))
                break Fail1921;
            Success1172:
            { 
              Fail1922:
              { 
                IStrategoTerm k_2082 = null;
                k_2082 = term;
                IStrategoTerm term1194 = term;
                Success1173:
                { 
                  Fail1923:
                  { 
                    if(h_2082.value == null || e_2196.value == null)
                      break Fail1923;
                    term = termFactory.makeTuple(h_2082.value, e_2196.value);
                    term = elem_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail1923;
                    { 
                      if(true)
                        break Fail1922;
                      if(true)
                        break Success1173;
                    }
                  }
                  term = term1194;
                }
                term = k_2082;
                { 
                  IStrategoTerm p_2082 = null;
                  term = import_values_0_2.instance.invoke(context, term, d_2196.value, g_2082);
                  if(term == null)
                    break Fail1921;
                  p_2082 = term;
                  term = p_2082;
                  lifted377 lifted3770 = new lifted377();
                  lifted3770.h_2082 = h_2082;
                  lifted3770.e_2196 = e_2196;
                  lifted3770.d_2196 = d_2196;
                  term = mapconcat_1_0.instance.invoke(context, term, lifted3770);
                  if(term == null)
                    break Fail1921;
                  j_2082 = term;
                  if(true)
                    break Success1172;
                }
              }
              term = trans.constNil1;
              j_2082 = trans.constNil1;
            }
            if(true)
              break Success1171;
          }
          term = term1192;
          IStrategoTerm l_2082 = null;
          IStrategoTerm m_2082 = null;
          IStrategoTerm u_2082 = null;
          l_2082 = term;
          term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
          if(term == null)
            break Fail1917;
          m_2082 = term;
          u_2082 = l_2082;
          term = report_with_failure_0_2.instance.invoke(context, u_2082, trans.const394, m_2082);
          if(term == null)
            break Fail1917;
        }
        term = o_2082;
        if(h_2082.value == null || j_2082 == null)
          break Fail1917;
        term = termFactory.makeTuple((IStrategoTerm)termFactory.makeListCons(h_2082.value, (IStrategoList)trans.constNil1), j_2082);
        term = conc_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail1917;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}