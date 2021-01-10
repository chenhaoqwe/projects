package project;

public class Stu_class {
	String name;
	String stu_id;
	String sex;
	String phone_num;
	int age;
		
	public Stu_class(String name,String stu_id, int age, String phone_num, String sex) {
		this.name = name;
	
		this.stu_id = stu_id;
		this.phone_num = phone_num;
		this.sex = sex;
		this.age = age;
	}
	public String getName() {
		return name;
	}

	public String getStu_id() {
		return stu_id;
	}
	public int getAge() {
		return age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public void setId_num(String stu_id) {
		this.stu_id = stu_id;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setPhone_num(String phone_num) {
		this.phone_num = phone_num;
	}
	public void display() {
		System.out.println("姓名:"+name+"\n"+"年龄:"+age+"\n"+"性别:"+sex+"\n"+"学号:"+stu_id+"\n"+"手机号:"+phone_num);
	}
}