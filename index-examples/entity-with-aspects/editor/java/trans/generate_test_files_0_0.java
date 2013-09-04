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

@SuppressWarnings("all") public class generate_test_files_0_0 extends Strategy 
{ 
  public static generate_test_files_0_0 instance = new generate_test_files_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("generate_test_files_0_0");
    Fail5361:
    { 
      IStrategoTerm x_12034 = null;
      IStrategoTerm y_12034 = null;
      IStrategoTerm z_12034 = null;
      IStrategoTerm a_12035 = null;
      IStrategoTerm b_12035 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 5)
        break Fail5361;
      x_12034 = term.getSubterm(0);
      y_12034 = term.getSubterm(1);
      z_12034 = term.getSubterm(2);
      a_12035 = term.getSubterm(3);
      b_12035 = term.getSubterm(4);
      IStrategoTerm term3068 = term;
      Success3018:
      { 
        Fail5362:
        { 
          IStrategoTerm v_12035 = null;
          IStrategoTerm w_12035 = null;
          IStrategoTerm y_12035 = null;
          IStrategoTerm z_12035 = null;
          IStrategoTerm b_12036 = null;
          IStrategoTerm c_12036 = null;
          IStrategoTerm f_12036 = null;
          IStrategoTerm g_12035 = null;
          IStrategoTerm i_12035 = null;
          IStrategoTerm j_12035 = null;
          IStrategoTerm o_12035 = null;
          IStrategoTerm q_12035 = null;
          IStrategoTerm r_12035 = null;
          y_12035 = term;
          z_12035 = trans.const998;
          v_12035 = z_12035;
          b_12036 = y_12035;
          term = (IStrategoTerm)termFactory.makeListCons(b_12035, (IStrategoList)trans.constNil3);
          w_12035 = term;
          c_12036 = b_12036;
          term = b_12035;
          IStrategoTerm term3069 = term;
          Success3019:
          { 
            Fail5363:
            { 
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail5363;
              if(true)
                break Success3019;
            }
            term = term3069;
            IStrategoTerm term3070 = term;
            Success3020:
            { 
              Fail5364:
              { 
                term = is_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail5364;
                if(true)
                  break Success3020;
              }
              term = term3070;
              IStrategoTerm term3071 = term;
              Success3021:
              { 
                Fail5365:
                { 
                  term = int_to_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail5365;
                  if(true)
                    break Success3021;
                }
                term = term3071;
                IStrategoTerm term3072 = term;
                Success3022:
                { 
                  Fail5366:
                  { 
                    term = real_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail5366;
                    if(true)
                      break Success3022;
                  }
                  term = term3072;
                  IStrategoTerm c_12035 = null;
                  IStrategoTerm d_12035 = null;
                  IStrategoTerm f_12035 = null;
                  c_12035 = term;
                  term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                  if(term == null)
                    break Fail5362;
                  if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                    break Fail5362;
                  d_12035 = ((IStrategoList)term).tail();
                  f_12035 = d_12035;
                  term = report_failure_0_2.instance.invoke(context, f_12035, trans.const1034, c_12035);
                  if(term == null)
                    break Fail5362;
                }
              }
            }
          }
          i_12035 = term;
          g_12035 = trans.const785;
          j_12035 = i_12035;
          term = string_replace_0_2.instance.invoke(context, j_12035, g_12035, trans.const785);
          if(term == null)
            break Fail5362;
          f_12036 = term;
          term = a_12035;
          IStrategoTerm term3073 = term;
          Success3023:
          { 
            Fail5367:
            { 
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail5367;
              if(true)
                break Success3023;
            }
            term = term3073;
            IStrategoTerm term3074 = term;
            Success3024:
            { 
              Fail5368:
              { 
                term = is_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail5368;
                if(true)
                  break Success3024;
              }
              term = term3074;
              IStrategoTerm term3075 = term;
              Success3025:
              { 
                Fail5369:
                { 
                  term = int_to_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail5369;
                  if(true)
                    break Success3025;
                }
                term = term3075;
                IStrategoTerm term3076 = term;
                Success3026:
                { 
                  Fail5370:
                  { 
                    term = real_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail5370;
                    if(true)
                      break Success3026;
                  }
                  term = term3076;
                  IStrategoTerm k_12035 = null;
                  IStrategoTerm l_12035 = null;
                  IStrategoTerm n_12035 = null;
                  k_12035 = term;
                  term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                  if(term == null)
                    break Fail5362;
                  if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                    break Fail5362;
                  l_12035 = ((IStrategoList)term).tail();
                  n_12035 = l_12035;
                  term = report_failure_0_2.instance.invoke(context, n_12035, trans.const1034, k_12035);
                  if(term == null)
                    break Fail5362;
                }
              }
            }
          }
          q_12035 = term;
          o_12035 = trans.const785;
          r_12035 = q_12035;
          term = string_replace_0_2.instance.invoke(context, r_12035, o_12035, trans.const968);
          if(term == null)
            break Fail5362;
          term = (IStrategoTerm)termFactory.makeListCons(f_12036, termFactory.makeListCons(trans.const932, termFactory.makeListCons(term, (IStrategoList)trans.constNil3)));
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail5362;
          term = termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil3));
          term = index_setup_0_3.instance.invoke(context, c_12036, v_12035, w_12035, term);
          if(term == null)
            break Fail5362;
          term = termFactory.makeTuple(x_12034, y_12034, z_12034, a_12035, b_12035);
          term = testgen_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail5362;
          if(true)
            break Success3018;
        }
        term = term3068;
        IStrategoTerm s_12035 = null;
        IStrategoTerm t_12035 = null;
        IStrategoTerm k_12036 = null;
        s_12035 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail5361;
        t_12035 = term;
        k_12036 = s_12035;
        term = report_with_failure_0_2.instance.invoke(context, k_12036, trans.const1035, t_12035);
        if(term == null)
          break Fail5361;
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