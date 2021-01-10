package oo;

public class O {
	@SuppressWarnings("unused")
	public static void main(String[] args){
		int[] nums;//声明一个数组
		nums=new int[10];
		nums[0]=1;
		nums[1]=2;
		nums[2]=3;
		nums[3]=4;
		nums[4]=5;
		nums[5]=6;
		nums[6]=7;
		nums[7]=8;
		nums[8]=9;
		nums[9]=10;
		int sum=0;
		for(int i=0;i<=9;i++){
			sum=sum+nums[i];
			
		}
		System.err.println(sum);
	}

}
