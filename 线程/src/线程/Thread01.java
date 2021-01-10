package 线程;
/**
 * 1.thread.currentThread  获取当前线程的名字
 * 2.Thread thread=new Thread(); thread.setName();改变线程的名字   getName得到线程的名字
 * 3.thread.interrupt 打断线程的睡眠  就是让线程执行
 * 4.try catch 可以和线程一起用
 * 5.使用boolean 可以强制终断线程  threa.stop();这个已经过时
 * 6.priority优先级  thread.getPriority得到线程的优先级 set 设置优先级
 * 7.线程同步机制中的语法是   synchronized（）{同步代码库}后面小括号
 * 传的这个“数据”相当关键 必须是多线程共享的数据  才能达到多线程排队
 * 
 * @ClassName: Thread01
 * @Description: TODO
 * @author chenhao
 * @date 2021-01-02 12:27:38
 */
public class Thread01 {

	public static void main(String[] args) {
		Thread thread=Thread.currentThread();
		thread.setName("************王者荣耀************");
		System.out.println(thread.getName());

		Thread t = new Thread(new A());
		t.start();
		t.interrupt();//不让线程继续睡眠
		Thread t1 = new Thread(new B());
		t1.start();
		Thread t2 = new Thread(new C());
		t2.start();
		Thread t3 = new Thread(new D());
		t3.start();

	}
}

//继承接口必须要实现接口未实现的方法      这不是一个线程类  是一个可运行的类  它不是一个线程
class A implements Runnable {

	@Override
	public void run() {
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			// TODO: handle exception
		} 
		// TODO Auto-generated method stub
		System.out.println("花木兰走上路");
	}

}

class B implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("韩信走打野");
	}

}

class C implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("诸葛亮走中单");
	}

}

class D implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("后羿走发育路");
	}

}

class E implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("东皇游走");
	}

}