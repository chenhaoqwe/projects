package 线程;
/**
 * 账户类
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
	 * 取钱的方法
	 */
	public void quqian(double money) {
		synchronized(this){
			//查询余额
		    double before=this.getMoney();
			//取钱
			double after=before-money;
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			//刷新余额
			this.setMoney(after);
		}
	

		
	}
}
