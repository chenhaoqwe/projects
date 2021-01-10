package 多态包;
/*
 * 多态
 * 个人理解：
 * 就是一个很有钱的老板。 他有许多个儿子继承了他的钱。 然后呢，他也可以使用这个继承的钱。但是他儿子呢也可以拿着这个钱扩张 就有一天我突然没钱了 他爸爸也没钱了 不过我要用钱 就让他爸爸去使用儿子的钱给我 这样我也少了和他儿子的过多干涉
 */
public class Test {

	public static void main(String[] args) {
		
		Master master=new Master();
		master.feed(new Cat());
		System.out.print(1);
	}
}
