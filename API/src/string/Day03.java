package string;
/**
 * ## 非null的字符串.toLowerCase()
 把里面的大写字母全部转化成小写字母
 * @ClassName: Day03
 * @Description: TODO
 * @author chenhao
 * @date 2020-12-30 11:13:50
 */
public class Day03 {
	public static void main(String[] args) {
		String a="ABCdefKKKKlLL";
		String b=a.toLowerCase();//这里必须使用一个string的引用接受 否则输出还是没变得
		System.out.println(b);
	}

}
