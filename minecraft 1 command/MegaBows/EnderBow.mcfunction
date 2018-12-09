scoreboard players set @a pearl 0 
scoreboard players set @a pearl 1 {SelectedItem:{tag:{Tags:["pearl"]}}}
execute @a[score_pearl_min=1] ~ ~1 ~ scoreboard players add @e[type=Arrow,r=1,c=1] pearl 1
execute @e[type=Arrow,score_pearl_min=1] ~ ~ ~ scoreboard players set @e[c=1,r=0,type=Arrow,score_pearl_min=1] inGround 1 {inGround:1b}
execute @e[type=Arrow,score_pearl_min=1] ~ ~ ~ particle portal ~ ~ ~ 0 0 0 0.1 30 force
execute @e[type=Arrow,score_inGround_min=1,score_pearl_min=1] ~ ~ ~ tp @p[score_pearl_min=1] @e[type=Arrow,score_inGround_min=1,score_pearl_min=1]
kill @e[type=Arrow,score_inGround_min=1,score_pearl_min=1]