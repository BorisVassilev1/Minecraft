package org.CDnoMlqko.FirstTestingPlugin.commands;

import org.CDnoMlqko.FirstTestingPlugin.Main;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.craftbukkit.v1_12_R1.entity.CraftPlayer;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

import net.minecraft.server.v1_12_R1.EnumParticle;
import net.minecraft.server.v1_12_R1.PacketPlayOutWorldParticles;

import org.bukkit.command.CommandExecutor;

public class ParticleSphereCommand implements CommandExecutor {
	@SuppressWarnings("unused")
	private Main plugin;

	public ParticleSphereCommand(Main plugin) {
		this.plugin = plugin;
		plugin.getCommand("sphere").setExecutor(this);
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(sender instanceof Player)
		{
			float duration = Float.parseFloat(args[3]);
			try
			{
				EnumParticle.valueOf(args[2]);
			}
			catch(Exception e)
			{
				sender.sendMessage("the particle effect you have selected is not validor not supported");
				return false;
			}
			new BukkitRunnable() {
				float time = 0;
				@Override
				public void run() {
					time += 0.05;
					int detail = Integer.parseInt(args[1]);
					float r = Float.parseFloat(args[0]);
					Location loc = ((Player)sender).getLocation();
					String name = args[2];
					for (float phi = 0f; phi < Math.PI * 2; phi += Math.PI / detail) {
						for (float theta = 0f; theta < Math.PI; theta += Math.PI / detail) {
							float x = (float) (r * Math.sin(theta) * Math.cos(phi));
							float y = (float) (r * Math.cos(theta)) + 1;
							float z = (float) (r * Math.sin(theta) * Math.sin(phi));
							createParticle(name.toUpperCase(),loc, x, y, z);
						}
					}
					
					if(time > duration)
					{
						this.cancel();
					}
				}
			}.runTaskTimerAsynchronously(plugin, 0, 0);
			
			
			return true;
		}
		return false;
	}

	public void createParticle(String name, Location loc, float x, float y, float z) {
		PacketPlayOutWorldParticles packet = new PacketPlayOutWorldParticles(EnumParticle.valueOf(name), true,
				(float) loc.getX() + x, (float) loc.getY() + y, (float) loc.getZ() + z, 0, 0, 0, 0, 0, null);

		for (Player player : Bukkit.getOnlinePlayers()) {
			((CraftPlayer) player).getHandle().playerConnection.sendPacket(packet);
		}
	}
}
