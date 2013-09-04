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

@SuppressWarnings("all") public class testgen_entity_0_0 extends Strategy 
{ 
  public static testgen_entity_0_0 instance = new testgen_entity_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("testgen_entity_0_0");
    Fail1608:
    { 
      IStrategoTerm r_2044 = null;
      TermReference s_2044 = new TermReference();
      IStrategoTerm t_2044 = null;
      IStrategoTerm u_2044 = null;
      IStrategoTerm x_2044 = null;
      x_2044 = term;
      IStrategoTerm term907 = term;
      Success887:
      { 
        Fail1609:
        { 
          IStrategoTerm c_2045 = null;
          IStrategoTerm e_2045 = null;
          IStrategoTerm f_2045 = null;
          IStrategoTerm h_2045 = null;
          IStrategoTerm i_2045 = null;
          IStrategoTerm m_2045 = null;
          IStrategoTerm n_2045 = null;
          IStrategoTerm o_2045 = null;
          IStrategoTerm p_2045 = null;
          IStrategoTerm r_2045 = null;
          IStrategoTerm s_2045 = null;
          term = random_identifier_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1609;
          r_2044 = term;
          e_2045 = term;
          f_2045 = trans.const304;
          c_2045 = f_2045;
          h_2045 = e_2045;
          i_2045 = trans.const305;
          term = random_apply_1_2.instance.invoke(context, h_2045, testgen_property_0_0.instance, c_2045, i_2045);
          if(term == null)
            break Fail1609;
          if(s_2044.value == null)
            s_2044.value = term;
          else
            if(s_2044.value != term && !s_2044.value.match(term))
              break Fail1609;
          o_2045 = term;
          p_2045 = trans.const301;
          m_2045 = p_2045;
          r_2045 = o_2045;
          s_2045 = trans.const303;
          n_2045 = s_2045;
          term = r_2045;
          lifted352 lifted3520 = new lifted352();
          lifted3520.s_2044 = s_2044;
          term = random_apply_1_2.instance.invoke(context, term, lifted3520, m_2045, n_2045);
          if(term == null)
            break Fail1609;
          t_2044 = term;
          if(s_2044.value == null)
            break Fail1609;
          term = termFactory.makeTuple(s_2044.value, t_2044);
          term = conc_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1609;
          term = termFactory.makeAppl(Main._consEntity_2, new IStrategoTerm[]{r_2044, term});
          u_2044 = term;
          if(true)
            break Success887;
        }
        term = term907;
        IStrategoTerm v_2044 = null;
        IStrategoTerm w_2044 = null;
        IStrategoTerm x_2045 = null;
        v_2044 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail1608;
        w_2044 = term;
        x_2045 = v_2044;
        term = report_with_failure_0_2.instance.invoke(context, x_2045, trans.const323, w_2044);
        if(term == null)
          break Fail1608;
      }
      term = x_2044;
      if(u_2044 == null)
        break Fail1608;
      term = u_2044;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}