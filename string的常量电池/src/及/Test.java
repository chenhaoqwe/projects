
package 及;
import java.util.Scanner;

public class Test {

	private static String s;
	private static String q;
	@SuppressWarnings("unused")
	public static void main(String[] args){

		Scanner in=new Scanner(System.in);

		System.out.println("请输入您的姓名");
		setS(in.nextLine());
		System.out.println("请输入你的出发地点");
		setq(in.nextLine());
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入您的身份证号");
		int x = sc.nextInt();
		System.out.println("*******浩瀚长途客车管理系统*******");
		System.out.println("欢迎使用，若有问题联系我1429542285"); 
		System.out.println("1:购买车票   2:取出车票  3:挂失车票   4:退出");
		int y=sc.nextInt();
		switch(y){
		case 1:{
			System.out.println("请输入你要前往的城市");
			System.out.println("1:邵阳   2:长沙   3:广州");
			int input=sc.nextInt();
			if(input==1)
			{
				System.out.println(q+"——》邵阳");
				System.out.println("车费:50元");
				System.out.println("1:购买   2:返回");
				int z=sc.nextInt();
				switch(z){
				case 1:{
					System.out.println("恭喜您成功购买此次乘票，请等待5分钟，正在出票");
					break;
				}
				case 2:{
					System.out.println("请您重新选择目的城市");
				}
				}
				
			}
			
		}
		}
	}
	

	private static void setq(String nextLine) {
		// TODO Auto-generated method stub
		
	}


	public static String getS() {
		return s;
	}

	public static void setS(String s) {
		Test.s = s;
	}


	public static String getCard() {
		return q;
	}


	public static void setCard(String q) {
		Test.q = q;
	}
}
