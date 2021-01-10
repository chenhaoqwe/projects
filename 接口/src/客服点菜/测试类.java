package 客服点菜;

public class 测试类 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Foodmeau meau=new China();//创建一个厨师，运用多态，父类的引用指向子类的对象
		Customer chenhao=new Customer(meau);//创建一个顾客
		chenhao.diancai(meau);//顾客开始点菜
	}
}
