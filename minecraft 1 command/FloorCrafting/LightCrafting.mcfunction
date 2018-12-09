scoreboard players tag @e[type=Item] add torch {Item:{id:"minecraft:torch",Damage:0s,Count:64b},OnGround:1b}
scoreboard players tag @e[type=Item] add diamond_block {Item:{id:"minecraft:diamond_block"},OnGround:1b}
scoreboard players tag @e[type=Item] add bow {Item:{id:"minecraft:bow"},OnGround:1b}
execute @e[tag=bow] ~ ~ ~ /execute @e[tag=diamond_block,r=1,c=1] ~ ~ ~ execute @e[tag=torch,r=1,c=1] ~ ~ ~ summon squid ~ ~ ~ {CustomName:"torch_bow",CustomNameVisible:1,Tags:["KillLight"],NoAI:1b,DeathLootTable:"-",ArmorDropChances:[0.085F,0.085F,0.085F,2.0F],ActiveEffects:[{Id:14,Amplifier:0,Duration:200,ShowParticles:0b}]}
replaceitem entity @e[tag=KillLight] slot.armor.head bow 1 0 {Tags:["light"],display:{Name:"Light bow",Lore:["Arrows place a torch on impact!"]},ench:[{id:10,lvl:1}],HideFlags:1}
execute @e[tag=KillLight] ~ ~ ~ playsound minecraft:block.anvil.use block @p ~ ~ ~
execute @e[tag=KillLight] ~ ~ ~ particle flame ~ ~0.5F ~ 1 0 1 0.1 100 force
execute @e[tag=KillLight] ~ ~ ~ kill @e[tag=bow,r=2,c=1]
execute @e[tag=KillLight] ~ ~ ~ kill @e[tag=diamond_block,r=2,c=1]
execute @e[tag=KillLight] ~ ~ ~ kill @e[tag=torch,r=2,c=64]
execute @e[tag=KillLight] ~ ~ ~ kill @e[tag=KillLight,r=1,c=1]
