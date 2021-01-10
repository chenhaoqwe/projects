package 包装类;

import java.util.Scanner;

public class Day1 {
	public static void main(String[] args) {
//		Integer num=null;
//		System.out.println(num);
		System.out.println("请输入");
		Scanner input=new Scanner(System.in);
		if(input.hasNextInt()) {
			System.out.println("((((((((((((((((((((((((((");
			Integer a=input.nextInt();
			System.out.println(a);
		}
		else System.out.println("请输入整数");
	}

}
