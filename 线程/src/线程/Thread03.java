package �߳�;

public class Thread03 {
	public static void main(String[] args) {
		Thread b=Thread.currentThread();//��ȡ��ǰ�̵߳����ö�����߳�����
		System.out.println(b.getName());
		b.setName("���߳�");
		System.out.println(b.getName());
		Thread a=new Thread(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("���ڸ���");
			}
			
		});
		a.start();
		try {
			a.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("���Ǻ���");
		
	}

}
