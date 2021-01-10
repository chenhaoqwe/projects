package 手机;

public class 测试类 {
public static void main(String[] args){
	

	Phone p1=new Wife();//创建一个人的对象，并且使用多态，让父类的引用指向子类的对象
    Person chenhao=new Person(p1);
   chenhao.denglu(p1);
}
	}
