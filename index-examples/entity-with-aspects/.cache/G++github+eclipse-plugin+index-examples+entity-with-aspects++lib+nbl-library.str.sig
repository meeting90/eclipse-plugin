Module("lib/nbl-library",[Imports([(),(),(),(),()]),Signature([Constructors([OpDecl("Type",ConstType(SortNoArgs("DefDataKind"))),OpDecl("Import",ConstType(SortNoArgs("DefDataKind"))),OpDecl("Transitive",ConstType(SortNoArgs("ImportAnno"))),OpDecl("CurrentFile",ConstType(SortNoArgs("ImportAnno")))])]),Rules([SDefT("import-transitive",[],[],[]),SDefT("import-standard",[],[],[]),SDefT("import-values",[],[VarDec("namespace",ConstType(SortNoArgs("ATerm"))),VarDec("path",ConstType(SortNoArgs("ATerm")))],[]),SDefT("import-currentfile-values",[],[VarDec("namespace",ConstType(SortNoArgs("ATerm")))],[]),SDefT("adjust-index-import",[],[VarDec("namespace",ConstType(SortNoArgs("ATerm"))),VarDec("path",ConstType(SortNoArgs("ATerm")))],[]),SDefT("import-defs",[],[VarDec("namespace",ConstType(SortNoArgs("ATerm"))),VarDec("seen",ConstType(SortNoArgs("ATerm")))],[]),SDefT("import-defs",[],[VarDec("namespace",ConstType(SortNoArgs("ATerm"))),VarDec("seen",ConstType(SortNoArgs("ATerm")))],[])]),Rules([SDefT("index-diff-constructors",[],[],[]),SDefT("index-diff-compare",[],[],[])]),Rules([SDefT("constraint-error",[],[],[]),SDefT("constraint-error",[],[],[])]),Rules([SDefT("index-lookup-typed",[],[VarDec("type",ConstType(SortNoArgs("ATerm")))],[]),SDefT("index-lookup-all-typed",[],[VarDec("prefix",ConstType(SortNoArgs("ATerm"))),VarDec("type",ConstType(SortNoArgs("ATerm")))],[]),SDefT("index-compare-nametype-equal",[],[VarDec("name",ConstType(SortNoArgs("ATerm"))),VarDec("type",ConstType(SortNoArgs("ATerm")))],[]),SDefT("index-compare-nametype-substring",[],[VarDec("prefix",ConstType(SortNoArgs("ATerm"))),VarDec("type",ConstType(SortNoArgs("ATerm")))],[]),SDefT("nbl-get-type",[],[],[]),SDefT("nbl-type-eq",[],[VarDec("type",ConstType(SortNoArgs("ATerm")))],[])])])