package kk;
import java.util.Random;
import java.util.Scanner;
public class A {
	@SuppressWarnings("unused")
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("���������Сor����");
		String input=sc.nextLine();
		Random random=new Random(System.currentTimeMillis());
		int num1=random.nextInt(6)+1;
		int num2=random.nextInt(6)+1;
		int num3=random.nextInt(6)+1;
		System.out.println(num1+":"+num2+":"+num3);
		String result;
		if(num1==num2&&num1==num3){
			System.out.println("����");
			result="����";
		}
		else if(num1+num2+num3>=9){
			System.out.println("��");
			result="��";
			
		}
		else{
			System.out.println("С");
			result="С";
		}
		if(input.equals(result)){
			System.out.println("��ϲ��  Ӯ��");
		}
		else{
			System.out.println("������˼    ������");
		}
		
	}

}
