package 测试类;
//每一个类都有一个办法。但是系统只有一个入口
public class OOTest {

	public static void main(String[] args){
		Product iphone=new Product();
		iphone.productNo=10;
		iphone.price=10;
		//访问实例变量方法：引用。变量名
		
		System.err.println("商品的编号："+iphone.productNo);
		System.err.println("商品的单价："+iphone.price);
	}
}
