package 异常;

import java.util.Scanner;

public class Student {
	public void speak(int a) throws MyException {
		if(a>1000) {
			throw new MyException("实例变量不能大于1000");
		}
	}
	public static void main(String[] args) {
		
		try {
			Student stu=new Student();
			Scanner sc=new Scanner(System.in);
			System.out.println("请输入speak方法实例变量");
			int input=sc.nextInt();
			stu.speak(input);
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
class MyException extends Exception{
	public MyException(String str) {
		super(str);
	}
}