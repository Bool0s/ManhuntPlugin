package io.github.Bool0s.CompassRightClick;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.CommandSender;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;


public class RightClickListener implements Listener {
	@EventHandler
	public void onRightClick(PlayerInteractEvent event) {
		//Check to see if the player right clicked with a compass in their hand
		if (event.getMaterial() == Material.COMPASS) {
			
			//System.out.println(event.getPlayer().getDisplayName() + "clicked with compass!");
			Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "say " + event.getPlayer().getDisplayName() + " right clicked with a compass");
			
			//event.getPlayer().getLocation();
			
		}
	}
}
