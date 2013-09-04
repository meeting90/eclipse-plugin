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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy v_2146, Strategy w_2146, Strategy x_2146, Strategy y_2146)
  { 
    context.push("open_wildcard_import_4_0");
    Fail2302:
    { 
      IStrategoTerm y_2145 = null;
      TermReference z_2145 = new TermReference();
      TermReference a_2146 = new TermReference();
      y_2145 = term;
      IStrategoTerm term1392 = term;
      Success1358:
      { 
        Fail2303:
        { 
          IStrategoTerm b_2146 = null;
          b_2146 = term;
          IStrategoTerm term1393 = term;
          Success1359:
          { 
            Fail2304:
            { 
              term = y_2145;
              if(term.getTermType() != IStrategoTerm.APPL || Main._consCOMPLETION_1 != ((IStrategoAppl)term).getConstructor())
                break Fail2304;
              { 
                if(true)
                  break Fail2303;
                if(true)
                  break Success1359;
              }
            }
            term = term1393;
          }
          term = b_2146;
          { 
            term = v_2146.invoke(context, y_2145);
            if(term == null)
              break Fail2302;
            if(z_2145.value == null)
              z_2145.value = term;
            else
              if(z_2145.value != term && !z_2145.value.match(term))
                break Fail2302;
            term = readdir_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail2302;
            lifted523 lifted5230 = new lifted523();
            lifted5230.y_2146 = y_2146;
            lifted5230.w_2146 = w_2146;
            lifted5230.x_2146 = x_2146;
            lifted5230.z_2145 = z_2145;
            lifted5230.a_2146 = a_2146;
            term = list_loop_1_0.instance.invoke(context, term, lifted5230);
            if(term == null)
              break Fail2302;
            IStrategoTerm term1404 = term;
            Success1360:
            { 
              Fail2305:
              { 
                if(a_2146.value == null)
                  break Fail2305;
                term = a_2146.value;
                { 
                  if(true)
                    break Fail2302;
                  if(true)
                    break Success1360;
                }
              }
              term = term1404;
            }
            if(true)
              break Success1358;
          }
        }
        term = term1392;
      }
      term = y_2145;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}