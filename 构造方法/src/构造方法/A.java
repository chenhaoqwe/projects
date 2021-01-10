package 构造方法;
/**
 *1.一个类里面只能有一个无参数构造方法
 *2.不能出现重复的有参数构造方法 类名可以相同  参数列表个数不要一样
 *3.构造方法创建对象时候　赋予某些特定的属性或者其他
 * @ClassName: A
 * @Description: TODO
 * @author chenhao
 * @date 2020-12-30 04:32:07
 */
public class A {
	//无参数构造方法
	public A(){
		//先注释好
		//System.out.println("A的无参数构造方法");
	}
	//A的有参数构造方法
	public A(int a) {
		//System.out.println("A的有参数构造方法");
	}
	public A(int a,String name) {
		//System.out.println("A的两个有参数构造方法");
	}

	public static void main(String[] args) {
		//Ａ　ａ＝new A（）;该结果为空白
		//同上　当然直接new A()也没事;//就是说我要创建一个 A类的对象  这个结果是A的无参数构造方法
		//new　A(1);该结果就是A的有参数构造方法
		//new A(1,"陈浩");给结果是A的两个有参数构造方法
	}
}
