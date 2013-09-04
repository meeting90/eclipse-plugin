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

@SuppressWarnings("all") public class store_wildcard_read_0_3 extends Strategy 
{ 
  public static store_wildcard_read_0_3 instance = new store_wildcard_read_0_3();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm n_2119, IStrategoTerm o_2119, IStrategoTerm p_2119)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("store_wildcard_read_0_3");
    Fail2116:
    { 
      IStrategoTerm q_2119 = null;
      IStrategoTerm r_2119 = null;
      IStrategoTerm w_2119 = null;
      q_2119 = term;
      w_2119 = term;
      IStrategoTerm term1314 = term;
      Success1284:
      { 
        Fail2117:
        { 
          IStrategoTerm term1315 = term;
          Success1285:
          { 
            Fail2118:
            { 
              IStrategoTerm s_2119 = null;
              s_2119 = term;
              term = $Index_$Read$Set_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail2118;
              r_2119 = term;
              term = s_2119;
              { 
                Success1286:
                { 
                  Fail2119:
                  { 
                    IStrategoTerm t_2119 = null;
                    t_2119 = term;
                    term = length_0_0.instance.invoke(context, q_2119);
                    if(term == null)
                      break Fail2119;
                    if(term.getTermType() != IStrategoTerm.INT || 1 != ((IStrategoInt)term).intValue())
                      break Fail2119;
                    term = t_2119;
                    { 
                      IStrategoTerm a_2120 = null;
                      term = r_2119;
                      a_2120 = r_2119;
                      IStrategoList list65;
                      list65 = checkListTail(o_2119);
                      if(list65 == null)
                        break Fail2117;
                      term = termFactory.makeAppl(Main._consRead_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(n_2119, termFactory.makeListCons(p_2119, list65))});
                      term = iset_add_0_1.instance.invoke(context, a_2120, term);
                      if(term == null)
                        break Fail2117;
                      if(true)
                        break Success1286;
                    }
                  }
                  IStrategoTerm c_2120 = null;
                  term = r_2119;
                  c_2120 = r_2119;
                  IStrategoList list66;
                  list66 = checkListTail(o_2119);
                  if(list66 == null)
                    break Fail2117;
                  term = termFactory.makeAppl(Main._consReadWildcard_2, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(n_2119, list66), p_2119});
                  term = iset_add_0_1.instance.invoke(context, c_2120, term);
                  if(term == null)
                    break Fail2117;
                }
                if(true)
                  break Success1285;
              }
            }
            term = term1315;
          }
          if(true)
            break Success1284;
        }
        term = term1314;
        IStrategoTerm u_2119 = null;
        IStrategoTerm v_2119 = null;
        IStrategoTerm e_2120 = null;
        u_2119 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail2116;
        v_2119 = term;
        e_2120 = u_2119;
        term = report_with_failure_0_2.instance.invoke(context, e_2120, trans.const444, v_2119);
        if(term == null)
          break Fail2116;
      }
      term = w_2119;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}