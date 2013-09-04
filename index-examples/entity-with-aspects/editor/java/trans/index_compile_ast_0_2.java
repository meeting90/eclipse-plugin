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

@SuppressWarnings("all") public class index_compile_ast_0_2 extends Strategy 
{ 
  public static index_compile_ast_0_2 instance = new index_compile_ast_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm u_12058, IStrategoTerm v_12058)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("index_compile_ast_0_2");
    Fail4524:
    { 
      IStrategoTerm g_11913 = null;
      IStrategoTerm h_11913 = null;
      IStrategoTerm i_11913 = null;
      IStrategoTerm j_11913 = null;
      TermReference k_11913 = new TermReference();
      IStrategoTerm l_11913 = null;
      IStrategoTerm m_11913 = null;
      g_11913 = term;
      IStrategoTerm term2471 = term;
      Success2450:
      { 
        Fail4525:
        { 
          IStrategoTerm term2472 = term;
          Success2451:
          { 
            Fail4526:
            { 
              IStrategoTerm n_11913 = null;
              n_11913 = term;
              term = index_uri_name_0_0.instance.invoke(context, v_12058);
              if(term == null)
                break Fail4526;
              h_11913 = term;
              term = n_11913;
              { 
                IStrategoTerm q_11914 = null;
                IStrategoTerm s_11913 = null;
                IStrategoTerm u_11913 = null;
                IStrategoTerm v_11913 = null;
                IStrategoTerm x_11914 = null;
                IStrategoTerm a_11914 = null;
                IStrategoTerm c_11914 = null;
                IStrategoTerm d_11914 = null;
                IStrategoTerm i_11914 = null;
                IStrategoTerm k_11914 = null;
                IStrategoTerm l_11914 = null;
                term = to_java_0_0.instance.invoke(context, g_11913);
                if(term == null)
                  break Fail4525;
                l_11913 = term;
                term = dirname_0_0.instance.invoke(context, u_12058);
                if(term == null)
                  break Fail4525;
                i_11913 = term;
                q_11914 = h_11913;
                term = guarantee_extension_0_1.instance.invoke(context, q_11914, trans.const849);
                if(term == null)
                  break Fail4525;
                j_11913 = term;
                term = i_11913;
                IStrategoTerm term2473 = term;
                Success2452:
                { 
                  Fail4527:
                  { 
                    term = concat_strings_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail4527;
                    if(true)
                      break Success2452;
                  }
                  term = term2473;
                  IStrategoTerm term2474 = term;
                  Success2453:
                  { 
                    Fail4528:
                    { 
                      term = is_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail4528;
                      if(true)
                        break Success2453;
                    }
                    term = term2474;
                    IStrategoTerm term2475 = term;
                    Success2454:
                    { 
                      Fail4529:
                      { 
                        term = int_to_string_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail4529;
                        if(true)
                          break Success2454;
                      }
                      term = term2475;
                      IStrategoTerm term2476 = term;
                      Success2455:
                      { 
                        Fail4530:
                        { 
                          term = real_to_string_0_0.instance.invoke(context, term);
                          if(term == null)
                            break Fail4530;
                          if(true)
                            break Success2455;
                        }
                        term = term2476;
                        IStrategoTerm o_11913 = null;
                        IStrategoTerm p_11913 = null;
                        IStrategoTerm r_11913 = null;
                        o_11913 = term;
                        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                        if(term == null)
                          break Fail4525;
                        if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                          break Fail4525;
                        p_11913 = ((IStrategoList)term).tail();
                        r_11913 = p_11913;
                        term = report_failure_0_2.instance.invoke(context, r_11913, trans.const850, o_11913);
                        if(term == null)
                          break Fail4525;
                      }
                    }
                  }
                }
                u_11913 = term;
                s_11913 = trans.const785;
                v_11913 = u_11913;
                term = string_replace_0_2.instance.invoke(context, v_11913, s_11913, trans.const785);
                if(term == null)
                  break Fail4525;
                term = (IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)trans.constCons236);
                term = concat_strings_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail4525;
                term = termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil3));
                if(k_11913.value == null)
                  k_11913.value = term;
                else
                  if(k_11913.value != term && !k_11913.value.match(term))
                    break Fail4525;
                if(k_11913.value == null)
                  break Fail4525;
                term = k_11913.value;
                IStrategoTerm term2477 = term;
                Success2456:
                { 
                  Fail4531:
                  { 
                    term = concat_strings_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail4531;
                    if(true)
                      break Success2456;
                  }
                  term = term2477;
                  IStrategoTerm term2478 = term;
                  Success2457:
                  { 
                    Fail4532:
                    { 
                      term = is_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail4532;
                      if(true)
                        break Success2457;
                    }
                    term = term2478;
                    IStrategoTerm term2479 = term;
                    Success2458:
                    { 
                      Fail4533:
                      { 
                        term = int_to_string_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail4533;
                        if(true)
                          break Success2458;
                      }
                      term = term2479;
                      IStrategoTerm term2480 = term;
                      Success2459:
                      { 
                        Fail4534:
                        { 
                          term = real_to_string_0_0.instance.invoke(context, term);
                          if(term == null)
                            break Fail4534;
                          if(true)
                            break Success2459;
                        }
                        term = term2480;
                        IStrategoTerm w_11913 = null;
                        IStrategoTerm x_11913 = null;
                        IStrategoTerm z_11913 = null;
                        w_11913 = term;
                        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                        if(term == null)
                          break Fail4525;
                        if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                          break Fail4525;
                        x_11913 = ((IStrategoList)term).tail();
                        z_11913 = x_11913;
                        term = report_failure_0_2.instance.invoke(context, z_11913, trans.const850, w_11913);
                        if(term == null)
                          break Fail4525;
                      }
                    }
                  }
                }
                c_11914 = term;
                a_11914 = trans.const785;
                d_11914 = c_11914;
                term = string_replace_0_2.instance.invoke(context, d_11914, a_11914, trans.const785);
                if(term == null)
                  break Fail4525;
                x_11914 = term;
                term = j_11913;
                IStrategoTerm term2481 = term;
                Success2460:
                { 
                  Fail4535:
                  { 
                    term = concat_strings_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail4535;
                    if(true)
                      break Success2460;
                  }
                  term = term2481;
                  IStrategoTerm term2482 = term;
                  Success2461:
                  { 
                    Fail4536:
                    { 
                      term = is_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail4536;
                      if(true)
                        break Success2461;
                    }
                    term = term2482;
                    IStrategoTerm term2483 = term;
                    Success2462:
                    { 
                      Fail4537:
                      { 
                        term = int_to_string_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail4537;
                        if(true)
                          break Success2462;
                      }
                      term = term2483;
                      IStrategoTerm term2484 = term;
                      Success2463:
                      { 
                        Fail4538:
                        { 
                          term = real_to_string_0_0.instance.invoke(context, term);
                          if(term == null)
                            break Fail4538;
                          if(true)
                            break Success2463;
                        }
                        term = term2484;
                        IStrategoTerm e_11914 = null;
                        IStrategoTerm f_11914 = null;
                        IStrategoTerm h_11914 = null;
                        e_11914 = term;
                        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                        if(term == null)
                          break Fail4525;
                        if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                          break Fail4525;
                        f_11914 = ((IStrategoList)term).tail();
                        h_11914 = f_11914;
                        term = report_failure_0_2.instance.invoke(context, h_11914, trans.const850, e_11914);
                        if(term == null)
                          break Fail4525;
                      }
                    }
                  }
                }
                k_11914 = term;
                i_11914 = trans.const785;
                l_11914 = k_11914;
                term = string_replace_0_2.instance.invoke(context, l_11914, i_11914, trans.const852);
                if(term == null)
                  break Fail4525;
                term = (IStrategoTerm)termFactory.makeListCons(x_11914, termFactory.makeListCons(term, (IStrategoList)trans.constNil3));
                term = concat_strings_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail4525;
                term = termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil3));
                m_11913 = term;
                lifted956 lifted9560 = new lifted956();
                lifted9560.k_11913 = k_11913;
                term = try_1_0.instance.invoke(context, term, lifted9560);
                if(term == null)
                  break Fail4525;
                term = termFactory.makeTuple(m_11913, trans.const815);
                term = fopen_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail4525;
                term = termFactory.makeTuple(l_11913, term);
                term = fputs_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail4525;
                term = fclose_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail4525;
                if(true)
                  break Success2451;
              }
            }
            term = term2472;
          }
          if(true)
            break Success2450;
        }
        term = term2471;
        IStrategoTerm m_11914 = null;
        IStrategoTerm n_11914 = null;
        IStrategoTerm e_11915 = null;
        m_11914 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail4524;
        n_11914 = term;
        e_11915 = m_11914;
        term = report_with_failure_0_2.instance.invoke(context, e_11915, trans.const853, n_11914);
        if(term == null)
          break Fail4524;
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