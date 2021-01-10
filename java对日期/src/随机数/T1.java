package 随机数;

import java.util.Arrays;
import java.util.Random;

/*
 * 编写程序，生成5个不重复的随机数，重复的话重新生成
 * 最终生成的5个随机数放到数组中，要求数组的这5个随机数不重复
 */
public class T1 {

	public static void main(String[] args){
		//创建对象
		Random r=new Random();
		 //准备一个一维数组
		int[] aee=new int[5];
		for(int i=0;i<aee.length;i++){
			aee[i]=1;
		}
		int index=0;
		while(index<aee.length){
			int num=r.nextInt(101);
			if(contains(aee,num)){  
				aee[index++]=num;
			}
		}
		for(int i=0;i<aee.length;i++){
			System.out.println(aee[i]);
		}
	}
	public static boolean contains(int[] aee,int key){
		Arrays.sort(aee);
		return Arrays.binarySearch(aee, key)>=0;
	}
}
