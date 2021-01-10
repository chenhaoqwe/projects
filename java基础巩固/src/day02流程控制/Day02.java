package day02流程控制;

import java.util.Scanner;

/*
 * switch的应用
 * 1.switch 的case后面的数字不能重复
 * 2.记得添加break  不然你一把锁就开了所有的门了 
 * 3.switch开头不能出现if  只能由case打开大门 进入里面的代码块
 * 输入数字对应相应的星期
 */
public class Day02 {
	public static void main(String[] args) {
		System.out.println("请输入数字");//输入1到7数字 一对应星期一 依次类推
		Scanner s = new Scanner(System.in);//调用scanner的方法
		week(s.nextInt());//因为输入的是整数 并且week的方法参数列表也是int类型  可以让代码简洁
	}
	public static void week(int a){
		switch (a) {
	
		case 1:
			System.out.println("今天是星期一  记得给你女朋友做饭啊");
			break;

		case 2:
			System.out.println("今天是星期二  记得早点起床去浇水");
			break;

		case 3:
			System.out.println("今天是星期三  记得和兄弟的约会");
			break;

		case 4:
			System.out.println("今天是星期四   记得去看望父母");
			break;

		case 5:
			System.out.println("今天是星期五  周末要到了 记得买电影票");
			break;

		case 6:
			System.out.println("今天是星期六  可以睡个懒觉啊");
			break;
		case 7:
			System.out.println("今天是星期日  主人 一周又要结束了加油啊");
			break;
		}
		
	}

}
