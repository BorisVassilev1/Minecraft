scoreboard players tag @e[type=Item] add diamond_pickaxe {Item:{id:"minecraft:diamond_pickaxe",Damage:0s,Count:1b},OnGround:1b}
scoreboard players tag @e[type=Item] add diamond_block {Item:{id:"minecraft:diamond_block"},OnGround:1b}
scoreboard players tag @e[type=Item] add bow {Item:{id:"minecraft:bow"},OnGround:1b}
execute @e[tag=bow] ~ ~ ~ execute @e[tag=diamond_block,r=1,c=1] ~ ~ ~ execute @e[tag=diamond_pickaxe,r=1,c=1] ~ ~ ~ summon squid ~ ~ ~ {CustomName:"lava_bow",CustomNameVisible:1,Tags:["KillMine"],NoAI:1b,DeathLootTable:"-",ArmorDropChances:[0.085F,0.085F,0.085F,2.0F],ActiveEffects:[{Id:14,Amplifier:0,Duration:200,ShowParticles:0b}]}
replaceitem entity @e[tag=KillMine] slot.armor.head bow 1 0 {Tags:["mine"],display:{Name:"Mining Bow",Lore:["Arrows mine blocks instead of you!"]},ench:[{id:10,lvl:1}],HideFlags:1}
execute @e[tag=KillMine] ~ ~ ~ playsound minecraft:block.anvil.use block @p ~ ~ ~
execute @e[tag=KillMine] ~ ~ ~ particle iconcrack ~ ~1 ~ 0.7 0.0 0.7 0.05 100 normal @a 1 0
execute @e[tag=KillMine] ~ ~ ~ kill @e[tag=bow,r=1,c=1]
execute @e[tag=KillMine] ~ ~ ~ kill @e[tag=diamond_block,r=1,c=1]
execute @e[tag=KillMine] ~ ~ ~ kill @e[tag=diamond_pickaxe,r=1,c=1]
execute @e[tag=KillMine] ~ ~ ~ kill @e[tag=KillMine,r=1,c=1]
