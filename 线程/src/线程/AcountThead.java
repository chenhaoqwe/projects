

package 线程;

public class AcountThead extends Thread {
	private Acount act;
	public AcountThead() {
		
	}
	public AcountThead(Acount act) {
		this.act=act;
	}
	public void run() {
		//表示取款操作
		double money=5000.0;
		act.quqian(money);
		System.out.println(Thread.currentThread().getName()+"账户 "+act.getZhanghu()+"取款成功，余额为"+act.getMoney());
	}
	

}
