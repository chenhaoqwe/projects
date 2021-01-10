package scanner类的整数求和;
import java.util.Scanner;
/*
 * 1.在类中的方法调用使用规则为类名.方法、
 * 若不使用这种new 对象，则将方法定义为静态
 */
public class Test {
	static Scanner sc =new Scanner(System.in);//静态  不需要new
	public static void main(String[] args){
		System.out.print("请输入两个整数： ");
		int i=sc.nextInt();
		int j=sc.nextInt();
		System.out.println(Test.sumInt(i, j));
		
	}
	public static String sumInt(int x,int y){
		//判断是否为正整数
		if(x>0&&y>0){
		return x+"+"+y+"="+(x+y);
	}
		return "亲爱的，你是不是分不清数据类型了啊";
	}

}
