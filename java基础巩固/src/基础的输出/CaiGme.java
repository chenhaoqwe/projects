package 基础的输出;

import java.util.Random;
import java.util.Scanner;

public class CaiGme {
	public static void main(String[] args) {
		boolean flag = true;
		while (flag) {
			Random r = new Random();
			int cai = r.nextInt(100) + 1;
			int result = user();
			int jihui = 3;
			flag = panduan(cai, result, jihui);
		}
		System.out.println("游戏结束");
	}

	// 输入猜的数字
	public static int user() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入数字");
		int a = scanner.nextInt();
		return a;
	}

	// 判断
	public static boolean panduan(int a, int b, int c) {
		if (a == b) {
			System.out.println("你太厉害了");
			return false;
		} else {
			c--;
			if (c > 0) {
				System.out.println("你还有" + c + "机会");
				int input = user();
				panduan(a, input, c);
			} else
				return false;
		}
		return false;
	}

}
