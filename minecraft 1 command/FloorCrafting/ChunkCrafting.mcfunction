scoreboard players tag @e[type=Item] add skull {Item:{id:"minecraft:skull",Damage:5s,Count:1b},OnGround:1b}
scoreboard players tag @e[type=Item] add diamond_block {Item:{id:"minecraft:diamond_block"},OnGround:1b}
scoreboard players tag @e[type=Item] add bow {Item:{id:"minecraft:bow"},OnGround:1b}
execute @e[tag=bow] ~ ~ ~ execute @e[tag=diamond_block,r=1,c=1] ~ ~ ~ execute @e[tag=skull,r=1,c=1] ~ ~ ~ summon squid ~ ~ ~ {CustomName:"lava_bow",CustomNameVisible:1,Tags:["KillChunk"],NoAI:1b,DeathLootTable:"-",ArmorDropChances:[0.085F,0.085F,0.085F,2.0F],ActiveEffects:[{Id:14,Amplifier:0,Duration:200,ShowParticles:0b}]}
replaceitem entity @e[tag=KillChunk] slot.armor.head bow 1 0 {Tags:["teleport"],display:{Name:"Chunk bow",Lore:["Arrows teleport blocks on impact!"]},ench:[{id:10,lvl:1}],HideFlags:1}
execute @e[tag=KillChunk] ~ ~ ~ playsound minecraft:block.anvil.use block @p ~ ~ ~
execute @e[tag=KillChunk] ~ ~ ~ particle dragonbreath ~ ~0.5F ~ 1 0 1 0.1 100 force
execute @e[tag=KillChunk] ~ ~ ~ kill @e[tag=bow,r=1,c=1]
execute @e[tag=KillChunk] ~ ~ ~ kill @e[tag=diamond_block,r=1,c=1]
execute @e[tag=KillChunk] ~ ~ ~ kill @e[tag=skull,r=1,c=1]
execute @e[tag=KillChunk] ~ ~ ~ kill @e[tag=KillChunk,r=1,c=1]
