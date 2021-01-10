package string;
/**
 * equals
 * @ClassName: Day
 * @Description: TODO
 * @author chenhao
 * @date 2020-12-30 10:44:50
 */
public class Day {

	public static void main(String[] args) {
		String a="abc";
		String b="abc";
		//判断地址==
		if(a==b) {
			System.out.println("地址相同");
		}
		else System.out.println("内存地址不相同");
		System.out.println("*************");
		//判断值相同 equals
		if(a.equals(b)){
			System.out.println("zhi相同");	
		}
		else System.out.println("zhi不相同");
	}
}
