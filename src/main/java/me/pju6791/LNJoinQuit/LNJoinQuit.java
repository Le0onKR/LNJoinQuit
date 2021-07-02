package me.pju6791.LNJoinQuit;

import cn.nukkit.plugin.PluginBase;

import me.pju6791.LNJoinQuit.listener.EventListener;

public class LNJoinQuit extends PluginBase {

    @Override
    public void onEnable() {

        getServer().getPluginManager().registerEvents(new EventListener(), this);
    }
}
