package sada;
import java.util.Scanner;
public class MAI {
	public static void main(String[] args)
	{
		System.out.println("�������������ϼ���۸�");
		System.out.println("1:3Ԫ     2:5Ԫ    3:7Ԫ");
		int coinNum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("��������Ҫ��������ϱ�ţ�");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:int coinNnum = 0;
			do
		{
			System.out.println("���Զ�����������֧��1ԪӲ��֧������Ͷ��:");
			int input=sc.nextInt();
			if(input>1)
			{
				System.out.println("����Ͷ��1ԪӲ�ң�");
			}
			else
			{
				coinNum=coinNum+input;
				if(coinNum<3){
					System.out.println("����3Ԫ����������Ͷ�ҡ�����");
				}
			}
		}
		while(coinNnum==3);
	    System.out.println("�Ѿ�֧��ȫ���������������ϣ�");
	    break;
		case 2:
			do{
				System.out.println("���Զ���������֧��1ԪӲ��֧������Ͷ��:");
				int input=sc.nextInt();
				if(input>1){
					System.out.println("����Ͷ��1ԪӲ�ң�");
				}
				else
				{
					coinNum=coinNum+input;
					if(coinNum<5){
						System.out.println("����5Ԫ!��������Ͷ�ҡ�������");
					}				
					}
			}while(coinNum==5);
			System.out.println("��֧��ȫ���������������ϡ�");
			break;
		case 3:
			do{
				System.out.println("���Զ���������֧��1ԪӲ��֧������Ͷ��");	
			int input=sc.nextInt();
			if(input>1){
				System.out.println("лл��������ϣ�");				
			}
			else{
				coinNum=input+coinNum;
				if(coinNum<7)
					System.out.println("����7Ԫ�������Ͷ�ҡ�����");	
			}
			}
		
					
		while(coinNum==7);
			System.out.println("��֧��ȫ��������������ϣ�");
			break;
			default:
				System.out.println("��������!�����²�����");
				break;
				
		}
		sc.close();
		
	}

}
