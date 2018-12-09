scoreboard players tag @e[type=Item] add ender_pearl {Item:{id:"minecraft:ender_pearl",Damage:0s,Count:16b},OnGround:1b}
scoreboard players tag @e[type=Item] add diamond_block {Item:{id:"minecraft:diamond_block"},OnGround:1b}
scoreboard players tag @e[type=Item] add bow {Item:{id:"minecraft:bow"},OnGround:1b}
execute @e[tag=bow] ~ ~ ~ /execute @e[tag=diamond_block,r=1,c=1] ~ ~ ~ execute @e[tag=ender_pearl,r=1,c=1] ~ ~ ~ summon squid ~ ~ ~ {CustomName:"ender_bow",CustomNameVisible:1,Tags:["KillEnd"],NoAI:1b,DeathLootTable:"-",ArmorDropChances:[0.085F,0.085F,0.085F,2.0F],ActiveEffects:[{Id:14,Amplifier:0,Duration:200,ShowParticles:0b}]}
replaceitem entity @e[tag=KillEnd] slot.armor.head bow 1 0 {Tags:["pearl"],display:{Name:"Ender Bow",Lore:["Arrows work like ender pearls!"]},ench:[{id:10,lvl:1}],HideFlags:1}
execute @e[tag=KillEnd] ~ ~ ~ playsound minecraft:block.anvil.use block @p ~ ~ ~
execute @e[tag=KillEnd] ~ ~ ~ particle portal ~ ~0.5F ~ 0.5 0.5 0.5 0.1 100 force
execute @e[tag=KillEnd] ~ ~ ~ kill @e[tag=bow,r=2,c=1]
execute @e[tag=KillEnd] ~ ~ ~ kill @e[tag=diamond_block,r=2,c=1]
execute @e[tag=KillEnd] ~ ~ ~ kill @e[tag=ender_pearl,r=2,c=16]
execute @e[tag=KillEnd] ~ ~ ~ kill @e[tag=KillEnd,r=1,c=1]
