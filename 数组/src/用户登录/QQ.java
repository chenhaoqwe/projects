package �û���¼;

import java.util.*;

public class QQ {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		while (count < 3) {
			System.out.println("�������˺�");
			String name = sc.nextLine();
			System.out.println();
			String pwd = sc.nextLine();
			if ("chenhao".equals(name) && "191120".equals(pwd)) {
				System.out.println("��½�ɹ�");
				break;
			    } 
			    else {
				count++;
				if (count < 3) 
				{
					System.out.println("��¼ʧ�ܣ�����������");
				} 
				else 
				{
					System.out.println("��½�������࣬��֤ʧ��");
					break;
				}
			}
		}

	}

}
