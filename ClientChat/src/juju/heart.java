package juju;

import java.util.Scanner;

public class heart{
	public static void main(String[] args){
		System.out.println("*********��ӭʹ�ñ�����ϵͳ*********");
		System.out.println("�������:1.����   2��Ϊ����");
		System.out.println("˵��:1.��  2Ů");
		System.out.println("�����뵱ǰ����״��");
		Scanner sr=new Scanner(System.in);
	    int tem=sr.nextInt();
		if(tem==1){
			System.out.println("��������Ա���");
			Scanner q=new Scanner(System.in);
			int w=q.nextInt();
			if(w==1){
				System.out.println("�ף���������Ů������");
				System.out.println("1����  2.û��");
				Scanner t=new Scanner(System.in);
				int xuan=t.nextInt();
				switch(xuan){
				
				case 1:{
					System.out.println("�ǵô�һ������ɡ����Ҫ�������Ů������ʪ��");
					System.out.println("��ǵø�Ů��������ѣ����һ������Ŷ");
					break;
				}
				case 2:{
					System.out.println("ɵ�ϣ�һ���˼ǵ�ҲҪ�չ˺��Լ�Ŷ");
					break;}
		}
			
		}
			else if(w==2){
				System.out.println("С�ɰ�������ת���ˣ��ǵ��չ˺��Լ�,�ӵ��·�Ŷ");
				System.out.println("С�ɰ����ǵô���ɡŶ");
			}
			else{
				System.out.println("�ף������Լ�����ֳ���ٶ��ֲ��������½baidu��com��");
				
			}
		}
		else if(tem==2){
			System.out.println("����Ԫ��������һ�죬�ǵ�Ҫ��찡���������ĵ���");
			System.out.println("�ס����ʵ�ǰ�������¶��Ƕ���(�������ּ���)");
			Scanner sr2=new Scanner(System.in);
			int tem1=sr2.nextInt();
			if(tem1<=25&&tem1>=20){		
				System.out.println("�ס��¶������£�ע���·���ʹ��Ŷ");
			System.out.println("�������Ƿ���ж���");
			System.out.println("1;�У�2��û��");
				int a=sr2.nextInt();
				switch(a){
				case 1:{
					System.out.println("��ô�õ��������ǳ��ʺ�ɢ��Ŷ");
					break;
				}
				case 2:{
					System.out.println("̫�ź��ˡ�ֻ�ܴ�������������Ϸ�˰�");break;
				}
				}
			}
			if(tem1>=25&&tem1<=32){
				System.out.print("�ף��¶��е�ߣ��ǵô�ī��");
				System.out.println("�ǵô�����˪");
			}
			
		}
		System.out.println("ллʹ�ñ���˾�����ļ�ϵͳ������Ƿȱ�������ʼ�1429542285@.com");
		}
	}
	