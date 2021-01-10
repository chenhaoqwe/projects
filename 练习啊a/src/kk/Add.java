package kk;

import java.util.Random;
import java.util.Scanner;

public class Add {
	static Random r=new Random();
	static Scanner sc=new Scanner(System.in);//同一个类中 调用时候  使用是static
	public static void main(String[] args) {
		System.out.println(pan(sunInt()));}
	public static int sunInt(){
		int a=r.nextInt(10);//调用random类中的nextInt放 产生一个0到10的数  不包括10
		int b=r.nextInt(10);
		int sum=a+b;
		System.out.println("输入你猜的数字");
		int c=sc.nextInt();
		if(sum==c){
			return 1;
		}
		return -1;
	}
	public static String pan(int  a){
		if(a==1) {return "你赢了";
		
		}
		else return "你输了";
	}


}
