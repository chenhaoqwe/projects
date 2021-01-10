package 客服点菜;

public class Customer {
	//顾客有菜单
	private Foodmeau meau;//这就是面向对象中的继承

	public Customer(Foodmeau meau) {
		this.meau=meau;
		// TODO Auto-generated constructor stub
	}

	/*用于顾客得到菜单的信息
	 * @return the meau
	 */
	public Foodmeau getMeau() {
		return meau;
	}

	/**用于创建菜单给顾客看
	 * @param meau the meau to set
	 */
	public void setMeau(Foodmeau meau) {
		this.meau = meau;
	}
	//创建一个点菜的方法
	public void diancai(Foodmeau meau) {
		// TODO Auto-generated method stub
		meau.xihongshichaojidan();//调用接口的方法
		meau.danchaofan();
	}

}
