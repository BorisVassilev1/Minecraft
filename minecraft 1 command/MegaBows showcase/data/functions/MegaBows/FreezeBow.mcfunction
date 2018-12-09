scoreboard players set @a MakeIce 0
scoreboard players set @a MakeIce 1 {SelectedItem:{tag:{Tags:["MakeIce"]}}}
execute @a[score_MakeIce_min=1] ~ ~1 ~ scoreboard players add @e[type=Arrow,r=1,c=1] MakeIce 1
execute @e[type=Arrow,score_MakeIce_min=1] ~ ~ ~ scoreboard players set @e[c=1,r=0,type=Arrow,score_MakeIce_min=1] inGround 1 {inGround:1b}
execute @e[type=Arrow,score_MakeIce_min=1] ~ ~ ~ particle snowshovel ~ ~ ~ 0 0 0 0.1 30 force
execute @e[type=Arrow,score_inGround_min=1,score_MakeIce_min=1] ~ ~ ~ /fill ~-5 ~-5 ~-5 ~5 ~5 ~5 packed_ice 0 replace sandstone
execute @e[type=Arrow,score_inGround_min=1,score_MakeIce_min=1] ~ ~ ~ /fill ~-5 ~-5 ~-5 ~5 ~5 ~5 packed_ice 0 replace ice
execute @e[type=Arrow,score_inGround_min=1,score_MakeIce_min=1] ~ ~ ~ /fill ~-5 ~-5 ~-5 ~5 ~5 ~5 obsidian 0 replace lava 0
execute @e[type=Arrow,score_inGround_min=1,score_MakeIce_min=1] ~ ~ ~ /fill ~-5 ~-5 ~-5 ~5 ~5 ~5 packed_ice 0 replace cobblestone
execute @e[type=Arrow,score_inGround_min=1,score_MakeIce_min=1] ~ ~ ~ /fill ~-5 ~-5 ~-5 ~5 ~5 ~5 packed_ice 0 replace dirt
execute @e[type=Arrow,score_inGround_min=1,score_MakeIce_min=1] ~ ~ ~ /fill ~-5 ~-5 ~-5 ~5 ~5 ~5 packed_ice 0 replace grass
execute @e[type=Arrow,score_inGround_min=1,score_MakeIce_min=1] ~ ~ ~ /fill ~-5 ~-5 ~-5 ~5 ~5 ~5 obsidian 0 replace flowing_lava 0
execute @e[type=Arrow,score_inGround_min=1,score_MakeIce_min=1] ~ ~ ~ /fill ~-5 ~-5 ~-5 ~5 ~5 ~5 ice 0 replace water
execute @e[type=Arrow,score_inGround_min=1,score_MakeIce_min=1] ~ ~ ~ /fill ~-5 ~-5 ~-5 ~5 ~5 ~5 packed_ice 0 replace log
execute @e[type=Arrow,score_inGround_min=1,score_MakeIce_min=1] ~ ~ ~ /fill ~-5 ~-5 ~-5 ~5 ~5 ~5 packed_ice 0 replace leaves
execute @e[type=Arrow,score_inGround_min=1,score_MakeIce_min=1] ~ ~ ~ /fill ~-5 ~-5 ~-5 ~5 ~5 ~5 ice 0 replace flowing_water
execute @e[type=Arrow,score_inGround_min=1,score_MakeIce_min=1] ~ ~ ~ /fill ~-5 ~-5 ~-5 ~5 ~5 ~5 cobblestone 0 replace flowing_lava
kill @e[type=Arrow,score_inGround_min=1,score_MakeIce_min=1]