package 集合类;

import java.util.HashMap;

public class MapTest {
	
	
	//属性
	String name;
	int age;
	//有参数构造器   一生下来就可以给予它本领
	public MapTest(String name,int age){
		this.name=name;
		this.age=age;
	}
	//重写tostring方法  就是当一个引用调用该方法时候  （就是一个引用去访问数据时候得到的是一个内存地址  而当我重写tostring时候 会返回一个字符串就是要访问的数据 ）
	//但是注意要翔实 简洁明了
	public String toString(){
		return "该好友是"+name+"年龄是"+age;
		
	}
	
	
	public static void main(String[] args){
		HashMap map=new HashMap();//创建一个对象 来存储数据
		 MapTest t1=new  MapTest("陈浩",19);
	
		 map.put(1, t1);//Mapput(key,value) key为关键字 通过这个关键字来找到value  t1表示存储的对象  1就是该关键字
		 System.out.println(map.get(1));
	}

}
  