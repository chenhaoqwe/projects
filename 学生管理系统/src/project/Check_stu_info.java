package project;
import java.util.*;
/**查看信息
 * 1、提示用户所需
 * 2、查看所有学生信息
 * 3、查看个别学生信息
 * 4、当信息查询不到时,提醒并跳入注册学生信息函数界面.
 */
public class Check_stu_info {
	Scanner con;
	Add_stu_info stu_info;
	public Check_stu_info(Scanner con,Add_stu_info stu_info) {
		this.con = con;
		this.stu_info = stu_info;
	}
	public void welcome_check_choose() {	
			String s = "***********************************";
			System.out.println(s);
			System.out.println("欢迎进入校园卡查询信息界面,您可以进行以下操作:\n1、查看全部信息\n2、查看个人信息\n3、返回上一级目录\n4、退出");
			System.out.println(s);
			System.out.print("请选择你需要进行的操作>>>");
	}
	public  void check_choose(LinkedList<Stu_class>stu,Tool tool) {
		int choose = con.nextInt();
		switch(choose) {	
			case 1:
				//查看全部学生信息
				show_all_stu_info(stu,tool);
				//con.close();
				break;
			case 2:
				//查看个人信息
				one_stu_info(stu,tool,stu_info);
				//con.close();
				break;
			case 3:
				tool.return_last(tool);
				//返回上一级目录
				//con.close();
				break;
			case 4:
				System.out.println("退出系统成功!!!");
				System.exit(-1);
				//con.close();
				//退出系统
			default:
				System.out.println("输入有误,请重新输入>>>");
				check_choose(stu,tool);
		}
	}
	//检查一个人的信息
	public void one_stu_info(LinkedList<Stu_class>stu,Tool tool,Add_stu_info stu_info) {
		//Scanner con = new Scanner(System.in);
		System.out.println("请输人你需要查找学生的姓名>>>");
		String name = con.next();
		//con.close();
		boolean flag = false;
		if(stu.size() == 0) {
			System.out.println("未添加学生信息,请先添加学生信息!!!\n1、添加学生信息\t2、退出系统\n请输入>>>");
			int choose = con.nextInt();
			if(choose == 1)
				stu_info.add_stu_info(stu,tool);
			if(choose == 2)
				System.exit(-1);
				
		}
		if(stu.size() > 0)
			{
			for(int i = 0;i < stu.size();i++) {
				System.out.println("2");
				if(stu.get(i).getName()==name) {
					stu.get(i).display();
					flag = true;
					break;
			}
		}
		if(flag==true) {
			System.out.println("查找成功!!!\n1、继续查找学生信息\t2、返回上一级菜单\t3、退出系统");
			int choose = con.nextInt();
			switch(choose) {
				case 1:
					one_stu_info(stu, tool,stu_info);
					break;
				case 2:
					tool.return_last(tool);
					break;
				case 3:
					System.exit(-1);
			}
		}
			
			
		if(flag == false)
			{
			System.out.println("未查到学生信息,1、重新输入\t2、返回上一级菜单\n请输入>>>");
			int choose = con.nextInt();
			if(choose == 1)
				one_stu_info(stu, tool, stu_info);
			if(choose == 2)
				tool.return_last(tool);
			}
			}
	}
	//查询所有人的信息 
	public void show_all_stu_info(LinkedList<Stu_class>stu,Tool tool) {
		if(stu.size() == 0) {
			System.out.println("未添加学生信息,请先添加学生信息!!!\n1、添加学生信息\t2、退出系统\n请输入>>>");
			int choose = con.nextInt();
			if(choose == 1)
				stu_info.add_stu_info(stu,tool);
			if(choose == 2)
				System.exit(-1);
				
		}
		else {
		for(int i = 0;i<stu.size();i++)
			stu.get(i).display();
		System.out.println("请输入:\n1、返回上一级目录\t2、退出系统");
		int choose = con.nextInt();
		if(choose == 1) {
			tool.return_last(tool);
		}
		if(choose == 2) {
			System.out.println("退出系统成功!!!");
			System.exit(-1);
		}
		}
	}
}