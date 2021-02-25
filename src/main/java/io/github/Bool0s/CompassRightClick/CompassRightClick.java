package io.github.Bool0s.CompassRightClick;

import org.bukkit.plugin.java.JavaPlugin;

public class CompassRightClick extends JavaPlugin {
	@Override
	public void onEnable(){
		getServer().getPluginManager().registerEvents(new RightClickListener(), this);
	}
}
