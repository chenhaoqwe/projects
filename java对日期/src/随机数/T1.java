package �����;

import java.util.Arrays;
import java.util.Random;

/*
 * ��д��������5�����ظ�����������ظ��Ļ���������
 * �������ɵ�5��������ŵ������У�Ҫ���������5����������ظ�
 */
public class T1 {

	public static void main(String[] args){
		//��������
		Random r=new Random();
		 //׼��һ��һά����
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
