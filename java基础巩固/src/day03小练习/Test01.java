package day03С��ϰ;

import java.util.Random;
/*
 * �ӷ���ϰ��
 * ��������10���ڵ������
 * �������������ĺ�
 */
import java.util.Scanner;

/**
 * @ClassName: Test01
 * @Description: TODO
 * @author chenhao
 * @date 2020-12-27 12:11:20
 */
public class Test01 {
	public static void main(String[] args) {
        Test01 a=new Test01();
		System.out.println(a.chanSheng(10,10,10));
		//a.show();
	}
	public  String chanSheng(int a,int b,int c) {
		Random r = new Random();
		Random r1 = new Random();
	    Random r2 = new Random();
		System.out.println("������Ϸ��ʼ��");
		int x = r.nextInt(a)+1;
		int y = r1.nextInt(b)+1;
		int z=r2.nextInt(c)+1;
		String result;
		if(x==y&&x==z) result="����";
		else if(x+y+z>9) result="��";
		else result="С";
		System.out.println("�����������С���߱���");
		Scanner sc=new Scanner(System.in);
		String cai=sc.nextLine();
		if(cai.equals("��")) System.out.println("��ϲ�� Ӯ��");
		else if(cai.equals("С")) System.out.println("��ϲ�� Ӯ��");
		else if(cai.equals("����С")) System.out.println("��ϲ�� Ӯ��");
		else System.out.println("������˼ ������");
		return "x: "+x+"  y:"+y+"  z:"+z;

	}
	public void show() {
		System.out.println("��������µ�");
	}

}

