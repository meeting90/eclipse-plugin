[
   Module                   -- KW["module"] _1 _2 _3,
   Module.2:iter-star       -- _1,
   Module.3:iter-star       -- _1,
   Entity                   -- KW["entity"] _1 KW["{"] _2 KW["}"],
   Entity.2:iter-star       -- _1,
   Import                   -- KW["import"] _1,
   WildcardImport           -- _1 KW["."] KW["*"],
   EntityImport             -- _1 KW["."] _2,
   Aspect                   -- KW["aspect"] _1 KW["{"] _2 KW["}"],
   Aspect.2:iter-star       -- _1,
   Pointcut                 -- KW["pointcut"] _1 KW["("] _2 KW[")"] KW[":"] _3,
   Pointcut.2:iter-star-sep -- _1 KW[","],
   Pointcut.3:iter-sep      -- _1 KW[","],
   Advice                   -- KW["advice"] _1 _2 KW["("] _3 KW[")"] KW[":"] _4 KW["("] _5 KW[")"] _6,
   Advice.3:iter-star-sep   -- _1 KW[","],
   Advice.5:iter-star-sep   -- _1 KW[","],
   Before                   -- KW["before"],
   After                    -- KW["after"],
   Assigned                 -- KW["assigned"] KW["("] _1 KW[")"],
   Property                 -- _1 KW[":"] _2,
   Function                 -- _1 KW["("] _2 KW[")"] _3,
   Function.2:iter-star-sep -- _1 KW[","],
   Param                    -- _1 KW[":"] _2,
   VarDecl                  -- KW["var"] _1 KW[":"] _2,
   VarDeclInit              -- KW["var"] _1 KW[":"] _2 KW["="] _3,
   Assign                   -- _1 KW["="] _2,
   Block                    -- V  [V vs=2 [KW["{"] _1] KW["}"]],
   Block.1:iter-star        -- _1,
   Print                    -- KW["print"] _1,
   Call                     -- _1 KW["("] _2 KW[")"],
   Call.2:iter-star-sep     -- _1 KW[","],
   Var                      -- _1,
   PropAccess               -- _1 KW["."] _2,
   StringLit                -- _1,
   IntLit                   -- _1,
   Type                     -- _1,
   StringType               -- KW["String"],
   IntType                  -- KW["Int"]
]