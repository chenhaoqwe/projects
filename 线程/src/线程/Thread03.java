package 线程;

public class Thread03 {
	public static void main(String[] args) {
		Thread b=Thread.currentThread();//获取当前线程的引用对象的线程名字
		System.out.println(b.getName());
		b.setName("主线程");
		System.out.println(b.getName());
		Thread a=new Thread(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("你在干嘛");
			}
			
		});
		a.start();
		try {
			a.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("你是憨憨");
		
	}

}
