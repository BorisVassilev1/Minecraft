scoreboard players tag @e[type=Item] add lava_bucket {Item:{id:"minecraft:lava_bucket",Damage:0s,Count:1b},OnGround:1b}
scoreboard players tag @e[type=Item] add diamond_block {Item:{id:"minecraft:diamond_block"},OnGround:1b}
scoreboard players tag @e[type=Item] add bow {Item:{id:"minecraft:bow"},OnGround:1b}
execute @e[tag=bow] ~ ~ ~ /execute @e[tag=diamond_block,r=1,c=1] ~ ~ ~ execute @e[tag=lava_bucket,r=1,c=1] ~ ~ ~ summon squid ~ ~ ~ {CustomName:"lava_bow",CustomNameVisible:1,Tags:["KillLava"],NoAI:1b,DeathLootTable:"-",ArmorDropChances:[0.085F,0.085F,0.085F,2.0F],ActiveEffects:[{Id:14,Amplifier:0,Duration:200,ShowParticles:0b}]}
replaceitem entity @e[tag=KillLava] slot.armor.head bow 1 0 {Tags:["lava"],display:{Name:"Lava bow",Lore:["Arrows place a lava on impact!"]},ench:[{id:10,lvl:1}],HideFlags:1}
execute @e[tag=KillLava] ~ ~ ~ playsound minecraft:block.anvil.use block @p ~ ~ ~
execute @e[tag=KillLava] ~ ~ ~ particle flame ~ ~0.5F ~ 1 0 1 0.1 100 force
execute @e[tag=KillLava] ~ ~ ~ kill @e[tag=bow,r=1,c=1]
execute @e[tag=KillLava] ~ ~ ~ kill @e[tag=diamond_block,r=1,c=1]
execute @e[tag=KillLava] ~ ~ ~ kill @e[tag=lava_bucket,r=1,c=1]
execute @e[tag=KillLava] ~ ~ ~ kill @e[tag=KillLava,r=1,c=1]
