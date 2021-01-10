package 关键字super和this;
public class Test {
	public static void main(String[] args) {
		new C();
	}
}
class A{
	public A() {
		System.out.println("A的无参数构造方法");
	}	
}
class B extends A{
	public B() {
	//super();  当我们自动生成B的无参数构造方法时候   jvm虚拟机会给你自带出现这个
	// TODO Auto-generated constructor stub
		System.out.println("B的无参数构造方法");
	}
	public B(String name) {
		System.out.println("B的有参数的构造方法");
		
	}
}
class C extends B{

	public C() {
		this("chenhao");
		//super();//手动添加             结果是  ABC 的无参数构造方法 三句
		//super();自动生成构造方法 都会出现  默认
		// TODO Auto-generated constructor stub
		System.out.println("C的无参数构造方法");
		
	}

	public C(String name) {
		super();
		//这里有个super（name）  如果擦掉super()里面的参数  就默认为super
		//super(name);自动生成构造方法都会出现
		// TODO Auto-generated constructor stub
		System.out.println("C的有参数构造方法");
		System.out.println("CCCC");
	}
	
}