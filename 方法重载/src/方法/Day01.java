package 方法;
/*
 * [访问修饰符] 返回值 方法名 （）{方法体}
 * 要显而易见     望文生义   
 * 怎么去调用方法   如果在一个类中 并且有static修饰的时候  直接调用
 * 方法  就是能够完成某个功能的方法块  
 */
public class Day01 {

	/*
	 * 程序入口
	 */
	public static void main(String[] args) {
		int result=sumInt(2,4);
		System.out.println(result);
	}
	public static int sumInt(int a,int b){
		int sum=a+b;
	    return sum;
		
		
	}
}

