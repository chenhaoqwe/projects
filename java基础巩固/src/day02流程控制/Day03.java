package day02流程控制;

import java.util.Scanner;

/*
 * if的嵌套使用
 * 做一个小程序来给人在天气变化时候提供建议
 * 要求 ：主程序的代码块尽可能的少 多调用方法
 */
public class Day03 {
	
	Scanner s=new Scanner(System.in);
	
	public Day03(){
	    Tool("*************欢迎使用天气小程序************");
	    Tool("***************1.启动小程序**************");
	    Tool("***************2.退出小程序**************");
	    Tool("***************3.程序说明书**************");
		show();
		
	}
	public static void main(String[] args) {
		new Day03();
	}
	/*
	 * 小工具
	 */
	public void Tool(String string){
		System.out.println(string);
	}
	/*
	 * 启动小程序以后
	 */
	public void show(){
		 Tool("请问当前的天气是：晴天  还是 雨天?");
		 String x=s.nextLine();
		 if(x.equals("晴天"))   sunnyDay();	 
		 else raingDay();
	}
	/*
	 * 当天气的天气为晴天时提供建议
	 */
	public void sunnyDay(){
		Tool("记得涂护肤霜  带墨镜哦  有女朋友的话可以带个太阳伞");
	}

	/*
	 * 当天气为下雨天时提供建议
	 */
	public void raingDay(){
		Tool("记得带雨伞  温度比较低的话 要多穿衣服啊 照顾好自己 ");
	}
}
