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

@SuppressWarnings("all") public class index_uri_path_0_0 extends Strategy 
{ 
  public static index_uri_path_0_0 instance = new index_uri_path_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("index_uri_path_0_0");
    Fail5103:
    { 
      IStrategoTerm term2908 = term;
      Success2876:
      { 
        Fail5104:
        { 
          IStrategoTerm j_11995 = null;
          IStrategoTerm k_11995 = null;
          IStrategoTerm l_11995 = null;
          IStrategoList annos226 = term.getAnnotations();
          if(annos226.getTermType() != IStrategoTerm.LIST || ((IStrategoList)annos226).isEmpty())
            break Fail5104;
          IStrategoTerm arg1608 = ((IStrategoList)annos226).head();
          if(arg1608.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg1608).isEmpty())
            break Fail5104;
          j_11995 = ((IStrategoList)arg1608).head();
          k_11995 = ((IStrategoList)arg1608).tail();
          IStrategoTerm arg1609 = ((IStrategoList)annos226).tail();
          if(arg1609.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg1609).isEmpty())
            break Fail5104;
          Success2877:
          { 
            Fail5105:
            { 
              IStrategoTerm m_11995 = null;
              m_11995 = term;
              term = j_11995;
              if(term.getTermType() != IStrategoTerm.APPL || Main._consUnresolved_1 != ((IStrategoAppl)term).getConstructor())
                break Fail5105;
              if(term.getSubterm(0) != j_11995 && !j_11995.match(term.getSubterm(0)))
                break Fail5105;
              term = m_11995;
              { 
                term = index_lookup_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail5104;
                if(term.getTermType() != IStrategoTerm.APPL || Main._consDef_1 != ((IStrategoAppl)term).getConstructor())
                  break Fail5104;
                l_11995 = term.getSubterm(0);
                if(true)
                  break Success2877;
              }
            }
            term = k_11995;
            l_11995 = k_11995;
          }
          term = l_11995;
          if(true)
            break Success2876;
        }
        term = term2908;
        IStrategoTerm h_11995 = null;
        if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
          break Fail5103;
        h_11995 = ((IStrategoList)term).tail();
        term = h_11995;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}