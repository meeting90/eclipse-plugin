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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy d_12008, Strategy e_12008, Strategy f_12008)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("open_import_3_0");
    Fail5197:
    { 
      IStrategoTerm s_12007 = null;
      IStrategoTerm t_12007 = null;
      TermReference u_12007 = new TermReference();
      TermReference v_12007 = new TermReference();
      s_12007 = term;
      IStrategoTerm term2942 = term;
      Success2908:
      { 
        Fail5198:
        { 
          IStrategoTerm w_12007 = null;
          w_12007 = term;
          IStrategoTerm term2943 = term;
          Success2909:
          { 
            Fail5199:
            { 
              term = s_12007;
              if(term.getTermType() != IStrategoTerm.APPL || Main._consCOMPLETION_1 != ((IStrategoAppl)term).getConstructor())
                break Fail5199;
              { 
                if(true)
                  break Fail5198;
                if(true)
                  break Success2909;
              }
            }
            term = term2943;
          }
          term = w_12007;
          { 
            term = d_12008.invoke(context, s_12007);
            if(term == null)
              break Fail5197;
            if(u_12007.value == null)
              u_12007.value = term;
            else
              if(u_12007.value != term && !u_12007.value.match(term))
                break Fail5197;
            if(u_12007.value == null)
              break Fail5197;
            term = import_cache_path_0_0.instance.invoke(context, u_12007.value);
            if(term == null)
              break Fail5197;
            t_12007 = term;
            IStrategoTerm term2944 = term;
            Success2910:
            { 
              Fail5200:
              { 
                IStrategoTerm x_12007 = null;
                x_12007 = term;
                IStrategoTerm term2945 = term;
                Success2911:
                { 
                  Fail5201:
                  { 
                    if(u_12007.value == null)
                      break Fail5201;
                    term = $Is$Imported_0_0.instance.invoke(context, u_12007.value);
                    if(term == null)
                      break Fail5201;
                    { 
                      if(true)
                        break Fail5200;
                      if(true)
                        break Success2911;
                    }
                  }
                  term = term2945;
                }
                term = x_12007;
                { 
                  IStrategoTerm y_12007 = null;
                  IStrategoTerm h_12008 = null;
                  IStrategoTerm j_12008 = null;
                  IStrategoTerm k_12008 = null;
                  IStrategoTerm l_12008 = null;
                  IStrategoTerm m_12008 = null;
                  y_12007 = term;
                  j_12008 = term;
                  h_12008 = trans.const1001;
                  term = j_12008;
                  k_12008 = j_12008;
                  if(u_12007.value == null)
                    break Fail5197;
                  term = termFactory.makeTuple(trans.const1002, u_12007.value);
                  term = dr_set_rule_0_3.instance.invoke(context, k_12008, h_12008, u_12007.value, term);
                  if(term == null)
                    break Fail5197;
                  term = y_12007;
                  IStrategoTerm term2946 = term;
                  Success2912:
                  { 
                    Fail5202:
                    { 
                      if(u_12007.value == null)
                        break Fail5202;
                      term = termFactory.makeTuple(t_12007, u_12007.value);
                      term = is_newer_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail5202;
                      term = $Read$From$File_0_0.instance.invoke(context, t_12007);
                      if(term == null)
                        break Fail5202;
                      if(v_12007.value == null)
                        v_12007.value = term;
                      else
                        if(v_12007.value != term && !v_12007.value.match(term))
                          break Fail5202;
                      if(true)
                        break Success2912;
                    }
                    term = term2946;
                    if(u_12007.value == null)
                      break Fail5197;
                    term = e_12008.invoke(context, u_12007.value);
                    if(term == null)
                      break Fail5197;
                    if(v_12007.value == null)
                      v_12007.value = term;
                    else
                      if(v_12007.value != term && !v_12007.value.match(term))
                        break Fail5197;
                    IStrategoTerm term2947 = term;
                    Success2913:
                    { 
                      Fail5203:
                      { 
                        IStrategoTerm z_12007 = null;
                        z_12007 = term;
                        if(u_12007.value == null)
                          break Fail5203;
                        term = file_exists_0_0.instance.invoke(context, u_12007.value);
                        if(term == null)
                          break Fail5203;
                        term = z_12007;
                        { 
                          if(v_12007.value == null)
                            break Fail5197;
                          term = termFactory.makeTuple(t_12007, v_12007.value);
                          term = $Write$To$Binary$File_0_0.instance.invoke(context, term);
                          if(term == null)
                            break Fail5197;
                          if(true)
                            break Success2913;
                        }
                      }
                      term = term2947;
                    }
                  }
                  m_12008 = term;
                  l_12008 = trans.const999;
                  term = m_12008;
                  lifted1122 lifted11220 = new lifted1122();
                  lifted11220.f_12008 = f_12008;
                  lifted11220.u_12007 = u_12007;
                  lifted11220.v_12007 = v_12007;
                  term = dr_scope_1_1.instance.invoke(context, term, lifted11220, l_12008);
                  if(term == null)
                    break Fail5197;
                  if(true)
                    break Success2910;
                }
              }
              term = term2944;
            }
            if(true)
              break Success2908;
          }
        }
        term = term2942;
      }
      term = s_12007;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}