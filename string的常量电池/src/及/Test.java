
package ��;
import java.util.Scanner;

public class Test {

	private static String s;
	private static String q;
	@SuppressWarnings("unused")
	public static void main(String[] args){

		Scanner in=new Scanner(System.in);

		System.out.println("��������������");
		setS(in.nextLine());
		System.out.println("��������ĳ����ص�");
		setq(in.nextLine());
		Scanner sc=new Scanner(System.in);
		System.out.println("�������������֤��");
		int x = sc.nextInt();
		System.out.println("*******��嫳�;�ͳ�����ϵͳ*******");
		System.out.println("��ӭʹ�ã�����������ϵ��1429542285"); 
		System.out.println("1:����Ʊ   2:ȡ����Ʊ  3:��ʧ��Ʊ   4:�˳�");
		int y=sc.nextInt();
		switch(y){
		case 1:{
			System.out.println("��������Ҫǰ���ĳ���");
			System.out.println("1:����   2:��ɳ   3:����");
			int input=sc.nextInt();
			if(input==1)
			{
				System.out.println(q+"����������");
				System.out.println("����:50Ԫ");
				System.out.println("1:����   2:����");
				int z=sc.nextInt();
				switch(z){
				case 1:{
					System.out.println("��ϲ���ɹ�����˴γ�Ʊ����ȴ�5���ӣ����ڳ�Ʊ");
					break;
				}
				case 2:{
					System.out.println("��������ѡ��Ŀ�ĳ���");
				}
				}
				
			}
			
		}
		}
	}
	

	private static void setq(String nextLine) {
		// TODO Auto-generated method stub
		
	}


	public static String getS() {
		return s;
	}

	public static void setS(String s) {
		Test.s = s;
	}


	public static String getCard() {
		return q;
	}


	public static void setCard(String q) {
		Test.q = q;
	}
}
