package �ɻ���ս;


public class FjThread extends Thread {

	public MyPanel mypanel;
	
	public FjThread(MyPanel mypanel){
		this.mypanel=mypanel;
	}
	//
	public void run(){
		while(true){
			this.mypanel.repaint();//�ظ�����  ����mypanel
			 try {
	                this.currentThread().sleep(1);
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
		}
	}
	
}
