

package �߳�;

public class AcountThead extends Thread {
	private Acount act;
	public AcountThead() {
		
	}
	public AcountThead(Acount act) {
		this.act=act;
	}
	public void run() {
		//��ʾȡ�����
		double money=5000.0;
		act.quqian(money);
		System.out.println(Thread.currentThread().getName()+"�˻� "+act.getZhanghu()+"ȡ��ɹ������Ϊ"+act.getMoney());
	}
	

}
