package day02���̿���;

import java.util.Scanner;

/*
 * switch��Ӧ��
 * 1.switch ��case��������ֲ����ظ�
 * 2.�ǵ����break  ��Ȼ��һ�����Ϳ������е����� 
 * 3.switch��ͷ���ܳ���if  ֻ����case�򿪴��� ��������Ĵ����
 * �������ֶ�Ӧ��Ӧ������
 */
public class Day02 {
	public static void main(String[] args) {
		System.out.println("����������");//����1��7���� һ��Ӧ����һ ��������
		Scanner s = new Scanner(System.in);//����scanner�ķ���
		week(s.nextInt());//��Ϊ����������� ����week�ķ��������б�Ҳ��int����  �����ô�����
	}
	public static void week(int a){
		switch (a) {
	
		case 1:
			System.out.println("����������һ  �ǵø���Ů����������");
			break;

		case 2:
			System.out.println("���������ڶ�  �ǵ������ȥ��ˮ");
			break;

		case 3:
			System.out.println("������������  �ǵú��ֵܵ�Լ��");
			break;

		case 4:
			System.out.println("������������   �ǵ�ȥ������ĸ");
			break;

		case 5:
			System.out.println("������������  ��ĩҪ���� �ǵ����ӰƱ");
			break;

		case 6:
			System.out.println("������������  ����˯��������");
			break;
		case 7:
			System.out.println("������������  ���� һ����Ҫ�����˼��Ͱ�");
			break;
		}
		
	}

}
