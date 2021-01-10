package lk;

public class Lianjie {
	@SuppressWarnings({ "unused", "static-access" })
	public static void main(String[] args){
		Boyfriend chenhao=new Boyfriend();
		Girlfriend wangliang=new Girlfriend();
		//
		Boyfriend.name="陈浩";
		Girlfriend.name="王靓";
		Boyfriend.w=wangliang;
		Girlfriend.h=chenhao;
		System.out.println("陈浩的女朋友是"+Boyfriend.w.name);
		}

}
