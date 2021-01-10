package day03小练习;
/**
 * 判断是否为闰年
 */
import java.util.Scanner;

/**  
 * @ClassName: LeapYear
 * @Description: TODO
 * @author chenhao
 * @date 2020-12-27 11:59:46 
*/  
public class LeapYear {
	//使用static修饰
	static 	Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("请输入年份（例如：20）");
		int year=sc.nextInt();
		//闰年的话要整除4 可以整除100和400
		boolean isLeapYear=(year%4==0&&year%100!=0||year%400==0);
	    //表达式？1（true）:2(false)
		String msg=isLeapYear?year+"是闰年":year+"不是闰年";
		System.out.println(msg);
	}

}
