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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm j_2196, IStrategoTerm k_2196, IStrategoTerm l_2196, IStrategoTerm m_2196)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("analyze_child_defs_0_4");
    Fail2007:
    { 
      IStrategoTerm term1250 = term;
      Success1223:
      { 
        Fail2008:
        { 
          if(term.getTermType() != IStrategoTerm.LIST || !((IStrategoList)term).isEmpty())
            break Fail2008;
          term = trans.constNil1;
          if(true)
            break Success1223;
        }
        term = term1250;
        IStrategoTerm n_2102 = null;
        IStrategoTerm o_2102 = null;
        IStrategoTerm q_2102 = null;
        IStrategoTerm r_2102 = null;
        IStrategoTerm s_2102 = null;
        IStrategoTerm t_2102 = null;
        IStrategoTerm u_2102 = null;
        IStrategoTerm w_2102 = null;
        if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
          break Fail2007;
        n_2102 = ((IStrategoList)term).head();
        t_2102 = ((IStrategoList)term).tail();
        w_2102 = term;
        term = analyze_defs_0_4.instance.invoke(context, n_2102, j_2196, k_2196, l_2196, m_2196);
        if(term == null)
          break Fail2007;
        o_2102 = term;
        Success1224:
        { 
          Fail2009:
          { 
            IStrategoTerm v_2102 = null;
            v_2102 = term;
            term = nam_ordered_def_0_0.instance.invoke(context, n_2102);
            if(term == null)
              break Fail2009;
            term = v_2102;
            { 
              IStrategoTerm y_2102 = null;
              IStrategoTerm z_2102 = null;
              IStrategoTerm b_2103 = null;
              IStrategoTerm c_2103 = null;
              term = nam_get_definition_key_0_0.instance.invoke(context, o_2102);
              if(term == null)
                break Fail2007;
              term = index_uri_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail2007;
              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                break Fail2007;
              q_2102 = ((IStrategoList)term).head();
              IStrategoTerm arg651 = ((IStrategoList)term).tail();
              if(arg651.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg651).isEmpty())
                break Fail2007;
              r_2102 = ((IStrategoList)arg651).tail();
              y_2102 = j_2196;
              term = (IStrategoTerm)termFactory.makeListCons(termFactory.makeTuple(q_2102, r_2102), (IStrategoList)trans.constNil1);
              term = update_index_paths_0_1.instance.invoke(context, y_2102, term);
              if(term == null)
                break Fail2007;
              s_2102 = term;
              b_2103 = t_2102;
              z_2102 = trans.constAnon0;
              c_2103 = b_2103;
              term = this.invoke(context, c_2103, s_2102, k_2196, z_2102, trans.constAnon0);
              if(term == null)
                break Fail2007;
              u_2102 = term;
              if(true)
                break Success1224;
            }
          }
          term = this.invoke(context, t_2102, j_2196, k_2196, l_2196, m_2196);
          if(term == null)
            break Fail2007;
          u_2102 = term;
        }
        term = w_2102;
        IStrategoList list58;
        list58 = checkListTail(u_2102);
        if(list58 == null)
          break Fail2007;
        term = (IStrategoTerm)termFactory.makeListCons(o_2102, list58);
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}