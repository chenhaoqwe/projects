package ��Ʊ;

public class A {
   public static void main(String[] args){
	   B b1=new B();
	   b1.setPiaoname("����С����");
	   b1.setPiaoshu(100);
	   System.err.println("��Ʊ�����֣�"+b1.piaoname());
	   System.out.println("��Ʊ��Ŀ��"+b1.getPiaoshu());
	   b1.xiugai("С�ƹ�˾");
	   System.err.println("��Ʊ�����֣�"+b1.piaoname());
	   b1.gai(100);
	   System.out.println("��Ʊ��Ŀ��"+b1.getPiaoshu());
   }
}
