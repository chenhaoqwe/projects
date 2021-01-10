package 基础的输出;

import java.util.Scanner;

public class Member {
	static Scanner sc=new Scanner(System.in);//scanner类可以读取
	public static void main(String[] args) {
		System.out.println("请输入第一个字符串");
		String first=sc.nextLine();
		System.out.println("请输入第二个字符串");
		String second=sc.nextLine();
		System.out.println("请输入第三个字符串");
		String three=sc.nextLine();
		System.out.println(first+" "+second+" "+three);
		
	}

}
