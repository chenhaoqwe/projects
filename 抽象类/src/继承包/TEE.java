package 继承包;

/*
 * super在子类中用的话 调用的是父类的方法 或者属性
 * super可以出现在静态和实例方法中
 * super在子类无参数的构造器中默认在第一行 去调用父类的无参数
 * 如果父类有参数构造方法  子类使用super传递参数时  不会在调用super() 而是有参数构造方法;
 * 但是有this也不能有super 因为都必须放在首位第一行
 * 模拟现实就是说：有父亲才有儿子
 * 就是说子类里面的每个构造器的第一行 代码都有个隐形代码为super调用父类的无参数构造方法
 */


public class TEE {
	public static void main(String[] args) {
		new C();
	
	}
}
class A{
	//A的无参数构造方法
	public  A() {
		System.out.println("A1");
	}
}
class B extends A{
	//B的无参数构造方法
	public B() {
		//这里有个supper方法
		//thisS
		System.out.println("B1");
	}
	//B的有参数构造方法
	public B(String a) {
		System.out.println("B2");
	}
}
class C extends B{
	//c的无参数构造方法
	public C() {
		this("a");
		System.out.println("c的无参数构造方法");
		
	}
	//c的一个有参数方法
	public C(String name) {
		this("c",10);
		System.out.println("c1");
	}
	//c的；两个有参数方法
	public C(String name,int age) {
		//这里有个super
		System.out.println("c2");
	}
}