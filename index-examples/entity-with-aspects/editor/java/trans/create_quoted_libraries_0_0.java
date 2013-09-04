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

@SuppressWarnings("all") public class create_quoted_libraries_0_0 extends Strategy 
{ 
  public static create_quoted_libraries_0_0 instance = new create_quoted_libraries_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("create_quoted_libraries_0_0");
    Fail4441:
    { 
      IStrategoTerm n_11894 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 5)
        break Fail4441;
      n_11894 = term.getSubterm(4);
      IStrategoTerm term2412 = term;
      Success2412:
      { 
        Fail4442:
        { 
          IStrategoTerm a_11897 = null;
          IStrategoTerm u_11894 = null;
          IStrategoTerm w_11894 = null;
          IStrategoTerm x_11894 = null;
          IStrategoTerm b_11897 = null;
          IStrategoTerm c_11895 = null;
          IStrategoTerm e_11895 = null;
          IStrategoTerm f_11895 = null;
          IStrategoTerm c_11897 = null;
          IStrategoTerm k_11895 = null;
          IStrategoTerm m_11895 = null;
          IStrategoTerm n_11895 = null;
          IStrategoTerm d_11897 = null;
          IStrategoTerm s_11895 = null;
          IStrategoTerm u_11895 = null;
          IStrategoTerm v_11895 = null;
          IStrategoTerm a_11896 = null;
          IStrategoTerm c_11896 = null;
          IStrategoTerm d_11896 = null;
          term = n_11894;
          IStrategoTerm term2417 = term;
          Success2413:
          { 
            Fail4443:
            { 
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail4443;
              if(true)
                break Success2413;
            }
            term = term2417;
            IStrategoTerm term2418 = term;
            Success2414:
            { 
              Fail4444:
              { 
                term = is_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail4444;
                if(true)
                  break Success2414;
              }
              term = term2418;
              IStrategoTerm term2419 = term;
              Success2415:
              { 
                Fail4445:
                { 
                  term = int_to_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail4445;
                  if(true)
                    break Success2415;
                }
                term = term2419;
                IStrategoTerm term2420 = term;
                Success2416:
                { 
                  Fail4446:
                  { 
                    term = real_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail4446;
                    if(true)
                      break Success2416;
                  }
                  term = term2420;
                  IStrategoTerm q_11894 = null;
                  IStrategoTerm r_11894 = null;
                  IStrategoTerm t_11894 = null;
                  q_11894 = term;
                  term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                  if(term == null)
                    break Fail4442;
                  if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                    break Fail4442;
                  r_11894 = ((IStrategoList)term).tail();
                  t_11894 = r_11894;
                  term = report_failure_0_2.instance.invoke(context, t_11894, trans.const784, q_11894);
                  if(term == null)
                    break Fail4442;
                }
              }
            }
          }
          w_11894 = term;
          u_11894 = trans.const785;
          x_11894 = w_11894;
          term = string_replace_0_2.instance.invoke(context, x_11894, u_11894, trans.const785);
          if(term == null)
            break Fail4442;
          term = (IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)trans.constCons220);
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail4442;
          a_11897 = term;
          term = n_11894;
          IStrategoTerm term2421 = term;
          Success2417:
          { 
            Fail4447:
            { 
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail4447;
              if(true)
                break Success2417;
            }
            term = term2421;
            IStrategoTerm term2422 = term;
            Success2418:
            { 
              Fail4448:
              { 
                term = is_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail4448;
                if(true)
                  break Success2418;
              }
              term = term2422;
              IStrategoTerm term2423 = term;
              Success2419:
              { 
                Fail4449:
                { 
                  term = int_to_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail4449;
                  if(true)
                    break Success2419;
                }
                term = term2423;
                IStrategoTerm term2424 = term;
                Success2420:
                { 
                  Fail4450:
                  { 
                    term = real_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail4450;
                    if(true)
                      break Success2420;
                  }
                  term = term2424;
                  IStrategoTerm y_11894 = null;
                  IStrategoTerm z_11894 = null;
                  IStrategoTerm b_11895 = null;
                  y_11894 = term;
                  term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                  if(term == null)
                    break Fail4442;
                  if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                    break Fail4442;
                  z_11894 = ((IStrategoList)term).tail();
                  b_11895 = z_11894;
                  term = report_failure_0_2.instance.invoke(context, b_11895, trans.const784, y_11894);
                  if(term == null)
                    break Fail4442;
                }
              }
            }
          }
          e_11895 = term;
          c_11895 = trans.const785;
          f_11895 = e_11895;
          term = string_replace_0_2.instance.invoke(context, f_11895, c_11895, trans.const785);
          if(term == null)
            break Fail4442;
          term = (IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)trans.constCons221);
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail4442;
          b_11897 = term;
          term = n_11894;
          IStrategoTerm term2425 = term;
          Success2421:
          { 
            Fail4451:
            { 
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail4451;
              if(true)
                break Success2421;
            }
            term = term2425;
            IStrategoTerm term2426 = term;
            Success2422:
            { 
              Fail4452:
              { 
                term = is_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail4452;
                if(true)
                  break Success2422;
              }
              term = term2426;
              IStrategoTerm term2427 = term;
              Success2423:
              { 
                Fail4453:
                { 
                  term = int_to_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail4453;
                  if(true)
                    break Success2423;
                }
                term = term2427;
                IStrategoTerm term2428 = term;
                Success2424:
                { 
                  Fail4454:
                  { 
                    term = real_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail4454;
                    if(true)
                      break Success2424;
                  }
                  term = term2428;
                  IStrategoTerm g_11895 = null;
                  IStrategoTerm h_11895 = null;
                  IStrategoTerm j_11895 = null;
                  g_11895 = term;
                  term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                  if(term == null)
                    break Fail4442;
                  if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                    break Fail4442;
                  h_11895 = ((IStrategoList)term).tail();
                  j_11895 = h_11895;
                  term = report_failure_0_2.instance.invoke(context, j_11895, trans.const784, g_11895);
                  if(term == null)
                    break Fail4442;
                }
              }
            }
          }
          m_11895 = term;
          k_11895 = trans.const785;
          n_11895 = m_11895;
          term = string_replace_0_2.instance.invoke(context, n_11895, k_11895, trans.const785);
          if(term == null)
            break Fail4442;
          term = (IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)trans.constCons222);
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail4442;
          c_11897 = term;
          term = n_11894;
          IStrategoTerm term2429 = term;
          Success2425:
          { 
            Fail4455:
            { 
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail4455;
              if(true)
                break Success2425;
            }
            term = term2429;
            IStrategoTerm term2430 = term;
            Success2426:
            { 
              Fail4456:
              { 
                term = is_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail4456;
                if(true)
                  break Success2426;
              }
              term = term2430;
              IStrategoTerm term2431 = term;
              Success2427:
              { 
                Fail4457:
                { 
                  term = int_to_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail4457;
                  if(true)
                    break Success2427;
                }
                term = term2431;
                IStrategoTerm term2432 = term;
                Success2428:
                { 
                  Fail4458:
                  { 
                    term = real_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail4458;
                    if(true)
                      break Success2428;
                  }
                  term = term2432;
                  IStrategoTerm o_11895 = null;
                  IStrategoTerm p_11895 = null;
                  IStrategoTerm r_11895 = null;
                  o_11895 = term;
                  term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                  if(term == null)
                    break Fail4442;
                  if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                    break Fail4442;
                  p_11895 = ((IStrategoList)term).tail();
                  r_11895 = p_11895;
                  term = report_failure_0_2.instance.invoke(context, r_11895, trans.const784, o_11895);
                  if(term == null)
                    break Fail4442;
                }
              }
            }
          }
          u_11895 = term;
          s_11895 = trans.const785;
          v_11895 = u_11895;
          term = string_replace_0_2.instance.invoke(context, v_11895, s_11895, trans.const785);
          if(term == null)
            break Fail4442;
          term = (IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)trans.constCons223);
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail4442;
          d_11897 = term;
          term = n_11894;
          IStrategoTerm term2433 = term;
          Success2429:
          { 
            Fail4459:
            { 
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail4459;
              if(true)
                break Success2429;
            }
            term = term2433;
            IStrategoTerm term2434 = term;
            Success2430:
            { 
              Fail4460:
              { 
                term = is_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail4460;
                if(true)
                  break Success2430;
              }
              term = term2434;
              IStrategoTerm term2435 = term;
              Success2431:
              { 
                Fail4461:
                { 
                  term = int_to_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail4461;
                  if(true)
                    break Success2431;
                }
                term = term2435;
                IStrategoTerm term2436 = term;
                Success2432:
                { 
                  Fail4462:
                  { 
                    term = real_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail4462;
                    if(true)
                      break Success2432;
                  }
                  term = term2436;
                  IStrategoTerm w_11895 = null;
                  IStrategoTerm x_11895 = null;
                  IStrategoTerm z_11895 = null;
                  w_11895 = term;
                  term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                  if(term == null)
                    break Fail4442;
                  if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                    break Fail4442;
                  x_11895 = ((IStrategoList)term).tail();
                  z_11895 = x_11895;
                  term = report_failure_0_2.instance.invoke(context, z_11895, trans.const784, w_11895);
                  if(term == null)
                    break Fail4442;
                }
              }
            }
          }
          c_11896 = term;
          a_11896 = trans.const785;
          d_11896 = c_11896;
          term = string_replace_0_2.instance.invoke(context, d_11896, a_11896, trans.const785);
          if(term == null)
            break Fail4442;
          term = (IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)trans.constCons224);
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail4442;
          term = (IStrategoTerm)termFactory.makeListCons(termFactory.annotateTerm(a_11897, checkListAnnos(termFactory, trans.constNil3)), termFactory.makeListCons(termFactory.annotateTerm(b_11897, checkListAnnos(termFactory, trans.constNil3)), termFactory.makeListCons(termFactory.annotateTerm(c_11897, checkListAnnos(termFactory, trans.constNil3)), termFactory.makeListCons(termFactory.annotateTerm(d_11897, checkListAnnos(termFactory, trans.constNil3)), termFactory.makeListCons(termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil3)), (IStrategoList)trans.constNil3)))));
          term = map_1_0.instance.invoke(context, term, lifted937.instance);
          if(term == null)
            break Fail4442;
          term = map_1_0.instance.invoke(context, term, lifted938.instance);
          if(term == null)
            break Fail4442;
          if(true)
            break Success2412;
        }
        term = term2412;
        IStrategoTerm x_11896 = null;
        IStrategoTerm y_11896 = null;
        IStrategoTerm f_11898 = null;
        x_11896 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail4441;
        y_11896 = term;
        f_11898 = x_11896;
        term = report_with_failure_0_2.instance.invoke(context, f_11898, trans.const793, y_11896);
        if(term == null)
          break Fail4441;
      }
      term = trans.constNone0;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}