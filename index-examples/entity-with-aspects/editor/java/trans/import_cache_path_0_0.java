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

@SuppressWarnings("all") public class import_cache_path_0_0 extends Strategy 
{ 
  public static import_cache_path_0_0 instance = new import_cache_path_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("import_cache_path_0_0");
    Fail2306:
    { 
      IStrategoTerm i_2147 = null;
      IStrategoTerm j_2147 = null;
      IStrategoTerm k_2147 = null;
      IStrategoTerm l_2147 = null;
      IStrategoTerm m_2147 = null;
      IStrategoTerm n_2148 = null;
      j_2147 = term;
      n_2148 = term;
      IStrategoTerm term1405 = term;
      Success1361:
      { 
        Fail2307:
        { 
          IStrategoTerm r_2147 = null;
          IStrategoTerm t_2147 = null;
          IStrategoTerm u_2147 = null;
          IStrategoTerm u_2148 = null;
          IStrategoTerm w_2148 = null;
          IStrategoTerm x_2148 = null;
          IStrategoTerm y_2148 = null;
          IStrategoTerm a_2149 = null;
          IStrategoTerm b_2149 = null;
          IStrategoTerm c_2149 = null;
          IStrategoTerm e_2149 = null;
          IStrategoTerm f_2149 = null;
          IStrategoTerm i_2149 = null;
          IStrategoTerm z_2147 = null;
          IStrategoTerm b_2148 = null;
          IStrategoTerm c_2148 = null;
          IStrategoTerm h_2148 = null;
          IStrategoTerm j_2148 = null;
          IStrategoTerm k_2148 = null;
          term = project_path_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2307;
          i_2147 = term;
          term = i_2147;
          IStrategoTerm term1406 = term;
          Success1362:
          { 
            Fail2308:
            { 
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail2308;
              if(true)
                break Success1362;
            }
            term = term1406;
            IStrategoTerm term1407 = term;
            Success1363:
            { 
              Fail2309:
              { 
                term = is_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail2309;
                if(true)
                  break Success1363;
              }
              term = term1407;
              IStrategoTerm term1408 = term;
              Success1364:
              { 
                Fail2310:
                { 
                  term = int_to_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail2310;
                  if(true)
                    break Success1364;
                }
                term = term1408;
                IStrategoTerm term1409 = term;
                Success1365:
                { 
                  Fail2311:
                  { 
                    term = real_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail2311;
                    if(true)
                      break Success1365;
                  }
                  term = term1409;
                  IStrategoTerm n_2147 = null;
                  IStrategoTerm o_2147 = null;
                  IStrategoTerm q_2147 = null;
                  n_2147 = term;
                  term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                  if(term == null)
                    break Fail2307;
                  if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                    break Fail2307;
                  o_2147 = ((IStrategoList)term).tail();
                  q_2147 = o_2147;
                  term = report_failure_0_2.instance.invoke(context, q_2147, trans.const484, n_2147);
                  if(term == null)
                    break Fail2307;
                }
              }
            }
          }
          t_2147 = term;
          r_2147 = trans.const265;
          u_2147 = t_2147;
          term = string_replace_0_2.instance.invoke(context, u_2147, r_2147, trans.const265);
          if(term == null)
            break Fail2307;
          term = (IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)trans.constCons129);
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2307;
          term = termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil1));
          IStrategoTerm term1410 = term;
          Success1366:
          { 
            Fail2312:
            { 
              term = file_exists_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail2312;
              if(true)
                break Success1366;
            }
            term = mkdir_0_0.instance.invoke(context, term1410);
            if(term == null)
              break Fail2307;
          }
          k_2147 = term;
          w_2148 = j_2147;
          u_2148 = trans.const412;
          x_2148 = w_2148;
          term = string_replace_0_2.instance.invoke(context, x_2148, u_2148, trans.const486);
          if(term == null)
            break Fail2307;
          a_2149 = term;
          y_2148 = trans.const292;
          b_2149 = a_2149;
          term = string_replace_0_2.instance.invoke(context, b_2149, y_2148, trans.const486);
          if(term == null)
            break Fail2307;
          e_2149 = term;
          c_2149 = trans.const487;
          f_2149 = e_2149;
          term = string_replace_0_2.instance.invoke(context, f_2149, c_2149, trans.const486);
          if(term == null)
            break Fail2307;
          l_2147 = term;
          term = k_2147;
          IStrategoTerm term1411 = term;
          Success1367:
          { 
            Fail2313:
            { 
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail2313;
              if(true)
                break Success1367;
            }
            term = term1411;
            IStrategoTerm term1412 = term;
            Success1368:
            { 
              Fail2314:
              { 
                term = is_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail2314;
                if(true)
                  break Success1368;
              }
              term = term1412;
              IStrategoTerm term1413 = term;
              Success1369:
              { 
                Fail2315:
                { 
                  term = int_to_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail2315;
                  if(true)
                    break Success1369;
                }
                term = term1413;
                IStrategoTerm term1414 = term;
                Success1370:
                { 
                  Fail2316:
                  { 
                    term = real_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail2316;
                    if(true)
                      break Success1370;
                  }
                  term = term1414;
                  IStrategoTerm v_2147 = null;
                  IStrategoTerm w_2147 = null;
                  IStrategoTerm y_2147 = null;
                  v_2147 = term;
                  term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                  if(term == null)
                    break Fail2307;
                  if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                    break Fail2307;
                  w_2147 = ((IStrategoList)term).tail();
                  y_2147 = w_2147;
                  term = report_failure_0_2.instance.invoke(context, y_2147, trans.const484, v_2147);
                  if(term == null)
                    break Fail2307;
                }
              }
            }
          }
          b_2148 = term;
          z_2147 = trans.const265;
          c_2148 = b_2148;
          term = string_replace_0_2.instance.invoke(context, c_2148, z_2147, trans.const265);
          if(term == null)
            break Fail2307;
          i_2149 = term;
          term = l_2147;
          IStrategoTerm term1415 = term;
          Success1371:
          { 
            Fail2317:
            { 
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail2317;
              if(true)
                break Success1371;
            }
            term = term1415;
            IStrategoTerm term1416 = term;
            Success1372:
            { 
              Fail2318:
              { 
                term = is_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail2318;
                if(true)
                  break Success1372;
              }
              term = term1416;
              IStrategoTerm term1417 = term;
              Success1373:
              { 
                Fail2319:
                { 
                  term = int_to_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail2319;
                  if(true)
                    break Success1373;
                }
                term = term1417;
                IStrategoTerm term1418 = term;
                Success1374:
                { 
                  Fail2320:
                  { 
                    term = real_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail2320;
                    if(true)
                      break Success1374;
                  }
                  term = term1418;
                  IStrategoTerm d_2148 = null;
                  IStrategoTerm e_2148 = null;
                  IStrategoTerm g_2148 = null;
                  d_2148 = term;
                  term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                  if(term == null)
                    break Fail2307;
                  if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                    break Fail2307;
                  e_2148 = ((IStrategoList)term).tail();
                  g_2148 = e_2148;
                  term = report_failure_0_2.instance.invoke(context, g_2148, trans.const484, d_2148);
                  if(term == null)
                    break Fail2307;
                }
              }
            }
          }
          j_2148 = term;
          h_2148 = trans.const265;
          k_2148 = j_2148;
          term = string_replace_0_2.instance.invoke(context, k_2148, h_2148, trans.const354);
          if(term == null)
            break Fail2307;
          term = (IStrategoTerm)termFactory.makeListCons(i_2149, termFactory.makeListCons(trans.const412, termFactory.makeListCons(term, (IStrategoList)trans.constCons130)));
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2307;
          term = termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil1));
          m_2147 = term;
          if(true)
            break Success1361;
        }
        term = term1405;
        IStrategoTerm l_2148 = null;
        IStrategoTerm m_2148 = null;
        IStrategoTerm n_2149 = null;
        l_2148 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail2306;
        m_2148 = term;
        n_2149 = l_2148;
        term = report_with_failure_0_2.instance.invoke(context, n_2149, trans.const489, m_2148);
        if(term == null)
          break Fail2306;
      }
      term = n_2148;
      if(m_2147 == null)
        break Fail2306;
      term = m_2147;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}