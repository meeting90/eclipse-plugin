definition([module(unparameterized("Common"),[],[exports(conc-grammars(conc-grammars(conc-grammars(conc-grammars(conc-grammars(sorts([sort("WATER"),sort("WATERTOKEN"),sort("WATERTOKENSTART"),sort("WATERTOKENSEPARATOR"),sort("WATERTOKENSTAR")]),lexical-syntax([prod([char-class(simple-charclass(present(conc(range(short("A"),short("Z")),conc(range(short("a"),short("z")),conc(range(short("0"),short("9")),short("\\_")))))))],sort("WATERTOKENSTART"),attrs([term(recover),avoid])),prod([sort("WATERTOKENSTART"),iter-star(char-class(simple-charclass(present(conc(range(short("A"),short("Z")),conc(range(short("a"),short("z")),conc(range(short("0"),short("9")),short("\\_"))))))))],sort("WATERTOKEN"),attrs([])),prod([char-class(comp(simple-charclass(present(conc(range(short("A"),short("Z")),conc(range(short("a"),short("z")),conc(range(short("0"),short("9")),conc(short("\\_"),conc(short("\\ "),conc(short("\\t"),conc(numeric("\\12"),conc(short("\\r"),conc(short("\\n"),short("\\*"))))))))))))))],sort("WATERTOKENSEPARATOR"),attrs([term(recover),avoid])),prod([lit("*")],sort("WATERTOKENSTAR"),attrs([term(recover),avoid])),prod([sort("WATERTOKEN")],sort("WATER"),attrs([])),prod([sort("WATERTOKENSEPARATOR")],sort("WATER"),attrs([])),prod([sort("WATERTOKENSTAR")],sort("WATER"),attrs([])),prod([],sort("WATEREOF"),attrs([])),prod([lit("completion123")],sort("COMPLETIONPREFIX"),attrs([term(completion)])),prod([lit("|#WATERTOKENSTAR|")],sort("WATERTOKENSTAR"),attrs([term(completion)])),prod([lit("|#STRING|")],sort("STRING"),attrs([term(completion)])),prod([lit("|#StringChar|")],sort("StringChar"),attrs([term(completion)])),prod([lit("|#BackSlashChar|")],sort("BackSlashChar"),attrs([term(completion)])),prod([lit("|#Exp|")],sort("Exp"),attrs([term(completion)])),prod([lit("|#Stm|")],sort("Stm"),attrs([term(completion)]))])),lexical-restrictions([follow([sort("WATERTOKEN")],single(char-class(simple-charclass(present(conc(range(short("A"),short("Z")),conc(range(short("a"),short("z")),conc(range(short("0"),short("9")),short("\\_"))))))))),follow([sort("WATERTOKENSTAR")],single(char-class(simple-charclass(present(short("\\/"))))))])),context-free-syntax([prod([sort("WATER")],layout,attrs([term(cons("WATER"))]))])),conc-grammars(conc-grammars(conc-grammars(sorts([sort("WATEREOF")]),lexical-restrictions([follow([sort("WATEREOF")],single(char-class(comp(simple-charclass(absent)))))])),lexical-syntax([prod([lit("\\\"")],sort("INSERTOPENQUOTE"),attrs([term(recover)])),prod([sort("INSERTOPENQUOTE"),iter-star(sort("StringChar")),lit("\\n")],sort("STRING"),attrs([term(cons("INSERTEND"))])),prod([sort("INSERTOPENQUOTE"),iter-star(sort("StringChar")),sort("WATEREOF")],sort("STRING"),attrs([term(cons("INSERTEND"))])),prod([lit("/*")],sort("INSERTSTART"),attrs([term(recover)])),prod([sort("INSERTSTART"),iter-star(alt(char-class(comp(simple-charclass(present(short("\\*"))))),sort("CommentChar"))),sort("WATEREOF")],layout,attrs([term(cons("INSERTEND"))])),prod([],lit(")"),attrs([term(recover),term(cons("INSERTION"))]))])),syntax([]))),conc-grammars(conc-grammars(lexical-syntax([prod([char-class(simple-charclass(present(conc(range(short("a"),short("z")),range(short("A"),short("Z")))))),iter-star(char-class(simple-charclass(present(conc(range(short("a"),short("z")),conc(range(short("A"),short("Z")),conc(range(short("0"),short("9")),short("\\_"))))))))],sort("ID"),attrs([])),prod([opt(lit("-")),iter(char-class(simple-charclass(present(range(short("0"),short("9"))))))],sort("INT"),attrs([])),prod([lit("\\\""),iter-star(sort("StringChar")),lit("\\\"")],sort("STRING"),attrs([])),prod([char-class(comp(simple-charclass(present(conc(short("\\\""),short("\\n"))))))],sort("StringChar"),attrs([])),prod([lit("\\\\\\\"")],sort("StringChar"),attrs([])),prod([sort("BackSlashChar")],sort("StringChar"),attrs([])),prod([lit("\\\\")],sort("BackSlashChar"),attrs([])),prod([char-class(simple-charclass(present(conc(short("\\ "),conc(short("\\t"),conc(short("\\n"),short("\\r")))))))],layout,attrs([])),prod([char-class(simple-charclass(present(short("\\*"))))],sort("CommentChar"),attrs([])),prod([lit("/*"),iter-star(alt(char-class(comp(simple-charclass(present(short("\\*"))))),sort("CommentChar"))),lit("*/")],layout,attrs([])),prod([lit("//"),iter-star(char-class(comp(simple-charclass(present(conc(short("\\n"),short("\\r"))))))),alt(char-class(simple-charclass(present(conc(short("\\n"),short("\\r"))))),sort("EOF"))],layout,attrs([])),prod([],sort("EOF"),attrs([]))]),lexical-restrictions([follow([sort("CommentChar")],single(char-class(simple-charclass(present(short("\\/")))))),follow([sort("INT")],single(char-class(simple-charclass(present(range(short("0"),short("9"))))))),follow([sort("ID")],single(char-class(simple-charclass(present(conc(range(short("a"),short("z")),conc(range(short("A"),short("Z")),conc(range(short("0"),short("9")),short("\\_"))))))))),follow([sort("EOF")],single(char-class(comp(simple-charclass(absent))))),follow([sort("BackSlashChar")],single(char-class(simple-charclass(present(short("\\\""))))))])),context-free-restrictions([follow([opt(layout)],single(char-class(simple-charclass(present(conc(short("\\ "),conc(short("\\t"),conc(short("\\n"),short("\\r"))))))))),follow([opt(layout)],single(seq(simple-charclass(present(short("\\/"))),single(char-class(simple-charclass(present(short("\\/")))))))),follow([opt(layout)],single(seq(simple-charclass(present(short("\\/"))),single(char-class(simple-charclass(present(short("\\*"))))))))]))))]),module(unparameterized("Calculang"),[imports([module(unparameterized("Common"))])],[exports(conc-grammars(conc-grammars(conc-grammars(context-free-start-symbols([sort("Start")]),context-free-syntax([prod([sort("Exp")],sort("Start"),attrs([term(cons("Expr"))])),prod([sort("INT")],sort("Exp"),attrs([term(cons("Int"))])),prod([sort("Exp"),lit("*"),sort("Exp")],sort("Exp"),attrs([term(cons("Mul")),assoc(left)])),prod([sort("Exp"),lit("/"),sort("Exp")],sort("Exp"),attrs([term(cons("Div")),assoc(left)])),prod([sort("Exp"),lit("+"),sort("Exp")],sort("Exp"),attrs([term(cons("Plus")),assoc(left)])),prod([sort("Exp"),lit("-"),sort("Exp")],sort("Exp"),attrs([term(cons("Minus")),assoc(left)])),prod([lit("("),sort("Exp"),lit(")")],sort("Exp"),attrs([bracket]))])),context-free-priorities([chain([assoc-group(left,[prod([sort("Exp"),lit("*"),sort("Exp")],sort("Exp"),attrs([])),prod([sort("Exp"),lit("/"),sort("Exp")],sort("Exp"),attrs([]))]),assoc-group(left,[prod([sort("Exp"),lit("+"),sort("Exp")],sort("Exp"),attrs([])),prod([sort("Exp"),lit("-"),sort("Exp")],sort("Exp"),attrs([]))])])])),context-free-syntax([prod([iter-star(sort("Stm"))],sort("Start"),attrs([term(cons("Stm"))])),prod([sort("ID"),lit("="),sort("Exp")],sort("Stm"),attrs([term(cons("Assign"))])),prod([sort("ID")],sort("Exp"),attrs([term(cons("Var"))]))])))])])