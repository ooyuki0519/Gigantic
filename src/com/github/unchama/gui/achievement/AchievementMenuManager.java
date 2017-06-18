package com.github.unchama.gui.achievement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;

import com.github.unchama.gigantic.PlayerManager;
import com.github.unchama.gui.GuiMenu.ManagerType;
import com.github.unchama.gui.moduler.GuiMenuManager;
import com.github.unchama.player.GiganticPlayer;
import com.github.unchama.player.achievement.AchievementManager;

import net.md_5.bungee.api.ChatColor;

public class AchievementMenuManager extends GuiMenuManager{

	@Override
	protected void setIDMap(HashMap<Integer, String> idmap) {
		id_map.put(0, "displaySeichiLevel");
		id_map.put(4, "event");
		id_map.put(8, "combination");
		id_map.put(10, "seichiranking");
		id_map.put(11, "halfhourranking");
		id_map.put(12, "seichiamount");
		id_map.put(13, "playtime");
		id_map.put(14, "loginday");
		id_map.put(15, "support");
		id_map.put(16, "special");
		id_map.put(22, "secret");
		id_map.put(27, "home");
	}

	@Override
	public boolean invoke(Player player, String identifier) {
		GiganticPlayer gp = PlayerManager.getGiganticPlayer(player);
		
		switch(identifier){
		case "displaySeichiLevel":
			gp.getManager(AchievementManager.class).displayTitleNoA = 0;
			gp.getManager(AchievementManager.class).displayTitleNoB = 0;
			gp.getManager(AchievementManager.class).displayTitleNoC = 0;
			
			gp.getManager(AchievementManager.class).setDisplayname(player);
			break;
		case "event":
			break;
		case "combination":
			break;
		case "seichiranking":
			break;
		case "halfhourranking":
			break;
		case "seichiamount":
			break;
		case "playtime":
			break;
		case "loginday":
			break;
		case "support":
			break;
		case "special":
			break;
		case "secret":
			break;
		case "home":
			break;
			}
		return true;
	}

	@Override
	protected void setOpenMenuMap(HashMap<Integer, ManagerType> openmap) {		
	}

	@Override
	protected void setKeyItem() {		
	}

	@Override
	public String getClickType() {
		return null;
	}

	@Override
	public int getInventorySize() {
		return 9*4;
	}
	
	@Override
	public String getInventoryName(Player player) {
		return "実績・二つ名システム";
	}

	@Override
	protected InventoryType getInventoryType() {
		return null;
	}

	@Override
	protected ItemMeta getItemMeta(Player player, int slot, ItemStack itemstack) {
		ItemMeta itemmeta = itemstack.getItemMeta();
		List<String> lore = new ArrayList<String>();
		
		switch(slot){
		case 0:
			itemmeta.setDisplayName( ChatColor.RESET + "" +ChatColor.YELLOW + ChatColor.UNDERLINE + "整地レベルを表示");
			itemmeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			lore = Arrays.asList(
					ChatColor.RESET + "" + ChatColor.RED + "このボタンをクリックすると、",
					ChatColor.RESET + "" + ChatColor.RED + "「整地LV」に表示を切り替えます"
					);
			itemmeta.setLore(lore);
			break;
		case 4:
			itemmeta.setDisplayName( ChatColor.RESET + "" + ChatColor.YELLOW + ChatColor.UNDERLINE + "実績「公式イベント」");
			itemmeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			lore = Arrays.asList(
					ChatColor.RESET + "" + ChatColor.RED + "獲得状況を表示します"
					);
			itemmeta.setLore(lore);
			break;
		case 8:
			itemmeta.setDisplayName( ChatColor.RESET + "" + ChatColor.YELLOW + ChatColor.UNDERLINE + "「二つ名組み合わせシステム」");
			itemmeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			lore = Arrays.asList(
					ChatColor.RESET + "" + ChatColor.RED + "設定画面を表示します"
					);
			itemmeta.setLore(lore);
			break;
		case 10:
			itemmeta.setDisplayName( ChatColor.RESET + "" + ChatColor.YELLOW + ChatColor.UNDERLINE + "実績「整地神ランキング」");
			itemmeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			lore = Arrays.asList(
					ChatColor.RESET + "" + ChatColor.RED + "獲得状況を表示します"
					);
			itemmeta.setLore(lore);
			break;
		case 11:
			itemmeta.setDisplayName( ChatColor.RESET + "" + ChatColor.YELLOW + ChatColor.UNDERLINE + "実績「３０分ランキング」");
			itemmeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			lore = Arrays.asList(
					ChatColor.RESET + "" + ChatColor.RED + "【近日実装予定】"
					);
			itemmeta.setLore(lore);
			break;
		case 12:
			itemmeta.setDisplayName( ChatColor.RESET + "" + ChatColor.YELLOW + ChatColor.UNDERLINE + "実績「整地量」");
			itemmeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			lore = Arrays.asList(
					ChatColor.RESET + "" + ChatColor.RED + "獲得状況を表示します"
					);
			itemmeta.setLore(lore);
			break;
		case 13:
			itemmeta.setDisplayName( ChatColor.RESET + "" + ChatColor.YELLOW + ChatColor.UNDERLINE + "実績「参加時間」");
			itemmeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			lore = Arrays.asList(
					ChatColor.RESET + "" + ChatColor.RED + "獲得状況を表示します"
					);
			itemmeta.setLore(lore);
			break;
		case 14:
			itemmeta.setDisplayName( ChatColor.RESET + "" + ChatColor.YELLOW + ChatColor.UNDERLINE + "実績「ログイン記録」");
			itemmeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			lore = Arrays.asList(
					ChatColor.RESET + "" + ChatColor.RED + "獲得状況を表示します"
					);
			itemmeta.setLore(lore);
			break;
		case 15:
			itemmeta.setDisplayName( ChatColor.RESET + "" + ChatColor.YELLOW + ChatColor.UNDERLINE + "実績「外部支援」");
			itemmeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			lore = Arrays.asList(
					ChatColor.RESET + "" + ChatColor.RED + "獲得状況を表示します"
					);
			itemmeta.setLore(lore);
			break;
		case 16:
			itemmeta.setDisplayName( ChatColor.RESET + "" + ChatColor.YELLOW + ChatColor.UNDERLINE + "実績「特殊」");
			itemmeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			lore = Arrays.asList(
					ChatColor.RESET + "" + ChatColor.RED + "獲得状況を表示します"
					);
			itemmeta.setLore(lore);
			break;
		case 22:
			itemmeta.setDisplayName( ChatColor.RESET + "" + ChatColor.YELLOW + ChatColor.UNDERLINE + "実績「極秘任務」");
			itemmeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			lore = Arrays.asList(
					ChatColor.RESET + "" + ChatColor.RED + "獲得状況を表示します",
					ChatColor.RESET + "" + ChatColor.AQUA + "※獲得前の実績は表示されません"
					);
			itemmeta.setLore(lore);
			break;
		case 27:
			SkullMeta skullmeta = (SkullMeta)Bukkit.getItemFactory().getItemMeta(Material.SKULL_ITEM);
			skullmeta.setDisplayName( ChatColor.RESET + "" + ChatColor.YELLOW + ChatColor.UNDERLINE + "ホームへ");
			skullmeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			lore = Arrays.asList(
					ChatColor.RESET + "" + ChatColor.RED + ChatColor.UNDERLINE + "クリックで移動"
					);
			skullmeta.setLore(lore);
			skullmeta.setOwner("MHF_ArrowLeft");
			itemmeta = (ItemMeta) skullmeta;
			break;
		}
		return itemmeta;
	}

	@Override
	protected ItemStack getItemStack(Player player, int slot) {
		ItemStack itemstack = null;
		switch(slot){
		case 0:
			itemstack = new ItemStack(Material.REDSTONE_TORCH_ON);
			break;
		case 4:
			itemstack = new ItemStack(Material.BLAZE_POWDER);
			break;
		case 8:
			itemstack = new ItemStack(Material.ANVIL);
			break;
		case 10:
			itemstack = new ItemStack(Material.DIAMOND_PICKAXE);
			break;
		case 11:
			itemstack = new ItemStack(Material.GOLD_PICKAXE);
			break;
		case 12:
			itemstack = new ItemStack(Material.IRON_PICKAXE);
			break;
		case 13:
			itemstack = new ItemStack(Material.COMPASS);
			break;
		case 14:
			itemstack = new ItemStack(Material.BREAD);
			break;
		case 15:
			itemstack = new ItemStack(Material.YELLOW_FLOWER);
			break;
		case 16:
			itemstack = new ItemStack(Material.NETHER_STAR);
			break;
		case 22:
			itemstack = new ItemStack(Material.DIAMOND_BARDING);
			break;
		case 27:
			itemstack = new ItemStack(Material.SKULL_ITEM);
			break;
		}
		return itemstack;
	}

	@Override
	public Sound getSoundName() {
		return Sound.BLOCK_FENCE_GATE_OPEN;
	}

	@Override
	public float getVolume() {
		return 1;
	}

	@Override
	public float getPitch() {
		return (float) 0.1;
	}

}
