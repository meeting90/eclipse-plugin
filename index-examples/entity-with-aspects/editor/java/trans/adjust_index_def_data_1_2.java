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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy v_2195, IStrategoTerm w_2195, IStrategoTerm x_2195)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("adjust_index_def_data_1_2");
    Fail1518:
    { 
      IStrategoTerm term837 = term;
      IStrategoConstructor cons55 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success837:
      { 
        if(cons55 == Main._consWildcardImport_1)
        { 
          Fail1519:
          { 
            IStrategoTerm t_2030 = null;
            t_2030 = term.getSubterm(0);
            term = index_get_current_file_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail1519;
            term = index_file_to_string_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail1519;
            term = termFactory.makeAppl(Main._consDefData_3, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(trans.constEntity0, termFactory.makeListCons(term, (IStrategoList)trans.constNil1)), trans.constImport0, termFactory.makeTuple(t_2030, trans.constCons86)});
            term = v_2195.invoke(context, term);
            if(term == null)
              break Fail1519;
            if(true)
              break Success837;
          }
          term = term837;
        }
        Success838:
        { 
          if(cons55 == Main._consEntity_2)
          { 
            Fail1520:
            { 
              IStrategoTerm p_2030 = null;
              p_2030 = term.getSubterm(0);
              IStrategoList list43;
              list43 = checkListTail(x_2195);
              if(list43 == null)
                break Fail1520;
              term = termFactory.makeAppl(Main._consDefData_3, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(w_2195, list43), trans.constType0, termFactory.makeAppl(Main._consType_1, new IStrategoTerm[]{p_2030})});
              term = v_2195.invoke(context, term);
              if(term == null)
                break Fail1520;
              if(true)
                break Success838;
            }
            term = term837;
          }
          Success839:
          { 
            if(cons55 == Main._consProperty_2)
            { 
              Fail1521:
              { 
                IStrategoTerm l_2030 = null;
                l_2030 = term.getSubterm(1);
                IStrategoList list44;
                list44 = checkListTail(x_2195);
                if(list44 == null)
                  break Fail1521;
                term = termFactory.makeAppl(Main._consDefData_3, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(w_2195, list44), trans.constType0, l_2030});
                term = v_2195.invoke(context, term);
                if(term == null)
                  break Fail1521;
                if(true)
                  break Success839;
              }
              term = term837;
            }
            Success840:
            { 
              if(cons55 == Main._consVarDecl_2)
              { 
                Fail1522:
                { 
                  IStrategoTerm g_2030 = null;
                  g_2030 = term.getSubterm(1);
                  IStrategoList list45;
                  list45 = checkListTail(x_2195);
                  if(list45 == null)
                    break Fail1522;
                  term = termFactory.makeAppl(Main._consDefData_3, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(w_2195, list45), trans.constType0, g_2030});
                  term = v_2195.invoke(context, term);
                  if(term == null)
                    break Fail1522;
                  if(true)
                    break Success840;
                }
                term = term837;
              }
              Success841:
              { 
                if(cons55 == Main._consVarDeclInit_3)
                { 
                  Fail1523:
                  { 
                    IStrategoTerm b_2030 = null;
                    b_2030 = term.getSubterm(1);
                    IStrategoList list46;
                    list46 = checkListTail(x_2195);
                    if(list46 == null)
                      break Fail1523;
                    term = termFactory.makeAppl(Main._consDefData_3, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(w_2195, list46), trans.constType0, b_2030});
                    term = v_2195.invoke(context, term);
                    if(term == null)
                      break Fail1523;
                    if(true)
                      break Success841;
                  }
                  term = term837;
                }
                Success842:
                { 
                  if(cons55 == Main._consParam_2)
                  { 
                    Fail1524:
                    { 
                      IStrategoTerm w_2029 = null;
                      w_2029 = term.getSubterm(1);
                      IStrategoList list47;
                      list47 = checkListTail(x_2195);
                      if(list47 == null)
                        break Fail1524;
                      term = termFactory.makeAppl(Main._consDefData_3, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(w_2195, list47), trans.constType0, w_2029});
                      term = v_2195.invoke(context, term);
                      if(term == null)
                        break Fail1524;
                      if(true)
                        break Success842;
                    }
                    term = term837;
                  }
                  Success843:
                  { 
                    if(cons55 == Main._consPointcut_3)
                    { 
                      Fail1525:
                      { 
                        IStrategoTerm r_2029 = null;
                        r_2029 = term.getSubterm(2);
                        IStrategoList list48;
                        list48 = checkListTail(x_2195);
                        if(list48 == null)
                          break Fail1525;
                        term = termFactory.makeAppl(Main._consPointcut_2, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(w_2195, list48), r_2029});
                        term = v_2195.invoke(context, term);
                        if(term == null)
                          break Fail1525;
                        if(true)
                          break Success843;
                      }
                      term = term837;
                    }
                    if(cons55 == Main._consAdvice_6)
                    { 
                      IStrategoTerm i_2029 = null;
                      IStrategoTerm j_2029 = null;
                      IStrategoTerm k_2029 = null;
                      IStrategoTerm l_2029 = null;
                      IStrategoTerm m_2029 = null;
                      IStrategoTerm o_2029 = null;
                      i_2029 = term.getSubterm(1);
                      j_2029 = term.getSubterm(2);
                      k_2029 = term.getSubterm(3);
                      l_2029 = term.getSubterm(5);
                      o_2029 = term;
                      term = termFactory.makeAppl(Main._consADVICE_4, new IStrategoTerm[]{i_2029, j_2029, k_2029, l_2029});
                      m_2029 = term;
                      term = o_2029;
                      IStrategoList list49;
                      list49 = checkListTail(x_2195);
                      if(list49 == null)
                        break Fail1518;
                      term = termFactory.makeAppl(Main._consAdvice_2, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(w_2195, list49), m_2029});
                      term = v_2195.invoke(context, term);
                      if(term == null)
                        break Fail1518;
                    }
                    else
                    { 
                      break Fail1518;
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