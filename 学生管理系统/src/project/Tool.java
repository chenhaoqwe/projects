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
		System.out.println("��ӭ����ѧ������ϵͳ!"+"\n"+"�����Խ������²���:\n1���鿴ѧ����Ϣ\n2���޸ĸ�����Ϣ\n3��ע�����˺�\n4���˳�ϵͳ");
		System.out.println(s);
		System.out.print("��ѡ������Ҫ���еĲ���>>>");
	}
	public void check_choose(Tool tool) {
		int choose = con.nextInt();
		switch(choose) {
		case 1:
			stu_choose.welcome_check_choose();
			stu_choose.check_choose(stu,tool);
			//�鿴������Ϣ����
			//con.close();
			break;
		case 2:
			change_stu.change_stu_info(stu,tool);
			//�޸ĸ�����Ϣ����
			//con.close();
			break;
		case 3:
			stu_info.add_stu_info(stu,tool);
			//ע�����˺�
			//con.close();
			break;
		case 4:
			//�˳�ϵͳ
			System.out.println("�˳�ϵͳ�ɹ�!!!");
			con.close();
			System.exit(-1);
			break;
		default:
			System.out.print("��������,����������>>>");
			check_choose(tool);
	}
	}
	public void return_last(Tool tool) {
		welcome_custome();
		check_choose(tool);
	}

}
