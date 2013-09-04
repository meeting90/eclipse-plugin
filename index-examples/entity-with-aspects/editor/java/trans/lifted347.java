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

@SuppressWarnings("all") final class lifted347 extends Strategy 
{ 
  TermReference e_2041;

  TermReference f_2041;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail2856:
    { 
      IStrategoTerm h_2041 = null;
      IStrategoTerm n_2042 = null;
      IStrategoTerm q_2042 = null;
      IStrategoTerm m_2041 = null;
      IStrategoTerm o_2041 = null;
      IStrategoTerm p_2041 = null;
      IStrategoTerm o_2042 = null;
      IStrategoTerm u_2041 = null;
      IStrategoTerm w_2041 = null;
      IStrategoTerm x_2041 = null;
      IStrategoTerm c_2042 = null;
      IStrategoTerm e_2042 = null;
      IStrategoTerm f_2042 = null;
      h_2041 = term;
      q_2042 = term;
      if(e_2041.value == null)
        break Fail2856;
      term = e_2041.value;
      IStrategoTerm term893 = term;
      Success1536:
      { 
        Fail2857:
        { 
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2857;
          if(true)
            break Success1536;
        }
        term = term893;
        IStrategoTerm term894 = term;
        Success1537:
        { 
          Fail2858:
          { 
            term = is_string_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail2858;
            if(true)
              break Success1537;
          }
          term = term894;
          IStrategoTerm term895 = term;
          Success1538:
          { 
            Fail2859:
            { 
              term = int_to_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail2859;
              if(true)
                break Success1538;
            }
            term = term895;
            IStrategoTerm term896 = term;
            Success1539:
            { 
              Fail2860:
              { 
                term = real_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail2860;
                if(true)
                  break Success1539;
              }
              term = term896;
              IStrategoTerm i_2041 = null;
              IStrategoTerm j_2041 = null;
              IStrategoTerm l_2041 = null;
              i_2041 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail2856;
              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                break Fail2856;
              j_2041 = ((IStrategoList)term).tail();
              l_2041 = j_2041;
              term = report_failure_0_2.instance.invoke(context, l_2041, trans.const315, i_2041);
              if(term == null)
                break Fail2856;
            }
          }
        }
      }
      o_2041 = term;
      m_2041 = trans.const265;
      p_2041 = o_2041;
      term = string_replace_0_2.instance.invoke(context, p_2041, m_2041, trans.const265);
      if(term == null)
        break Fail2856;
      n_2042 = term;
      term = q_2042;
      if(f_2041.value == null)
        break Fail2856;
      term = f_2041.value;
      IStrategoTerm term897 = term;
      Success1540:
      { 
        Fail2861:
        { 
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2861;
          if(true)
            break Success1540;
        }
        term = term897;
        IStrategoTerm term898 = term;
        Success1541:
        { 
          Fail2862:
          { 
            term = is_string_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail2862;
            if(true)
              break Success1541;
          }
          term = term898;
          IStrategoTerm term899 = term;
          Success1542:
          { 
            Fail2863:
            { 
              term = int_to_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail2863;
              if(true)
                break Success1542;
            }
            term = term899;
            IStrategoTerm term900 = term;
            Success1543:
            { 
              Fail2864:
              { 
                term = real_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail2864;
                if(true)
                  break Success1543;
              }
              term = term900;
              IStrategoTerm q_2041 = null;
              IStrategoTerm r_2041 = null;
              IStrategoTerm t_2041 = null;
              q_2041 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail2856;
              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                break Fail2856;
              r_2041 = ((IStrategoList)term).tail();
              t_2041 = r_2041;
              term = report_failure_0_2.instance.invoke(context, t_2041, trans.const315, q_2041);
              if(term == null)
                break Fail2856;
            }
          }
        }
      }
      w_2041 = term;
      u_2041 = trans.const265;
      x_2041 = w_2041;
      term = string_replace_0_2.instance.invoke(context, x_2041, u_2041, trans.const316);
      if(term == null)
        break Fail2856;
      o_2042 = term;
      term = h_2041;
      IStrategoTerm term901 = term;
      Success1544:
      { 
        Fail2865:
        { 
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2865;
          if(true)
            break Success1544;
        }
        term = term901;
        IStrategoTerm term902 = term;
        Success1545:
        { 
          Fail2866:
          { 
            term = is_string_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail2866;
            if(true)
              break Success1545;
          }
          term = term902;
          IStrategoTerm term903 = term;
          Success1546:
          { 
            Fail2867:
            { 
              term = int_to_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail2867;
              if(true)
                break Success1546;
            }
            term = term903;
            IStrategoTerm term904 = term;
            Success1547:
            { 
              Fail2868:
              { 
                term = real_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail2868;
                if(true)
                  break Success1547;
              }
              term = term904;
              IStrategoTerm y_2041 = null;
              IStrategoTerm z_2041 = null;
              IStrategoTerm b_2042 = null;
              y_2041 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail2856;
              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                break Fail2856;
              z_2041 = ((IStrategoList)term).tail();
              b_2042 = z_2041;
              term = report_failure_0_2.instance.invoke(context, b_2042, trans.const315, y_2041);
              if(term == null)
                break Fail2856;
            }
          }
        }
      }
      e_2042 = term;
      c_2042 = trans.const265;
      f_2042 = e_2042;
      term = string_replace_0_2.instance.invoke(context, f_2042, c_2042, trans.const317);
      if(term == null)
        break Fail2856;
      term = (IStrategoTerm)termFactory.makeListCons(n_2042, termFactory.makeListCons(trans.const319, termFactory.makeListCons(o_2042, termFactory.makeListCons(trans.const308, termFactory.makeListCons(term, (IStrategoList)trans.constCons101)))));
      term = concat_strings_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail2856;
      term = termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil1));
      if(true)
        return term;
    }
    return null;
  }
}