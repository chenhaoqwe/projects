package ���������;

import java.util.Scanner;

public class Xiao {
	public static void main(String[] args) {
		boolean flag=true;
		while(flag) {
			System.out.println("��������");
			Scanner s=new Scanner(System.in);
			String r=s.nextLine();
			if(r.equals("��")) {
				System.out.println("1");
				show();
				break;
			}
			
		}
	}

	private static void show() {
		// TODO Auto-generated method stub
	
		System.out.println("2");
	}

}
