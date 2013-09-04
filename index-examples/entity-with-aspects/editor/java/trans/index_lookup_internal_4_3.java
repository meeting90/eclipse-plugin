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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy y_11974, Strategy z_11974, Strategy a_11975, Strategy b_11975, IStrategoTerm p_11974, IStrategoTerm q_11974, IStrategoTerm r_11974)
  { 
    context.push("index_lookup_internal_4_3");
    Fail4963:
    { 
      IStrategoTerm s_11974 = null;
      IStrategoTerm t_11974 = null;
      IStrategoTerm u_11974 = null;
      IStrategoTerm v_11974 = null;
      IStrategoTerm c_11975 = null;
      u_11974 = term;
      c_11975 = term;
      term = index_lookup_all_scoped_internal_4_3.instance.invoke(context, u_11974, y_11974, z_11974, a_11975, b_11975, p_11974, q_11974, r_11974);
      if(term == null)
        break Fail4963;
      s_11974 = term;
      IStrategoTerm term2837 = term;
      Success2810:
      { 
        Fail4964:
        { 
          IStrategoTerm w_11974 = null;
          w_11974 = term;
          term = s_11974;
          if(term.getTermType() != IStrategoTerm.APPL || Main._consStopLookup_0 != ((IStrategoAppl)term).getConstructor())
            break Fail4964;
          term = w_11974;
          { 
            if(true)
              break Fail4963;
            if(true)
              break Success2810;
          }
        }
        term = term2837;
      }
      IStrategoTerm term2838 = term;
      Success2811:
      { 
        Fail4965:
        { 
          IStrategoTerm x_11974 = null;
          x_11974 = term;
          IStrategoTerm term2839 = term;
          Success2812:
          { 
            Fail4966:
            { 
              term = $Hd_0_0.instance.invoke(context, s_11974);
              if(term == null)
                break Fail4966;
              v_11974 = term;
              { 
                if(true)
                  break Fail4965;
                if(true)
                  break Success2812;
              }
            }
            term = term2839;
          }
          term = x_11974;
          { 
            term = q_11974;
            if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
              break Fail4963;
            t_11974 = ((IStrategoList)term).tail();
            term = this.invoke(context, u_11974, y_11974, z_11974, a_11975, b_11975, p_11974, t_11974, r_11974);
            if(term == null)
              break Fail4963;
            if(v_11974 == null)
              v_11974 = term;
            else
              if(v_11974 != term && !v_11974.match(term))
                break Fail4963;
            if(true)
              break Success2811;
          }
        }
        term = term2838;
      }
      term = c_11975;
      if(v_11974 == null)
        break Fail4963;
      term = v_11974;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}