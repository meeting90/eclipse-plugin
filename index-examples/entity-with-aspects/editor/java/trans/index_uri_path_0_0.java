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
    Fail2201:
    { 
      IStrategoTerm term1352 = term;
      Success1320:
      { 
        Fail2202:
        { 
          IStrategoTerm o_2132 = null;
          IStrategoTerm p_2132 = null;
          IStrategoTerm q_2132 = null;
          IStrategoList annos88 = term.getAnnotations();
          if(annos88.getTermType() != IStrategoTerm.LIST || ((IStrategoList)annos88).isEmpty())
            break Fail2202;
          IStrategoTerm arg754 = ((IStrategoList)annos88).head();
          if(arg754.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg754).isEmpty())
            break Fail2202;
          o_2132 = ((IStrategoList)arg754).head();
          p_2132 = ((IStrategoList)arg754).tail();
          IStrategoTerm arg755 = ((IStrategoList)annos88).tail();
          if(arg755.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg755).isEmpty())
            break Fail2202;
          Success1321:
          { 
            Fail2203:
            { 
              IStrategoTerm r_2132 = null;
              r_2132 = term;
              term = o_2132;
              if(term.getTermType() != IStrategoTerm.APPL || Main._consUnresolved_1 != ((IStrategoAppl)term).getConstructor())
                break Fail2203;
              if(term.getSubterm(0) != o_2132 && !o_2132.match(term.getSubterm(0)))
                break Fail2203;
              term = r_2132;
              { 
                term = index_lookup_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail2202;
                if(term.getTermType() != IStrategoTerm.APPL || Main._consDef_1 != ((IStrategoAppl)term).getConstructor())
                  break Fail2202;
                q_2132 = term.getSubterm(0);
                if(true)
                  break Success1321;
              }
            }
            term = p_2132;
            q_2132 = p_2132;
          }
          term = q_2132;
          if(true)
            break Success1320;
        }
        term = term1352;
        IStrategoTerm m_2132 = null;
        if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
          break Fail2201;
        m_2132 = ((IStrategoList)term).tail();
        term = m_2132;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}