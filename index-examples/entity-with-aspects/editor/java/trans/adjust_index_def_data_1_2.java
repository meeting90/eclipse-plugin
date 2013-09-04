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

@SuppressWarnings("all") public class adjust_index_def_data_1_2 extends Strategy 
{ 
  public static adjust_index_def_data_1_2 instance = new adjust_index_def_data_1_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy q_12058, IStrategoTerm r_12058, IStrategoTerm s_12058)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("adjust_index_def_data_1_2");
    Fail4420:
    { 
      IStrategoTerm term2393 = term;
      IStrategoConstructor cons127 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success2393:
      { 
        if(cons127 == Main._consWildcardImport_1)
        { 
          Fail4421:
          { 
            IStrategoTerm o_11893 = null;
            o_11893 = term.getSubterm(0);
            term = index_get_current_file_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail4421;
            term = index_file_to_string_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail4421;
            term = termFactory.makeAppl(Main._consDefData_3, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(trans.constEntity0, termFactory.makeListCons(term, (IStrategoList)trans.constNil3)), trans.constImport0, termFactory.makeTuple(o_11893, trans.constCons218)});
            term = q_12058.invoke(context, term);
            if(term == null)
              break Fail4421;
            if(true)
              break Success2393;
          }
          term = term2393;
        }
        Success2394:
        { 
          if(cons127 == Main._consEntity_2)
          { 
            Fail4422:
            { 
              IStrategoTerm k_11893 = null;
              k_11893 = term.getSubterm(0);
              IStrategoList list119;
              list119 = checkListTail(s_12058);
              if(list119 == null)
                break Fail4422;
              term = termFactory.makeAppl(Main._consDefData_3, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(r_12058, list119), trans.constType0, termFactory.makeAppl(Main._consType_1, new IStrategoTerm[]{k_11893})});
              term = q_12058.invoke(context, term);
              if(term == null)
                break Fail4422;
              if(true)
                break Success2394;
            }
            term = term2393;
          }
          Success2395:
          { 
            if(cons127 == Main._consProperty_2)
            { 
              Fail4423:
              { 
                IStrategoTerm g_11893 = null;
                g_11893 = term.getSubterm(1);
                IStrategoList list120;
                list120 = checkListTail(s_12058);
                if(list120 == null)
                  break Fail4423;
                term = termFactory.makeAppl(Main._consDefData_3, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(r_12058, list120), trans.constType0, g_11893});
                term = q_12058.invoke(context, term);
                if(term == null)
                  break Fail4423;
                if(true)
                  break Success2395;
              }
              term = term2393;
            }
            Success2396:
            { 
              if(cons127 == Main._consVarDecl_2)
              { 
                Fail4424:
                { 
                  IStrategoTerm b_11893 = null;
                  b_11893 = term.getSubterm(1);
                  IStrategoList list121;
                  list121 = checkListTail(s_12058);
                  if(list121 == null)
                    break Fail4424;
                  term = termFactory.makeAppl(Main._consDefData_3, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(r_12058, list121), trans.constType0, b_11893});
                  term = q_12058.invoke(context, term);
                  if(term == null)
                    break Fail4424;
                  if(true)
                    break Success2396;
                }
                term = term2393;
              }
              Success2397:
              { 
                if(cons127 == Main._consVarDeclInit_3)
                { 
                  Fail4425:
                  { 
                    IStrategoTerm w_11892 = null;
                    w_11892 = term.getSubterm(1);
                    IStrategoList list122;
                    list122 = checkListTail(s_12058);
                    if(list122 == null)
                      break Fail4425;
                    term = termFactory.makeAppl(Main._consDefData_3, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(r_12058, list122), trans.constType0, w_11892});
                    term = q_12058.invoke(context, term);
                    if(term == null)
                      break Fail4425;
                    if(true)
                      break Success2397;
                  }
                  term = term2393;
                }
                Success2398:
                { 
                  if(cons127 == Main._consParam_2)
                  { 
                    Fail4426:
                    { 
                      IStrategoTerm r_11892 = null;
                      r_11892 = term.getSubterm(1);
                      IStrategoList list123;
                      list123 = checkListTail(s_12058);
                      if(list123 == null)
                        break Fail4426;
                      term = termFactory.makeAppl(Main._consDefData_3, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(r_12058, list123), trans.constType0, r_11892});
                      term = q_12058.invoke(context, term);
                      if(term == null)
                        break Fail4426;
                      if(true)
                        break Success2398;
                    }
                    term = term2393;
                  }
                  Success2399:
                  { 
                    if(cons127 == Main._consPointcut_3)
                    { 
                      Fail4427:
                      { 
                        IStrategoTerm m_11892 = null;
                        m_11892 = term.getSubterm(2);
                        IStrategoList list124;
                        list124 = checkListTail(s_12058);
                        if(list124 == null)
                          break Fail4427;
                        term = termFactory.makeAppl(Main._consPointcut_2, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(r_12058, list124), m_11892});
                        term = q_12058.invoke(context, term);
                        if(term == null)
                          break Fail4427;
                        if(true)
                          break Success2399;
                      }
                      term = term2393;
                    }
                    if(cons127 == Main._consAdvice_6)
                    { 
                      IStrategoTerm d_11892 = null;
                      IStrategoTerm e_11892 = null;
                      IStrategoTerm f_11892 = null;
                      IStrategoTerm g_11892 = null;
                      IStrategoTerm h_11892 = null;
                      IStrategoTerm j_11892 = null;
                      d_11892 = term.getSubterm(1);
                      e_11892 = term.getSubterm(2);
                      f_11892 = term.getSubterm(3);
                      g_11892 = term.getSubterm(5);
                      j_11892 = term;
                      term = termFactory.makeAppl(Main._consADVICE_4, new IStrategoTerm[]{d_11892, e_11892, f_11892, g_11892});
                      h_11892 = term;
                      term = j_11892;
                      IStrategoList list125;
                      list125 = checkListTail(s_12058);
                      if(list125 == null)
                        break Fail4420;
                      term = termFactory.makeAppl(Main._consAdvice_2, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(r_12058, list125), h_11892});
                      term = q_12058.invoke(context, term);
                      if(term == null)
                        break Fail4420;
                    }
                    else
                    { 
                      break Fail4420;
                    }
                  }
                }
              }
            }
          }
        }
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}