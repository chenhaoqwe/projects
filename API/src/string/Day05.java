package string;

/**
 * ## 6) ��null���ַ���.concat(����Ҫ���ӵ��ַ���) 
 * �ַ�������û�з����仯�������ķ���ֵ����Ż����ӵ��ַ���
 * 
 * ## ����StringBuilder ��׷���ַ���ʱ�����Ż�������Ҫ���������µ��ַ�������
 * ʹ�õ��ǻ����� ## �����������.append(Ҫ׷�ӵ�ֵ)
 * ���ߵ������� concat��Ҫ�����µĿռ�  StringBuilder����Ҫ�����µĿռ�ֱ����ԭ�����ַ�������׷��
 * @ClassName: Day05
 * @Description: TODO
 * @author chenhao
 * @date 2020-12-30 11:20:49
 */
public class Day05 {

	public static void main(String[] args) {
//		String a="��";
//		String b="��";
//		String c="��";
//		String result=a.concat(b+c);//���ֿ���������  ������Ұ���
//		System.out.println(result);
	
	    String b = "��";
		String c = "��";
	    StringBuilder a=new StringBuilder("��");
	    a.append(b+c);  //������Ұ���
	    System.out.println(a);
	}
}
