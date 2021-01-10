package project;

import java.util.LinkedList;
import java.util.Scanner;

public class Stu_main {
		static LinkedList<Stu_class>stu;
	public static void main(String[] args) {
		//欢迎界面
		//创建存放学生信息的列表
		stu = new LinkedList<Stu_class>();
		//创建输入入口
		Scanner con = new Scanner(System.in);
		//创建添加学生信息的对象
		Add_stu_info stu_info = new Add_stu_info(con);
		//创建修改学生信息的对象
		Chaneg_stu_info change_stu = new Chaneg_stu_info(con);
		//创建查询学生信息的对象
		Check_stu_info stu_choose = new Check_stu_info(con,stu_info);
		//创建工具类对象
		Tool tool = new Tool(stu,stu_choose,change_stu,stu_info,con);
		tool.welcome_custome();
		tool.check_choose(tool);
		con.close();
	}

}