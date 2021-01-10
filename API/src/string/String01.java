package string;
/**
 * 8大数据基本类型  byte int  short long float double char boolean
 * 疑问：String 不属于基本类型 是引用数据类型  既然是引用类型是不是就可以创建对象  进行各种操作呢？
 * 1.String类可以创建对象  但是一般不用 因为你还要在堆里面开辟空间 地址不断的传来传去 	
 * 2.一旦在常量池有了一个字符串是不能修改的 哪怕是私有 却没有set方法.代码证明
 * 3.原来以前new 的对象里面的属性是字符串或者基本数据类型的 都保存的是地址啊
 * 4.因为我们会经常用到基本数据类型和一些字符串所以将它保存到常量池中 
 * 继当我们新建某个字符串或者基本数据类型首先来到的是常量池中找有没有  有的话把地址给他就好了
 * 5.String类型的字符串 也可以进行调用方法 真神奇
 * @ClassName: String01
 * @Description: TODO
 * @author chenhao
 * @date 2021-01-01 11:17:34
 */
public class String01 {
	public static void main(String[] args) {
		//String s1=new String("ch");//发现可以是的   但是new 就会创建对象是吧
		//String s2="ch";
		//大家都知道吧 ==比较的是内存地址 则s1==s2？
		//if(s1==s2) System.out.println("地址一样");
		//System.out.println("地址不一样");//结果为不一样  所以s1不等于s2
		
		//String s3="ch";
		//System.out.println(s2==s3);//结果为true  s1==s2
		//所以得出结论new String对象在堆里面 可以new 那么s1就是引用 该引用保存的是new String
		//的对象的内存地址  new String里面保存的又是常量池子"ch"的地址
		//那么既然new String对象保存了 “ch”内存地址  那么是不是表面值也一样呢
		//if(s1.equals(s2)) {
		//	System.out.println("s1和s2的值相等");//结果是s1和s2的值相等  表面值一样
		//}
		/*
		 *       以上 推得  s1应该就像 A a=new A(); a.name="ch";  s1.xx="ch";
		 * 	所以我们其实可以猜测这个name是不是保存的地址 而不是一个值呢
		           因为字符串都在常量池子里 那么接下来我要做个证明 它到底是个值还是内存地址
		           因此我们创建一个类去 验证
		 */
//		A a=new A("ch");
//		String b="ch";
//		if(a.name==b) {//其实这样没报错就是证明name里面是内存地址 因为字符串不能==比较
//			System.out.println("地址");//结果就是地址
//		}

		/*
		 * 那么int a=1什么情况呢 是不是在常量池子 呢
		 */
//		A a=new A(2);
//		int b=2;
//		if(a.no==b) {
//			System.out.println("地址一样" );//结果地址一样 是不是颠覆了很多想法呢
//		}
		//既然string是个引用类型那么 String a="c"=new String("c");那这个"c"可以干嘛
		String a="c";
		"c".equals(a);//发现这个"c"可以调用方法 那么谁可以调用方法呢 对象引用啊
		//但是这个基本数据类型就不可以调用方法 真神奇  所以这个字符串"c"是个字符串对象
	}
}
class A{
	int no;
	public A(int no) {
		this.no=no;
	}
	//String name;
	//public A(String name) {
		//this.name=name;
	//}
}