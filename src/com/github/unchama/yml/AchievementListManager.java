package com.github.unchama.yml;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.bukkit.Bukkit;
import org.bukkit.configuration.ConfigurationSection;

import com.github.unchama.yml.moduler.YmlManager;

public class AchievementListManager extends YmlManager{
	
	private static String FOLDERNAME = "ahievementlist";
	
	AchievementListManager(){
		super();
		loadachievementlist();
	}
	
	private File folder;
	
	@Override
	protected void saveDefaultFile() {
		if (!file.exists()) {
			plugin.saveResource(filename, false);
		}
		
		//インスタンス
		folder = new File(plugin.getDataFolder(),FOLDERNAME);
		
		//フォルダがない場合は生成
		if(!folder.exists()){
			if(!folder.mkdirs()){
				Bukkit.getServer().getLogger()
				.warning(FOLDERNAME + "というディレクトリを作成できませんでした．");
				return;
			}
		}else if(!folder.isDirectory()){
			Bukkit.getServer().getLogger()
			.warning(FOLDERNAME + "という名前のファイルを削除してください");
			return;
		}
	}
	
	private Map<String,String> ach;
	
	//ymlからデータを取り込む
	public void loadachievementlist(){
		this.ach = new HashMap<String,String>();
		ConfigurationSection data = this.fc.getConfigurationSection("Achievement");
		
		for(String name : data.getKeys(false)){
			String achName = data.getString(name);
			ach.put(name, achName);
		}
	}
	
	/**
	 * 
	 * @param 二つ名の番号
	 * @return 二つ名
	 */
	public String getTitleA(int i){
		String TitleNo = "AchvA" + i;
		return ach.get(TitleNo);
	}
	
	public String getTitleB(int i){
		String TitleNo = "AchvB" + i;
		return ach.get(TitleNo);
	}
	
	public String getTitleC(int i){
		String TitleNo = "AchvC" + i;
		return ach.get(TitleNo);
	}

}
