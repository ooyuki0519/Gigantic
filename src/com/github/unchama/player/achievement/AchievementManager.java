package com.github.unchama.player.achievement;

import java.util.BitSet;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

import com.github.unchama.gigantic.Gigantic;
import com.github.unchama.player.GiganticPlayer;
import com.github.unchama.player.moduler.DataManager;
import com.github.unchama.player.moduler.UsingSql;
import com.github.unchama.player.seichilevel.SeichiLevelManager;
import com.github.unchama.player.time.PlayerTimeManager;
import com.github.unchama.sql.player.AchievementTableManager;
import com.github.unchama.util.Util;
import com.github.unchama.yml.AchievementListManager;

public class AchievementManager extends DataManager implements UsingSql{
	
	AchievementTableManager at;
	
	//LV・二つ名表示切り替え用(sql)
	public int displayTitleNoA;//前
	public int displayTitleNoB;//中
	public int displayTitleNoC;//後
	//二つ名フラグ保存用(sql)
	public BitSet TitleFlags;
	//二つ名関連用に(投票数)を引っ張る(sql)
	public int p_vote_forT;
	//累計取得料(sql)
	public int achvPointMAX;
	//消費量(sql)
	public int achvPointUSE;
	//現在の残量
	public int achvPoint;
	//投票ptからの変換回数(sql)
	public int achvChangenum;
	//実績配布時に相手が不在の時に保存する(sql)
	public int giveachvNo;
	//実績ショップ用
	public boolean samepageflag ;


	public AchievementManager(GiganticPlayer gp) {
		super(gp);
		at = sql.getManager(AchievementTableManager.class);
	}

	@Override
	public void save(Boolean loginflag) {
		at.save(gp, loginflag);
	}
	
	public void setDisplayname(Player p){
		String displayname = Util.getName(p);
		int seichilevel = gp.getManager(SeichiLevelManager.class).getLevel();
	    
		//整地レベルを表示 or ２つ名を表示
		if(displayTitleNoA == 0 && displayTitleNoB == 0 && displayTitleNoC == 0){
			displayname = "[Lv" + seichilevel + "]" + displayname + ChatColor.WHITE;
		}else{
			String displayTitleA = Gigantic.yml.getManager(AchievementListManager.class).getTitleA(displayTitleNoA);
			String displayTitleB = Gigantic.yml.getManager(AchievementListManager.class).getTitleB(displayTitleNoB);
			String displayTitleC = Gigantic.yml.getManager(AchievementListManager.class).getTitleC(displayTitleNoC);
			displayname = "[" + displayTitleA + displayTitleB + displayTitleC + "]" + displayname + ChatColor.WHITE;
		}
		
		//放置中なら色を変更
		int idle = gp.getManager(PlayerTimeManager.class).getTotalIdletick();
		if(idle <= 10){
			displayname = ChatColor.DARK_GRAY + displayname;
		}else if(idle <= 3){
			displayname = ChatColor.GRAY + displayname;
		}
		
		p.setDisplayName(displayname);
		p.setPlayerListName(displayname);
	}
}
 