package 继承;
//父类 派生类
//子类继承了父类，可以使用父类的任何使用方法
//public 子类可以用  private 子类不可以用  protected
//在Java中所有的类  默认继承object类
//一个儿子只能有一个父亲，一个父亲可以有多个儿子
//super调用父类，访问父类，但是私有无法被继承
//子类调用构造器。必须把super放在第一
//调用构造器要么用自己要么用父类
public class Person {
	public Person(){
		System.out.println("我是你爸爸");
	}

}
