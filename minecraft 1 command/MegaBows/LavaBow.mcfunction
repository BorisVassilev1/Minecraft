scoreboard players set @a lava 0 
scoreboard players set @a lava 1 {SelectedItem:{tag:{Tags:["lava"]}}}
execute @a[score_lava_min=1] ~ ~1 ~ scoreboard players add @e[type=Arrow,r=1,c=1] lava 1
execute @e[type=Arrow,score_lava_min=1] ~ ~ ~ scoreboard players set @e[c=1,r=0,type=Arrow,score_lava_min=1] inGround 1 {inGround:1b}
execute @e[type=Arrow,score_lava_min=1] ~ ~ ~ particle lava ~ ~ ~ 0 0 0 0.1 30 force
execute @e[type=Arrow,score_inGround_min=1,score_lava_min=1] ~ ~ ~ setblock ~ ~ ~ flowing_lava
kill @e[type=Arrow,score_inGround_min=1,score_lava_min=1]