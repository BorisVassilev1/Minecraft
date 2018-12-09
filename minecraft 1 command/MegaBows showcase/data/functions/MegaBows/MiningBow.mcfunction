scoreboard players set @a mine 0 
scoreboard players set @a mine 1 {SelectedItem:{tag:{Tags:["mine"]}}}
execute @a[score_mine_min=1] ~ ~1 ~ scoreboard players add @e[type=Arrow,r=1,c=1] mine 1
execute @e[type=Arrow,score_mine_min=1] ~ ~ ~ scoreboard players set @e[c=1,r=0,type=Arrow,score_mine_min=1] inGround 1 {inGround:1b}
execute @e[type=Arrow,score_mine_min=1] ~ ~ ~ particle iconcrack ~ ~1 ~ 0.1 0.1 0.1 0.05 10 normal @a 1 0
execute @e[type=Arrow,score_inGround_min=1,score_mine_min=1] ~ ~ ~ fill ~-5 ~ ~-5 ~5 ~5 ~5 air 0 replace stone
execute @e[type=Arrow,score_inGround_min=1,score_mine_min=1] ~ ~ ~ fill ~-5 ~ ~-5 ~5 ~5 ~5 air 0 replace sandstone 0
execute @e[type=Arrow,score_inGround_min=1,score_mine_min=1] ~ ~ ~ fill ~-5 ~ ~-5 ~5 ~5 ~5 air 0 replace sand
execute @e[type=Arrow,score_inGround_min=1,score_mine_min=1] ~ ~ ~ fill ~-5 ~ ~-5 ~5 ~5 ~5 air 0 replace gravel
execute @e[type=Arrow,score_inGround_min=1,score_mine_min=1] ~ ~ ~ fill ~-5 ~ ~-5 ~5 ~5 ~5 air 0 replace mine
execute @e[type=Arrow,score_inGround_min=1,score_mine_min=1] ~ ~ ~ fill ~-5 ~ ~-5 ~5 ~5 ~5 air 0 replace flowing_lava
execute @e[type=Arrow,score_inGround_min=1,score_mine_min=1] ~ ~ ~ fill ~-5 ~ ~-5 ~5 ~5 ~5 air 0 replace water
execute @e[type=Arrow,score_inGround_min=1,score_mine_min=1] ~ ~ ~ fill ~-5 ~ ~-5 ~5 ~5 ~5 air 0 replace flowing_water
execute @e[type=Arrow,score_inGround_min=1,score_mine_min=1] ~ ~ ~ fill ~-5 ~ ~-5 ~5 ~5 ~5 air 0 replace cobweb
execute @e[type=Arrow,score_inGround_min=1,score_mine_min=1] ~ ~ ~ fill ~-5 ~ ~-5 ~5 ~5 ~5 air 0 replace netherrack
kill @e[type=Arrow,score_inGround_min=1,score_mine_min=1]