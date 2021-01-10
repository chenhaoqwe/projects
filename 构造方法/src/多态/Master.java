package 多态;

public class Master {
	public static void main(String[] args) {
		// 难理解的调用 new Feed().f().eat();
		// 简单的
		Feed feed = new Feed();//创建喂的这个类
		Pet p = feed.f();//接受传来的引用    知道是宠物类但是不知道怎么来的 
		p.eat();//这个p代表是谁 那么就调用谁的方法 就是我知道输出结果代表谁了 不过我不知道这哪里来的狗啊

	}

}
//父类 宠物；类
class Pet {
	public void eat() {

	}
}
//子类 dog 继承于pet
class Dog extends Pet {
	public void eat() {
		System.out.println("喂狗狗吃骨头");
	}
}
//喂养类
class Feed {
	public Pet f() {//返回一个pet类的对象
		Pet a = new Dog();//创建狗狗对象
		return a;//返回引用

	}
}