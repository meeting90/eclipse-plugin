Module("lib/editor-common.generated",[Imports([(),(),()]),Strategies([SDefT("parse-file",[],[],[]),SDefT("parse-calculang-file",[],[],[]),SDefT("parse-string",[],[],[]),SDefT("parse-calculang-string",[],[],[]),SDefT("parse-stream",[],[],[]),SDefT("parse-calculang-stream",[],[],[]),SDefT("pp-calculang-string",[],[],[]),SDefT("language",[],[],[])]),Strategies([SDefT("open-import",[VarDec("resolve-path",ConstType(SortNoArgs("ATerm"))),VarDec("parse-file",ConstType(SortNoArgs("ATerm"))),VarDec("record-declarations",ConstType(SortNoArgs("ATerm")))],[],[RDecT("IsImported",[],[]),RDecT("CurrentFile",[],[])]),SDefT("open-wildcard-import",[VarDec("resolve-path",ConstType(SortNoArgs("ATerm"))),VarDec("parse-file",ConstType(SortNoArgs("ATerm"))),VarDec("record-declarations",ConstType(SortNoArgs("ATerm"))),VarDec("is-source-file",ConstType(SortNoArgs("ATerm")))],[],[]),SDefT("import-cache-path",[],[],[]),SDefT("project-path",[],[],[]),SDefT("plugin-path",[],[],[]),SDefT("candidate-sorts",[],[],[]),SDefT("is-newer",[],[],[])]),Strategies([SDefT("editor-init",[],[],[]),SDefT("refresh-workspace-file",[],[],[]),SDefT("string-starts-with-capital",[],[],[])]),Strategies([SDefT("origin-term",[],[],[]),SDefT("origin-text",[],[],[]),SDefT("origin-offset",[],[],[]),SDefT("origin-location",[],[],[]),SDefT("origin-line",[],[],[]),SDefT("origin-column",[],[],[]),SDefT("origin-file",[],[],[]),SDefT("origin-strip",[],[],[]),SDefT("origin-equal",[],[VarDec("t",ConstType(SortNoArgs("ATerm")))],[]),SDefT("origin-language-description",[],[],[]),SDefT("origin-language",[],[],[]),SDefT("origin-surrounding-comments",[],[],[]),SDefT("origin-documentation-comment",[],[],[]),SDefT("documentation-comment-chars",[],[],[]),SDefT("origin-track-forced",[VarDec("s",ConstType(SortNoArgs("ATerm")))],[],[]),SDefT("origin-relative-path",[],[],[])]),Strategies([SDefT("desugar-position",[VarDec("desugar",ConstType(SortNoArgs("ATerm")))],[VarDec("ast",ConstType(SortNoArgs("ATerm")))],[]),SDefT("at-position",[VarDec("s",ConstType(SortNoArgs("ATerm")))],[VarDec("position",ConstType(SortNoArgs("ATerm")))],[]),SDefT("at-position",[VarDec("s",ConstType(SortNoArgs("ATerm")))],[VarDec("position",ConstType(SortNoArgs("ATerm")))],[]),SDefT("position-of-term",[VarDec("is-term",ConstType(SortNoArgs("ATerm")))],[],[]),SDefT("position-of-term",[VarDec("is-term",ConstType(SortNoArgs("ATerm")))],[],[]),SDefT("position-of-term",[VarDec("is-term",ConstType(SortNoArgs("ATerm")))],[VarDec("start-index",ConstType(SortNoArgs("ATerm")))],[]),SDefT("term-at-position",[],[VarDec("position",ConstType(SortNoArgs("ATerm")))],[]),SDefT("parent-at-position",[],[VarDec("position",ConstType(SortNoArgs("ATerm")))],[]),SDefT("parent-at-position",[],[VarDec("position",ConstType(SortNoArgs("ATerm")))],[]),SDefT("subterm-at",[],[VarDec("index",ConstType(SortNoArgs("ATerm")))],[])]),Signature([Constructors([OpDecl("COMPLETION",FunType([ConstType(SortNoArgs("String"))],ConstType(SortNoArgs("Term")))),OpDecl("NOCONTEXT",FunType([ConstType(SortNoArgs("Term"))],ConstType(SortNoArgs("Term")))),OpDecl("MARKER",ConstType(SortNoArgs("Term"))),OpDecl("True",ConstType(SortNoArgs("Term"))),OpDecl("Module",FunType([ConstType(SortNoArgs("ID")),ConstType(Sort("List",[SortNoArgs("Entity")]))],ConstType(SortNoArgs("Module")))),OpDecl("Entity",FunType([ConstType(SortNoArgs("ID")),ConstType(Sort("List",[SortNoArgs("Property")]))],ConstType(SortNoArgs("Entity")))),OpDecl("Property",FunType([ConstType(SortNoArgs("ID")),ConstType(SortNoArgs("Type"))],ConstType(SortNoArgs("Property")))),OpDecl("Type",FunType([ConstType(SortNoArgs("ID"))],ConstType(SortNoArgs("Type")))),OpDecl("Type",ConstType(SortNoArgs("Namespace"))),OpDecl("Property",ConstType(SortNoArgs("Namespace")))])]),Strategies([SDefT("set-markers",[],[VarDec("ast",ConstType(SortNoArgs("ATerm")))],[]),SDefT("queue-analysis",[],[],[]),SDefT("analysis-count",[],[],[]),SDefT("set-total-work-units",[],[],[]),SDefT("complete-work-unit",[],[],[]),SDefT("queue-strategy",[],[VarDec("s",ConstType(SortNoArgs("ATerm"))),VarDec("description",ConstType(SortNoArgs("ATerm")))],[]),SDefT("set-analysis-backgrounded",[],[],[])])])