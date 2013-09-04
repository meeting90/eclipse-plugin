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

@SuppressWarnings("all") public class construct_index_path_0_5 extends Strategy 
{ 
  public static construct_index_path_0_5 instance = new construct_index_path_0_5();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm h_2103, IStrategoTerm i_2103, IStrategoTerm j_2103, IStrategoTerm k_2103, IStrategoTerm l_2103)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("construct_index_path_0_5");
    Fail2010:
    { 
      IStrategoTerm m_2103 = null;
      IStrategoTerm n_2103 = null;
      IStrategoTerm o_2103 = null;
      IStrategoTerm p_2103 = null;
      n_2103 = term;
      Success1225:
      { 
        Fail2011:
        { 
          IStrategoTerm q_2103 = null;
          q_2103 = term;
          term = j_2103;
          if(term.getTermType() != IStrategoTerm.APPL || Main._consAnon_0 != ((IStrategoAppl)term).getConstructor())
            break Fail2011;
          term = q_2103;
          { 
            IStrategoTerm u_2103 = null;
            term = termFactory.makeTuple(n_2103, h_2103);
            term = lookup_index_path_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail2010;
            m_2103 = term;
            term = l_2103;
            u_2103 = l_2103;
            term = new_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail2010;
            term = termFactory.makeAppl(Main._consAnon_1, new IStrategoTerm[]{term});
            term = index_do_adjust_path_0_3.instance.invoke(context, u_2103, n_2103, m_2103, term);
            if(term == null)
              break Fail2010;
            o_2103 = term;
            if(true)
              break Success1225;
          }
        }
        term = termFactory.makeTuple(j_2103, h_2103);
        term = lookup_index_path_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail2010;
        term = index_do_adjust_path_0_3.instance.invoke(context, l_2103, n_2103, term, i_2103);
        if(term == null)
          break Fail2010;
        o_2103 = term;
      }
      Success1226:
      { 
        Fail2012:
        { 
          if(true)
            break Fail2012;
          { 
            term = index_do_adjust_path_0_3.instance.invoke(context, l_2103, n_2103, o_2103, k_2103);
            if(term == null)
              break Fail2010;
            p_2103 = term;
            if(true)
              break Success1226;
          }
        }
        term = o_2103;
        p_2103 = o_2103;
      }
      term = termFactory.makeTuple(n_2103, p_2103);
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}