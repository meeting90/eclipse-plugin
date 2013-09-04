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

@SuppressWarnings("all") public class index_compilation_file_tuple_0_0 extends Strategy 
{ 
  public static index_compilation_file_tuple_0_0 instance = new index_compilation_file_tuple_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("index_compilation_file_tuple_0_0");
    Fail1972:
    { 
      IStrategoTerm d_2092 = null;
      IStrategoTerm e_2092 = null;
      IStrategoTerm z_2092 = null;
      IStrategoTerm l_2092 = null;
      IStrategoTerm n_2092 = null;
      IStrategoTerm o_2092 = null;
      IStrategoTerm t_2092 = null;
      IStrategoTerm v_2092 = null;
      IStrategoTerm w_2092 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail1972;
      d_2092 = term.getSubterm(0);
      e_2092 = term.getSubterm(1);
      term = index_compilation_read_path_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail1972;
      IStrategoTerm term1220 = term;
      Success1198:
      { 
        Fail1973:
        { 
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1973;
          if(true)
            break Success1198;
        }
        term = term1220;
        IStrategoTerm term1221 = term;
        Success1199:
        { 
          Fail1974:
          { 
            term = is_string_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail1974;
            if(true)
              break Success1199;
          }
          term = term1221;
          IStrategoTerm term1222 = term;
          Success1200:
          { 
            Fail1975:
            { 
              term = int_to_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail1975;
              if(true)
                break Success1200;
            }
            term = term1222;
            IStrategoTerm term1223 = term;
            Success1201:
            { 
              Fail1976:
              { 
                term = real_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail1976;
                if(true)
                  break Success1201;
              }
              term = term1223;
              IStrategoTerm h_2092 = null;
              IStrategoTerm i_2092 = null;
              IStrategoTerm k_2092 = null;
              h_2092 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail1972;
              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                break Fail1972;
              i_2092 = ((IStrategoList)term).tail();
              k_2092 = i_2092;
              term = report_failure_0_2.instance.invoke(context, k_2092, trans.const410, h_2092);
              if(term == null)
                break Fail1972;
            }
          }
        }
      }
      n_2092 = term;
      l_2092 = trans.const265;
      o_2092 = n_2092;
      term = string_replace_0_2.instance.invoke(context, o_2092, l_2092, trans.const265);
      if(term == null)
        break Fail1972;
      z_2092 = term;
      term = d_2092;
      IStrategoTerm term1224 = term;
      Success1202:
      { 
        Fail1977:
        { 
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1977;
          if(true)
            break Success1202;
        }
        term = term1224;
        IStrategoTerm term1225 = term;
        Success1203:
        { 
          Fail1978:
          { 
            term = is_string_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail1978;
            if(true)
              break Success1203;
          }
          term = term1225;
          IStrategoTerm term1226 = term;
          Success1204:
          { 
            Fail1979:
            { 
              term = int_to_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail1979;
              if(true)
                break Success1204;
            }
            term = term1226;
            IStrategoTerm term1227 = term;
            Success1205:
            { 
              Fail1980:
              { 
                term = real_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail1980;
                if(true)
                  break Success1205;
              }
              term = term1227;
              IStrategoTerm p_2092 = null;
              IStrategoTerm q_2092 = null;
              IStrategoTerm s_2092 = null;
              p_2092 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail1972;
              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                break Fail1972;
              q_2092 = ((IStrategoList)term).tail();
              s_2092 = q_2092;
              term = report_failure_0_2.instance.invoke(context, s_2092, trans.const410, p_2092);
              if(term == null)
                break Fail1972;
            }
          }
        }
      }
      v_2092 = term;
      t_2092 = trans.const265;
      w_2092 = v_2092;
      term = string_replace_0_2.instance.invoke(context, w_2092, t_2092, trans.const411);
      if(term == null)
        break Fail1972;
      term = (IStrategoTerm)termFactory.makeListCons(z_2092, termFactory.makeListCons(trans.const412, termFactory.makeListCons(term, (IStrategoList)trans.constNil1)));
      term = concat_strings_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail1972;
      term = termFactory.makeTuple(termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil1)), e_2092);
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}