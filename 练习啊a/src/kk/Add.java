package kk;

import java.util.Random;
import java.util.Scanner;

public class Add {
	static Random r=new Random();
	static Scanner sc=new Scanner(System.in);//ͬһ������ ����ʱ��  ʹ����static
	public static void main(String[] args) {
		System.out.println(pan(sunInt()));}
	public static int sunInt(){
		int a=r.nextInt(10);//����random���е�nextInt�� ����һ��0��10����  ������10
		int b=r.nextInt(10);
		int sum=a+b;
		System.out.println("������µ�����");
		int c=sc.nextInt();
		if(sum==c){
			return 1;
		}
		return -1;
	}
	public static String pan(int  a){
		if(a==1) {return "��Ӯ��";
		
		}
		else return "������";
	}


}
