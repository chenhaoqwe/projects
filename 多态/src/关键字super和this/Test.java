package �ؼ���super��this;
public class Test {
	public static void main(String[] args) {
		new C();
	}
}
class A{
	public A() {
		System.out.println("A���޲������췽��");
	}	
}
class B extends A{
	public B() {
	//super();  �������Զ�����B���޲������췽��ʱ��   jvm�����������Դ��������
	// TODO Auto-generated constructor stub
		System.out.println("B���޲������췽��");
	}
	public B(String name) {
		System.out.println("B���в����Ĺ��췽��");
		
	}
}
class C extends B{

	public C() {
		this("chenhao");
		//super();//�ֶ����             �����  ABC ���޲������췽�� ����
		//super();�Զ����ɹ��췽�� �������  Ĭ��
		// TODO Auto-generated constructor stub
		System.out.println("C���޲������췽��");
		
	}

	public C(String name) {
		super();
		//�����и�super��name��  �������super()����Ĳ���  ��Ĭ��Ϊsuper
		//super(name);�Զ����ɹ��췽���������
		// TODO Auto-generated constructor stub
		System.out.println("C���в������췽��");
		System.out.println("CCCC");
	}
	
}