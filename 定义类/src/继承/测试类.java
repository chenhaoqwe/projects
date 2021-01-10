package 继承;
import 测试类.A;
import 测试类.B;

public class 测试类 {
	
	@SuppressWarnings("unused")
	public static void main(String[] args){
	A a=new A();
	A.test();
	//父类指向子类
	B b=new A();
	B.test();
		
	}

}
