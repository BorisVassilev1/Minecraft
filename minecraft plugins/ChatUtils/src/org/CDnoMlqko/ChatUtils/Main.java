package org.CDnoMlqko.ChatUtils;


import org.CDnoMlqko.ChatUtils.commands.currencies.magicdust.GiveMagicDustCommand;
import org.CDnoMlqko.ChatUtils.commands.currencies.money.GiveMoneyCommand;
import org.CDnoMlqko.ChatUtils.commands.currencies.money.PayCommand;
import org.CDnoMlqko.ChatUtils.commands.tpa.TpaCommand;
import org.CDnoMlqko.ChatUtils.commands.tpa.TpacceptCommand;
import org.CDnoMlqko.ChatUtils.commands.tpa.TpadeclineCommand;
import org.CDnoMlqko.ChatUtils.enchantments.EnchantmentsManager;
import org.CDnoMlqko.ChatUtils.events.DeathListener;
import org.CDnoMlqko.ChatUtils.events.InventoryClickListener;
import org.CDnoMlqko.ChatUtils.events.JoinListener;
import org.CDnoMlqko.ChatUtils.events.MobKillListener;
import org.CDnoMlqko.ChatUtils.events.PlayerInteractListener;
import org.CDnoMlqko.ChatUtils.scoreboard.ScoreboardDataManager;
import org.CDnoMlqko.ChatUtils.ui.customEnchantments.CommonEnchantmentMenu;
import org.CDnoMlqko.ChatUtils.ui.customEnchantments.EnchantmentsMainMenu;
import org.CDnoMlqko.ChatUtils.ui.customEnchantments.EpicEnchantmentMenu;
import org.CDnoMlqko.ChatUtils.ui.customEnchantments.LegendaryEnchantmentMenu;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{
	
	public static TpaCommand tpaCommand;
	public static TpacceptCommand tpacceptCommand;
	public static TpadeclineCommand tpadeclineCommand;
	public static PayCommand payCommand;
	public static GiveMoneyCommand giveMoneyCommand;
	public static GiveMagicDustCommand giveMagicDustCommand;
	
	public static JoinListener joinListener;
	public static DeathListener deathListener;
	public static MobKillListener mobKillListener;
	public static PlayerInteractListener playerInteractListener;
	public static InventoryClickListener InventoryClickListener;
	
	public static ScoreboardDataManager scoreboardDataManager;
	
	public static EnchantmentsManager enchantmentsManager;
	
	public static EnchantmentsMainMenu EnchantmentsMainMenu;
	public static CommonEnchantmentMenu commonEnchantmentMenu;
	public static EpicEnchantmentMenu epicEnchantmentMenu;
	public static LegendaryEnchantmentMenu legendaryEnchantmentMenu;
	
	public void onEnable()
	{
		scoreboardDataManager = new ScoreboardDataManager();
		ScoreboardDataManager.LoadScoreboard();
		saveDefaultConfig();
		tpaCommand = new TpaCommand(this);
		tpacceptCommand = new TpacceptCommand(this);
		tpadeclineCommand = new TpadeclineCommand(this);
		payCommand = new PayCommand(this);
		giveMoneyCommand = new GiveMoneyCommand(this);
		giveMagicDustCommand = new GiveMagicDustCommand(this);
		
		joinListener = new JoinListener(this);
		deathListener = new DeathListener(this);
		mobKillListener = new MobKillListener(this);
		playerInteractListener = new PlayerInteractListener(this);
		InventoryClickListener = new InventoryClickListener(this);
		
		enchantmentsManager = new EnchantmentsManager(this);
		
		EnchantmentsMainMenu = new EnchantmentsMainMenu();
		commonEnchantmentMenu = new CommonEnchantmentMenu();
		epicEnchantmentMenu = new EpicEnchantmentMenu();
		legendaryEnchantmentMenu = new LegendaryEnchantmentMenu();
		
	}
	
	public void onDisable()
	{
		ScoreboardDataManager.SaveScoreboard();
	}
}
