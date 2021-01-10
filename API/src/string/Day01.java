package string;
/**
 * 使用##非null的字符串.equalsIgnoreCase(另外的一个字符串)
判断两个字符串的值是否相同，忽略大小写字母情况
 * @ClassName: Day01
 * @Description: TODO
 * @author chenhao
 * @date 2020-12-30 10:53:16
 */
public class Day01 {
	

	public static void main(String[] args) {
		String a="ABC";
		String b="abc";
		if(a.equalsIgnoreCase(b)) {
			System.out.println("爱你");
		}
	}
}
