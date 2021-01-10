package Ïß³Ì;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Acount act=new Acount("act-001",10000.0);
		AcountThead t1=new AcountThead(act);
		AcountThead t2=new AcountThead(act);
		t1.setName("t1");
		t2.setName("t2");
		t1.start();
		t2.start();
	}
}
