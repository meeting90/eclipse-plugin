definition([module(unparameterized("Common"),[],[exports(conc-grammars(conc-grammars(conc-grammars(conc-grammars(conc-grammars(sorts([sort("WATER"),sort("WATERTOKEN"),sort("WATERTOKENSTART"),sort("WATERTOKENSEPARATOR"),sort("WATERTOKENSTAR")]),lexical-syntax([prod([char-class(simple-charclass(present(conc(range(short("A"),short("Z")),conc(range(short("a"),short("z")),conc(range(short("0"),short("9")),short("\\_")))))))],sort("WATERTOKENSTART"),attrs([term(recover),avoid])),prod([sort("WATERTOKENSTART"),iter-star(char-class(simple-charclass(present(conc(range(short("A"),short("Z")),conc(range(short("a"),short("z")),conc(range(short("0"),short("9")),short("\\_"))))))))],sort("WATERTOKEN"),attrs([])),prod([char-class(comp(simple-charclass(present(conc(range(short("A"),short("Z")),conc(range(short("a"),short("z")),conc(range(short("0"),short("9")),conc(short("\\_"),conc(short("\\ "),conc(short("\\t"),conc(numeric("\\12"),conc(short("\\r"),conc(short("\\n"),short("\\*"))))))))))))))],sort("WATERTOKENSEPARATOR"),attrs([term(recover),avoid])),prod([lit("*")],sort("WATERTOKENSTAR"),attrs([term(recover),avoid])),prod([sort("WATERTOKEN")],sort("WATER"),attrs([])),prod([sort("WATERTOKENSEPARATOR")],sort("WATER"),attrs([])),prod([sort("WATERTOKENSTAR")],sort("WATER"),attrs([])),prod([],sort("WATEREOF"),attrs([])),prod([lit("completion123")],sort("COMPLETIONPREFIX"),attrs([term(completion)])),prod([lit("|#WATERTOKENSTAR|")],sort("WATERTOKENSTAR"),attrs([term(completion)])),prod([lit("|#STRING|")],sort("STRING"),attrs([term(completion)])),prod([lit("|#StringChar|")],sort("StringChar"),attrs([term(completion)])),prod([lit("|#BackSlashChar|")],sort("BackSlashChar"),attrs([term(completion)])),prod([lit("|#Start|")],sort("Start"),attrs([term(completion)])),prod([lit("|#Import|")],sort("Import"),attrs([term(completion)])),prod([lit("|#ImportPart|")],sort("ImportPart"),attrs([term(completion)])),prod([lit("|#Definition|")],sort("Definition"),attrs([term(completion)])),prod([lit("|#AspectMember|")],sort("AspectMember"),attrs([term(completion)])),prod([lit("|#AdviceType|")],sort("AdviceType"),attrs([term(completion)])),prod([lit("|#JoinPoint|")],sort("JoinPoint"),attrs([term(completion)])),prod([lit("|#Member|")],sort("Member"),attrs([term(completion)])),prod([lit("|#Param|")],sort("Param"),attrs([term(completion)])),prod([lit("|#Stm|")],sort("Stm"),attrs([term(completion)])),prod([lit("|#Exp|")],sort("Exp"),attrs([term(completion)])),prod([lit("|#Type|")],sort("Type"),attrs([term(completion)]))])),lexical-restrictions([follow([sort("WATERTOKEN")],single(char-class(simple-charclass(present(conc(range(short("A"),short("Z")),conc(range(short("a"),short("z")),conc(range(short("0"),short("9")),short("\\_"))))))))),follow([sort("WATERTOKENSTAR")],single(char-class(simple-charclass(present(short("\\/"))))))])),context-free-syntax([prod([sort("WATER")],layout,attrs([term(cons("WATER"))]))])),conc-grammars(conc-grammars(conc-grammars(sorts([sort("WATEREOF")]),lexical-restrictions([follow([sort("WATEREOF")],single(char-class(comp(simple-charclass(absent)))))])),lexical-syntax([prod([lit("\\\"")],sort("INSERTOPENQUOTE"),attrs([term(recover)])),prod([sort("INSERTOPENQUOTE"),iter-star(sort("StringChar")),lit("\\n")],sort("STRING"),attrs([term(cons("INSERTEND"))])),prod([sort("INSERTOPENQUOTE"),iter-star(sort("StringChar")),sort("WATEREOF")],sort("STRING"),attrs([term(cons("INSERTEND"))])),prod([lit("/*")],sort("INSERTSTART"),attrs([term(recover)])),prod([sort("INSERTSTART"),iter-star(alt(char-class(comp(simple-charclass(present(short("\\*"))))),sort("CommentChar"))),sort("WATEREOF")],layout,attrs([term(cons("INSERTEND"))])),prod([],lit("module"),attrs([term(recover),term(cons("INSERTION"))])),prod([],lit("entity"),attrs([term(recover),term(cons("INSERTION"))])),prod([],lit("import"),attrs([term(recover),term(cons("INSERTION"))])),prod([],lit("aspect"),attrs([term(recover),term(cons("INSERTION"))])),prod([],lit("pointcut"),attrs([term(recover),term(cons("INSERTION"))])),prod([],lit("advice"),attrs([term(recover),term(cons("INSERTION"))])),prod([],lit(")"),attrs([term(recover),term(cons("INSERTION"))])),prod([],lit("assigned"),attrs([term(recover),term(cons("INSERTION"))])),prod([],lit("}"),attrs([term(recover),term(cons("INSERTION"))])),prod([],lit(","),attrs([term(recover),term(cons("INSERTION"))]))])),syntax([]))),conc-grammars(conc-grammars(lexical-syntax([prod([char-class(simple-charclass(present(conc(range(short("a"),short("z")),range(short("A"),short("Z")))))),iter-star(char-class(simple-charclass(present(conc(range(short("a"),short("z")),conc(range(short("A"),short("Z")),range(short("0"),short("9"))))))))],sort("ID"),attrs([])),prod([opt(lit("-")),iter(char-class(simple-charclass(present(range(short("0"),short("9"))))))],sort("INT"),attrs([])),prod([lit("\\\""),iter-star(sort("StringChar")),lit("\\\"")],sort("STRING"),attrs([])),prod([char-class(comp(simple-charclass(present(conc(short("\\\""),short("\\n"))))))],sort("StringChar"),attrs([])),prod([lit("\\\\\\\"")],sort("StringChar"),attrs([])),prod([sort("BackSlashChar")],sort("StringChar"),attrs([])),prod([lit("\\\\")],sort("BackSlashChar"),attrs([])),prod([char-class(simple-charclass(present(conc(short("\\ "),conc(short("\\t"),conc(short("\\n"),short("\\r")))))))],layout,attrs([])),prod([char-class(simple-charclass(present(short("\\*"))))],sort("CommentChar"),attrs([])),prod([lit("/*"),iter-star(alt(char-class(comp(simple-charclass(present(short("\\*"))))),sort("CommentChar"))),lit("*/")],layout,attrs([])),prod([lit("//"),iter-star(char-class(comp(simple-charclass(present(conc(short("\\n"),short("\\r"))))))),alt(char-class(simple-charclass(present(conc(short("\\n"),short("\\r"))))),sort("EOF"))],layout,attrs([])),prod([],sort("EOF"),attrs([]))]),lexical-restrictions([follow([sort("CommentChar")],single(char-class(simple-charclass(present(short("\\/")))))),follow([sort("INT")],single(char-class(simple-charclass(present(range(short("0"),short("9"))))))),follow([sort("ID")],single(char-class(simple-charclass(present(conc(range(short("a"),short("z")),conc(range(short("A"),short("Z")),conc(range(short("0"),short("9")),short("\\_"))))))))),follow([sort("EOF")],single(char-class(comp(simple-charclass(absent))))),follow([sort("BackSlashChar")],single(char-class(simple-charclass(present(short("\\\""))))))])),context-free-restrictions([follow([opt(layout)],single(char-class(simple-charclass(present(conc(short("\\ "),conc(short("\\t"),conc(short("\\n"),short("\\r"))))))))),follow([opt(layout)],single(seq(simple-charclass(present(short("\\/"))),single(char-class(simple-charclass(present(short("\\/")))))))),follow([opt(layout)],single(seq(simple-charclass(present(short("\\/"))),single(char-class(simple-charclass(present(short("\\*"))))))))]))))]),module(unparameterized("EntityWithAspects"),[imports([module(unparameterized("Common"))])],[exports(conc-grammars(context-free-start-symbols([sort("Start")]),context-free-syntax([prod([lit("module"),sort("ID"),iter-star(sort("Import")),iter-star(sort("Definition"))],sort("Start"),attrs([term(cons("Module"))])),prod([lit("entity"),sort("ID"),lit("{"),iter-star(sort("Member")),lit("}")],sort("Definition"),attrs([term(cons("Entity"))])),prod([lit("import"),sort("ImportPart")],sort("Import"),attrs([term(cons("Import"))])),prod([sort("ID"),lit("."),lit("*")],sort("ImportPart"),attrs([term(cons("WildcardImport"))])),prod([sort("ID"),lit("."),sort("ID")],sort("ImportPart"),attrs([term(cons("EntityImport"))])),prod([lit("aspect"),sort("ID"),lit("{"),iter-star(sort("AspectMember")),lit("}")],sort("Definition"),attrs([term(cons("Aspect"))])),prod([lit("pointcut"),sort("ID"),lit("("),iter-star-sep(sort("Param"),lit(",")),lit(")"),lit(":"),iter-sep(sort("JoinPoint"),lit(","))],sort("AspectMember"),attrs([term(cons("Pointcut"))])),prod([lit("advice"),sort("ID"),sort("AdviceType"),lit("("),iter-star-sep(sort("Param"),lit(",")),lit(")"),lit(":"),sort("ID"),lit("("),iter-star-sep(sort("Exp"),lit(",")),lit(")"),sort("Stm")],sort("AspectMember"),attrs([term(cons("Advice"))])),prod([lit("before")],sort("AdviceType"),attrs([term(cons("Before"))])),prod([lit("after")],sort("AdviceType"),attrs([term(cons("After"))])),prod([lit("assigned"),lit("("),sort("Type"),lit(")")],sort("JoinPoint"),attrs([term(cons("Assigned"))])),prod([sort("ID"),lit(":"),sort("Type")],sort("Member"),attrs([term(cons("Property"))])),prod([sort("ID"),lit("("),iter-star-sep(sort("Param"),lit(",")),lit(")"),sort("Stm")],sort("Member"),attrs([term(cons("Function"))])),prod([sort("ID"),lit(":"),sort("Type")],sort("Param"),attrs([term(cons("Param"))])),prod([lit("var"),sort("ID"),lit(":"),sort("Type")],sort("Stm"),attrs([term(cons("VarDecl"))])),prod([lit("var"),sort("ID"),lit(":"),sort("Type"),lit("="),sort("Exp")],sort("Stm"),attrs([term(cons("VarDeclInit"))])),prod([sort("Exp"),lit("="),sort("Exp")],sort("Stm"),attrs([term(cons("Assign"))])),prod([lit("{"),iter-star(sort("Stm")),lit("}")],sort("Stm"),attrs([term(cons("Block"))])),prod([lit("print"),sort("Exp")],sort("Stm"),attrs([term(cons("Print"))])),prod([sort("ID"),lit("("),iter-star-sep(sort("Exp"),lit(",")),lit(")")],sort("Exp"),attrs([term(cons("Call"))])),prod([sort("ID")],sort("Exp"),attrs([term(cons("Var"))])),prod([sort("Exp"),lit("."),sort("ID")],sort("Exp"),attrs([term(cons("PropAccess"))])),prod([sort("STRING")],sort("Exp"),attrs([term(cons("StringLit"))])),prod([sort("INT")],sort("Exp"),attrs([term(cons("IntLit"))])),prod([sort("ID")],sort("Type"),attrs([term(cons("Type"))])),prod([lit("String")],sort("Type"),attrs([term(cons("StringType")),prefer])),prod([lit("Int")],sort("Type"),attrs([term(cons("IntType")),prefer]))])))])])