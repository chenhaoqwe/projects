package project;
import java.util.*;
/**�鿴��Ϣ
 * 1����ʾ�û�����
 * 2���鿴����ѧ����Ϣ
 * 3���鿴����ѧ����Ϣ
 * 4������Ϣ��ѯ����ʱ,���Ѳ�����ע��ѧ����Ϣ��������.
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
			System.out.println("��ӭ����У԰����ѯ��Ϣ����,�����Խ������²���:\n1���鿴ȫ����Ϣ\n2���鿴������Ϣ\n3��������һ��Ŀ¼\n4���˳�");
			System.out.println(s);
			System.out.print("��ѡ������Ҫ���еĲ���>>>");
	}
	public  void check_choose(LinkedList<Stu_class>stu,Tool tool) {
		int choose = con.nextInt();
		switch(choose) {	
			case 1:
				//�鿴ȫ��ѧ����Ϣ
				show_all_stu_info(stu,tool);
				//con.close();
				break;
			case 2:
				//�鿴������Ϣ
				one_stu_info(stu,tool,stu_info);
				//con.close();
				break;
			case 3:
				tool.return_last(tool);
				//������һ��Ŀ¼
				//con.close();
				break;
			case 4:
				System.out.println("�˳�ϵͳ�ɹ�!!!");
				System.exit(-1);
				//con.close();
				//�˳�ϵͳ
			default:
				System.out.println("��������,����������>>>");
				check_choose(stu,tool);
		}
	}
	//���һ���˵���Ϣ
	public void one_stu_info(LinkedList<Stu_class>stu,Tool tool,Add_stu_info stu_info) {
		//Scanner con = new Scanner(System.in);
		System.out.println("����������Ҫ����ѧ��������>>>");
		String name = con.next();
		//con.close();
		boolean flag = false;
		if(stu.size() == 0) {
			System.out.println("δ���ѧ����Ϣ,�������ѧ����Ϣ!!!\n1�����ѧ����Ϣ\t2���˳�ϵͳ\n������>>>");
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
			System.out.println("���ҳɹ�!!!\n1����������ѧ����Ϣ\t2��������һ���˵�\t3���˳�ϵͳ");
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
			System.out.println("δ�鵽ѧ����Ϣ,1����������\t2��������һ���˵�\n������>>>");
			int choose = con.nextInt();
			if(choose == 1)
				one_stu_info(stu, tool, stu_info);
			if(choose == 2)
				tool.return_last(tool);
			}
			}
	}
	//��ѯ�����˵���Ϣ 
	public void show_all_stu_info(LinkedList<Stu_class>stu,Tool tool) {
		if(stu.size() == 0) {
			System.out.println("δ���ѧ����Ϣ,�������ѧ����Ϣ!!!\n1�����ѧ����Ϣ\t2���˳�ϵͳ\n������>>>");
			int choose = con.nextInt();
			if(choose == 1)
				stu_info.add_stu_info(stu,tool);
			if(choose == 2)
				System.exit(-1);
				
		}
		else {
		for(int i = 0;i<stu.size();i++)
			stu.get(i).display();
		System.out.println("������:\n1��������һ��Ŀ¼\t2���˳�ϵͳ");
		int choose = con.nextInt();
		if(choose == 1) {
			tool.return_last(tool);
		}
		if(choose == 2) {
			System.out.println("�˳�ϵͳ�ɹ�!!!");
			System.exit(-1);
		}
		}
	}
}