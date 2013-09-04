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

@SuppressWarnings("all") final class lifted1123 extends Strategy 
{ 
  TermReference u_12008;

  TermReference v_12008;

  Strategy t_12009;

  Strategy r_12009;

  Strategy s_12009;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail5628:
    { 
      IStrategoTerm term2950 = term;
      Success3068:
      { 
        Fail5629:
        { 
          IStrategoTerm x_12008 = null;
          x_12008 = term;
          term = t_12009.invoke(context, term);
          if(term == null)
            break Fail5629;
          term = x_12008;
          { 
            IStrategoTerm term2951 = term;
            Success3069:
            { 
              Fail5630:
              { 
                IStrategoTerm x_12009 = null;
                IStrategoTerm z_12009 = null;
                IStrategoTerm c_12009 = null;
                IStrategoTerm e_12009 = null;
                IStrategoTerm f_12009 = null;
                IStrategoTerm m_12009 = null;
                IStrategoTerm o_12009 = null;
                IStrategoTerm p_12009 = null;
                z_12009 = term;
                if(u_12008.value == null)
                  break Fail5630;
                term = u_12008.value;
                IStrategoTerm term2952 = term;
                Success3070:
                { 
                  Fail5631:
                  { 
                    term = concat_strings_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail5631;
                    if(true)
                      break Success3070;
                  }
                  term = term2952;
                  IStrategoTerm term2953 = term;
                  Success3071:
                  { 
                    Fail5632:
                    { 
                      term = is_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail5632;
                      if(true)
                        break Success3071;
                    }
                    term = term2953;
                    IStrategoTerm term2954 = term;
                    Success3072:
                    { 
                      Fail5633:
                      { 
                        term = int_to_string_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail5633;
                        if(true)
                          break Success3072;
                      }
                      term = term2954;
                      IStrategoTerm term2955 = term;
                      Success3073:
                      { 
                        Fail5634:
                        { 
                          term = real_to_string_0_0.instance.invoke(context, term);
                          if(term == null)
                            break Fail5634;
                          if(true)
                            break Success3073;
                        }
                        term = term2955;
                        IStrategoTerm y_12008 = null;
                        IStrategoTerm z_12008 = null;
                        IStrategoTerm b_12009 = null;
                        y_12008 = term;
                        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                        if(term == null)
                          break Fail5630;
                        if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                          break Fail5630;
                        z_12008 = ((IStrategoList)term).tail();
                        b_12009 = z_12008;
                        term = report_failure_0_2.instance.invoke(context, b_12009, trans.const1003, y_12008);
                        if(term == null)
                          break Fail5630;
                      }
                    }
                  }
                }
                e_12009 = term;
                c_12009 = trans.const785;
                f_12009 = e_12009;
                term = string_replace_0_2.instance.invoke(context, f_12009, c_12009, trans.const785);
                if(term == null)
                  break Fail5630;
                x_12009 = term;
                term = z_12009;
                IStrategoTerm term2956 = term;
                Success3074:
                { 
                  Fail5635:
                  { 
                    term = concat_strings_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail5635;
                    if(true)
                      break Success3074;
                  }
                  term = term2956;
                  IStrategoTerm term2957 = term;
                  Success3075:
                  { 
                    Fail5636:
                    { 
                      term = is_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail5636;
                      if(true)
                        break Success3075;
                    }
                    term = term2957;
                    IStrategoTerm term2958 = term;
                    Success3076:
                    { 
                      Fail5637:
                      { 
                        term = int_to_string_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail5637;
                        if(true)
                          break Success3076;
                      }
                      term = term2958;
                      IStrategoTerm term2959 = term;
                      Success3077:
                      { 
                        Fail5638:
                        { 
                          term = real_to_string_0_0.instance.invoke(context, term);
                          if(term == null)
                            break Fail5638;
                          if(true)
                            break Success3077;
                        }
                        term = term2959;
                        IStrategoTerm i_12009 = null;
                        IStrategoTerm j_12009 = null;
                        IStrategoTerm l_12009 = null;
                        i_12009 = term;
                        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                        if(term == null)
                          break Fail5630;
                        if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                          break Fail5630;
                        j_12009 = ((IStrategoList)term).tail();
                        l_12009 = j_12009;
                        term = report_failure_0_2.instance.invoke(context, l_12009, trans.const1003, i_12009);
                        if(term == null)
                          break Fail5630;
                      }
                    }
                  }
                }
                o_12009 = term;
                m_12009 = trans.const785;
                p_12009 = o_12009;
                term = string_replace_0_2.instance.invoke(context, p_12009, m_12009, trans.const857);
                if(term == null)
                  break Fail5630;
                term = (IStrategoTerm)termFactory.makeListCons(x_12009, termFactory.makeListCons(trans.const932, termFactory.makeListCons(term, (IStrategoList)trans.constNil3)));
                term = concat_strings_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail5630;
                term = termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil3));
                term = open_import_3_0.instance.invoke(context, term, _Id.instance, r_12009, s_12009);
                if(term == null)
                  break Fail5630;
                if(true)
                  break Success3069;
              }
              term = term2951;
              lifted1125 lifted11250 = new lifted1125();
              lifted11250.v_12008 = v_12008;
              term = try_1_0.instance.invoke(context, term, lifted11250);
              if(term == null)
                break Fail5628;
            }
            if(true)
              break Success3068;
          }
        }
        term = term2950;
      }
      if(true)
        return term;
    }
    return null;
  }
}