package object;
//equls�����ж϶����Ƿ����
public class �жϷ� {

	public static void main(String[] args){
		//�ж������������ݵ�����ֵ�Ƿ���ȣ�ֱ��ʹ��==
		int a=100;
		int b=100;
		System.out.println(a==b);//������true��˵���������
		/**
		 * �ж϶���֮���Ƿ���ȣ��Ƿ���==
		 */
		Student s1=new Student("�º�","����","1429542285");
		Student s2=new Student("�º�","����","1429542285");
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