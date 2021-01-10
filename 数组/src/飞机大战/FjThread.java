package 飞机大战;


public class FjThread extends Thread {

	public MyPanel mypanel;
	
	public FjThread(MyPanel mypanel){
		this.mypanel=mypanel;
	}
	//
	public void run(){
		while(true){
			this.mypanel.repaint();//重复绘制  调用mypanel
			 try {
	                this.currentThread().sleep(1);
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
		}
	}
	
}
