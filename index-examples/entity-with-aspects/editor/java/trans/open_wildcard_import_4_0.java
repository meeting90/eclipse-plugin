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

@SuppressWarnings("all") public class open_wildcard_import_4_0 extends Strategy 
{ 
  public static open_wildcard_import_4_0 instance = new open_wildcard_import_4_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy q_12009, Strategy r_12009, Strategy s_12009, Strategy t_12009)
  { 
    context.push("open_wildcard_import_4_0");
    Fail5204:
    { 
      IStrategoTerm t_12008 = null;
      TermReference u_12008 = new TermReference();
      TermReference v_12008 = new TermReference();
      t_12008 = term;
      IStrategoTerm term2948 = term;
      Success2914:
      { 
        Fail5205:
        { 
          IStrategoTerm w_12008 = null;
          w_12008 = term;
          IStrategoTerm term2949 = term;
          Success2915:
          { 
            Fail5206:
            { 
              term = t_12008;
              if(term.getTermType() != IStrategoTerm.APPL || Main._consCOMPLETION_1 != ((IStrategoAppl)term).getConstructor())
                break Fail5206;
              { 
                if(true)
                  break Fail5205;
                if(true)
                  break Success2915;
              }
            }
            term = term2949;
          }
          term = w_12008;
          { 
            term = q_12009.invoke(context, t_12008);
            if(term == null)
              break Fail5204;
            if(u_12008.value == null)
              u_12008.value = term;
            else
              if(u_12008.value != term && !u_12008.value.match(term))
                break Fail5204;
            term = readdir_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail5204;
            lifted1123 lifted11230 = new lifted1123();
            lifted11230.t_12009 = t_12009;
            lifted11230.r_12009 = r_12009;
            lifted11230.s_12009 = s_12009;
            lifted11230.u_12008 = u_12008;
            lifted11230.v_12008 = v_12008;
            term = list_loop_1_0.instance.invoke(context, term, lifted11230);
            if(term == null)
              break Fail5204;
            IStrategoTerm term2960 = term;
            Success2916:
            { 
              Fail5207:
              { 
                if(v_12008.value == null)
                  break Fail5207;
                term = v_12008.value;
                { 
                  if(true)
                    break Fail5204;
                  if(true)
                    break Success2916;
                }
              }
              term = term2960;
            }
            if(true)
              break Success2914;
          }
        }
        term = term2948;
      }
      term = t_12008;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}