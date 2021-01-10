package 继承;

/*1.继承的话  子类会继承父类的方法和属性
 *2同时子类还可以在子类的基础上添加属性和方法
 *3.子类只能有一个父类 父类可以有多个父类
 * 4.并且父类引用可以指向子类的对象  同时可以调用方法
 */
public class B extends A {
	
	public void eat(){
		
		System.out.println("B、吃饭了");
	}

}
