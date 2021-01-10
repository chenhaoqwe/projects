package 获取当前的系统时间;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Time {

	public static void main(String[] args) throws ParseException{
		Date time =new Date();
		//System.out.println(time.toString());
		/*
		 * yyyy年
		 * mm月
		 * dd日
		 * HH时
		 * mm分
		 * ss秒
		 * SSS毫秒
		 */
		//date转化为中国式
		//日期格式化
		SimpleDateFormat sd=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss  SSS");
		String s=sd.format(time);
		System.out.println(s);
		
		String time1="2008-08-08 08:08:08 888";
		SimpleDateFormat sd1=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
	    Date dae =sd1.parse(time1);
	    System.out.println(dae);
	}
}
