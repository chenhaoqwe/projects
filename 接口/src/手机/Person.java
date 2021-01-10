package ÊÖ»ú;

public class Person {

	private Phone ph;
	public Person(Phone ph){
		this.ph=ph;
		
		
	}
	public Phone getPh() {
		return ph;
	}
	public void setPhone(Phone ph) {
		this.ph = ph;
	}
	public void denglu(Phone ph){
		ph.qq();
		ph.weixin();
		
	}
}
