package Ͽ��;

import java.util.Scanner;

public class ���� {
	@SuppressWarnings("unused")
	public static void main(String[] args){
		for(int i=0;i<=9;i++){
			System.out.print("*");
		}
		System.out.print("��ӭ�������ߴ�Ͽ��");
		for(int j=0;j<=9;j++){
			System.out.print("*");
		}
		System.out.println("\t");
		Tool.s("1.qq΢�ź���     2.΢�ź���");	
		Scanner qu=new Scanner(System.in);
		int a=qu.nextInt();
		switch(a){
		case 1:{
			System.out.print("����������˺ţ�                                     ");
			int zh=qu.nextInt();
			System.out.print("������������룺                                    ");
			int mm=qu.nextInt();
			System.out.print("**********************");
			Tool.s("1.�˻�ģʽ    2��1V1ģʽ   3.3V3ģʽ     5.5V5ģʽ    6����λģʽ");
			int mo=qu.nextInt();
			if(mo==1){
				 int  i1=10;
				Tool.s("****************��Ϸ������ʼ*************");
				Tool.s("****ȷ��                        �˳�****");
				Tool.s("          ����10���˼��ʱ��ѡ��Ӣ��                                 ");
		        Tool.s("      ***����ʱ10s��ʼ***                ");
		        while(i1>0){
		        	   System.err.println(i1);
		        	   try {
		        	    Thread.sleep(1000);
		        	   } catch (InterruptedException e) {
		        	    // TODO Auto-generated catch block
		        	    e.printStackTrace();
		        	   }
		        	   i1--;
		        }
		  	  System.err.println(i1);
			  System.err.println("����ʱ����");
				Tool.s("��ѡ����ķ�·");
				Tool.s("1.�Կ�·   2.��·   3����Ұ   4������  5.����·");
				int i2=qu.nextInt();
				if(i2==1){
					Tool.s("��ѡ���·��Ӣ��");
					Tool.s("1.��ľ��   2.����   3.����");
					int i3=qu.nextInt();
					if(i3==1){
						int i4=30;
						int i5=30;
						Tool.s("��Ķ��ѷֱ�����·�������   ����·������      ���ߣ�ţħ   ��Ұ������");
						Tool.s("��Ķ������ڽ���");
						Tool.s("1¥�����ͣ���λ�ֵܣ�");
						Tool.s("5¥:���Ѿ�����4����");
						Tool.s("��:���İɣ��Ҵ���");
						System.out.print("ʤ��:100%");
						System.out.println("����:999��");
						System.out.println("��Ϸ������ʼ");
						while(i4>0){
							System.err.println(i4);
							try{
								Thread.sleep(1000);					
							}
							catch(InterruptedException e){
								e.printStackTrace();
							}
							i4--;
						}
						  System.err.println(i1);
						  System.err.println("��ʼ");
						  Tool.s("&&&&&&&&&&&&       ��ӭ����������ҫ           &&&&&&&&&&&&&");
						  Tool.s("��������������������      �о�����30��󵽴�ս����������������������");
						  Tool.s("��������������������         ��������׼����������������������     ");
						  System.out.println("      �㿪��ӵ��300���");
						  int money=300;
						  int life=3000;
						  int dj=1;
						  Tool.s("1.����̳�     2.������װ��");
						  int i6=qu.nextInt();
						  if(i6==1){
							  System.out.println("1.����   2.����   3.����    4.����   5.����    6.��Ұ");
							  int i7=qu.nextInt();
							  //��ʼ
							  if(i7==1){
								  if(money>=0&&money<=300){
									  Tool.s("1.�����  300���      2.����   220��� 3.Ь��  250���   4������   250���  ");
									  int money1=qu.nextInt();
									  switch(money1){
									  case 1:{
										  int money2=300-300;
										  Tool.s("�㵱ǰ�ľ�����"+money2);
										  Tool.s("С�����ˡ����Ƿ���ǰ�������?");
										  Tool.s("�������������");
										  Tool.s("1.��    2.��");
										  int i8=qu.nextInt();
										  if(i8==1){
											  Tool.s("��������ߣ��͵ط�������Ź��");
											  int life1=2000;
											  int money3=money2+3*50;
											  Tool.s("�㵱ǰ��Ѫ����"+life1);
											  Tool.s("�㵱ǰ��Ѫ����"+money);
											
										  }
										  else{
											  System.err.println("��ѡ������");
											  int life2=3000;
											  int money4=300+3*30;
											  Tool.s("�㵱ǰ��Ѫ����"+life2);
											  Tool.s("�㵱ǰ�ľ�����"+money4);
											  System.out.println("��Ϸ�Ѿ�����1��30��");
											  Tool.s("��ǰ��·��з�Ѿ�ˢ�£��Ƿ�ǰ��");
											  Tool.s("1.��   2.��");
											  int i9=qu.nextInt();
											  if(i9==1){
												  Tool.s("����ǰ����з��·�����������˵�gank");
												  Tool.s("��·��з���Է�����");
											  }
											  else{
												  
											  }
										  
										  }
										
										  break;
									  }
									  case 2:{
										  int money2=300-220;
										  Tool.s("�㵱ǰ�ľ�����"+money2);break;
									  }
									  case 3:{
										  int money2=300-250;
										  Tool.s("�㵱ǰ�ľ�����"+money2);
										  break;
									  }
									  case 4:{
										  int money2=300-250;
										  Tool.s("�㵱ǰ�ľ�����"+money2);
										  break;
									  }
								
									  }
									 
								  }
								  
					
								  Tool.s("1:��������+240�������+1200���������Ψһ����-�׼�:ÿ�����ߵĵо����100�㷨���˺���û��һ������4���˺� ��");
								  Tool.s("2:������װ+2000�������+100ÿ5���Ѫ��Ψһ����-Ѫ��:��ɱ��������5���ڻظ�20%������ֵ����Ч����10��CD�� ");
								  Tool.s("3:��������+270���������+1200���������Ψһ����-����:�ܵ���������ٹ�����30%�����ٶȺ�15%�ƶ��ٶȡ� ");
								  Tool.s("4:����֮��+10��ȴ������+180����������+1100���������+45ÿ4���Ѫ��Ψһ����-�ظ�:�ܵ��˺����������ڻظ�4%������ֵ�����Ч����10���CD��Ψһ����-Ѫͳ:�ܵ����Ƶ�Ч�����20%��");
								  Tool.s("5:ħŮ����+280��������+1100���������Ψһ����-����:ÿ20����һ������450~1500�㷨���˺��Ļ���(����Ч����Ӣ�۵ȼ��ɳ�)");
								  Tool.s("6:����֮��+20��ȴ����+500�����+360���������Ψһ����-����:���ٸ�������30%�����ٶȡ���");
								  Tool.s("7:��������+60��������+10��ȴ����+800�����+360���������Ψһ����-����:ʹ�ü��ܺ��´���ͨ������ɷ�Χ�����������˺������Ч����3����ȴʱ�䡣");
								  Tool.s("8:���ߵıӻ�+140���������+140����������Ψһ����-����:����������ԭ�ظ�����60%Ѫ�������Ч����3����CD��");
								  Tool.s("9:����֮��+60��������+1000���������Ψһ����-��η:�ܵ��˺����һ�����棬ÿ���ṩ2%���ٺ�2%�˺�����ʣ����5�㡣");
								  Tool.s("10:��˪ս��+40��������+1200���������Ψһ����-���:��ͨ���������Ŀ��25%�ƶ��ٶȡ� ���� :�ͱ��Ҽ�һ����ƫ���ڽ����͵ķ���װ���������������������̹�˻���սʿ��");
								  Tool.s("11:Ѫħ֮ŭ+20��������+1000���������Ψһ����-Ѫŭ:����ֵ����30%ʱ���Ѫŭ������40�㹥����ǿ�󻤶ܳ���8�룬Ч����90�� cd��");
								  Tool.s("12:���˴̼�+480���������Ψһ����-����:�ܵ�������Թ����߷��������������Ѫ��1%��ħ���˺���");					  
							  }//
						 }
						  
							while(i5>0){
								System.err.println(i4);
								try{
									Thread.sleep(1000);					
								}
								catch(InterruptedException e){
									e.printStackTrace();
								}
								i4--;
							}
							  System.err.println(i1);
							  System.err.println("�����Ѿ�����ս��");
							  System.exit(0);//�ر�Ӧ�ó��� ��ֹ�˷ѿռ�..
						
					}
				}
				
			}
			
		}
	}
   }
}



