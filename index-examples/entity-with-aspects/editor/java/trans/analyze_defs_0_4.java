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

@SuppressWarnings("all") public class analyze_defs_0_4 extends Strategy 
{ 
  public static analyze_defs_0_4 instance = new analyze_defs_0_4();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_f_2196, IStrategoTerm ref_g_2196, IStrategoTerm h_2196, IStrategoTerm i_2196)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference f_2196 = new TermReference(ref_f_2196);
    TermReference g_2196 = new TermReference(ref_g_2196);
    context.push("analyze_defs_0_4");
    Fail2001:
    { 
      IStrategoTerm term1245 = term;
      Success1218:
      { 
        Fail2002:
        { 
          IStrategoTerm x_2101 = null;
          IStrategoTerm y_2101 = null;
          IStrategoTerm z_2101 = null;
          IStrategoTerm a_2102 = null;
          IStrategoTerm e_2102 = null;
          IStrategoTerm f_2102 = null;
          IStrategoTerm h_2102 = null;
          IStrategoTerm i_2102 = null;
          a_2102 = term;
          IStrategoList annos75 = term.getAnnotations();
          if(annos75.getTermType() != IStrategoTerm.LIST || ((IStrategoList)annos75).isEmpty())
            break Fail2002;
          IStrategoTerm arg647 = ((IStrategoList)annos75).head();
          if(arg647.getTermType() != IStrategoTerm.APPL || Main._consScope_1 != ((IStrategoAppl)arg647).getConstructor())
            break Fail2002;
          IStrategoTerm arg648 = arg647.getSubterm(0);
          if(arg648.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg648).isEmpty())
            break Fail2002;
          x_2101 = ((IStrategoList)arg648).head();
          IStrategoTerm arg649 = ((IStrategoList)arg648).tail();
          if(arg649.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg649).isEmpty())
            break Fail2002;
          y_2101 = ((IStrategoList)arg649).tail();
          IStrategoTerm arg650 = ((IStrategoList)annos75).tail();
          if(arg650.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg650).isEmpty())
            break Fail2002;
          if(f_2196.value == null)
            break Fail2002;
          e_2102 = f_2196.value;
          term = (IStrategoTerm)termFactory.makeListCons(termFactory.makeTuple(x_2101, y_2101), (IStrategoList)trans.constNil1);
          term = update_index_paths_0_1.instance.invoke(context, e_2102, term);
          if(term == null)
            break Fail2002;
          z_2101 = term;
          term = rm_annotations_0_0.instance.invoke(context, a_2102);
          if(term == null)
            break Fail2002;
          h_2102 = term;
          f_2102 = trans.constAnon0;
          i_2102 = h_2102;
          term = this.invoke(context, i_2102, z_2101, g_2196.value, f_2102, trans.constAnon0);
          if(term == null)
            break Fail2002;
          if(true)
            break Success1218;
        }
        term = term1245;
        IStrategoTerm n_2100 = null;
        IStrategoTerm o_2100 = null;
        IStrategoTerm p_2100 = null;
        TermReference q_2100 = new TermReference();
        TermReference r_2100 = new TermReference();
        IStrategoTerm s_2100 = null;
        IStrategoTerm t_2100 = null;
        TermReference u_2100 = new TermReference();
        TermReference v_2100 = new TermReference();
        TermReference w_2100 = new TermReference();
        TermReference x_2100 = new TermReference();
        IStrategoTerm y_2100 = null;
        TermReference z_2100 = new TermReference();
        TermReference a_2101 = new TermReference();
        IStrategoTerm b_2101 = null;
        IStrategoTerm c_2101 = null;
        IStrategoTerm d_2101 = null;
        IStrategoTerm i_2101 = null;
        IStrategoTerm j_2101 = null;
        if(r_2100.value == null)
          r_2100.value = term;
        else
          if(r_2100.value != term && !r_2100.value.match(term))
            break Fail2001;
        i_2101 = term;
        if(r_2100.value == null)
          break Fail2001;
        term = r_2100.value;
        IStrategoTerm term1246 = term;
        Success1219:
        { 
          Fail2003:
          { 
            term = has_annos_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail2003;
            { 
              if(true)
                break Fail2001;
              if(true)
                break Success1219;
            }
          }
          term = term1246;
        }
        term = i_2101;
        j_2101 = i_2101;
        IStrategoTerm term1247 = term;
        Success1220:
        { 
          Fail2004:
          { 
            Success1221:
            { 
              Fail2005:
              { 
                IStrategoTerm e_2101 = null;
                e_2101 = term;
                if(r_2100.value == null)
                  break Fail2005;
                term = nam_get_definition_0_0.instance.invoke(context, r_2100.value);
                if(term == null)
                  break Fail2005;
                if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
                  break Fail2005;
                n_2100 = term.getSubterm(0);
                o_2100 = term.getSubterm(1);
                term = e_2101;
                { 
                  IStrategoTerm l_2101 = null;
                  term = nam_get_def_0_2.instance.invoke(context, o_2100, f_2196.value, n_2100);
                  if(term == null)
                    break Fail2004;
                  p_2100 = term;
                  if(term.getTermType() != IStrategoTerm.APPL || Main._consDef_1 != ((IStrategoAppl)term).getConstructor())
                    break Fail2004;
                  if(a_2101.value == null)
                    a_2101.value = term.getSubterm(0);
                  else
                    if(a_2101.value != term.getSubterm(0) && !a_2101.value.match(term.getSubterm(0)))
                      break Fail2004;
                  term = n_2100;
                  if(u_2100.value == null)
                    u_2100.value = term;
                  else
                    if(u_2100.value != term && !u_2100.value.match(term))
                      break Fail2004;
                  term = $Hd_0_0.instance.invoke(context, o_2100);
                  if(term == null)
                    break Fail2004;
                  if(v_2100.value == null)
                    v_2100.value = term;
                  else
                    if(v_2100.value != term && !v_2100.value.match(term))
                      break Fail2004;
                  if(r_2100.value == null)
                    break Fail2004;
                  term = r_2100.value;
                  lifted407 lifted4070 = new lifted407();
                  lifted4070.a_2101 = a_2101;
                  term = try_1_0.instance.invoke(context, term, lifted4070);
                  if(term == null)
                    break Fail2004;
                  IStrategoTerm cons37 = context.invokePrimitive("SSL_get_constructor", term, NO_STRATEGIES, new IStrategoTerm[]{term});
                  b_2101 = cons37;
                  IStrategoTerm args12 = context.invokePrimitive("SSL_get_arguments", term, NO_STRATEGIES, new IStrategoTerm[]{term});
                  y_2100 = args12;
                  if(g_2196.value == null)
                    break Fail2004;
                  term = g_2196.value;
                  l_2101 = g_2196.value;
                  term = new_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail2004;
                  term = termFactory.makeTuple(term, p_2100);
                  term = iset_add_0_1.instance.invoke(context, l_2101, term);
                  if(term == null)
                    break Fail2004;
                  if(true)
                    break Success1221;
                }
              }
              term = trans.constINTERNAL_ERROR0;
              if(a_2101.value == null)
                a_2101.value = term;
              else
                if(a_2101.value != term && !a_2101.value.match(term))
                  break Fail2004;
              term = i_2196;
              if(u_2100.value == null)
                u_2100.value = term;
              else
                if(u_2100.value != term && !u_2100.value.match(term))
                  break Fail2004;
              term = h_2196;
              if(v_2100.value == null)
                v_2100.value = term;
              else
                if(v_2100.value != term && !v_2100.value.match(term))
                  break Fail2004;
              if(r_2100.value == null)
                break Fail2004;
              term = r_2100.value;
              IStrategoTerm cons38 = context.invokePrimitive("SSL_get_constructor", term, NO_STRATEGIES, new IStrategoTerm[]{term});
              b_2101 = cons38;
              IStrategoTerm args13 = context.invokePrimitive("SSL_get_arguments", term, NO_STRATEGIES, new IStrategoTerm[]{term});
              y_2100 = args13;
            }
            IStrategoTerm term1249 = term;
            Success1222:
            { 
              Fail2006:
              { 
                IStrategoTerm f_2101 = null;
                f_2101 = term;
                if(r_2100.value == null)
                  break Fail2006;
                term = nam_get_scope_types_0_0.instance.invoke(context, r_2100.value);
                if(term == null)
                  break Fail2006;
                s_2100 = term;
                term = f_2101;
                { 
                  term = new_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail2004;
                  term = termFactory.makeAppl(Main._consAnon_1, new IStrategoTerm[]{term});
                  if(q_2100.value == null)
                    q_2100.value = term;
                  else
                    if(q_2100.value != term && !q_2100.value.match(term))
                      break Fail2004;
                  term = s_2100;
                  lifted408 lifted4080 = new lifted408();
                  lifted4080.f_2196 = f_2196;
                  lifted4080.v_2100 = v_2100;
                  lifted4080.u_2100 = u_2100;
                  lifted4080.q_2100 = q_2100;
                  lifted4080.r_2100 = r_2100;
                  term = map_1_0.instance.invoke(context, term, lifted4080);
                  if(term == null)
                    break Fail2004;
                  t_2100 = term;
                  if(f_2196.value == null)
                    break Fail2004;
                  term = update_index_paths_0_1.instance.invoke(context, f_2196.value, t_2100);
                  if(term == null)
                    break Fail2004;
                  if(z_2100.value == null)
                    z_2100.value = term;
                  else
                    if(z_2100.value != term && !z_2100.value.match(term))
                      break Fail2004;
                  term = trans.constAnon0;
                  if(x_2100.value == null)
                    x_2100.value = term;
                  else
                    if(x_2100.value != term && !x_2100.value.match(term))
                      break Fail2004;
                  term = trans.constAnon0;
                  if(w_2100.value == null)
                    w_2100.value = term;
                  else
                    if(w_2100.value != term && !w_2100.value.match(term))
                      break Fail2004;
                  if(true)
                    break Success1222;
                }
              }
              term = term1249;
              if(f_2196.value == null)
                break Fail2004;
              term = f_2196.value;
              if(z_2100.value == null)
                z_2100.value = term;
              else
                if(z_2100.value != term && !z_2100.value.match(term))
                  break Fail2004;
              if(u_2100.value == null)
                break Fail2004;
              term = u_2100.value;
              if(x_2100.value == null)
                x_2100.value = term;
              else
                if(x_2100.value != term && !x_2100.value.match(term))
                  break Fail2004;
              if(v_2100.value == null)
                break Fail2004;
              term = v_2100.value;
              if(w_2100.value == null)
                w_2100.value = term;
              else
                if(w_2100.value != term && !w_2100.value.match(term))
                  break Fail2004;
            }
            term = y_2100;
            lifted409 lifted4090 = new lifted409();
            lifted4090.z_2100 = z_2100;
            lifted4090.g_2196 = g_2196;
            lifted4090.w_2100 = w_2100;
            lifted4090.x_2100 = x_2100;
            term = origin_track_forced_1_0.instance.invoke(context, term, lifted4090);
            if(term == null)
              break Fail2004;
            c_2101 = term;
            IStrategoTerm mkterm2;
            mkterm2 = context.invokePrimitive("SSL_mkterm", term, NO_STRATEGIES, new IStrategoTerm[]{b_2101, c_2101});
            if(mkterm2 == null)
              break Fail2004;
            term = mkterm2;
            lifted410 lifted4100 = new lifted410();
            lifted4100.z_2100 = z_2100;
            lifted4100.a_2101 = a_2101;
            term = try_1_0.instance.invoke(context, term, lifted4100);
            if(term == null)
              break Fail2004;
            d_2101 = term;
            if(true)
              break Success1220;
          }
          term = term1247;
          IStrategoTerm g_2101 = null;
          IStrategoTerm h_2101 = null;
          IStrategoTerm r_2101 = null;
          g_2101 = term;
          term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
          if(term == null)
            break Fail2001;
          h_2101 = term;
          r_2101 = g_2101;
          term = report_with_failure_0_2.instance.invoke(context, r_2101, trans.const421, h_2101);
          if(term == null)
            break Fail2001;
        }
        term = j_2101;
        if(d_2101 == null)
          break Fail2001;
        term = d_2101;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}