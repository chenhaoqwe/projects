package �쳣;
/*
 * ������������   ����Ҫ��ʹ���쳣���񵱷�ĸΪ��ʱ
 */

public class Tsr {
	//��������
	public static void main(String[] args) {
		//
		sumDevied(2,0);
	}
	@SuppressWarnings("unused")
	public static void sumDevied(int a,int b){
		try {
			int c=a/b;
			System.out.println(c);
			//������뵽����˵���˷�ĸ��Ϊ��
		} catch (Exception e) {
			System.out.println("��ĸ����Ϊ��");
			// TODO: handle exception
		}
	
		
		
	}

}
