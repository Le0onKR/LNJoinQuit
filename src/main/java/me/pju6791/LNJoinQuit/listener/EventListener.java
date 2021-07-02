package me.pju6791.LNJoinQuit.listener;

import cn.nukkit.event.Listener;

import cn.nukkit.Player;
import cn.nukkit.Server;

import cn.nukkit.event.player.PlayerJoinEvent;
import cn.nukkit.event.player.PlayerQuitEvent;

import me.pju6791.LNJoinQuit.LNJoinQuit;

public class EventListener implements Listener {

    public LNJoinQuit owner;

    public void __construct(LNJoinQuit owner) {
        this.owner = owner;
    }

    public void onJoin(PlayerJoinEvent event) {

        Player player = event.getPlayer();

        Server server = Server.getInstance();

        if (!(player.hasPlayedBefore())) {
            server.broadcastMessage("§l§e[알림] §r§a" + player.getName() + "님§f이 서버에 처음접속했습니다.");
        } else {
            if (player.isOp()) {
                server.broadcastMessage("§l§a[+] §f관리자 §r§b" + player.getName() + "님§7이 서버에 접속했습니다.");
            } else {
                server.broadcastMessage("§l§a[+] §b" + player.getName() + "님§f이 접속하셨습니다.");
            }
        }
    }

    public void onQuit(PlayerQuitEvent event) {

        Player player = event.getPlayer();

        Server server = Server.getInstance();

        if (player.isOp()) {
            server.broadcastMessage("§l§c[-] §f관리자 §r§b" + player.getName() + "님§f이 퇴장하셨습니다.");
        } else {
            server.broadcastMessage("§l§c[-] §b" + player.getName() + "님§f이 퇴장하셨습니다.");
        }
    }
}
