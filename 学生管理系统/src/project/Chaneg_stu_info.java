package project;
import java.util.*;
/**
 * 1、输入想要修改学生信息的名字
 * 2、将输入的名字在列表中查询
 * 3、查询不成功,提醒用户重新输入,查找成功后进行修改
 *
 */
public class Chaneg_stu_info {
	Scanner con;
	public Chaneg_stu_info(Scanner con) {
		this.con = con;
	}
	public void change_stu_info(LinkedList<Stu_class>stu,Tool tool) {
		System.out.print("请输入你想要修改学生信息的姓名>>>");
		String name = con.next();
		boolean flag = false;
		for(int i = 0;i<stu.size();i++) {
			if(name.equals(stu.get(i).getName())) {
			//	Scanner cox = new Scanner(System.in);
				flag = true;
				System.out.print("请输入修改后的姓名>>>");
				String change_name = con.next();
				System.out.println();
				System.out.print("请输入修改后的年龄>>>");
				int change_age = con.nextInt();
				System.out.println();
				System.out.print("请输入修改后的学号>>>");
				String change_id = con.next();
				System.out.println();
				System.out.print("请输入修改后的性别>>>");
				String change_sex = con.next();
				System.out.println();
				System.out.print("请输入修改后的手机号>>>");
				String change_phone = con.next();
				System.out.println();
				stu.get(i).setName(change_name);
				stu.get(i).setId_num(change_id);
				stu.get(i).setPhone_num(change_phone);
				stu.get(i).setAge(change_age);
				stu.get(i).setSex(change_sex);
				
			}
		}
		if(flag == true) {
			System.out.println("修改完成!!!\n1、返回上一级菜单\t2、退出系统");
			int choose = con.nextInt();
			if(choose == 1)
				tool.return_last(tool);
			if(choose == 2)
				System.exit(-1);
		}
		if(flag == false) {
			System.out.println("未找到该学生信息\n1、重新输入\t2、退出");
			int choose = con.nextInt();
			if(choose == 1)
				change_stu_info(stu, tool);
			if(choose == 2)
				System.exit(-1);
		}
	}
}