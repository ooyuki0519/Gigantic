package com.github.unchama.player.mineblock;

import java.util.HashMap;

import org.bukkit.Bukkit;
import org.bukkit.Material;

import com.github.unchama.event.SeichiLevelUpEvent;
import com.github.unchama.player.DataManager;
import com.github.unchama.player.GiganticPlayer;
import com.github.unchama.player.UsingSql;
import com.github.unchama.sql.MineBlockTableManager;
import com.github.unchama.util.SeichiLevelUtil;

public class MineBlockManager extends DataManager implements UsingSql{

	public HashMap<BlockType,MineBlock> datamap = new HashMap<BlockType,MineBlock>();
	public MineBlock all;
	public int level;
	MineBlockTableManager tm;



	public MineBlockManager(GiganticPlayer gp){
		super(gp);
		this.tm = sql.getManager(MineBlockTableManager.class);
	}



	public void increase(Material material){
		this.increase(material,1);
	}
	/**破壊した数を引数に整地量を加算
	 *
	 * @param material
	 * @param breaknum
	 */
	public void increase(Material material, int breaknum) {
		double ratio = BlockType.getIncreaseRatio(material);
		BlockType bt = BlockType.getmaterialMap().get(material);
		double inc = breaknum * ratio;
		datamap.get(bt).increase(inc);
		all.increase(inc);
	}


	@Override
	public void save() {
		tm.save(gp);
	}

	@Override
	public void load(){
		tm.load(gp);
		this.calcLevel();
	}

	private void calcLevel(){
		if(SeichiLevelUtil.canLevelup(level,this.all.getNum())){
			level ++;
			Bukkit.getServer().getPluginManager().callEvent(new SeichiLevelUpEvent(gp,level + 1));
		}
	}







}