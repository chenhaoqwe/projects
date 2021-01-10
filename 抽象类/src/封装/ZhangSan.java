package 封装;

/*
 * 1OOP的介绍1.1OOP的特点封装：
 * 面向对象编程的核心思想，将对象的属性和行为封装起来
 * 将对象的属性和行为封装起来的载体就是类
 * 类是抽象的，把属性的细节和行为隐藏（private），就是封装
 */
public class ZhangSan {
	String name="张三";
	int age=19;
	private int money;//封装的思想  不能直接访问  而是要通过某种手段
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public void eat() {
		System.out.println("人会吃饭");
	}

}
