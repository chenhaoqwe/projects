package object;
//equls用来判断对象是否相等
public class 判断法 {

	public static void main(String[] args){
		//判断两个基本数据的类型值是否相等，直接使用==
		int a=100;
		int b=100;
		System.out.println(a==b);//若返回true就说明两个相等
		/**
		 * 判断对象之间是否相等，是否用==
		 */
		Student s1=new Student("陈浩","邵阳","1429542285");
		Student s2=new Student("陈浩","邵阳","1429542285");
		System.out.println(s1==s2);
	
	}
}

class Student{
	String name;
	String city;
	String zipcode;
	public Student(String name,String city,String zipcode){
		this.name=name;
		this.city=city;
		this.zipcode=zipcode;
		
	}
}