package lk;

public class TO {
public static void main(String[] args){
	SDtudent u=new SDtudent();
	u.name="�º�";
	u.no=19;
	u.addr=new Address();
	u.addr.city="����";
	u.addr.street="���Ͻ�ͨ����ѧԺ";
	u.addr.zipcode=6666;
	Tool.S("�ҵ����ֽ���"+u.name);
	System.out.println("����"+u.no+"��");
	Tool.S("��������"+u.addr.city);
	Tool.S(u.addr.street);
	System.out.println(u.addr.zipcode);
}
}
