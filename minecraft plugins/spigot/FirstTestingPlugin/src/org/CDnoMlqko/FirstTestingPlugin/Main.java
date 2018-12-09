package org.CDnoMlqko.FirstTestingPlugin;

import org.CDnoMlqko.FirstTestingPlugin.commands.HelloCommand;
import org.CDnoMlqko.FirstTestingPlugin.commands.ParticleEffectComand;
import org.CDnoMlqko.FirstTestingPlugin.commands.ParticleSphereCommand;
import org.CDnoMlqko.FirstTestingPlugin.join.JoinListener;
import org.CDnoMlqko.FirstTestingPlugin.join.PlayerDeathListener;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

	public void onEnable() {
		new HelloCommand(this);
		new ParticleSphereCommand(this);
		new ParticleEffectComand(this);
		saveDefaultConfig();
		new JoinListener(this);
		new PlayerDeathListener(this);
	}
}
