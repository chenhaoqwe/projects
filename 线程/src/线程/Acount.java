package �߳�;
/**
 * �˻���
 * @ClassName: Acount
 * @Description: TODO
 * @author chenhao
 * @date 2021-01-02 01:56:37
 */
public class Acount {
	private String zhanghu;
	private double money;
	
	public Acount(String zhanghu, double money) {
		super();
		this.zhanghu = zhanghu;
		this.money = money;
	}
	public String getZhanghu() {return zhanghu;}
	public void setZhanghu(String zhanghu) {this.zhanghu = zhanghu;}
	public double getMoney() {return money;}
	public void setMoney(double money) {this.money = money;}

	/*
	 * ȡǮ�ķ���
	 */
	public void quqian(double money) {
		synchronized(this){
			//��ѯ���
		    double before=this.getMoney();
			//ȡǮ
			double after=before-money;
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			//ˢ�����
			this.setMoney(after);
		}
	

		
	}
}
