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
    Fail2172:
    { 
      IStrategoTerm s_2126 = null;
      TermReference t_2126 = new TermReference();
      IStrategoTerm u_2126 = null;
      IStrategoTerm v_2126 = null;
      TermReference w_2126 = new TermReference();
      IStrategoTerm y_2126 = null;
      IStrategoTerm b_2127 = null;
      IStrategoTerm c_2127 = null;
      c_2127 = term;
      b_2127 = trans.const452;
      term = c_2127;
      lifted466 lifted4660 = new lifted466();
      lifted4660.t_2126 = t_2126;
      term = with_1_1.instance.invoke(context, term, lifted4660, b_2127);
      if(term == null)
        break Fail2172;
      if(t_2126.value == null)
        break Fail2172;
      term = termFactory.makeAppl(Main._consRead_1, new IStrategoTerm[]{t_2126.value});
      term = index_get_all_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail2172;
      s_2126 = term;
      Success1311:
      { 
        Fail2173:
        { 
          IStrategoTerm z_2126 = null;
          z_2126 = term;
          if(t_2126.value == null)
            break Fail2173;
          term = t_2126.value;
          if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
            break Fail2173;
          u_2126 = ((IStrategoList)term).head();
          IStrategoTerm arg730 = ((IStrategoList)term).tail();
          if(arg730.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg730).isEmpty())
            break Fail2173;
          if(w_2126.value == null)
            w_2126.value = ((IStrategoList)arg730).head();
          else
            if(w_2126.value != ((IStrategoList)arg730).head() && !w_2126.value.match(((IStrategoList)arg730).head()))
              break Fail2173;
          v_2126 = ((IStrategoList)arg730).tail();
          term = z_2126;
          { 
            IStrategoList list70;
            list70 = checkListTail(v_2126);
            if(list70 == null)
              break Fail2172;
            term = termFactory.makeAppl(Main._consReadWildcard_2, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(u_2126, list70), trans.const362});
            term = index_get_all_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail2172;
            lifted467 lifted4670 = new lifted467();
            lifted4670.w_2126 = w_2126;
            term = filter_1_0.instance.invoke(context, term, lifted4670);
            if(term == null)
              break Fail2172;
            y_2126 = term;
            if(true)
              break Success1311;
          }
        }
        term = trans.constNil1;
        y_2126 = trans.constNil1;
      }
      term = termFactory.makeTuple(s_2126, y_2126);
      term = conc_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail2172;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}