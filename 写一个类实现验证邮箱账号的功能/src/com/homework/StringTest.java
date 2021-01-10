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
							 else{System.out.println("您输入的格式有误！不能含空格及其他特殊符号");
							 flag=false;
							 break;
					 }
				 }
						 if(flag){
							 for(int i=0;i<chars.length;i++){
								 //判断输入的字符串不能为纯数字
								 if((chars[i]>=65&&chars[i]<=90)||(chars[i]<=97&&chars[i]<=122)){
									 flag=false;									 
								 }
								 else{
									 flag=true;
									 break;
								 }
							 }
							 if(flag){
								 System.out.println("您的邮箱为"+s+"已经录入成功");
								 star=false;
							 }
							 else{
								 System.out.println("您输入格式有误！不能输入纯数字或者纯字母");
							 }
						 }
						 else{
							 System.out.println("您输入的格式有误！长度必须大于6小于16！");
						 }
					
							 
						 }
					 else{
						 System.out.println("您输入的格式有误！邮箱的后缀名必须为@123.com或者@163.com或者@163！请重新输入");
						 
			 }
		 }
					 else{
						 System.out.println("你输入的格式有误！首字母必须为字母！请重新输入");
					 }
	 }
				 else{
					 System.out.println("你的输入内容不得为空");
				 }

			 }
			 }
		 
	 }
		 public static void main(String[] args) {
				System.out.println("请输入你的邮箱");
				StringTest st = new StringTest();
				st.Text();
	 }
	 }

