package ������;

import java.util.ArrayList;

public class QQ {
	String name;
	int age;
	public static void main(String[] args) {
		ArrayList a =new ArrayList();
		QQ q1=new QQ();
		q1.name="�º�";
		q1.age=19;
		a.add(q1);
		System.out.println(a.get(0));
	}
	public String toString(){
		return "�ú�����"+name+"������"+age;
		
	}

}
