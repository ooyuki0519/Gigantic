package com.github.unchama.sql.player;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.BitSet;

import com.github.unchama.player.GiganticPlayer;
import com.github.unchama.player.achievement.AchievementManager;
import com.github.unchama.seichi.sql.PlayerDataTableManager;
import com.github.unchama.sql.Sql;
import com.github.unchama.sql.moduler.PlayerFromSeichiTableManager;

public class AchievementTableManager extends PlayerFromSeichiTableManager{

	public AchievementTableManager(Sql sql) {
		super(sql);
	}

	@Override
	protected String addColumnCommand() {
		//コマンド作成
		String command = "";
		command  = "add column if not exists displaytitleNoA int default 0,"
				 + "add column if not exists displaytitleNoB int default 0,"
				 + "add column if not exists displaytitleNoC int default 0,"
				 + "add column if not exists TitleFlags text default null,"
				 + "add column if not exists giveachvNo int default 0," 
				 + "add column if not exists achvPointMAX int default 0," 
				 + "add column if not exists achvPointUSE int default 0," 
				 + "add column if not exists achvChangenum int default 0," ;
		return command;
	}

	@Override
	protected String saveCommand(GiganticPlayer gp) {
		AchievementManager a = gp.getManager(AchievementManager.class);
		//bitset変換処理
		long[] TitleArray = a.TitleFlags.toLongArray();
		String[] TitleNums = Arrays.stream(TitleArray).mapToObj(Long::toHexString).toArray(String[]::new);
        String FlagString = String.join(",", TitleNums);
		//コマンド作成
		String command = "";
		command  = "displaytitleNoA = '" + a.displayTitleNoA + "',"
				 + "displaytitleNoB = '" + a.displayTitleNoB + "'," 
				 + "displaytitleNoC = '" + a.displayTitleNoC + "',"
				 + "achvPointMAX = '" + a.achvPointMAX + "',"
				 + "achvPointUSE = '" + a.achvPointUSE + "',"
				 + "achvChangenum = '" + a.achvChangenum + "',"
				 + "giveachvNo = '" + a.giveachvNo + "',"
				 + "TitleFlag = '" + FlagString + "',";
		return command;
	}
 
	@Override
	protected void takeoverPlayer(GiganticPlayer gp, PlayerDataTableManager tm){
		AchievementManager am = gp.getManager(AchievementManager.class);
		am.displayTitleNoA = tm.getDisplayTitleNoA(gp);
		am.displayTitleNoB = tm.getDisplayTitleNoB(gp);
		am.displayTitleNoC = tm.getDisplayTitleNoC(gp);
		am.achvPointMAX = tm.getAchvPointMAX(gp);
		am.achvChangenum = tm.getAchvChangenum(gp);
	}

	@Override
	protected void firstjoinPlayer(GiganticPlayer gp) {
		if(gp == null){
			plugin.getServer().getLogger().info("gpがnullです");
		}
		AchievementManager a = gp.getManager(AchievementManager.class);
		//お初のデータ初期化
		a.displayTitleNoA = 0;
		a.displayTitleNoB = 0;
		a.displayTitleNoC = 0;
		a.achvChangenum = 0;
		a.achvPoint = 0;
		a.achvPointMAX = 0;
		a.achvPointUSE = 0;
		a.giveachvNo = 0;
		a.TitleFlags = new BitSet(10000);
		a.samepageflag = false;
		a.p_vote_forT = 0;
	}

	public void loadPlayer(GiganticPlayer gp, ResultSet rs) throws SQLException {
		AchievementManager a = gp.getManager(AchievementManager.class);
		//sqlからデータを取得する
		a.displayTitleNoA = rs.getInt("displaytitleNoA");
		a.displayTitleNoB = rs.getInt("displaytitleNoB");
		a.displayTitleNoC = rs.getInt("displaytitleNoC");
		a.achvChangenum = rs.getInt("achvChangenum");
		a.achvPointMAX = rs.getInt("achvPointMAX");
		a.achvPointUSE = rs.getInt("achvPointUSE");
		a.giveachvNo = rs.getInt("giveachvNo");
		//bitsetに戻す
		String[] Titlenums = rs.getString("TitleFlags").toString().split(",");
		long[] Titlearray = Arrays.stream(Titlenums).mapToLong(x -> Long.parseUnsignedLong(x, 16)).toArray();
		//bitsetデータ取得
		a.TitleFlags = BitSet.valueOf(Titlearray);
	}
	
}
