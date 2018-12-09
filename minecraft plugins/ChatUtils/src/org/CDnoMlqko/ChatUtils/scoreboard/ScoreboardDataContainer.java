package org.CDnoMlqko.ChatUtils.scoreboard;

import java.io.Serializable;

import org.bukkit.entity.Player;

public class ScoreboardDataContainer implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int money;
	int magicdust;
	Player teleportationRequest;
	public boolean hasTeleportationRequestPending;
	
	public ScoreboardDataContainer() {
		money = 500;
		magicdust = 0;
	}
	
	public int getMoney()
	{
		return money;
	}
	
	public void setMoney(int val)
	{
		this.money = val;
	}
	
	public void addMoney(int amt)
	{
		this.money += amt;
	}
	
	public Player getTepeportationRequest()
	{
		return teleportationRequest;
	}
	
	public void setTeleportationRequest(Player teleportationRequest)
	{
		this.teleportationRequest = teleportationRequest;
	}
	
	public void addMagicDust(int amt)
	{
		this.magicdust += amt;
	}
	public int getMagicDust()
	{
		return this.magicdust;
	}
}
