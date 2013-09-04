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

@SuppressWarnings("all") final class lifted947 extends Strategy 
{ 
  TermReference z_11903;

  TermReference a_11904;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail5758:
    { 
      IStrategoTerm c_11904 = null;
      IStrategoTerm i_11905 = null;
      IStrategoTerm l_11905 = null;
      IStrategoTerm h_11904 = null;
      IStrategoTerm j_11904 = null;
      IStrategoTerm k_11904 = null;
      IStrategoTerm j_11905 = null;
      IStrategoTerm p_11904 = null;
      IStrategoTerm r_11904 = null;
      IStrategoTerm s_11904 = null;
      IStrategoTerm x_11904 = null;
      IStrategoTerm z_11904 = null;
      IStrategoTerm a_11905 = null;
      c_11904 = term;
      l_11905 = term;
      if(z_11903.value == null)
        break Fail5758;
      term = z_11903.value;
      IStrategoTerm term2449 = term;
      Success3092:
      { 
        Fail5759:
        { 
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail5759;
          if(true)
            break Success3092;
        }
        term = term2449;
        IStrategoTerm term2450 = term;
        Success3093:
        { 
          Fail5760:
          { 
            term = is_string_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail5760;
            if(true)
              break Success3093;
          }
          term = term2450;
          IStrategoTerm term2451 = term;
          Success3094:
          { 
            Fail5761:
            { 
              term = int_to_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail5761;
              if(true)
                break Success3094;
            }
            term = term2451;
            IStrategoTerm term2452 = term;
            Success3095:
            { 
              Fail5762:
              { 
                term = real_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail5762;
                if(true)
                  break Success3095;
              }
              term = term2452;
              IStrategoTerm d_11904 = null;
              IStrategoTerm e_11904 = null;
              IStrategoTerm g_11904 = null;
              d_11904 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail5758;
              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                break Fail5758;
              e_11904 = ((IStrategoList)term).tail();
              g_11904 = e_11904;
              term = report_failure_0_2.instance.invoke(context, g_11904, trans.const835, d_11904);
              if(term == null)
                break Fail5758;
            }
          }
        }
      }
      j_11904 = term;
      h_11904 = trans.const785;
      k_11904 = j_11904;
      term = string_replace_0_2.instance.invoke(context, k_11904, h_11904, trans.const785);
      if(term == null)
        break Fail5758;
      i_11905 = term;
      term = l_11905;
      if(a_11904.value == null)
        break Fail5758;
      term = a_11904.value;
      IStrategoTerm term2453 = term;
      Success3096:
      { 
        Fail5763:
        { 
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail5763;
          if(true)
            break Success3096;
        }
        term = term2453;
        IStrategoTerm term2454 = term;
        Success3097:
        { 
          Fail5764:
          { 
            term = is_string_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail5764;
            if(true)
              break Success3097;
          }
          term = term2454;
          IStrategoTerm term2455 = term;
          Success3098:
          { 
            Fail5765:
            { 
              term = int_to_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail5765;
              if(true)
                break Success3098;
            }
            term = term2455;
            IStrategoTerm term2456 = term;
            Success3099:
            { 
              Fail5766:
              { 
                term = real_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail5766;
                if(true)
                  break Success3099;
              }
              term = term2456;
              IStrategoTerm l_11904 = null;
              IStrategoTerm m_11904 = null;
              IStrategoTerm o_11904 = null;
              l_11904 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail5758;
              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                break Fail5758;
              m_11904 = ((IStrategoList)term).tail();
              o_11904 = m_11904;
              term = report_failure_0_2.instance.invoke(context, o_11904, trans.const835, l_11904);
              if(term == null)
                break Fail5758;
            }
          }
        }
      }
      r_11904 = term;
      p_11904 = trans.const785;
      s_11904 = r_11904;
      term = string_replace_0_2.instance.invoke(context, s_11904, p_11904, trans.const836);
      if(term == null)
        break Fail5758;
      j_11905 = term;
      term = c_11904;
      IStrategoTerm term2457 = term;
      Success3100:
      { 
        Fail5767:
        { 
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail5767;
          if(true)
            break Success3100;
        }
        term = term2457;
        IStrategoTerm term2458 = term;
        Success3101:
        { 
          Fail5768:
          { 
            term = is_string_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail5768;
            if(true)
              break Success3101;
          }
          term = term2458;
          IStrategoTerm term2459 = term;
          Success3102:
          { 
            Fail5769:
            { 
              term = int_to_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail5769;
              if(true)
                break Success3102;
            }
            term = term2459;
            IStrategoTerm term2460 = term;
            Success3103:
            { 
              Fail5770:
              { 
                term = real_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail5770;
                if(true)
                  break Success3103;
              }
              term = term2460;
              IStrategoTerm t_11904 = null;
              IStrategoTerm u_11904 = null;
              IStrategoTerm w_11904 = null;
              t_11904 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail5758;
              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                break Fail5758;
              u_11904 = ((IStrategoList)term).tail();
              w_11904 = u_11904;
              term = report_failure_0_2.instance.invoke(context, w_11904, trans.const835, t_11904);
              if(term == null)
                break Fail5758;
            }
          }
        }
      }
      z_11904 = term;
      x_11904 = trans.const785;
      a_11905 = z_11904;
      term = string_replace_0_2.instance.invoke(context, a_11905, x_11904, trans.const837);
      if(term == null)
        break Fail5758;
      term = (IStrategoTerm)termFactory.makeListCons(i_11905, termFactory.makeListCons(trans.const839, termFactory.makeListCons(j_11905, termFactory.makeListCons(trans.const828, termFactory.makeListCons(term, (IStrategoList)trans.constCons233)))));
      term = concat_strings_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail5758;
      term = termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil3));
      if(true)
        return term;
    }
    return null;
  }
}