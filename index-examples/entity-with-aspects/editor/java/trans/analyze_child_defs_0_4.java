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

@SuppressWarnings("all") public class analyze_child_defs_0_4 extends Strategy 
{ 
  public static analyze_child_defs_0_4 instance = new analyze_child_defs_0_4();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm e_12059, IStrategoTerm f_12059, IStrategoTerm g_12059, IStrategoTerm h_12059)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("analyze_child_defs_0_4");
    Fail4909:
    { 
      IStrategoTerm term2806 = term;
      Success2779:
      { 
        Fail4910:
        { 
          if(term.getTermType() != IStrategoTerm.LIST || !((IStrategoList)term).isEmpty())
            break Fail4910;
          term = trans.constNil3;
          if(true)
            break Success2779;
        }
        term = term2806;
        IStrategoTerm i_11965 = null;
        IStrategoTerm j_11965 = null;
        IStrategoTerm l_11965 = null;
        IStrategoTerm m_11965 = null;
        IStrategoTerm n_11965 = null;
        IStrategoTerm o_11965 = null;
        IStrategoTerm p_11965 = null;
        IStrategoTerm r_11965 = null;
        if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
          break Fail4909;
        i_11965 = ((IStrategoList)term).head();
        o_11965 = ((IStrategoList)term).tail();
        r_11965 = term;
        term = analyze_defs_0_4.instance.invoke(context, i_11965, e_12059, f_12059, g_12059, h_12059);
        if(term == null)
          break Fail4909;
        j_11965 = term;
        Success2780:
        { 
          Fail4911:
          { 
            IStrategoTerm q_11965 = null;
            q_11965 = term;
            term = nam_ordered_def_0_0.instance.invoke(context, i_11965);
            if(term == null)
              break Fail4911;
            term = q_11965;
            { 
              IStrategoTerm t_11965 = null;
              IStrategoTerm u_11965 = null;
              IStrategoTerm w_11965 = null;
              IStrategoTerm x_11965 = null;
              term = nam_get_definition_key_0_0.instance.invoke(context, j_11965);
              if(term == null)
                break Fail4909;
              term = index_uri_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail4909;
              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                break Fail4909;
              l_11965 = ((IStrategoList)term).head();
              IStrategoTerm arg1505 = ((IStrategoList)term).tail();
              if(arg1505.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg1505).isEmpty())
                break Fail4909;
              m_11965 = ((IStrategoList)arg1505).tail();
              t_11965 = e_12059;
              term = (IStrategoTerm)termFactory.makeListCons(termFactory.makeTuple(l_11965, m_11965), (IStrategoList)trans.constNil3);
              term = update_index_paths_0_1.instance.invoke(context, t_11965, term);
              if(term == null)
                break Fail4909;
              n_11965 = term;
              w_11965 = o_11965;
              u_11965 = trans.constAnon0;
              x_11965 = w_11965;
              term = this.invoke(context, x_11965, n_11965, f_12059, u_11965, trans.constAnon0);
              if(term == null)
                break Fail4909;
              p_11965 = term;
              if(true)
                break Success2780;
            }
          }
          term = this.invoke(context, o_11965, e_12059, f_12059, g_12059, h_12059);
          if(term == null)
            break Fail4909;
          p_11965 = term;
        }
        term = r_11965;
        IStrategoList list134;
        list134 = checkListTail(p_11965);
        if(list134 == null)
          break Fail4909;
        term = (IStrategoTerm)termFactory.makeListCons(j_11965, list134);
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}