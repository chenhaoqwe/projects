package ���������;

import java.util.Scanner;

/**
 * 
 * @author chenhao
 *
 */
// ����Ĵ���������ָ��λ�����ע�͡�
/*2.*�����˶δ���Ĺ��ܣ����������������˶��������λ�ã�
 * 3.*/// �����������ڣ�( 
 //����java.util���µ�Scanner��)
//5.import java.util.Scanner;
//6.
public class FreeFall {
	 //7.
	public static void main(String[] args){
	// �����������ڣ�(  �������տ���̨�������Scanner   )9.
	Scanner scanner =new Scanner(System.in);
	double g =9.80;
	System.out.println("���������������ʱ�䣨�룩��");
	// �����������ڣ�(  ʹ��double���ͽ��տ���̨�����ʱ������t   )
	double t = scanner.nextDouble();
	//14.// �����������ڣ�(  �������������λ�ƹ�ʽ�����λ��ֵs   )
	//15.
	double s =0.5* g * t * t;
	// �����������ڣ�(  ȡ������һλС��)
	s = Math.round(10* s)/10.0;
	System.out.println(t +"�����������������"+ s +"��");
}
}
