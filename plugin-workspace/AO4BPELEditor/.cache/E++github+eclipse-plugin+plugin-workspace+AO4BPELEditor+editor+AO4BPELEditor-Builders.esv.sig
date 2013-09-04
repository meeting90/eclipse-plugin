Module("AO4BPELEditor-Builders",Imports([Import("AO4BPELEditor-Builders.generated")]),[Builders("",[]),Builders("",[SemanticProvider("include/ao4bpeleditor.ctree"),SemanticProvider("include/ao4bpeleditor-java.jar"),SemanticObserver(Strategy("editor-analyze"),[MultiFile]),Builder(String("\"Show abstract syntax\""),Strategy("debug-generate-aterm"),[OpenEditor,RealTime,Meta,Source]),Builder(String("\"Show deffed syntax\""),Strategy("debug-generate-deffed"),[OpenEditor,RealTime,Meta,Source]),Builder(String("\"Show analyzed syntax\""),Strategy("debug-generate-analyzed"),[OpenEditor,RealTime,Meta,Source]),Builder(String("\"Show index entries for current file\""),Strategy("debug-index-show-current-file"),[OpenEditor,RealTime,Meta,Source]),Builder(String("\"Show index entries for all files\""),Strategy("debug-index-show-all-files"),[OpenEditor,RealTime,Meta,Source]),Builder(String("\"Clear index for current file\""),Strategy("debug-index-clear-current"),[Meta,Source]),Builder(String("\"Clear index\""),Strategy("debug-index-clear"),[Meta,Source]),Builder(String("\"Reload index\""),Strategy("debug-index-reload"),[Meta,Source]),OnSave(Strategy("editor-save"),None)])])