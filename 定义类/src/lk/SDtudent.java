package lk;

//提高程序的安全性，保护数据
//隐藏代码的实现细节
//统一接口
//系统可维护性增加了
//属性私有 get  set
public class SDtudent {
	String name;
	int no;
	Address addr;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
