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

@SuppressWarnings("all") final class lifted523 extends Strategy 
{ 
  TermReference z_2145;

  TermReference a_2146;

  Strategy y_2146;

  Strategy w_2146;

  Strategy x_2146;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail2726:
    { 
      IStrategoTerm term1394 = term;
      Success1512:
      { 
        Fail2727:
        { 
          IStrategoTerm c_2146 = null;
          c_2146 = term;
          term = y_2146.invoke(context, term);
          if(term == null)
            break Fail2727;
          term = c_2146;
          { 
            IStrategoTerm term1395 = term;
            Success1513:
            { 
              Fail2728:
              { 
                IStrategoTerm c_2147 = null;
                IStrategoTerm e_2147 = null;
                IStrategoTerm h_2146 = null;
                IStrategoTerm j_2146 = null;
                IStrategoTerm k_2146 = null;
                IStrategoTerm r_2146 = null;
                IStrategoTerm t_2146 = null;
                IStrategoTerm u_2146 = null;
                e_2147 = term;
                if(z_2145.value == null)
                  break Fail2728;
                term = z_2145.value;
                IStrategoTerm term1396 = term;
                Success1514:
                { 
                  Fail2729:
                  { 
                    term = concat_strings_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail2729;
                    if(true)
                      break Success1514;
                  }
                  term = term1396;
                  IStrategoTerm term1397 = term;
                  Success1515:
                  { 
                    Fail2730:
                    { 
                      term = is_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail2730;
                      if(true)
                        break Success1515;
                    }
                    term = term1397;
                    IStrategoTerm term1398 = term;
                    Success1516:
                    { 
                      Fail2731:
                      { 
                        term = int_to_string_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail2731;
                        if(true)
                          break Success1516;
                      }
                      term = term1398;
                      IStrategoTerm term1399 = term;
                      Success1517:
                      { 
                        Fail2732:
                        { 
                          term = real_to_string_0_0.instance.invoke(context, term);
                          if(term == null)
                            break Fail2732;
                          if(true)
                            break Success1517;
                        }
                        term = term1399;
                        IStrategoTerm d_2146 = null;
                        IStrategoTerm e_2146 = null;
                        IStrategoTerm g_2146 = null;
                        d_2146 = term;
                        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                        if(term == null)
                          break Fail2728;
                        if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                          break Fail2728;
                        e_2146 = ((IStrategoList)term).tail();
                        g_2146 = e_2146;
                        term = report_failure_0_2.instance.invoke(context, g_2146, trans.const483, d_2146);
                        if(term == null)
                          break Fail2728;
                      }
                    }
                  }
                }
                j_2146 = term;
                h_2146 = trans.const265;
                k_2146 = j_2146;
                term = string_replace_0_2.instance.invoke(context, k_2146, h_2146, trans.const265);
                if(term == null)
                  break Fail2728;
                c_2147 = term;
                term = e_2147;
                IStrategoTerm term1400 = term;
                Success1518:
                { 
                  Fail2733:
                  { 
                    term = concat_strings_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail2733;
                    if(true)
                      break Success1518;
                  }
                  term = term1400;
                  IStrategoTerm term1401 = term;
                  Success1519:
                  { 
                    Fail2734:
                    { 
                      term = is_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail2734;
                      if(true)
                        break Success1519;
                    }
                    term = term1401;
                    IStrategoTerm term1402 = term;
                    Success1520:
                    { 
                      Fail2735:
                      { 
                        term = int_to_string_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail2735;
                        if(true)
                          break Success1520;
                      }
                      term = term1402;
                      IStrategoTerm term1403 = term;
                      Success1521:
                      { 
                        Fail2736:
                        { 
                          term = real_to_string_0_0.instance.invoke(context, term);
                          if(term == null)
                            break Fail2736;
                          if(true)
                            break Success1521;
                        }
                        term = term1403;
                        IStrategoTerm n_2146 = null;
                        IStrategoTerm o_2146 = null;
                        IStrategoTerm q_2146 = null;
                        n_2146 = term;
                        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                        if(term == null)
                          break Fail2728;
                        if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                          break Fail2728;
                        o_2146 = ((IStrategoList)term).tail();
                        q_2146 = o_2146;
                        term = report_failure_0_2.instance.invoke(context, q_2146, trans.const483, n_2146);
                        if(term == null)
                          break Fail2728;
                      }
                    }
                  }
                }
                t_2146 = term;
                r_2146 = trans.const265;
                u_2146 = t_2146;
                term = string_replace_0_2.instance.invoke(context, u_2146, r_2146, trans.const337);
                if(term == null)
                  break Fail2728;
                term = (IStrategoTerm)termFactory.makeListCons(c_2147, termFactory.makeListCons(trans.const412, termFactory.makeListCons(term, (IStrategoList)trans.constNil1)));
                term = concat_strings_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail2728;
                term = termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil1));
                term = open_import_3_0.instance.invoke(context, term, _Id.instance, w_2146, x_2146);
                if(term == null)
                  break Fail2728;
                if(true)
                  break Success1513;
              }
              term = term1395;
              lifted525 lifted5250 = new lifted525();
              lifted5250.a_2146 = a_2146;
              term = try_1_0.instance.invoke(context, term, lifted5250);
              if(term == null)
                break Fail2726;
            }
            if(true)
              break Success1512;
          }
        }
        term = term1394;
      }
      if(true)
        return term;
    }
    return null;
  }
}