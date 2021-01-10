package project;
import java.util.*;

public class Tool {
	Check_stu_info stu_choose;
	Chaneg_stu_info change_stu;
	Add_stu_info stu_info;
	LinkedList<Stu_class>stu;
	Scanner con ;
	public Tool(LinkedList<Stu_class>stu,Check_stu_info stu_choose,Chaneg_stu_info change_stu,Add_stu_info stu_info,Scanner con) {
		this.stu_choose = stu_choose;
		this.change_stu = change_stu;
		this.stu_info =stu_info;
		this.con = con;
		this.stu = stu;
	}
	public void welcome_custome() {
		String s = "***********************************";
		System.out.println(s);
		System.out.println("欢迎进入学生管理系统!"+"\n"+"您可以进行以下操作:\n1、查看学生信息\n2、修改个人信息\n3、注册新账号\n4、退出系统");
		System.out.println(s);
		System.out.print("请选择你需要进行的操作>>>");
	}
	public void check_choose(Tool tool) {
		int choose = con.nextInt();
		switch(choose) {
		case 1:
			stu_choose.welcome_check_choose();
			stu_choose.check_choose(stu,tool);
			//查看个人信息函数
			//con.close();
			break;
		case 2:
			change_stu.change_stu_info(stu,tool);
			//修改个人信息函数
			//con.close();
			break;
		case 3:
			stu_info.add_stu_info(stu,tool);
			//注册新账号
			//con.close();
			break;
		case 4:
			//退出系统
			System.out.println("退出系统成功!!!");
			con.close();
			System.exit(-1);
			break;
		default:
			System.out.print("输入有误,请重新输入>>>");
			check_choose(tool);
	}
	}
	public void return_last(Tool tool) {
		welcome_custome();
		check_choose(tool);
	}

}
