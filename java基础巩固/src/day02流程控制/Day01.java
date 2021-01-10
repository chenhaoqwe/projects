package day02流程控制;

import java.util.Scanner;

/*if语句的应用
 * if(初始的变量；布尔表达式；变量的表达式）{循环体} 注意变量名必须要在if前面的代码块定义 或者在初始的变量里面定义
 * 先进行初始的变量的 再进行布尔表达式 若为true 则执行循环体 然后执行变量的表达式的代码 再进行布尔表达式的的判断
 * 代码从上倒下执行  恒古不变
 * 1.通过Scanner来通过输入数字 得到的对应奖励
 */

public class Day01 {
	public static void main(String[] args) {
	Scanner a=new Scanner(System.in);
	System.out.println("请输入你喜欢的数字");
	int b=a.nextInt();
	//首先进行第一个if的判断
	//不可能直接进行第二个的if或者后面的代码块
	if(b==1){
		System.out.println("恭喜你获得 一等奖 价值100元的话费");
	}
	else if(b==2){	
		System.out.println("恭喜你获得 二等奖 价值000元的谢谢惠顾");
	}
	else if(b==3){	
		System.out.println("恭喜你获得了空奖励");
	}
	else if(b==4){	
		System.out.println("恭喜你获得 一个气球");
	}
	else if(b==5){	
		System.out.println("恭喜你获得再来一次的机会");
	}
	else if(b==6){	
		System.out.println("恭喜你获得 三等奖   价值50元的xx饭馆优惠券");
	}
	}
	

}
