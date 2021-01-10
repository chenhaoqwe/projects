package 集合类;

import java.util.ArrayList;

public class QQ {
	String name;
	int age;
	public static void main(String[] args) {
		ArrayList a =new ArrayList();
		QQ q1=new QQ();
		q1.name="陈浩";
		q1.age=19;
		a.add(q1);
		System.out.println(a.get(0));
	}
	public String toString(){
		return "该好友是"+name+"年龄是"+age;
		
	}

}
