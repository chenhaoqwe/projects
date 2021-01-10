package string;
/**
 * ## 7）非null的字符串.indexOf("子串")
后面这个子串在前面字符串变量的索引位置，如果没找到返回-1

## 8）非null的字符串.lastIndexOf("子串")
针对子串从该字符串对象的后面开始找，找到后从前面从0开始数索引，如果没找到返回-1

## 9）非null的字符串.substring(截取开始索引)
从该索引的位置（包括该索引对应的字符）截取到最后

## 10）非null的字符串.substring(截取开始索引,截取开始索引+截取的长度)
第2个参数减去第一个参数就是截取的长度

## 11）非null的字符串.trim()
清除该字符串的前后空格

## 12）非null的字符串.split(间隔字符);
用间隔字符分割变成一个字符串数组
 * @ClassName: Day06
 * @Description: TODO
 * @author chenhao
 * @date 2020-12-30 11:38:04
 */
public class Day06 {

	public static void main(String[] args) {
//		String a="abe@123.com";
//		int index=a.indexOf("@");//结果是3
//		System.out.println(index);
		
//		String a="abc@123.com.png";
//		int b=a.lastIndexOf(".");//结果是11
//		System.out.println(b);
		
//		String a="abc@123.com.png";
//		System.out.println(a.substring(2));//从该位置索引开始截取该位置以后的也包括该位置
//		输出结果为c@123.com.png

//		String a="abc@123.com.png";
//		System.out.println(a.substring(4, 7));//(截取开始索引,截取开始索引+截取的长度)
//		//结果为123
		
//		String shi="我爱你 你却不在 多少次崩溃在夜里 怎么办 我好想你";
//		String[] arr=shi.split(" ");
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]);
//		}
		//结果为
	  //我爱你
//		你却不在
//		多少次崩溃在夜里
//		怎么办
//		我好想你

	}
}
