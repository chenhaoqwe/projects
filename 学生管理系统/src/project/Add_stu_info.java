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
		System.out.print(s+"\n���������ѧ��������>>>");
		String name = con.next();
		System.out.print("���������ѧ�����Ա�>>>");
		String sex = con.next();
		System.out.print("���������ѧ��������>>>");
		int age = con.nextInt();
		System.out.print("���������ѧ����ѧ��>>>");
		String id = con.next();
		System.out.print("���������ѧ�����ֻ���>>>");
		String phone_num = con.next();
		Stu_class student = new Stu_class(name, id, age, phone_num, sex);
		stu.add(student);
		System.out.println("������!!!\n"+s);
		
		//������һ��Ŀ¼
		System.out.println("������:\n1��������һ��Ŀ¼\t2���˳�ϵͳ");
		tool.welcome_custome();
		tool.check_choose(tool);
	
	}
}