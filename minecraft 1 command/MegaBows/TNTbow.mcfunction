scoreboard players set @a explode 0 
scoreboard players set @a explode 1 {SelectedItem:{tag:{Tags:["explode"]}}}
execute @a[score_explode_min=1] ~ ~1 ~ scoreboard players add @e[type=Arrow,r=1,c=1] explode 1
execute @e[type=Arrow,score_explode_min=1] ~ ~ ~ scoreboard players set @e[c=1,r=0,type=Arrow,score_explode_min=1] inGround 1 {inGround:1b}
execute @e[type=Arrow,score_explode_min=1] ~ ~ ~ particle smoke ~ ~ ~ 0 0 0 0.02 30 force
execute @e[type=Arrow,score_inGround_min=1,score_explode_min=1] ~ ~ ~ summon creeper ~ ~1 ~ {Fuse:0,ExplosionRadius:5b}
kill @e[type=Arrow,score_inGround_min=1,score_explode_min=1]