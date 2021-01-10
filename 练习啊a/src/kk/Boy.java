package kk;





public class Boy {
	private String name;
	private int age;
	
	//无参数构造器
	public Boy(){
		
	}
	public Boy(String name, int age){
		this.name=name;
		this.age=age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	//结婚方法
	public static void marry(Girl girl){
		System.out.println("我想要娶"+girl);
	}

	
	
	
	
	
}

