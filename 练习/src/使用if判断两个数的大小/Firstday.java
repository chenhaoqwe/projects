package ʹ��if�ж��������Ĵ�С;

import java.util.Scanner;

public class Firstday {
	

	/**
	 * if���������ʽ�����������ʽ){ 1} 
	 * �����ʽΪtrue �����ж�������1
	 * ���Ϊfalse ����ִ��else����
	 *  ����Ϊ����
	 */
	public static void main(String[] args) {
		System.out.println("������ɼ�   ������Ҫ������1");
		Scanner scanner = new Scanner(System.in);// Scanner��
		int a = scanner.nextInt();// �������������
		if(a==1) {//���a==1
			System.out.println("��̫����"	);//��ִ���������
		}
		else System.out.println("��Ǹ");//���a������1 ��ִ���������
	}
}
