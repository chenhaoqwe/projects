package ��ȡ��ǰ��ϵͳʱ��;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Time {

	public static void main(String[] args) throws ParseException{
		Date time =new Date();
		//System.out.println(time.toString());
		/*
		 * yyyy��
		 * mm��
		 * dd��
		 * HHʱ
		 * mm��
		 * ss��
		 * SSS����
		 */
		//dateת��Ϊ�й�ʽ
		//���ڸ�ʽ��
		SimpleDateFormat sd=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss  SSS");
		String s=sd.format(time);
		System.out.println(s);
		
		String time1="2008-08-08 08:08:08 888";
		SimpleDateFormat sd1=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
	    Date dae =sd1.parse(time1);
	    System.out.println(dae);
	}
}
