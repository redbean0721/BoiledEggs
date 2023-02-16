package com.redbean0721.boiledeggs;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class PlayerJoinLeaveEvent implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();

        if (player.hasPlayedBefore()) {
            player.sendMessage(ChatColor.AQUA + "歡迎加入 " + ChatColor.RED + "紅豆伺服器" + ChatColor.AQUA + "!");
            event.setJoinMessage(ChatColor.YELLOW + player.getDisplayName() + ChatColor.GREEN + " 加入了伺服器");
        }
        else {
            player.sendMessage(ChatColor.AQUA + "歡迎加入 " + ChatColor.RED + "紅豆伺服器" + ChatColor.AQUA + "!");
            event.setJoinMessage(ChatColor.YELLOW + player.getDisplayName() + ChatColor.GREEN + " 首次加入了伺服器");
        }
    }

    @EventHandler
    public void onPlayerLeave(PlayerQuitEvent event) {
        Player player = event.getPlayer();
        event.setQuitMessage(ChatColor.YELLOW + player.getDisplayName() + ChatColor.GREEN + " 離開了伺服器");
    }
}
