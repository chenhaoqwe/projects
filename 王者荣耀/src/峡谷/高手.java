package 峡谷;

import java.util.Scanner;

public class 高手 {
	@SuppressWarnings("unused")
	public static void main(String[] args){
		for(int i=0;i<=9;i++){
			System.out.print("*");
		}
		System.out.print("欢迎来到王者大峡谷");
		for(int j=0;j<=9;j++){
			System.out.print("*");
		}
		System.out.println("\t");
		Tool.s("1.qq微信好友     2.微信好友");	
		Scanner qu=new Scanner(System.in);
		int a=qu.nextInt();
		switch(a){
		case 1:{
			System.out.print("请输入你的账号：                                     ");
			int zh=qu.nextInt();
			System.out.print("请输入你的密码：                                    ");
			int mm=qu.nextInt();
			System.out.print("**********************");
			Tool.s("1.人机模式    2。1V1模式   3.3V3模式     5.5V5模式    6。排位模式");
			int mo=qu.nextInt();
			if(mo==1){
				 int  i1=10;
				Tool.s("****************游戏即将开始*************");
				Tool.s("****确认                        退出****");
				Tool.s("          你有10秒的思考时间选择英雄                                 ");
		        Tool.s("      ***倒计时10s开始***                ");
		        while(i1>0){
		        	   System.err.println(i1);
		        	   try {
		        	    Thread.sleep(1000);
		        	   } catch (InterruptedException e) {
		        	    // TODO Auto-generated catch block
		        	    e.printStackTrace();
		        	   }
		        	   i1--;
		        }
		  	  System.err.println(i1);
			  System.err.println("倒计时结束");
				Tool.s("请选择你的分路");
				Tool.s("1.对抗路   2.中路   3。打野   4。游走  5.发育路");
				int i2=qu.nextInt();
				if(i2==1){
					Tool.s("请选择该路的英雄");
					Tool.s("1.花木兰   2.李信   3.吕布");
					int i3=qu.nextInt();
					if(i3==1){
						int i4=30;
						int i5=30;
						Tool.s("你的队友分别是中路：诸葛亮   发育路：后羿      游走：牛魔   打野：韩信");
						Tool.s("你的队友正在交流");
						Tool.s("1楼：加油，各位兄弟！");
						Tool.s("5楼:我已经连跪4把了");
						Tool.s("我:放心吧，我带飞");
						System.out.print("胜率:100%");
						System.out.println("场数:999场");
						System.out.println("游戏即将开始");
						while(i4>0){
							System.err.println(i4);
							try{
								Thread.sleep(1000);					
							}
							catch(InterruptedException e){
								e.printStackTrace();
							}
							i4--;
						}
						  System.err.println(i1);
						  System.err.println("开始");
						  Tool.s("&&&&&&&&&&&&       欢迎来到王者荣耀           &&&&&&&&&&&&&");
						  Tool.s("…………………………      敌军将在30秒后到达战场…………………………");
						  Tool.s("…………………………         请你做好准备…………………………     ");
						  System.out.println("      你开局拥有300金币");
						  int money=300;
						  int life=3000;
						  int dj=1;
						  Tool.s("1.点击商城     2.不购买装备");
						  int i6=qu.nextInt();
						  if(i6==1){
							  System.out.println("1.防御   2.生命   3.攻击    4.法术   5.游走    6.打野");
							  int i7=qu.nextInt();
							  //开始
							  if(i7==1){
								  if(money>=0&&money<=300){
									  Tool.s("1.红玛瑙  300金币      2.护甲   220金币 3.鞋子  250金币   4。铁剑   250金币  ");
									  int money1=qu.nextInt();
									  switch(money1){
									  case 1:{
										  int money2=300-300;
										  Tool.s("你当前的经济是"+money2);
										  Tool.s("小兵到了。你是否上前清理兵线?");
										  Tool.s("你对线是夏洛特");
										  Tool.s("1.是    2.否");
										  int i8=qu.nextInt();
										  if(i8==1){
											  Tool.s("由于你对线，和地方进行了殴斗");
											  int life1=2000;
											  int money3=money2+3*50;
											  Tool.s("你当前的血量是"+life1);
											  Tool.s("你当前的血量是"+money);
											
										  }
										  else{
											  System.err.println("你选择守塔");
											  int life2=3000;
											  int money4=300+3*30;
											  Tool.s("你当前的血量是"+life2);
											  Tool.s("你当前的经济是"+money4);
											  System.out.println("游戏已经进行1分30秒");
											  Tool.s("当前中路河蟹已经刷新，是否前往");
											  Tool.s("1.是   2.否");
											  int i9=qu.nextInt();
											  if(i9==1){
												  Tool.s("你在前往河蟹的路上遭遇到敌人的gank");
												  Tool.s("中路河蟹被对方抢了");
											  }
											  else{
												  
											  }
										  
										  }
										
										  break;
									  }
									  case 2:{
										  int money2=300-220;
										  Tool.s("你当前的经济是"+money2);break;
									  }
									  case 3:{
										  int money2=300-250;
										  Tool.s("你当前的经济是"+money2);
										  break;
									  }
									  case 4:{
										  int money2=300-250;
										  Tool.s("你当前的经济是"+money2);
										  break;
									  }
								
									  }
									 
								  }
								  
					
								  Tool.s("1:红莲斗篷+240物理防御+1200最大生命，唯一被动-献祭:每秒对身边的敌军造成100点法术伤害，没升一级增加4点伤害 。");
								  Tool.s("2:霸者重装+2000最大生命+100每5秒回血。唯一被动-血铠:击杀助攻会在5秒内回复20%的生命值，此效果有10秒CD。 ");
								  Tool.s("3:不详征兆+270物理防御，+1200最大生命。唯一被动-寒铁:受到攻击会减少攻击者30%攻击速度和15%移动速度。 ");
								  Tool.s("4:振兴之铠+10冷却减缩，+180法术防御，+1100最大生命，+45每4秒回血。唯一被动-回复:受到伤害会在两秒内回复4%的生命值，这个效果有10秒的CD，唯一被动-血统:受到治疗的效果提高20%。");
								  Tool.s("5:魔女斗篷+280法术防御+1100最大生命，唯一被动-迷雾:每20秒获得一个吸收450~1500点法术伤害的护盾(护盾效果随英雄等级成长)");
								  Tool.s("6:冰封之心+20冷却减缩+500最大法力+360物理防御。唯一被动-冰心:减少附近敌人30%攻击速度。。");
								  Tool.s("7:冰脉护手+60法术攻击+10冷却减缩+800最大法力+360物理防御。唯一被动-咒人:使用技能后下次普通攻击造成范围减速与物理伤害，这个效果有3秒冷却时间。");
								  Tool.s("8:贤者的庇护+140物理防御，+140法术防御。唯一被动-复生:死亡后两秒原地复活并获得60%血量，这个效果有3分钟CD。");
								  Tool.s("9:暴烈之甲+60物理攻击，+1000最大生命，唯一被动-无畏:受到伤害获得一层增益，每层提供2%移速和2%伤害输出率，最高5层。");
								  Tool.s("10:冰霜战锤+40物理攻击，+1200最大生命。唯一被动-碎冰:普通攻击会减少目标25%移动速度。 讲解 :和暴烈甲一样，偏向于进攻型的防御装备，适用于留人能力差的坦克或者战士。");
								  Tool.s("11:血魔之怒+20物理攻击，+1000最大生命，唯一被动-血怒:生命值低于30%时获得血怒，增加40点攻击与强大护盾持续8秒，效果有90秒 cd。");
								  Tool.s("12:反伤刺甲+480物理防御，唯一被动-荆棘:受到攻击会对攻击者反弹基于自身最大血量1%的魔法伤害。");					  
							  }//
						 }
						  
							while(i5>0){
								System.err.println(i4);
								try{
									Thread.sleep(1000);					
								}
								catch(InterruptedException e){
									e.printStackTrace();
								}
								i4--;
							}
							  System.err.println(i1);
							  System.err.println("敌人已经到达战场");
							  System.exit(0);//关闭应用程序 防止浪费空间..
						
					}
				}
				
			}
			
		}
	}
   }
}



