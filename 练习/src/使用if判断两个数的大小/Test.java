package ʹ��if�ж��������Ĵ�С;
import java.util.Scanner;
public class Test {
	static Scanner sc=new Scanner(System.in);//ͬһ��������
	public static void main(String[] args){
		//1.��ӭ��ʹ���жϳ���
		System.out.println("*********��ӭ�ƺ��������*********");
		boolean chose=false;
		//2.��һ������
		System.out.println("�װ��ģ��������һ������");
		int i=sc.nextInt();
		//3.�ڶ�������
		System.out.println("�����������ڶ�������");
		int j=sc.nextInt();
		//4.ʹ��if���
		while(dopanduan(i,j)==true){
			System.out.println(i+"+"+j+"="+(i+j));
		break;
			
		}
		System.out.println("�װ��ģ�����������");
	}
	private static boolean dopanduan(int i, int j) {
		if(i>0&&j>0){
			return true;
		}
		// TODO Auto-generated method stub
		System.out.println("   ע�⣺");
		return false;
	}

}
