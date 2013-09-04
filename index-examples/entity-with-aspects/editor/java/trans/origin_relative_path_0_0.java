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

@SuppressWarnings("all") public class origin_relative_path_0_0 extends Strategy 
{ 
  public static origin_relative_path_0_0 instance = new origin_relative_path_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("origin_relative_path_0_0");
    Fail5245:
    { 
      IStrategoTerm p_12014 = null;
      TermReference q_12014 = new TermReference();
      IStrategoTerm r_12014 = null;
      IStrategoTerm r_12160 = null;
      p_12014 = term;
      term = p_12014;
      r_12160 = p_12014;
      term = context.invokePrimitive("SSL_EXT_origin_file", r_12160, NO_STRATEGIES, new IStrategoTerm[]{term});
      if(term == null)
        break Fail5245;
      r_12014 = term;
      term = project_path_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail5245;
      term = string_length_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail5245;
      term = inc_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail5245;
      if(q_12014.value == null)
        q_12014.value = term;
      else
        if(q_12014.value != term && !q_12014.value.match(term))
          break Fail5245;
      term = r_12014;
      lifted1130 lifted11300 = new lifted1130();
      lifted11300.q_12014 = q_12014;
      term = string_as_chars_1_0.instance.invoke(context, term, lifted11300);
      if(term == null)
        break Fail5245;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}