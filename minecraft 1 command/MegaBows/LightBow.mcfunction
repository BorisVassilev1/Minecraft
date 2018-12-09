scoreboard players set @a light 0 
scoreboard players set @a light 1 {SelectedItem:{tag:{Tags:["light"]}}}
execute @a[score_light_min=1] ~ ~1 ~ scoreboard players add @e[type=Arrow,r=1,c=1] light 1
execute @e[type=Arrow,score_light_min=1] ~ ~ ~ scoreboard players set @e[c=1,r=0,type=Arrow,score_light_min=1] inGround 1 {inGround:1b}
execute @e[type=Arrow,score_light_min=1] ~ ~ ~ particle flame ~ ~ ~ 0 0 0 0.02 30 force
execute @e[type=Arrow,score_inGround_min=1,score_light_min=1] ~ ~ ~ setblock ~ ~ ~ torch
kill @e[type=Arrow,score_inGround_min=1,score_light_min=1]