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

@SuppressWarnings("all") public class open_import_3_0 extends Strategy 
{ 
  public static open_import_3_0 instance = new open_import_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy i_2145, Strategy j_2145, Strategy k_2145)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("open_import_3_0");
    Fail2295:
    { 
      IStrategoTerm x_2144 = null;
      IStrategoTerm y_2144 = null;
      TermReference z_2144 = new TermReference();
      TermReference a_2145 = new TermReference();
      x_2144 = term;
      IStrategoTerm term1386 = term;
      Success1352:
      { 
        Fail2296:
        { 
          IStrategoTerm b_2145 = null;
          b_2145 = term;
          IStrategoTerm term1387 = term;
          Success1353:
          { 
            Fail2297:
            { 
              term = x_2144;
              if(term.getTermType() != IStrategoTerm.APPL || Main._consCOMPLETION_1 != ((IStrategoAppl)term).getConstructor())
                break Fail2297;
              { 
                if(true)
                  break Fail2296;
                if(true)
                  break Success1353;
              }
            }
            term = term1387;
          }
          term = b_2145;
          { 
            term = i_2145.invoke(context, x_2144);
            if(term == null)
              break Fail2295;
            if(z_2144.value == null)
              z_2144.value = term;
            else
              if(z_2144.value != term && !z_2144.value.match(term))
                break Fail2295;
            if(z_2144.value == null)
              break Fail2295;
            term = import_cache_path_0_0.instance.invoke(context, z_2144.value);
            if(term == null)
              break Fail2295;
            y_2144 = term;
            IStrategoTerm term1388 = term;
            Success1354:
            { 
              Fail2298:
              { 
                IStrategoTerm c_2145 = null;
                c_2145 = term;
                IStrategoTerm term1389 = term;
                Success1355:
                { 
                  Fail2299:
                  { 
                    if(z_2144.value == null)
                      break Fail2299;
                    term = $Is$Imported_0_0.instance.invoke(context, z_2144.value);
                    if(term == null)
                      break Fail2299;
                    { 
                      if(true)
                        break Fail2298;
                      if(true)
                        break Success1355;
                    }
                  }
                  term = term1389;
                }
                term = c_2145;
                { 
                  IStrategoTerm d_2145 = null;
                  IStrategoTerm m_2145 = null;
                  IStrategoTerm o_2145 = null;
                  IStrategoTerm p_2145 = null;
                  IStrategoTerm q_2145 = null;
                  IStrategoTerm r_2145 = null;
                  d_2145 = term;
                  o_2145 = term;
                  m_2145 = trans.const481;
                  term = o_2145;
                  p_2145 = o_2145;
                  if(z_2144.value == null)
                    break Fail2295;
                  term = termFactory.makeTuple(trans.const482, z_2144.value);
                  term = dr_set_rule_0_3.instance.invoke(context, p_2145, m_2145, z_2144.value, term);
                  if(term == null)
                    break Fail2295;
                  term = d_2145;
                  IStrategoTerm term1390 = term;
                  Success1356:
                  { 
                    Fail2300:
                    { 
                      if(z_2144.value == null)
                        break Fail2300;
                      term = termFactory.makeTuple(y_2144, z_2144.value);
                      term = is_newer_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail2300;
                      term = $Read$From$File_0_0.instance.invoke(context, y_2144);
                      if(term == null)
                        break Fail2300;
                      if(a_2145.value == null)
                        a_2145.value = term;
                      else
                        if(a_2145.value != term && !a_2145.value.match(term))
                          break Fail2300;
                      if(true)
                        break Success1356;
                    }
                    term = term1390;
                    if(z_2144.value == null)
                      break Fail2295;
                    term = j_2145.invoke(context, z_2144.value);
                    if(term == null)
                      break Fail2295;
                    if(a_2145.value == null)
                      a_2145.value = term;
                    else
                      if(a_2145.value != term && !a_2145.value.match(term))
                        break Fail2295;
                    IStrategoTerm term1391 = term;
                    Success1357:
                    { 
                      Fail2301:
                      { 
                        IStrategoTerm e_2145 = null;
                        e_2145 = term;
                        if(z_2144.value == null)
                          break Fail2301;
                        term = file_exists_0_0.instance.invoke(context, z_2144.value);
                        if(term == null)
                          break Fail2301;
                        term = e_2145;
                        { 
                          if(a_2145.value == null)
                            break Fail2295;
                          term = termFactory.makeTuple(y_2144, a_2145.value);
                          term = $Write$To$Binary$File_0_0.instance.invoke(context, term);
                          if(term == null)
                            break Fail2295;
                          if(true)
                            break Success1357;
                        }
                      }
                      term = term1391;
                    }
                  }
                  r_2145 = term;
                  q_2145 = trans.const479;
                  term = r_2145;
                  lifted522 lifted5220 = new lifted522();
                  lifted5220.k_2145 = k_2145;
                  lifted5220.z_2144 = z_2144;
                  lifted5220.a_2145 = a_2145;
                  term = dr_scope_1_1.instance.invoke(context, term, lifted5220, q_2145);
                  if(term == null)
                    break Fail2295;
                  if(true)
                    break Success1354;
                }
              }
              term = term1388;
            }
            if(true)
              break Success1352;
          }
        }
        term = term1386;
      }
      term = x_2144;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}