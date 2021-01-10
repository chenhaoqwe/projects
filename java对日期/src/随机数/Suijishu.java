package 随机数;

import java.util.Random;

public class Suijishu {

	public static void main(String[] args) {

		Random r = new Random();
		int num1 = r.nextInt();
		System.out.println(num1);
		//next翻译为：下一个int类型的数据是101，表示只能取到100
		int num2=r.nextInt(101);
		System.out.println(num2);
	}
}