package string;

/**
 * ## 6) 非null的字符串.concat(后面要连接的字符串) 
 * 字符串本身并没有发生变化，方法的返回值后面才会连接的字符串
 * 
 * ## 二）StringBuilder 在追加字符串时做了优化，不需要反复创建新的字符串对象，
 * 使用的是缓冲区 ## 缓冲区对象的.append(要追加的值)
 * 两者的区别是 concat需要开辟新的空间  StringBuilder不需要开辟新的空间直接在原来的字符串后面追加
 * @ClassName: Day05
 * @Description: TODO
 * @author chenhao
 * @date 2020-12-30 11:20:49
 */
public class Day05 {

	public static void main(String[] args) {
//		String a="我";
//		String b="爱";
//		String c="你";
//		String result=a.concat(b+c);//发现可以连起来  结果是我爱你
//		System.out.println(result);
	
	    String b = "爱";
		String c = "你";
	    StringBuilder a=new StringBuilder("我");
	    a.append(b+c);  //结果是我爱你
	    System.out.println(a);
	}
}
