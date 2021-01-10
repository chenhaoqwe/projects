package 使用if判断两个数的大小;
import java.util.Scanner;
public class Test {
	static Scanner sc=new Scanner(System.in);//同一个类体中
	public static void main(String[] args){
		//1.欢迎你使用判断程序
		System.out.println("*********欢迎浩浩软件程序*********");
		boolean chose=false;
		//2.第一个数字
		System.out.println("亲爱的，请输入第一个数字");
		int i=sc.nextInt();
		//3.第二个数字
		System.out.println("请你继续输入第二个数字");
		int j=sc.nextInt();
		//4.使用if语句
		while(dopanduan(i,j)==true){
			System.out.println(i+"+"+j+"="+(i+j));
		break;
			
		}
		System.out.println("亲爱的，请输入整数");
	}
	private static boolean dopanduan(int i, int j) {
		if(i>0&&j>0){
			return true;
		}
		// TODO Auto-generated method stub
		System.out.println("   注意：");
		return false;
	}

}
