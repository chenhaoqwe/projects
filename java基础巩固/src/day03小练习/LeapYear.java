package day03С��ϰ;
/**
 * �ж��Ƿ�Ϊ����
 */
import java.util.Scanner;

/**  
 * @ClassName: LeapYear
 * @Description: TODO
 * @author chenhao
 * @date 2020-12-27 11:59:46 
*/  
public class LeapYear {
	//ʹ��static����
	static 	Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("��������ݣ����磺20��");
		int year=sc.nextInt();
		//����Ļ�Ҫ����4 ��������100��400
		boolean isLeapYear=(year%4==0&&year%100!=0||year%400==0);
	    //���ʽ��1��true��:2(false)
		String msg=isLeapYear?year+"������":year+"��������";
		System.out.println(msg);
	}

}
