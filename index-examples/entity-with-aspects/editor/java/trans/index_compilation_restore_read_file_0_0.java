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

@SuppressWarnings("all") public class index_compilation_restore_read_file_0_0 extends Strategy 
{ 
  public static index_compilation_restore_read_file_0_0 instance = new index_compilation_restore_read_file_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("index_compilation_restore_read_file_0_0");
    Fail1966:
    { 
      IStrategoTerm term1216 = term;
      Success1194:
      { 
        Fail1967:
        { 
          IStrategoTerm p_2091 = null;
          IStrategoTerm q_2091 = null;
          IStrategoTerm r_2091 = null;
          IStrategoTerm s_2091 = null;
          if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
            break Fail1967;
          r_2091 = term.getSubterm(0);
          p_2091 = term.getSubterm(1);
          Success1195:
          { 
            Fail1968:
            { 
              IStrategoTerm t_2091 = null;
              IStrategoTerm v_2091 = null;
              IStrategoTerm x_2091 = null;
              IStrategoTerm a_2092 = null;
              t_2091 = term;
              term = r_2091;
              x_2091 = r_2091;
              term = index_compilation_read_path_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail1968;
              v_2091 = term;
              a_2092 = x_2091;
              term = string_replace_0_2.instance.invoke(context, a_2092, v_2091, trans.const309);
              if(term == null)
                break Fail1968;
              q_2091 = term;
              term = t_2091;
              { 
                term = q_2091;
                s_2091 = q_2091;
                if(true)
                  break Success1195;
              }
            }
            term = r_2091;
            s_2091 = r_2091;
          }
          term = termFactory.makeTuple(s_2091, p_2091);
          if(true)
            break Success1194;
        }
        term = term1216;
        IStrategoTerm e_2091 = null;
        IStrategoTerm f_2091 = null;
        IStrategoTerm g_2091 = null;
        f_2091 = term;
        IStrategoTerm term1218 = term;
        Success1196:
        { 
          Fail1969:
          { 
            term = is_tuple_0_0.instance.invoke(context, f_2091);
            if(term == null)
              break Fail1969;
            { 
              if(true)
                break Fail1966;
              if(true)
                break Success1196;
            }
          }
          term = term1218;
        }
        Success1197:
        { 
          Fail1970:
          { 
            IStrategoTerm h_2091 = null;
            IStrategoTerm j_2091 = null;
            IStrategoTerm l_2091 = null;
            IStrategoTerm o_2091 = null;
            h_2091 = term;
            term = f_2091;
            l_2091 = f_2091;
            term = index_compilation_read_path_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail1970;
            j_2091 = term;
            o_2091 = l_2091;
            term = string_replace_0_2.instance.invoke(context, o_2091, j_2091, trans.const309);
            if(term == null)
              break Fail1970;
            e_2091 = term;
            term = h_2091;
            { 
              term = e_2091;
              g_2091 = e_2091;
              if(true)
                break Success1197;
            }
          }
          term = f_2091;
          g_2091 = f_2091;
        }
        term = g_2091;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}