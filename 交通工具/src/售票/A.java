package 售票;

public class A {
   public static void main(String[] args){
	   B b1=new B();
	   b1.setPiaoname("王靓小卖店");
	   b1.setPiaoshu(100);
	   System.err.println("售票点名字："+b1.piaoname());
	   System.out.println("售票数目："+b1.getPiaoshu());
	   b1.xiugai("小浩公司");
	   System.err.println("售票点名字："+b1.piaoname());
	   b1.gai(100);
	   System.out.println("售票数目："+b1.getPiaoshu());
   }
}
