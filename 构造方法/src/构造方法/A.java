package ���췽��;
/**
 *1.һ��������ֻ����һ���޲������췽��
 *2.���ܳ����ظ����в������췽�� ����������ͬ  �����б������Ҫһ��
 *3.���췽����������ʱ�򡡸���ĳЩ�ض������Ի�������
 * @ClassName: A
 * @Description: TODO
 * @author chenhao
 * @date 2020-12-30 04:32:07
 */
public class A {
	//�޲������췽��
	public A(){
		//��ע�ͺ�
		//System.out.println("A���޲������췽��");
	}
	//A���в������췽��
	public A(int a) {
		//System.out.println("A���в������췽��");
	}
	public A(int a,String name) {
		//System.out.println("A�������в������췽��");
	}

	public static void main(String[] args) {
		//�����᣽new A����;�ý��Ϊ�հ�
		//ͬ�ϡ���Ȼֱ��new A()Ҳû��;//����˵��Ҫ����һ�� A��Ķ���  ��������A���޲������췽��
		//new��A(1);�ý������A���в������췽��
		//new A(1,"�º�");�������A�������в������췽��
	}
}
