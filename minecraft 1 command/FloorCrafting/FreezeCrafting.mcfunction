scoreboard players tag @e[type=Item] add packed_ice {Item:{id:"minecraft:packed_ice",Damage:0s,Count:64b},OnGround:1b}
scoreboard players tag @e[type=Item] add diamond_block {Item:{id:"minecraft:diamond_block"},OnGround:1b}
scoreboard players tag @e[type=Item] add bow {Item:{id:"minecraft:bow"},OnGround:1b}
execute @e[tag=bow] ~ ~ ~ /execute @e[tag=diamond_block,r=1,c=1] ~ ~ ~ execute @e[tag=packed_ice,r=1,c=1] ~ ~ ~ summon squid ~ ~ ~ {CustomName:"packed_ice_bow",CustomNameVisible:1,Tags:["KillIce"],NoAI:1b,DeathLootTable:"-",ArmorDropChances:[0.085F,0.085F,0.085F,2.0F],ActiveEffects:[{Id:14,Amplifier:0,Duration:200,ShowParticles:0b}]}
replaceitem entity @e[tag=KillIce] slot.armor.head bow 1 0 {Tags:["MakeIce"],display:{Name:"Winter bow",Lore:["Arrows freeze everything on impact!"]},ench:[{id:10,lvl:1}],HideFlags:1}
execute @e[tag=KillIce] ~ ~ ~ playsound minecraft:block.anvil.use block @p ~ ~ ~
execute @e[tag=KillIce] ~ ~ ~ particle snowshovel ~ ~0.5F ~ 1 0 1 0.1 100 force
execute @e[tag=KillIce] ~ ~ ~ kill @e[tag=bow,r=2,c=1]
execute @e[tag=KillIce] ~ ~ ~ kill @e[tag=diamond_block,r=2,c=1]
execute @e[tag=KillIce] ~ ~ ~ kill @e[tag=packed_ice,r=2,c=64]
execute @e[tag=KillIce] ~ ~ ~ kill @e[tag=KillIce,r=1,c=1]
