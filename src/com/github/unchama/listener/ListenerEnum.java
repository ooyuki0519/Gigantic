package com.github.unchama.listener;

import org.bukkit.event.Listener;

import com.github.unchama.gigantic.Gigantic;

/**リスナーを追加するときはここに必ず追記すること．
 *
 * @author tar0ss
 *
 */
public enum ListenerEnum {
	PLAYERJOIN(new PlayerJoinListener()),
	FIRSTJOIN(new PlayerFirstJoinListener()),
	PLAYERQUIT(new PlayerQuitListener()),
	SECOND(new SecondListener()),
	MINUTE(new MinuteListener()),
	STATISTIC(new PlayerStatisticListener()),
	PLAYERCLICK(new PlayerInteractListener()),
	INVNETORYCLICK(new InventoryClickListener()),
	SEICHILEVEL(new SeichiLevelListener()),
	GENERALBREAK(new GeneralBreakListener()),
	BLOCKBREAK(new BlockBreakListener()),
	MENUCLICK(new MenuClickListener()),
	GIGANTICINTERACT(new GiganticInteractListener()),
	PLAYERSWAPHANDITEMS(new PlayerSwapHandItemsListener()),
    BUILD(new BlockPlaceEventListener()),
    MINEBLOCKINCREMENT(new MineBlockIncrementListener()),
    HUNTINGPOINT(new HuntingPointEventListener()),
    PLAYERPICKUPITEM(new PlayerPickupItemListener()),
    BLOCKLINEUP(new BlockLineUpListener()),
    RANKINGUPDATE(new RankingUpdateListener()),
	;
	private Listener listener;

	private ListenerEnum(Listener listener){
		this.listener = listener;
	}

	private Listener getListener(){
		return listener;
	}

	public static void registEvents(Gigantic plugin){
		for(ListenerEnum le : ListenerEnum.values()){
			plugin.getServer().getPluginManager().registerEvents(le.getListener(),plugin);
		}
	}
}
