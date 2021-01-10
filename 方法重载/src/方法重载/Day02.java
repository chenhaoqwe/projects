package 方法重载;
/*
 * 方法的重载就是  方法类名一样 形参列表的个数和类型不一样 
 */

public class Day02 {
	
	public static void main(String[] args) {
		
		System.out.println(sumInt("我","d"));
	}

	public static int sumInt(int a,int b){
		return 1;
		
	}
	public static int sumInt(String a,String b){
		return 2;
		
	}
}
