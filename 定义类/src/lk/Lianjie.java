package lk;

public class Lianjie {
	@SuppressWarnings({ "unused", "static-access" })
	public static void main(String[] args){
		Boyfriend chenhao=new Boyfriend();
		Girlfriend wangliang=new Girlfriend();
		//
		Boyfriend.name="�º�";
		Girlfriend.name="����";
		Boyfriend.w=wangliang;
		Girlfriend.h=chenhao;
		System.out.println("�ºƵ�Ů������"+Boyfriend.w.name);
		}

}
