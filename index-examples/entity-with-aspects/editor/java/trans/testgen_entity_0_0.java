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
    Fail4510:
    { 
      IStrategoTerm m_11907 = null;
      TermReference n_11907 = new TermReference();
      IStrategoTerm o_11907 = null;
      IStrategoTerm p_11907 = null;
      IStrategoTerm s_11907 = null;
      s_11907 = term;
      IStrategoTerm term2463 = term;
      Success2443:
      { 
        Fail4511:
        { 
          IStrategoTerm x_11907 = null;
          IStrategoTerm z_11907 = null;
          IStrategoTerm a_11908 = null;
          IStrategoTerm c_11908 = null;
          IStrategoTerm d_11908 = null;
          IStrategoTerm h_11908 = null;
          IStrategoTerm i_11908 = null;
          IStrategoTerm j_11908 = null;
          IStrategoTerm k_11908 = null;
          IStrategoTerm m_11908 = null;
          IStrategoTerm n_11908 = null;
          term = random_identifier_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail4511;
          m_11907 = term;
          z_11907 = term;
          a_11908 = trans.const824;
          x_11907 = a_11908;
          c_11908 = z_11907;
          d_11908 = trans.const825;
          term = random_apply_1_2.instance.invoke(context, c_11908, testgen_property_0_0.instance, x_11907, d_11908);
          if(term == null)
            break Fail4511;
          if(n_11907.value == null)
            n_11907.value = term;
          else
            if(n_11907.value != term && !n_11907.value.match(term))
              break Fail4511;
          j_11908 = term;
          k_11908 = trans.const821;
          h_11908 = k_11908;
          m_11908 = j_11908;
          n_11908 = trans.const823;
          i_11908 = n_11908;
          term = m_11908;
          lifted952 lifted9520 = new lifted952();
          lifted9520.n_11907 = n_11907;
          term = random_apply_1_2.instance.invoke(context, term, lifted9520, h_11908, i_11908);
          if(term == null)
            break Fail4511;
          o_11907 = term;
          if(n_11907.value == null)
            break Fail4511;
          term = termFactory.makeTuple(n_11907.value, o_11907);
          term = conc_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail4511;
          term = termFactory.makeAppl(Main._consEntity_2, new IStrategoTerm[]{m_11907, term});
          p_11907 = term;
          if(true)
            break Success2443;
        }
        term = term2463;
        IStrategoTerm q_11907 = null;
        IStrategoTerm r_11907 = null;
        IStrategoTerm s_11908 = null;
        q_11907 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail4510;
        r_11907 = term;
        s_11908 = q_11907;
        term = report_with_failure_0_2.instance.invoke(context, s_11908, trans.const843, r_11907);
        if(term == null)
          break Fail4510;
      }
      term = s_11907;
      if(p_11907 == null)
        break Fail4510;
      term = p_11907;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}