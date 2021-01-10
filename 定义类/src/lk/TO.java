package lk;

public class TO {
public static void main(String[] args){
	SDtudent u=new SDtudent();
	u.name="陈浩";
	u.no=19;
	u.addr=new Address();
	u.addr.city="衡阳";
	u.addr.street="湖南交通工程学院";
	u.addr.zipcode=6666;
	Tool.S("我的名字叫做"+u.name);
	System.out.println("今年"+u.no+"岁");
	Tool.S("我现在在"+u.addr.city);
	Tool.S(u.addr.street);
	System.out.println(u.addr.zipcode);
}
}
