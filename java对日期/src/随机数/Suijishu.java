package �����;

import java.util.Random;

public class Suijishu {

	public static void main(String[] args) {

		Random r = new Random();
		int num1 = r.nextInt();
		System.out.println(num1);
		//next����Ϊ����һ��int���͵�������101����ʾֻ��ȡ��100
		int num2=r.nextInt(101);
		System.out.println(num2);
	}
}