scoreboard players set @a teleport 0 
scoreboard players set @a teleport 1 {SelectedItem:{tag:{Tags:["teleport"]}}}
execute @a[score_teleport_min=1] ~ ~1 ~ scoreboard players add @e[type=Arrow,r=1,c=1] teleport 1
execute @e[type=Arrow,score_teleport_min=1] ~ ~ ~ scoreboard players set @e[c=1,r=0,type=Arrow,score_teleport_min=1] inGround 1 {inGround:1b}
execute @e[type=Arrow,score_teleport_min=1] ~ ~ ~ particle portal ~ ~ ~ 0 0 0 0.1 30 force
execute @e[type=Arrow,score_inGround_min=1,score_teleport_min=1] ~ ~ ~ execute @e[r=5] ~ ~ ~ tp @e[r=0,type=!Arrow] ~ ~20 ~
execute @e[type=Arrow,score_inGround_min=1,score_teleport_min=1] ~ ~ ~ clone ~-5 ~-5 ~-5 ~5 ~5 ~5 ~-5 ~20 ~-5
execute @e[type=Arrow,score_inGround_min=1,score_teleport_min=1] ~ ~ ~ fill ~-5 ~-5 ~-5 ~5 ~5 ~5 air
kill @e[type=Arrow,score_inGround_min=1,score_teleport_min=1]