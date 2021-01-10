package project;
import java.util.*;

public class Add_stu_info {
	Scanner con;
	public Add_stu_info(Scanner con) {
		this.con = con;
	}
	public void add_stu_info(LinkedList<Stu_class>stu,Tool tool) {
		//Scanner con = new Scanner(System.in);
		String s = "***********************************";
		System.out.print(s+"\n请输入添加学生的姓名>>>");
		String name = con.next();
		System.out.print("请输入添加学生的性别>>>");
		String sex = con.next();
		System.out.print("请输入添加学生的年龄>>>");
		int age = con.nextInt();
		System.out.print("请输入添加学生的学号>>>");
		String id = con.next();
		System.out.print("请输入添加学生的手机号>>>");
		String phone_num = con.next();
		Stu_class student = new Stu_class(name, id, age, phone_num, sex);
		stu.add(student);
		System.out.println("添加完成!!!\n"+s);
		
		//返回上一级目录
		System.out.println("请输入:\n1、返回上一级目录\t2、退出系统");
		tool.welcome_custome();
		tool.check_choose(tool);
	
	}
}