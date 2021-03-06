package 抽象包;
/*
 * 抽象类
 * 1.抽象类里面可以没有抽象方法
 * 2.抽象类必须由abstract修饰
 * 3.抽象类的抽象子类可以不实现抽象方法

 * 
 * 抽象方法
 * 1.抽象方法必须由abstract修饰
 * 2.抽象方法必须在抽象类里面
 * 3.如果父类为抽象类并且有抽象方法 那么继承它的子类必须要去实现这个方法 除非这个类是抽象类、
 * 4.抽象方法不可以带有方法体
 */
public abstract class Pet {
	public abstract void eat();
	

}
