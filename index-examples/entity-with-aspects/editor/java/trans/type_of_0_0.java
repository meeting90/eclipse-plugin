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

@SuppressWarnings("all") public class type_of_0_0 extends Strategy 
{ 
  public static type_of_0_0 instance = new type_of_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("type_of_0_0");
    Fail1526:
    { 
      IStrategoTerm term844 = term;
      IStrategoConstructor cons56 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success844:
      { 
        if(cons56 == Main._consEntity_2)
        { 
          Fail1527:
          { 
            IStrategoTerm o_2031 = null;
            o_2031 = term.getSubterm(0);
            term = termFactory.makeAppl(Main._consType_1, new IStrategoTerm[]{o_2031});
            if(true)
              break Success844;
          }
          term = term844;
        }
        Success845:
        { 
          if(cons56 == Main._consProperty_2)
          { 
            Fail1528:
            { 
              IStrategoTerm n_2031 = null;
              n_2031 = term.getSubterm(1);
              term = n_2031;
              if(true)
                break Success845;
            }
            term = term844;
          }
          Success846:
          { 
            if(cons56 == Main._consVarDecl_2)
            { 
              Fail1529:
              { 
                IStrategoTerm l_2031 = null;
                l_2031 = term.getSubterm(1);
                term = l_2031;
                if(true)
                  break Success846;
              }
              term = term844;
            }
            Success847:
            { 
              if(cons56 == Main._consVarDeclInit_3)
              { 
                Fail1530:
                { 
                  IStrategoTerm j_2031 = null;
                  j_2031 = term.getSubterm(1);
                  term = j_2031;
                  if(true)
                    break Success847;
                }
                term = term844;
              }
              Success848:
              { 
                if(cons56 == Main._consParam_2)
                { 
                  Fail1531:
                  { 
                    IStrategoTerm h_2031 = null;
                    h_2031 = term.getSubterm(1);
                    term = h_2031;
                    if(true)
                      break Success848;
                  }
                  term = term844;
                }
                Success849:
                { 
                  if(cons56 == Main._consType_1)
                  { 
                    Fail1532:
                    { 
                      IStrategoTerm f_2031 = null;
                      f_2031 = term.getSubterm(0);
                      term = termFactory.makeAppl(Main._consType_1, new IStrategoTerm[]{f_2031});
                      if(true)
                        break Success849;
                    }
                    term = term844;
                  }
                  Success850:
                  { 
                    if(cons56 == Main._consStringType_0)
                    { 
                      Fail1533:
                      { 
                        term = trans.constType1;
                        if(true)
                          break Success850;
                      }
                      term = term844;
                    }
                    Success851:
                    { 
                      if(cons56 == Main._consIntType_0)
                      { 
                        Fail1534:
                        { 
                          term = trans.constType2;
                          if(true)
                            break Success851;
                        }
                        term = term844;
                      }
                      Success852:
                      { 
                        if(cons56 == Main._consStringLit_1)
                        { 
                          Fail1535:
                          { 
                            term = this.invoke(context, trans.constStringType0);
                            if(term == null)
                              break Fail1535;
                            if(true)
                              break Success852;
                          }
                          term = term844;
                        }
                        Success853:
                        { 
                          if(cons56 == Main._consIntLit_1)
                          { 
                            Fail1536:
                            { 
                              term = this.invoke(context, trans.constIntType0);
                              if(term == null)
                                break Fail1536;
                              if(true)
                                break Success853;
                            }
                            term = term844;
                          }
                          Success854:
                          { 
                            if(cons56 == Main._consVar_1)
                            { 
                              Fail1537:
                              { 
                                IStrategoTerm e_2031 = null;
                                e_2031 = term.getSubterm(0);
                                term = index_lookup_0_0.instance.invoke(context, e_2031);
                                if(term == null)
                                  break Fail1537;
                                term = this.invoke(context, term);
                                if(term == null)
                                  break Fail1537;
                                if(true)
                                  break Success854;
                              }
                              term = term844;
                            }
                            Success855:
                            { 
                              if(cons56 == Main._consPropAccess_2)
                              { 
                                Fail1538:
                                { 
                                  IStrategoTerm d_2031 = null;
                                  d_2031 = term.getSubterm(1);
                                  term = index_lookup_0_0.instance.invoke(context, d_2031);
                                  if(term == null)
                                    break Fail1538;
                                  term = this.invoke(context, term);
                                  if(term == null)
                                    break Fail1538;
                                  if(true)
                                    break Success855;
                                }
                                term = term844;
                              }
                              if(cons56 == Main._consDef_1)
                              { 
                                IStrategoTerm z_2030 = null;
                                IStrategoTerm b_2031 = null;
                                z_2030 = term.getSubterm(0);
                                term = termFactory.makeAppl(Main._consDef_1, new IStrategoTerm[]{z_2030});
                                b_2031 = term;
                                term = index_get_data_0_1.instance.invoke(context, b_2031, trans.constType0);
                                if(term == null)
                                  break Fail1526;
                                term = this.invoke(context, term);
                                if(term == null)
                                  break Fail1526;
                              }
                              else
                              { 
                                break Fail1526;
                              }
                            }
                          }
                        }
                      }
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