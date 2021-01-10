package �߳�;
/**
 * 1.thread.currentThread  ��ȡ��ǰ�̵߳�����
 * 2.Thread thread=new Thread(); thread.setName();�ı��̵߳�����   getName�õ��̵߳�����
 * 3.thread.interrupt ����̵߳�˯��  �������߳�ִ��
 * 4.try catch ���Ժ��߳�һ����
 * 5.ʹ��boolean ����ǿ���ն��߳�  threa.stop();����Ѿ���ʱ
 * 6.priority���ȼ�  thread.getPriority�õ��̵߳����ȼ� set �������ȼ�
 * 7.�߳�ͬ�������е��﷨��   synchronized����{ͬ�������}����С����
 * ������������ݡ��൱�ؼ� �����Ƕ��̹߳��������  ���ܴﵽ���߳��Ŷ�
 * 
 * @ClassName: Thread01
 * @Description: TODO
 * @author chenhao
 * @date 2021-01-02 12:27:38
 */
public class Thread01 {

	public static void main(String[] args) {
		Thread thread=Thread.currentThread();
		thread.setName("************������ҫ************");
		System.out.println(thread.getName());

		Thread t = new Thread(new A());
		t.start();
		t.interrupt();//�����̼߳���˯��
		Thread t1 = new Thread(new B());
		t1.start();
		Thread t2 = new Thread(new C());
		t2.start();
		Thread t3 = new Thread(new D());
		t3.start();

	}
}

//�̳нӿڱ���Ҫʵ�ֽӿ�δʵ�ֵķ���      �ⲻ��һ���߳���  ��һ�������е���  ������һ���߳�
class A implements Runnable {

	@Override
	public void run() {
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			// TODO: handle exception
		} 
		// TODO Auto-generated method stub
		System.out.println("��ľ������·");
	}

}

class B implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("�����ߴ�Ұ");
	}

}

class C implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("��������е�");
	}

}

class D implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("�����߷���·");
	}

}

class E implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("��������");
	}

}