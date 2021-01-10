package kk;
import java.util.Random;
import java.util.Scanner;
public class A {
	@SuppressWarnings("unused")
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("请问你买大。小or豹子");
		String input=sc.nextLine();
		Random random=new Random(System.currentTimeMillis());
		int num1=random.nextInt(6)+1;
		int num2=random.nextInt(6)+1;
		int num3=random.nextInt(6)+1;
		System.out.println(num1+":"+num2+":"+num3);
		String result;
		if(num1==num2&&num1==num3){
			System.out.println("豹子");
			result="豹子";
		}
		else if(num1+num2+num3>=9){
			System.out.println("大");
			result="大";
			
		}
		else{
			System.out.println("小");
			result="小";
		}
		if(input.equals(result)){
			System.out.println("恭喜您  赢了");
		}
		else{
			System.out.println("不好意思    你输了");
		}
		
	}

}
