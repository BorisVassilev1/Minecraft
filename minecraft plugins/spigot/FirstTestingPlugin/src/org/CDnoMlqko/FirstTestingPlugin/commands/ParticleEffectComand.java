package org.CDnoMlqko.FirstTestingPlugin.commands;

import org.CDnoMlqko.FirstTestingPlugin.Main;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.craftbukkit.v1_12_R1.entity.CraftPlayer;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

import net.minecraft.server.v1_12_R1.EnumParticle;
import net.minecraft.server.v1_12_R1.PacketPlayOutWorldParticles;

public class ParticleEffectComand implements CommandExecutor{
	
	private Main plugin;
	
	public ParticleEffectComand(Main plugin) {
		this.plugin = plugin;
		plugin.getCommand("particleeffect").setExecutor(this);
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		// /pe <radius> <particle> <duration> <rotatespeed>
		if(sender instanceof Player)
		{
			float duration = Float.parseFloat(args[2]);
			try
			{
				EnumParticle.valueOf(args[1]);
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
					float r = Float.parseFloat(args[0]);
					r -= time / duration * r;
					Location loc = ((Player)sender).getLocation();
					String name = args[1];
					float phi = (float) (time * Float.parseFloat(args[3]));
					float x1 = (float) (r * Math.cos(phi));
					float y1 = (float) (time);
					float z1 = (float) (r * Math.sin(phi));
					createParticle(name.toUpperCase(),loc, x1, y1, z1);
					phi += Math.PI;
					float x2 = (float) (r * Math.cos(phi));
					float y2 = (float) (time);
					float z2 = (float) (r * Math.sin(phi));
					createParticle(name.toUpperCase(),loc, x2, y2, z2);
					
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