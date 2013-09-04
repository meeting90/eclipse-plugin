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

@SuppressWarnings("all") public class $Var$Decl$Init_3_0 extends Strategy 
{ 
  public static $Var$Decl$Init_3_0 instance = new $Var$Decl$Init_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy i_12040, Strategy j_12040, Strategy k_12040)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("VarDeclInit_3_0");
    Fail5439:
    { 
      IStrategoTerm a_12152 = null;
      IStrategoTerm x_12151 = null;
      IStrategoTerm y_12151 = null;
      IStrategoTerm z_12151 = null;
      IStrategoTerm b_12152 = null;
      IStrategoTerm c_12152 = null;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consVarDeclInit_3 != ((IStrategoAppl)term).getConstructor())
        break Fail5439;
      x_12151 = term.getSubterm(0);
      y_12151 = term.getSubterm(1);
      z_12151 = term.getSubterm(2);
      IStrategoList annos264 = term.getAnnotations();
      a_12152 = annos264;
      term = i_12040.invoke(context, x_12151);
      if(term == null)
        break Fail5439;
      b_12152 = term;
      term = j_12040.invoke(context, y_12151);
      if(term == null)
        break Fail5439;
      c_12152 = term;
      term = k_12040.invoke(context, z_12151);
      if(term == null)
        break Fail5439;
      term = termFactory.annotateTerm(termFactory.makeAppl(Main._consVarDeclInit_3, new IStrategoTerm[]{b_12152, c_12152, term}), checkListAnnos(termFactory, a_12152));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}