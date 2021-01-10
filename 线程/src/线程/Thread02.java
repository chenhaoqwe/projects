package 线程;

public class Thread02{
	public static void main(String[] args) {
		MyThread t=new MyThread();
		t.run();
		for(int j=0;j<100;j++){
			System.out.println("主线程"+j);
		}
	}
}
class MyThread extends Thread{
	public void run(){
		for(int i=0;i<100;i++){
			System.out.println("分支线程"+i);
		}
		
	}
}