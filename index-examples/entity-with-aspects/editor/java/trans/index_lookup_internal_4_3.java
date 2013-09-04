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

@SuppressWarnings("all") public class index_lookup_internal_4_3 extends Strategy 
{ 
  public static index_lookup_internal_4_3 instance = new index_lookup_internal_4_3();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy d_2112, Strategy e_2112, Strategy f_2112, Strategy g_2112, IStrategoTerm u_2111, IStrategoTerm v_2111, IStrategoTerm w_2111)
  { 
    context.push("index_lookup_internal_4_3");
    Fail2061:
    { 
      IStrategoTerm x_2111 = null;
      IStrategoTerm y_2111 = null;
      IStrategoTerm z_2111 = null;
      IStrategoTerm a_2112 = null;
      IStrategoTerm h_2112 = null;
      z_2111 = term;
      h_2112 = term;
      term = index_lookup_all_scoped_internal_4_3.instance.invoke(context, z_2111, d_2112, e_2112, f_2112, g_2112, u_2111, v_2111, w_2111);
      if(term == null)
        break Fail2061;
      x_2111 = term;
      IStrategoTerm term1281 = term;
      Success1254:
      { 
        Fail2062:
        { 
          IStrategoTerm b_2112 = null;
          b_2112 = term;
          term = x_2111;
          if(term.getTermType() != IStrategoTerm.APPL || Main._consStopLookup_0 != ((IStrategoAppl)term).getConstructor())
            break Fail2062;
          term = b_2112;
          { 
            if(true)
              break Fail2061;
            if(true)
              break Success1254;
          }
        }
        term = term1281;
      }
      IStrategoTerm term1282 = term;
      Success1255:
      { 
        Fail2063:
        { 
          IStrategoTerm c_2112 = null;
          c_2112 = term;
          IStrategoTerm term1283 = term;
          Success1256:
          { 
            Fail2064:
            { 
              term = $Hd_0_0.instance.invoke(context, x_2111);
              if(term == null)
                break Fail2064;
              a_2112 = term;
              { 
                if(true)
                  break Fail2063;
                if(true)
                  break Success1256;
              }
            }
            term = term1283;
          }
          term = c_2112;
          { 
            term = v_2111;
            if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
              break Fail2061;
            y_2111 = ((IStrategoList)term).tail();
            term = this.invoke(context, z_2111, d_2112, e_2112, f_2112, g_2112, u_2111, y_2111, w_2111);
            if(term == null)
              break Fail2061;
            if(a_2112 == null)
              a_2112 = term;
            else
              if(a_2112 != term && !a_2112.match(term))
                break Fail2061;
            if(true)
              break Success1255;
          }
        }
        term = term1282;
      }
      term = h_2112;
      if(a_2112 == null)
        break Fail2061;
      term = a_2112;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}