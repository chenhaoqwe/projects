package project;
import java.util.*;
/**
 * 1��������Ҫ�޸�ѧ����Ϣ������
 * 2����������������б��в�ѯ
 * 3����ѯ���ɹ�,�����û���������,���ҳɹ�������޸�
 *
 */
public class Chaneg_stu_info {
	Scanner con;
	public Chaneg_stu_info(Scanner con) {
		this.con = con;
	}
	public void change_stu_info(LinkedList<Stu_class>stu,Tool tool) {
		System.out.print("����������Ҫ�޸�ѧ����Ϣ������>>>");
		String name = con.next();
		boolean flag = false;
		for(int i = 0;i<stu.size();i++) {
			if(name.equals(stu.get(i).getName())) {
			//	Scanner cox = new Scanner(System.in);
				flag = true;
				System.out.print("�������޸ĺ������>>>");
				String change_name = con.next();
				System.out.println();
				System.out.print("�������޸ĺ������>>>");
				int change_age = con.nextInt();
				System.out.println();
				System.out.print("�������޸ĺ��ѧ��>>>");
				String change_id = con.next();
				System.out.println();
				System.out.print("�������޸ĺ���Ա�>>>");
				String change_sex = con.next();
				System.out.println();
				System.out.print("�������޸ĺ���ֻ���>>>");
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
			System.out.println("�޸����!!!\n1��������һ���˵�\t2���˳�ϵͳ");
			int choose = con.nextInt();
			if(choose == 1)
				tool.return_last(tool);
			if(choose == 2)
				System.exit(-1);
		}
		if(flag == false) {
			System.out.println("δ�ҵ���ѧ����Ϣ\n1����������\t2���˳�");
			int choose = con.nextInt();
			if(choose == 1)
				change_stu_info(stu, tool);
			if(choose == 2)
				System.exit(-1);
		}
	}
}