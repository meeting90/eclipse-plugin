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
    Fail2343:
    { 
      IStrategoTerm u_2151 = null;
      TermReference v_2151 = new TermReference();
      IStrategoTerm w_2151 = null;
      IStrategoTerm w_2297 = null;
      u_2151 = term;
      term = u_2151;
      w_2297 = u_2151;
      term = context.invokePrimitive("SSL_EXT_origin_file", w_2297, NO_STRATEGIES, new IStrategoTerm[]{term});
      if(term == null)
        break Fail2343;
      w_2151 = term;
      term = project_path_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail2343;
      term = string_length_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail2343;
      term = inc_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail2343;
      if(v_2151.value == null)
        v_2151.value = term;
      else
        if(v_2151.value != term && !v_2151.value.match(term))
          break Fail2343;
      term = w_2151;
      lifted530 lifted5300 = new lifted530();
      lifted5300.v_2151 = v_2151;
      term = string_as_chars_1_0.instance.invoke(context, term, lifted5300);
      if(term == null)
        break Fail2343;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}