package 用户登录;

import java.util.*;

public class QQ {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		while (count < 3) {
			System.out.println("请输入账号");
			String name = sc.nextLine();
			System.out.println();
			String pwd = sc.nextLine();
			if ("chenhao".equals(name) && "191120".equals(pwd)) {
				System.out.println("登陆成功");
				break;
			    } 
			    else {
				count++;
				if (count < 3) 
				{
					System.out.println("登录失败，请重新输入");
				} 
				else 
				{
					System.out.println("登陆次数过多，认证失败");
					break;
				}
			}
		}

	}

}
