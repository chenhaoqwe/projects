package day03С��ϰ;

import java.util.Scanner;

/**  
 * @ClassName: SunFunction
 * @Description: TODO
 * @author chenhao
 * @date 2020-12-27 12:02:19 
*/  
public class SunFunction {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("���ź���sgn��x��");
		System.out.println("������x��ֵ��double��"	);
		double x=sc.nextDouble();
		int sgn=x>0?1:(x<0?-1:0);
		System.out.println("sgn("+ x +")="+ sgn);
	}

}
