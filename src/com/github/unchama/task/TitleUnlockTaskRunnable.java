package com.github.unchama.task;

import org.bukkit.entity.Player;
import com.github.unchama.gigantic.PlayerManager;
import com.github.unchama.player.GiganticPlayer;
import com.github.unchama.player.achievement.AchievementManager;

public class TitleUnlockTaskRunnable{
	
	public void TryTitle(Player p,int i){
		
		GiganticPlayer gp = PlayerManager.getGiganticPlayer(p);
		AchievementManager at = gp.getManager(AchievementManager.class);
		
		switch(i){
		/**
		 * 「整地神ランキング」
		 *  1000~1999
		 */
		//1001「整地神」
		case 1001:
			if(!at.TitleFlags.get(i)){
				//解除処理		
			}
			break;
		//1002「四天王」
		case 1002:
			if(!at.TitleFlags.get(i)){
				//解除処理
			}
			break;
		//1003「重鎮」
		case 1003:
			if(!at.TitleFlags.get(i)){
				//解除処理
			}
			break;
		//1004「大御所」
		case 1004:
			if(!at.TitleFlags.get(i)){
				//解除処理
			}
			break;
		//1005「ラブ」and「整地」
		case 1005:
			if(!at.TitleFlags.get(i)){
				//解除処理
			}
			break;
		//1006「欲まみれ」
		case 1006:
			if(!at.TitleFlags.get(i)){
				//解除処理
			}
			break;
		//1007「整地」and「愛する」
		case 1007:
			if(!at.TitleFlags.get(i)){
				//解除処理
			}
			break;
		//1008「大地」and「友達」
		case 1008:
			if(!at.TitleFlags.get(i)){
				//解除処理
			}
			break;
		//1009「門戸」and「叩く」
		case 1009:
			if(!at.TitleFlags.get(i)){
				//解除処理
			}
			break;
		/**
		 * 「３０分ランキング」
		 *  2000~2999
		 */
		
		/**
		 * 「整地量」
		 *  3000~3999
		 */
		//3001「超克者」
		case 3001:
			if(!at.TitleFlags.get(i)){
				//解除処理
			}
			break;
		//3002「永遠」and「旅人」
		case 3002:
			if(!at.TitleFlags.get(i)){
				//解除処理
				
			}
			break;
		//3003「破壊神」
		case 3003:
			if(!at.TitleFlags.get(i)){
				//解除処理
			}
		//3004「理不尽」
		case 3004:
			if(!at.TitleFlags.get(i)){
				//解除処理
			}
			break;
		//3005「枯れぬ」and「野望」
		case 3005:
			if(!at.TitleFlags.get(i)){
				//解除処理
			}
			break;
		//3006「登頂者」
		case 3006:
			if(!at.TitleFlags.get(i)){
				//解除処理
			}
			break;
		//3007「不屈」
		case 3007:
			if(!at.TitleFlags.get(i)){
				//解除処理
			}
			break;
		//3008「ミリオネア」
		case 3008:
			if(!at.TitleFlags.get(i)){
				//解除処理
			}
			break;
		//3009「夢追い」and「人」
		case 3009:	
			if(!at.TitleFlags.get(i)){
				//解除処理
			}
			break;
		//3010「高み」and「目指す」
		case 3010:
			if(!at.TitleFlags.get(i)){
				//解除処理
			}
			break;
		//3011「参戦者」
		case 3011:
			if(!at.TitleFlags.get(i)){
				//解除処理
			}
			break;
		/**
		 * 「参加時間」
		 *  4000~4999
		 */
		//4001「社畜」and「極み」
		case 4001:
			if(!at.TitleFlags.get(i)){
				//解除処理
			}
			break;
		//4002「休日」and「爆撃機」
		case 4002:
			if(!at.TitleFlags.get(i)){
				//解除処理
			}
			break;
		//4003「企業」and「戦士」
		case 4003:
			if(!at.TitleFlags.get(i)){
				//解除処理
			}
			break;
		//4004「目覚め」and「夜」
		case 4004:
			if(!at.TitleFlags.get(i)){
				//解除処理
			}
			break;
		//4005「元気」and「百倍」
		case 4005:
			if(!at.TitleFlags.get(i)){
				//解除処理
			}
			break;
		//4006「三日目」and「朝」
		case 4006:
			if(!at.TitleFlags.get(i)){
				//解除処理
			}
			break;
		//4007「完徹」and「マン」
		case 4007:
			if(!at.TitleFlags.get(i)){
				//解除処理
			}
			break;
		//4008「さらば」and「終電」
		case 4008:
			if(!at.TitleFlags.get(i)){
				//解除処理
			}
			break;
		//4009「減らぬ」and「課題」
		case 4009:
			if(!at.TitleFlags.get(i)){
				//解除処理
			}
			break;
		//4010「期待」and「新人」
		case 4010:
			if(!at.TitleFlags.get(i)){
				//解除処理
			}
			break;
		/**
		 * 「ログイン記録」
		 *  5000~5999
		 */
		//5001「絶え間」and「なき」
		case 5001:
			if(!at.TitleFlags.get(i)){
				//解除処理
			}
			break;
		//5002「永久」and「ループ」
		case 5002:
			if(!at.TitleFlags.get(i)){
				//解除処理
			}
			break;
		//5003「義務感」
		case 5003:
			if(!at.TitleFlags.get(i)){
				//解除処理
			}
			break;
		//5004「大好き」and「なのです」
		case 5004:
			if(!at.TitleFlags.get(i)){
				//解除処理
			}
			break;
		//5005「もはや」and「日課」
		case 5005:
			if(!at.TitleFlags.get(i)){
				//解除処理
			}
			break;
		//5006「マイ」and「ブーム」
		case 5006:
			if(!at.TitleFlags.get(i)){
				//解除処理
			}
			break;
		//5007「止まらない」
		case 5007:
			if(!at.TitleFlags.get(i)){
				//解除処理
			}
			break;
		//5008「お楽しみ」
		case 5008:
			if(!at.TitleFlags.get(i)){
				//解除処理
			}
			break;
		//5101「いざ」and「二週目」
		case 5101:
			if(!at.TitleFlags.get(i)){
				//解除処理
			}
			break;
		//5102「終わり」and「見えた」
		case 5102:
			if(!at.TitleFlags.get(i)){
				//解除処理
			}
			break;
		//5103「無欠勤」
		case 5103:
			if(!at.TitleFlags.get(i)){
				//解除処理
			}
			break;
		//5104「百」and「軌跡」
		case 5104:
			if(!at.TitleFlags.get(i)){
				//解除処理
			}
			break;
		//5105「ここ」and「おうち」
		case 5105:
			if(!at.TitleFlags.get(i)){
				//解除処理
			}
			break;
		//5106「忠誠心」
		case 5106:
			if(!at.TitleFlags.get(i)){
				//解除処理
			}
			break;
		//5107「月」and「捧げる」
		case 5107:
			if(!at.TitleFlags.get(i)){
				//解除処理
			}
			break;
		//5108「とにかく」and「入る」
		case 5108:
			if(!at.TitleFlags.get(i)){
				//解除処理
			}
			break;
		//5109「常連」
		case 5109:
			if(!at.TitleFlags.get(i)){
				//解除処理
			}
			break;
		//5110「顔見知り」
		case 5110:
			if(!at.TitleFlags.get(i)){
				//解除処理
			}
			break;
		//5111「再び」
		case 5111:
			if(!at.TitleFlags.get(i)){
				//解除処理
			}
			break;
		/**
		 * 「外部支援」
		 *  6000~6999
		 */
		//6001「狂信者」
		case 6001:
			if(!at.TitleFlags.get(i)){
				//解除処理
			}
			break;
		//6002「全身」and「全霊」
		case 6002:
			if(!at.TitleFlags.get(i)){
				//解除処理
			}
			break;
		//6003「洗脳済」
		case 6003:
			if(!at.TitleFlags.get(i)){
				//解除処理
			}
			break;
		//6004「虜」and「なった」
		case 6004:
			if(!at.TitleFlags.get(i)){
				//解除処理
			}
			break;
		//6005「魅惑」
		case 6005:
			if(!at.TitleFlags.get(i)){
				//解除処理
			}
			break;
		//6006「投票」and「魔」
		case 6006:
			if(!at.TitleFlags.get(i)){
				//解除処理
			}
			break;
		//6007「熱烈」
		case 6007:
			if(!at.TitleFlags.get(i)){
				//解除処理
			}
			break;
		//6008「お気に入り」
		case 6008:
			if(!at.TitleFlags.get(i)){
				//解除処理
			}
			break;
		/**
		 * 「公式イベント」
		 *  7000~7999
		 */
		//7001「目指す」and「栄光」
		case 7001:
			if(!at.TitleFlags.get(i)){
				//解除処理
			}
			break;
		//7002「貫禄」and「王者」
		case 7002:
			if(!at.TitleFlags.get(i)){
				//解除処理
			}
			break;
		//7003「顕現」and「立役者」
		case 7003:
			if(!at.TitleFlags.get(i)){
				//解除処理
			}
			break;
		//7004「無」and「無から有へと」and「有」
		case 7004:
			if(!at.TitleFlags.get(i)){
				//解除処理
			}
			break;
		//7005「確か」and「一歩」
		case 7005:
			if(!at.TitleFlags.get(i)){
				//解除処理
			}
			break;
		//7006「春」and「妖精」
		case 7006:
			if(!at.TitleFlags.get(i)){
				//解除処理
			}
			break;
		//7007「匠」and「挑戦状」
		case 7007:
			if(!at.TitleFlags.get(i)){
				//解除処理
			}
			break;
		//7008「神器」and「造形主」
		case 7008:
			if(!at.TitleFlags.get(i)){
				//解除処理
			}
			break;
		//7009「生誕祭」
		case 7009:
			if(!at.TitleFlags.get(i)){
				//解除処理
			}
			break;
		//7010「凍てつく」and「情熱」
		case 7010:
			if(!at.TitleFlags.get(i)){
				//解除処理
			}
			break;
		//7011「灼熱」and「海岸線」
		case 7011:
			if(!at.TitleFlags.get(i)){
				//解除処理
			}
			break;
		//7012「不沈」and「邸宅」
		case 7012:
			if(!at.TitleFlags.get(i)){
				//解除処理
			}
			break;
		/**
		 * 「極秘任務」
		 *  8000~8999
		 */
		//8001「時空」and「旅人」
		case 8001:
			if(!at.TitleFlags.get(i)){
				//解除処理
			}
			break;
		//8002「幸運」and「申し子」
		case 8002:
			if(!at.TitleFlags.get(i)){
				//解除処理
			}
			break;
		//8003「タスク」and「撃墜王」
		case 8003:
			if(!at.TitleFlags.get(i)){
				//解除処理
			}
			break;
		/**
		 * 「特殊」
		 *  9000~9099
		 */
		//9001「お年玉」
		case 9001:
			if(!at.TitleFlags.get(i)){
				//解除処理
			}
			break;
		//9002「サンタ」and「さん」
		case 9002:
			if(!at.TitleFlags.get(i)){
				//解除処理
			}
			break;
		//9003「おそば」
		case 9003:
			if(!at.TitleFlags.get(i)){
				//解除処理
			}
			break;
		//9004「ヤギ」and「族」and「頭領」
		case 9004:
			if(!at.TitleFlags.get(i)){
				//解除処理
			}
			break;
		//9005「亀」and「ではない」
		case 9005:
			if(!at.TitleFlags.get(i)){
				//解除処理
			}
			break;
		//9006「鬼」
		case 9006:
			if(!at.TitleFlags.get(i)){
				//解除処理
			}
			break;
		//9007「創立者」
		case 9007:
			if(!at.TitleFlags.get(i)){
				//解除処理
			}
			break;
		//9008「友チョコ」and「0枚」
		case 9008:
			if(!at.TitleFlags.get(i)){
				//解除処理
			}
			break;
		//9009「魚類」
		case 9009:
			if(!at.TitleFlags.get(i)){
				//解除処理
			}
			break;
		//9010「どかん」and「一発」
		case 9010:
			if(!at.TitleFlags.get(i)){
				//解除処理
			}
			break;
		//9011「必要資金」and「0円」
		case 9011:
			if(!at.TitleFlags.get(i)){
				//解除処理
			}
			break;
		//9012「平等」and「主義」
		case 9012:
			if(!at.TitleFlags.get(i)){
				//解除処理
			}
			break;
		//9013「刈らないで」
		case 9013:
			if(!at.TitleFlags.get(i)){
				//解除処理
			}
			break;
		//9014「lu999」
		case 9014:
			if(!at.TitleFlags.get(i)){
				//解除処理
			}
			break;
		//9015「全科」and「C評価」
		case 9015:
			if(!at.TitleFlags.get(i)){
				//解除処理
			}
			break;
		//9016「塵」and「しか」and「残さん」
		case 9016:
			if(!at.TitleFlags.get(i)){
				//解除処理
			}
			break;
		//9017「余す所」and「なき」
		case 9017:
			if(!at.TitleFlags.get(i)){
				//解除処理
			}
			break;
		//9018「紙耐久」
		case 9018:
			if(!at.TitleFlags.get(i)){
				//解除処理
			}
			break;
		//9019「空気」and「美味他」
		case 9019:
			if(!at.TitleFlags.get(i)){
				//解除処理
			}
			break;
		//9020「溢れ出す」and「母性」
		case 9020:
			if(!at.TitleFlags.get(i)){
				//解除処理
			}
			break;
		//9021「始点」and「分岐点」
		case 9021:
			if(!at.TitleFlags.get(i)){
				//解除処理
			}
			break;
		//9022「褪せない」and「記録」
		case 9022:
			if(!at.TitleFlags.get(i)){
				//解除処理
			}
			break;
		//9023「にじみ出る」and「父性」
		case 9023:
			if(!at.TitleFlags.get(i)){
				//解除処理
			}
			break;
		//9024「ぐるっと」and「回って」
		case 9024:
			if(!at.TitleFlags.get(i)){
				//解除処理
			}
			break;
		//9025「v」and「(・v・)」and「v」
		case 9025:
			if(!at.TitleFlags.get(i)){
				//解除処理
			}
			break;
		//9026「つながる」and「願い」
		case 9026:
			if(!at.TitleFlags.get(i)){
				//解除処理
			}
			break;
		//9027「過密」and「地帯」
		case 9027:
			if(!at.TitleFlags.get(i)){
				//解除処理
			}
			break;
		//9028「食卓」and「からの」and「食卓」
		case 9028:
			if(!at.TitleFlags.get(i)){
				//解除処理
			}
			break;
		}
	}

}
