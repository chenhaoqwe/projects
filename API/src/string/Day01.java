package string;
/**
 * ʹ��##��null���ַ���.equalsIgnoreCase(�����һ���ַ���)
�ж������ַ�����ֵ�Ƿ���ͬ�����Դ�Сд��ĸ���
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
			System.out.println("����");
		}
	}
}
