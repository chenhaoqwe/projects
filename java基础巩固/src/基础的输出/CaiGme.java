package ���������;

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
		System.out.println("��Ϸ����");
	}

	// ����µ�����
	public static int user() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("����������");
		int a = scanner.nextInt();
		return a;
	}

	// �ж�
	public static boolean panduan(int a, int b, int c) {
		if (a == b) {
			System.out.println("��̫������");
			return false;
		} else {
			c--;
			if (c > 0) {
				System.out.println("�㻹��" + c + "����");
				int input = user();
				panduan(a, input, c);
			} else
				return false;
		}
		return false;
	}

}
