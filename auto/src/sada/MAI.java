package sada;
import java.util.Scanner;
public class MAI {
	public static void main(String[] args)
	{
		System.out.println("正在售卖的饮料及其价格：");
		System.out.println("1:3元     2:5元    3:7元");
		int coinNum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入需要购买的饮料编号：");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:int coinNnum = 0;
			do
		{
			System.out.println("本自动售卖机仅仅支持1元硬币支付，请投币:");
			int input=sc.nextInt();
			if(input>1)
			{
				System.out.println("请您投入1元硬币！");
			}
			else
			{
				coinNum=coinNum+input;
				if(coinNum<3){
					System.out.println("少于3元！请您继续投币。。。");
				}
			}
		}
		while(coinNnum==3);
	    System.out.println("已经支付全款！请您拿走你的饮料！");
	    break;
		case 2:
			do{
				System.out.println("本自动售卖机仅支持1元硬币支付，请投币:");
				int input=sc.nextInt();
				if(input>1){
					System.out.println("请您投入1元硬币！");
				}
				else
				{
					coinNum=coinNum+input;
					if(coinNum<5){
						System.out.println("少于5元!请您继续投币。。。。");
					}				
					}
			}while(coinNum==5);
			System.out.println("已支付全款！请您拿走你的饮料。");
			break;
		case 3:
			do{
				System.out.println("本自动售卖机仅支持1元硬币支付，请投币");	
			int input=sc.nextInt();
			if(input>1){
				System.out.println("谢谢购买该饮料！");				
			}
			else{
				coinNum=input+coinNum;
				if(coinNum<7)
					System.out.println("少于7元！请继续投币。。。");	
			}
			}
		
					
		while(coinNum==7);
			System.out.println("已支付全款！请拿走您的饮料，");
			break;
			default:
				System.out.println("操作有误!请重新操作。");
				break;
				
		}
		sc.close();
		
	}

}
