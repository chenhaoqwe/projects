package com.homework;
import java.util.Scanner;
public class StringTest {
	 public void Text(){
		 boolean star=true;
		 while(star){
			 Scanner scanner=new Scanner(System.in);
			 String s=scanner.nextLine();
			 if(s!=null&&!s.equals("")){
				 char[] cha=s.toCharArray();
				 char SHOU=cha[0];
				 if(SHOU>=97&&SHOU<=122||(SHOU>=65&&SHOU<=90)){
					 if(s.endsWith("@126.com")||s.endsWith("@163.com")){
					 String ne=s.substring(0,s.indexOf("@"));
					 char chars[]=ne.toCharArray();
					 if(ne.length()>=6&&ne.length()<=16){
						 boolean flag=false;
						 for(int i=0;i<chars.length;i++){
							 if((chars[i]>=48&&chars[i]<=57)||(chars[i]>=65&&chars[i]<=90)||(chars[i]>=97&&chars[i]<=122)){
						    flag=true;
							 }
							 else{System.out.println("������ĸ�ʽ���󣡲��ܺ��ո������������");
							 flag=false;
							 break;
					 }
				 }
						 if(flag){
							 for(int i=0;i<chars.length;i++){
								 //�ж�������ַ�������Ϊ������
								 if((chars[i]>=65&&chars[i]<=90)||(chars[i]<=97&&chars[i]<=122)){
									 flag=false;									 
								 }
								 else{
									 flag=true;
									 break;
								 }
							 }
							 if(flag){
								 System.out.println("��������Ϊ"+s+"�Ѿ�¼��ɹ�");
								 star=false;
							 }
							 else{
								 System.out.println("�������ʽ���󣡲������봿���ֻ��ߴ���ĸ");
							 }
						 }
						 else{
							 System.out.println("������ĸ�ʽ���󣡳��ȱ������6С��16��");
						 }
					
							 
						 }
					 else{
						 System.out.println("������ĸ�ʽ��������ĺ�׺������Ϊ@123.com����@163.com����@163������������");
						 
			 }
		 }
					 else{
						 System.out.println("������ĸ�ʽ��������ĸ����Ϊ��ĸ������������");
					 }
	 }
				 else{
					 System.out.println("����������ݲ���Ϊ��");
				 }

			 }
			 }
		 
	 }
		 public static void main(String[] args) {
				System.out.println("�������������");
				StringTest st = new StringTest();
				st.Text();
	 }
	 }

