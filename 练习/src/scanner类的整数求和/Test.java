package scanner����������;
import java.util.Scanner;
/*
 * 1.�����еķ�������ʹ�ù���Ϊ����.������
 * ����ʹ������new �����򽫷�������Ϊ��̬
 */
public class Test {
	static Scanner sc =new Scanner(System.in);//��̬  ����Ҫnew
	public static void main(String[] args){
		System.out.print("���������������� ");
		int i=sc.nextInt();
		int j=sc.nextInt();
		System.out.println(Test.sumInt(i, j));
		
	}
	public static String sumInt(int x,int y){
		//�ж��Ƿ�Ϊ������
		if(x>0&&y>0){
		return x+"+"+y+"="+(x+y);
	}
		return "�װ��ģ����ǲ��Ƿֲ������������˰�";
	}

}
