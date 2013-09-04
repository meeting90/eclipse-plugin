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

@SuppressWarnings("all") public class analyze_top_0_4 extends Strategy 
{ 
  public static analyze_top_0_4 instance = new analyze_top_0_4();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm y_2122, IStrategoTerm z_2122, IStrategoTerm a_2123, IStrategoTerm b_2123)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("analyze_top_0_4");
    Fail2148:
    { 
      IStrategoTerm d_2123 = null;
      TermReference e_2123 = new TermReference();
      IStrategoTerm f_2123 = null;
      IStrategoTerm g_2123 = null;
      IStrategoTerm h_2123 = null;
      IStrategoTerm b_2124 = null;
      d_2123 = term;
      b_2124 = term;
      IStrategoTerm term1326 = term;
      Success1296:
      { 
        Fail2149:
        { 
          IStrategoTerm e_2124 = null;
          IStrategoTerm m_2123 = null;
          IStrategoTerm o_2123 = null;
          IStrategoTerm p_2123 = null;
          IStrategoTerm u_2123 = null;
          IStrategoTerm w_2123 = null;
          IStrategoTerm x_2123 = null;
          term = b_2123;
          IStrategoTerm term1327 = term;
          Success1297:
          { 
            Fail2150:
            { 
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail2150;
              if(true)
                break Success1297;
            }
            term = term1327;
            IStrategoTerm term1328 = term;
            Success1298:
            { 
              Fail2151:
              { 
                term = is_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail2151;
                if(true)
                  break Success1298;
              }
              term = term1328;
              IStrategoTerm term1329 = term;
              Success1299:
              { 
                Fail2152:
                { 
                  term = int_to_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail2152;
                  if(true)
                    break Success1299;
                }
                term = term1329;
                IStrategoTerm term1330 = term;
                Success1300:
                { 
                  Fail2153:
                  { 
                    term = real_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail2153;
                    if(true)
                      break Success1300;
                  }
                  term = term1330;
                  IStrategoTerm i_2123 = null;
                  IStrategoTerm j_2123 = null;
                  IStrategoTerm l_2123 = null;
                  i_2123 = term;
                  term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                  if(term == null)
                    break Fail2149;
                  if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                    break Fail2149;
                  j_2123 = ((IStrategoList)term).tail();
                  l_2123 = j_2123;
                  term = report_failure_0_2.instance.invoke(context, l_2123, trans.const447, i_2123);
                  if(term == null)
                    break Fail2149;
                }
              }
            }
          }
          o_2123 = term;
          m_2123 = trans.const265;
          p_2123 = o_2123;
          term = string_replace_0_2.instance.invoke(context, p_2123, m_2123, trans.const265);
          if(term == null)
            break Fail2149;
          e_2124 = term;
          term = a_2123;
          IStrategoTerm term1331 = term;
          Success1301:
          { 
            Fail2154:
            { 
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail2154;
              if(true)
                break Success1301;
            }
            term = term1331;
            IStrategoTerm term1332 = term;
            Success1302:
            { 
              Fail2155:
              { 
                term = is_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail2155;
                if(true)
                  break Success1302;
              }
              term = term1332;
              IStrategoTerm term1333 = term;
              Success1303:
              { 
                Fail2156:
                { 
                  term = int_to_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail2156;
                  if(true)
                    break Success1303;
                }
                term = term1333;
                IStrategoTerm term1334 = term;
                Success1304:
                { 
                  Fail2157:
                  { 
                    term = real_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail2157;
                    if(true)
                      break Success1304;
                  }
                  term = term1334;
                  IStrategoTerm q_2123 = null;
                  IStrategoTerm r_2123 = null;
                  IStrategoTerm t_2123 = null;
                  q_2123 = term;
                  term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                  if(term == null)
                    break Fail2149;
                  if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                    break Fail2149;
                  r_2123 = ((IStrategoList)term).tail();
                  t_2123 = r_2123;
                  term = report_failure_0_2.instance.invoke(context, t_2123, trans.const447, q_2123);
                  if(term == null)
                    break Fail2149;
                }
              }
            }
          }
          w_2123 = term;
          u_2123 = trans.const265;
          x_2123 = w_2123;
          term = string_replace_0_2.instance.invoke(context, x_2123, u_2123, trans.const448);
          if(term == null)
            break Fail2149;
          term = (IStrategoTerm)termFactory.makeListCons(e_2124, termFactory.makeListCons(trans.const412, termFactory.makeListCons(term, (IStrategoList)trans.constNil1)));
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2149;
          term = termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil1));
          if(e_2123.value == null)
            e_2123.value = term;
          else
            if(e_2123.value != term && !e_2123.value.match(term))
              break Fail2149;
          IStrategoTerm term1335 = term;
          Success1305:
          { 
            Fail2158:
            { 
              if(true)
                break Fail2158;
              { 
                IStrategoTerm j_2124 = null;
                j_2124 = term;
                term = (IStrategoTerm)termFactory.makeListCons(b_2123, (IStrategoList)trans.constNil1);
                term = index_setup_0_3.instance.invoke(context, j_2124, z_2122, term, e_2123.value);
                if(term == null)
                  break Fail2149;
                term = index_toplevel_split_0_0.instance.invoke(context, d_2123);
                if(term == null)
                  break Fail2149;
                g_2123 = term;
                lifted453 lifted4530 = new lifted453();
                lifted4530.e_2123 = e_2123;
                term = map_1_0.instance.invoke(context, term, lifted4530);
                if(term == null)
                  break Fail2149;
                term = analyze_top_internal_0_4.instance.invoke(context, term, y_2122, z_2122, b_2123, e_2123.value);
                if(term == null)
                  break Fail2149;
                if(term.getTermType() != IStrategoTerm.APPL || Main._consResults_7 != ((IStrategoAppl)term).getConstructor())
                  break Fail2149;
                h_2123 = term.getSubterm(0);
                f_2123 = term.getSubterm(6);
                if(true)
                  break Success1305;
              }
            }
            term = term1335;
            if(e_2123.value == null)
              break Fail2149;
            term = (IStrategoTerm)termFactory.makeListCons(termFactory.makeTuple(d_2123, termFactory.makeTuple(e_2123.value, trans.constNil1)), (IStrategoList)trans.constNil1);
            term = analyze_top_internal_0_4.instance.invoke(context, term, y_2122, z_2122, b_2123, e_2123.value);
            if(term == null)
              break Fail2149;
            if(term.getTermType() != IStrategoTerm.APPL || Main._consResults_7 != ((IStrategoAppl)term).getConstructor())
              break Fail2149;
            g_2123 = term.getSubterm(0);
            f_2123 = term.getSubterm(6);
            term = $Hd_0_0.instance.invoke(context, g_2123);
            if(term == null)
              break Fail2149;
            h_2123 = term;
          }
          if(true)
            break Success1296;
        }
        term = term1326;
        IStrategoTerm z_2123 = null;
        IStrategoTerm a_2124 = null;
        IStrategoTerm l_2124 = null;
        z_2123 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail2148;
        a_2124 = term;
        l_2124 = z_2123;
        term = report_with_failure_0_2.instance.invoke(context, l_2124, trans.const449, a_2124);
        if(term == null)
          break Fail2148;
      }
      term = b_2124;
      if(h_2123 == null || f_2123 == null)
        break Fail2148;
      term = termFactory.makeTuple(h_2123, f_2123);
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}