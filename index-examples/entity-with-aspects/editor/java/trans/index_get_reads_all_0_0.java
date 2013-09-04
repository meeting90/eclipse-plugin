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

@SuppressWarnings("all") public class index_get_reads_all_0_0 extends Strategy 
{ 
  public static index_get_reads_all_0_0 instance = new index_get_reads_all_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("index_get_reads_all_0_0");
    Fail5074:
    { 
      IStrategoTerm n_11989 = null;
      TermReference o_11989 = new TermReference();
      IStrategoTerm p_11989 = null;
      IStrategoTerm q_11989 = null;
      TermReference r_11989 = new TermReference();
      IStrategoTerm t_11989 = null;
      IStrategoTerm w_11989 = null;
      IStrategoTerm x_11989 = null;
      x_11989 = term;
      w_11989 = trans.const972;
      term = x_11989;
      lifted1066 lifted10660 = new lifted1066();
      lifted10660.o_11989 = o_11989;
      term = with_1_1.instance.invoke(context, term, lifted10660, w_11989);
      if(term == null)
        break Fail5074;
      if(o_11989.value == null)
        break Fail5074;
      term = termFactory.makeAppl(Main._consRead_1, new IStrategoTerm[]{o_11989.value});
      term = index_get_all_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail5074;
      n_11989 = term;
      Success2867:
      { 
        Fail5075:
        { 
          IStrategoTerm u_11989 = null;
          u_11989 = term;
          if(o_11989.value == null)
            break Fail5075;
          term = o_11989.value;
          if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
            break Fail5075;
          p_11989 = ((IStrategoList)term).head();
          IStrategoTerm arg1584 = ((IStrategoList)term).tail();
          if(arg1584.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg1584).isEmpty())
            break Fail5075;
          if(r_11989.value == null)
            r_11989.value = ((IStrategoList)arg1584).head();
          else
            if(r_11989.value != ((IStrategoList)arg1584).head() && !r_11989.value.match(((IStrategoList)arg1584).head()))
              break Fail5075;
          q_11989 = ((IStrategoList)arg1584).tail();
          term = u_11989;
          { 
            IStrategoList list146;
            list146 = checkListTail(q_11989);
            if(list146 == null)
              break Fail5074;
            term = termFactory.makeAppl(Main._consReadWildcard_2, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(p_11989, list146), trans.const882});
            term = index_get_all_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail5074;
            lifted1067 lifted10670 = new lifted1067();
            lifted10670.r_11989 = r_11989;
            term = filter_1_0.instance.invoke(context, term, lifted10670);
            if(term == null)
              break Fail5074;
            t_11989 = term;
            if(true)
              break Success2867;
          }
        }
        term = trans.constNil3;
        t_11989 = trans.constNil3;
      }
      term = termFactory.makeTuple(n_11989, t_11989);
      term = conc_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail5074;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}