package 使用if判断两个数的大小;

import java.util.Scanner;

public class Firstday {
	

	/**
	 * if（布尔表达式或者条件表达式){ 1} 
	 * 当表达式为true 进入判断体里面1
	 * 如果为false 进人执行else里面
	 *  以下为例子
	 */
	public static void main(String[] args) {
		System.out.println("请输入成绩   这里我要你输入1");
		Scanner scanner = new Scanner(System.in);// Scanner类
		int a = scanner.nextInt();// 接受输入的数字
		if(a==1) {//如果a==1
			System.out.println("你太棒了"	);//则执行这个代码
		}
		else System.out.println("抱歉");//如果a不等于1 则执行这个代码
	}
}
