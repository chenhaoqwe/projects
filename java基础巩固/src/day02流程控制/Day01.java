package day02���̿���;

import java.util.Scanner;

/*if����Ӧ��
 * if(��ʼ�ı������������ʽ�������ı��ʽ��{ѭ����} ע�����������Ҫ��ifǰ��Ĵ���鶨�� �����ڳ�ʼ�ı������涨��
 * �Ƚ��г�ʼ�ı����� �ٽ��в������ʽ ��Ϊtrue ��ִ��ѭ���� Ȼ��ִ�б����ı��ʽ�Ĵ��� �ٽ��в������ʽ�ĵ��ж�
 * ������ϵ���ִ��  ��Ų���
 * 1.ͨ��Scanner��ͨ���������� �õ��Ķ�Ӧ����
 */

public class Day01 {
	public static void main(String[] args) {
	Scanner a=new Scanner(System.in);
	System.out.println("��������ϲ��������");
	int b=a.nextInt();
	//���Ƚ��е�һ��if���ж�
	//������ֱ�ӽ��еڶ�����if���ߺ���Ĵ����
	if(b==1){
		System.out.println("��ϲ���� һ�Ƚ� ��ֵ100Ԫ�Ļ���");
	}
	else if(b==2){	
		System.out.println("��ϲ���� ���Ƚ� ��ֵ000Ԫ��лл�ݹ�");
	}
	else if(b==3){	
		System.out.println("��ϲ�����˿ս���");
	}
	else if(b==4){	
		System.out.println("��ϲ���� һ������");
	}
	else if(b==5){	
		System.out.println("��ϲ��������һ�εĻ���");
	}
	else if(b==6){	
		System.out.println("��ϲ���� ���Ƚ�   ��ֵ50Ԫ��xx�����Ż�ȯ");
	}
	}
	

}
