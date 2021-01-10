package day03小练习;

import java.util.Random;
/*
 * 加法练习题
 * 产生两个10以内的随机数
 * 计算这两个数的和
 */
import java.util.Scanner;

/**
 * @ClassName: Test01
 * @Description: TODO
 * @author chenhao
 * @date 2020-12-27 12:11:20
 */
public class Test01 {
	public static void main(String[] args) {
        Test01 a=new Test01();
		System.out.println(a.chanSheng(10,10,10));
		//a.show();
	}
	public  String chanSheng(int a,int b,int c) {
		Random r = new Random();
		Random r1 = new Random();
	    Random r2 = new Random();
		System.out.println("骰子游戏开始了");
		int x = r.nextInt(a)+1;
		int y = r1.nextInt(b)+1;
		int z=r2.nextInt(c)+1;
		String result;
		if(x==y&&x==z) result="豹子";
		else if(x+y+z>9) result="大";
		else result="小";
		System.out.println("请问你买大买小或者豹子");
		Scanner sc=new Scanner(System.in);
		String cai=sc.nextLine();
		if(cai.equals("大")) System.out.println("恭喜你 赢了");
		else if(cai.equals("小")) System.out.println("恭喜你 赢了");
		else if(cai.equals("豹子小")) System.out.println("恭喜你 赢了");
		else System.out.println("不好意思 你输了");
		return "x: "+x+"  y:"+y+"  z:"+z;

	}
	public void show() {
		System.out.println("请输入你猜的");
	}

}

