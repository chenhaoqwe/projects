package project;

import java.util.LinkedList;
import java.util.Scanner;

public class Stu_main {
		static LinkedList<Stu_class>stu;
	public static void main(String[] args) {
		//��ӭ����
		//�������ѧ����Ϣ���б�
		stu = new LinkedList<Stu_class>();
		//�����������
		Scanner con = new Scanner(System.in);
		//�������ѧ����Ϣ�Ķ���
		Add_stu_info stu_info = new Add_stu_info(con);
		//�����޸�ѧ����Ϣ�Ķ���
		Chaneg_stu_info change_stu = new Chaneg_stu_info(con);
		//������ѯѧ����Ϣ�Ķ���
		Check_stu_info stu_choose = new Check_stu_info(con,stu_info);
		//�������������
		Tool tool = new Tool(stu,stu_choose,change_stu,stu_info,con);
		tool.welcome_custome();
		tool.check_choose(tool);
		con.close();
	}

}