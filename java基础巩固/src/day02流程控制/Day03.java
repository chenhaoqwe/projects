package day02���̿���;

import java.util.Scanner;

/*
 * if��Ƕ��ʹ��
 * ��һ��С�����������������仯ʱ���ṩ����
 * Ҫ�� ��������Ĵ���龡���ܵ��� ����÷���
 */
public class Day03 {
	
	Scanner s=new Scanner(System.in);
	
	public Day03(){
	    Tool("*************��ӭʹ������С����************");
	    Tool("***************1.����С����**************");
	    Tool("***************2.�˳�С����**************");
	    Tool("***************3.����˵����**************");
		show();
		
	}
	public static void main(String[] args) {
		new Day03();
	}
	/*
	 * С����
	 */
	public void Tool(String string){
		System.out.println(string);
	}
	/*
	 * ����С�����Ժ�
	 */
	public void show(){
		 Tool("���ʵ�ǰ�������ǣ�����  ���� ����?");
		 String x=s.nextLine();
		 if(x.equals("����"))   sunnyDay();	 
		 else raingDay();
	}
	/*
	 * ������������Ϊ����ʱ�ṩ����
	 */
	public void sunnyDay(){
		Tool("�ǵ�Ϳ����˪  ��ī��Ŷ  ��Ů���ѵĻ����Դ���̫��ɡ");
	}

	/*
	 * ������Ϊ������ʱ�ṩ����
	 */
	public void raingDay(){
		Tool("�ǵô���ɡ  �¶ȱȽϵ͵Ļ� Ҫ�ഩ�·��� �չ˺��Լ� ");
	}
}
