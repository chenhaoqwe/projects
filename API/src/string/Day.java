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
		//�жϵ�ַ==
		if(a==b) {
			System.out.println("��ַ��ͬ");
		}
		else System.out.println("�ڴ��ַ����ͬ");
		System.out.println("*************");
		//�ж�ֵ��ͬ equals
		if(a.equals(b)){
			System.out.println("zhi��ͬ");	
		}
		else System.out.println("zhi����ͬ");
	}
}
