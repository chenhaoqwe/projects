package juju;

import java.util.Scanner;

public class heart{
	public static void main(String[] args){
		System.out.println("*********欢迎使用本测试系统*********");
		System.out.println("天气情况:1.下雨   2，为晴天");
		System.out.println("说明:1.男  2女");
		System.out.println("请输入当前天气状况");
		Scanner sr=new Scanner(System.in);
	    int tem=sr.nextInt();
		if(tem==1){
			System.out.println("请问你的性别是");
			Scanner q=new Scanner(System.in);
			int w=q.nextInt();
			if(w==1){
				System.out.println("亲，请问你有女朋友吗？");
				System.out.println("1。有  2.没有");
				Scanner t=new Scanner(System.in);
				int xuan=t.nextInt();
				switch(xuan){
				
				case 1:{
					System.out.println("记得带一个大大的伞，不要把你最爱的女朋友淋湿了");
					System.out.println("请记得给女朋友提个醒，多带一个外套哦");
					break;
				}
				case 2:{
					System.out.println("傻瓜，一个人记得也要照顾好自己哦");
					break;}
		}
			
		}
			else if(w==2){
				System.out.println("小可爱，天气转凉了，记得照顾好自己,加点衣服哦");
				System.out.println("小可爱，记得带好伞哦");
			}
			else{
				System.out.println("亲，你连自己的生殖器官都分不清吗，请登陆baidu。com、");
				
			}
		}
		else if(tem==2){
			System.out.println("又是元气满满的一天，记得要愉快啊，开开心心的呢");
			System.out.println("亲。请问当前天气的温度是多少(输入数字即可)");
			Scanner sr2=new Scanner(System.in);
			int tem1=sr2.nextInt();
			if(tem1<=25&&tem1>=20){		
				System.out.println("亲。温度是室温，注意衣服的使用哦");
			System.out.println("请问你是否具有对象");
			System.out.println("1;有，2，没有");
				int a=sr2.nextInt();
				switch(a){
				case 1:{
					System.out.println("这么好的天气，非常适合散步哦");
					break;
				}
				case 2:{
					System.out.println("太遗憾了。只能待在卧室里玩游戏了啊");break;
				}
				}
			}
			if(tem1>=25&&tem1<=32){
				System.out.print("亲，温度有点高，记得带墨镜");
				System.out.println("记得带防护霜");
			}
			
		}
		System.out.println("谢谢使用本公司制作的简单系统，如有欠缺，可致邮件1429542285@.com");
		}
	}
	