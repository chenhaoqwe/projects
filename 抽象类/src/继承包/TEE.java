package �̳а�;

/*
 * super���������õĻ� ���õ��Ǹ���ķ��� ��������
 * super���Գ����ھ�̬��ʵ��������
 * super�������޲����Ĺ�������Ĭ���ڵ�һ�� ȥ���ø�����޲���
 * ��������в������췽��  ����ʹ��super���ݲ���ʱ  �����ڵ���super() �����в������췽��;
 * ������thisҲ������super ��Ϊ�����������λ��һ��
 * ģ����ʵ����˵���и��ײ��ж���
 * ����˵���������ÿ���������ĵ�һ�� ���붼�и����δ���Ϊsuper���ø�����޲������췽��
 */


public class TEE {
	public static void main(String[] args) {
		new C();
	
	}
}
class A{
	//A���޲������췽��
	public  A() {
		System.out.println("A1");
	}
}
class B extends A{
	//B���޲������췽��
	public B() {
		//�����и�supper����
		//thisS
		System.out.println("B1");
	}
	//B���в������췽��
	public B(String a) {
		System.out.println("B2");
	}
}
class C extends B{
	//c���޲������췽��
	public C() {
		this("a");
		System.out.println("c���޲������췽��");
		
	}
	//c��һ���в�������
	public C(String name) {
		this("c",10);
		System.out.println("c1");
	}
	//c�ģ������в�������
	public C(String name,int age) {
		//�����и�super
		System.out.println("c2");
	}
}